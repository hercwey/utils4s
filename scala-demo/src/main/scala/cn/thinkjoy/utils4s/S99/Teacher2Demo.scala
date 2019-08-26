package cn.thinkjoy.utils4s.S99

object Teacher2Demo {
  def main(args: Array[String]): Unit = {
    //调用带有4个参数的辅助构造器
    val t3 = new Teacher2("张三", 26, "男", "https://www.cnblogs.com/yinzhengjie")
    println(s"姓名:${t3.name},年龄:${t3.age},性别:${t3.sex},博客:${t3.blog}")
  }
}

/*
以上代码输出几个如下:
姓名:张三,年龄:26,性别:男,博客:https://www.cnblogs.com/yinzhengjie
 */

