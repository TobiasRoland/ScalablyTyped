package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocParametersReadonly
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSIndexSignatureBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def apply(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  def from(params: AnonCommentsLocParametersReadonly): TSIndexSignature = js.native
}

