package typings.graphqlCompose.interfaceTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeInterfaceTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var fields: js.UndefOr[Thunk[ComposeFieldConfigMap[TSource, TContext]]] = js.undefined
  var name: String
  var resolveType: js.UndefOr[(GraphQLTypeResolver[TSource, TContext, StringDictionary[_]]) | Null] = js.undefined
}

object ComposeInterfaceTypeConfig {
  @scala.inline
  def apply[TSource, TContext](
    name: String,
    description: String = null,
    extensions: Extensions = null,
    fields: Thunk[ComposeFieldConfigMap[TSource, TContext]] = null,
    resolveType: (TSource, TContext, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, StringDictionary[_]]) | String]] = null
  ): ComposeInterfaceTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (resolveType != null) __obj.updateDynamic("resolveType")(js.Any.fromFunction4(resolveType))
    __obj.asInstanceOf[ComposeInterfaceTypeConfig[TSource, TContext]]
  }
}

