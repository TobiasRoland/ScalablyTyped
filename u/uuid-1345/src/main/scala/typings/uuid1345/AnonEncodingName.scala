package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingName extends js.Object {
  var encoding: `object`
  var name: String
  var namespace: UuidTypes
}

object AnonEncodingName {
  @scala.inline
  def apply(encoding: `object`, name: String, namespace: UuidTypes): AnonEncodingName = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEncodingName]
  }
}

