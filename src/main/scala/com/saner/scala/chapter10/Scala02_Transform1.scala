package com.saner.scala.chapter10

object Scala02_Transform1 {
    def main(args: Array[String]): Unit = {
        implicit def transform(user: User): ExtUser = {
            new ExtUser
        }

        val user = new User
        user.insert()
        user.update()
    }
}

class User {
    def insert(): Unit = {
        println("insert ....")
    }
}

class ExtUser {
    def update(): Unit = {
        println("update ....")
    }
}