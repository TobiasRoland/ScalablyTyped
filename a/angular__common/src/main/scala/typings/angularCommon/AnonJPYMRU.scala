package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYMRU extends js.Object {
  var JPY: js.Array[String]
  var MRU: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYMRU {
  @scala.inline
  def apply(JPY: js.Array[String], MRU: js.Array[String], USD: js.Array[String]): AnonJPYMRU = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MRU = MRU.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYMRU]
  }
}

