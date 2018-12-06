package com.cg.module2test.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.module2test.dto.ForumBean;
@Repository("forumdao")
public class ForumDaoImpl implements IForumDao {
	
	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public ForumBean searchQuery(int id) {
		ForumBean forumBean = entitymanager.find(ForumBean.class, id);
		return forumBean ;
	}

	@Override
	public boolean updateQuery(ForumBean forumbean) {
		try {
            entitymanager.merge(forumbean);
           
            return true;
     } catch (Exception e) {
            return false;
     }
	}

}
