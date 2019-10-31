# Singleton Pattern

This folder contains a very clear and short example of a Singleton Pattern written in Java.

## What is a Singleton?

In software engineering, the singleton pattern is a software design pattern that ensures that a class only
has one instance, and provide a global point of access to it.

The singleton design pattern solves problems like:

* How can it be ensured that a class has only one instance?
* How can the sole instance of a class be accessed easily?
* How can a class control its instantiation?
* How can the number of instances of a class be restricted?

The singleton design pattern describes how to solve such problems:

* Hide the constructor of the class.
* Define a public static operation (getInstance()) that returns the sole instance of the class.

In this repo you have a typical usecase of the Singleton Pattern, ensure that you only have a unique Database instance and you are not creating multiple Database object with their own connections that remain after your code finishes its tasks.

## Inspired in

- [Design Patterns](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/) - Erich Gamma, Richard Helm, Ralph Johnson & John Vlissides


## Authors

* **Sergio Gutiérrez** - [LinkedIn Profile](https://www.linkedin.com/in/sergiogutierrezvillalba/)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](./LICENSE.md) file for details
