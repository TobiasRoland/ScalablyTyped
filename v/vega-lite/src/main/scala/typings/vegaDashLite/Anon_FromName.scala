package typings.vegaDashLite

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromName extends js.Object {
  var from: Anon_Data
  var name: String
  var role: String
  var sort: VgComparator
  var `type`: String
}

object Anon_FromName {
  @scala.inline
  def apply(from: Anon_Data, name: String, role: String, sort: VgComparator, `type`: String): Anon_FromName = {
    val __obj = js.Dynamic.literal(from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FromName]
  }
}

