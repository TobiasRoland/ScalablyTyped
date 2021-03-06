package typings.officeUiFabricReact.activityItemTypesMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityItemProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
    * onRenderActivityDescription are included, no description of the activity is shown.
    */
  var activityDescription: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  /**
    * Text describing the activity that occurred and naming the people involved in it.
    * Deprecated, use `activityDescription` instead.
    * @deprecated Use `activityDescription` instead.
    */
  var activityDescriptionText: js.UndefOr[String] = js.undefined
  /**
    * An element containing an icon shown next to the activity item.
    */
  var activityIcon: js.UndefOr[ReactNode] = js.undefined
  /**
    * If activityIcon is not set, then the persona props in this array will be used as the icon for the this activity item.
    */
  var activityPersonas: js.UndefOr[js.Array[IPersonaSharedProps]] = js.undefined
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the center of the activity icon. Signals an activity has started.
    * @defaultvalue false
    */
  var animateBeaconSignal: js.UndefOr[Boolean] = js.undefined
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.undefined
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.undefined
  /**
    * Text of comments or \@mention messages.
    * Deprecated, use `comments` instead.
    * @deprecated Use `comments` instead.
    */
  var commentText: js.UndefOr[String] = js.undefined
  /**
    * An element containing the text of comments or \@mention messages.
    * If no comments, commentText, or onRenderComments are included, no comments are shown.
    */
  var comments: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  /**
    * Indicated if the compact styling should be used.
    */
  var isCompact: js.UndefOr[Boolean] = js.undefined
  /**
    * A renderer for the description of the current activity.
    */
  var onRenderActivityDescription: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer that adds the text of a comment below the activity description.
    */
  var onRenderComments: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer to create the icon next to the activity item.
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
    */
  var onRenderTimeStamp: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * Optional styling for the elements within the Activity Item.
    */
  var styles: js.UndefOr[IActivityItemStyles] = js.undefined
  /**
    * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
    */
  var timeStamp: js.UndefOr[String | js.Array[ReactNode] | ReactNode] = js.undefined
}

object IActivityItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    activityDescription: js.Array[ReactNode] | ReactNode = null,
    activityDescriptionText: String = null,
    activityIcon: ReactNode = null,
    activityPersonas: js.Array[IPersonaSharedProps] = null,
    animateBeaconSignal: js.UndefOr[Boolean] = js.undefined,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    commentText: String = null,
    comments: js.Array[ReactNode] | ReactNode = null,
    isCompact: js.UndefOr[Boolean] = js.undefined,
    onRenderActivityDescription: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null = null,
    onRenderComments: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null = null,
    onRenderIcon: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null = null,
    onRenderTimeStamp: (/* props */ js.UndefOr[IActivityItemProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IActivityItemProps], Element | Null]]) => Element | Null = null,
    styles: IActivityItemStyles = null,
    timeStamp: String | js.Array[ReactNode] | ReactNode = null
  ): IActivityItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (activityDescription != null) __obj.updateDynamic("activityDescription")(activityDescription.asInstanceOf[js.Any])
    if (activityDescriptionText != null) __obj.updateDynamic("activityDescriptionText")(activityDescriptionText.asInstanceOf[js.Any])
    if (activityIcon != null) __obj.updateDynamic("activityIcon")(activityIcon.asInstanceOf[js.Any])
    if (activityPersonas != null) __obj.updateDynamic("activityPersonas")(activityPersonas.asInstanceOf[js.Any])
    if (!js.isUndefined(animateBeaconSignal)) __obj.updateDynamic("animateBeaconSignal")(animateBeaconSignal.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (commentText != null) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompact)) __obj.updateDynamic("isCompact")(isCompact.asInstanceOf[js.Any])
    if (onRenderActivityDescription != null) __obj.updateDynamic("onRenderActivityDescription")(js.Any.fromFunction2(onRenderActivityDescription))
    if (onRenderComments != null) __obj.updateDynamic("onRenderComments")(js.Any.fromFunction2(onRenderComments))
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(js.Any.fromFunction2(onRenderIcon))
    if (onRenderTimeStamp != null) __obj.updateDynamic("onRenderTimeStamp")(js.Any.fromFunction2(onRenderTimeStamp))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityItemProps]
  }
}

