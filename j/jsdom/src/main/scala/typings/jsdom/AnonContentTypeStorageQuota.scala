package typings.jsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentTypeStorageQuota extends js.Object {
  /**
    * contentType affects the value read from document.contentType, and how the document is parsed: as HTML or as XML.
    * Values that are not "text/html" or an XML mime type will throw. It defaults to "text/html".
    */
  var contentType: js.UndefOr[String] = js.undefined
  /**
    * The maximum size in code units for the separate storage areas used by localStorage and sessionStorage.
    * Attempts to store data larger than this limit will cause a DOMException to be thrown. By default, it is set
    * to 5,000,000 code units per origin, as inspired by the HTML specification.
    */
  var storageQuota: js.UndefOr[Double] = js.undefined
  /**
    * url sets the value returned by window.location, document.URL, and document.documentURI,
    * and affects things like resolution of relative URLs within the document
    * and the same-origin restrictions and referrer used while fetching subresources.
    * It defaults to "about:blank".
    */
  var url: js.UndefOr[String] = js.undefined
}

object AnonContentTypeStorageQuota {
  @scala.inline
  def apply(contentType: String = null, storageQuota: Int | Double = null, url: String = null): AnonContentTypeStorageQuota = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (storageQuota != null) __obj.updateDynamic("storageQuota")(storageQuota.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentTypeStorageQuota]
  }
}

