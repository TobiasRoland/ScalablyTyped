package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemKeyPropName
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var key: js.Any
}

object AnonItemKeyPropName {
  @scala.inline
  def apply(item: Element, key: js.Any, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonItemKeyPropName = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonItemKeyPropName]
  }
}

