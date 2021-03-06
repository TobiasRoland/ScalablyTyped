package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledEnabled extends js.Object {
  var disabled: Double
  var enabled: Double
  var undefined: Double
}

object AnonDisabledEnabled {
  @scala.inline
  def apply(disabled: Double, enabled: Double, undefined: Double): AnonDisabledEnabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledEnabled]
  }
}

