package com.saner.scala.chapter06

object scala10_Object2 {

    def main(args: Array[String]): Unit = {
        val p1 = Person10(19)
        val p2 = Person10()
        println(p1.age)
        println("p2.age = " + p2.age)

        //        val person1 = new Person10()
    }

}

class Person10 private(var age: Int) {

    //    def this(){
    //        this(18)
    //    }

   def fun(): Unit ={
       println("hhh")
   }

}

object Person10 {

    def apply(age: Int): Person10 = new Person10(age)

    def apply(): Person10 = new Person10(18)



}
