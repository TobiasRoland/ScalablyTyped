package typings.aliApp.my

import typings.aliApp.aliAppStrings.GET
import typings.aliApp.aliAppStrings.POST
import typings.aliApp.aliAppStrings.base64
import typings.aliApp.aliAppStrings.json
import typings.aliApp.aliAppStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 期望返回的数据格式，默认json，支持json，text，base64 */
  var dataType: js.UndefOr[json | text | base64] = js.undefined
  /** 设置请求的 HTTP 头，默认 {'Content-Type': 'application/x-www-form-urlencoded'} */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认GET，目前支持GET，POST */
  var method: js.UndefOr[GET | POST] = js.undefined
  /**
  		 * 超时时间，单位ms，默认30000
  		 */
  var timeout: js.UndefOr[Double] = js.undefined
  /** 目标服务器url */
  var url: String
}

object RequestOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    data: js.Any = null,
    dataType: json | text | base64 = null,
    fail: js.Any => Unit = null,
    header: RequestHeader = null,
    method: GET | POST = null,
    success: DataResponse => Unit = null,
    timeout: Int | Double = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

