package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenLocationConfig extends WxBaseRequestConfig {
  /**
    * 地址详情说明
    */
  var address: js.UndefOr[String] = js.undefined
  /**
    * 在查看位置界面底部显示的超链接, 可点击跳转
    */
  var infoUrl: js.UndefOr[String] = js.undefined
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  /**
    * 位置名
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 地图缩放级别,整形值,范围从1~28。默认为最大
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object OpenLocationConfig {
  @scala.inline
  def apply(
    address: String = null,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    infoUrl: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    name: String = null,
    scale: Int | Double = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): OpenLocationConfig = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (infoUrl != null) __obj.updateDynamic("infoUrl")(infoUrl.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenLocationConfig]
  }
}

