package typings.vueSplitpane.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneMethods extends js.Object {
  def onClick(): Unit
  def onMouseDown(): Unit
  def onMouseMove(e: Event_): Unit
  def onMouseUp(): Unit
}

object SplitpaneMethods {
  @scala.inline
  def apply(onClick: () => Unit, onMouseDown: () => Unit, onMouseMove: Event_ => Unit, onMouseUp: () => Unit): SplitpaneMethods = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), onMouseDown = js.Any.fromFunction0(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp))
  
    __obj.asInstanceOf[SplitpaneMethods]
  }
}

