object HelloWorld {
  def main(args: Array[String]): Unit = {
    val name = 
      if (args.length > 0) {
        args(0)
      } else {
        "World"
      }
    println(s"Hello ${name}!")
  }
}
