package app.chalo.login.ui.userconsent;

import android.webkit.JavascriptInterface;
import app.chalo.compose.webview.WebViewJavascriptInterface;
import defpackage.ln1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentJSInterface;", "Lapp/chalo/compose/webview/WebViewJavascriptInterface;", "", "acceptClicked", "()V", "denyClicked", "skipClicked", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserConsentJSInterface extends WebViewJavascriptInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln1 f5359a;
    public final ln1 b;
    public final ln1 c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentJSInterface$Companion;", "", "", "ACCEPT_CLICKED", "Ljava/lang/String;", "DENY_CLICKED", "SKIP_CLICKED", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UserConsentJSInterface(ln1 ln1Var, ln1 ln1Var2, ln1 ln1Var3) {
        this.f5359a = ln1Var;
        this.b = ln1Var2;
        this.c = ln1Var3;
    }

    @JavascriptInterface
    public final void acceptClicked() {
        this.f5359a.invoke();
    }

    @JavascriptInterface
    public final void denyClicked() {
        this.b.invoke();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentJSInterface)) {
            return false;
        }
        UserConsentJSInterface userConsentJSInterface = (UserConsentJSInterface) obj;
        return this.f5359a.equals(userConsentJSInterface.f5359a) && this.b.equals(userConsentJSInterface.b) && this.c.equals(userConsentJSInterface.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5359a.hashCode() * 31)) * 31);
    }

    @JavascriptInterface
    public final void skipClicked() {
        this.c.invoke();
    }

    public final String toString() {
        return "UserConsentJSInterface(onAcceptClicked=" + this.f5359a + ", onDenyClicked=" + this.b + ", onSkipClicked=" + this.c + ")";
    }
}
