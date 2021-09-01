package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department ob = new Department (1, "books");
		System.out.println(ob);
		
		Seller sel = new Seller(1,"Bob","bob@gmail.com",new Date(),4000.0,ob);
		System.out.println(sel);
		
		SellerDao sellerDao = DaoFactory.ceateSellerDao();

	}

}
