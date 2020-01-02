package com.saner.scala.chapter06

import _root_.java.lang._
import _root_.java.util.{ArrayList,Date =>_,_}

package object test {

    def shareMethod() {
        println("test ---> 共享方法")
    }

}

class User1 {

        var name: String = "hhh"

        def login() = true

    }

    object Scala01_Object {

            def main(args: Array[String]): Unit = {

//                shareMethod()

                val user = new User1()
                println(user.name)
                println(user.login())
            }

        }
