package typings.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema6Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "computeDefaults")
@js.native
object computeDefaults extends js.Object {
  def apply[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any],
    rawFormData: T
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
}

