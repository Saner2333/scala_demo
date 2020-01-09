package com.saner.scala.chapter02

object Scala04_Name {
    def main(args: Array[String]): Unit = {

        // TODO 标识符
        // Java
        val name: String = "zhangsan"

        val name$test: String = "lisi"

        val name123: String = "wangwu"

        val name_test: String = "zhaoliu"

        val _name: String = "tianqi"

        val $name: String = "xxxx"

        //val 123name : String = "tianqi" (error)
        //val private :String = ""(error)

        // Scala
        // Scala可以采用特殊符号和运算符作为标识符
        //val ++ : String = "zhangsan"
        val -- : String = "xxx"
        val @#% : String = "yyyyy"

        // Scala不允许特殊符号和正常的标识符混合使用
        //val ++i : Int = 10
        //        Scala04_Name.+("abc")
        //
        //        Scala04_Name + "abc"
        //
        //         //1 + 1
        //         1.+(1)

        val `private`: String = "private"

    }

    def +(s: String): Unit = {

    }
}
