package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionsApi extends js.Object {
  def create(workspace: String, body: CreateCollectionRequest): CreateCollectionResponse = js.native
  def create(workspace: String, body: CreateCollectionRequest, callback: RequestCallback): CreateCollectionResponse = js.native
  def get(workspace: String, collection: String): GetCollectionResponse = js.native
  def get(workspace: String, collection: String, callback: RequestCallback): GetCollectionResponse = js.native
  def list(): ListCollectionsResponse = js.native
  def list(callback: RequestCallback): ListCollectionsResponse = js.native
  def remove(workspace: String, collection: String): DeleteCollectionResponse = js.native
  def remove(workspace: String, collection: String, callback: RequestCallback): DeleteCollectionResponse = js.native
  def workspace(workspace: String): ListCollectionsResponse = js.native
  def workspace(workspace: String, callback: RequestCallback): ListCollectionsResponse = js.native
}

