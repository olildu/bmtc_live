package app.chalo.uistate.webview;

import defpackage.i81;
import defpackage.lp1;
import defpackage.on;
import defpackage.sh1;
import defpackage.z80;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/webview/WebViewUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewUIStateFactory {
    /* JADX WARN: Type inference failed for: r2v1, types: [app.chalo.uistate.webview.WebViewUIStateFactory$chromeClientEventHandler$4] */
    public static WebViewUIStateFactory$chromeClientEventHandler$4 a(final Function1 function1) {
        final on onVar = new on(17);
        final i81 i81Var = new i81(19);
        return new WebViewChromeClientUIEventHandler() { // from class: app.chalo.uistate.webview.WebViewUIStateFactory$chromeClientEventHandler$4
            @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
            public final void a(String str) {
                onVar.invoke(str);
            }

            @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
            public final void b(int i) {
                function1.invoke(Integer.valueOf(i));
            }

            @Override // app.chalo.uistate.webview.WebViewChromeClientUIEventHandler
            public final void c(String str, boolean z) {
                i81Var.invoke(str, Boolean.valueOf(z));
            }
        };
    }

    public static WebViewUIState b(String urlToLoad, WebViewUIStateFactory$chromeClientEventHandler$4 webViewUIStateFactory$chromeClientEventHandler$4, WebViewUIStateFactory$webViewClientEventHandler$5 webViewUIStateFactory$webViewClientEventHandler$5, List list, int i) {
        WebViewUISpecs webViewUISpecs = new WebViewUISpecs();
        if ((i & 16) != 0) {
            list = EmptyList.f17557a;
        }
        List jsInterfaceSpecs = list;
        Intrinsics.i(urlToLoad, "urlToLoad");
        Intrinsics.i(jsInterfaceSpecs, "jsInterfaceSpecs");
        return new WebViewUIState(urlToLoad, webViewUIStateFactory$chromeClientEventHandler$4, webViewUIStateFactory$webViewClientEventHandler$5, webViewUISpecs, jsInterfaceSpecs);
    }

    public static WebViewUIStateFactory$webViewClientEventHandler$5 c(sh1 sh1Var, Function1 function1, Function2 function2, lp1 lp1Var, lp1 lp1Var2, int i) {
        Function1 onVar = sh1Var;
        if ((i & 1) != 0) {
            onVar = new on(17);
        }
        if ((i & 2) != 0) {
            function1 = new on(17);
        }
        if ((i & 4) != 0) {
            function2 = new i81(18);
        }
        if ((i & 8) != 0) {
            lp1Var = null;
        }
        if ((i & 16) != 0) {
            lp1Var2 = null;
        }
        return new WebViewUIStateFactory$webViewClientEventHandler$5(new z80(5, lp1Var, lp1Var2), onVar, function1, function2);
    }
}
