package cn.thinkjoy.utils4s.S99

/**
  * 数组的常用方法
  *
  * 映射方法（map）
  */
object MyArrayMap {

  def main(args: Array[String]): Unit = {
    /**
      * 注意，如果直接给数组初始化的话，可以不用写new,直接使用数组的apply方法进行赋值操作，当然你可以省略".apply"这个方法。
      */
    val arr = Array.apply[String]("zhangsan", "张三", "Scala", "Python", "Golang")

    /**
      * 定义映射关系f1，功能是将传入的String类型的参数加上后缀;而arr数组经过map映射操作之后会返回一个新的数组。
      */
    var f1 = (x: String) => x + "_2018"
    val arr2 = arr.map(f1)

    /**
      * 当然，上面的这种写法也可以简写，如下:
      */
    val arr3 = arr.map((x: String) => x + "_2018") //我们可以把上面的f1映射名称去掉，直接传入一个匿名函数
    val arr4 = arr.map(x => x + "_2018") //这里的x的变量Scala会自动识别其数据类型
    var arr5 = arr.map(_ + "_2018") //注意这个下划线("_")其实是表示的是arr数组中的每一个元素哟

    println(arr.toBuffer.toString())
    println(arr2.toBuffer.toString())
    println(arr3.toBuffer.toString())
    println(arr4.toBuffer.toString())
    println(arr5.toBuffer.toString())
  }
}
