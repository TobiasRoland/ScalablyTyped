package typings.coffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ typings.coffeeify.mod.ParseError, 
    /* compiled */ java.lang.String, 
    scala.Unit
  ]
}
