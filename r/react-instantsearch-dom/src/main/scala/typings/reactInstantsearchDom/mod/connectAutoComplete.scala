package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.StatelessComponent
import typings.reactInstantsearchCore.mod.AutocompleteExposed
import typings.reactInstantsearchCore.mod.AutocompleteProvided
import typings.reactInstantsearchCore.mod.ConnectedComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectAutoComplete")
@js.native
object connectAutoComplete extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ComponentClass[AutocompleteExposed, ComponentState] = js.native
  def apply[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = js.native
}

