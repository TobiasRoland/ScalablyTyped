package typings.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[typings.hapi.mod.Request], 
    /* h */ js.UndefOr[typings.hapi.mod.ResponseToolkit], 
    scala.Boolean
  ]
}
