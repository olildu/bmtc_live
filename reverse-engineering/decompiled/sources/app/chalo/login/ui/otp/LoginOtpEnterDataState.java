package app.chalo.login.ui.otp;

import app.chalo.login.ui.LoginLoadingPurpose;
import defpackage.cb0;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterDataState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoginOtpEnterDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5330a;
    public final boolean b;
    public final LoginLoadingPurpose c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public LoginOtpEnterDataState(String str, boolean z, LoginLoadingPurpose loadingPurpose, boolean z2, long j, boolean z3, String str2, String str3, String str4, String str5) {
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        this.f5330a = str;
        this.b = z;
        this.c = loadingPurpose;
        this.d = z2;
        this.e = j;
        this.f = z3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    public static LoginOtpEnterDataState a(LoginOtpEnterDataState loginOtpEnterDataState, String str, boolean z, LoginLoadingPurpose loginLoadingPurpose, boolean z2, long j, boolean z3, String str2, String str3, String str4, String str5, int i) {
        if ((i & 1) != 0) {
            str = loginOtpEnterDataState.f5330a;
        }
        String otpEntered = str;
        if ((i & 2) != 0) {
            z = loginOtpEnterDataState.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            loginLoadingPurpose = loginOtpEnterDataState.c;
        }
        LoginLoadingPurpose loadingPurpose = loginLoadingPurpose;
        loginOtpEnterDataState.getClass();
        boolean z5 = (i & 16) != 0 ? loginOtpEnterDataState.d : z2;
        long j2 = (i & 32) != 0 ? loginOtpEnterDataState.e : j;
        boolean z6 = (i & 64) != 0 ? loginOtpEnterDataState.f : z3;
        String str6 = (i & 128) != 0 ? loginOtpEnterDataState.g : str2;
        String str7 = (i & 256) != 0 ? loginOtpEnterDataState.h : str3;
        String str8 = (i & 512) != 0 ? loginOtpEnterDataState.i : str4;
        String source = (i & 1024) != 0 ? loginOtpEnterDataState.j : str5;
        loginOtpEnterDataState.getClass();
        Intrinsics.i(otpEntered, "otpEntered");
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        Intrinsics.i(source, "source");
        return new LoginOtpEnterDataState(otpEntered, z4, loadingPurpose, z5, j2, z6, str6, str7, str8, source);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOtpEnterDataState)) {
            return false;
        }
        LoginOtpEnterDataState loginOtpEnterDataState = (LoginOtpEnterDataState) obj;
        return this.f5330a.equals(loginOtpEnterDataState.f5330a) && this.b == loginOtpEnterDataState.b && this.c == loginOtpEnterDataState.c && this.d == loginOtpEnterDataState.d && this.e == loginOtpEnterDataState.e && this.f == loginOtpEnterDataState.f && Intrinsics.d(this.g, loginOtpEnterDataState.g) && Intrinsics.d(this.h, loginOtpEnterDataState.h) && Intrinsics.d(this.i, loginOtpEnterDataState.i) && this.j.equals(loginOtpEnterDataState.j);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + (((this.f5330a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + 6) * 31;
        int i = this.d ? 1231 : 1237;
        long j = this.e;
        int i2 = (((((iHashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f ? 1231 : 1237)) * 31;
        String str = this.g;
        int iHashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return this.j.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("LoginOtpEnterDataState(otpEntered=", this.f5330a, ", isLoading=", ", loadingPurpose=", this.b);
        sbM.append(this.c);
        sbM.append(", otpLength=6, shouldShowInvalidOtpError=");
        sbM.append(this.d);
        sbM.append(", remainingTimeInMillisForEnablingResend=");
        sbM.append(this.e);
        sbM.append(", isResendBtnEnabled=");
        sbM.append(this.f);
        cb0.t(sbM, ", refNo=", this.g, ", phoneNumber=", this.h);
        cb0.t(sbM, ", countryCode=", this.i, ", source=", this.j);
        sbM.append(")");
        return sbM.toString();
    }
}
