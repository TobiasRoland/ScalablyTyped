package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndex[F, I]
  extends fpDashTsLib.libFoldable2vMod.Foldable2v[F] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): B
  def reduceWithIndex[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): B
}

object FoldableWithIndex {
  @scala.inline
  def apply[F, I](
    URI: F,
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.libHKTMod.HKT[F, _], 
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndex[F, I]]
  }
}

