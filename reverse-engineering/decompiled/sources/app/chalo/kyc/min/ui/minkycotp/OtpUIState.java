package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpUISpecs f4169a;
    public final OtpStepProgressUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final OtpTextFieldUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final TextUIState.ChaloTextUIState g;

    public OtpUIState(OtpStepProgressUIState otpStepProgressUIState, TextUIState.ChaloTextUIState titleTextUIState, TextUIState.ChaloTextUIState subTitleTextUIState, OtpTextFieldUIState otpTextFieldUIState, TextUIState.ChaloTextUIState otpMsgTextUIState, TextUIState.ChaloTextUIState chaloTextUIState) {
        OtpUISpecs otpUISpecs = new OtpUISpecs();
        Intrinsics.i(otpStepProgressUIState, "otpStepProgressUIState");
        Intrinsics.i(titleTextUIState, "titleTextUIState");
        Intrinsics.i(subTitleTextUIState, "subTitleTextUIState");
        Intrinsics.i(otpTextFieldUIState, "otpTextFieldUIState");
        Intrinsics.i(otpMsgTextUIState, "otpMsgTextUIState");
        this.f4169a = otpUISpecs;
        this.b = otpStepProgressUIState;
        this.c = titleTextUIState;
        this.d = subTitleTextUIState;
        this.e = otpTextFieldUIState;
        this.f = otpMsgTextUIState;
        this.g = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpUIState)) {
            return false;
        }
        OtpUIState otpUIState = (OtpUIState) obj;
        return Intrinsics.d(this.f4169a, otpUIState.f4169a) && Intrinsics.d(this.b, otpUIState.b) && Intrinsics.d(this.c, otpUIState.c) && Intrinsics.d(this.d, otpUIState.d) && Intrinsics.d(this.e, otpUIState.e) && Intrinsics.d(this.f, otpUIState.f) && Intrinsics.d(this.g, otpUIState.g);
    }

    public final int hashCode() {
        int iF = r30.f(this.f, (this.e.hashCode() + r30.f(this.d, r30.f(this.c, (this.b.hashCode() + (this.f4169a.hashCode() * 31)) * 31, 31), 31)) * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.g;
        return iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtpUIState(otpUISpecs=");
        sb.append(this.f4169a);
        sb.append(", otpStepProgressUIState=");
        sb.append(this.b);
        sb.append(", titleTextUIState=");
        r30.p(sb, this.c, ", subTitleTextUIState=", this.d, ", otpTextFieldUIState=");
        sb.append(this.e);
        sb.append(", otpMsgTextUIState=");
        sb.append(this.f);
        sb.append(", resendTextUIState=");
        return py.f(sb, this.g, ")");
    }
}
