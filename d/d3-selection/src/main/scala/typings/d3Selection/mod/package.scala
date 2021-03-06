package typings.d3Selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BaseType = typings.std.Element | typings.d3Selection.mod.EnterElement | typings.std.Document_ | typings.std.Window_ | scala.Null
  type ContainerElement = typings.std.HTMLElement | typings.std.SVGSVGElement | typings.std.SVGGElement
  type NamespaceMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SelectionFn = js.Function0[
    typings.d3Selection.mod.Selection_[typings.std.HTMLElement, js.Any, scala.Null, js.UndefOr[scala.Nothing]]
  ]
  type ValueFn[T /* <: typings.d3Selection.mod.BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ scala.Double, 
    /* groups */ js.Array[T] | typings.d3Selection.mod.ArrayLike[T], 
    Result
  ]
}
