package typings.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.drawing.Image")
@js.native
class Image protected () extends Element {
  def this(src: String, rect: typings.kendoUi.kendo.geometry.Rect) = this()
  @JSName("options")
  var options_Image: ImageOptions = js.native
  def rect(): typings.kendoUi.kendo.geometry.Rect = js.native
  def rect(value: typings.kendoUi.kendo.geometry.Rect): Unit = js.native
  def src(): String = js.native
  def src(value: String): Unit = js.native
}

