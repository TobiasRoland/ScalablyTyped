package typings.pathIsAbsolute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-is-absolute", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: String): Boolean = js.native
  def posix(path: String): Boolean = js.native
  def win32(path: String): Boolean = js.native
}

