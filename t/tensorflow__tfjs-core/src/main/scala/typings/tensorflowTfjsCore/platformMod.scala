package typings.tensorflowTfjsCore

import typings.std.RequestInit
import typings.std.Response
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.typesMod.RequestDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/platforms/platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  trait Platform extends js.Object {
    /** Decode the provided bytes into a string using the provided encoding. */
    def decode(bytes: Uint8Array, encoding: String): String = js.native
    /**
      * Encode the provided string into an array of bytes using the provided
      * encoding.
      */
    def encode(text: String, encoding: String): Uint8Array = js.native
    /**
      * Makes an HTTP request.
      * @param path The URL path to make a request to
      * @param init The request init. See init here:
      *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request
      */
    def fetch(path: String): js.Promise[Response] = js.native
    def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = js.native
    def fetch(path: String, requestInits: RequestInit, options: RequestDetails): js.Promise[Response] = js.native
    /**
      * Returns the current high-resolution time in milliseconds relative to an
      * arbitrary time in the past. It works across different platforms (node.js,
      * browsers).
      */
    def now(): Double = js.native
  }
  
}

