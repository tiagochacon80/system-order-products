package application;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product p1 = new Product("TV", 1000.0);
		
		OrderItem oi = new OrderItem(1, 1000.0, p1);
		
		System.out.println(oi.getProduct().getName());
	}

}
