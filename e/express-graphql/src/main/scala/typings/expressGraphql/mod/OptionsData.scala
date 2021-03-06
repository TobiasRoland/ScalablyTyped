package typings.expressGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.executeMod.ExecutionArgs
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.maybeMod.Maybe
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.Source
import typings.graphql.mod.ValidationContext
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphql.validationContextMod.ValidationRule
import typings.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsData extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * An optional function which will be used to execute instead of default `execute`
    * from `graphql-js`.
    */
  var customExecuteFn: js.UndefOr[
    (js.Function1[/* args */ ExecutionArgs, js.Promise[ExecutionResult[ExecutionResultDataDefault]]]) | Null
  ] = js.undefined
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var customFormatErrorFn: js.UndefOr[(js.Function1[/* error */ GraphQLError, _]) | Null] = js.undefined
  /**
    * An optional function which will be used to create a document instead of
    * the default `parse` from `graphql-js`.
    */
  var customParseFn: js.UndefOr[js.Function1[/* source */ Source, DocumentNode | Null]] = js.undefined
  /**
    * An optional function which will be used to validate instead of default `validate`
    * from `graphql-js`.
    */
  var customValidateFn: js.UndefOr[
    (js.Function3[
      /* schema */ GraphQLSchema, 
      /* documentAST */ DocumentNode, 
      /* rules */ js.Array[ValidationRule], 
      js.Array[GraphQLError]
    ]) | Null
  ] = js.undefined
  /**
    * An optional function for adding additional metadata to the GraphQL response
    * as a key-value object. The result will be added to "extensions" field in
    * the resulting JSON. This is often a useful place to add development time
    * info such as the runtime of a query or the amount of resources consumed.
    *
    * Information about the request is provided to be used.
    *
    * This function may be async.
    */
  var extensions: js.UndefOr[(js.Function1[/* info */ RequestInfo, StringDictionary[_]]) | Null] = js.undefined
  /**
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  /**
    * `formatError` is deprecated and replaced by `customFormatErrorFn`. It will
    *  be removed in version 1.0.0.
    */
  var formatError: js.UndefOr[(js.Function1[/* error */ GraphQLError, _]) | Null] = js.undefined
  /**
    * A boolean to optionally enable GraphiQL mode.
    */
  var graphiql: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * A boolean to configure whether the output should be pretty-printed.
    */
  var pretty: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * An object to pass as the rootValue to the graphql() function.
    */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /**
    * A GraphQL schema from graphql-js.
    */
  var schema: GraphQLSchema
  /**
    * A type resolver function to use when none is provided by the schema.
    * If not provided, the default type resolver is used (which looks for a
    * `__typename` field or alternatively calls the `isTypeOf` method).
    */
  var typeResolver: js.UndefOr[(GraphQLTypeResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  /**
    * An optional array of validation rules that will be applied on the document
    * in additional to those defined by the GraphQL spec.
    */
  var validationRules: js.UndefOr[(js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]]) | Null] = js.undefined
}

object OptionsData {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    context: js.Any = null,
    customExecuteFn: /* args */ ExecutionArgs => js.Promise[ExecutionResult[ExecutionResultDataDefault]] = null,
    customFormatErrorFn: /* error */ GraphQLError => _ = null,
    customParseFn: /* source */ Source => DocumentNode | Null = null,
    customValidateFn: (/* schema */ GraphQLSchema, /* documentAST */ DocumentNode, /* rules */ js.Array[ValidationRule]) => js.Array[GraphQLError] = null,
    extensions: /* info */ RequestInfo => StringDictionary[_] = null,
    fieldResolver: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null,
    formatError: /* error */ GraphQLError => _ = null,
    graphiql: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Any = null,
    typeResolver: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]] = null,
    validationRules: js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]] = null
  ): OptionsData = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (customExecuteFn != null) __obj.updateDynamic("customExecuteFn")(js.Any.fromFunction1(customExecuteFn))
    if (customFormatErrorFn != null) __obj.updateDynamic("customFormatErrorFn")(js.Any.fromFunction1(customFormatErrorFn))
    if (customParseFn != null) __obj.updateDynamic("customParseFn")(js.Any.fromFunction1(customParseFn))
    if (customValidateFn != null) __obj.updateDynamic("customValidateFn")(js.Any.fromFunction3(customValidateFn))
    if (extensions != null) __obj.updateDynamic("extensions")(js.Any.fromFunction1(extensions))
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (typeResolver != null) __obj.updateDynamic("typeResolver")(js.Any.fromFunction4(typeResolver))
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsData]
  }
}

