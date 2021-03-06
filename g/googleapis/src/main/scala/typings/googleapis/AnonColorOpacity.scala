package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColorOpacity extends js.Object {
  var color: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object AnonColorOpacity {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null): AnonColorOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorOpacity]
  }
}

