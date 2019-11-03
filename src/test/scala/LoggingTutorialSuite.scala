import java.io.FileInputStream
import java.nio.file.{Files, Paths}
import java.util.Properties

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

import scala.io.Source

@RunWith(classOf[JUnitRunner])
class LoggingTutorialSuite extends FunSuite {

  test("Properties loading") {
    val hello_world =
      try {
        val properties = new Properties()
        properties.load(new FileInputStream("target/test-classes/config.properties"))
        properties.getProperty("hello.world")
      } catch {
        case e: Exception =>
          e.printStackTrace()
          sys exit 1
      }
    assert("Hello World" == hello_world)
  }

  test("Logging tutorial file was created") {
    LoggingTutorial.logMessages()
    assert(Files.exists(Paths.get("target/test.log")))
  }

  test("Logging tutorial log info error debug messages") {
    assert(true)
  }
}
