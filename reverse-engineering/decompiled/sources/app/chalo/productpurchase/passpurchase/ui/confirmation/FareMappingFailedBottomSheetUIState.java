package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.bottomsheet.BottomSheetUiSpec;
import app.chalo.uistate.bottomsheet.BottomSheetUiState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/FareMappingFailedBottomSheetUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareMappingFailedBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8388a;
    public final ButtonUIState b;
    public final ButtonUIState c;
    public final ImageUIState d;
    public final ChaloPadding e;
    public final ChaloPadding f;
    public final ChaloPadding g;
    public final ChaloPadding h;
    public final BottomSheetUiState i;

    public FareMappingFailedBottomSheetUIState(ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().i, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14);
        BottomSheetUiState bottomSheetUiState = new BottomSheetUiState(new BottomSheetUiSpec(new UIShape.Rectangle(ChaloThemeHelper.a().e, 2), 14), new BottomSheetEventHandler(false, false, null, 99));
        this.f8388a = chaloTextUIState;
        this.b = buttonUIState;
        this.c = buttonUIState2;
        this.d = imageUIState;
        this.e = chaloPadding;
        this.f = chaloPadding2;
        this.g = chaloPadding3;
        this.h = chaloPadding4;
        this.i = bottomSheetUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareMappingFailedBottomSheetUIState)) {
            return false;
        }
        FareMappingFailedBottomSheetUIState fareMappingFailedBottomSheetUIState = (FareMappingFailedBottomSheetUIState) obj;
        return Intrinsics.d(this.f8388a, fareMappingFailedBottomSheetUIState.f8388a) && Intrinsics.d(this.b, fareMappingFailedBottomSheetUIState.b) && Intrinsics.d(this.c, fareMappingFailedBottomSheetUIState.c) && Intrinsics.d(this.d, fareMappingFailedBottomSheetUIState.d) && Intrinsics.d(this.e, fareMappingFailedBottomSheetUIState.e) && Intrinsics.d(this.f, fareMappingFailedBottomSheetUIState.f) && Intrinsics.d(this.g, fareMappingFailedBottomSheetUIState.g) && Intrinsics.d(this.h, fareMappingFailedBottomSheetUIState.h) && Intrinsics.d(this.i, fareMappingFailedBottomSheetUIState.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + r30.c(this.h, r30.c(this.g, r30.c(this.f, r30.c(this.e, r30.e(this.d, r30.d(this.c, r30.d(this.b, this.f8388a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FareMappingFailedBottomSheetUIState(msg=");
        sb.append(this.f8388a);
        sb.append(", confirmBtn=");
        sb.append(this.b);
        sb.append(", cancelBtn=");
        sb.append(this.c);
        sb.append(", cancelIcon=");
        sb.append(this.d);
        sb.append(", internalPadding=");
        r30.o(sb, this.e, ", paddingAroundMsg=", this.f, ", paddingAroundConfirmBtn=");
        r30.o(sb, this.g, ", paddingAroundCancelBtn=", this.h, ", bottomSheetUIState=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
