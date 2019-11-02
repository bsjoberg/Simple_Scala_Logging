import com.typesafe.scalalogging.{LazyLogging, Logger}

object LoggingTutorial extends App with LazyLogging {
  logger.info("Hello there!")
  logger.debug("Hello there!")
  logger.error("Hello there!")
}
