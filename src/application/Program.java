package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		
		SellerDao sellerDao = DaoFactory.ceateSellerDao();
		System.out.println("---Test n.1 Seller findByID---");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("---Test n.2 Seller findByDepartment---");
		Department department = new Department(2,null);
		List<Seller>list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
	}

}
