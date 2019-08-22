package cn.thinkjoy.utils4s.S99

/*
参数的默认值
Blog:http://www.cnblogs.com/zhangsan/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
package cn.org.zhangsan.basicGrammar

object DefaultValuesParameters {

  /**
    * 参数定义时可以指定一个默认值
    *
    * @param path :   指定程序的安装路径
    * @param user :   指定安装的用户
    */
  def installationSoftware(path: String = "D:/zhangsan/BigData/Spark", user: String = "zhangsan") = {
    print(s"安装路径是: $path,当然的安装用户是 : ${user}\n")
  }

  def main(args: Array[String]): Unit = {
    //调用时如果不传递参数，就会使用函数或者方法的默认值
    installationSoftware()
    //调用时，如果传递了参数值，就会使用传递的参数值
    installationSoftware("E:/zhangsan/Hadoop/Scala", "Administrator")
    //调用时，如果传递了一个参数，那么就会覆盖第一个参数的值
    installationSoftware("/home/zhangsan/Spark/Scala")
    //如果想要给指定的参数赋值，可以采用键值对的方式赋值,赋值参数时，参数的名称和方法定义的名称需要保持一致！
    installationSoftware(user = "root")
    //当然赋值的方式可以打乱顺序，但是需要以键值对的方式传递哟！
    installationSoftware(user = "Scala", path = "/home/zhangsan/Hadoop/Spark")
  }
}


/*
以上代码执行结果如下 :
安装路径是: D:/zhangsan/BigData/Spark,当然的安装用户是 : zhangsan
安装路径是: E:/zhangsan/Hadoop/Scala,当然的安装用户是 : Administrator
安装路径是: /home/zhangsan/Spark/Scala,当然的安装用户是 : zhangsan
安装路径是: D:/zhangsan/BigData/Spark,当然的安装用户是 : root
安装路径是: /home/zhangsan/Hadoop/Spark,当然的安装用户是 : Scala
*/