package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalBooleanValueBlockParams extends LocalBaseBlockParams {
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[scala.Boolean] = js.undefined
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}

object LocalBooleanValueBlockParams {
  @scala.inline
  def apply(
    blockLength: Int | Double = null,
    error: String = null,
    isHexOnly: js.UndefOr[scala.Boolean] = js.undefined,
    value: js.UndefOr[scala.Boolean] = js.undefined,
    valueBeforeDecode: ArrayBuffer = null,
    valueHex: ArrayBuffer = null,
    warnings: js.Array[String] = null
  ): LocalBooleanValueBlockParams = {
    val __obj = js.Dynamic.literal()
    if (blockLength != null) __obj.updateDynamic("blockLength")(blockLength.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(isHexOnly)) __obj.updateDynamic("isHexOnly")(isHexOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueBeforeDecode != null) __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode.asInstanceOf[js.Any])
    if (valueHex != null) __obj.updateDynamic("valueHex")(valueHex.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalBooleanValueBlockParams]
  }
}

