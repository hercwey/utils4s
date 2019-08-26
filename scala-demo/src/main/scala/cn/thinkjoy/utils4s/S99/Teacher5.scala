package cn.thinkjoy.utils4s.S99

/*
Scala中的伴生对象：伴生对象和半生类可以互相访问彼此的私有属性
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * 关于构造器的注意事项:
  * 1>.在Scala中定义类用class关键字修饰，这个类名称后面的构造器叫主构造器。类的主构造器中的属性会定义成类的成员变量。一个类
  * 只能有一个主构造器，但是可以有多个辅助构造器；
  * 2>.如果住构造器中成员属性没有val或者var修饰的话，该属性不能被访问，相当于对外没有提供get方法；
  * 3>.如果成员属性使用var修饰的话，相当于对外提供了getter和setter方法；
  * 4>.如果成员属性使用val修饰的话，相当于对外只提供了getter方法，因为val用于修饰不可变数据类型，类似与Java中定义常量的关键字“final”；
  * 5>.辅助构造器是完成赋值操作的，辅助构造器是内部需要调用主构造器或者其它辅助构造器；
  *
  * 类的成员属性访问权限：
  * 如果类的主构造器中成员属性是private修饰的，它的set 和 get方法都是私有的，外部不能访问
  *
  *
  * 类的构造器访问权限
  * 在构造器前加修饰权限
  * private 在主构造器之前，这说明该类的主构造器是私有的，外部类或者外部对象不能访问
  * 也适用于辅助构造器
  *
  * 类的访问权限
  * 类的前面加上private[this] 标识这个类在当前包下都可见，当前包下的子包不可见
  * 类的前面加上private[包名] 表示这个类在当前包及其子包下都可见
  */
private[S99] class Teacher5(var name: String, val age: Int) {
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

/**
  * 注意：“object Teacher5”是“class Teacher5”的伴生对象
  */
object Teacher5 {

  /**
    * 定义apply方法帮我们创建出“class Teacher5”的实例，如果调用者在没有指明具体方法时，默认就会调用该方法。
    */
  def apply(name: String, age: Int): Teacher5 = {
    // 初始化工作
    new Teacher5(name, age, "男", "http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/")
  }


  def main(args: Array[String]): Unit = {
    //我们直接调用伴生对象的apply方法，当然apply方法我们可以省略不写。
    val t1 = Teacher5("张三", 18)
    println(s"姓名:${t1.name},年龄:${t1.age},性别:${t1.sex},博客:${t1.blog}")

    //调用带有4个参数的辅助构造器
    val t2 = new Teacher5("张三", 26, "男", "https://www.cnblogs.com/yinzhengjie")
    println(s"姓名:${t2.name},年龄:${t2.age},性别:${t2.sex},博客:${t2.blog}")
  }
}


/*
以上代码执行结果如下 :
姓名:张三,年龄:26,性别:男,博客:https://www.cnblogs.com/yinzhengjie
 */
