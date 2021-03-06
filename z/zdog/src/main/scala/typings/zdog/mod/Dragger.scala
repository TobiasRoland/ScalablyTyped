package typings.zdog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zdog", "Dragger")
@js.native
class Dragger () extends js.Object {
  def this(options: DraggerOptions) = this()
  /** @see {@link DraggerOptions#onDragEnd} */
  @JSName("onDragEnd")
  var onDragEnd_Original: DragEndListener = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  @JSName("onDragMove")
  var onDragMove_Original: DragMoveListener = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  @JSName("onDragStart")
  var onDragStart_Original: DragStartListener = js.native
  /** @see {@link DraggerOptions#onDragEnd} */
  def onDragEnd(): Unit = js.native
  /** @see {@link DraggerOptions#onDragMove} */
  def onDragMove(pointer: PointerPosition, moveX: Double, moveY: Double): Unit = js.native
  /** @see {@link DraggerOptions#onDragStart} */
  def onDragStart(pointer: PointerPosition): Unit = js.native
}

