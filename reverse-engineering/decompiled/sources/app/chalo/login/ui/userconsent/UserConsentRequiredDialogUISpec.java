package app.chalo.login.ui.userconsent;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentRequiredDialogUISpec;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserConsentRequiredDialogUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogUIEventHandler f5360a;
    public final ChaloPadding b;
    public final ChaloPadding c;
    public final ChaloPadding d;
    public final ChaloColorToken e;
    public final UIShape f;

    public UserConsentRequiredDialogUISpec() {
        DialogUIEventHandler dialogUIEventHandler = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.f9986a);
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().i);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, ChaloThemeHelper.a().h, 6);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().l, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().f;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        this.f5360a = dialogUIEventHandler;
        this.b = chaloPadding;
        this.c = chaloPadding2;
        this.d = chaloPadding3;
        this.e = ChaloColorToken.White.f9870a;
        this.f = rectangle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentRequiredDialogUISpec)) {
            return false;
        }
        UserConsentRequiredDialogUISpec userConsentRequiredDialogUISpec = (UserConsentRequiredDialogUISpec) obj;
        return Intrinsics.d(this.f5360a, userConsentRequiredDialogUISpec.f5360a) && Intrinsics.d(this.b, userConsentRequiredDialogUISpec.b) && Intrinsics.d(this.c, userConsentRequiredDialogUISpec.c) && Intrinsics.d(this.d, userConsentRequiredDialogUISpec.d) && Intrinsics.d(this.e, userConsentRequiredDialogUISpec.e) && Intrinsics.d(this.f, userConsentRequiredDialogUISpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + z40.b(this.e, r30.c(this.d, r30.c(this.c, r30.c(this.b, this.f5360a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserConsentRequiredDialogUISpec(dialogHandler=");
        sb.append(this.f5360a);
        sb.append(", internalPadding=");
        sb.append(this.b);
        sb.append(", paddingAroundTitle=");
        r30.o(sb, this.c, ", paddingAroundGotItBtn=", this.d, ", background=");
        sb.append(this.e);
        sb.append(", shape=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
