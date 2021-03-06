package typings.naverWhale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwhale extends js.Object {
  ////////////////////
  // Alarms
  ////////////////////
  /**
    * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
    * Availability: Since Chrome 22.
    * Permissions:  "alarms"
    */
  val alarms: Typeofalarms
  ////////////////////
  // Bookmarks
  ////////////////////
  /**
    * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
    * Availability: Since Chrome 5.
    * Permissions:  "bookmarks"
    */
  val bookmarks: Typeofbookmarks
  ////////////////////
  // Browser Action
  ////////////////////
  /**
    * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
    * Availability: Since Chrome 5.
    * Manifest:  "browser_action": {...}
    */
  val browserAction: TypeofbrowserAction
  ////////////////////
  // Browsing Data
  ////////////////////
  /**
    * Use the chrome.browsingData API to remove browsing data from a user's local profile.
    * Availability: Since Chrome 19.
    * Permissions:  "browsingData"
    */
  val browsingData: TypeofbrowsingData
  ////////////////////
  // Commands
  ////////////////////
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
    * Availability: Since Chrome 25.
    * Manifest:  "commands": {...}
    */
  val commands: Typeofcommands
  ////////////////////
  // Content Settings
  ////////////////////
  /**
    * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
    * Availability: Since Chrome 16.
    * Permissions:  "contentSettings"
    */
  val contentSettings: TypeofcontentSettings
  ////////////////////
  // Context Menus
  ////////////////////
  /**
    * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
    * Availability: Since Chrome 6.
    * Permissions:  "contextMenus"
    */
  val contextMenus: TypeofcontextMenus
  ////////////////////
  // Cookies
  ////////////////////
  /**
    * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
    * Availability: Since Chrome 6.
    * Permissions:  "cookies", host permissions
    */
  val cookies: Typeofcookies
  ////////////////////
  // Declarative Content
  ////////////////////
  /**
    * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
    * Availability: Since Chrome 33.
    * Permissions:  "declarativeContent"
    */
  val declarativeContent: TypeofdeclarativeContent
  ////////////////////
  // DesktopCapture
  ////////////////////
  /**
    * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
    * Availability: Since Chrome 34.
    * Permissions:  "desktopCapture"
    */
  val desktopCapture: TypeofdesktopCapture
  val devtools: Typeofdevtools
  val downloads: Typeofdownloads
  ////////////////////
  // Events
  ////////////////////
  /**
    * The chrome.events namespace contains common types used by APIs dispatching events to notify you when something interesting happens.
    * Availability: Since Chrome 21.
    */
  val events: js.Any
  ////////////////////
  // Extension
  ////////////////////
  /**
    * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
    * Availability: Since Chrome 5.
    */
  val extension: Typeofextension
  ////////////////////
  // Font Settings
  ////////////////////
  /**
    * Use the chrome.fontSettings API to manage Chrome's font settings.
    * Availability: Since Chrome 22.
    * Permissions:  "fontSettings"
    */
  val fontSettings: TypeoffontSettings
  ////////////////////
  // Google Cloud Messaging
  ////////////////////
  /**
    * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
    * Availability: Since Chrome 35.
    * Permissions:  "gcm"
    */
  val gcm: Typeofgcm
  ////////////////////
  // History
  ////////////////////
  /**
    * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    * Availability: Since Chrome 5.
    * Permissions:  "history"
    */
  val history: Typeofhistory
  ////////////////////
  // i18n
  ////////////////////
  /**
    * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
    * @since Chrome 5.
    */
  val i18n: Typeofi18n
  ////////////////////
  // Idle
  ////////////////////
  /**
    * Use the chrome.idle API to detect when the machine's idle state changes.
    * Permissions:  "idle"
    * @since Chrome 6.
    */
  val idle: Typeofidle
  ////////////////////
  // Management
  ////////////////////
  /**
    * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
    * Permissions:  "management"
    * @since Chrome 8.
    */
  val management: Typeofmanagement
  ////////////////////
  // Notifications
  // https://developer.chrome.com/extensions/notifications
  ////////////////////
  /**
    * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
    * Permissions:  "notifications"
    * @since Chrome 28.
    */
  val notifications: Typeofnotifications
  ////////////////////
  // Omnibox
  ////////////////////
  /**
    * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
    * Manifest:  "omnibox": {...}
    * @since Chrome 9.
    */
  val omnibox: Typeofomnibox
  ////////////////////
  // Page Action
  ////////////////////
  /**
    * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
    * Manifest:  "page_action": {...}
    * @since Chrome 5.
    */
  val pageAction: TypeofpageAction
  ////////////////////
  // Page Capture
  ////////////////////
  /**
    * Use the chrome.pageCapture API to save a tab as MHTML.
    * Permissions:  "pageCapture"
    * @since Chrome 18.
    */
  val pageCapture: TypeofpageCapture
  ////////////////////
  // Permissions
  ////////////////////
  /**
    * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
    * @since Chrome 16.
    */
  val permissions: Typeofpermissions
  ////////////////////
  // Power
  ////////////////////
  /**
    * Use the chrome.power API to override the system's power management features.
    * Permissions:  "power"
    * @since Chrome 27.
    */
  val power: Typeofpower
  ////////////////////
  // Printer Provider
  ////////////////////
  /**
    * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
    * Permissions:  "printerProvider"
    * @since Chrome 44.
    */
  val printerProvider: TypeofprinterProvider
  ////////////////////
  // Privacy
  ////////////////////
  /**
    * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
    * Permissions:  "privacy"
    * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
    * @since Chrome 18.
    */
  val privacy: Typeofprivacy
  ////////////////////
  // Proxy
  ////////////////////
  /**
    * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
    * Permissions:  "proxy"
    * @since Chrome 13.
    */
  val proxy: Typeofproxy
  ////////////////////
  // Runtime
  ////////////////////
  /**
    * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
    * @since Chrome 22
    */
  val runtime: Typeofruntime
  val sidebarAction: TypeofsidebarAction
  ////////////////////
  // Storage
  ////////////////////
  /**
    * Use the chrome.storage API to store, retrieve, and track changes to user data.
    * Permissions:  "storage"
    * @since Chrome 20.
    */
  val storage: Typeofstorage
  val system: Typeofsystem
  ////////////////////
  // TabCapture
  ////////////////////
  /**
    * Use the chrome.tabCapture API to interact with tab media streams.
    * Permissions:  "tabCapture"
    * @since Chrome 31.
    */
  val tabCapture: TypeoftabCapture
  ////////////////////
  // Tabs
  ////////////////////
  /**
    * Use the chrome.tabs API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
    * Permissions: The majority of the chrome.tabs API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab.
    * @since Chrome 5.
    */
  val tabs: Typeoftabs
  val topSites: TypeoftopSites
  ////////////////////
  // Text to Speech
  ////////////////////
  /**
    * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
    * Permissions:  "tts"
    * @since Chrome 14.
    */
  val tts: Typeoftts
  ////////////////////
  // Text to Speech Engine
  ////////////////////
  /**
    * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
    * Permissions:  "ttsEngine"
    * @since Chrome 14.
    */
  val ttsEngine: TypeofttsEngine
  ////////////////////
  // Types
  ////////////////////
  /**
    * The chrome.types API contains type declarations for Chrome.
    * @since Chrome 13.
    */
  val types: js.Any
  ////////////////////
  // Web Navigation
  ////////////////////
  /**
    * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
    * Permissions:  "webNavigation"
    * @since Chrome 16.
    */
  val webNavigation: TypeofwebNavigation
  ////////////////////
  // Web Request
  ////////////////////
  /**
    * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
    * Permissions:  "webRequest", host permissions
    * @since Chrome 17.
    */
  val webRequest: TypeofwebRequest
  ////////////////////
  // Windows
  ////////////////////
  /**
    * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
    * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
    * @since Chrome 5.
    */
  val windows: Typeofwindows
}

