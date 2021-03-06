package typings.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension_ extends js.Object {
  /**
    * Event listeners functions that called on the conversion, when the `event` occurs.
    */
  var listeners: js.UndefOr[StringDictionary[EventListener]] = js.undefined
  /**
    * Property defines the nature of said sub-extensions and can assume 2 values:
    *
    * * `lang`  - Language extensions add new markdown syntax to showdown.
    * * `output` - Output extensions (or modifiers) alter the HTML output generated by showdown.
    * * `listener` - Listener extensions for listening to a conversion event.
    */
  var `type`: String
}

object Extension_ {
  @scala.inline
  def apply(`type`: String, listeners: StringDictionary[EventListener] = null): Extension_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension_]
  }
}

