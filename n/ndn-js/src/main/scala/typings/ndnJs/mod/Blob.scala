package typings.ndnJs.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Blob")
@js.native
class Blob ()
  extends typings.ndnJs.blobMod.Blob {
  def this(value: String) = this()
  def this(value: js.Array[Double]) = this()
  def this(value: typings.ndnJs.blobMod.Blob) = this()
  def this(value: Buffer) = this()
  def this(value: Buffer, copy: Boolean) = this()
}

