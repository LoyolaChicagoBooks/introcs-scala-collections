package lab_collections

import org.scalatest._
import scala.util.{Try, Success, Failure}
import RideStatistics._

/*
 * Note to student: You may NOT change this file (the tests)
 */

class RideStatisticsTests extends FlatSpec with Matchers {

  val csvData = readCSV("ride_data_2014.csv")

  "totalRiders()" should "be correct using 2014 data" in {
    totalRiders(csvData) should be (251264019l)
  }

  "mostPopularRoute()" should "be correct using 2014 data" in {
    mostPopularRoute(csvData) should be (("9", 7993744l))
  }

  "leastPopularRoute()" should "be correct using 2014 data" in {
    leastPopularRoute(csvData) should be (("33", 8l))
  }
}
