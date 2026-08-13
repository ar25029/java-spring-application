package com.beanScope.simplePost;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimplePostApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplePostApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Social Media Blog!");
		Scanner sc = new Scanner(System.in);

		User user = (User) context.getBean("simpleUser");
		System.out.println("Enter username: ");
		String userName = sc.nextLine();
		user.setUserName(userName);
		while (true) {
			PostsList postsLists = user.getPostsList();

			System.out.println("1. Add Post\n2. Show all posts\n3. exit");
			int menuItem = sc.nextInt();

			switch (menuItem) {
			case 1 -> {
				Post post = (Post) context.getBean("simplePost");
				System.out.println("Enter the post");
				sc.nextLine();
				String message = sc.nextLine();
				post.setMessage(message);
				postsLists.setPost(post);
				break;
			}
			case 2 -> {
				System.out.println("All Posts: ");
				for (int i = 0; i < postsLists.size(); i++) {
					System.out.println(i + 1 + " " + user.getUsername() + ". " + postsLists.getPost(i).getMessage());
				}
				System.out.println("=====================================");
				break;
			}
			case 3 -> {
				System.out.println("Exiting...");
				return;
			}
			default -> System.err.println("Wrong Choice!");
			}
		}
	}

}
