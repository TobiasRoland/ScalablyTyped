package typings.makerJs.MakerJs.models

import typings.makerJs.MakerJs.IModel
import typings.makerJs.MakerJs.IModelMap
import typings.makerJs.MakerJs.IPathMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.OvalArc")
@js.native
class OvalArc protected () extends IModel {
  def this(startAngle: Double, endAngle: Double, sweepRadius: Double, slotRadius: Double) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean
  ) = this()
  def this(
    startAngle: Double,
    endAngle: Double,
    sweepRadius: Double,
    slotRadius: Double,
    selfIntersect: Boolean,
    isolateCaps: Boolean
  ) = this()
  @JSName("models")
  var models_OvalArc: IModelMap = js.native
  @JSName("paths")
  var paths_OvalArc: IPathMap = js.native
}

