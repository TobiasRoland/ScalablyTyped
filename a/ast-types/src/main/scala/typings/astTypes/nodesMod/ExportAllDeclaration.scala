package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportAllDeclaration extends ASTNode {
  var exported: IdentifierKind | Null
  var source: LiteralKind
  var `type`: typings.astTypes.astTypesStrings.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    source: LiteralKind,
    `type`: typings.astTypes.astTypesStrings.ExportAllDeclaration,
    exported: IdentifierKind = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exported != null) __obj.updateDynamic("exported")(exported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

