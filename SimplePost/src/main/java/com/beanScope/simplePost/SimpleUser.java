package com.beanScope.simplePost;

public class SimpleUser implements User {
	
	PostsList postList;
	String userName;

	@Override
	public void setUserName(String name) {
		this.userName = name;
	}

	@Override
	public String getUsername() {
		return this.userName;
	}

	@Override
	public void setPostList(PostsList postsList) {
		this.postList = postsList;
	}

	@Override
	public PostsList getPostsList() {
		return this.postList;
	}

}
