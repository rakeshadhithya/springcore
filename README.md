# springcore

Console Spring Core Project: A simple project that helps to understand how dependency injection, types of injection is implemented by spring.

# Learnings

- instead of we creating objects, we just ask someone to give, that someone is spring. This is IOC(Inversion of control)
- spring achieves that using a container called IOC container, which means container will give us the objects we need.
- we can give configuration to container to say which beans to manage/store
- while giving configuration, if any bean has dependency on other object. To inject the object is called dependency injection. we can inject in two ways: constructor injection, setter injection
- using java configuration i.e. annotations spring does everything implicitly just add annotaion.

# Skills

- spring core xml configuration

# Installation Guide

- make sure you jave jdk installed, mine is JDK 17
- download the project, open in vscode(preferred)
- open terminal in vscode and run 'mvc clean install' to build from scratch
- make sure the dependecies listed in pom.xml are downloaded

# Usage

- run the main function in App.java
- you should see 'Samsung s23' and 'Iphone 16' in output
- understand the flow how it came
