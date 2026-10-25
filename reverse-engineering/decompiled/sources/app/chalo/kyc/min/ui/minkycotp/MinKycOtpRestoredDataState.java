package app.chalo.kyc.min.ui.minkycotp;

import defpackage.cb0;
import defpackage.ti0;
import defpackage.xs;
import defpackage.z40;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpRestoredDataState;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycOtpRestoredDataState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(10)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4154a;
    public final int b;
    public final KycErrorBottomSheetData c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final OtpError h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpRestoredDataState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpRestoredDataState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycOtpRestoredDataState> serializer() {
            return MinKycOtpRestoredDataState$$serializer.f4155a;
        }
    }

    public /* synthetic */ MinKycOtpRestoredDataState(int i, int i2, long j, KycErrorBottomSheetData kycErrorBottomSheetData, OtpError otpError, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.f4154a = "";
        } else {
            this.f4154a = str;
        }
        this.b = (i & 2) == 0 ? 6 : i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kycErrorBottomSheetData;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = 30000L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        if ((i & 128) == 0) {
            this.h = OtpError.INVALID_OTP;
        } else {
            this.h = otpError;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycOtpRestoredDataState)) {
            return false;
        }
        MinKycOtpRestoredDataState minKycOtpRestoredDataState = (MinKycOtpRestoredDataState) obj;
        return Intrinsics.d(this.f4154a, minKycOtpRestoredDataState.f4154a) && this.b == minKycOtpRestoredDataState.b && Intrinsics.d(this.c, minKycOtpRestoredDataState.c) && this.d == minKycOtpRestoredDataState.d && this.e == minKycOtpRestoredDataState.e && this.f == minKycOtpRestoredDataState.f && this.g == minKycOtpRestoredDataState.g && this.h == minKycOtpRestoredDataState.h && Intrinsics.d(this.i, minKycOtpRestoredDataState.i) && Intrinsics.d(this.j, minKycOtpRestoredDataState.j) && Intrinsics.d(this.k, minKycOtpRestoredDataState.k);
    }

    public final int hashCode() {
        int iHashCode = ((this.f4154a.hashCode() * 31) + this.b) * 31;
        KycErrorBottomSheetData kycErrorBottomSheetData = this.c;
        int iHashCode2 = (iHashCode + (kycErrorBottomSheetData == null ? 0 : kycErrorBottomSheetData.hashCode())) * 31;
        int i = this.d ? 1231 : 1237;
        long j = this.e;
        int iHashCode3 = (this.h.hashCode() + ((((((((iHashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31)) * 31;
        String str = this.i;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return this.k.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "MinKycOtpRestoredDataState(otpEntered=", this.f4154a, ", otpLength=", ", kycErrorBottomSheetData=");
        sbM.append(this.c);
        sbM.append(", isVerifyBtnEnabled=");
        sbM.append(this.d);
        sbM.append(", remainingTimeInMillisForEnablingResend=");
        sbM.append(this.e);
        sbM.append(", isResendBtnEnabled=");
        sbM.append(this.f);
        sbM.append(", shouldShowInvalidOtpError=");
        sbM.append(this.g);
        sbM.append(", otpFailureReason=");
        sbM.append(this.h);
        cb0.t(sbM, ", phoneNumber=", this.i, ", refNo=", this.j);
        return z40.h(sbM, ", userName=", this.k, ")");
    }

    public MinKycOtpRestoredDataState(String otpEntered, int i, KycErrorBottomSheetData kycErrorBottomSheetData, boolean z, long j, boolean z2, boolean z3, OtpError otpFailureReason, String str, String str2, String userName) {
        Intrinsics.i(otpEntered, "otpEntered");
        Intrinsics.i(otpFailureReason, "otpFailureReason");
        Intrinsics.i(userName, "userName");
        this.f4154a = otpEntered;
        this.b = i;
        this.c = kycErrorBottomSheetData;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = z3;
        this.h = otpFailureReason;
        this.i = str;
        this.j = str2;
        this.k = userName;
    }
}
