package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupID extends js.Object {
  var UserOrGroupID: Double
  var UserOrGroupType: MFUserOrUserGroupType
  def Clone(): IUserOrUserGroupID
}

object IUserOrUserGroupID {
  @scala.inline
  def apply(Clone: () => IUserOrUserGroupID, UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
}

