package cn.thinkjoy.utils4s.S99

/*
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

/**
  * final关键字:
  * 1>.在Scala中，final修饰的类或者方法或者成员变量，不能被重写
  * 2>.如果使用final关键字修饰类，则该类不能被继承
  * 3>.如果使用final关键字修饰方法，则该方法不能被重写（override）
  * 4>.如果使用final关键字修饰成员变量，则该成员变量不能被重新修改（无法再次赋值）
  * type关键字:
  * 我们可以理解type的功能就是一个别名。
  */
final object AbstractFinalClassImpl extends AbstractFinalClass with TeacherFinal {

  /**
    * 我们在继承的时候，需要指定“Zhangsan”的类型，比如我们此处指定其类型为String。
    */
  type Zhangsan = String

  def eat(food: String): String = {
    "炒着吃" + food
  }

  override def palyGame(name: String): String = {
    s"$name 正在打王者荣耀哟......."
  }

  def main(args: Array[String]): Unit = {
    AbstractFinalClassImpl.sayHello()
    val res1 = AbstractFinalClassImpl.eat("腊肉")
    println(s"res1 =====> ${res1}")
    AbstractFinalClassImpl.Bodybuilding("张三")

  }
}


/*
以上代码执行结果如下:
I'm zhangsan!
res1 =====> 炒着吃腊肉
张三 正在健身....
 */
