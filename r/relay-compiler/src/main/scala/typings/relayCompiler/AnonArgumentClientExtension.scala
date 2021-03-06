package typings.relayCompiler

import typings.relayCompiler.graphQLIRMod.Argument
import typings.relayCompiler.graphQLIRMod.ClientExtension
import typings.relayCompiler.graphQLIRMod.Condition
import typings.relayCompiler.graphQLIRMod.Connection
import typings.relayCompiler.graphQLIRMod.ConnectionField
import typings.relayCompiler.graphQLIRMod.Defer
import typings.relayCompiler.graphQLIRMod.Directive
import typings.relayCompiler.graphQLIRMod.Fragment
import typings.relayCompiler.graphQLIRMod.FragmentSpread
import typings.relayCompiler.graphQLIRMod.InlineDataFragmentSpread
import typings.relayCompiler.graphQLIRMod.InlineFragment
import typings.relayCompiler.graphQLIRMod.LinkedField
import typings.relayCompiler.graphQLIRMod.Literal
import typings.relayCompiler.graphQLIRMod.LocalArgumentDefinition
import typings.relayCompiler.graphQLIRMod.ModuleImport
import typings.relayCompiler.graphQLIRMod.Request
import typings.relayCompiler.graphQLIRMod.Root
import typings.relayCompiler.graphQLIRMod.RootArgumentDefinition
import typings.relayCompiler.graphQLIRMod.ScalarField
import typings.relayCompiler.graphQLIRMod.SplitOperation
import typings.relayCompiler.graphQLIRMod.Stream
import typings.relayCompiler.graphQLIRMod.Variable
import typings.relayCompiler.graphQLIRVisitorMod.NodeVisitorObject
import typings.relayCompiler.graphQLIRVisitorMod.VisitFn
import typings.relayCompiler.graphQLIRVisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgumentClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typings.relayCompiler.graphQLIRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Condition]] = js.undefined
  var Connection: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Connection]] = js.undefined
  var ConnectionField: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.ConnectionField]] = js.undefined
  var Defer: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.FragmentSpread]] = js.undefined
  var InlineDataFragmentSpread: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.InlineDataFragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Request]] = js.undefined
  var Root: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[NodeVisitorObject[typings.relayCompiler.graphQLIRMod.Variable]] = js.undefined
}

object AnonArgumentClientExtension {
  @scala.inline
  def apply(
    Argument: NodeVisitorObject[Argument] = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any = null,
    Condition: NodeVisitorObject[Condition] = null,
    Connection: NodeVisitorObject[Connection] = null,
    ConnectionField: NodeVisitorObject[ConnectionField] = null,
    Defer: NodeVisitorObject[Defer] = null,
    Directive: NodeVisitorObject[Directive] = null,
    Fragment: NodeVisitorObject[Fragment] = null,
    FragmentSpread: NodeVisitorObject[FragmentSpread] = null,
    InlineDataFragmentSpread: NodeVisitorObject[InlineDataFragmentSpread] = null,
    InlineFragment: NodeVisitorObject[InlineFragment] = null,
    LinkedField: NodeVisitorObject[LinkedField] = null,
    Literal: NodeVisitorObject[Literal] = null,
    LocalArgumentDefinition: NodeVisitorObject[LocalArgumentDefinition] = null,
    ModuleImport: NodeVisitorObject[ModuleImport] = null,
    Request: NodeVisitorObject[Request] = null,
    Root: NodeVisitorObject[Root] = null,
    RootArgumentDefinition: NodeVisitorObject[RootArgumentDefinition] = null,
    ScalarField: NodeVisitorObject[ScalarField] = null,
    SplitOperation: NodeVisitorObject[SplitOperation] = null,
    Stream: NodeVisitorObject[Stream] = null,
    Variable: NodeVisitorObject[Variable] = null
  ): AnonArgumentClientExtension = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument.asInstanceOf[js.Any])
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5(ClientExtension))
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Connection != null) __obj.updateDynamic("Connection")(Connection.asInstanceOf[js.Any])
    if (ConnectionField != null) __obj.updateDynamic("ConnectionField")(ConnectionField.asInstanceOf[js.Any])
    if (Defer != null) __obj.updateDynamic("Defer")(Defer.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(FragmentSpread.asInstanceOf[js.Any])
    if (InlineDataFragmentSpread != null) __obj.updateDynamic("InlineDataFragmentSpread")(InlineDataFragmentSpread.asInstanceOf[js.Any])
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(InlineFragment.asInstanceOf[js.Any])
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(LinkedField.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(LocalArgumentDefinition.asInstanceOf[js.Any])
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(ModuleImport.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(RootArgumentDefinition.asInstanceOf[js.Any])
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(ScalarField.asInstanceOf[js.Any])
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(SplitOperation.asInstanceOf[js.Any])
    if (Stream != null) __obj.updateDynamic("Stream")(Stream.asInstanceOf[js.Any])
    if (Variable != null) __obj.updateDynamic("Variable")(Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgumentClientExtension]
  }
}

