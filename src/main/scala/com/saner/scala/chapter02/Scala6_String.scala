package com.saner.scala.chapter02

object Scala6_String {
    def main(args: Array[String]): Unit = {

        // TODO String

        val name: String = "zhangsan"
        val age: Int = 20

        // JSON => JavaScript Object Notation
        // array = [{}, {}]
        // User => "{ \"username\":\"zhangsan\", \"age\":20 }" => IE

        // json字符串 => { "username":"zhangsan", "age":20 }
        // js => { 'username':'zhangsan', 'age':20 }

        //println("username = " + s + ", age = " + age)
        // java中双引号不能嵌套使用
        //println("{\"username\":\""+name+"\", \"age\":"+age+"}")

        // 插值字符串
        //println("username = " + name.toUpperCase())
        //println("username = $name")
        // EL表达式
        //println(s"username= ${name.toUpperCase()} \n" + s"age=$age")

        //println(s"username = $name")
        //println(s"age = $age")

        // 多行字符串 : SQL
        // jdbc
        // select * from user
        println(
            s"""
               | select
               |    *
               | from user
               | where id in (1,2,3,4)
            """.stripMargin)

        printf("name=%s age=%d\n", name, age)

    }
}
