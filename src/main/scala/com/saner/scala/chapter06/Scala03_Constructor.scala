package com.saner.scala.chapter06

object Scala_Constructor {

    val person = new Person("hhh")

}

//主构造方法
//scala中构造方法就是类的声明
class Person(name: String) {

    println("构造器主体")

    //方法名与类名一致，但是不是构造方法
    def Person(): Unit = {
        println("person")
    }

}
