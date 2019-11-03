import com.typesafe.scalalogging.{LazyLogging}

object LoggingTutorial extends App with LazyLogging {


  def logMessages(): Unit = {
    logger.info("Hello there!")
    logger.debug("Hello there!")
    logger.error("Hello there!")
  }
}
