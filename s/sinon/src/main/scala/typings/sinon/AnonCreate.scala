package typings.sinon

import typings.sinon.mod.SinonFakeTimers
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  def create(now: Double): SinonFakeTimers = js.native
  def create(now: Date): SinonFakeTimers = js.native
}

