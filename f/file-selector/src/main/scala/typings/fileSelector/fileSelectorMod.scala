package typings.fileSelector

import typings.fileSelector.fileMod.FileWithPath
import typings.std.DataTransferItem
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector/dist/file-selector", JSImport.Namespace)
@js.native
object fileSelectorMod extends js.Object {
  def fromEvent(evt: Event_): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}

