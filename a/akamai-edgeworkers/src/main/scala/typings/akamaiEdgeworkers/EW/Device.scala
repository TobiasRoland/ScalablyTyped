package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notes:
  * * If device properties can not be supplied for any reason,
  *   undefined is returned for each property
  */
trait Device extends js.Object {
  /**
    * Indicates if the browser accepts third party cookies.
    */
  var acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.undefined
  /**
    * Brand name of the device.
    */
  var brandName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the device supports all of the following
    * JavaScript functions: "alert confirm access form elements
    * setTimeout setInterval and document.location"
    */
  var hasAjaxSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the browser supports cookies.
    */
  var hasCookieSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the browser supports Flash.
    */
  var hasFlashSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a mobile device.
    */
  var isMobile: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a tablet.
    */
  var isTablet: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a wireless device.
    */
  var isWireless: js.UndefOr[Boolean] = js.undefined
  /**
    * Marketing name of the device.
    */
  var marketingName: js.UndefOr[String] = js.undefined
  /**
    * The mobile browser name.
    */
  var mobileBrowser: js.UndefOr[String] = js.undefined
  /**
    * The mobile browser version.
    */
  var mobileBrowserVersion: js.UndefOr[String] = js.undefined
  /**
    * Model name of the device.
    */
  var modelName: js.UndefOr[String] = js.undefined
  /**
    * The device operation system.
    */
  var os: js.UndefOr[String] = js.undefined
  /**
    * The device operating system version.
    */
  var osVersion: js.UndefOr[String] = js.undefined
  /**
    * The physical screen height, in millimeters.
    */
  var physicalScreenHeight: js.UndefOr[Double] = js.undefined
  /**
    * The physical screen width, in millimeters.
    */
  var physicalScreenWidth: js.UndefOr[Double] = js.undefined
  /**
    * The screen resolution height, in pixels.
    */
  var resolutionHeight: js.UndefOr[Double] = js.undefined
  /**
    * The screen resolution width, in pixels.
    */
  var resolutionWidth: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the level of support for XHTML.
    */
  var xhtmlSupportLevel: js.UndefOr[Double] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.undefined,
    brandName: String = null,
    hasAjaxSupport: js.UndefOr[Boolean] = js.undefined,
    hasCookieSupport: js.UndefOr[Boolean] = js.undefined,
    hasFlashSupport: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    isTablet: js.UndefOr[Boolean] = js.undefined,
    isWireless: js.UndefOr[Boolean] = js.undefined,
    marketingName: String = null,
    mobileBrowser: String = null,
    mobileBrowserVersion: String = null,
    modelName: String = null,
    os: String = null,
    osVersion: String = null,
    physicalScreenHeight: Int | Double = null,
    physicalScreenWidth: Int | Double = null,
    resolutionHeight: Int | Double = null,
    resolutionWidth: Int | Double = null,
    xhtmlSupportLevel: Int | Double = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptsThirdPartyCookie)) __obj.updateDynamic("acceptsThirdPartyCookie")(acceptsThirdPartyCookie.asInstanceOf[js.Any])
    if (brandName != null) __obj.updateDynamic("brandName")(brandName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAjaxSupport)) __obj.updateDynamic("hasAjaxSupport")(hasAjaxSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCookieSupport)) __obj.updateDynamic("hasCookieSupport")(hasCookieSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFlashSupport)) __obj.updateDynamic("hasFlashSupport")(hasFlashSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(isTablet)) __obj.updateDynamic("isTablet")(isTablet.asInstanceOf[js.Any])
    if (!js.isUndefined(isWireless)) __obj.updateDynamic("isWireless")(isWireless.asInstanceOf[js.Any])
    if (marketingName != null) __obj.updateDynamic("marketingName")(marketingName.asInstanceOf[js.Any])
    if (mobileBrowser != null) __obj.updateDynamic("mobileBrowser")(mobileBrowser.asInstanceOf[js.Any])
    if (mobileBrowserVersion != null) __obj.updateDynamic("mobileBrowserVersion")(mobileBrowserVersion.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (physicalScreenHeight != null) __obj.updateDynamic("physicalScreenHeight")(physicalScreenHeight.asInstanceOf[js.Any])
    if (physicalScreenWidth != null) __obj.updateDynamic("physicalScreenWidth")(physicalScreenWidth.asInstanceOf[js.Any])
    if (resolutionHeight != null) __obj.updateDynamic("resolutionHeight")(resolutionHeight.asInstanceOf[js.Any])
    if (resolutionWidth != null) __obj.updateDynamic("resolutionWidth")(resolutionWidth.asInstanceOf[js.Any])
    if (xhtmlSupportLevel != null) __obj.updateDynamic("xhtmlSupportLevel")(xhtmlSupportLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

