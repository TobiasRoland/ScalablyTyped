package typings.reactWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionsGroups extends js.Object {
  var actions: js.Array[_]
  var groups: js.Array[_]
  var lang: AnonLeftBtn
  var show: Boolean
}

object AnonActionsGroups {
  @scala.inline
  def apply(actions: js.Array[_], groups: js.Array[_], lang: AnonLeftBtn, show: Boolean): AnonActionsGroups = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionsGroups]
  }
}

