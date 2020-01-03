package com.saner.scala.chapter06

object scala11_Trait1 {

    def main(args: Array[String]): Unit = {

    }

}

trait Person11 {
    def run(): Unit

    def test(): Unit = {
    }
}

class User11 extends Person11 {
    override def run(): Unit = {
        println("hhh")
    }
}
