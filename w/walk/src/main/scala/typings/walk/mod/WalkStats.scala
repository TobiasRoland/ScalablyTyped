package typings.walk.mod

import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.StatsBase
import typings.std.Date
import typings.walk.walkStrings.FIFO
import typings.walk.walkStrings.blockDevice
import typings.walk.walkStrings.characterDevice
import typings.walk.walkStrings.directory
import typings.walk.walkStrings.file
import typings.walk.walkStrings.socket
import typings.walk.walkStrings.symbolicLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkStats extends StatsBase[Double] {
  var error: js.UndefOr[ErrnoException] = js.undefined
  var name: String
  var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket
}

object WalkStats {
  @scala.inline
  def apply(
    atime: Date,
    atimeMs: Double,
    birthtime: Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    ctime: Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double,
    mtime: Date,
    mtimeMs: Double,
    name: String,
    nlink: Double,
    rdev: Double,
    size: Double,
    `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket,
    uid: Double,
    error: ErrnoException = null
  ): WalkStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkStats]
  }
}

