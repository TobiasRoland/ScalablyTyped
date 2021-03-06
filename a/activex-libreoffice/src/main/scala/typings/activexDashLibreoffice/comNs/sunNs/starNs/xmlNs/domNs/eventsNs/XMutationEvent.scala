package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.XNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMutationEvent extends XEvent {
  val AttrChange: AttrChangeType
  val AttrName: String
  val NewValue: String
  val PrevValue: String
  val RelatedNode: XNode
  def getAttrChange(): AttrChangeType
  def getAttrName(): String
  def getNewValue(): String
  def getPrevValue(): String
  def getRelatedNode(): XNode
  def initMutationEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    relatedNodeArg: XNode,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: AttrChangeType
  ): Unit
}

object XMutationEvent {
  @scala.inline
  def apply(
    AttrChange: AttrChangeType,
    AttrName: String,
    Bubbles: Boolean,
    Cancelable: Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    NewValue: String,
    PrevValue: String,
    RelatedNode: XNode,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    acquire: () => Unit,
    getAttrChange: () => AttrChangeType,
    getAttrName: () => String,
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getNewValue: () => String,
    getPrevValue: () => String,
    getRelatedNode: () => XNode,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMutationEvent: (String, Boolean, Boolean, XNode, String, String, String, AttrChangeType) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XMutationEvent = {
    val __obj = js.Dynamic.literal(AttrChange = AttrChange, AttrName = AttrName, Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, NewValue = NewValue, PrevValue = PrevValue, RelatedNode = RelatedNode, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = js.Any.fromFunction0(acquire), getAttrChange = js.Any.fromFunction0(getAttrChange), getAttrName = js.Any.fromFunction0(getAttrName), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getNewValue = js.Any.fromFunction0(getNewValue), getPrevValue = js.Any.fromFunction0(getPrevValue), getRelatedNode = js.Any.fromFunction0(getRelatedNode), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XMutationEvent]
  }
}

