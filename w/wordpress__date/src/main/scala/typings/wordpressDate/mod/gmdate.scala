package typings.wordpressDate.mod

import typings.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/date", "gmdate")
@js.native
object gmdate extends js.Object {
  def apply(dateFormat: String): String = js.native
  def apply(dateFormat: String, dateValue: MomentInput): String = js.native
}

