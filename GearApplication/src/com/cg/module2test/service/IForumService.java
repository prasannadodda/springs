package com.cg.module2test.service;

import com.cg.module2test.dto.ForumBean;

public interface IForumService {

	public ForumBean searchQuery(int id);

	public boolean updateEmployee(ForumBean forumbean);

}
