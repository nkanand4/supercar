package com.ds.supercar.repository.usermodel;

import java.util.List;

import com.ds.supercar.model.usermodel.Address;


public interface AddressDao {

	public int save(Address address);
	public boolean update(Address address);
	public boolean delete(Address address);
	public Address find(final String email);
	public List<Address> findAll();
 	
}
