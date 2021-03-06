package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20")
@js.native
object cryptoStreamChacha20 extends js.Object {
  def apply(outLength: Double, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
  def apply(outLength: Double, key: Uint8Array, nonce: Uint8Array, outputFormat: StringOutputFormat): String = js.native
  def apply(outLength: Double, key: Uint8Array, nonce: Uint8Array, outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}

