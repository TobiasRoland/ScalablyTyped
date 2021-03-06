package typings.webix.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webix.webixStrings.onAfterPortletMove
  - typings.webix.webixStrings.onBeforePortletMove
  - typings.webix.webixStrings.onBindRequest
  - typings.webix.webixStrings.onDestruct
  - typings.webix.webixStrings.onViewShow
*/
trait portletEventName extends js.Object

object portletEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def onAfterPortletMove: typings.webix.webixStrings.onAfterPortletMove = this.cast("onAfterPortletMove")
  @scala.inline
  def onBeforePortletMove: typings.webix.webixStrings.onBeforePortletMove = this.cast("onBeforePortletMove")
  @scala.inline
  def onBindRequest: typings.webix.webixStrings.onBindRequest = this.cast("onBindRequest")
  @scala.inline
  def onDestruct: typings.webix.webixStrings.onDestruct = this.cast("onDestruct")
  @scala.inline
  def onViewShow: typings.webix.webixStrings.onViewShow = this.cast("onViewShow")
}

