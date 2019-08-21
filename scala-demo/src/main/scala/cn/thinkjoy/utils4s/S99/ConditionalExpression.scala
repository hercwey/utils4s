package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object ConditionalExpression {
  def main(args: Array[String]): Unit = {
    /**
      * if 语句的使用
      */
    val Name = "张三"
    if (Name == "张三") {
      println("欢迎使用Scala！")
    }
    /**
      * if...else 语句的使用
      */
    val sex = "boy"
    val res = if (sex == "boy") "小哥哥" else "小姐姐" //这个和Python中的三元表达式很像哟！
    println(res)

    /**
      * if...else if ...else多分支语句
      */
    val age: Int = 18
    var Title = if (age > 38) { //注意:我们在定义Title变量是并没有指定数据类型，编译器会自动推测出返回值类型，如果上面都没有返回默认就是Unit哟！
      "大叔"
    } else if (age > 20) {
      "小哥哥"
    } else {
      "小鲜肉"
    }
    println(s"${Title}")
  }
}


/*
以上代码输出结果如下 :
欢迎使用Scala！
小哥哥
小鲜肉
 */
