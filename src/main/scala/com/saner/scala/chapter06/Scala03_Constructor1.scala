package com.saner.scala.chapter06

object Scala03_Constructor1 {

    def main(args: Array[String]): Unit = {
        val user3 = new User3("zhangsan", 19)
        println(user3.name)
    }

}

//主构造器和辅助构造器
class User3(var name: String, age: Int) {

    println("类主体")

    //辅助构造器
    def this() {
        this("hhh", 19)
    }

    def this(age: Int) {
        this()
    }

}
