package typings.ptyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pty.js", "createTerminal")
@js.native
object createTerminal extends js.Object {
  def apply(): Terminal = js.native
  def apply(file: String): Terminal = js.native
  def apply(file: String, args: js.Array[String]): Terminal = js.native
  def apply(file: String, args: js.Array[String], opt: TerminalOptions): Terminal = js.native
}

