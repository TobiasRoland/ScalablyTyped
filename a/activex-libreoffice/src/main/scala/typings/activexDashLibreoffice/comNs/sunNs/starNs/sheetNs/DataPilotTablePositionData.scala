package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains information on a cell within a DataPilot table.
  *
  * This structure contains information on a particular cell within a DataPilot table, and is used to retrieve its metadata. The {@link PositionType}
  * member specifies in which sub-area of the table the cell is positioned, which in turn determines the type of metadata contained in the {@link
  * PositionData} member.
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPiotTableResultData
  * @see com.sun.star.sheet.DataPiotTableHeaderData
  * @since OOo 3.0
  */
trait DataPilotTablePositionData extends js.Object {
  /**
    * This member contains a structure of different types depending on the position type specified in {@link PositionType} member.
    *
    * When the value of {@link PositionType} is {@link DataPilotTablePositionType.RESULT} , {@link DataPilotTablePositionData.PositionData} contains an
    * instance of type {@link DataPilotTableResultData} , whereas when the value of {@link DataPilotTablePositionData.PositionType} is either {@link
    * DataPilotTablePositionType.ROW_HEADER} or {@link DataPilotTablePositionType.COLUMN_HEADER} , then the {@link PositionData} member contains an instance
    * of type {@link DataPilotTableHeaderData} .
    * @see com.sun.star.sheet.DataPiotTableResultData
    * @see com.sun.star.sheet.DataPiotTableHeaderData
    */
  var PositionData: js.Any
  /**
    * This parameter specifies which sub-area of a DataPilot table a given cell is positioned. See {@link DataPilotTablePositionType} for how to interpret
    * the value of this parameter.
    * @see com.sun.star.sheet.DataPilotTablePositionType
    */
  var PositionType: Double
}

object DataPilotTablePositionData {
  @scala.inline
  def apply(PositionData: js.Any, PositionType: Double): DataPilotTablePositionData = {
    val __obj = js.Dynamic.literal(PositionData = PositionData, PositionType = PositionType)
  
    __obj.asInstanceOf[DataPilotTablePositionData]
  }
}

