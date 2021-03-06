package typings.readChunk

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-chunk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: AnonDefault = js.native
  /**
  	Read a chunk from a file asyncronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	// foo.txt => hello
  	readChunk.sync('foo.txt', 1, 3);
  	//=> 'ell'
  	```
  	*/
  def apply(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = js.native
  /**
  	Read a chunk from a file asyncronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	// foo.txt => hello
  	readChunk.sync('foo.txt', 1, 3);
  	//=> 'ell'
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(filePath: String, startPosition: Double, length: Double): js.Promise[Buffer] = js.native
  /**
  	Read a chunk from a file synchronously.
  	@param filePath - The path to the file.
  	@param startPosition - Position to start reading.
  	@param length - Number of bytes to read.
  	@returns The read chunk.
  	*/
  def sync(filePath: String, startPosition: Double, length: Double): Buffer = js.native
}

