package com.saner.scala.chapter07

object Scala14_Method2 {

    def main(args: Array[String]): Unit = {

        val list1 = List(1, 4, 2, 3)
        val list2 = List(5, 6, 7, 8)
        val list3 = List(list1, list2)


        // TODO 映射 / 转换, 将指定的数据转换为其他的数据
        // 集合的map方法会将集合的每一个元素都执行map方法中传递的逻辑
        // map方法会将每一个数据转换后的结果放置在新的集合中返回
        //        println(list1.map(i => i * 2))
        //        println(list1.map(_ * 2))

        // TODO 扁平化 : 将一个整体数据拆分成一个一个的个体来使用,称之为扁平化
        //        println(list3.flatten.map(_*2))

        // TODO 扁平映射
        // flatMap等同于将map和flatten融合在一起实现功能
        // 输入参数为集合中的每一个数据
        // 输出的结果为扁平化后的数据集合
        //        println(list3.flatMap(_.map(_ * 2)))

        // TODO 过滤
        // 将集合中所有的数据进行逻辑判断,返回结果为true保留,如果为false就舍弃
        //        println(list1.filter(i => i % 2 == 0))
        val list4 = List("Spark", "Scala", "Hadoop")
        //        println(list4.filter(i => i.substring(0,1).equals("S")))
        // TODO 分组
        // 通过指定的规则进行分组
        // 指定的规则的返回值作为分组的key, 数据就是分组后的Value

        //        println(list4.groupBy(i => i.startsWith("S")))

        // TODO 排序
        // 通过指定的规则进行排序, 默认为升序
        //        println(list1.sortBy(i => i))
        //        println(list1.sortBy(i => i)(Ordering.Int.reverse))

        val stu1 = new Student()
        stu1.id = 1
        stu1.name = "zhangsan"
        val stu2 = new Student()
        stu2.id = 1
        stu2.name = "lisi"

        val list6 = List(stu2, stu1)
        //        println( list6.sortBy(stu=>stu.id + stu.name) )
        //        println(list6.sortBy(stu => (stu.id,stu.name)))

        val students = list6.sortWith(
            (left, right) => {

                if (left.id > right.id) {
                    true
                } else if (left.id == right.id) {
                    left.name > right.name
                } else {
                    false
                }
            }
        )
        println(students)


    }
}

class Student {
    var id: Int = _
    var name: String = _

    override def toString: String = {
        "user(" + id + ", " + name + ")"
    }
}