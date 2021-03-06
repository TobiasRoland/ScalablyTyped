package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.segmentSegmentInterfaceMod.SegmentButtonLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSegmentButton extends js.Object {
  /**
    * If `true`, the segment button is selected.
    */
  var checked: Boolean
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  var disabled: Boolean
  /**
    * Set the layout of the text and icon in the segment.
    */
  var layout: js.UndefOr[SegmentButtonLayout] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: submit | reset | button
  /**
    * The value of the segment button.
    */
  var value: String
}

object IonSegmentButton {
  @scala.inline
  def apply(
    checked: Boolean,
    disabled: Boolean,
    `type`: submit | reset | button,
    value: String,
    layout: SegmentButtonLayout = null,
    mode: ios | md = null
  ): IonSegmentButton = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSegmentButton]
  }
}

