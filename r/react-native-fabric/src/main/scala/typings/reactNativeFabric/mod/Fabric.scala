package typings.reactNativeFabric.mod

import typings.reactNativeFabric.AnonAttributes
import typings.reactNativeFabric.AnonCrash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fabric extends js.Object {
  /**
    * API for interacting with the Answers kit.
    *
    * https://docs.fabric.io/ios/answers/index.html
    */
  var Answers: AnonAttributes
  /**
    * API for interacting with the Crashlytics kit.
    *
    * https://docs.fabric.io/ios/crashlytics/index.html
    */        
  var Crashlytics: AnonCrash
}

object Fabric {
  @scala.inline
  def apply(Answers: AnonAttributes, Crashlytics: AnonCrash): Fabric = {
    val __obj = js.Dynamic.literal(Answers = Answers.asInstanceOf[js.Any], Crashlytics = Crashlytics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Fabric]
  }
}

