package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropNameValue
  extends /* propName */ StringDictionary[js.Any] {
  var value: Double
}

object AnonPropNameValue {
  @scala.inline
  def apply(value: Double, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonPropNameValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPropNameValue]
  }
}

