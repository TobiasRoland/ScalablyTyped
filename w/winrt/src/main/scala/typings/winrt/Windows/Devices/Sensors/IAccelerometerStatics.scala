package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerStatics extends js.Object {
  def getDefault(): Accelerometer
}

object IAccelerometerStatics {
  @scala.inline
  def apply(getDefault: () => Accelerometer): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
  
    __obj.asInstanceOf[IAccelerometerStatics]
  }
}

