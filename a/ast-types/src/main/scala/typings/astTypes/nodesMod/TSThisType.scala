package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSThisType extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.TSThisType
}

object TSThisType {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.TSThisType): TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSThisType]
  }
}

