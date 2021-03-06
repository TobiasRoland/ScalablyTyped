package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Wraps one or more Sound objects and selects one with random weight for playback.
  */
@JSGlobal("BABYLON.WeightedSound")
@js.native
class WeightedSound protected () extends js.Object {
  /**
    * Creates a new WeightedSound from the list of sounds given.
    * @param loop When true a Sound will be selected and played when the current playing Sound completes.
    * @param sounds Array of Sounds that will be selected from.
    * @param weights Array of number values for selection weights; length must equal sounds, values will be normalized to 1
    */
  def this(loop: scala.Boolean, sounds: js.Array[Sound], weights: js.Array[scala.Double]) = this()
  var _coneInnerAngle: js.Any = js.native
  var _coneOuterAngle: js.Any = js.native
  var _currentIndex: js.UndefOr[js.Any] = js.native
  var _onended: js.Any = js.native
  var _sounds: js.Any = js.native
  var _volume: js.Any = js.native
  var _weights: js.Any = js.native
  /**
    * The size of cone in degrees for a directional sound in which there will be no attenuation.
    */
  /**
    * The size of cone in degress for a directional sound in which there will be no attenuation.
    */
  var directionalConeInnerAngle: scala.Double = js.native
  /**
    * Size of cone in degrees for a directional sound outside of which there will be no sound.
    * Listener angles between innerAngle and outerAngle will falloff linearly.
    */
  /**
    * Size of cone in degrees for a directional sound outside of which there will be no sound.
    * Listener angles between innerAngle and outerAngle will falloff linearly.
    */
  var directionalConeOuterAngle: scala.Double = js.native
  /** A Sound is currently paused. */
  var isPaused: scala.Boolean = js.native
  /** A Sound is currently playing. */
  var isPlaying: scala.Boolean = js.native
  /** When true a Sound will be selected and played when the current playing Sound completes. */
  var loop: scala.Boolean = js.native
  /**
    * Playback volume.
    */
  /**
    * Playback volume.
    */
  var volume: scala.Double = js.native
  /**
    * Suspend playback
    */
  def pause(): scala.Unit = js.native
  /**
    * Start playback.
    * @param startOffset Position the clip head at a specific time in seconds.
    */
  def play(): scala.Unit = js.native
  def play(startOffset: scala.Double): scala.Unit = js.native
  /**
    * Stop playback
    */
  def stop(): scala.Unit = js.native
}

