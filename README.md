# Problem Statement: Government Tax Collection System using Spring XML Configuration and Inversion of Control (IoC)

## Objective

Develop a **Government Tax Collection System** using the **Spring Framework (XML-based configuration)** by implementing the concept of **Inversion of Control (IoC)** and **Dependency Injection (DI)**. The application should allow citizens to pay either **Income Tax** or **Property Tax**, calculate the applicable tax based on the taxable amount, and ensure that a tax can only be paid once.

---

## Requirements

### 1. Tax Interface

Create a common `Tax` interface containing the following methods:

- `void setTaxableAmount(double amount)` – Sets the taxable amount.
- `void calculateTaxAmount()` – Calculates the tax amount based on predefined tax rules.
- `double getTaxAmount()` – Returns the calculated tax amount.
- `String getTaxType()` – Returns the type of tax (`Income` or `Property`).
- `boolean isTaxPayed()` – Returns whether the tax has already been paid.
- `void payTax()` – Marks the tax as paid and displays a confirmation message.

---

### 2. Tax Implementations

Create two classes implementing the `Tax` interface:

- `IncomeTax`
- `PropertyTax`

Each class should contain the following attributes:

- `taxableAmount` (`double`) – Amount on which tax is calculated.
- `taxAmount` (`double`) – Final tax payable.
- `isTaxPayed` (`boolean`) – Indicates whether the tax has been paid. Default value should be `false`.

Each implementation should provide its own tax calculation logic and return the appropriate tax type.

---

### 3. Spring XML Configuration

Configure the application using **Spring XML**.

- Create an `applicationContext.xml` file inside `src/main/resources`.
- Define beans for:
  - `IncomeTax`
  - `PropertyTax`
- Follow **camelCase** naming convention for bean IDs.

Example:

- `incomeTax`
- `propertyTax`

---

### 4. Loading Spring Context

In the main application:

- Load the Spring container using `ClassPathXmlApplicationContext`.
- Retrieve beans dynamically based on the user's choice using `context.getBean()`.

---

### 5. User Interaction

When the application starts:

1. Display the available tax options:
   - Income Tax
   - Property Tax

2. Accept the user's choice.

3. Based on the selected option:
   - Map the selection to the corresponding Spring bean ID.
   - Retrieve the appropriate bean from the Spring Application Context.

---

### 6. Tax Payment Flow

After retrieving the selected tax bean:

#### If Tax is Already Paid

- Check the `isTaxPayed()` status.
- If the tax has already been paid, display:

```
You have already paid <Income/Property> tax.
```

No further processing should occur.

---

#### If Tax is Not Yet Paid

1. Ask the user to enter the taxable amount.
2. Set the amount using `setTaxableAmount()`.
3. Calculate the tax using `calculateTaxAmount()`.
4. Display the calculated tax amount.
5. Ask the user whether they want to pay the tax.
6. If the user confirms:
   - Invoke `payTax()`.
   - Display a confirmation message such as:

```
Hi, your Income tax is paid.
```

or

```
Hi, your Property tax is paid.
```

7. Update the payment status so that the same tax cannot be paid again.

---

## Functional Requirements

- Implement **Inversion of Control (IoC)** using Spring.
- Configure all beans using **XML configuration**.
- Use interface-based programming.
- Retrieve beans dynamically from the Spring container.
- Allow users to choose between Income Tax and Property Tax.
- Calculate tax based on user-entered taxable amount.
- Prevent duplicate tax payments.
- Display appropriate success and validation messages.

---

## Concepts Covered

- Spring Framework
- Inversion of Control (IoC)
- Dependency Injection (DI)
- XML Bean Configuration
- Spring Bean Lifecycle
- Interfaces and Implementations
- Object-Oriented Programming
- Dynamic Bean Retrieval
- User Input Handling
- Conditional Logic
