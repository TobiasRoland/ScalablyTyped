package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteStream extends Writable {
  var bytesWritten: Double = js.native
  def close(): Unit = js.native
}

