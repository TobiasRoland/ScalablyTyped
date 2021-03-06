package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseUpEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the index of current tile item
    */
  var index: js.UndefOr[Double] = js.undefined
  /** returns the tile model
    */
  var model: js.UndefOr[Boolean] = js.undefined
  /** returns the current tile text
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object MouseUpEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    model: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): MouseUpEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(model)) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseUpEventArgs]
  }
}

