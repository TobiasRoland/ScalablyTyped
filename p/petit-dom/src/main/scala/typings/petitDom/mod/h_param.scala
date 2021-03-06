package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.param
import typings.std.HTMLParamElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_param extends js.Object {
  def apply[E /* <: HTMLParamElement */](`type`: param): ElementNode[param, E] = js.native
  def apply[E /* <: HTMLParamElement */](`type`: param, children: Content*): ElementNode[param, E] = js.native
  def apply[E /* <: HTMLParamElement */](`type`: param, props: Props[E], children: Content*): ElementNode[param, E] = js.native
}

