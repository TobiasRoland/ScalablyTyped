package typings.lodash.fpMod

import typings.lodash.mod.Function1
import typings.lodash.mod.Function2
import typings.lodash.mod.Function3
import typings.lodash.mod.Function4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartial10x2[T2, T3] extends js.Object {
  def apply[T1, R](func: Function3[T1, T2, T3, R]): Function1[T1, R] = js.native
  def apply[T1, T4, R](func: Function4[T1, T2, T3, T4, R]): Function2[T1, T4, R] = js.native
}

