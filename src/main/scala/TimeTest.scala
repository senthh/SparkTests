import org.apache.spark.sql.catalyst.expressions.Hour
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.log4j.{Logger, Level}

object TimeTest {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("SparkSubmitApp")
      .master("local[*]")
      .getOrCreate()

    Logger.getLogger("org").setLevel(Level.ERROR)
    Logger.getLogger("akka").setLevel(Level.ERROR)
    Logger.getRootLogger.setLevel(Level.ERROR)

    spark.sql("select tiME '10:57:00' as TIME").show()
    spark.sql("select HOUR(TIME'10:57:00') as HOUR").show()
    println("\n\n\nselect time('12:25:13.45')")
    spark.sql("select time('12:25:13.45') as TIME").show()
    println("select time(timestamp'2020-04-30 00:25:13.45')")
    spark.sql("select time(timestamp'2020-04-30 00:25:13.45') as TIME").show()
    println("select time(123)")
    spark.sql("select time(123) as TIME").show()

    spark.sql("select Time(86399)").show()
    // spark.sql("select cast(123) as TIME").show()
    // spark.sql("SELECT CAST('2020-04-30 12:25:13.45' AS TIMESTAMP) AS ts").show(false)

    // spark.sql("select time(timestamp'2020-04-30 12:25:13.45') as TIME").show()
  }
}

