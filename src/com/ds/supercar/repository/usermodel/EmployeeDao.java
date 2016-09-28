package com.ds.supercar.repository.usermodel;

import java.util.List;

import com.ds.supercar.model.usermodel.Employee;
import com.ds.supercar.model.usermodel.User;

public interface EmployeeDao {

	public int save(Employee employee);
	public boolean update(Employee employee);
	public boolean delete(Employee employee);
	public User find(int id);
	public List<Employee> findAll();
}
