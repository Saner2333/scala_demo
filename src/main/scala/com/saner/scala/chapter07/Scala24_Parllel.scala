package com.saner.scala.chapter07

object Scala24_Parllel {
    def main(args: Array[String]): Unit = {
        println((0 to 100).map(case_ => Thread.currentThread().getName))
        println((0 to 100).par.map(case_ => Thread.currentThread().getName))
    }
}
