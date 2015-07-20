/*
 THis is an example to illustrate classes and duck typing
 And illustrating the use of classes
 
 Make 2 classes. One of Car one of Bike
 Each should have a method called "run"
 Each method will return "Vroom"
*/





[new Car(), new Bike()].each {
  assert it.run() == "Vroom"
}
