package typings.momentTimezone.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment-timezone", "unix")
@js.native
object unix extends js.Object {
  def apply(timestamp: Double): Moment = js.native
}

