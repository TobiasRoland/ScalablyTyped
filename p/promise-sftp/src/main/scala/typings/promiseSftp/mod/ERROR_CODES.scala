package typings.promiseSftp.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERROR_CODES extends js.Object

@JSImport("promise-sftp", "ERROR_CODES")
@js.native
object ERROR_CODES extends js.Object {
  @js.native
  sealed trait BAD_MESSAGE extends ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_CONFLICT extends ERROR_CODES
  
  @js.native
  sealed trait BYTE_RANGE_LOCK_REFUSED extends ERROR_CODES
  
  @js.native
  sealed trait CANNOT_DELETE extends ERROR_CODES
  
  @js.native
  sealed trait CONNECTION_LOST extends ERROR_CODES
  
  @js.native
  sealed trait DELETE_PENDING extends ERROR_CODES
  
  @js.native
  sealed trait DIR_NOT_EMPTY extends ERROR_CODES
  
  @js.native
  sealed trait EOF extends ERROR_CODES
  
  @js.native
  sealed trait FAILURE extends ERROR_CODES
  
  @js.native
  sealed trait FILE_ALREADY_EXISTS extends ERROR_CODES
  
  @js.native
  sealed trait FILE_CORRUPT extends ERROR_CODES
  
  @js.native
  sealed trait FILE_IS_A_DIRECTORY extends ERROR_CODES
  
  @js.native
  sealed trait GROUP_INVALID extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_FILENAME extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_HANDLE extends ERROR_CODES
  
  @js.native
  sealed trait INVALID_PARAMETER extends ERROR_CODES
  
  @js.native
  sealed trait LINK_LOOP extends ERROR_CODES
  
  @js.native
  sealed trait LOCK_CONFLICT extends ERROR_CODES
  
  @js.native
  sealed trait NOT_A_DIRECTORY extends ERROR_CODES
  
  @js.native
  sealed trait NO_CONNECTION extends ERROR_CODES
  
  @js.native
  sealed trait NO_MATCHING_BYTE_RANGE_LOCK extends ERROR_CODES
  
  @js.native
  sealed trait NO_MEDIA extends ERROR_CODES
  
  @js.native
  sealed trait NO_SPACE_ON_FILESYSTEM extends ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_FILE extends ERROR_CODES
  
  @js.native
  sealed trait NO_SUCH_PATH extends ERROR_CODES
  
  @js.native
  sealed trait OK extends ERROR_CODES
  
  @js.native
  sealed trait OP_UNSUPPORTED extends ERROR_CODES
  
  @js.native
  sealed trait OWNER_INVALID extends ERROR_CODES
  
  @js.native
  sealed trait PERMISSION_DENIED extends ERROR_CODES
  
  @js.native
  sealed trait QUOTA_EXCEEDED extends ERROR_CODES
  
  @js.native
  sealed trait UNKNOWN_PRINCIPAL extends ERROR_CODES
  
  @js.native
  sealed trait WRITE_PROTECT extends ERROR_CODES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR_CODES with Double] = js.native
  /* 5 */ @js.native
  object BAD_MESSAGE extends TopLevel[BAD_MESSAGE with Double]
  
  /* 25 */ @js.native
  object BYTE_RANGE_LOCK_CONFLICT extends TopLevel[BYTE_RANGE_LOCK_CONFLICT with Double]
  
  /* 26 */ @js.native
  object BYTE_RANGE_LOCK_REFUSED extends TopLevel[BYTE_RANGE_LOCK_REFUSED with Double]
  
  /* 22 */ @js.native
  object CANNOT_DELETE extends TopLevel[CANNOT_DELETE with Double]
  
  /* 7 */ @js.native
  object CONNECTION_LOST extends TopLevel[CONNECTION_LOST with Double]
  
  /* 27 */ @js.native
  object DELETE_PENDING extends TopLevel[DELETE_PENDING with Double]
  
  /* 18 */ @js.native
  object DIR_NOT_EMPTY extends TopLevel[DIR_NOT_EMPTY with Double]
  
  /* 1 */ @js.native
  object EOF extends TopLevel[EOF with Double]
  
  /* 4 */ @js.native
  object FAILURE extends TopLevel[FAILURE with Double]
  
  /* 11 */ @js.native
  object FILE_ALREADY_EXISTS extends TopLevel[FILE_ALREADY_EXISTS with Double]
  
  /* 28 */ @js.native
  object FILE_CORRUPT extends TopLevel[FILE_CORRUPT with Double]
  
  /* 24 */ @js.native
  object FILE_IS_A_DIRECTORY extends TopLevel[FILE_IS_A_DIRECTORY with Double]
  
  /* 30 */ @js.native
  object GROUP_INVALID extends TopLevel[GROUP_INVALID with Double]
  
  /* 20 */ @js.native
  object INVALID_FILENAME extends TopLevel[INVALID_FILENAME with Double]
  
  /* 9 */ @js.native
  object INVALID_HANDLE extends TopLevel[INVALID_HANDLE with Double]
  
  /* 23 */ @js.native
  object INVALID_PARAMETER extends TopLevel[INVALID_PARAMETER with Double]
  
  /* 21 */ @js.native
  object LINK_LOOP extends TopLevel[LINK_LOOP with Double]
  
  /* 17 */ @js.native
  object LOCK_CONFLICT extends TopLevel[LOCK_CONFLICT with Double]
  
  /* 19 */ @js.native
  object NOT_A_DIRECTORY extends TopLevel[NOT_A_DIRECTORY with Double]
  
  /* 6 */ @js.native
  object NO_CONNECTION extends TopLevel[NO_CONNECTION with Double]
  
  /* 31 */ @js.native
  object NO_MATCHING_BYTE_RANGE_LOCK extends TopLevel[NO_MATCHING_BYTE_RANGE_LOCK with Double]
  
  /* 13 */ @js.native
  object NO_MEDIA extends TopLevel[NO_MEDIA with Double]
  
  /* 14 */ @js.native
  object NO_SPACE_ON_FILESYSTEM extends TopLevel[NO_SPACE_ON_FILESYSTEM with Double]
  
  /* 2 */ @js.native
  object NO_SUCH_FILE extends TopLevel[NO_SUCH_FILE with Double]
  
  /* 10 */ @js.native
  object NO_SUCH_PATH extends TopLevel[NO_SUCH_PATH with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 8 */ @js.native
  object OP_UNSUPPORTED extends TopLevel[OP_UNSUPPORTED with Double]
  
  /* 29 */ @js.native
  object OWNER_INVALID extends TopLevel[OWNER_INVALID with Double]
  
  /* 3 */ @js.native
  object PERMISSION_DENIED extends TopLevel[PERMISSION_DENIED with Double]
  
  /* 15 */ @js.native
  object QUOTA_EXCEEDED extends TopLevel[QUOTA_EXCEEDED with Double]
  
  /* 16 */ @js.native
  object UNKNOWN_PRINCIPAL extends TopLevel[UNKNOWN_PRINCIPAL with Double]
  
  /* 12 */ @js.native
  object WRITE_PROTECT extends TopLevel[WRITE_PROTECT with Double]
  
}

