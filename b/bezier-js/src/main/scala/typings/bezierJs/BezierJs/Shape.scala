package typings.bezierJs.BezierJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var back: Bezier
  var bbox: BBox
  var endcap: BezierCap
  var forward: Bezier
  var startcap: BezierCap
  def intersections(shape: Shape): js.Array[js.Array[Double | String]]
}

object Shape {
  @scala.inline
  def apply(
    back: Bezier,
    bbox: BBox,
    endcap: BezierCap,
    forward: Bezier,
    intersections: Shape => js.Array[js.Array[Double | String]],
    startcap: BezierCap
  ): Shape = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], endcap = endcap.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any], intersections = js.Any.fromFunction1(intersections), startcap = startcap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Shape]
  }
}

