package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** such listener will be informed if tab's was inserted/removed from an {@link XSimpleTabController} instance or if the properties of a tab was changed. */
trait XTabListener extends XEventListener {
  /** a tab was activated (e.g. by using mouse/keyboard or method {@link XSimpleTabController.activateTab()} */
  def activated(ID: Double): Unit
  /**
    * a tab was changed within it's properties.
    * @param ID the unique ID of the changed tab.
    * @param Properties the current set of properties for this tab.
    */
  def changed(ID: Double, Properties: SeqEquiv[NamedValue]): Unit
  /** a tab was deactivated, because another tab became the new active state. */
  def deactivated(ID: Double): Unit
  /**
    * a new tab was inserted.
    * @param ID this is the unique ID of this new tab.
    */
  def inserted(ID: Double): Unit
  /**
    * a tab was removed.
    * @param ID this was the unique ID of this tab.
    */
  def removed(ID: Double): Unit
}

object XTabListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    activated: Double => Unit,
    changed: (Double, SeqEquiv[NamedValue]) => Unit,
    deactivated: Double => Unit,
    disposing: EventObject => Unit,
    inserted: Double => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removed: Double => Unit
  ): XTabListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), activated = js.Any.fromFunction1(activated), changed = js.Any.fromFunction2(changed), deactivated = js.Any.fromFunction1(deactivated), disposing = js.Any.fromFunction1(disposing), inserted = js.Any.fromFunction1(inserted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removed = js.Any.fromFunction1(removed))
  
    __obj.asInstanceOf[XTabListener]
  }
}

