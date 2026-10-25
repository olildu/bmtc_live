package app.chalo.uistate.webview;

import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/webview/WebViewUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10129a;
    public final WebViewChromeClientUIEventHandler b;
    public final WebViewClientUIEventHandler c;
    public final WebViewUISpecs d;
    public final List e;

    public WebViewUIState(String str, WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler, WebViewClientUIEventHandler webViewClientUIEventHandler, WebViewUISpecs specs, List jsInterface) {
        Intrinsics.i(specs, "specs");
        Intrinsics.i(jsInterface, "jsInterface");
        this.f10129a = str;
        this.b = webViewChromeClientUIEventHandler;
        this.c = webViewClientUIEventHandler;
        this.d = specs;
        this.e = jsInterface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewUIState)) {
            return false;
        }
        WebViewUIState webViewUIState = (WebViewUIState) obj;
        return Intrinsics.d(this.f10129a, webViewUIState.f10129a) && Intrinsics.d(this.b, webViewUIState.b) && Intrinsics.d(this.c, webViewUIState.c) && Intrinsics.d(this.d, webViewUIState.d) && Intrinsics.d(this.e, webViewUIState.e);
    }

    public final int hashCode() {
        String str = this.f10129a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        WebViewChromeClientUIEventHandler webViewChromeClientUIEventHandler = this.b;
        int iHashCode2 = (iHashCode + (webViewChromeClientUIEventHandler == null ? 0 : webViewChromeClientUIEventHandler.hashCode())) * 31;
        WebViewClientUIEventHandler webViewClientUIEventHandler = this.c;
        int iHashCode3 = (iHashCode2 + (webViewClientUIEventHandler != null ? webViewClientUIEventHandler.hashCode() : 0)) * 31;
        this.d.getClass();
        return this.e.hashCode() + ((1174890071 + iHashCode3) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewUIState(urlToLoad=");
        sb.append(this.f10129a);
        sb.append(", chromeClientUIEventHandler=");
        sb.append(this.b);
        sb.append(", webViewClientUIEventHandler=");
        sb.append(this.c);
        sb.append(", specs=");
        sb.append(this.d);
        sb.append(", jsInterface=");
        return xs.l(sb, this.e, ")");
    }

    public WebViewUIState(String str, WebViewUIStateFactory$chromeClientEventHandler$4 webViewUIStateFactory$chromeClientEventHandler$4, WebViewUIStateFactory$webViewClientEventHandler$5 webViewUIStateFactory$webViewClientEventHandler$5, int i) {
        this(str, (i & 2) != 0 ? null : webViewUIStateFactory$chromeClientEventHandler$4, (i & 4) != 0 ? null : webViewUIStateFactory$webViewClientEventHandler$5, new WebViewUISpecs(), EmptyList.f17557a);
    }
}
