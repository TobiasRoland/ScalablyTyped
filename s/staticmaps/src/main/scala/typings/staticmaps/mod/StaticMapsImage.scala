package typings.staticmaps.mod

import typings.node.Buffer
import typings.sharp.mod.JpegOptions
import typings.sharp.mod.OutputOptions
import typings.sharp.mod.PngOptions
import typings.sharp.mod.WebpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticMapsImage extends js.Object {
  var image: Buffer = js.native
  def buffer(): js.Promise[Buffer] = js.native
  def buffer(mime: String): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: JpegOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: OutputOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: PngOptions): js.Promise[Buffer] = js.native
  def buffer(mime: String, outputOptions: WebpOptions): js.Promise[Buffer] = js.native
  def save(): js.Promise[Unit] = js.native
  def save(fileName: String): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: JpegOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: OutputOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: PngOptions): js.Promise[Unit] = js.native
  def save(fileName: String, outputOptions: WebpOptions): js.Promise[Unit] = js.native
}

