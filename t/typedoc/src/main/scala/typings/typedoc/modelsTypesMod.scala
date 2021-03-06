package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
@js.native
object modelsTypesMod extends js.Object {
  @js.native
  class ArrayType protected ()
    extends typings.typedoc.typesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @js.native
  class ConditionalType protected ()
    extends typings.typedoc.typesConditionalMod.ConditionalType {
    def this(
      checkType: typings.typedoc.typesAbstractMod.Type,
      extendsType: typings.typedoc.typesAbstractMod.Type,
      trueType: typings.typedoc.typesAbstractMod.Type,
      falseType: typings.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @js.native
  class IndexedAccessType protected ()
    extends typings.typedoc.typesIndexedAccessMod.IndexedAccessType {
    def this(objectType: Type, indexType: Type) = this()
  }
  
  @js.native
  class InferredType protected ()
    extends typings.typedoc.typesInferredMod.InferredType {
    def this(name: String) = this()
  }
  
  @js.native
  class IntersectionType protected ()
    extends typings.typedoc.intersectionMod.IntersectionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class IntrinsicType protected ()
    extends typings.typedoc.typesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @js.native
  class PredicateType protected ()
    extends typings.typedoc.typesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class ReferenceType protected ()
    extends typings.typedoc.modelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolID: Double) = this()
    def this(name: String, symbolID: Double, reflection: Reflection) = this()
  }
  
  @js.native
  class ReflectionType protected ()
    extends typings.typedoc.reflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @js.native
  class StringLiteralType protected ()
    extends typings.typedoc.typesStringLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @js.native
  class TupleType protected ()
    extends typings.typedoc.typesTupleMod.TupleType {
    def this(elements: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  abstract class Type ()
    extends typings.typedoc.typesAbstractMod.Type
  
  @js.native
  class TypeOperatorType protected ()
    extends typings.typedoc.typesTypeOperatorMod.TypeOperatorType {
    def this(target: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @js.native
  class TypeParameterType protected ()
    extends typings.typedoc.modelsTypesTypeParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @js.native
  class UnionType protected ()
    extends typings.typedoc.unionMod.UnionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @js.native
  class UnknownType protected ()
    extends typings.typedoc.typesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_ID_RESOLVED: Double = js.native
    var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    def isTypeListSimilar(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
}

