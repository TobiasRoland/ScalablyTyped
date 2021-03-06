package typings.sharedb.mod

import typings.sharedb.AnonResults
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "Connection")
@js.native
class Connection protected () extends js.Object {
  def this(ws: WebSocket) = this()
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: AnonResults,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typings.sharedb.sharedbMod.Query = js.native
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: AnonResults,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): typings.sharedb.sharedbMod.Query = js.native
  def get(collectionName: String, documentID: String): typings.sharedb.sharedbMod.Doc = js.native
}

