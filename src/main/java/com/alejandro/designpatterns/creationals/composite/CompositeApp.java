package com.alejandro.designpatterns.creationals.composite;

public class CompositeApp {
	
	public static void main(String[] args) {
        SimpleProduct ram4gb = new SimpleProduct("Memoria RAM 4GB", 750.0, "KingStone");
        SimpleProduct ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000.0, "KingStone");
        SimpleProduct disk500gb = new SimpleProduct("Disco Duro 500GB", 1500.0, "ACME");
        SimpleProduct cpuAMD = new SimpleProduct("AMD phenon", 4000.0, "AMD");
        SimpleProduct cpuIntel = new SimpleProduct("Intel i7", 4500.0, "Intel");
        SimpleProduct monitor20inch = new SimpleProduct("Monitor 20'", 1500.0, "HP");
        SimpleProduct monitor30inch = new SimpleProduct("Monitor 30'", 2000.0, "HP");
        SimpleProduct simpleMouse = new SimpleProduct("Raton Simple", 150.0, "Genius");
        SimpleProduct gammerMouse = new SimpleProduct("Raton Gammer", 750.0, "Alien");
        SimpleProduct keyboard = new SimpleProduct("keyboard", 100.0, "ACME");
        
        CompositeProduct packageMyGamerPC = new CompositeProduct("GamerPC", 0.0);
        packageMyGamerPC.addProduct(ram8gb);
        packageMyGamerPC.addProduct(disk500gb);
        packageMyGamerPC.addProduct(cpuIntel);
        packageMyGamerPC.addProduct(monitor30inch);
        packageMyGamerPC.addProduct(gammerMouse);

        CompositeProduct packageMyStudentPC = new CompositeProduct("StudentPC", 0.0);
        packageMyStudentPC.addProduct(ram4gb);
        packageMyStudentPC.addProduct(monitor20inch);
        packageMyStudentPC.addProduct(simpleMouse);
        packageMyStudentPC.addProduct(keyboard);
        
        CompositeProduct packagePromotion2x1 = new CompositeProduct("Promotion2x1", 0.0);
        packagePromotion2x1.addProduct(packageMyStudentPC);
        packagePromotion2x1.addProduct(packageMyGamerPC);
        
        Order order = new Order(1l, "Alejandro Calderon");
        order.addProducts(packagePromotion2x1); 
        order.addProducts(cpuAMD); 
        
        order.printOrder();

	}

}
