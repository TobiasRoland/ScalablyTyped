package typings.rrule

import typings.rrule.typesMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/parsestring", JSImport.Namespace)
@js.native
object parsestringMod extends js.Object {
  def parseDtstart(line: String): Partial[Options] = js.native
  def parseString(rfcString: String): Partial[Options] = js.native
}

