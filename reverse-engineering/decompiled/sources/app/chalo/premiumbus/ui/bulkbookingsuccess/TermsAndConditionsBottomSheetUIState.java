package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.mt0;
import defpackage.r30;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/bulkbookingsuccess/TermsAndConditionsBottomSheetUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermsAndConditionsBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7508a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final ArrayList d;
    public final mt0 e;

    public TermsAndConditionsBottomSheetUIState(TextUIState.ChaloTextUIState titleUIState, ButtonUIState buttonUIState, ArrayList arrayList, mt0 mt0Var) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(titleUIState, "titleUIState");
        this.f7508a = chaloPadding;
        this.b = titleUIState;
        this.c = buttonUIState;
        this.d = arrayList;
        this.e = mt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsAndConditionsBottomSheetUIState)) {
            return false;
        }
        TermsAndConditionsBottomSheetUIState termsAndConditionsBottomSheetUIState = (TermsAndConditionsBottomSheetUIState) obj;
        return Intrinsics.d(this.f7508a, termsAndConditionsBottomSheetUIState.f7508a) && Intrinsics.d(this.b, termsAndConditionsBottomSheetUIState.b) && Intrinsics.d(this.c, termsAndConditionsBottomSheetUIState.c) && Intrinsics.d(this.d, termsAndConditionsBottomSheetUIState.d) && Intrinsics.d(this.e, termsAndConditionsBottomSheetUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xs.e(this.d, r30.d(this.c, r30.f(this.b, this.f7508a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "TermsAndConditionsBottomSheetUIState(contentPadding=" + this.f7508a + ", titleUIState=" + this.b + ", okButtonUIState=" + this.c + ", termsAndConditionsListUIState=" + this.d + ", onDismissRequest=" + this.e + ")";
    }
}
