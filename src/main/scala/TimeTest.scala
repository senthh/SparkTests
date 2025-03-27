import org.apache.spark.sql.catalyst.expressions.Hour
import org.apache.spark.sql.{DataFrame, SparkSession}

object TimeTest {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("SparkSubmitApp")
      .master("local[*]")
      .getOrCreate()
    spark.sql("select tiME '10:57:00' as col").show()
    spark.sql("select HOUR(TIME'10:57:00') as col").show()
    // spark.sql("select HOUR(TIME'10:57:00') as col").show()
  }
}

