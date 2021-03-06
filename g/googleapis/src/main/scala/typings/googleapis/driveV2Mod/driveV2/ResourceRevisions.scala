package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Revisions")
@js.native
class ResourceRevisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.revisions.delete
    * @desc Permanently deletes a file version. You can only delete revisions
    * for files with binary content, like images or videos. Revisions for other
    * files, like Google Docs or Sheets, and the last remaining file version
    * can't be deleted.
    * @alias drive.revisions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.revisionId The ID of the revision.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceRevisionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRevisionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRevisionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRevisionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceRevisionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.revisions.get
    * @desc Gets a specific revision.
    * @alias drive.revisions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.revisionId The ID of the revision.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRevision] = js.native
  def get(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(params: ParamsResourceRevisionsGet): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceRevisionsGet, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(
    params: ParamsResourceRevisionsGet,
    options: BodyResponseCallback[SchemaRevision],
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  def get(params: ParamsResourceRevisionsGet, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(
    params: ParamsResourceRevisionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  /**
    * drive.revisions.list
    * @desc Lists a file's revisions.
    * @alias drive.revisions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {integer=} params.maxResults Maximum number of revisions to return.
    * @param {string=} params.pageToken Page token for revisions. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRevisionList] = js.native
  def list(callback: BodyResponseCallback[SchemaRevisionList]): Unit = js.native
  def list(params: ParamsResourceRevisionsList): GaxiosPromise[SchemaRevisionList] = js.native
  def list(params: ParamsResourceRevisionsList, callback: BodyResponseCallback[SchemaRevisionList]): Unit = js.native
  def list(
    params: ParamsResourceRevisionsList,
    options: BodyResponseCallback[SchemaRevisionList],
    callback: BodyResponseCallback[SchemaRevisionList]
  ): Unit = js.native
  def list(params: ParamsResourceRevisionsList, options: MethodOptions): GaxiosPromise[SchemaRevisionList] = js.native
  def list(
    params: ParamsResourceRevisionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevisionList]
  ): Unit = js.native
  /**
    * drive.revisions.patch
    * @desc Updates a revision. This method supports patch semantics.
    * @alias drive.revisions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file.
    * @param {string} params.revisionId The ID for the revision.
    * @param {().Revision} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaRevision] = js.native
  def patch(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def patch(params: ParamsResourceRevisionsPatch): GaxiosPromise[SchemaRevision] = js.native
  def patch(params: ParamsResourceRevisionsPatch, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def patch(
    params: ParamsResourceRevisionsPatch,
    options: BodyResponseCallback[SchemaRevision],
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  def patch(params: ParamsResourceRevisionsPatch, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def patch(
    params: ParamsResourceRevisionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  /**
    * drive.revisions.update
    * @desc Updates a revision.
    * @alias drive.revisions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file.
    * @param {string} params.revisionId The ID for the revision.
    * @param {().Revision} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRevision] = js.native
  def update(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def update(params: ParamsResourceRevisionsUpdate): GaxiosPromise[SchemaRevision] = js.native
  def update(params: ParamsResourceRevisionsUpdate, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def update(
    params: ParamsResourceRevisionsUpdate,
    options: BodyResponseCallback[SchemaRevision],
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  def update(params: ParamsResourceRevisionsUpdate, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def update(
    params: ParamsResourceRevisionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
}

