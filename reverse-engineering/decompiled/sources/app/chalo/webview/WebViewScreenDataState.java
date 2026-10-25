package app.chalo.webview;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11106a;
    public final String b;
    public final boolean c;
    public final Float d;

    public WebViewScreenDataState(String str, String str2, boolean z, Float f) {
        this.f11106a = str;
        this.b = str2;
        this.c = z;
        this.d = f;
    }

    public static WebViewScreenDataState a(WebViewScreenDataState webViewScreenDataState, Float f) {
        String str = webViewScreenDataState.f11106a;
        String str2 = webViewScreenDataState.b;
        boolean z = webViewScreenDataState.c;
        webViewScreenDataState.getClass();
        return new WebViewScreenDataState(str, str2, z, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewScreenDataState)) {
            return false;
        }
        WebViewScreenDataState webViewScreenDataState = (WebViewScreenDataState) obj;
        return Intrinsics.d(this.f11106a, webViewScreenDataState.f11106a) && Intrinsics.d(this.b, webViewScreenDataState.b) && this.c == webViewScreenDataState.c && Intrinsics.d(this.d, webViewScreenDataState.d);
    }

    public final int hashCode() {
        String str = this.f11106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.c ? 1231 : 1237)) * 31;
        Float f = this.d;
        return iHashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WebViewScreenDataState(url=", this.f11106a, ", name=", this.b, ", hideActionBar=");
        sbE.append(this.c);
        sbE.append(", webPageLoadProgress=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
