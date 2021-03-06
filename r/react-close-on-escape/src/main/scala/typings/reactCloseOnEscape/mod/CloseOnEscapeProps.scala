package typings.reactCloseOnEscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseOnEscapeProps extends js.Object {
  /**
    * Callback triggered by pressing ESC
    */
  def onEscape(): Unit
}

object CloseOnEscapeProps {
  @scala.inline
  def apply(onEscape: () => Unit): CloseOnEscapeProps = {
    val __obj = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
  
    __obj.asInstanceOf[CloseOnEscapeProps]
  }
}

