package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZipWith extends js.Object {
  def apply[T1](iteratee: __, arrays1: List[T1]): LodashZipWith1x2[T1] = js.native
  def apply[T2](iteratee: __, arrays1: __, arrays2: List[T2]): LodashZipWith1x4[T2] = js.native
  def apply[T1, T2](iteratee: __, arrays1: List[T1], arrays2: List[T2]): LodashZipWith1x6[T1, T2] = js.native
  def apply[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LodashZipWith1x1[T1, T2, TResult] = js.native
  def apply[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult], arrays1: List[T1]): LodashZipWith1x3[T2, TResult] = js.native
  def apply[T1, T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays1: List[T1],
    arrays2: List[T2]
  ): js.Array[TResult] = js.native
  def apply[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult], arrays1: __, arrays2: List[T2]): LodashZipWith1x5[T1, TResult] = js.native
}

