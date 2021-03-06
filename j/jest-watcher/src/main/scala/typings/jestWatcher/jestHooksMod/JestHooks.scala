package typings.jestWatcher.jestHooksMod

import typings.jestWatcher.typesMod.JestHookEmitter
import typings.jestWatcher.typesMod.JestHookSubscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestHooks extends js.Object {
  var _emitter: js.Any
  var _listeners: js.Any
  var _subscriber: js.Any
  def getEmitter(): JestHookEmitter
  def getSubscriber(): JestHookSubscriber
  def isUsed(hook: AvailableHooks): Double
}

object JestHooks {
  @scala.inline
  def apply(
    _emitter: js.Any,
    _listeners: js.Any,
    _subscriber: js.Any,
    getEmitter: () => JestHookEmitter,
    getSubscriber: () => JestHookSubscriber,
    isUsed: AvailableHooks => Double
  ): JestHooks = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any], getEmitter = js.Any.fromFunction0(getEmitter), getSubscriber = js.Any.fromFunction0(getSubscriber), isUsed = js.Any.fromFunction1(isUsed))
  
    __obj.asInstanceOf[JestHooks]
  }
}

