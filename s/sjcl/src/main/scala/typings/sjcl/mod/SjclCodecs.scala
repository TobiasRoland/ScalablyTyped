package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCodecs extends js.Object {
  var base64: SjclCodec[String]
  var base64url: SjclCodec[String]
  var bytes: SjclCodec[js.Array[Double]]
  var hex: SjclCodec[String]
  var utf8String: SjclCodec[String]
}

object SjclCodecs {
  @scala.inline
  def apply(
    base64: SjclCodec[String],
    base64url: SjclCodec[String],
    bytes: SjclCodec[js.Array[Double]],
    hex: SjclCodec[String],
    utf8String: SjclCodec[String]
  ): SjclCodecs = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], base64url = base64url.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], utf8String = utf8String.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SjclCodecs]
  }
}

