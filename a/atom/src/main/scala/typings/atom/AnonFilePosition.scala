package typings.atom

import typings.atom.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilePosition extends js.Object {
  /** The path to the file being referenced. */
  var file: String
  /** The point being referenced in that file. */
  var position: js.UndefOr[Point] = js.undefined
}

object AnonFilePosition {
  @scala.inline
  def apply(file: String, position: Point = null): AnonFilePosition = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilePosition]
  }
}

