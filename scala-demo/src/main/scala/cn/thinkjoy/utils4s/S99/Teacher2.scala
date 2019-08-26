package cn.thinkjoy.utils4s.S99

/*
Scala类的访问权限
Scala类的构造器访问权限
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 关于构造器的访问权限：
  * 在构造器前加修饰权限就可以设置相应的相应的访问权限，如果你想让主构造器私有化，只需要在主构造器前加private修饰即可。当然这种方法也适用于辅助构造器
  */
class Teacher2 private(var name: String, val age: Int) {

  //定义sex和blog成员变量，让其默认值为null，我们可以用"_"表示为null。
  var sex: String = _
  var blog: String = _

  //定义辅助构造器一，辅助构造器需要调用主构造器,我们想要将这个辅助构造器私有化，只需要在def前面加一个private修饰符即可。
  private def this(name: String, age: Int, sex: String) = {
    //在辅助构造器中必须先调用主构造器
    this(name, age)
    this.sex = sex
  }

  //定义辅助构造器二，辅助构造器如果不调用主构造器那么必须得调用其它的辅助构造器
  def this(name: String, age: Int, sex: String, blog: String) = {
    //调用其它辅助构造器，在上面的一个辅助构造器中调用了主构造器
    this(name, age, sex)
    this.blog = blog
  }
}