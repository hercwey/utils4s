package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object Teacher3Demo {
  def main(args: Array[String]): Unit = {
    //调用带有4个参数的辅助构造器
    val t1 = new Teacher3("张三", 26)
    //由于主构造方法的age字段被私有化了，因此就没法通过getter或者setter方法访问啦！因此我们只可以访问name字段！
    println(s"姓名:${t1.name}")
  }
}


/*
以上代码输出几个如下:
姓名:张三
 */
