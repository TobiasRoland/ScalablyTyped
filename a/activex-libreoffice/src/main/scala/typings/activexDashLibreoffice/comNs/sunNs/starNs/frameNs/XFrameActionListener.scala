package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be provided if an object wants to receive events when several things happen to components within frames of the desktop frame tree.
  *
  * E.g., you can receive events of instantiation/destruction and activation/deactivation of components.
  * @see XFrame.addFrameActionListener()
  * @see XFrame.removeFrameActionListener()
  */
trait XFrameActionListener extends XEventListener {
  /**
    * is called whenever any action occurs to a component within a frame.
    * @param Action describes the detected frame action for which the listener can react
    */
  def frameAction(Action: FrameActionEvent): Unit
}

object XFrameActionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    frameAction: FrameActionEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFrameActionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), frameAction = js.Any.fromFunction1(frameAction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFrameActionListener]
  }
}

