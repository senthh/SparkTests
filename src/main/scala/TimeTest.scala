import org.apache.spark.sql.catalyst.expressions.Hour
import org.apache.spark.sql.{DataFrame, SparkSession}

object TimeTest {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("SparkSubmitApp")
      .master("local[*]")
      .getOrCreate()
    spark.sql("select tiME '10:57:00' as TIME").show()
    spark.sql("select HOUR(TIME'10:57:00') as HOUR").show()
    spark.sql("select time('12:25:13.45') as TIME").show()
    spark.sql("select time(timestamp'2020-04-30 00:25:13.45') as TIME").show()
    spark.sql("select time(123) as TIME").show()
    spark.sql("select time(231) as TIME").show()
    spark.sql("select time(timestamp'2020-04-30 12:25:13.45') as TIME").show()
  }
}

