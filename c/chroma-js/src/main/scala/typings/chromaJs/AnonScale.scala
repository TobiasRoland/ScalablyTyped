package typings.chromaJs

import typings.chromaJs.mod.Color
import typings.chromaJs.mod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScale extends js.Object {
  def apply(t: Double): Color = js.native
  def scale(): Scale[Color] = js.native
}

