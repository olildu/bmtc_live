package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.compose.theme.UIShape;
import app.chalo.kyc.min.ui.minkycdetails.StepCircleUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpStepProgressUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpStepProgressUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpStepProgressUISpecs f4165a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final StepCircleUIState d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OtpStepProgressUIState(ImageUIState checkIconImageUIState, TextUIState.ChaloTextUIState nameTextUIState, StepCircleUIState stepCircleUIState) {
        OtpStepProgressUISpecs otpStepProgressUISpecs = new OtpStepProgressUISpecs();
        Intrinsics.i(checkIconImageUIState, "checkIconImageUIState");
        Intrinsics.i(nameTextUIState, "nameTextUIState");
        this.f4165a = otpStepProgressUISpecs;
        this.b = checkIconImageUIState;
        this.c = nameTextUIState;
        this.d = stepCircleUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpStepProgressUIState)) {
            return false;
        }
        OtpStepProgressUIState otpStepProgressUIState = (OtpStepProgressUIState) obj;
        return Intrinsics.d(this.f4165a, otpStepProgressUIState.f4165a) && Intrinsics.d(this.b, otpStepProgressUIState.b) && Intrinsics.d(this.c, otpStepProgressUIState.c) && Intrinsics.d(this.d, otpStepProgressUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f4165a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OtpStepProgressUIState(specs=" + this.f4165a + ", checkIconImageUIState=" + this.b + ", nameTextUIState=" + this.c + ", stepCircleUIState=" + this.d + ")";
    }
}
