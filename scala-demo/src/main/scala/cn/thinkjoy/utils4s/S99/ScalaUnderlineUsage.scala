package cn.thinkjoy.utils4s.S99

import scala.math._

/**
  * Scala下划线“_”用法
  */
object ScalaUnderlineUsage {
  def main(args: Array[String]): Unit = {
    // 1. 集合：这里的下划线代表了集合中的“某（this）”一个元素。这个用法很常见，在foreach等语句中也可以使用。
    val newArry = (1 to 10).map(_ * 2)
    println(newArry)

    // 2. 函数：这是Scala特有的“偏函数”用法。
    def setFunction(p1: Double, p2: Double): Double = p1 + p2

    val set = setFunction(3.0, _: Double)
    println(set(5.1))

    // 3. import语句： import math._  这里的math._就相当于Java中的math.*; 即“引用包中的所有内容”。
    println(abs(-10))

    // 4. case语句: 这里的下划线相当于“others”的意思，就像Java  switch语句中的“default”。
    var v = "x"
    var result = v match {
      case "a" => 1
      case "b" => 2
      case _ => "result"
    }
    println(result)

    // 5. 元组（tuple）: 可以通过模式匹配获取元组的元素，当不需要某个值的时候可以使用_替代
    val value = (1,2)
    println(value._1+value._2)

    val t = (1, 3.14, "David")
    val (first, second, _) = t
    println(second)

    // 6. 下划线与星号“_*”
    // 变长参数
    def sum(args: Int*) = {
      var result = 0
      for(arg <- args) result += arg
      result
    }

    val s = sum(1, 2, 3, 4, 5)
    println(s)

    // 使用下面这种方式报错
    //val s1 = sum(1 to 5)
    // 这种情况必须在后面写上: _*将1 to 5转化为参数序列
    val s1 = sum(1 to 5: _*)
    println(s1)

    // 7. 下划线与等号“_=”

    // 8. 方法转化为函数: 在Scala中方法不是值，而函数是。所以一个方法不能赋值给一个val变量，而函数可以。
    def increment(n: Int) = n + 1
    //val fun = increment  //这会报错：error: missing argument list for method increment
    //在这个例子中定义了一个方法increment，然后将这个方法赋值给变量fun失败。根据提示，可以通过将方法转化为函数的方式实现。
    val fun = increment _
    println(fun(1))
  }
}
