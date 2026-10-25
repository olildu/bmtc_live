package app.chalo.webview;

import app.chalo.uistate.components.LinearProgressIndicatorUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.webview.WebViewUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewScreenUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ToolbarUIState f11114a;
    public final WebViewUIState b;
    public final LinearProgressIndicatorUIState c;
    public final WebViewScreenUISpec d;

    public WebViewScreenUIState(ToolbarUIState toolbarUIState, WebViewUIState webViewUIState, LinearProgressIndicatorUIState linearProgressIndicatorUIState) {
        WebViewScreenUISpec webViewScreenUISpec = new WebViewScreenUISpec();
        this.f11114a = toolbarUIState;
        this.b = webViewUIState;
        this.c = linearProgressIndicatorUIState;
        this.d = webViewScreenUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewScreenUIState)) {
            return false;
        }
        WebViewScreenUIState webViewScreenUIState = (WebViewScreenUIState) obj;
        return Intrinsics.d(this.f11114a, webViewScreenUIState.f11114a) && Intrinsics.d(this.b, webViewScreenUIState.b) && Intrinsics.d(this.c, webViewScreenUIState.c) && Intrinsics.d(this.d, webViewScreenUIState.d);
    }

    public final int hashCode() {
        ToolbarUIState toolbarUIState = this.f11114a;
        int iHashCode = (toolbarUIState == null ? 0 : toolbarUIState.hashCode()) * 31;
        WebViewUIState webViewUIState = this.b;
        int iHashCode2 = (iHashCode + (webViewUIState == null ? 0 : webViewUIState.hashCode())) * 31;
        LinearProgressIndicatorUIState linearProgressIndicatorUIState = this.c;
        return this.d.hashCode() + ((iHashCode2 + (linearProgressIndicatorUIState != null ? linearProgressIndicatorUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WebViewScreenUIState(toolbar=" + this.f11114a + ", webView=" + this.b + ", progress=" + this.c + ", specs=" + this.d + ")";
    }
}
