# 📞 Customer Care Management System using Spring Framework (XML Configuration)

## 📌 Problem Statement

You are working as a Java Developer for a company that sells electronic gadgets. The company has a **Customer Care System** that allows customers to connect with different departments based on their requirements.

The customer can contact one of the following departments:

- 💳 Payment Department
- ❓ Query Department
- 🛒 Sales Department

The application is built using the **Spring Framework (XML-Based Configuration)**, where each department is implemented as a separate Spring Bean. The goal is to use **Spring IoC (Inversion of Control)** and **Dependency Injection** to manage the application's components through an XML configuration file.

---

## 🎯 Objective

Develop a console-based Customer Care application that:

- Accepts the customer's name.
- Allows the customer to select a department.
- Collects the customer's issue.
- Generates a customized response based on the selected department.
- Uses Spring's `ClassPathXmlApplicationContext` to load and manage beans from an XML configuration file.

---

## 🛠 Requirements

### 1. Implement the `CustomerCare` Interface

The interface contains the following methods which must be implemented in all department classes:

### `getDepartment()`

Returns the name of the selected department.

### `getService()`

Returns a welcome message for the customer along with the selected department.

**Example:**

```text
Welcome John, you have reached the Payment Department.
How may I assist you today?
```

---

### `setCustomerName(String name)`

Stores the customer's name.

---

### `setProblem(String problem)`

Stores the customer's issue entered from the console.

Example:

```text
I want a receipt for my payment.
```

---

### `getProblem()`

Returns a customized response confirming that the issue has been registered.

**Example:**

```text
Dear John, your issue regarding "I want a receipt for my payment" has been registered with the Payment Department.
```

---

## 🏗 Classes to Implement

Create three classes that implement the `CustomerCare` interface:

- `PaymentDepartment`
- `SalesDepartment`
- `QueryDepartment`

Each class should provide department-specific responses.

---

## 🌱 Spring Configuration

Create an XML configuration file inside:

```text
src/
 └── main/
      └── resources/
           └── applicationContext.xml
```

Configure the following Spring beans:

- PaymentDepartment
- SalesDepartment
- QueryDepartment

---

## ⚙ Spring IoC Container

Use:

```java
ClassPathXmlApplicationContext
```

to:

- Load the XML configuration.
- Create and manage beans.
- Retrieve the required department bean based on user input.

---

## 💻 Main Application

Create a `Main` class that:

1. Loads the Spring Application Context.
2. Accepts the customer's name.
3. Displays the available departments.
4. Reads the user's department selection.
5. Retrieves the corresponding Spring bean.
6. Accepts the customer's issue.
7. Displays a customized acknowledgement message.
8. Closes the Application Context.

---

## 📋 Functional Flow

```text
Start
   │
   ▼
Enter Customer Name
   │
   ▼
Display Departments
   │
   ▼
Select Department
   │
   ▼
Retrieve Bean from Spring Container
   │
   ▼
Enter Customer Issue
   │
   ▼
Generate Department-Specific Response
   │
   ▼
Display Acknowledgement
   │
   ▼
End
```

---

# ✅ Expected Output

```text
Welcome to our Customer Care Application

Please enter your name:
CodingNinjas

Thanks for reaching us, CodingNinjas.

Please select a department:

1. Payment Department
2. Query Department
3. Sales Department
0. Exit

Enter your choice:
1

Welcome CodingNinjas,
You have reached the Payment Department.

How may I assist you with your payment inquiry?

I want receipt for my payments.

Dear CodingNinjas,

Your issue:

"I want receipt for my payments."

has been successfully recorded by the Payment Department.

Reference ID: 751
```

---

## 📚 Concepts Covered

- Spring Framework
- Spring IoC Container
- Dependency Injection
- XML Bean Configuration
- Interfaces and Implementations
- Bean Management
- `ClassPathXmlApplicationContext`
- Object-Oriented Programming (OOP)
- Console-Based Java Application

---

## 🎯 Learning Outcome

After completing this project, you will be able to:

- Understand the working of Spring IoC.
- Configure Spring beans using XML.
- Manage objects through the Spring Container.
- Implement interfaces using multiple classes.
- Build a modular console-based Java application.
- Apply Dependency Injection in real-world scenarios.
- Retrieve and use Spring-managed beans dynamically based on user input.
