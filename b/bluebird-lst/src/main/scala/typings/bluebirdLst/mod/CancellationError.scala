package typings.bluebirdLst.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
  */
@JSImport("bluebird-lst", "CancellationError")
@js.native
class CancellationError () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

