package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation[P]} */ trait TSTypePredicate
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind {
  var parameterName: IdentifierKind | TSThisTypeKind
  var `type`: typings.astTypes.astTypesStrings.TSTypePredicate
  var typeAnnotation: TSTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypePredicate")
@js.native
object TSTypePredicate extends TopLevel[Type[TSTypePredicate]]

