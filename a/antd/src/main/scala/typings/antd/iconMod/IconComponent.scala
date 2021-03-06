package typings.antd.iconMod

import typings.antd.iconFontMod.CustomIconOptions
import typings.react.mod.FunctionComponent
import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconComponent[P] extends FunctionComponent[P] {
  var createFromIconfontCN: js.Function1[/* options */ js.UndefOr[CustomIconOptions], SFC[IconProps]] = js.native
  var getTwoToneColor: js.Function0[String] = js.native
  var setTwoToneColor: js.Function1[/* primaryColor */ String, Unit] = js.native
  var unstable_ChangeDefaultThemeOfIcons: js.UndefOr[js.Function1[/* theme */ ThemeType, Unit]] = js.native
  var unstable_ChangeThemeOfIconsDangerously: js.UndefOr[js.Function1[/* theme */ js.UndefOr[ThemeType], Unit]] = js.native
}

