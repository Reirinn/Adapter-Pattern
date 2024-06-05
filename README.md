# What is Adapter Design Pattern

The Adapter design pattern is a structural pattern that allows the interface of an existing class to be used as another interface. It acts as a bridge between two incompatible interfaces, making them work together. This pattern involves a single class, known as the adapter, which is responsible for joining functionalities of independent or incompatible interfaces.

Read more at : https://www.geeksforgeeks.org/adapter-pattern/ 

# What are the advantages of Adapter Design Pattern

1. Single Responsibility Principle (SRP): The interface or data conversion code can be separated from the application’s primary business logic.
2. Open/Closed Principle (OCP): New types of adapters can be introduced into the program without breaking the existing client code, as long as they work with the adapters through the Target interface.
3. Compatibility and Integration: One of the main advantages of the Adapter pattern is that it enables the integration of existing classes or legacy systems with incompatible interfaces with the rest of the codebase. It allows these classes to interact with other components without requiring significant changes to their implementation.
4. Code Reuse: Existing classes that have valuable functionality but are not directly compatible with the system’s desired interfaces can be reused by using adapters. This promotes code reuse and avoids duplication of code or functionalities.
5. Flexibility and Maintainability: The Adapter pattern enhances the flexibility and maintainability of the code by decoupling the client code from the specific implementations of the Adaptees. New adapters can be introduced or existing ones modified without affecting the client code or Adaptee implementation.
6. Unit Testing and Mocking: Adapters can be beneficial for unit testing and mocking. Mock implementations of interfaces that allow client code testing independent of the actual Adaptee‘s implementation can be created by introducing adapters.

Read more at : https://www.pentalog.com/blog/design-patterns/adapter-design-pattern/#:~:text=Advantages%20of%20the%20Adapter%20Design%20Pattern&text=Compatibility%20and%20Integration%3A%20One%20of,the%20rest%20of%20the%20codebase. 

# Sample Problem 

Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

Adaptee Objects:
1. Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.
2. Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.
3. SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

Target Object:
1. PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

Adapter Objects:
1. LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().
2. RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().
3. SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

# Class Diagram

![image](https://github.com/Reirinn/Adapter-Pattern/assets/142465054/d1638111-28cc-43a1-8f18-3257ca204c6a)

# Output

![image](https://github.com/Reirinn/Adapter-Pattern/assets/142465054/8517a7b1-a892-4d90-ac16-9f769df186d1)

