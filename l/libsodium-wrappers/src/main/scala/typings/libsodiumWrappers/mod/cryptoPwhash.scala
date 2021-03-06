package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers", "crypto_pwhash")
@js.native
object cryptoPwhash extends js.Object {
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: String,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double
  ): Uint8Array = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    keyLength: Double,
    password: Uint8Array,
    salt: Uint8Array,
    opsLimit: Double,
    memLimit: Double,
    algorithm: Double,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}

