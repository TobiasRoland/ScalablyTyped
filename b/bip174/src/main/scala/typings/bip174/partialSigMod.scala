package typings.bip174

import typings.bip174.bip174Strings.`Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket`
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PartialSig
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/partialSig", JSImport.Namespace)
@js.native
object partialSigMod extends js.Object {
  val expected: `Leftcurlybracket pubkeyColon BufferSemicolon signatureColon BufferSemicolon Rightcurlybracket` = js.native
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean = js.native
  def decode(keyVal: KeyValue): PartialSig = js.native
  def encode(pSig: PartialSig): KeyValue = js.native
}

