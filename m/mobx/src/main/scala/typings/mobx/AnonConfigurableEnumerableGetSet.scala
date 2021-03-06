package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfigurableEnumerableGetSet extends js.Object {
  var configurable: Boolean
  var enumerable: Boolean
  def get(): js.UndefOr[scala.Nothing]
  def set(v: js.Any): Unit
}

object AnonConfigurableEnumerableGetSet {
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    get: () => js.UndefOr[scala.Nothing],
    set: js.Any => Unit
  ): AnonConfigurableEnumerableGetSet = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[AnonConfigurableEnumerableGetSet]
  }
}

