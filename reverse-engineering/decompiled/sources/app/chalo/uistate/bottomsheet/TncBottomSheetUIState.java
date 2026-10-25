package app.chalo.uistate.bottomsheet;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/TncBottomSheetUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TncBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9910a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final BottomSheetUiState d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;

    public TncBottomSheetUIState(ButtonUIState buttonUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        BottomSheetUiState bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(ChaloThemeHelper.a().e, 2), 14), new BottomSheetEventHandler(false, false, null, 99));
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        this.f9910a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = buttonUIState;
        this.d = bottomSheetUiState;
        this.e = chaloPadding;
        this.f = chaloPadding2;
        this.g = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TncBottomSheetUIState)) {
            return false;
        }
        TncBottomSheetUIState tncBottomSheetUIState = (TncBottomSheetUIState) obj;
        return Intrinsics.d(this.f9910a, tncBottomSheetUIState.f9910a) && Intrinsics.d(this.b, tncBottomSheetUIState.b) && Intrinsics.d(this.c, tncBottomSheetUIState.c) && Intrinsics.d(this.d, tncBottomSheetUIState.d) && Intrinsics.d(this.e, tncBottomSheetUIState.e) && Intrinsics.d(this.f, tncBottomSheetUIState.f) && Intrinsics.d(this.g, tncBottomSheetUIState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + r30.c(this.f, r30.c(this.e, (this.d.hashCode() + r30.d(this.c, r30.f(this.b, this.f9910a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("TncBottomSheetUIState(title=", this.f9910a, ", tncText=", this.b, ", confirmBtn=");
        sbJ.append(this.c);
        sbJ.append(", bottomSheetState=");
        sbJ.append(this.d);
        sbJ.append(", internalPadding=");
        r30.o(sbJ, this.e, ", paddingAroundTnc=", this.f, ", paddingAroundBtn=");
        return py.e(sbJ, this.g, ")");
    }
}
