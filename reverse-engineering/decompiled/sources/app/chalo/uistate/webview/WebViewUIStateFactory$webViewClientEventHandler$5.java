package app.chalo.uistate.webview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/webview/WebViewUIStateFactory$webViewClientEventHandler$5", "Lapp/chalo/uistate/webview/WebViewClientUIEventHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewUIStateFactory$webViewClientEventHandler$5 implements WebViewClientUIEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f10131a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function2 d;

    public WebViewUIStateFactory$webViewClientEventHandler$5(Function1 function1, Function1 function2, Function1 function3, Function2 function4) {
        this.f10131a = function1;
        this.b = function2;
        this.c = function3;
        this.d = function4;
    }

    @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
    public final void a(String str) {
        this.b.invoke(str);
    }

    @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
    public final boolean b(String str) {
        return ((Boolean) this.f10131a.invoke(str)).booleanValue();
    }

    @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
    public final void c(Integer num, String str) {
        this.d.invoke(num, str);
    }

    @Override // app.chalo.uistate.webview.WebViewClientUIEventHandler
    public final void d(String str) {
        this.c.invoke(str);
    }
}
