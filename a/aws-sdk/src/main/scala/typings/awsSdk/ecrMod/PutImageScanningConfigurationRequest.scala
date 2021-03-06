package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutImageScanningConfigurationRequest extends js.Object {
  /**
    * The image scanning configuration for the repository. This setting determines whether images are scanned for known vulnerabilities after being pushed to the repository.
    */
  var imageScanningConfiguration: ImageScanningConfiguration = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository in which to update the image scanning configuration setting. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository in which to update the image scanning configuration setting.
    */
  var repositoryName: RepositoryName = js.native
}

object PutImageScanningConfigurationRequest {
  @scala.inline
  def apply(
    imageScanningConfiguration: ImageScanningConfiguration,
    repositoryName: RepositoryName,
    registryId: RegistryId = null
  ): PutImageScanningConfigurationRequest = {
    val __obj = js.Dynamic.literal(imageScanningConfiguration = imageScanningConfiguration.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutImageScanningConfigurationRequest]
  }
}

