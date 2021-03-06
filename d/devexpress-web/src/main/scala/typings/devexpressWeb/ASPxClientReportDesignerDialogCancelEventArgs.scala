package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@JSGlobal("ASPxClientReportDesignerDialogCancelEventArgs")
@js.native
class ASPxClientReportDesignerDialogCancelEventArgs protected () extends ASPxClientReportDesignerDialogEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerDialogCancelEventArgs class with the specified settings.
    * @param url Specifies the URL of the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Url property.
    * @param report Specifies the report currently being processed. This value is assigned to the ASPxClientReportDesignerDialogEventArgs.Report property.
    */
  def this(url: String, report: js.Any) = this()
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    */
  var Cancel: Boolean = js.native
}

