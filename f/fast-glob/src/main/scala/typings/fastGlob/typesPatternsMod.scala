package typings.fastGlob

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/types/patterns", JSImport.Namespace)
@js.native
object typesPatternsMod extends js.Object {
  type Pattern = String
  type PatternRe = RegExp
  type PatternsGroup = Record[String, js.Array[Pattern]]
}

