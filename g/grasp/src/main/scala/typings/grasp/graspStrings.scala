package typings.grasp

import typings.grasp.mod.QueryEngineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graspStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait equery extends QueryEngineType
  
  @js.native
  sealed trait squery extends QueryEngineType
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def equery: equery = "equery".asInstanceOf[equery]
  @scala.inline
  def squery: squery = "squery".asInstanceOf[squery]
}

