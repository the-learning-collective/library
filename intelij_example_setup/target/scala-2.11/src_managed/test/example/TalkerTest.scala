package example

import org.scalatest.FunSuite

/**
 * Created by aguestuser on 12/27/14.
 */
class TalkerTest extends FunSuite {
  test ("Talker#sayHello returns a string"){
    val talker = new Talker
    assert(talker.sayHello("World") == "Hello World!")
  }
}
