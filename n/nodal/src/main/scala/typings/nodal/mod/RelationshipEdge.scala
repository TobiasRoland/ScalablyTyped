package typings.nodal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipEdge")
@js.native
class RelationshipEdge protected () extends js.Object {
  def this(parent: RelationshipNode, child: RelationshipNode, options: IOptions) = this()
  var child: RelationshipNode = js.native
  var id: Double = js.native
  var options: IOptions = js.native
  var parent: RelationshipNode = js.native
  def hasChild(child: RelationshipNode): Boolean = js.native
  def hasParent(parent: RelationshipNode): Boolean = js.native
  def opposite(node: RelationshipNode): RelationshipNode | Null = js.native
}

