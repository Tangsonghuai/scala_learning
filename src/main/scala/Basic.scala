/**
 * scala_learning
 *
 * @author tangsonghuai
 * @date 2021/1/2 8:05
 */
object Basic {
  def main(args: Array[String]): Unit = {
    // 常量
    val x= 2+3; print("常量 "+x)
    println()
    // 变量
    var y=3; print("变量 "+y)
    println()
    //代码块，使用{} 括号将N个表达式框起来
    var z ={
      var x01=100;
      var y01=200;
      x01+y01+45+"   END __"       // 代码块返回值 标识位, (不包括print等关键字)
    }
    println("代码块的值 "+z)
    println("函数学习")
    /*
    * 函数是带有参数的表达式，     参数 =>  表达式  的构造方式
    * */
    //函数 一
    var fun01= (x:Int) => x+6 +"      __Function__"
    println(fun01(2))
    //函数二
    var fun02=(x:Int,y:Int) =>y+ x+2 +"      _Fun02_"
    println(fun02(2,2))
   //函数三
    var fun03=() => 22
    println(fun03() +"              __")
    println()
    // 方法的学习
    /*
    * 方法与函数很相似
    * 区别 1. 方法 def 关键字定义， 结构形式是 def way_Name(args[*]*):返回值=方法体
    * */
    def  way01(x:Int,y:Int):Int=x+y
    println(way01(1,5)+"       way")
    //方法二，scala方法可以接收多个参数列表
    def way02(x:Int,y:Int)(plus:Int):Int=(x+y)*plus
    println(way02(1,2)(6)+"       方法接收多个参数列表")
   //方法三
    def way03():Int=66
    println(way03())
    //方法就是类似函数的东西
    def To(x:Double):String={
      var y=x*x
      y.toString
    }
    println(To(6.6))
  }

}
