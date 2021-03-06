package typings.typedoc

import typings.typedoc.modelsMod.IntrinsicType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/intrinsic", JSImport.Namespace)
@js.native
object serializersTypesIntrinsicMod extends js.Object {
  @js.native
  class IntrinsicTypeSerializer () extends TypeSerializerComponent[IntrinsicType]
  
}

