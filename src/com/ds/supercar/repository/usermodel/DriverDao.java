package com.ds.supercar.repository.usermodel;

import java.util.List;

import com.ds.supercar.model.usermodel.Driver;

public interface DriverDao {
	
	public int save(final Driver driver);
	public boolean update(final Driver driver);
	public boolean delete(final Driver driver);
	public Driver find(final int id);
	public List<Driver> findAll();
	
}
