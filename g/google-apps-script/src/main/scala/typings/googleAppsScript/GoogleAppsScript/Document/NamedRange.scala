package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Range that has a name and ID to allow later retrieval. Names are not
  * necessarily unique; several different ranges in the same document may share the same name, much
  * like a class in HTML. By contrast, IDs are unique within the document, like an ID in HTML. Once a
  * NamedRange has been added to a document, it cannot be modified, only removed.
  *
  * A NamedRange can be accessed by any script that accesses the document. To avoid
  * unintended conflicts between scripts, consider prefixing range names with a unique string.
  *
  *     // Create a named range that includes every table in the document.
  *     var doc = DocumentApp.getActiveDocument();
  *     var rangeBuilder = doc.newRange();
  *     var tables = doc.getBody().getTables();
  *     for (var i = 0; i < tables.length; i++) {
  *       rangeBuilder.addElement(tables[i]);
  *     }
  *     doc.addNamedRange('myUniquePrefix-tables', rangeBuilder.build());
  */
trait NamedRange extends js.Object {
  def getId(): String
  def getName(): String
  def getRange(): Range
  def remove(): Unit
}

object NamedRange {
  @scala.inline
  def apply(getId: () => String, getName: () => String, getRange: () => Range, remove: () => Unit): NamedRange = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[NamedRange]
  }
}

