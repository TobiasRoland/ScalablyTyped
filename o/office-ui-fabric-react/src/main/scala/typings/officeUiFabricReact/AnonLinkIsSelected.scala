package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinkIsSelected extends js.Object {
  /**
    * Indicates whether Pivot link is selected.
    * @deprecated Is not populated with valid value. Specify `linkIsSelected` styling instead.
    */
  var linkIsSelected: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has large format. */
  var rootIsLarge: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether Pivot has tabbed format. */
  var rootIsTabs: js.UndefOr[Boolean] = js.undefined
}

object AnonLinkIsSelected {
  @scala.inline
  def apply(
    linkIsSelected: js.UndefOr[Boolean] = js.undefined,
    rootIsLarge: js.UndefOr[Boolean] = js.undefined,
    rootIsTabs: js.UndefOr[Boolean] = js.undefined
  ): AnonLinkIsSelected = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(linkIsSelected)) __obj.updateDynamic("linkIsSelected")(linkIsSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsLarge)) __obj.updateDynamic("rootIsLarge")(rootIsLarge.asInstanceOf[js.Any])
    if (!js.isUndefined(rootIsTabs)) __obj.updateDynamic("rootIsTabs")(rootIsTabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinkIsSelected]
  }
}

