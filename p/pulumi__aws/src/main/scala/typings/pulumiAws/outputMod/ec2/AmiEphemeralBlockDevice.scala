package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiEphemeralBlockDevice extends js.Object {
  var deviceName: String = js.native
  var virtualName: String = js.native
}

object AmiEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmiEphemeralBlockDevice]
  }
}

