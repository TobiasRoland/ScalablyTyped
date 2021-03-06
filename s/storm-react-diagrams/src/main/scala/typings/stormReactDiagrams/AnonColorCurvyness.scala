package typings.stormReactDiagrams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorCurvyness extends js.Object {
  var color: String
  var curvyness: Double
  var id: String
  var labels: js.Array[AnonIdOffsetX]
  var points: js.Array[AnonIdSelected]
  var selected: Boolean
  var source: String
  var sourcePort: String
  var target: String
  var targetPort: String
  var `type`: String
  var width: Double
}

object AnonColorCurvyness {
  @scala.inline
  def apply(
    color: String,
    curvyness: Double,
    id: String,
    labels: js.Array[AnonIdOffsetX],
    points: js.Array[AnonIdSelected],
    selected: Boolean,
    source: String,
    sourcePort: String,
    target: String,
    targetPort: String,
    `type`: String,
    width: Double
  ): AnonColorCurvyness = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], curvyness = curvyness.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePort = sourcePort.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPort = targetPort.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorCurvyness]
  }
}

