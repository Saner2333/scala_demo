package com.saner.scala.exc

object excercise {

  def main(args: Array[String]): Unit = {
    val s = "zhangsan"
//    def f1(s: String): String ={
//      if ("".equals(s) || s == null){
//        return ""
//      }else{
//        return s.substring(0,1).toUpperCase()
//      }
//    }
//    println(f1(s))

    //简化版
    def f2(s: String) =
      if ( "".equals(s) || s == null) "" else s.substring(0,1).toUpperCase()
    println(f2(s))

  }
}
