package typings.ionicCliFramework.outputMod

import typings.ionicCliFramework.colorsMod.Colors
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamOutputStrategyOptions extends js.Object {
  val colors: js.UndefOr[Colors] = js.undefined
  val stream: WritableStream
}

object StreamOutputStrategyOptions {
  @scala.inline
  def apply(stream: WritableStream, colors: Colors = null): StreamOutputStrategyOptions = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamOutputStrategyOptions]
  }
}

