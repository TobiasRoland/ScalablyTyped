package typings.reactSidebar.mod

import typings.std.CSSStyleDeclaration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarStyles extends js.Object {
  var content: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
  var dragHandle: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
  var overlay: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
  var root: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
  var sidebar: js.UndefOr[Partial[CSSStyleDeclaration]] = js.undefined
}

object SidebarStyles {
  @scala.inline
  def apply(
    content: Partial[CSSStyleDeclaration] = null,
    dragHandle: Partial[CSSStyleDeclaration] = null,
    overlay: Partial[CSSStyleDeclaration] = null,
    root: Partial[CSSStyleDeclaration] = null,
    sidebar: Partial[CSSStyleDeclaration] = null
  ): SidebarStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dragHandle != null) __obj.updateDynamic("dragHandle")(dragHandle.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarStyles]
  }
}

