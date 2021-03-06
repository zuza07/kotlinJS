import html.println0
import services.ControllerLogon
import utils.ff

/*
@JsModule("dlg_logon")
@JsNonModule
@JsName("dlg_logon")
external fun dlg_logon(any: Any? = definedExternally): dynamic
*/

@JsModule("dayjs")
@JsNonModule
@JsName("dayjs")
external fun dayjs(any: Any? = definedExternally): dynamic

/*
fun main() {
    println("Hello Kotlin/JS!! ${dayjs()}")
    println("this year         ${dayjs().year()}")
    println("Valentine         ${dayjs("2020-02-14")}")
    println("Formatted date    ${dayjs().format()}")

    println("teste do zuza 01")

    ff.println0("teste da implementação")
}
*/

fun main(args: Array<String>) {
//fun main() {

    val sUrl = js("document.URL").toString()

    ff.gsUrlLogon = sUrl
    if (sUrl.contains("/pro/")) {
        ff.gsDesenvolvedor = "P"
    }

    if (sUrl.contains("/pro/") || sUrl.contains("/hom/")) {
        ff.gsCamView = "html/"
    } else {
        //ff.gsCamView = "main/resources/html/"
        ff.gsCamView = "kotlin/html/"
    }

    println0("abrindo main.logon ${ff.gsCamView}")
    ControllerLogon().abrirCabec("CabecLogon")
}

@JsName("passMapear")
fun passMapear() {
    ControllerLogon().passMapear()
}

