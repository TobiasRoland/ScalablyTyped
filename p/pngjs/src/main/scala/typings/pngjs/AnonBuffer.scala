package typings.pngjs

import typings.node.Buffer
import typings.pngjs.mod.PNG
import typings.pngjs.mod.PackerOptions
import typings.pngjs.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuffer extends js.Object {
  def read(buffer: Buffer): PNG = js.native
  def read(buffer: Buffer, options: ParserOptions): PNG = js.native
  def write(png: PNG): Buffer = js.native
  def write(png: PNG, options: PackerOptions): Buffer = js.native
}

