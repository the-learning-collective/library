import example.Talker

/**
 * Created by aguestuser on 12/27/14.
 */
object Main extends App {
  println("Mic check.")
  val talker = new Talker
  println(talker.sayHello("World"))
}

