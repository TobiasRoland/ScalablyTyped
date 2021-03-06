package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaDropEvent extends DropTargetAreaEvent {
  var draggable: js.UndefOr[Draggable] = js.undefined
  var dropTarget: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object DropTargetAreaDropEvent {
  @scala.inline
  def apply(
    sender: DropTargetArea,
    draggable: Draggable = null,
    dropTarget: JQuery = null,
    target: Element = null
  ): DropTargetAreaDropEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    if (draggable != null) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaDropEvent]
  }
}

