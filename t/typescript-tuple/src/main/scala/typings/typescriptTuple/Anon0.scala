package typings.typescriptTuple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[Shortest, TupleSet /* <: js.Array[js.Array[_]] */] extends js.Object {
  var empty: Shortest
  var nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
}

object Anon0 {
  @scala.inline
  def apply[Shortest, TupleSet /* <: js.Array[js.Array[_]] */](
    empty: Shortest,
    nonEmpty: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.typescript-tuple/lib/utils.SortTwoTuple<Shortest, any, [Shortest, any]>[0] */ js.Any
  ): Anon0[Shortest, TupleSet] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0[Shortest, TupleSet]]
  }
}

