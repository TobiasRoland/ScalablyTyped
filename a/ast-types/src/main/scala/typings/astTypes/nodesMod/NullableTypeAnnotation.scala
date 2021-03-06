package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.FlowTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait NullableTypeAnnotation extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.NullableTypeAnnotation
  var typeAnnotation: FlowTypeKind
}

object NullableTypeAnnotation {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.NullableTypeAnnotation, typeAnnotation: FlowTypeKind): NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableTypeAnnotation]
  }
}

