package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * LabelSetBuilder is used to create a LabelSet to print multiple labels in one print job.
	 * LabelSet is a collection of records. Each record contains multiple pairs; each pair consists
	 * of the object name and the object text data/content. The data of each record are applied to all
	 * corresponend objects and for each record one label is printed.
	 */
@JSGlobal("dymo.label.framework.LabelSetBuilder")
@js.native
class LabelSetBuilder () extends js.Object {
  /**
  		 * Adds a new record to the LabelSet. Returns a record object.
  		 */
  def addRecord(): ILabelSetRecord = js.native
  /**
  		 * Get all record objects in this LabelSetBuilder.
  		 */
  def getRecords(): js.Array[ILabelSetRecord] = js.native
}

/* static members */
@JSGlobal("dymo.label.framework.LabelSetBuilder")
@js.native
object LabelSetBuilder extends js.Object {
  /**
  		 * Converts record objects to XML format. The XML format schema is defined in [LabelSet.xsd]{@link http://labelwriter.com/software/dls/sdk/LabelSet.xsd}.
  		 * Returned XML can be passed to dymo.label.framefork.printLabel as labelSetXml parameter. This function can be used independent of other LabelSetBuilder methods, if records data is generated by other functions.
  		 *
  		 * @param records The records to convert to XML. Records should be an array-like object of associative-arrays with object names as keys and object text as values.
  		 *
  		 * @returns An XML string.
  		 */
  def toXml(records: js.Array[js.Object]): String = js.native
}

