package typings.popperJs

import typings.popperJs.popperJsStrings.bottom
import typings.popperJs.popperJsStrings.left
import typings.popperJs.popperJsStrings.right
import typings.popperJs.popperJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var x: js.UndefOr[bottom | top] = js.undefined
  var y: js.UndefOr[left | right] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    gpuAcceleration: js.UndefOr[Boolean] = js.undefined,
    x: bottom | top = null,
    y: left | right = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

