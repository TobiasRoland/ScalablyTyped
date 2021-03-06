package typings.antdMobileRn.cardFooterNativeMod

import typings.antdMobileRn.cardPropsTypeMod.CardFooterPropsType
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps extends CardFooterPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: ReactNode = null,
    extra: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

