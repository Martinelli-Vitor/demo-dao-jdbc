package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---Test n.1 department findByID---");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("---Test n.2 department findAll---");
		List<Department> list = departmentDao.findAll();
		for(Department depto : list) {
			System.out.println(depto);
		}
		
		System.out.println("---Test n.3 department insert---");
		Department newDept = new Department(null,"Music");
		departmentDao.insert(newDept);
		System.out.println("Department insert: "+newDept);
		
		System.out.println("---Test n.4 department update---");
		Department dep2 = departmentDao.findById(3);
		dep2.setName("Tools");
		departmentDao.update(dep2);
		System.out.println("Update department: "+dep2);
		
		System.out.println("---Test n.5 department delete---");
		departmentDao.deleteById(8);
		System.out.println("Department deleted!");
		
		
		
		
		
		
	}

}
