package typings.uirouterCore.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.Obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common", "pluck")
@js.native
object pluck extends js.Object {
  def apply(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = js.native
  def apply[T](collection: js.Array[Obj], propName: String): js.Array[T] = js.native
}

