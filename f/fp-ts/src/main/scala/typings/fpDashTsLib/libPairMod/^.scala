package typings
package fpDashTsLib.libPairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Pair", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Pair = js.native
  val pair: fpDashTsLib.libApplicativeMod.Applicative1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] = js.native
  def getEq[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Pair[A]] = js.native
  def getMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Pair[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[Pair[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Pair[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Pair[A]] = js.native
  def getShow[L, A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[Pair[A]] = js.native
}

