package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassAlreadyAvailedBottomSheetUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassAlreadyAvailedBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8389a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final ChaloPadding d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final BottomSheetUiState g;

    public PassAlreadyAvailedBottomSheetUIState(ButtonUIState buttonUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        BottomSheetUiState bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(ChaloThemeHelper.a().e, 2), 14), new BottomSheetEventHandler(false, false, null, 99));
        this.f8389a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = buttonUIState;
        this.d = chaloPadding;
        this.e = chaloPadding2;
        this.f = chaloPadding3;
        this.g = bottomSheetUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassAlreadyAvailedBottomSheetUIState)) {
            return false;
        }
        PassAlreadyAvailedBottomSheetUIState passAlreadyAvailedBottomSheetUIState = (PassAlreadyAvailedBottomSheetUIState) obj;
        return Intrinsics.d(this.f8389a, passAlreadyAvailedBottomSheetUIState.f8389a) && Intrinsics.d(this.b, passAlreadyAvailedBottomSheetUIState.b) && Intrinsics.d(this.c, passAlreadyAvailedBottomSheetUIState.c) && Intrinsics.d(this.d, passAlreadyAvailedBottomSheetUIState.d) && Intrinsics.d(this.e, passAlreadyAvailedBottomSheetUIState.e) && Intrinsics.d(this.f, passAlreadyAvailedBottomSheetUIState.f) && Intrinsics.d(this.g, passAlreadyAvailedBottomSheetUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.c(this.f, r30.c(this.e, r30.c(this.d, r30.d(this.c, r30.f(this.b, this.f8389a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("PassAlreadyAvailedBottomSheetUIState(title=", this.f8389a, ", msg=", this.b, ", confirmBtn=");
        sbJ.append(this.c);
        sbJ.append(", internalPadding=");
        sbJ.append(this.d);
        sbJ.append(", paddingAroundMsg=");
        r30.o(sbJ, this.e, ", paddingAroundBtn=", this.f, ", bottomSheetUIState=");
        sbJ.append(this.g);
        sbJ.append(")");
        return sbJ.toString();
    }
}
