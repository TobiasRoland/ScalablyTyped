package typings.secp256k1.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("secp256k1", "signatureExport")
@js.native
object signatureExport extends js.Object {
  def apply(signature: Buffer): Buffer = js.native
}

