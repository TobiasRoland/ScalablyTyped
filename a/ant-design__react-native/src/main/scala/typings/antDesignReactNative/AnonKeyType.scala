package typings.antDesignReactNative

import typings.antDesignReactNative.antDesignReactNativeStrings.unmount
import typings.antDesignReactNative.portalHostMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyType extends Operation {
  var key: Double
  var `type`: unmount
}

object AnonKeyType {
  @scala.inline
  def apply(key: Double, `type`: unmount): AnonKeyType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyType]
  }
}

