package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsConnectorFill {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null): DiagramShapeDefaultsConnectorFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorFill]
  }
}

