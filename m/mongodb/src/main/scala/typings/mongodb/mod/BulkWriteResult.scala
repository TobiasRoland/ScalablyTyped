package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteResult extends js.Object {
  var nInserted: scala.Double
  var nModified: scala.Double
  var nRemoved: scala.Double
  var nUpdated: scala.Double
  var nUpserted: scala.Double
  var ok: scala.Double
  def getInsertedIds(): js.Array[js.Object]
  def getLastOp(): js.Object
  def getRawResponse(): js.Object
  def getUpsertedIdAt(index: scala.Double): BulkWriteResultUpsertedIdObject
  def getUpsertedIds(): js.Array[BulkWriteResultUpsertedIdObject]
  def getWriteConcernError(): WriteConcernError
  def getWriteErrorAt(index: scala.Double): WriteError
  def getWriteErrorCount(): scala.Double
  def getWriteErrors(): js.Array[js.Object]
  def hasWriteErrors(): Boolean
}

object BulkWriteResult {
  @scala.inline
  def apply(
    getInsertedIds: () => js.Array[js.Object],
    getLastOp: () => js.Object,
    getRawResponse: () => js.Object,
    getUpsertedIdAt: scala.Double => BulkWriteResultUpsertedIdObject,
    getUpsertedIds: () => js.Array[BulkWriteResultUpsertedIdObject],
    getWriteConcernError: () => WriteConcernError,
    getWriteErrorAt: scala.Double => WriteError,
    getWriteErrorCount: () => scala.Double,
    getWriteErrors: () => js.Array[js.Object],
    hasWriteErrors: () => Boolean,
    nInserted: scala.Double,
    nModified: scala.Double,
    nRemoved: scala.Double,
    nUpdated: scala.Double,
    nUpserted: scala.Double,
    ok: scala.Double
  ): BulkWriteResult = {
    val __obj = js.Dynamic.literal(getInsertedIds = js.Any.fromFunction0(getInsertedIds), getLastOp = js.Any.fromFunction0(getLastOp), getRawResponse = js.Any.fromFunction0(getRawResponse), getUpsertedIdAt = js.Any.fromFunction1(getUpsertedIdAt), getUpsertedIds = js.Any.fromFunction0(getUpsertedIds), getWriteConcernError = js.Any.fromFunction0(getWriteConcernError), getWriteErrorAt = js.Any.fromFunction1(getWriteErrorAt), getWriteErrorCount = js.Any.fromFunction0(getWriteErrorCount), getWriteErrors = js.Any.fromFunction0(getWriteErrors), hasWriteErrors = js.Any.fromFunction0(hasWriteErrors), nInserted = nInserted.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any], nUpdated = nUpdated.asInstanceOf[js.Any], nUpserted = nUpserted.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BulkWriteResult]
  }
}

