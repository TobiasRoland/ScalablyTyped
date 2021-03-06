package typings.entriaRelayExperimental

import org.scalablytyped.runtime.StringDictionary
import typings.entriaRelayExperimental.relayEnvironmentProviderMod.Props
import typings.entriaRelayExperimental.useFragmentMod.NonNullableArrayFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NonNullableFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NullableArrayFragmentReturn
import typings.entriaRelayExperimental.useFragmentMod.NullableFragmentReturn
import typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.ReturnTypePaginationFragment
import typings.entriaRelayExperimental.useRefetchableFragmentMod.ReturnTypeRefetchableFragment
import typings.react.mod._Global_.JSX.Element
import typings.relayRuntime.mod.Observable
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def RelayEnvironmentProvider(props: Props): Element = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonNetworkCacheConfig
  ): Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  def useFragment[TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_ArrayStringDictionaryWildcard_NonNullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableArrayFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_StringDictionaryAny_NonNullableFragmentReturn[TKey /* <: StringDictionary[js.Any] */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NonNullableFragmentReturn[TKey] = js.native
  @JSName("useFragment")
  def useFragment_TKey_UnionArrayStringDictionaryWildcardNull_NullableArrayFragmentReturn[TKey /* <: js.Array[StringDictionary[_]] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): NullableArrayFragmentReturn[TKey] = js.native
  def useLegacyPaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def usePaginationFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, parentFragmentRef: TKey): // tslint:disable-next-line no-unnecessary-generics
  ReturnTypePaginationFragment[
    TQuery, 
    TKey, 
    typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableFragmentReturn[TKey] with typings.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableFragmentReturn[TKey]
  ] = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: AnonFetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: AnonFetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useRefetchableFragment[TQuery /* <: OperationType */, TKey /* <: StringDictionary[js.Any] | Null */](fragmentInput: GraphQLTaggedNode, fragmentRef: TKey): ReturnTypeRefetchableFragment[TQuery, TKey] = js.native
  def useRelayEnvironment(): Environment = js.native
}

