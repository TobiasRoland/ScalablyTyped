package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePopulatedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the bindings object for the level at which the populated node is located.
  	 */
  var binding: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the node data.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the jQuery element of the node whose children are populated.
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the data-path atrribute of the populated node.
  	 */
  var path: js.UndefOr[String] = js.undefined
}

object NodePopulatedEventUIParam {
  @scala.inline
  def apply(binding: js.Any = null, data: js.Any = null, element: String = null, path: String = null): NodePopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePopulatedEventUIParam]
  }
}

