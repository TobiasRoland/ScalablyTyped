package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITouchHitTestingEventArgs extends ICoreWindowEventArgs {
  var boundingBox: Rect = js.native
  var point: Point = js.native
  var proximityEvaluation: CoreProximityEvaluation = js.native
  def evaluateProximity(controlBoundingBox: Rect): CoreProximityEvaluation = js.native
  def evaluateProximity(controlVertices: js.Array[Point]): CoreProximityEvaluation = js.native
}

