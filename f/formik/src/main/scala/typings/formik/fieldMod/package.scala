package typings.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fieldMod {
  type FieldAttributes[T] = typings.formik.typesMod.GenericFieldHTMLAttributes with typings.formik.fieldMod.FieldConfig with T
}
