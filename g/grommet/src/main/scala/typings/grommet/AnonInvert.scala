package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvert extends js.Object {
  var invert: js.UndefOr[AnonColorColorType] = js.undefined
}

object AnonInvert {
  @scala.inline
  def apply(invert: AnonColorColorType = null): AnonInvert = {
    val __obj = js.Dynamic.literal()
    if (invert != null) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvert]
  }
}

