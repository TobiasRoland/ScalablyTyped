package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsonMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date
  import typings.std.Uint8Array

  type EJSON = EJSONable
  type EJSONable = StringDictionary[EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Date | Uint8Array | EJSONableCustomType | Null
  ]
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
}
