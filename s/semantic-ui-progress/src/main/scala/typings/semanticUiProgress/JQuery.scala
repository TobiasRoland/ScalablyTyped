package typings.semanticUiProgress

import typings.semanticUiProgress.SemanticUI.Progress
import typings.semanticUiProgress.SemanticUI.ProgressSettings
import typings.semanticUiProgress.semanticUiProgressStrings.`get normalized value`
import typings.semanticUiProgress.semanticUiProgressStrings.`get percent`
import typings.semanticUiProgress.semanticUiProgressStrings.`get text`
import typings.semanticUiProgress.semanticUiProgressStrings.`get total`
import typings.semanticUiProgress.semanticUiProgressStrings.`get value`
import typings.semanticUiProgress.semanticUiProgressStrings.`is active`
import typings.semanticUiProgress.semanticUiProgressStrings.`is complete`
import typings.semanticUiProgress.semanticUiProgressStrings.`is error`
import typings.semanticUiProgress.semanticUiProgressStrings.`is success`
import typings.semanticUiProgress.semanticUiProgressStrings.`is warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove active`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove error`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove success`
import typings.semanticUiProgress.semanticUiProgressStrings.`remove warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`set active`
import typings.semanticUiProgress.semanticUiProgressStrings.`set bar label`
import typings.semanticUiProgress.semanticUiProgressStrings.`set duration`
import typings.semanticUiProgress.semanticUiProgressStrings.`set error`
import typings.semanticUiProgress.semanticUiProgressStrings.`set label`
import typings.semanticUiProgress.semanticUiProgressStrings.`set percent`
import typings.semanticUiProgress.semanticUiProgressStrings.`set progress`
import typings.semanticUiProgress.semanticUiProgressStrings.`set success`
import typings.semanticUiProgress.semanticUiProgressStrings.`set total`
import typings.semanticUiProgress.semanticUiProgressStrings.`set warning`
import typings.semanticUiProgress.semanticUiProgressStrings.`update progress`
import typings.semanticUiProgress.semanticUiProgressStrings.complete
import typings.semanticUiProgress.semanticUiProgressStrings.decrement
import typings.semanticUiProgress.semanticUiProgressStrings.destroy
import typings.semanticUiProgress.semanticUiProgressStrings.increment
import typings.semanticUiProgress.semanticUiProgressStrings.reset
import typings.semanticUiProgress.semanticUiProgressStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("progress")
  var progress_Original: Progress = js.native
  def progress(): JQuery = js.native
  def progress(settings: ProgressSettings): JQuery = js.native
  /**
    * Finishes progress and sets loaded to 100%
    */
  @JSName("progress")
  def progress_complete(behavior: complete): JQuery = js.native
  /**
    * Decrements progress by decrement value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_decrement(behavior: decrement): JQuery = js.native
  @JSName("progress")
  def progress_decrement(behavior: decrement, decrementValue: Double): JQuery = js.native
  @JSName("progress")
  def progress_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns normalized value inside acceptable range specified by total.
    */
  @JSName("progress")
  def progress_getnormalizedvalue(behavior: `get normalized value`, value: Double): Double = js.native
  /**
    * Returns percent as last specified
    */
  @JSName("progress")
  def progress_getpercent(behavior: `get percent`): Double = js.native
  /**
    * Replaces templated string with value, total, percent left and percent.
    */
  @JSName("progress")
  def progress_gettext(behavior: `get text`, text: String): String = js.native
  /**
    * Returns total
    */
  @JSName("progress")
  def progress_gettotal(behavior: `get total`): Double = js.native
  /**
    * Returns current progress value
    */
  @JSName("progress")
  def progress_getvalue(behavior: `get value`): Double = js.native
  /**
    * Increments progress by increment value, if not passed a value will use random amount specified in settings
    */
  @JSName("progress")
  def progress_increment(behavior: increment): JQuery = js.native
  @JSName("progress")
  def progress_increment(behavior: increment, incrementValue: Double): JQuery = js.native
  /**
    * Returns whether progress is in active state
    */
  @JSName("progress")
  def progress_isactive(behavior: `is active`): Boolean = js.native
  /**
    * Returns whether progress is completed
    */
  @JSName("progress")
  def progress_iscomplete(behavior: `is complete`): Boolean = js.native
  /**
    * Returns whether progress is in error state
    */
  @JSName("progress")
  def progress_iserror(behavior: `is error`): Boolean = js.native
  /**
    * Returns whether progress was a success
    */
  @JSName("progress")
  def progress_issuccess(behavior: `is success`): Boolean = js.native
  /**
    * Returns whether progress is in warning state
    */
  @JSName("progress")
  def progress_iswarning(behavior: `is warning`): Boolean = js.native
  /**
    * Removes progress to active state
    */
  @JSName("progress")
  def progress_removeactive(behavior: `remove active`): JQuery = js.native
  /**
    * Removes progress to error state
    */
  @JSName("progress")
  def progress_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes progress to success state
    */
  @JSName("progress")
  def progress_removesuccess(behavior: `remove success`): JQuery = js.native
  /**
    * Removes progress to warning state
    */
  @JSName("progress")
  def progress_removewarning(behavior: `remove warning`): JQuery = js.native
  /**
    * Resets progress to zero
    */
  @JSName("progress")
  def progress_reset(behavior: reset): JQuery = js.native
  /**
    * Sets progress to active state
    */
  @JSName("progress")
  def progress_setactive(behavior: `set active`): JQuery = js.native
  /**
    * Sets progress bar label to text
    */
  @JSName("progress")
  def progress_setbarlabel(behavior: `set bar label`, text: String): JQuery = js.native
  /**
    * Changes progress animation speed
    */
  @JSName("progress")
  def progress_setduration(behavior: `set duration`, value: Double): JQuery = js.native
  /**
    * Sets progress to error state
    */
  @JSName("progress")
  def progress_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets progress exterior label to text
    */
  @JSName("progress")
  def progress_setlabel(behavior: `set label`, text: String): JQuery = js.native
  /**
    * Sets current percent of progress to value. If using a total will convert from percent to estimated value.
    */
  @JSName("progress")
  def progress_setpercent(behavior: `set percent`, percent: Double): JQuery = js.native
  /**
    * Sets progress to specified value. Will automatically calculate percent from total.
    */
  @JSName("progress")
  def progress_setprogress(behavior: `set progress`, value: Double): JQuery = js.native
  /**
    * Sets progress to success state
    */
  @JSName("progress")
  def progress_setsuccess(behavior: `set success`): JQuery = js.native
  @JSName("progress")
  def progress_setting(behavior: setting, value: ProgressSettings): JQuery = js.native
  @JSName("progress")
  def progress_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any = js.native
  @JSName("progress")
  def progress_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-progress.SemanticUI.ProgressSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Set total to a new value
    */
  @JSName("progress")
  def progress_settotal(behavior: `set total`, total: Double): JQuery = js.native
  /**
    * Sets progress to warning state
    */
  @JSName("progress")
  def progress_setwarning(behavior: `set warning`): JQuery = js.native
  /**
    * Immediately updates progress to value, ignoring progress animation interval delays
    */
  @JSName("progress")
  def progress_updateprogress(behavior: `update progress`, value: Double): JQuery = js.native
}

