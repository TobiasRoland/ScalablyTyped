package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Reports$Compatiblefields")
@js.native
class ResourceReportsCompatiblefields protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.reports.compatibleFields.query
    * @desc Returns the fields that are compatible to be selected in the
    * respective sections of a report criteria, given the fields already
    * selected in the input report and user permissions.
    * @alias dfareporting.reports.compatibleFields.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(callback: BodyResponseCallback[SchemaCompatibleFields]): Unit = js.native
  def query(params: ParamsResourceReportsCompatiblefieldsQuery): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    callback: BodyResponseCallback[SchemaCompatibleFields]
  ): Unit = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    options: BodyResponseCallback[SchemaCompatibleFields],
    callback: BodyResponseCallback[SchemaCompatibleFields]
  ): Unit = js.native
  def query(params: ParamsResourceReportsCompatiblefieldsQuery, options: MethodOptions): GaxiosPromise[SchemaCompatibleFields] = js.native
  def query(
    params: ParamsResourceReportsCompatiblefieldsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompatibleFields]
  ): Unit = js.native
}

