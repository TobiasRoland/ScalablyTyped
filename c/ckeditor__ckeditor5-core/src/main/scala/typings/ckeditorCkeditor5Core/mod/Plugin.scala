package typings.ckeditorCkeditor5Core.mod

import org.scalablytyped.runtime.Instantiable1
import typings.ckeditorCkeditor5Core.AnonPriority
import typings.ckeditorCkeditor5Core.AnonPriorityNumber
import typings.ckeditorCkeditor5Core.mod.editor.Editor
import typings.ckeditorCkeditor5Utils.mod.Emitter
import typings.ckeditorCkeditor5Utils.mod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "Plugin")
@js.native
abstract class Plugin[T] protected () extends Observable {
  def this(editor: Editor) = this()
  var afterInit: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
  var destroy: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
  val editor: Editor = js.native
  var init: js.UndefOr[js.Function0[Null | js.Promise[T]]] = js.native
  def listenTo(emitter: Emitter, event: String, callback: js.Function, options: AnonPriority): Unit = js.native
  def on(event: String, callback: js.Function, options: AnonPriorityNumber): Unit = js.native
  def once(event: String, callback: js.Function, options: AnonPriorityNumber): Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "Plugin")
@js.native
object Plugin extends js.Object {
  val pluginName: js.UndefOr[String] = js.native
  val requires: js.UndefOr[js.Array[Instantiable1[/* editor */ Editor, Plugin[Unit]]]] = js.native
}

