package com.ds.supercar.repository.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ds.supercar.model.usermodel.Address;
import com.ds.supercar.model.usermodel.Employee;

public class AddressDaoimpl implements AddressDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int save(Address address) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(address);
	}

	@Override
	public boolean update(Address address) {
		// TODO Auto-generated method stub
		ht.update(address);
		return true;
	}

	@Override
	public boolean delete(Address address) {
		// TODO Auto-generated method stub
		ht.delete(address);
		return true;
	}

	@Override
	public Address find(String email) {
		// TODO Auto-generated method stub
		return (Address)ht.get(Address.class, email);
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return ht.find("from Address");
	}

}
