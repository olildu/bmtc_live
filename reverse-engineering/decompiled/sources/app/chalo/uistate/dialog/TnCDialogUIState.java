package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/TnCDialogUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TnCDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TnCDialogUISpecs f10014a;
    public final DialogUIEventHandler b;
    public final TextUIState.ChaloTextUIState c;
    public final List d;
    public final ButtonContainerUIState e;
    public final DividerUIState f;

    public TnCDialogUIState(DialogUIEventHandler dialogDismissHandler, TextUIState.ChaloTextUIState title, List termsList, ButtonContainerUIState buttonContainerUIState, int i) {
        TnCDialogUISpecs tnCDialogUISpecs = new TnCDialogUISpecs();
        DividerUIState dividerUIState = (i & 32) != 0 ? new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, DividerOrientation.Horizontal) : null;
        Intrinsics.i(dialogDismissHandler, "dialogDismissHandler");
        Intrinsics.i(title, "title");
        Intrinsics.i(termsList, "termsList");
        this.f10014a = tnCDialogUISpecs;
        this.b = dialogDismissHandler;
        this.c = title;
        this.d = termsList;
        this.e = buttonContainerUIState;
        this.f = dividerUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TnCDialogUIState)) {
            return false;
        }
        TnCDialogUIState tnCDialogUIState = (TnCDialogUIState) obj;
        return Intrinsics.d(this.f10014a, tnCDialogUIState.f10014a) && Intrinsics.d(this.b, tnCDialogUIState.b) && Intrinsics.d(this.c, tnCDialogUIState.c) && Intrinsics.d(this.d, tnCDialogUIState.d) && Intrinsics.d(this.e, tnCDialogUIState.e) && Intrinsics.d(this.f, tnCDialogUIState.f);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.c, (this.b.hashCode() + (this.f10014a.hashCode() * 31)) * 31, 31), 31, this.d);
        ButtonContainerUIState buttonContainerUIState = this.e;
        int iHashCode = (iB + (buttonContainerUIState == null ? 0 : buttonContainerUIState.hashCode())) * 31;
        DividerUIState dividerUIState = this.f;
        return iHashCode + (dividerUIState != null ? dividerUIState.hashCode() : 0);
    }

    public final String toString() {
        return "TnCDialogUIState(specs=" + this.f10014a + ", dialogDismissHandler=" + this.b + ", title=" + this.c + ", termsList=" + this.d + ", btnContainer=" + this.e + ", divider=" + this.f + ")";
    }
}
