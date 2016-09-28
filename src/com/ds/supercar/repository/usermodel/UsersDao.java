package com.ds.supercar.repository.usermodel;

import java.util.List;

import com.ds.supercar.model.usermodel.User;

public interface UsersDao {
 
	public int save(final User user) throws Exception;
	public boolean update(final User user) throws Exception;
	public boolean delete(final User user)throws Exception;
	public User find(int id)throws Exception;
	public List<User> findAll()throws Exception;
}
