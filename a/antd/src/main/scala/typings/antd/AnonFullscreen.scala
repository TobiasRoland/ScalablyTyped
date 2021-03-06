package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullscreen extends js.Object {
  var fullscreen: Boolean
  var onChange: js.Function0[Null]
  var onPanelChange: js.Function0[Null]
  var onSelect: js.Function0[Null]
}

object AnonFullscreen {
  @scala.inline
  def apply(fullscreen: Boolean, onChange: () => Null, onPanelChange: () => Null, onSelect: () => Null): AnonFullscreen = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onPanelChange = js.Any.fromFunction0(onPanelChange), onSelect = js.Any.fromFunction0(onSelect))
  
    __obj.asInstanceOf[AnonFullscreen]
  }
}

