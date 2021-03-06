package typings.angularCompiler.publicApiMod

import typings.angularCompiler.AnonDirective
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.r3AstMod.BoundEvent
import typings.angularCompiler.r3AstMod.Reference
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.r3AstMod.TextAttribute
import typings.angularCompiler.r3AstMod.Variable
import typings.angularCompiler.t2ApiMod.DirectiveMeta
import typings.angularCompiler.t2ApiMod.Target
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "R3BoundTarget")
@js.native
class R3BoundTarget[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typings.angularCompiler.srcCompilerMod.R3BoundTarget[DirectiveT] {
  def this(
    target: Target,
    directives: Map[typings.angularCompiler.r3AstMod.Element | Template, js.Array[DirectiveT]],
    bindings: Map[
        BoundAttribute | BoundEvent | TextAttribute, 
        DirectiveT | typings.angularCompiler.r3AstMod.Element | Template
      ],
    references: Map[
        BoundAttribute | BoundEvent | Reference | TextAttribute, 
        AnonDirective[DirectiveT] | typings.angularCompiler.r3AstMod.Element | Template
      ],
    exprTargets: Map[typings.angularCompiler.astMod.AST, Reference | Variable],
    symbols: Map[Reference | Variable, Template],
    nestingLevel: Map[Template, Double],
    usedPipes: Set[String]
  ) = this()
}

