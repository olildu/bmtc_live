package app.chalo.login.ui.options;

import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginSupportedCountryDialogUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginSupportedCountryDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f5322a;
    public final ArrayList b;
    public final DialogUIEventHandler c;
    public final LoginSupportedCountryDialogSpec d;

    public LoginSupportedCountryDialogUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList) {
        DialogUIEventHandler dialogUIEventHandler = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.f9986a);
        LoginSupportedCountryDialogSpec loginSupportedCountryDialogSpec = new LoginSupportedCountryDialogSpec();
        this.f5322a = chaloTextUIState;
        this.b = arrayList;
        this.c = dialogUIEventHandler;
        this.d = loginSupportedCountryDialogSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginSupportedCountryDialogUIState)) {
            return false;
        }
        LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState = (LoginSupportedCountryDialogUIState) obj;
        return Intrinsics.d(this.f5322a, loginSupportedCountryDialogUIState.f5322a) && Intrinsics.d(this.b, loginSupportedCountryDialogUIState.b) && Intrinsics.d(this.c, loginSupportedCountryDialogUIState.c) && Intrinsics.d(this.d, loginSupportedCountryDialogUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xs.e(this.b, this.f5322a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "LoginSupportedCountryDialogUIState(title=" + this.f5322a + ", supportedCountryList=" + this.b + ", dialogUIEventHandler=" + this.c + ", spec=" + this.d + ")";
    }
}
