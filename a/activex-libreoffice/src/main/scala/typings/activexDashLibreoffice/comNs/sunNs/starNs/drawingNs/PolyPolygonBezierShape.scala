package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a poly-polygon Bezier shape. */
trait PolyPolygonBezierShape
  extends Text
     with Shape
     with LineProperties
     with FillProperties
     with PolyPolygonBezierDescriptor
     with ShadowProperties
     with RotationDescriptor

object PolyPolygonBezierShape {
  @scala.inline
  def apply(
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    PolyPolygonBezierDescriptor: PolyPolygonBezierDescriptor = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): PolyPolygonBezierShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, PolyPolygonBezierDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[PolyPolygonBezierShape]
  }
}

