package typings.cucumber.mod

import typings.cucumber.AnonAttach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  def After(code: HookCode): Unit = js.native
  def After(options: String, code: HookCode): Unit = js.native
  def After(options: HookOptions, code: HookCode): Unit = js.native
  def AfterAll(code: GlobalHookCode): Unit = js.native
  def AfterAll(options: String, code: GlobalHookCode): Unit = js.native
  def AfterAll(options: HookOptions, code: GlobalHookCode): Unit = js.native
  def Before(code: HookCode): Unit = js.native
  def Before(options: String, code: HookCode): Unit = js.native
  def Before(options: HookOptions, code: HookCode): Unit = js.native
  def BeforeAll(code: GlobalHookCode): Unit = js.native
  def BeforeAll(options: String, code: GlobalHookCode): Unit = js.native
  def BeforeAll(options: HookOptions, code: GlobalHookCode): Unit = js.native
  def defineParameterType(transform: Transform): Unit = js.native
  def setDefaultTimeout(time: Double): Unit = js.native
  def setWorldConstructor(world: js.Object): Unit = js.native
  // tslint:disable-next-line ban-types
  def setWorldConstructor(world: js.ThisFunction1[/* this */ World, /* init */ AnonAttach, Unit]): Unit = js.native
}

