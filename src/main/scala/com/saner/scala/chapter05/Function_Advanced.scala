package com.saner.scala.chapter05

object Function_Advanced {

  def main(args: Array[String]): Unit = {
    //1）函数可以作为值进行传递
    //调用foo函数，把返回值给变量f（因为推断不出来是把函数整体赋值给f）
//      val f = foo()
//      println(f)
    //在被调用函数foo后面加上_，相当于把函数foo当成一个整体，传递给变量f1
//    val f1 = foo _
//    foo()
//    f1()

    //2)函数可以作为参数进行传递
    //定义一个函数，函数参数是一个函数签名；f表示输入函数名称;(Int,Int)表示输入两个Int参数；Int表示函数返回值
    def f2(f : (Int,Int) => Int) : Int = {
      f(2,4)
    }
    //定义一个函数，参数和返回值类型和f1的输入参数一致
//    def add(i : Int,j : Int) : Int =
//      i+j

    //调用函数
//    println(f2(add))
//    println(f2(add _))

    //使用匿名函数
//    println(f2((x:Int,y:Int)=>x+y))
//    f2((x:Int,y:Int)=>x+y)
    // 如果匿名函数中参数的类型可以推断，那么也可以省略
//    f2((x,y) => x+y)
    // 如果参数只使用了一次，而且有顺序，那么可以省略参数，使用下划线代替指定位置的参数
    println(f2(_+_))

  }
  def  foo() : Int = {
    println("foo...")
    1
  }

}
