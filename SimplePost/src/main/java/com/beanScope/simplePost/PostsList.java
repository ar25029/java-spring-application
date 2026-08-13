package com.beanScope.simplePost;

import java.util.ArrayList;

public interface PostsList {

	public ArrayList<Post> getAllPosts();

	public void setPost(Post post);

	public Post getPost(int i);

	public int size();
}
