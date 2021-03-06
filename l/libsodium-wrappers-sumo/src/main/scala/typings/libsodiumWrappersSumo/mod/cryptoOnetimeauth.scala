package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_onetimeauth")
@js.native
object cryptoOnetimeauth extends js.Object {
  def apply(message: String, key: Uint8Array): Uint8Array = js.native
  def apply(message: String, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: String, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
  def apply(message: Uint8Array, key: Uint8Array): Uint8Array = js.native
  def apply(message: Uint8Array, key: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(message: Uint8Array, key: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

