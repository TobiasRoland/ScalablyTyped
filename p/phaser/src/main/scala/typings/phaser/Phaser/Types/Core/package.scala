package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Core {
  type BootCallback = js.Function1[/* game */ typings.phaser.Phaser.Game, scala.Unit]
  /**
    * This callback type is completely empty, a no-operation.
    */
  type NOOP = js.Function0[scala.Unit]
  type TimeStepCallback = js.Function3[
    /* time */ scala.Double, 
    /* average */ scala.Double, 
    /* interpolation */ scala.Double, 
    scala.Unit
  ]
}
