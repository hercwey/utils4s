package cn.thinkjoy.utils4s.S99

/*
数组的初始化方式

长度不可变数组Array
　　注意：顾名思义，长度不可变数组指的是数组的长度不可变，但是数组的内容是可以变换的！
Blog:http://www.cnblogs.com/yinzhengjie/tag/Scala%E8%BF%9B%E9%98%B6%E4%B9%8B%E8%B7%AF/
*/

object MyArray {

  def main(args: Array[String]): Unit = {
    /**
      * 定义一个固定长度的数组,长度可变,内容可变（因为变量我们是用var关键字修饰）。
      * [String] :表示的是数组的泛型，即该数组只能接收String类型的数据哟
      * (3) : 这个数字3表示的是arr数组的长度
      */
    var arr: Array[String] = new Array[String](3)
    /**
      * 当然，上面的那种方式是写了arr变量的数据类型为一个数组，我们不懈也是可以的，因为Scala解释器会默认帮我们隐式转换的哟
      */
    var arr2 = new Array[String](3)

    /**
      * 定义定长数组, 长度不可变, 内容可变（因为变量是由val关键字修饰）
      */
    val arr3 = Array(1, 2, 3) //我们可以直接初始化数组的内容，这个时候就不需要new关键字啦！

    /**
      * 接下来我们分别修改我们定义的3个数组中的内容，具体操作如下
      */
    arr(0) = "zhangsan"
    arr2(1) = "张三"
    arr3(2) = 100

    //我们直接调用数组的toBuffer方法，因为该方法重写了toString方法。
    println(arr.toBuffer.toString())
    println(arr2.toBuffer.toString())
    println(arr3.toBuffer.toString())
  }
}


/*
以上代码执行结果如下 :
ArrayBuffer(zhangsan, null, null)
ArrayBuffer(null, 张三, null)
ArrayBuffer(1, 2, 100)
 */