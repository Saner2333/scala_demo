package com.saner.scala.chapter01

object Scala03_Print {
    def main(args: Array[String]): Unit = {
        // Scala中可以完全执行java代码
        //System.out.println("Hello Scala Demo");

        // Scala可以采用面向对象的方式进行打印
        // Predef伴生对象在使用时不需要导入，可以直接使用,也可以省略
        Predef.println("Hello Scala")

        println("Hello Scala")
    }
}
