package cn.thinkjoy.utils4s.S99

/**
  * Array 扁平化操作（flatten与flatMap）
  */
object MyArrayFlatMap {

  def main(args: Array[String]): Unit = {
    /**
      * 定义一个数组，里面存放两个字符串
      */
    val arr = Array.apply[String]("zhangsan,张三", "Python,Shell,Golang,Java,Scala")
    /**
      * 我们使用映射方法map将里面的每个元素用逗号(",")进行切割,最终会将arr里面的两个字符串变成了2个数组，
      * 而这两个数组中存放的是每个字符串按照“,”切割后的数组。
      */
    val arr2 = arr.map(_.split(","))

    /**
      * 接下来我们调用扁平化操作，使用flatten方法将两个arr2里面的两个数组去掉，直接把arr2里面嵌套的数组的每一个元素取出来。
      */
    val arr3 = arr2.flatten


    /**
      * 如果你觉得由arr转换到arr3步骤过于繁琐，你可以这样写，“arr3 = arr.map(_.split(",")).flatten”，当然你也可以使用flatMap方法哟！
      */
    val arr4 = arr.flatMap(_.split(","))

    /**
      * 我们可以查看arr,arr2以及arr3的数组的内容以及长度。
      */
    println(arr.toBuffer.toString(), arr.length)
    println(arr2(0).toBuffer.toString(), arr2(1).toBuffer.toString(), arr2.length)
    println(arr3.toBuffer.toString(), arr3.length)
    println(arr4.toBuffer.toString(), arr4.length)
  }
}


/*
以上代码执行结果如下 :
(ArrayBuffer(zhangsan,张三, Python,Shell,Golang,Java,Scala),2)
(ArrayBuffer(zhangsan, 张三),ArrayBuffer(Python, Shell, Golang, Java, Scala),2)
(ArrayBuffer(zhangsan, 张三, Python, Shell, Golang, Java, Scala),7)
(ArrayBuffer(zhangsan, 张三, Python, Shell, Golang, Java, Scala),7)
 */