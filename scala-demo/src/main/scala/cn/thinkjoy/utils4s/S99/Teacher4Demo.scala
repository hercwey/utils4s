package cn.thinkjoy.utils4s.S99


/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object Teacher4Demo {
  def main(args: Array[String]): Unit = {
    //调用带有4个参数的辅助构造器
    val t1 = new Teacher4("张三", 26, "男", "https://www.cnblogs.com/yinzhengjie")
    println(s"姓名:${t1.name},年龄:${t1.age},性别:${t1.sex},博客:${t1.blog}")
  }
}


/*
以上代码输出几个如下:
姓名:张三,年龄:26,性别:男,博客:https://www.cnblogs.com/yinzhengjie
 */
