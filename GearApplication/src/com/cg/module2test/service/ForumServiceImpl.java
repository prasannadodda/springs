package com.cg.module2test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.module2test.dao.IForumDao;
import com.cg.module2test.dto.ForumBean;
@Service("forumservice")
@Transactional
public class ForumServiceImpl implements IForumService {
	
	@Autowired
	IForumDao forumdao;
	
	@Override
	public ForumBean searchQuery(int id) {
		
		return forumdao.searchQuery(id);
	}

	@Override
	public boolean updateEmployee(ForumBean forumbean) {
		
		return forumdao.updateQuery(forumbean);
	}

}
