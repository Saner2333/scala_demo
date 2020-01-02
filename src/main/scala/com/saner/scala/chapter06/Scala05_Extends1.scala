package com.saner.scala.chapter06

object Scala05_Extends1 {

    def main(args: Array[String]): Unit = {
        val user = new User5()
        println(user.name)

    }

}

class User5(override val name : String) extends  Parent5{
    println("3333")
    def  this(){
        this("user")
        println("4444")
    }
}
class Parent5(val name : String){
    println("1111")
    def this(){
        this("parent")
        println("2222")
    }
}
