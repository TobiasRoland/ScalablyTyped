package typings.baiduApp.swan

import typings.baiduApp.AnonDevices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.Array[String]
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: AnonDevices with ErrMsgResponse): Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    services: js.Array[String],
    success: AnonDevices with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

