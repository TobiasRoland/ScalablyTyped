package typings.mithril.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mithril.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hyperscript extends js.Object {
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, attributes: Attributes, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply(selector: String, children: Children*): Vnode[_, _] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](component: ComponentTypes[Attrs, State], args: Children*): Vnode[Attrs, State] = js.native
  /** Creates a virtual element (Vnode). */
  def apply[Attrs, State](
    component: ComponentTypes[Attrs, State],
    attributes: Attrs with (Lifecycle[Attrs, State]) with AnonKey,
    args: Children*
  ): Vnode[Attrs, State] = js.native
  /** Creates a fragment virtual element (Vnode). */
  def fragment(attrs: (Lifecycle[_, _]) with StringDictionary[js.Any], children: ChildArrayOrPrimitive): Vnode[_, _] = js.native
  /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
  def trust(html: String): Vnode[_, _] = js.native
}

