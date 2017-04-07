package kodando.react.router.dom

import kodando.react.*

/**
 * Created by danfma on 04/04/17.
 */

@JsName("promptWithText")
fun prompt(message: String, matched: Boolean = false): ReactElement? {
    return React.createElement(Module.PromptClass, unsafePropsBy<PromptProps> {
        this.messageText = message
        this.matched = matched
    })
}


@JsName("promptWithFunc")
fun prompt(messageFactory: (Location) -> String, matched: Boolean = false): ReactElement? {
    return React.createElement(Module.PromptClass, unsafePropsBy<PromptProps> {
        this.messageFunc = messageFactory
        this.matched = matched
    })
}