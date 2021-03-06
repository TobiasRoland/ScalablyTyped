package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.strong
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_strong extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: strong): ElementNode[strong, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: strong, children: Content*): ElementNode[strong, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: strong, props: Props[E], children: Content*): ElementNode[strong, E] = js.native
}

