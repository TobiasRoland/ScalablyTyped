package typings.npmRegistryPackageInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* data */ typings.npmRegistryPackageInfo.mod.Data, 
    scala.Unit
  ]
}
