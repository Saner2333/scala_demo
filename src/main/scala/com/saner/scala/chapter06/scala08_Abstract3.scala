package com.saner.scala.chapter06

object scala08_Abstract3 {

    def main(args: Array[String]): Unit = {
        val user1 : User8 = new User8
        println(user1.age)
        user1.say()
        val user2 : Parent8 = new User8
        println(user2.age)
        user2.say()

        //匿名子类
        val user3:Parent8 = new Parent8 {
            override val age: Int = 20

            override def say(): Unit = super.say()
        }



    }

}

abstract class Parent8{

    val age : Int = 18
    def  say (): Unit ={
        println("person say")
    }


}
class User8 extends Parent8{

    override val age: Int = 19

    override def say(): Unit = {
        println("user say")
    }

}
