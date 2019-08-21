package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object CircularStatement {
  def main(args: Array[String]): Unit = {
    //定义一个数组
    val arr = Array(1, 2, 3, 4, 5)
    //遍历数组的中的所有元素
    for (item <- arr) {
      print(item + " ")
    }
    println("\n=======我是分割线==========")
    //定义一个数组，用面的每一个元素代表arr数组中的角标，从而达到访问arr每一个元素的目的
    val index = Array[Int](0, 1, 2, 3, 4)
    for (item <- index) {
      print(arr(item) + "|")
    }
    println("\n=======我是分割线==========")
    //以角标的方式会访问，注意“0 to 4”,会生成一个“(0,1,2,3,4)”的数组
    for (item <- 0 to 4) {
      print(arr(item) + " ")
    }
    println("\n=======我是分割线==========")
    //以角标的方式会访问，注意“0 until arr.length”,也会生成一个“(0,1,2,3,4)”的数组,因为arr.length的值为5
    for (item <- 0 until arr.length) {
      print(arr(item) + "|")
    }
    println("\n=======我是分割线==========")
    //取出数组中的偶数元素
    for (item <- arr) {
      if (item % 2 == 0) {
        print(item + " ")
      }
    }
    println("\n=======我是分割线==========")
    //当然，上面的循环表达式也可以简写，如下：
    for (item <- arr if item % 2 == 0) {
      print(item + " ")
    }

    println("\n=======我是分割线11==========")
    // yield 关键字
    //yield关键字和Python很类似，它可以多次返回值，比如我们判断arr数组中存在的偶数值
    var res = for (item <- arr if item % 2 == 0) yield item
    //遍历我们得到的数组
    for (item <- 0 until res.length) {
      print(res(item) + " ")
    }

  }
}


/*
以上代码执行结果如下 :
1 2 3 4 5
=======我是分割线==========
1|2|3|4|5|
=======我是分割线==========
1 2 3 4 5
=======我是分割线==========
1|2|3|4|5|
=======我是分割线==========
2 4
=======我是分割线==========
2 4
 */