package app.chalo.kyc.min.ui.minkycotp;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/OtpCharUIState;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OtpCharUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpCharUISpecs f4163a;
    public final TextUIState.ChaloTextUIState b;
    public final DividerUIState c;
    public final boolean d;

    public OtpCharUIState(OtpCharUISpecs otpCharUISpecs, TextUIState.ChaloTextUIState chaloTextUIState, DividerUIState dividerUIState, boolean z) {
        this.f4163a = otpCharUISpecs;
        this.b = chaloTextUIState;
        this.c = dividerUIState;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpCharUIState)) {
            return false;
        }
        OtpCharUIState otpCharUIState = (OtpCharUIState) obj;
        return this.f4163a.equals(otpCharUIState.f4163a) && this.b.equals(otpCharUIState.b) && this.c.equals(otpCharUIState.c) && this.d == otpCharUIState.d;
    }

    public final int hashCode() {
        return py.c(this.c, r30.f(this.b, this.f4163a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "OtpCharUIState(specs=" + this.f4163a + ", otpCharTextUIState=" + this.b + ", cursorDividerUIState=" + this.c + ", shouldShowBlinkingCursor=" + this.d + ")";
    }
}
