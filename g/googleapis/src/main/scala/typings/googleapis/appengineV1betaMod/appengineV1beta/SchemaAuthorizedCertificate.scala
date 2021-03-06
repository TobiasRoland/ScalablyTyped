package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An SSL certificate that a user has been authorized to administer. A user is
  * authorized to administer any certificate that applies to one of their
  * authorized domains.
  */
@js.native
trait SchemaAuthorizedCertificate extends js.Object {
  /**
    * The SSL certificate serving the AuthorizedCertificate resource. This must
    * be obtained independently from a certificate authority.
    */
  var certificateRawData: js.UndefOr[SchemaCertificateRawData] = js.native
  /**
    * The user-specified display name of the certificate. This is not
    * guaranteed to be unique. Example: My Certificate.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Aggregate count of the domain mappings with this certificate mapped. This
    * count includes domain mappings on applications for which the user does
    * not have VIEWER permissions.Only returned by GET or LIST requests when
    * specifically requested by the view=FULL_CERTIFICATE option.@OutputOnly
    */
  var domainMappingsCount: js.UndefOr[Double] = js.native
  /**
    * Topmost applicable domains of this certificate. This certificate applies
    * to these domains and their subdomains. Example: example.com.@OutputOnly
    */
  var domainNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The time when this certificate expires. To update the renewal time on
    * this certificate, upload an SSL certificate with a different expiration
    * time using AuthorizedCertificates.UpdateAuthorizedCertificate.@OutputOnly
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * Relative name of the certificate. This is a unique value autogenerated on
    * AuthorizedCertificate resource creation. Example: 12345.@OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Only applicable if this certificate is managed by App Engine. Managed
    * certificates are tied to the lifecycle of a DomainMapping and cannot be
    * updated or deleted via the AuthorizedCertificates API. If this
    * certificate is manually administered by the user, this field will be
    * empty.@OutputOnly
    */
  var managedCertificate: js.UndefOr[SchemaManagedCertificate] = js.native
  /**
    * Full path to the AuthorizedCertificate resource in the API. Example:
    * apps/myapp/authorizedCertificates/12345.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The full paths to user visible Domain Mapping resources that have this
    * certificate mapped. Example: apps/myapp/domainMappings/example.com.This
    * may not represent the full list of mapped domain mappings if the user
    * does not have VIEWER permissions on all of the applications that have
    * this certificate mapped. See domain_mappings_count for a complete
    * count.Only returned by GET or LIST requests when specifically requested
    * by the view=FULL_CERTIFICATE option.@OutputOnly
    */
  var visibleDomainMappings: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAuthorizedCertificate {
  @scala.inline
  def apply(
    certificateRawData: SchemaCertificateRawData = null,
    displayName: String = null,
    domainMappingsCount: Int | Double = null,
    domainNames: js.Array[String] = null,
    expireTime: String = null,
    id: String = null,
    managedCertificate: SchemaManagedCertificate = null,
    name: String = null,
    visibleDomainMappings: js.Array[String] = null
  ): SchemaAuthorizedCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificateRawData != null) __obj.updateDynamic("certificateRawData")(certificateRawData.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domainMappingsCount != null) __obj.updateDynamic("domainMappingsCount")(domainMappingsCount.asInstanceOf[js.Any])
    if (domainNames != null) __obj.updateDynamic("domainNames")(domainNames.asInstanceOf[js.Any])
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (managedCertificate != null) __obj.updateDynamic("managedCertificate")(managedCertificate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (visibleDomainMappings != null) __obj.updateDynamic("visibleDomainMappings")(visibleDomainMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthorizedCertificate]
  }
}

