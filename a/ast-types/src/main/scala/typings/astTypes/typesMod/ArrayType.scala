package typings.astTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends BaseType[T]
     with Type[T] {
  val elemType: Type[_] = js.native
  val kind: typings.astTypes.astTypesStrings.ArrayType = js.native
}

