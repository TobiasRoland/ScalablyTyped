package typings.simplSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.RegExp
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simpl-schema", JSImport.Default)
@js.native
class defaultCls protected () extends SimpleSchema {
  def this(schema: js.Array[_]) = this()
  def this(schema: StringDictionary[
        SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | RegExp | SimpleSchema
      ]) = this()
  def this(schema: js.Array[_], options: SimpleSchemaOptions) = this()
  def this(
    schema: StringDictionary[
        SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | RegExp | SimpleSchema
      ],
    options: SimpleSchemaOptions
  ) = this()
}

