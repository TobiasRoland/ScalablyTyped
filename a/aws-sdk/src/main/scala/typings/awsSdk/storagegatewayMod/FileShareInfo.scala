package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileShareInfo extends js.Object {
  var FileShareARN: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareARN] = js.native
  var FileShareId: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareId] = js.native
  var FileShareStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareStatus] = js.native
  var FileShareType: js.UndefOr[typings.awsSdk.storagegatewayMod.FileShareType] = js.native
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object FileShareInfo {
  @scala.inline
  def apply(
    FileShareARN: FileShareARN = null,
    FileShareId: FileShareId = null,
    FileShareStatus: FileShareStatus = null,
    FileShareType: FileShareType = null,
    GatewayARN: GatewayARN = null
  ): FileShareInfo = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN.asInstanceOf[js.Any])
    if (FileShareId != null) __obj.updateDynamic("FileShareId")(FileShareId.asInstanceOf[js.Any])
    if (FileShareStatus != null) __obj.updateDynamic("FileShareStatus")(FileShareStatus.asInstanceOf[js.Any])
    if (FileShareType != null) __obj.updateDynamic("FileShareType")(FileShareType.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileShareInfo]
  }
}

