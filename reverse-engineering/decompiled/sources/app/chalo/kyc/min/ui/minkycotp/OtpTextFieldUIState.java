package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpTextFieldUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpTextFieldUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpTextFieldUISpecs f4167a;
    public final BaseTextFieldUIState.TextFieldUIState b;
    public final List c;
    public final TextUIState d;

    public OtpTextFieldUIState(BaseTextFieldUIState.TextFieldUIState otpChaloTextFieldUIState, List otpCharUIStates, TextUIState.ChaloTextUIState chaloTextUIState) {
        OtpTextFieldUISpecs otpTextFieldUISpecs = new OtpTextFieldUISpecs();
        Intrinsics.i(otpChaloTextFieldUIState, "otpChaloTextFieldUIState");
        Intrinsics.i(otpCharUIStates, "otpCharUIStates");
        this.f4167a = otpTextFieldUISpecs;
        this.b = otpChaloTextFieldUIState;
        this.c = otpCharUIStates;
        this.d = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpTextFieldUIState)) {
            return false;
        }
        OtpTextFieldUIState otpTextFieldUIState = (OtpTextFieldUIState) obj;
        return Intrinsics.d(this.f4167a, otpTextFieldUIState.f4167a) && Intrinsics.d(this.b, otpTextFieldUIState.b) && Intrinsics.d(this.c, otpTextFieldUIState.c) && Intrinsics.d(this.d, otpTextFieldUIState.d);
    }

    public final int hashCode() {
        int iB = r30.b((this.b.hashCode() + (this.f4167a.hashCode() * 31)) * 31, 31, this.c);
        TextUIState textUIState = this.d;
        return iB + (textUIState == null ? 0 : textUIState.hashCode());
    }

    public final String toString() {
        return "OtpTextFieldUIState(specs=" + this.f4167a + ", otpChaloTextFieldUIState=" + this.b + ", otpCharUIStates=" + this.c + ", otpFailureTextUIState=" + this.d + ")";
    }
}
