package typings.mendixmodelsdk.mod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datasetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
@js.native
class DataSetObjectConstraint protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetObjectConstraint {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
@js.native
object DataSetObjectConstraint extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
  /**
    * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
    * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
    * of the parent DataSetParameter element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = js.native
}

