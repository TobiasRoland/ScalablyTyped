package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonETBJPYSOS extends js.Object {
  var ETB: js.Array[String]
  var JPY: js.Array[String]
  var SOS: js.Array[String]
  var USD: js.Array[String]
}

object AnonETBJPYSOS {
  @scala.inline
  def apply(ETB: js.Array[String], JPY: js.Array[String], SOS: js.Array[String], USD: js.Array[String]): AnonETBJPYSOS = {
    val __obj = js.Dynamic.literal(ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonETBJPYSOS]
  }
}

