package app.chalo.login.ui.userconsent;

import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.webview.WebViewUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserConsentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingDialogUIState f5365a;
    public final WebViewUIState b;
    public final CircularProgressIndicatorUIState c;
    public final UserConsentRequiredDialogUIState d;
    public final StandardErrorScreenUIState e;
    public final ChaloColorToken f = ChaloColorToken.White.f9870a;

    public UserConsentUIState(LoadingDialogUIState loadingDialogUIState, WebViewUIState webViewUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, UserConsentRequiredDialogUIState userConsentRequiredDialogUIState, StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
        this.f5365a = loadingDialogUIState;
        this.b = webViewUIState;
        this.c = circularProgressIndicatorUIState;
        this.d = userConsentRequiredDialogUIState;
        this.e = errorWithMsgAndRetry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentUIState)) {
            return false;
        }
        UserConsentUIState userConsentUIState = (UserConsentUIState) obj;
        return Intrinsics.d(this.f5365a, userConsentUIState.f5365a) && Intrinsics.d(this.b, userConsentUIState.b) && Intrinsics.d(this.c, userConsentUIState.c) && Intrinsics.d(this.d, userConsentUIState.d) && Intrinsics.d(this.e, userConsentUIState.e) && Intrinsics.d(this.f, userConsentUIState.f);
    }

    public final int hashCode() {
        LoadingDialogUIState loadingDialogUIState = this.f5365a;
        int iHashCode = (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode()) * 31;
        WebViewUIState webViewUIState = this.b;
        int iHashCode2 = (iHashCode + (webViewUIState == null ? 0 : webViewUIState.hashCode())) * 31;
        CircularProgressIndicatorUIState circularProgressIndicatorUIState = this.c;
        int iHashCode3 = (iHashCode2 + (circularProgressIndicatorUIState == null ? 0 : circularProgressIndicatorUIState.hashCode())) * 31;
        UserConsentRequiredDialogUIState userConsentRequiredDialogUIState = this.d;
        int iHashCode4 = (iHashCode3 + (userConsentRequiredDialogUIState == null ? 0 : userConsentRequiredDialogUIState.hashCode())) * 31;
        StandardErrorScreenUIState standardErrorScreenUIState = this.e;
        return this.f.hashCode() + ((iHashCode4 + (standardErrorScreenUIState != null ? standardErrorScreenUIState.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UserConsentUIState(loadingDialog=" + this.f5365a + ", webView=" + this.b + ", webViewLoader=" + this.c + ", consentRequiredDialog=" + this.d + ", error=" + this.e + ", webViewLoaderBackgroundColor=" + this.f + ")";
    }
}
