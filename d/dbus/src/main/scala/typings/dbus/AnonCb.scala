package typings.dbus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCb extends js.Object {
  var setter: js.UndefOr[js.Function2[/* value */ js.Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
  var `type`: String
  def getter(cb: js.Function1[/* val */ String, Unit]): Unit
}

object AnonCb {
  @scala.inline
  def apply(
    getter: js.Function1[/* val */ String, Unit] => Unit,
    `type`: String,
    setter: (/* value */ js.Any, /* done */ js.Function0[Unit]) => Unit = null
  ): AnonCb = {
    val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1(getter))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (setter != null) __obj.updateDynamic("setter")(js.Any.fromFunction2(setter))
    __obj.asInstanceOf[AnonCb]
  }
}

