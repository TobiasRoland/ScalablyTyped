package typings.avoscloudSdk.mod.Op

import typings.avoscloudSdk.mod.IBaseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Set extends IBaseObject {
  def value(): js.Any
}

object Set {
  @scala.inline
  def apply(toJSON: () => js.Any, value: () => js.Any): Set = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[Set]
  }
}

