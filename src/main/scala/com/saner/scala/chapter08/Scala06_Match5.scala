package com.saner.scala.chapter08

object Scala06_Match5 {
    def main(args: Array[String]): Unit = {
        // TODO - 模式匹配 - 匹配对象

        // 匹配对象时，会首先将对象传递到类的伴生对象的unapply方法
        // unapply方法会返回Option类型的数据，然后进行数据比对，如果全部比对成功，那么执行对应的逻辑
        // 如果比对不成功，那么继续执行下一个case
        // 这种方式非常的繁琐，所以scala不会这么做，采用样例类实现同样的功能
        val user = User("zhangsan", 11)
        val result = user match {
            case User("zhangsan", 11) => "yes"
            case _ => "no"
        }
        println(result)


    }
}

class User(val name: String, val age: Int)

object User {
    def apply(name: String, age: Int): User = new User(name, age)

    def unapply(user: User): Option[(String, Int)] = if (user == null) None else Some(user.name, user.age)
}
