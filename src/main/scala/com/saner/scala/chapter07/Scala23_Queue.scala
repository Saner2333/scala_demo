package com.saner.scala.chapter07

import scala.collection.mutable

object Scala23_Queue {

    def main(args: Array[String]): Unit = {

        val queue = new mutable.Queue[String]()
        queue.enqueue("a", "b", "c")
        println(queue.dequeue())
        println(queue.dequeue())
        println(queue.dequeue())

    }
}
