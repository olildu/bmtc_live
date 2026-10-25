package app.chalo.compose.webview;

import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/compose/webview/WebViewInternalState;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewInternalState {
    public static final WebViewInternalState j = new WebViewInternalState(null, null, null, true, false, true, 1, true, EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1935a;
    public final CWebChromeClient b;
    public final CWebViewClient c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final List i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/webview/WebViewInternalState$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public WebViewInternalState(String str, CWebChromeClient cWebChromeClient, CWebViewClient cWebViewClient, boolean z, boolean z2, boolean z3, int i, boolean z4, List jsInterfaceSpecs) {
        Intrinsics.i(jsInterfaceSpecs, "jsInterfaceSpecs");
        this.f1935a = str;
        this.b = cWebChromeClient;
        this.c = cWebViewClient;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.h = z4;
        this.i = jsInterfaceSpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewInternalState)) {
            return false;
        }
        WebViewInternalState webViewInternalState = (WebViewInternalState) obj;
        return Intrinsics.d(this.f1935a, webViewInternalState.f1935a) && Intrinsics.d(this.b, webViewInternalState.b) && Intrinsics.d(this.c, webViewInternalState.c) && this.d == webViewInternalState.d && this.e == webViewInternalState.e && this.f == webViewInternalState.f && this.g == webViewInternalState.g && this.h == webViewInternalState.h && Intrinsics.d(this.i, webViewInternalState.i);
    }

    public final int hashCode() {
        String str = this.f1935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CWebChromeClient cWebChromeClient = this.b;
        int iHashCode2 = (iHashCode + (cWebChromeClient == null ? 0 : cWebChromeClient.hashCode())) * 31;
        CWebViewClient cWebViewClient = this.c;
        return this.i.hashCode() + ((((((((((((iHashCode2 + (cWebViewClient != null ? cWebViewClient.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewInternalState(loadedUrl=");
        sb.append(this.f1935a);
        sb.append(", chromeClient=");
        sb.append(this.b);
        sb.append(", webViewClient=");
        sb.append(this.c);
        sb.append(", builtInZoomControls=");
        sb.append(this.d);
        sb.append(", displayZoomControls=");
        z40.r(sb, this.e, ", useWideViewPort=", this.f, ", initialScale=");
        sb.append(this.g);
        sb.append(", javaScriptEnabled=");
        sb.append(this.h);
        sb.append(", jsInterfaceSpecs=");
        return xs.l(sb, this.i, ")");
    }
}
