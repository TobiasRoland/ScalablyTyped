package typings.asn1js.mod

import typings.asn1js.AnonResult
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "verifySchema")
@js.native
object verifySchema extends js.Object {
  /**
    * ASN.1 schema verification for ArrayBuffer data
    * 
    * @param {ArrayBuffer} inputBuffer Input BER-encoded ASN.1 data
    * @param {*} inputSchema Input ASN.1 schema to verify against to
    * @returns {{ verified: boolean, result?: any }}
    */
  def apply(inputBuffer: ArrayBuffer, inputSchema: js.Any): AnonResult = js.native
}

