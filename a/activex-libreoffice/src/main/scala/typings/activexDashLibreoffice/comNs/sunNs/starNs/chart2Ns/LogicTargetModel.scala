package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of this service correspond to the similar named attributes and subelements of the XML element {@link chart2} :increment in the {@link
  * chart2} file format.
  */
trait LogicTargetModel extends js.Object {
  /**
    * not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.CoordinateSystem}
    */
  var CoordinateSystems: SafeArray[XPropertySet]
  /** identifies an instance of this service within one chart document. */
  var ID: String
  /**
    * identifies an instance of the service com::sun::star::chart2::LegendModel within one chart document. that instance is used to automatically calculate
    * missing properties
    */
  var LegendID: String
  /**
    * MAYBEVOID, not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.LogicTargetModel}
    */
  var LogicTargetModels: SafeArray[XPropertySet]
}

object LogicTargetModel {
  @scala.inline
  def apply(
    CoordinateSystems: SafeArray[XPropertySet],
    ID: String,
    LegendID: String,
    LogicTargetModels: SafeArray[XPropertySet]
  ): LogicTargetModel = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems, ID = ID, LegendID = LegendID, LogicTargetModels = LogicTargetModels)
  
    __obj.asInstanceOf[LogicTargetModel]
  }
}

