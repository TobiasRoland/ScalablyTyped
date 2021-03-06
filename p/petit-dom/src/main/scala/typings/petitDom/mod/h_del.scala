package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.del
import typings.std.HTMLModElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_del extends js.Object {
  def apply[E /* <: HTMLModElement */](`type`: del): ElementNode[del, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: del, children: Content*): ElementNode[del, E] = js.native
  def apply[E /* <: HTMLModElement */](`type`: del, props: Props[E], children: Content*): ElementNode[del, E] = js.native
}

