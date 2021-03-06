package typings.relayCompiler.graphQLIRMod

import typings.graphql.definitionMod.GraphQLInputType
import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argument
  extends IR
     with VisitNode {
  var kind: typings.relayCompiler.relayCompilerStrings.Argument
  var loc: Location
  var metadata: Metadata
  var name: String
  var `type`: js.UndefOr[GraphQLInputType] = js.undefined
  var value: ArgumentValue
}

object Argument {
  @scala.inline
  def apply(
    kind: typings.relayCompiler.relayCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null,
    `type`: GraphQLInputType = null
  ): Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
}

