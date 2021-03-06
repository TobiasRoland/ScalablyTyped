package typings.deepDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deep-diff", "diff")
@js.native
object diff extends js.Object {
  def apply[LHS, RHS](lhs: LHS, rhs: RHS): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS]): js.UndefOr[js.Array[Diff_[LHS, RHS]]] = js.native
  def apply[LHS, RHS](lhs: LHS, rhs: RHS, prefilter: PreFilter[LHS, RHS], acc: Accumulator[LHS, RHS]): Accumulator[LHS, RHS] = js.native
}

