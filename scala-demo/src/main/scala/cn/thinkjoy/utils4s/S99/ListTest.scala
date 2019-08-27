package cn.thinkjoy.utils4s.S99

package study

/**
  * List学习，两个冒号(:)和三个冒号(:)的使用
  */
object ListTest {

  def main(args: Array[String]): Unit = {
    val one = List(1, 2, 3, 4, 5)
    val two = List(6, 7, 8, 9, 10)

    // List ::: 方法实现叠加功能
    val three = one ::: two
    // 此时 three的值是：List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(three)

    // List :: 方法是实现把新元素添加到已有List的最前端
    val four = 1 :: three
    // four的值是：List(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(four)
  }

}