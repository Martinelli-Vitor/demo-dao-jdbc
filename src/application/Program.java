package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("---Test n.3 Seller findAll---");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("---Test n.4 Seller insert---");
		Seller newSeller = new Seller(null,"Greg","gerg@gmail.com",new Date(),4000.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());
		
		System.out.println("---Test n.5 Seller update---");
		seller = sellerDao.findById(1);//procurar vendedor
		seller.setName("Martha Wayne");
		seller.setEmail("wayne@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("---Test n.6 Seller delete---");
		System.out.println("Enter id for delete:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();

	}

}
