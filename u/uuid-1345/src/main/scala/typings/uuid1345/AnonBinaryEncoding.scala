package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBinaryEncoding extends js.Object {
  var encoding: binary
  var name: String
  var namespace: UuidTypes
}

object AnonBinaryEncoding {
  @scala.inline
  def apply(encoding: binary, name: String, namespace: UuidTypes): AnonBinaryEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBinaryEncoding]
  }
}

