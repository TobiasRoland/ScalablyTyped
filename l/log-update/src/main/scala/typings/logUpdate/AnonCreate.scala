package typings.logUpdate

import typings.logUpdate.mod.LogUpdate
import typings.logUpdate.mod.Options
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof logUpdate */ js.Any = js.native
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  @JSName("stderr")
  val stderr_Original: LogUpdate = js.native
  /**
  	Get a `logUpdate` method that logs to the specified stream.
  	@param stream - The stream to log to.
  	*/
  def create(stream: WritableStream): LogUpdate = js.native
  def create(stream: WritableStream, options: Options): LogUpdate = js.native
  /**
  		Log to `stdout` by overwriting the previous output in the terminal.
  		@param text - The text to log to `stdout`.
  		@example
  		```
  		import logUpdate = require('log-update');
  		const frames = ['-', '\\', '|', '/'];
  		let i = 0;
  		setInterval(() => {
  			const frame = frames[i = ++i % frames.length];
  			logUpdate(
  		`
  				♥♥
  		${frame} unicorns ${frame}
  				♥♥
  		`
  			);
  		}, 80);
  		```
  		*/
  /**
  	Log to `stderr` by overwriting the previous output in the terminal.
  	@param text - The text to log to `stderr`.
  	*/
  def stderr(text: String*): Unit = js.native
}

