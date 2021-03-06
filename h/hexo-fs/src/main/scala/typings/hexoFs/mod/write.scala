package typings.hexoFs.mod

import typings.hexoFs.AnonBufferBytesWritten
import typings.hexoFs.AnonBufferBytesWrittenNumber
import typings.hexoFs.AnonBufferBytesWrittenNumberString
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "write")
@js.native
object write extends js.Object {
  def apply(fd: Double): typings.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer): typings.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double): typings.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double): typings.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[AnonBufferBytesWritten] = js.native
  def apply(fd: Double, buffer: Uint8Array): typings.bluebird.mod.^[AnonBufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double): typings.bluebird.mod.^[AnonBufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double): typings.bluebird.mod.^[AnonBufferBytesWrittenNumber] = js.native
  def apply(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): typings.bluebird.mod.^[AnonBufferBytesWrittenNumber] = js.native
  def apply(fd: Double, string: js.Any): typings.bluebird.mod.^[AnonBufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double): typings.bluebird.mod.^[AnonBufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Double, encoding: String): typings.bluebird.mod.^[AnonBufferBytesWrittenNumberString] = js.native
  def apply(fd: Double, string: js.Any, position: Null, encoding: String): typings.bluebird.mod.^[AnonBufferBytesWrittenNumberString] = js.native
}

