package typings
package fpDashTsLib.es6ContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def contramap[A, B](fa: fpDashTsLib.es6HKTMod.Kind2[F, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Contravariant2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    contramap: (fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Contravariant2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant2C[F, L]]
  }
}

