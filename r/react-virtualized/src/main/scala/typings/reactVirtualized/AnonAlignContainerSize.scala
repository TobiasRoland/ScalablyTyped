package typings.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignContainerSize extends js.Object {
  var align: String
  var containerSize: Double
  var currentOffset: Double
  var targetIndex: Double
}

object AnonAlignContainerSize {
  @scala.inline
  def apply(align: String, containerSize: Double, currentOffset: Double, targetIndex: Double): AnonAlignContainerSize = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], currentOffset = currentOffset.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlignContainerSize]
  }
}

