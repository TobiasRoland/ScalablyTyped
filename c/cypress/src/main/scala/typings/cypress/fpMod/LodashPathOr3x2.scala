package typings.cypress.fpMod

import typings.cypress.lodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr3x2[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] extends js.Object {
  def apply(defaultValue: __): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TDefault](defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

