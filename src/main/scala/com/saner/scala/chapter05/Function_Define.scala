package com.saner.scala.chapter05

object Function_Define {

    def main(args: Array[String]): Unit = {

        //    def  f1(s : String): Unit ={
        //      println(s"s=$s")
        //    }
        //    f1("hhh")


        //    def f2(s: String): String = {
        //      return s;
        //    }
        //
        //    println(f2("hello"))

        //需求：定义一个函数，实现将传入的名称打印出来。
        //    def f3(str: String): Unit = {
        //      println(str)
        //    }
        //    f3("hello function")
        //    （1）函数1：无参，无返回值
        //    def f1(){
        //      println("无参，无返回值")
        //    }
        //    f1()

        //    （2）函数2：无参，有返回值
        //    def f2(): String ={
        //      return  "无参，有返回值"
        //    }
        //    println(f2())


        //    （3）函数3：有参，无返回值
        //def f3(s:String): Unit ={
        //  println(s)
        //}
        //    f3("hhh")

        //    （4）函数4：有参，有返回值
        def f4() = "hhh"

        println(f4)

        //    （5）函数5：多参，无返回值
        //    def f5(s: String,i:Int): Unit ={
        //      println(s + i)
        //    }
        //    f5("hello",100)

        //    （6）函数6：多参，有返回值
        //    def f6 (name : String, age : Int): String ={
        //      return "多参，有返回值"
        //    }
        //    println(f6("hhh" , 100))


    }
}