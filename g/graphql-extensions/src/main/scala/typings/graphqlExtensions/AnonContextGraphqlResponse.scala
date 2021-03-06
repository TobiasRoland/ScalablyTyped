package typings.graphqlExtensions

import typings.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextGraphqlResponse[TContext] extends js.Object {
  var context: TContext
  var graphqlResponse: GraphQLResponse
}

object AnonContextGraphqlResponse {
  @scala.inline
  def apply[TContext](context: TContext, graphqlResponse: GraphQLResponse): AnonContextGraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContextGraphqlResponse[TContext]]
  }
}

