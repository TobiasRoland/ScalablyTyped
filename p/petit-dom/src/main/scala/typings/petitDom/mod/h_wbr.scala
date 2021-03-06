package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.wbr
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_wbr extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: wbr): ElementNode[wbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: wbr, children: Content*): ElementNode[wbr, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: wbr, props: Props[E], children: Content*): ElementNode[wbr, E] = js.native
}

