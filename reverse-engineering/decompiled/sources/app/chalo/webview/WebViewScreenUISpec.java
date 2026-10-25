package app.chalo.webview;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/webview/WebViewScreenUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f11113a = new ChaloPadding(0.0f, ChaloThemeHelper.a().c, 1);
    public final ChaloColorToken b = ChaloColorToken.GreyColor.f9806a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewScreenUISpec)) {
            return false;
        }
        WebViewScreenUISpec webViewScreenUISpec = (WebViewScreenUISpec) obj;
        return Intrinsics.d(this.f11113a, webViewScreenUISpec.f11113a) && Intrinsics.d(this.b, webViewScreenUISpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11113a.hashCode() * 31);
    }

    public final String toString() {
        return "WebViewScreenUISpec(paddingAroundProgressIndicator=" + this.f11113a + ", backgroundBehindProgressBar=" + this.b + ")";
    }
}
