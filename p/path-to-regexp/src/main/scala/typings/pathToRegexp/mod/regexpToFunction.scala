package typings.pathToRegexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-to-regexp", "regexpToFunction")
@js.native
object regexpToFunction extends js.Object {
  def apply[P /* <: js.Object */](re: RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
}

