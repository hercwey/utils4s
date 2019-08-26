package cn.thinkjoy.utils4s.S99

/*
Scala中类的定义及构造器的使用
子定义Scala的Teacher类
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
/**
  * 关于构造器的注意事项:
  *
  * 1>.在Scala中定义类用class关键字修饰，这个类名称后面的构造器叫主构造器。类的主构造器中的属性会定义成类的成员变量。一个类
  * 只能有一个主构造器，但是可以有多个辅助构造器；
  * 2>.如果住构造器中成员属性没有val或者var修饰的话，该属性不能被访问，相当于对外没有提供get方法；
  * 3>.如果成员属性使用var修饰的话，相当于对外提供了getter和setter方法；
  * 4>.如果成员属性使用val修饰的话，相当于对外只提供了getter方法，因为val用于修饰不可变数据类型，类似与Java中定义常量的关键字“final”；
  * 5>.辅助构造器是完成赋值操作的，辅助构造器是内部需要调用主构造器或者其它辅助构造器；
  */
class Teacher(var name: String, val age: Int) {

  //定义sex和blog成员变量，让其默认值为null，我们可以用"_"表示为null。
  var sex: String = _
  var blog: String = _

  //定义辅助构造器一，辅助构造器需要调用主构造器
  def this(name: String, age: Int, sex: String) = {
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
