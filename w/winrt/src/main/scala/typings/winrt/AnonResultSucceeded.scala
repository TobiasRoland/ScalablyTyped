package typings.winrt

import typings.winrt.Windows.Data.Json.JsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResultSucceeded extends js.Object {
  var result: JsonObject
  var succeeded: Boolean
}

object AnonResultSucceeded {
  @scala.inline
  def apply(result: JsonObject, succeeded: Boolean): AnonResultSucceeded = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResultSucceeded]
  }
}

