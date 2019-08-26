package cn.thinkjoy.utils4s.S99

/*
使用Scala的单列类调用自定义Teacher类
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object TeacherDemo {
  def main(args: Array[String]): Unit = {
    //调用带有两个参数的主构造器
    val t1 = new Teacher("张三", 18)
    println(s"姓名:${t1.name},年龄:${t1.age}")

    //调用带有3个参数的辅助构造器
    val t2 = new Teacher("张三", 20, "男")
    println(s"姓名:${t2.name},年龄:${t2.age},性别:${t2.sex}")

    //调用带有4个参数的辅助构造器
    val t3 = new Teacher("张三", 26, "男", "https://www.cnblogs.com/yinzhengjie")
    println(s"姓名:${t3.name},年龄:${t3.age},性别:${t3.sex},博客:${t3.blog}")
  }
}


/*
以上代码输出几个如下:
姓名:张三,年龄:18
姓名:张三,年龄:20,性别:男
姓名:张三,年龄:26,性别:男,博客:https://www.cnblogs.com/yinzhengjie
 */