package typings.antdMobileRn.localeProviderMod

import typings.antdMobileRn.AnonDatePicker
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
  var locale: AnonDatePicker
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: AnonDatePicker, children: ReactElement = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

