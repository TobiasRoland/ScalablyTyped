package typings.sharedb.mod.middleware

import typings.sharedb.agentMod.^
import typings.sharedb.mod.sharedb
import typings.sharedb.sharedbMod.Op
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpContext extends BaseContext {
  var collection: String
  var id: String
  var op: Op
}

object OpContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    collection: String,
    id: String,
    op: Op
  ): OpContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpContext]
  }
}

