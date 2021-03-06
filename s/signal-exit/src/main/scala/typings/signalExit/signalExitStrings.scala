package typings.signalExit

import typings.signalExit.mod._Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object signalExitStrings {
  @js.native
  sealed trait SIGABRT extends _Signal
  
  @js.native
  sealed trait SIGALRM extends _Signal
  
  @js.native
  sealed trait SIGHUP extends _Signal
  
  @js.native
  sealed trait SIGINT extends _Signal
  
  @js.native
  sealed trait SIGTERM extends _Signal
  
  @scala.inline
  def SIGABRT: SIGABRT = "SIGABRT".asInstanceOf[SIGABRT]
  @scala.inline
  def SIGALRM: SIGALRM = "SIGALRM".asInstanceOf[SIGALRM]
  @scala.inline
  def SIGHUP: SIGHUP = "SIGHUP".asInstanceOf[SIGHUP]
  @scala.inline
  def SIGINT: SIGINT = "SIGINT".asInstanceOf[SIGINT]
  @scala.inline
  def SIGTERM: SIGTERM = "SIGTERM".asInstanceOf[SIGTERM]
}

