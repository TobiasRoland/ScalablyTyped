package typings.d3.mod

import typings.std.Document_
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "html")
@js.native
object html extends js.Object {
  def apply(url: String): js.Promise[Document_] = js.native
  def apply(url: String, init: RequestInit): js.Promise[Document_] = js.native
}

