package typings.apolloClient

import typings.apolloClient.typesMod.OperationVariables
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientQuery extends js.Object {
  var clientQuery: DocumentNode | Null
  var defaultVars: OperationVariables
  var document: DocumentNode
  var hasClientExports: Boolean
  var hasForcedResolvers: Boolean
  var serverQuery: DocumentNode | Null
}

object AnonClientQuery {
  @scala.inline
  def apply(
    defaultVars: OperationVariables,
    document: DocumentNode,
    hasClientExports: Boolean,
    hasForcedResolvers: Boolean,
    clientQuery: DocumentNode = null,
    serverQuery: DocumentNode = null
  ): AnonClientQuery = {
    val __obj = js.Dynamic.literal(defaultVars = defaultVars.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], hasClientExports = hasClientExports.asInstanceOf[js.Any], hasForcedResolvers = hasForcedResolvers.asInstanceOf[js.Any])
    if (clientQuery != null) __obj.updateDynamic("clientQuery")(clientQuery.asInstanceOf[js.Any])
    if (serverQuery != null) __obj.updateDynamic("serverQuery")(serverQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientQuery]
  }
}

