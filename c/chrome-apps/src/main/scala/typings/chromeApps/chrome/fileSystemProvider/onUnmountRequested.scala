package typings.chromeApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeApps.AnonABORT
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.ABORT
import typings.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typings.chromeApps.chromeAppsStrings.EXISTS
import typings.chromeApps.chromeAppsStrings.FAILED
import typings.chromeApps.chromeAppsStrings.INVALID_OPERATION
import typings.chromeApps.chromeAppsStrings.INVALID_URL
import typings.chromeApps.chromeAppsStrings.IN_USE
import typings.chromeApps.chromeAppsStrings.IO
import typings.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY
import typings.chromeApps.chromeAppsStrings.NOT_A_FILE
import typings.chromeApps.chromeAppsStrings.NOT_EMPTY
import typings.chromeApps.chromeAppsStrings.NOT_FOUND
import typings.chromeApps.chromeAppsStrings.NO_MEMORY
import typings.chromeApps.chromeAppsStrings.NO_SPACE
import typings.chromeApps.chromeAppsStrings.OK
import typings.chromeApps.chromeAppsStrings.SECURITY
import typings.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///\/\/\/\/\\\
/// EVENTS \\\
///\/\/\/\/\\\
/**
  * Raised when unmounting for the file system with the fileSystemId identifier is requested.
  * In the response, the unmount API method must be called together with successCallback.
  * If unmounting is not possible (eg. due to a pending operation), then errorCallback must be called.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onUnmountRequested")
@js.native
object onUnmountRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ UnmountRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              AnonABORT, 
              String, 
              Exclude[
                String, 
                INVALID_URL | IN_USE | OK | ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

