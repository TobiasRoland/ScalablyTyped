package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AMaOnFalsePredicateRefinement[E, F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  def apply[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* ma */ fpDashTsLib.es6HKTMod.Kind2[F, E, A], 
    fpDashTsLib.es6HKTMod.Kind2[F, E, A]
  ] = js.native
}

