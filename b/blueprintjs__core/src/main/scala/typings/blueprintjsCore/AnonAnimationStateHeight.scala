package typings.blueprintjsCore

import typings.blueprintjsCore.collapseMod.AnimationStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimationStateHeight extends js.Object {
  var animationState: AnimationStates
  var height: String
}

object AnonAnimationStateHeight {
  @scala.inline
  def apply(animationState: AnimationStates, height: String): AnonAnimationStateHeight = {
    val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimationStateHeight]
  }
}

