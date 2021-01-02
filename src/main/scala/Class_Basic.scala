class class_Basic(le :String,Ri : String) {
  def greet(x: String): String = {
    var y = x
    y.toString
  }
  println(class_Basic.this.greet("Hello"))

  def main(args: Array[String]): Unit = {
    val up =new class_Basic("👈","👉")
    println( up.greet("Man"))
  }
}
