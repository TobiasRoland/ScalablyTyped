package typings.winjs.mod.UI.XYFocus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRect extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var height: Double
  var left: Double
  var right: js.UndefOr[Double] = js.undefined
  var top: Double
  var width: Double
}

object IRect {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    top: Double,
    width: Double,
    bottom: Int | Double = null,
    right: Int | Double = null
  ): IRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRect]
  }
}

