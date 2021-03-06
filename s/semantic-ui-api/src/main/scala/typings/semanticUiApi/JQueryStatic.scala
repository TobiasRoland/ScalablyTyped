package typings.semanticUiApi

import typings.jquery.JQueryDeferred
import typings.semanticUiApi.SemanticUI.Api
import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiApi.semanticUiApiBooleans.`false`
import typings.semanticUiApi.semanticUiApiStrings.`add url data`
import typings.semanticUiApi.semanticUiApiStrings.`create cache`
import typings.semanticUiApi.semanticUiApiStrings.`get event`
import typings.semanticUiApi.semanticUiApiStrings.`get request`
import typings.semanticUiApi.semanticUiApiStrings.`get url encoded value`
import typings.semanticUiApi.semanticUiApiStrings.`is disabled`
import typings.semanticUiApi.semanticUiApiStrings.`is loading`
import typings.semanticUiApi.semanticUiApiStrings.`is mocked`
import typings.semanticUiApi.semanticUiApiStrings.`read cached response`
import typings.semanticUiApi.semanticUiApiStrings.`remove error`
import typings.semanticUiApi.semanticUiApiStrings.`remove loading`
import typings.semanticUiApi.semanticUiApiStrings.`set error`
import typings.semanticUiApi.semanticUiApiStrings.`set loading`
import typings.semanticUiApi.semanticUiApiStrings.`was cancelled`
import typings.semanticUiApi.semanticUiApiStrings.`was complete`
import typings.semanticUiApi.semanticUiApiStrings.`was failure`
import typings.semanticUiApi.semanticUiApiStrings.`was successful`
import typings.semanticUiApi.semanticUiApiStrings.`write cached response`
import typings.semanticUiApi.semanticUiApiStrings.abort
import typings.semanticUiApi.semanticUiApiStrings.destroy
import typings.semanticUiApi.semanticUiApiStrings.query
import typings.semanticUiApi.semanticUiApiStrings.reset
import typings.semanticUiApi.semanticUiApiStrings.setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("api")
  var api_Original: Api = js.native
  def api(): JQuery = js.native
  def api(settings: ApiSettings): JQuery = js.native
  /**
    * Aborts current API request
    */
  @JSName("api")
  def api_abort(behavior: abort): JQuery = js.native
  /**
    * Adds data to existing templated url and returns full url string
    */
  @JSName("api")
  def api_addurldata(behavior: `add url data`, url: String, data: js.Any): String = js.native
  /**
    * Creates new cache, removing all locally cached URLs
    */
  @JSName("api")
  def api_createcache(behavior: `create cache`): JQuery = js.native
  /**
    * Removes API settings from the page and all events
    */
  @JSName("api")
  def api_destroy(behavior: destroy): JQuery = js.native
  /**
    * Gets event that API request will occur on
    */
  @JSName("api")
  def api_getevent(behavior: `get event`): String = js.native
  /**
    * Gets promise for current API request
    */
  @JSName("api")
  def api_getrequest(behavior: `get request`): JQueryDeferred[_] | `false` = js.native
  /**
    * Returns encodeURIComponent value only if value passed is not already encoded
    */
  @JSName("api")
  def api_geturlencodedvalue(behavior: `get url encoded value`, value: js.Any): String = js.native
  /**
    * Returns whether element is disabled
    */
  @JSName("api")
  def api_isdisabled(behavior: `is disabled`): Boolean = js.native
  /**
    * Returns whether element is loading
    */
  @JSName("api")
  def api_isloading(behavior: `is loading`): Boolean = js.native
  /**
    * Returns whether element response is mocked
    */
  @JSName("api")
  def api_ismocked(behavior: `is mocked`): Boolean = js.native
  /**
    * Execute query using existing API settings
    */
  @JSName("api")
  def api_query(behavior: query): JQuery = js.native
  /**
    * Reads a locally cached response for a URL
    */
  @JSName("api")
  def api_readcachedresponse(behavior: `read cached response`, url: String): js.Any = js.native
  /**
    * Removes error state to element
    */
  @JSName("api")
  def api_removeerror(behavior: `remove error`): JQuery = js.native
  /**
    * Removes loading state to element
    */
  @JSName("api")
  def api_removeloading(behavior: `remove loading`): JQuery = js.native
  /**
    * Removes loading and error state from element
    */
  @JSName("api")
  def api_reset(behavior: reset): JQuery = js.native
  /**
    * Sets error state to element
    */
  @JSName("api")
  def api_seterror(behavior: `set error`): JQuery = js.native
  /**
    * Sets loading state to element
    */
  @JSName("api")
  def api_setloading(behavior: `set loading`): JQuery = js.native
  @JSName("api")
  def api_setting(behavior: setting, value: ApiSettings): JQuery = js.native
  @JSName("api")
  def api_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any = js.native
  @JSName("api")
  def api_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-api.SemanticUI.ApiSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Returns whether last request was cancelled
    */
  @JSName("api")
  def api_wascancelled(behavior: `was cancelled`): Boolean = js.native
  /**
    * Returns whether last request was completed
    */
  @JSName("api")
  def api_wascomplete(behavior: `was complete`): Boolean = js.native
  /**
    * Returns whether last request was failure
    */
  @JSName("api")
  def api_wasfailure(behavior: `was failure`): Boolean = js.native
  /**
    * Returns whether last request was successful
    */
  @JSName("api")
  def api_wassuccessful(behavior: `was successful`): Boolean = js.native
  /**
    * Writes a cached response for a URL
    */
  @JSName("api")
  def api_writecachedresponse(behavior: `write cached response`, url: String, response: js.Any): JQuery = js.native
}

