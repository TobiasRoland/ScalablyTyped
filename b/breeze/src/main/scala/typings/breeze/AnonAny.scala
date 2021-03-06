package typings.breeze

import typings.breeze.breeze.MergeStrategySymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAny extends js.Object {
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
  var metadataVersionFn: js.UndefOr[js.Function1[/* any */ js.Any, Unit]] = js.undefined
}

object AnonAny {
  @scala.inline
  def apply(mergeStrategy: MergeStrategySymbol = null, metadataVersionFn: /* any */ js.Any => Unit = null): AnonAny = {
    val __obj = js.Dynamic.literal()
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    if (metadataVersionFn != null) __obj.updateDynamic("metadataVersionFn")(js.Any.fromFunction1(metadataVersionFn))
    __obj.asInstanceOf[AnonAny]
  }
}

