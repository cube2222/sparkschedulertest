import org.apache.spark.sql.SparkSession
import org.scalatest.{FlatSpec, Matchers}



class CustomTaskSchedulerSpec extends FlatSpec with Matchers {

  "A Stack" should "pop values in last-in-first-out order" in {

    val spark = SparkSession.builder().master("yarn").getOrCreate()

  }

}