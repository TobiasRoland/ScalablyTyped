package typings.graphqlReact

import typings.graphqlReact.mod.GraphQLOperationStatus
import typings.react.mod.Context
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-react/universal", JSImport.Namespace)
@js.native
object universalMod extends js.Object {
  @js.native
  class GraphQL ()
    extends typings.graphqlReact.mod.GraphQL {
    def this(options: AnonCache) = this()
  }
  
  val GraphQLContext: Context[typings.graphqlReact.mod.GraphQL] = js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  def ssr(grapphql: typings.graphqlReact.mod.GraphQL, node: ReactNode): Unit = js.native
  def ssr(
    grapphql: typings.graphqlReact.mod.GraphQL,
    node: ReactNode,
    render: js.Function1[/* element */ ReactNode, String]
  ): Unit = js.native
  def useGraphQL[T, V](options: AnonFetchOptionsOverrideLoadOnMount[V]): GraphQLOperationStatus[T] = js.native
}

