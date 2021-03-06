package typings.googleapis

import typings.googleapis.cloudtraceV1Mod.cloudtraceV1.Cloudtrace
import typings.googleapis.cloudtraceV1Mod.cloudtraceV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptionsV1V2Version extends js.Object {
  def apply(options: Options): Cloudtrace = js.native
  def apply(options: typings.googleapis.cloudtraceV2Mod.cloudtraceV2.Options): typings.googleapis.cloudtraceV2Mod.cloudtraceV2.Cloudtrace = js.native
  def apply(version: v1): Cloudtrace = js.native
  def apply(version: v2): typings.googleapis.cloudtraceV2Mod.cloudtraceV2.Cloudtrace = js.native
}

