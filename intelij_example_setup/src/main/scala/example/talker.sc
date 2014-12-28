class Talker {
  def sayHello(str: String) : String = "Hello " + str + "!"
}

val talker = new Talker

talker.sayHello("World")