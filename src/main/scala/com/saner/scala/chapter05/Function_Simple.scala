package com.saner.scala.chapter05

object Function_Simple {

  /* 至简原则细节
（1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
（2）如果函数体只有一行代码，可以省略花括号
（3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
（4）如果有return，则不能省略返回值类型，必须指定
（5）如果函数明确声明Unit，那么即使函数体中使用return关键字也不起作用
（6）Scala如果期望是无返回值类型，可以省略等号
（7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
（8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
（9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
*/
  def main(args: Array[String]): Unit = {
    // （0）函数标准写法
//    def f(s : String) : String = {
//      return  s + "hhh"
//    }
//    print(f("hello"))
    //（1） return可以省略,Scala会使用函数体的最后一行代码作为返回值
//    def f1 (s : String) : String = {
//      s + "hhh"
//    }
//    print(f1("hello"))
    //（2）如果函数体只有一行代码，可以省略花括号
//    def f2 (s : String) : String = s + "hhh"
//    println(f2("hello"))
    //（3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
//    def f3( s : String) = s + "hhh"
//    println(f3("hello"))
    //（4）如果有return，则不能省略返回值类型，必须指定。
//    def  f4 ( s : String) : String = {
//      return s + "hhh"
//    }
//    println(f4("hello"))
    //（5）如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
//    def  f5 (s : String) : Unit = {
//      return 234
//    }
//    println( f5 ("hhh"))
    //（6）Scala如果期望是无返回值类型,可以省略等号
//    def f6(s : String) {
//        s + "hhh"
//      }
//    println(f6("hhh"))

    //（7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
//    def f7() = "hhh"
//    println(f7)
//    println(f7())
    //（8）如果函数没有参数列表，那么小括号可以省略,调用时小括号必须省略
//    def  f8 = "hhh"
//    println(f8)
//  println(f8())
    //（9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略,使用匿名函数
//    val f9 = () => println("hhh")
//    f9()

  }

}
