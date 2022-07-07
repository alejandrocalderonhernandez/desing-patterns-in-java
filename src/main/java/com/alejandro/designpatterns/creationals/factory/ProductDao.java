package com.alejandro.designpatterns.creationals.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProductDao implements Dao<Product> {
	
	private DBConnection dbConnection = null;
	
	public ProductDao(DBType dvDbType) {
		this.dbConnection = ConnectionFactory.getConnection(dvDbType);
	}
	
	public ProductDao() {
		this.dbConnection = ConnectionFactory.getConnection();
	}

	@Override
	public void save(Product p) {
		Connection conn = dbConnection.getConnection();
		try {
			var ps = conn.prepareStatement(INSERT);
			ps.setString(1, p.getId());
			ps.setString(2, p.getName());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Set<Product> get() {
		Connection conn = dbConnection.getConnection();
		var response = new HashSet<Product>();
		try {
			var ps = conn.prepareStatement(SELECT);
			var rs = ps.executeQuery();
			
			while (rs.next()) {
				response.add(new Product(rs.getString(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return response;
	}

	
	private static final String INSERT = "insert into product (id, name) values (?, ?)";
	private static final String SELECT = "select * from product";



}
