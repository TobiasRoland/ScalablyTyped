package typings.xterm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IEvent[T] = js.Function1[/* listener */ js.Function1[/* e */ T, js.Any], typings.xterm.mod.IDisposable]
}
