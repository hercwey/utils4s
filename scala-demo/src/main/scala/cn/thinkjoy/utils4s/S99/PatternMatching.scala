package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/zhangsan/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

import java.awt.Color


/**
  * 模式匹配 match case
  * 一旦一个case 匹配上了，就不会再往下匹配了
  */
object PatternMatching {
  def main(args: Array[String]): Unit = {
    matchingConstant(Color.orange)
    contentMatch("zhangsan")
    typeMatch(2018)
    typeMatch(true)
    arrayMatch(Array(8))
    listMatch(1 :: 2 :: 3 :: Nil)  // 没看懂
    tupleMatch((0, 1))
    objMatch(1, 2)
    objMatch(People)
  }

  /**
    * 匹配对象
    */
  def objMatch(obj: Any) = {
    val res = obj match {
      case (x, y) => s"$x $y"
      case Int => "int"
      case People => People.init()
      case _ => "匹配失败!"
    }
    println(res)
  }

  /**
    * 匹配元组
    */
  def tupleMatch(tuple: Any) = {
    val res = tuple match {
      case (0, _) => "元组的第一个元素为0， 第二个元素为任意类型的数据，且只有2个元素"
      case (a, b, c) => "拥有三个元素的元组"
      case (_, "98K + 八倍镜") => "[98K + 八倍镜] 套装"
      case _ => "匹配失败!"
    }
    println(res)
  }

  /**
    * 匹配List
    */
  def listMatch(list: Any) = {
    val res = list match {
      case 0 :: Nil => "只有一个0元素的List"
      case 7 :: 9 :: Nil => "只有7和9元素的List"
      case x :: y :: z :: Nil => "只有三个元素的List"
      case m :: n if n.length > 0 => "------" // 拥有head，和 tail的数组， “if n.length > 0” 是守卫条件
      case _ => "匹配失败!"
    }
    println(res)
  }

  /**
    * 匹配Array
    */
  def arrayMatch(arr: Any) = {
    val res = arr match {
      case Array(0) => "只有一个0元素的数组"
      case Array(0, _) => "以0开头的，拥有2个元素的数组"
      case Array(1, _, 3) => "已1开头，3结尾，中间为任意元素的三个元素的数组"
      case Array(8, _*) => "已8开头，N个元素的数组" // _*标识0个或者多个任意类型的数据
      case _ => "匹配失败!"
    }
    println(res)
  }

  /**
    * 匹配数据类型
    */
  def typeMatch(tp: Any) = {
    val res = tp match {
      case x: Int => s"Int $x"
      case y: Long => s"Long $y"
      case z: Boolean => s"boolean $z"
      case _ => "匹配失败!"
    }
    println(res)
  }

  /**
    * 匹配字符串内容
    */
  def contentMatch(str: String) = {
    val res = str match {
      case "zhangsan" => "张三"
      case "Python" => "Python"
      case "Golang" => "Golang"
      case "Java" => "Java"
      case "2018" => "2018"
      case _ => "匹配失败!" // "_"用于任意内容
    }
    println(res)
  }

  /**
    * 匹配常量 + 守卫条件
    * 扩展常量问题:大写会识别成常量，小写是变量，如果让小写也是常量，使用``标出
    */
  def matchingConstant(color: Color) = {
    val res = color match {
      case Color.RED => "红色" //case Color.RED 匹配结果为 "红色"，下面两行代码类似。
      case Color.GREEN => "绿色"
      case Color.yellow => "黄色"
      case _ if color == Color.orange => "恭喜你，中奖了！" //这里定义的就是守卫条件。
      case _ => "匹配失败!" //case _ 表示匹配任意类型。换句话说，这里定义的是默认匹配情况，即上面的3中匹配均无效。
    }
    println(res)
  }
}


/*
以上代码执行结果如下 :
恭喜你，中奖了！
张三
Int 2018
boolean true
已8开头，N个元素的数组
只有三个元素的List
元组的第一个元素为0， 第二个元素为任意类型的数据，且只有2个元素
1 2
姓名:张三,年龄:26
 */
