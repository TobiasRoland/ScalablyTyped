package typings.baconjs

import typings.baconjs.typesMod.Subscribe
import typings.baconjs.updatebarrierMod.EventSink
import typings.baconjs.updatebarrierMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnObs extends js.Object {
  def apply[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
}

