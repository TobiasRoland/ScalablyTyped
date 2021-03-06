package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XPreparedStatement
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for preparation of commands.
  *
  * A command could be a table, query, or any kind of SQL statement prepared by the user.
  */
trait XCommandPreparation extends XInterface {
  /**
    * creates a {@link com.sun.star.sdbc.PreparedStatement} object for sending parameterized SQL statements to the database.
    *
    * A SQL statement with or without IN parameters can be pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to
    * efficiently execute this statement multiple times.
    * @param command the command to be prepared. Any SQL statement.
    * @param commandType kind of the command {@link com.sun.star.sdb.CommandType}
    * @returns the {@link PreparedStatement} object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def prepareCommand(command: String, commandType: Double): XPreparedStatement
}

object XCommandPreparation {
  @scala.inline
  def apply(
    acquire: () => Unit,
    prepareCommand: (String, Double) => XPreparedStatement,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCommandPreparation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), prepareCommand = js.Any.fromFunction2(prepareCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCommandPreparation]
  }
}

