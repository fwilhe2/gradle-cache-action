@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface OctokitOptions {
    var authStrategy: Any?
        get() = definedExternally
        set(value) = definedExternally
    var auth: Any?
        get() = definedExternally
        set(value) = definedExternally
    var request: RequestRequestOptions?
        get() = definedExternally
        set(value) = definedExternally
    var timeZone: String?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(option: String): Any?
    @nativeSetter
    operator fun set(option: String, value: Any)
}

typealias Constructor<T> = Any

typealias ReturnTypeOf<T> = Any

typealias UnionToIntersection<Union> = Any

typealias AnyFunction = (args: Any) -> Any

typealias OctokitPlugin = (octokit: Octokit, options: OctokitOptions) -> dynamic