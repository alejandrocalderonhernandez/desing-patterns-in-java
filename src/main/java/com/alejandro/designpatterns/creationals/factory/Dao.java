package com.alejandro.designpatterns.creationals.factory;

import java.util.Set;

public interface Dao<T> {
	
	public void save(T item);
	public Set<T> get();

}
