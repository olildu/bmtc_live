package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycOtpUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MinKycOtpUISpecs f4159a;
    public final LoadingDialogUIState b;
    public final ToolbarUIState c;
    public final GenericErrorBottomSheetUIState d;
    public final OtpUIState e;
    public final ProceedBtnUIState f;

    public MinKycOtpUIState(LoadingDialogUIState loadingDialogUIState, ToolbarUIState toolbarUIState, GenericErrorBottomSheetUIState genericErrorBottomSheetUIState, OtpUIState otpUIState, ProceedBtnUIState proceedBtnUIState) {
        MinKycOtpUISpecs minKycOtpUISpecs = new MinKycOtpUISpecs();
        Intrinsics.i(toolbarUIState, "toolbarUIState");
        Intrinsics.i(otpUIState, "otpUIState");
        this.f4159a = minKycOtpUISpecs;
        this.b = loadingDialogUIState;
        this.c = toolbarUIState;
        this.d = genericErrorBottomSheetUIState;
        this.e = otpUIState;
        this.f = proceedBtnUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycOtpUIState)) {
            return false;
        }
        MinKycOtpUIState minKycOtpUIState = (MinKycOtpUIState) obj;
        return Intrinsics.d(this.f4159a, minKycOtpUIState.f4159a) && Intrinsics.d(this.b, minKycOtpUIState.b) && Intrinsics.d(this.c, minKycOtpUIState.c) && Intrinsics.d(this.d, minKycOtpUIState.d) && Intrinsics.d(this.e, minKycOtpUIState.e) && Intrinsics.d(this.f, minKycOtpUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f4159a.f4158a.hashCode() * 31;
        LoadingDialogUIState loadingDialogUIState = this.b;
        int iD = t8.d(this.c, (iHashCode + (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode())) * 31, 31);
        GenericErrorBottomSheetUIState genericErrorBottomSheetUIState = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iD + (genericErrorBottomSheetUIState != null ? genericErrorBottomSheetUIState.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "MinKycOtpUIState(specs=" + this.f4159a + ", loadingDialogUIState=" + this.b + ", toolbarUIState=" + this.c + ", errorBottomSheetUIState=" + this.d + ", otpUIState=" + this.e + ", proceedBtnUIState=" + this.f + ")";
    }
}
