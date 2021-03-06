package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.ScrollIntoViewOptions
import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.smoothScrollbar.scrollbarMod.ScrollToOptions
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling", JSImport.Namespace)
@js.native
object scrollingMod extends js.Object {
  def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = js.native
  def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: Partial[ScrollIntoViewOptions]
  ): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double): Unit = js.native
  def scrollTo(scrollbar: Scrollbar, x: Double, y: Double, duration: Double): Unit = js.native
  def scrollTo(
    scrollbar: Scrollbar,
    x: Double,
    y: Double,
    duration: Double,
    hasEasingCallback: Partial[ScrollToOptions]
  ): Unit = js.native
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