object Typeofwhale {
  @scala.inline
  def apply(
    alarms: Typeofalarms,
    bookmarks: Typeofbookmarks,
    browserAction: TypeofbrowserAction,
    browsingData: TypeofbrowsingData,
    commands: Typeofcommands,
    contentSettings: TypeofcontentSettings,
    contextMenus: TypeofcontextMenus,
    cookies: Typeofcookies,
    declarativeContent: TypeofdeclarativeContent,
    desktopCapture: TypeofdesktopCapture,
    devtools: Typeofdevtools,
    downloads: Typeofdownloads,
    events: js.Any,
    extension: Typeofextension,
    fontSettings: TypeoffontSettings,
    gcm: Typeofgcm,
    history: Typeofhistory,
    i18n: Typeofi18n,
    idle: Typeofidle,
    management: Typeofmanagement,
    notifications: Typeofnotifications,
    omnibox: Typeofomnibox,
    pageAction: TypeofpageAction,
    pageCapture: TypeofpageCapture,
    permissions: Typeofpermissions,
    power: Typeofpower,
    printerProvider: TypeofprinterProvider,
    privacy: Typeofprivacy,
    proxy: Typeofproxy,
    runtime: Typeofruntime,
    sidebarAction: TypeofsidebarAction,
    storage: Typeofstorage,
    system: Typeofsystem,
    tabCapture: TypeoftabCapture,
    tabs: Typeoftabs,
    topSites: TypeoftopSites,
    tts: Typeoftts,
    ttsEngine: TypeofttsEngine,
    types: js.Any,
    webNavigation: TypeofwebNavigation,
    webRequest: TypeofwebRequest,
    windows: Typeofwindows
  ): Typeofwhale = {
    val __obj = js.Dynamic.literal(alarms = alarms.asInstanceOf[js.Any], bookmarks = bookmarks.asInstanceOf[js.Any], browserAction = browserAction.asInstanceOf[js.Any], browsingData = browsingData.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contentSettings = contentSettings.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], declarativeContent = declarativeContent.asInstanceOf[js.Any], desktopCapture = desktopCapture.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], fontSettings = fontSettings.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], omnibox = omnibox.asInstanceOf[js.Any], pageAction = pageAction.asInstanceOf[js.Any], pageCapture = pageCapture.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], printerProvider = printerProvider.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sidebarAction = sidebarAction.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], tabCapture = tabCapture.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], topSites = topSites.asInstanceOf[js.Any], tts = tts.asInstanceOf[js.Any], ttsEngine = ttsEngine.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], webNavigation = webNavigation.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofwhale]
  }
}

