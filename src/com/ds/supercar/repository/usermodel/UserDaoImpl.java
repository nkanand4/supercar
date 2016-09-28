package com.ds.supercar.repository.usermodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ds.supercar.model.usermodel.User;

public class UserDaoImpl implements UsersDao {

	@Autowired
	private HibernateTemplate ht; 
	@Override
	public int save(User user) throws Exception{
		// TODO Auto-generated method stub
		return (Integer)ht.save(user);
	}

	@Override
	public boolean update(User user) throws Exception{
		// TODO Auto-generated method stub
		ht.update(user);
		return true;
	}

	@Override
	public boolean delete(User user)throws Exception {
		// TODO Auto-generated method stub
		ht.delete(user);
		return true;
	}

	@Override
	public User find(int id) throws Exception{
		// TODO Auto-generated method stub
		ht.get(User.class, id);
		return (User)ht.get(User.class, id);
	}

	@Override
	public List<User> findAll() throws Exception{
		// TODO Auto-generated method stub
		List<User> list=ht.find("from User");
		return list;
	}

}
