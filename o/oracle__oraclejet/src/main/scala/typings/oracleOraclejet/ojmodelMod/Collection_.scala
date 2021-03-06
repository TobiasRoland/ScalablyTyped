package typings.oracleOraclejet.ojmodelMod

import typings.oracleOraclejet.AnonAdd
import typings.oracleOraclejet.AnonAddDeferred
import typings.oracleOraclejet.AnonAt
import typings.oracleOraclejet.AnonCollection
import typings.oracleOraclejet.AnonDeferred
import typings.oracleOraclejet.AnonDeferredPropName
import typings.oracleOraclejet.AnonDeferredPropNameSilent
import typings.oracleOraclejet.AnonError
import typings.oracleOraclejet.AnonPropNameSilent
import typings.oracleOraclejet.AnonPropNameSilentAny
import typings.oracleOraclejet.ojmodelMod.Collection.CustomPagingOptionsReturn
import typings.oracleOraclejet.ojmodelMod.Collection.SetRangeLocalPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmodel", "Collection")
@js.native
class Collection_ () extends js.Object {
  def this(models: js.Array[Model]) = this()
  def this(models: js.Array[Model], options: js.Object) = this()
  var changes: js.Array[Double] = js.native
  var comparator: Null | String | (js.Function2[/* param0 */ Model, /* param1 */ js.UndefOr[Model], Double]) = js.native
  var customPagingOptions: (js.Function1[/* response */ js.Object, CustomPagingOptionsReturn | Null]) | Null = js.native
  var customURL: (js.Function3[
    /* param0 */ String, 
    /* param1 */ this.type, 
    /* param2 */ js.Object, 
    String | js.Object | Null
  ]) | Null = js.native
  var fetchSize: Double = js.native
  var hasMore: Boolean = js.native
  var lastFetchCount: Double = js.native
  var lastFetchSize: Double = js.native
  var length: Double = js.native
  var model: js.Object = js.native
  var modelLimit: Double = js.native
  var models: js.Array[Model] = js.native
  var offset: Double = js.native
  var omitLanguageHeader: Boolean = js.native
  var sortDirection: Double = js.native
  var totalResults: Double = js.native
  var url: Null | String | js.Function0[String] = js.native
  def abort(): js.Promise[Null] = js.native
  def add(m: js.Array[Model | js.Object]): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Array[Model | js.Object], options: AnonAt): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Object, options: AnonAt): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: Model): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: Model, options: AnonAt): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def any(iterator: js.Function1[/* param0 */ js.Object, Unit]): Boolean = js.native
  def any(iterator: js.Function1[/* param0 */ js.Object, Unit], context: js.Object): Boolean = js.native
  def at(index: Double): Model | js.Promise[Model] | Null = js.native
  def at(index: Double, options: AnonDeferred): Model | js.Promise[Model] | Null = js.native
  def contains(model: js.Object): Boolean | js.Promise[Boolean] = js.native
  def contains(model: js.Object, options: js.Object): Boolean | js.Promise[Boolean] = js.native
  def create(): Model | Boolean | js.Promise[Model] = js.native
  def create(attributes: js.Object): Model | Boolean | js.Promise[Model] = js.native
  def create(attributes: js.Object, options: AnonAt): Model | Boolean | js.Promise[Model] = js.native
  def difference(var_args: js.Array[Model]*): js.Array[Model] = js.native
  def each(iterator: js.Function1[/* param0 */ Model, Unit]): js.UndefOr[scala.Nothing] = js.native
  def each(iterator: js.Function1[/* param0 */ Model, Unit], context: js.Object): js.UndefOr[scala.Nothing] = js.native
  def fetch(): js.Object = js.native
  def fetch(options: AnonAdd): js.Object = js.native
  def filter(iterator: js.Function1[/* param0 */ Model, Unit]): js.Array[Model] = js.native
  def filter(iterator: js.Function1[/* param0 */ Model, Unit], context: js.Object): js.Array[Model] = js.native
  def findWhere(attrs: js.Array[js.Object]): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Array[js.Object], options: AnonDeferredPropName): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Object): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Object, options: AnonDeferredPropName): Model | js.Promise[Model] = js.native
  def first(): js.Array[Model] | Null | js.Promise[_] = js.native
  def first(n: Double): js.Array[Model] | Null | js.Promise[_] = js.native
  def first(n: Double, options: js.Object): js.Array[Model] | Null | js.Promise[_] = js.native
  def get(id: String): Model | Null | js.Promise[Model] = js.native
  def get(id: String, options: js.Object): Model | Null | js.Promise[Model] = js.native
  def get(id: js.Object): Model | Null | js.Promise[Model] = js.native
  def get(id: js.Object, options: js.Object): Model | Null | js.Promise[Model] = js.native
  def getByCid(clientId: String): Model | Null = js.native
  def groupBy(iterator: String): js.Object = js.native
  def groupBy(iterator: String, context: js.Object): js.Object = js.native
  def groupBy(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Object = js.native
  def groupBy(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Object = js.native
  def include(model: js.Object): Boolean | js.Promise[Boolean] = js.native
  def include(model: js.Object, options: js.Object): Boolean | js.Promise[Boolean] = js.native
  def indexBy(iterator: String): js.Object = js.native
  def indexBy(iterator: String, context: js.Object): js.Object = js.native
  def indexBy(iterator: js.Function1[/* param0 */ Model, Unit]): js.Object = js.native
  def indexBy(iterator: js.Function1[/* param0 */ Model, Unit], context: js.Object): js.Object = js.native
  def indexOf(model: js.Object): Double | js.Promise[Double] = js.native
  def indexOf(model: js.Object, options: js.Object): Double | js.Promise[Double] = js.native
  def initial(): js.Array[Model] = js.native
  def initial(n: Double): js.Array[Model] = js.native
  def isEmpty(): Boolean = js.native
  def isRangeLocal(start: Double, count: Double): Boolean = js.native
  def last(): js.Promise[Model] | js.Array[Model] | Null = js.native
  def last(n: Double): js.Promise[Model] | js.Array[Model] | Null = js.native
  def last(n: Double, options: js.Object): js.Promise[Model] | js.Array[Model] | Null = js.native
  def lastIndexOf(model: Model): Double = js.native
  def lastIndexOf(model: Model, fromIndex: Double): Double = js.native
  def listenTo(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def listenToOnce(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def map(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Array[js.Object] = js.native
  def map(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Array[js.Object] = js.native
  def max(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Object = js.native
  def max(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Object = js.native
  def min(iterator: js.Function1[/* param0 */ js.Object, Unit]): js.Object = js.native
  def min(iterator: js.Function1[/* param0 */ js.Object, Unit], context: js.Object): js.Object = js.native
  def modelId(attrs: js.Object): Null | String = js.native
  def next(n: Double): js.Object | Null = js.native
  def next(n: Double, options: AnonCollection): js.Object | Null = js.native
  def off(): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: String): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(eventType: js.Object, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def once(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def parse(param0: js.Object): js.Object = js.native
  def pluck(attr: String): js.Array[js.Object] = js.native
  def pop(): Model | js.Promise[Model] = js.native
  def pop(options: AnonDeferredPropNameSilent): Model | js.Promise[Model] = js.native
  def previous(n: Double): js.Object = js.native
  def previous(n: Double, options: AnonCollection): js.Object = js.native
  def push(m: js.Object): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: js.Object, options: AnonAt): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: Model): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: Model, options: AnonAt): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def refresh(): js.Promise[js.UndefOr[SetRangeLocalPromise]] = js.native
  def refresh(options: AnonPropNameSilent): js.Promise[js.UndefOr[SetRangeLocalPromise]] = js.native
  def remove(m: js.Array[Model]): js.Array[Model] | js.Object = js.native
  def remove(m: js.Array[Model], options: js.Object): js.Array[Model] | js.Object = js.native
  def remove(m: Model): js.Array[Model] | js.Object = js.native
  def remove(m: Model, options: js.Object): js.Array[Model] | js.Object = js.native
  def reset(): Model | js.Array[Model] = js.native
  def reset(data: js.Object): Model | js.Array[Model] = js.native
  def reset(data: js.Object, options: AnonPropNameSilentAny): Model | js.Array[Model] = js.native
  def rest(): js.Array[js.Object] | js.Promise[_] = js.native
  def rest(n: Double): js.Array[js.Object] | js.Promise[_] = js.native
  def rest(n: Double, options: js.Object): js.Array[js.Object] | js.Promise[_] = js.native
  def set(models: js.Object): js.Promise[_] | Null = js.native
  def set(models: js.Object, options: AnonAddDeferred): js.Promise[_] | Null = js.native
  def setFetchSize(n: Double): js.UndefOr[scala.Nothing] = js.native
  def setModelLimit(n: Double): js.UndefOr[scala.Nothing] = js.native
  def setRangeLocal(start: Double, count: Double): js.Promise[SetRangeLocalPromise] = js.native
  def shift(): Model | js.Promise[Model] | Null = js.native
  def shift(options: js.Object): Model | js.Promise[Model] | Null = js.native
  def size(): Double = js.native
  def slice(start: Double): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def slice(start: Double, end: Double): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def slice(start: Double, end: Double, options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def sort(): js.Promise[SetRangeLocalPromise] | Null = js.native
  def sort(options: AnonPropNameSilent): js.Promise[SetRangeLocalPromise] | Null = js.native
  def sortBy(iterator: String): js.Array[Model] = js.native
  def sortBy(iterator: String, context: js.Object): js.Array[Model] = js.native
  def sortBy(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Array[Model] = js.native
  def sortBy(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Array[Model] = js.native
  def sortedIndex(comparator: String): Double = js.native
  def sortedIndex(comparator: js.Function2[/* param0 */ Model, /* param1 */ js.UndefOr[Model], js.Object]): Double = js.native
  def stopListening(): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object, eventType: String): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def sync(method: String, collection: Collection): js.Object = js.native
  def sync(method: String, collection: Collection, options: AnonError): js.Object = js.native
  def toJSON(): js.Array[js.Object] = js.native
  def trigger(eventType: String): js.UndefOr[scala.Nothing] = js.native
  def unshift(m: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def unshift(m: js.Object, options: AnonAt): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def whenReady(): js.Promise[_] = js.native
  def where(attrs: js.Array[js.Object]): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Array[js.Object], options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Object, options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def whereToCollection(attrs: js.Array[js.Object]): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Array[js.Object], options: js.Object): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Object): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Object, options: js.Object): Collection | js.Promise[Collection] = js.native
  def without(var_args: Model*): js.Array[Model] = js.native
}

