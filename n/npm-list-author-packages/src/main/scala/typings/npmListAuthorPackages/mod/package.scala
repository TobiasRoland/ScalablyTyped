package typings.npmListAuthorPackages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ js.Array[java.lang.String], 
    scala.Unit
  ]
}
