package typings.jointjs.jointjsMod.VectorizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  var absolute: js.UndefOr[Boolean] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(absolute: js.UndefOr[Boolean] = js.undefined): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    __obj.asInstanceOf[TransformOptions]
  }
}

