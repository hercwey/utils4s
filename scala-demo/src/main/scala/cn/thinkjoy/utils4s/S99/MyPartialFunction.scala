package cn.thinkjoy.utils4s.S99

/*
偏函数
被包在花括号内没有 match 的一组 case 语句是一个偏函数，它是 PartialFunction[-A, +B]的一个实例，“-A” 代表参数类型，“+B” 代表返回类型，常用作输入模式匹配。
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/
object MyPartialFunction {
  /**
    * 定义一个函数，要求传入的参数是一个String类型，而返回值类型是Int类型
    */
  def func(language: String): Int = {
    if (language.equals("Python")) 100
    else if (language.equals("Golang")) 200
    else if (language.equals("Java")) 300
    else if (language.equals("Shell")) 400
    else if (language.equals("Scala")) 500
    else -1
  }

  /**
    * 上面的函数我们也可以用关键字match+case组合来匹配用户的输入值
    */
  def func2(num: String): Int = num match {
    //case 可以匹配传进来的参数，即传入的字符串是"Python"就返回100.
    case "Python" => 100
    case "Golang" => 200
    case "Java" => 300
    case "Shell" => 400
    case "Scala" => 500
    //case _ 表示匹配默认情况，即以上条件均不满足时会走下面的这个语句哟
    case _ => -1
  }

  /**
    * 接下来我们用偏函数重写上面的func函数的功能
    * 其中PartialFunction就是偏函数的关键字，里面的第一个参数是调用者输入参数的类型(String)，而第二个参数是返回值类型(Int类型)
    */
  def func3: PartialFunction[String, Int] = {
    //case 可以匹配传进来的参数，即传入的字符串是"Python"就返回100.
    case "Python" => 100
    case "Golang" => 200
    case "Java" => 300
    case "Shell" => 400
    case "Scala" => 500
    //case _ 表示匹配默认情况，即以上条件均不满足时会走下面的这个语句哟
    case _ => -1
  }


  def func4: PartialFunction[Any, Int] = {
    //case也可以匹配传进来的类型，如果是Int类型就将这个参数乘以2并返回，如果这个参数不是Int类型的话就返回-1
    case i: Int => i * 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {

    var res1 = func("Python")
    println(res1)

    var res2 = func2("Python")
    println(res2)

    var res3 = func3("Python")
    println(res3)

    var arr = Array[Any](1, "张三", 3, "zhangsan", 5)
    var res4 = arr.collect(func4)
    println(res4.toBuffer.toString())
  }
}


/*
以上代码输出结果如下 :
100
100
100
ArrayBuffer(2, -1, 6, -1, 10)
 */
