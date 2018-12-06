package com.cg.module2test.dao;

import com.cg.module2test.dto.ForumBean;

public interface IForumDao {
	public ForumBean searchQuery(int id);

	public boolean updateQuery(ForumBean forumbean);
}
