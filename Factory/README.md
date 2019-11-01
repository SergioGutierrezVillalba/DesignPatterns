# Factory Method Pattern

This folder contains a very clear and short example of a Factory Method Pattern written in Java.

## What is a Factory Method?

In software engineering, the Factory pattern is a software design pattern that allows an application to create interfaces to define objects but let subclasses decide which class instantiate.

The factory method design pattern solves problems like:

* How can a class anticipate the class of objects it must create?
* How can let subclasses to specify the object that it creates?
* How can the responsability and the logic being delegate to helper subclasses?

In this repo you have a typical usecase of the Factory Method Pattern, where you want to create an Editor to open, edit and write any type of File. For this purpose, and in the concrete implementation, there is a text editor created for dealing with Files like Excels and PDFs and an interface giving the necessary methods to do the tasks. 

## Inspired in

- [Design Patterns](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/) - Erich Gamma, Richard Helm, Ralph Johnson & John Vlissides


## Authors

* **Sergio Gutiérrez** - [LinkedIn Profile](https://www.linkedin.com/in/sergiogutierrezvillalba/)

See also the list of [contributors](https://github.com/SergioGutierrezVillalba/DesignPatterns/graphs/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](./LICENSE.md) file for details