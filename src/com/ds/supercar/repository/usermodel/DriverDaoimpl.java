package com.ds.supercar.repository.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ds.supercar.model.usermodel.Driver;

public class DriverDaoimpl implements DriverDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int save(Driver driver) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(driver);
	}

	@Override
	public boolean update(Driver driver) {
		// TODO Auto-generated method stub
		ht.update(driver);
		return true;
	}

	@Override
	public boolean delete(Driver driver) {
		// TODO Auto-generated method stub
        ht.delete(driver);
		return true;
	}

	@Override
	public Driver find(int id) {
		// TODO Auto-generated method stub
		return (Driver)ht.get(Driver.class, id);
	}

	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		
		return ht.find("from Driver");
	}

}
