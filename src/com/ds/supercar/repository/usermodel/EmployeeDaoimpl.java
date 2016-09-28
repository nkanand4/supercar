package com.ds.supercar.repository.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ds.supercar.model.usermodel.Employee;
import com.ds.supercar.model.usermodel.User;

public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(employee);
	}

	@Override
	public boolean update(Employee employee) {
		// TODO Auto-generated method stub
		ht.update(employee);
		return true;
	}

	@Override
	public boolean delete(Employee employee) {
		// TODO Auto-generated method stub
		ht.delete(employee);
		return true;
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return (Employee)ht.get(Employee.class, id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return ht.find("from Employee");
	}

}
