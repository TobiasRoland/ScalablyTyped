package typings.memjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  def log(args: js.Any*): Unit
}

object AnonArgs {
  @scala.inline
  def apply(log: /* repeated */ js.Any => Unit): AnonArgs = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[AnonArgs]
  }
}

