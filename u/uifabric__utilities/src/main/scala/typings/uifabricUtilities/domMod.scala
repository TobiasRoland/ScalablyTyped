package typings.uifabricUtilities

import typings.std.Document_
import typings.std.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.Window_
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.ivirtualelementMod.IVirtualElement
import typings.uifabricUtilities.uifabricUtilitiesStrings.`data-portal-element`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  val DATA_PORTAL_ATTRIBUTE: `data-portal-element` = js.native
  def elementContains(): Boolean = js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = js.native
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def getChildren(parent: HTMLElement): js.Array[HTMLElement] = js.native
  def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = js.native
  def getDocument(): js.UndefOr[Document_] = js.native
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document_] = js.native
  def getParent(child: HTMLElement): HTMLElement | Null = js.native
  def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = js.native
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window_): js.UndefOr[IRectangle] = js.native
  def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = js.native
  def getWindow(): js.UndefOr[Window_] = js.native
  def getWindow(rootElement: Element): js.UndefOr[Window_] = js.native
  def isVirtualElement(element: HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def isVirtualElement(element: IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window_, eventName: String, callback: js.Function1[/* ev */ Event_, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Window_,
    eventName: String,
    callback: js.Function1[/* ev */ Event_, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def portalContainsElement(target: HTMLElement): Boolean = js.native
  def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = js.native
  def raiseClick(target: Element): Unit = js.native
  def setPortalAttribute(element: HTMLElement): Unit = js.native
  def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = js.native
}

