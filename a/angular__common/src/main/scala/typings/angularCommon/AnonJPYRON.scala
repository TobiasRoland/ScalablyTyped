package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYRON extends js.Object {
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var RUB: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYRON {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    USD: js.Array[String]
  ): AnonJPYRON = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYRON]
  }
}

