package app.chalo.login.ui.userconsent;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentRequiredDialogUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserConsentRequiredDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconButtonUIState f5361a;
    public final TextUIState b;
    public final TextUIState c;
    public final ButtonUIState d;
    public final UserConsentRequiredDialogUISpec e;

    public UserConsentRequiredDialogUIState(IconButtonUIState closeBtn, TextUIState title, TextUIState desc, ButtonUIState buttonUIState) {
        UserConsentRequiredDialogUISpec userConsentRequiredDialogUISpec = new UserConsentRequiredDialogUISpec();
        Intrinsics.i(closeBtn, "closeBtn");
        Intrinsics.i(title, "title");
        Intrinsics.i(desc, "desc");
        this.f5361a = closeBtn;
        this.b = title;
        this.c = desc;
        this.d = buttonUIState;
        this.e = userConsentRequiredDialogUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentRequiredDialogUIState)) {
            return false;
        }
        UserConsentRequiredDialogUIState userConsentRequiredDialogUIState = (UserConsentRequiredDialogUIState) obj;
        return Intrinsics.d(this.f5361a, userConsentRequiredDialogUIState.f5361a) && Intrinsics.d(this.b, userConsentRequiredDialogUIState.b) && Intrinsics.d(this.c, userConsentRequiredDialogUIState.c) && Intrinsics.d(this.d, userConsentRequiredDialogUIState.d) && Intrinsics.d(this.e, userConsentRequiredDialogUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.d(this.d, pk0.c(this.c, pk0.c(this.b, this.f5361a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "UserConsentRequiredDialogUIState(closeBtn=" + this.f5361a + ", title=" + this.b + ", desc=" + this.c + ", gotItBtn=" + this.d + ", dialogUISpec=" + this.e + ")";
    }
}
