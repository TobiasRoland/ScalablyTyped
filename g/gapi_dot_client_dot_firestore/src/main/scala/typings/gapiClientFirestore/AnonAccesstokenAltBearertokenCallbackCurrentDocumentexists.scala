package typings.gapiClientFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccesstokenAltBearertokenCallbackCurrentDocumentexists extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * When set to `true`, the target document must exist.
    * When set to `false`, the target document must not exist.
    */
  @JSName("currentDocument.exists")
  var currentDocumentDotexists: js.UndefOr[Boolean] = js.native
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  @JSName("currentDocument.updateTime")
  var currentDocumentDotupdateTime: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  @JSName("mask.fieldPaths")
  var maskDotfieldPaths: js.UndefOr[String] = js.native
  /**
    * The resource name of the document, for example
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var name: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The list of field paths in the mask. See Document.fields for a field
    * path syntax reference.
    */
  @JSName("updateMask.fieldPaths")
  var updateMaskDotfieldPaths: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

