package typings.typedoc

import typings.typedoc.modelsMod.UnknownType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/unknown", JSImport.Namespace)
@js.native
object serializersTypesUnknownMod extends js.Object {
  @js.native
  class UnknownTypeSerializer () extends TypeSerializerComponent[UnknownType]
  
}

