package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigation/BottomNavigation.BottomNavigationClassKey>> */
@js.native
trait PartialClassNameMapBottomNavigationClassKey extends js.Object {
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapBottomNavigationClassKey {
  @scala.inline
  def apply(root: String = null): PartialClassNameMapBottomNavigationClassKey = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapBottomNavigationClassKey]
  }
}

