package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs.XCommandEnvironment
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link PackageRegistryBackend} service is used to bind a specific type of {@link XPackage} which can be registered or revoked.
  *
  * All {@link PackageRegistryBackend} objects are related to a {@link XPackageManager} instance.
  * @since OOo 2.0
  */
trait PackageRegistryBackend extends XPackageRegistry {
  /**
    * Creates a persistent registry.
    * @param context context of registry, e.g. user, shared
    * @param cacheDirectory cache directory that the registry has to use
    * @param readOnly reflects whether writing to cache directory is allowed
    */
  def createPersistent(context: String, cacheDirectory: String, readOnly: Boolean): Unit
  /**
    * Creates a transient registry.
    * @param context context of registry, e.g. user, shared
    */
  def createTransient(context: String): Unit
}

object PackageRegistryBackend {
  @scala.inline
  def apply(
    SupportedPackageTypes: SafeArray[XPackageTypeInfo],
    bindPackage: (String, String, Boolean, String, XCommandEnvironment) => XPackage,
    createPersistent: (String, String, Boolean) => Unit,
    createTransient: String => Unit,
    getSupportedPackageTypes: () => SafeArray[XPackageTypeInfo],
    packageRemoved: (String, String) => Unit
  ): PackageRegistryBackend = {
    val __obj = js.Dynamic.literal(SupportedPackageTypes = SupportedPackageTypes, bindPackage = js.Any.fromFunction5(bindPackage), createPersistent = js.Any.fromFunction3(createPersistent), createTransient = js.Any.fromFunction1(createTransient), getSupportedPackageTypes = js.Any.fromFunction0(getSupportedPackageTypes), packageRemoved = js.Any.fromFunction2(packageRemoved))
  
    __obj.asInstanceOf[PackageRegistryBackend]
  }
}

