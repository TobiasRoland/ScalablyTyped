package typings.std

import typings.std.stdStrings.pointerout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pointerout extends js.Object {
  def apply(`type`: pointerout, listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _]): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerout,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

