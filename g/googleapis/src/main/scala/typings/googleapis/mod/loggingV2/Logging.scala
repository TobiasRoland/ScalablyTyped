package typings.googleapis.mod.loggingV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2');
  *
  * @namespace logging
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis", "logging_v2.Logging")
@js.native
class Logging protected ()
  extends typings.googleapis.loggingV2Mod.loggingV2.Logging {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

