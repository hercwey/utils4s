package cn.thinkjoy.utils4s.S99

/*
可变参数
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object VariableParameter {
  /**
    * 定义一个可变参数的方法,参数的类型为任意类型，相当于Java中的Object类，当然你也可以为AnyVal或者AnyRef的子类
    */
  def methodManyParams(args: Any*) = {
    for (item <- args) {
      print(item + "|")
    }
    println()
  }

  /**
    * 可变参数一般放在参数列表的末尾。
    */
  def add(des: String, ints: Int*): Int = {
    var sum = 0
    for (value <- ints) {
      sum += value
    }
    print(des)
    sum
  }

  def main(args: Array[String]): Unit = {
    methodManyParams("张三", "大数据", "云计算", "人工智能", "机器学习", "自动化运维", 2018)
    var res = add("计算结果 : ", 10, 20, 30, 40)
    println(res)

  }
}


/*
以上代码执行结果如下 :
张三|大数据|云计算|人工智能|机器学习|自动化运维|2018|
计算结果 : 100
 */