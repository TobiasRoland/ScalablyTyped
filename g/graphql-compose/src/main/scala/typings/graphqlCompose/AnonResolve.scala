package typings.graphqlCompose

import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResolve[TSource, TContext, TArgs] extends js.Object {
  @JSName("resolve")
  var resolve_Original: GraphQLFieldResolver[TSource, TContext, TArgs] = js.native
  def resolve(source: TSource, args: TArgs, context: TContext, info: GraphQLResolveInfo): js.Any = js.native
}

