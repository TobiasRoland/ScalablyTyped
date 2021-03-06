package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Particle emitter represents a volume emitting particles.
  * This is the responsibility of the implementation to define the volume shape like cone/sphere/box.
  */
trait IParticleEmitterType extends js.Object {
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param effect defines the update shader
    */
  def applyToShader(effect: Effect): scala.Unit
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  def getClassName(): java.lang.String
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  def getEffectDefines(): java.lang.String
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: js.Any): scala.Unit
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  def serialize(): js.Any
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): scala.Unit
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle): scala.Unit
}

object IParticleEmitterType {
  @scala.inline
  def apply(
    applyToShader: Effect => scala.Unit,
    clone: () => IParticleEmitterType,
    getClassName: () => java.lang.String,
    getEffectDefines: () => java.lang.String,
    parse: js.Any => scala.Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle) => scala.Unit,
    startPositionFunction: (Matrix, Vector3, Particle) => scala.Unit
  ): IParticleEmitterType = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), clone = js.Any.fromFunction0(clone), getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction3(startDirectionFunction), startPositionFunction = js.Any.fromFunction3(startPositionFunction))
  
    __obj.asInstanceOf[IParticleEmitterType]
  }
}

