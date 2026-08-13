package com.beanScope.simplePost;

import java.util.ArrayList;

public class SimplePostList implements PostsList {

	ArrayList<Post> postLists;

	public SimplePostList() {
		this.postLists = new ArrayList<>();
	}

	@Override
	public ArrayList<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return this.postLists;
	}

	@Override
	public void setPost(Post post) {
		if (post != null) {
			this.postLists.add(post);
		}
	}

	@Override
	public Post getPost(int i) {
		return this.postLists.get(i);
	}

	@Override
	public int size() {
		return postLists.size();
	}

}
