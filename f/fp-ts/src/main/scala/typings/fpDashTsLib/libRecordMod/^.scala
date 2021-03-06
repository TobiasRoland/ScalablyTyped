package typings
package fpDashTsLib.libRecordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Record", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Record = js.native
  val empty: stdLib.Record[java.lang.String, scala.Nothing] = js.native
  val record: (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[URI, java.lang.String]) with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[URI, java.lang.String]) with fpDashTsLib.libCompactableMod.Compactable1[URI] with (fpDashTsLib.libFilterableWithIndexMod.FilterableWithIndex1[URI, java.lang.String]) with fpDashTsLib.libWitherableMod.Witherable1[URI] with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[URI, java.lang.String]) = js.native
  def collect[A, B](d: stdLib.Record[java.lang.String, A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def collect[A, B](f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): js.Function1[
    /* d */ stdLib.Record[java.lang.String, A], 
    fpDashTsLib.libArrayMod.Global.Array[B]
  ] = js.native
  @JSName("collect")
  def collect_KStringAB[K /* <: java.lang.String */, A, B](d: stdLib.Record[K, A], f: js.Function2[/* k */ K, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  @JSName("collect")
  def collect_KStringAB[K /* <: java.lang.String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* d */ stdLib.Record[K, A], fpDashTsLib.libArrayMod.Global.Array[B]] = js.native
  def compact[A](fa: stdLib.Record[java.lang.String, fpDashTsLib.libOptionMod.Option[A]]): stdLib.Record[java.lang.String, A] = js.native
  def deleteAt[K /* <: java.lang.String */](k: K): js.Function1[
    /* d */ stdLib.Record[java.lang.String, _], 
    stdLib.Record[(stdLib.Exclude[java.lang.String, K]) | java.lang.String, _]
  ] = js.native
  def elem[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function2[/* a */ A, /* fa */ org.scalablytyped.runtime.StringDictionary[A], scala.Boolean] = js.native
  def every[A](
    fa: org.scalablytyped.runtime.StringDictionary[A],
    predicate: js.Function1[/* a */ A, scala.Boolean]
  ): scala.Boolean = js.native
  def filter[A](fa: stdLib.Record[java.lang.String, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): stdLib.Record[java.lang.String, A] = js.native
  def filter[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def filterMap[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterMap[A, B](f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, B]] = js.native
  def filterMapWithIndex[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterMapWithIndex[K /* <: java.lang.String */, A, B](f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]): js.Function1[/* fa */ stdLib.Record[K, A], stdLib.Record[java.lang.String, B]] = js.native
  @JSName("filterMapWithIndex")
  def filterMapWithIndex_KStringAB[K /* <: java.lang.String */, A, B](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterMapWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  @JSName("filterMapWithKey")
  def filterMapWithKey_KStringAB[K /* <: java.lang.String */, A, B](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterWithIndex[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): stdLib.Record[java.lang.String, A] = js.native
  def filterWithIndex[K /* <: java.lang.String */, A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[K, A]): js.Function1[/* fa */ stdLib.Record[K, A], stdLib.Record[java.lang.String, A]] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_KStringABA[K /* <: java.lang.String */, A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[K, A, B]): js.Function1[/* fa */ stdLib.Record[K, A], stdLib.Record[java.lang.String, B]] = js.native
  def filterWithKey[A](
    fa: stdLib.Record[java.lang.String, A],
    predicate: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filterWithKey")
  def filterWithKey_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], predicate: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: stdLib.Record[java.lang.String, A], refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): stdLib.Record[java.lang.String, B] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, B]] = js.native
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): fpDashTsLib.Fn_A[M] = js.native
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function1[
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, M], 
    js.Function1[/* fa */ stdLib.Record[java.lang.String, _], M]
  ] = js.native
  def foldMapWithKey[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, M], 
    M
  ] = js.native
  def foldr[A, B](fa: stdLib.Record[java.lang.String, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B = js.native
  def foldrWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    b: B,
    f: js.Function3[/* k */ java.lang.String, /* a */ A, /* b */ B, B]
  ): B = js.native
  @JSName("foldrWithKey")
  def foldrWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], b: B, f: js.Function3[/* k */ K, /* a */ A, /* b */ B, B]): B = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldableMap[F, B](M: fpDashTsLib.libMagmaMod.Magma[B], F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Const[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Either[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Free[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_IOEither[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_IxIO[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Map[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Reader[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_ReaderTaskEither[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Record[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_State[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Store[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_TaskEither[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_These[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Traced[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Tuple[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Validation[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldableMap")
  def fromFoldableMap_Writer[B](
    M: fpDashTsLib.libMagmaMod.Magma[B],
    F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]
  ): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _], 
    /* f */ js.Function1[/* a */ js.Any, js.Tuple2[java.lang.String, B]], 
    stdLib.Record[java.lang.String, B]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Const(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Either(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Free(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IOEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_IxIO(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Map(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Reader(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_ReaderTaskEither(F: fpDashTsLib.libFoldableMod.Foldable3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Record(F: fpDashTsLib.libFoldableMod.Foldable1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_State(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Store(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_TaskEither(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_These(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Traced(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Tuple(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Validation(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  @JSName("fromFoldable")
  def fromFoldable_Writer(F: fpDashTsLib.libFoldableMod.Foldable2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, js.Tuple2[java.lang.String, _]], 
    /* onConflict */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[stdLib.Record[java.lang.String, A]] = js.native
  @JSName("getEq")
  def getEq_KStringA[K /* <: java.lang.String */, A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[stdLib.Record[K, A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Record[java.lang.String, A]] = js.native
  @JSName("getMonoid")
  def getMonoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Record[K, A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[stdLib.Record[java.lang.String, A]] = js.native
  def hasOwnProperty[K /* <: java.lang.String */, A](k: K, d: stdLib.Record[K, A]): scala.Boolean = js.native
  def insert[A](k: java.lang.String, a: A, d: stdLib.Record[java.lang.String, A]): stdLib.Record[java.lang.String, A] = js.native
  def insert[KS /* <: java.lang.String */, K /* <: java.lang.String */, A](k: K, a: A, d: stdLib.Record[KS, A]): stdLib.Record[KS | K, A] = js.native
  def insertAt[K /* <: java.lang.String */, A](k: K, a: A): js.Function1[/* r */ stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String | K, A]] = js.native
  def isEmpty[A](d: stdLib.Record[java.lang.String, A]): scala.Boolean = js.native
  def isSubdictionary[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function2[
    /* d1 */ stdLib.Record[java.lang.String, A], 
    /* d2 */ stdLib.Record[java.lang.String, A], 
    scala.Boolean
  ] = js.native
  def isSubrecord[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function2[
    /* d1 */ stdLib.Record[java.lang.String, A], 
    /* d2 */ stdLib.Record[java.lang.String, A], 
    scala.Boolean
  ] = js.native
  def lookup[A](key: java.lang.String, fa: stdLib.Record[java.lang.String, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def map[A, B](fa: stdLib.Record[java.lang.String, A], f: js.Function1[/* a */ A, B]): stdLib.Record[java.lang.String, B] = js.native
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, B]] = js.native
  def mapWithIndex[K /* <: java.lang.String */, A, B](f: js.Function2[/* k */ K, /* a */ A, B]): js.Function1[/* fa */ stdLib.Record[K, A], stdLib.Record[K, B]] = js.native
  def mapWithKey[A, B](fa: stdLib.Record[java.lang.String, A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): stdLib.Record[java.lang.String, B] = js.native
  @JSName("mapWithKey")
  def mapWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], f: js.Function2[/* k */ K, /* a */ A, B]): stdLib.Record[K, B] = js.native
  @JSName("map")
  def map_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], f: js.Function1[/* a */ A, B]): stdLib.Record[K, B] = js.native
  def partition[A](fa: stdLib.Record[java.lang.String, A], predicate: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def partition[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[
    /* fa */ stdLib.Record[java.lang.String, A], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]]
  ] = js.native
  def partitionMap[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionMap[RL, RR, A](f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ stdLib.Record[java.lang.String, A], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]]
  ] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionMapWithIndex[K /* <: java.lang.String */, RL, RR, A](f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]): js.Function1[
    /* fa */ stdLib.Record[K, A], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]]
  ] = js.native
  @JSName("partitionMapWithIndex")
  def partitionMapWithIndex_KStringRLRRA[K /* <: java.lang.String */, RL, RR, A](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionMapWithKey[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  @JSName("partitionMapWithKey")
  def partitionMapWithKey_KStringRLRRA[K /* <: java.lang.String */, RL, RR, A](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionWithIndex[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def partitionWithIndex[K /* <: java.lang.String */, A](predicateWithIndex: fpDashTsLib.libFilterableWithIndexMod.PredicateWithIndex[K, A]): js.Function1[
    /* fa */ stdLib.Record[K, A], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]]
  ] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_KStringABA[K /* <: java.lang.String */, A, B /* <: A */](refinementWithIndex: fpDashTsLib.libFilterableWithIndexMod.RefinementWithIndex[K, A, B]): js.Function1[
    /* fa */ stdLib.Record[K, A], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, B]]
  ] = js.native
  def partitionWithKey[A](
    fa: stdLib.Record[java.lang.String, A],
    predicate: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  @JSName("partitionWithKey")
  def partitionWithKey_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], predicate: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def pop[A](k: java.lang.String): js.Function1[
    /* d */ stdLib.Record[java.lang.String, A], 
    fpDashTsLib.libOptionMod.Option[js.Tuple2[A, stdLib.Record[java.lang.String, A]]]
  ] = js.native
  def pop[A](k: java.lang.String, d: stdLib.Record[java.lang.String, A]): fpDashTsLib.libOptionMod.Option[js.Tuple2[A, stdLib.Record[java.lang.String, A]]] = js.native
  def reduce[A, B](fa: stdLib.Record[java.lang.String, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ stdLib.Record[java.lang.String, A], B] = js.native
  def reduceRightWithIndex[K /* <: java.lang.String */, A, B](b: B, f: js.Function3[/* k */ K, /* a */ A, /* b */ B, B]): js.Function1[/* fa */ stdLib.Record[K, A], B] = js.native
  def reduceWithIndex[K /* <: java.lang.String */, A, B](b: B, f: js.Function3[/* k */ K, /* b */ B, /* a */ A, B]): js.Function1[/* fa */ stdLib.Record[K, A], B] = js.native
  def reduceWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    b: B,
    f: js.Function3[/* k */ java.lang.String, /* b */ B, /* a */ A, B]
  ): B = js.native
  @JSName("reduceWithKey")
  def reduceWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], b: B, f: js.Function3[/* k */ K, /* b */ B, /* a */ A, B]): B = js.native
  def remove[A](k: java.lang.String, d: stdLib.Record[java.lang.String, A]): stdLib.Record[java.lang.String, A] = js.native
  def remove[KS /* <: java.lang.String */, K /* <: java.lang.String */, A](k: K, d: stdLib.Record[KS, A]): stdLib.Record[(stdLib.Exclude[KS, K]) | java.lang.String, A] = js.native
  def separate[RL, RR](fa: stdLib.Record[java.lang.String, fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def sequence[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("sequence")
  def sequence_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("sequence")
  def sequence_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("sequence")
  def sequence_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* ta */ stdLib.Record[
      java.lang.String, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def singleton[K /* <: java.lang.String */, A](k: K, a: A): stdLib.Record[K, A] = js.native
  def size[A](d: stdLib.Record[java.lang.String, A]): scala.Double = js.native
  def some[A](
    fa: org.scalablytyped.runtime.StringDictionary[A],
    predicate: js.Function1[/* a */ A, scala.Boolean]
  ): scala.Boolean = js.native
  def toArray[A](d: stdLib.Record[java.lang.String, A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  @JSName("toArray")
  def toArray_KStringA[K /* <: java.lang.String */, A](d: stdLib.Record[K, A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[K, A]] = js.native
  def toUnfoldable[F](unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[
    /* d */ stdLib.Record[java.lang.String, _], 
    fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  @JSName("toUnfoldable")
  def toUnfoldable_Record(unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* d */ stdLib.Record[java.lang.String, _], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse2v[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        stdLib.Record[java.lang.String, _]
      ]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverse2v")
  def traverse2v_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def traverseWithIndex[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        stdLib.Record[java.lang.String, _]
      ]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("traverseWithIndex")
  def traverseWithIndex_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function1[
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    js.Function1[
      /* ta */ stdLib.Record[java.lang.String, _], 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverseWithKey")
  def traverseWithKey_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[
      /* k */ java.lang.String, 
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, _, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("traverse")
  def traverse_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, _]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("traverse")
  def traverse_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, _]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wilt[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Const, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Either, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Free, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.IOEither, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.IxIO, 
      U, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Map, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Reader, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        fpDashTsLib.libEitherMod.Either[_, _]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind[
      fpDashTsLib.fpDashTsLibStrings.Record, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.State, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Store, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.TaskEither, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.These, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Traced, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Tuple, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Validation, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  @JSName("wilt")
  def wilt_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[
      fpDashTsLib.fpDashTsLibStrings.Writer, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Const]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Const[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Const, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Either]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Either[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Either, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Either, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Free]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Free[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Free, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Free, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.IOEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_IOEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.IOEither, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.IOEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.IxIO]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_IxIO[U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind3[fpDashTsLib.fpDashTsLibStrings.IxIO, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Map]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Map[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Map, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Map, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Reader]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Reader[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Reader, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Reader, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither(F: fpDashTsLib.libApplicativeMod.Applicative3[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        _, 
        _, 
        fpDashTsLib.libOptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      _, 
      _, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_ReaderTaskEither[U, L](
    F: fpDashTsLib.libApplicativeMod.Applicative3C[fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, U, L]
  ): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind3[
        fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
        U, 
        L, 
        fpDashTsLib.libOptionMod.Option[_]
      ]
    ], 
    fpDashTsLib.libHKTMod.Kind3[
      fpDashTsLib.fpDashTsLibStrings.ReaderTaskEither, 
      U, 
      L, 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  @JSName("wither")
  def wither_Record(F: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.fpDashTsLibStrings.Record]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind[fpDashTsLib.fpDashTsLibStrings.Record, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_State(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.State]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_State[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.State, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.State, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Store]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Store[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Store, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Store, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.TaskEither]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_TaskEither[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.TaskEither, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.TaskEither, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_These(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.These]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_These[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.These, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.These, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Traced(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Traced]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Traced[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Traced, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Traced, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Tuple]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Tuple[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Tuple, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Tuple, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Validation]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Validation[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Validation, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Validation, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer(F: fpDashTsLib.libApplicativeMod.Applicative2[fpDashTsLib.fpDashTsLibStrings.Writer]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  @JSName("wither")
  def wither_Writer[L](F: fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Writer, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Kind2[fpDashTsLib.fpDashTsLibStrings.Writer, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
}

