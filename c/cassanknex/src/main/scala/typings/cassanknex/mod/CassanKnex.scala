package typings.cassanknex.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CassanKnex extends EventEmitter {
  def apply(): QueryBuilderRoot = js.native
  def apply(keyspace: String): QueryBuilderRoot = js.native
}

