package typings.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multiSamlStrategyMod {
  type SamlOptionsCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* samlOptions */ js.UndefOr[typings.passportSaml.mod.SamlConfig], 
    scala.Unit
  ]
}
