package app.chalo.uistate.webview;

import app.chalo.login.ui.userconsent.UserConsentJSInterface;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/webview/WebViewJSInterfaceSpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WebViewJSInterfaceSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserConsentJSInterface f10128a;

    public WebViewJSInterfaceSpecs(UserConsentJSInterface userConsentJSInterface) {
        this.f10128a = userConsentJSInterface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebViewJSInterfaceSpecs) && this.f10128a.equals(((WebViewJSInterfaceSpecs) obj).f10128a);
    }

    public final int hashCode() {
        return this.f10128a.hashCode() - 371946090;
    }

    public final String toString() {
        return "WebViewJSInterfaceSpecs(name=AndroidInterface, obj=" + this.f10128a + ")";
    }
}
