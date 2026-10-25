package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.uistate.bottomsheet.BottomSheetEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/GenericErrorBottomSheetUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenericErrorBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericErrorBottomSheetUISpecs f4138a = new GenericErrorBottomSheetUISpecs();
    public final BottomSheetEventHandler b;
    public final ImageUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final ButtonUIState f;

    public GenericErrorBottomSheetUIState(BottomSheetEventHandler bottomSheetEventHandler, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState) {
        this.b = bottomSheetEventHandler;
        this.c = imageUIState;
        this.d = chaloTextUIState;
        this.e = chaloTextUIState2;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericErrorBottomSheetUIState)) {
            return false;
        }
        GenericErrorBottomSheetUIState genericErrorBottomSheetUIState = (GenericErrorBottomSheetUIState) obj;
        return Intrinsics.d(this.f4138a, genericErrorBottomSheetUIState.f4138a) && Intrinsics.d(this.b, genericErrorBottomSheetUIState.b) && Intrinsics.d(this.c, genericErrorBottomSheetUIState.c) && Intrinsics.d(this.d, genericErrorBottomSheetUIState.d) && Intrinsics.d(this.e, genericErrorBottomSheetUIState.e) && Intrinsics.d(this.f, genericErrorBottomSheetUIState.f);
    }

    public final int hashCode() {
        int iE = r30.e(this.c, (this.b.hashCode() + (this.f4138a.hashCode() * 31)) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        int iHashCode = (iE + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.e;
        int iHashCode2 = (iHashCode + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        ButtonUIState buttonUIState = this.f;
        return iHashCode2 + (buttonUIState != null ? buttonUIState.hashCode() : 0);
    }

    public final String toString() {
        return "GenericErrorBottomSheetUIState(specs=" + this.f4138a + ", eventHandler=" + this.b + ", warningImageUIState=" + this.c + ", titleTextUIState=" + this.d + ", msgTextUIState=" + this.e + ", positiveBtnUIState=" + this.f + ")";
    }
}
