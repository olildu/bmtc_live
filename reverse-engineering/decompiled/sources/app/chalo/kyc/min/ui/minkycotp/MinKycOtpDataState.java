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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycOtpDataState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4145a;
    public final int b;
    public final KycErrorBottomSheetData c;
    public final KycLoadingPurpose d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final OtpError j;
    public final String k;
    public final String l;
    public final MinKycScreenBottomSheetType m;
    public final String n;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinKycOtpDataState> serializer() {
            return MinKycOtpDataState$$serializer.f4146a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        o = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(7)), null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(8)), null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(9)), null};
    }

    public /* synthetic */ MinKycOtpDataState(int i, String str, int i2, KycErrorBottomSheetData kycErrorBottomSheetData, KycLoadingPurpose kycLoadingPurpose, boolean z, boolean z2, long j, boolean z3, boolean z4, OtpError otpError, String str2, String str3, MinKycScreenBottomSheetType minKycScreenBottomSheetType, String str4) {
        if ((i & 1) == 0) {
            this.f4145a = "";
        } else {
            this.f4145a = str;
        }
        if ((i & 2) == 0) {
            this.b = 6;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kycErrorBottomSheetData;
        }
        if ((i & 8) == 0) {
            this.d = KycLoadingPurpose.GENERAL;
        } else {
            this.d = kycLoadingPurpose;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = 30000L;
        } else {
            this.g = j;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z3;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z4;
        }
        if ((i & 512) == 0) {
            this.j = OtpError.INVALID_OTP;
        } else {
            this.j = otpError;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str3;
        }
        this.m = (i & 4096) == 0 ? MinKycScreenBottomSheetType.NONE : minKycScreenBottomSheetType;
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str4;
        }
    }

    public static MinKycOtpDataState a(MinKycOtpDataState minKycOtpDataState, String str, KycErrorBottomSheetData kycErrorBottomSheetData, KycLoadingPurpose kycLoadingPurpose, boolean z, boolean z2, long j, boolean z3, OtpError otpError, String str2, String str3, MinKycScreenBottomSheetType minKycScreenBottomSheetType, String str4, int i) {
        String otpEntered = (i & 1) != 0 ? minKycOtpDataState.f4145a : str;
        int i2 = minKycOtpDataState.b;
        KycErrorBottomSheetData kycErrorBottomSheetData2 = (i & 4) != 0 ? minKycOtpDataState.c : kycErrorBottomSheetData;
        KycLoadingPurpose loadingPurpose = (i & 8) != 0 ? minKycOtpDataState.d : kycLoadingPurpose;
        boolean z4 = (i & 16) != 0 ? minKycOtpDataState.e : z;
        boolean z5 = (i & 32) != 0 ? minKycOtpDataState.f : z2;
        long j2 = (i & 64) != 0 ? minKycOtpDataState.g : j;
        boolean z6 = (i & 128) != 0 ? minKycOtpDataState.h : z3;
        boolean z7 = (i & 256) != 0 ? minKycOtpDataState.i : true;
        OtpError otpFailureReason = (i & 512) != 0 ? minKycOtpDataState.j : otpError;
        String str5 = (i & 1024) != 0 ? minKycOtpDataState.k : str2;
        String str6 = (i & 2048) != 0 ? minKycOtpDataState.l : str3;
        MinKycScreenBottomSheetType bottomSheetType = (i & 4096) != 0 ? minKycOtpDataState.m : minKycScreenBottomSheetType;
        String userName = (i & 8192) != 0 ? minKycOtpDataState.n : str4;
        minKycOtpDataState.getClass();
        Intrinsics.i(otpEntered, "otpEntered");
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        Intrinsics.i(otpFailureReason, "otpFailureReason");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        Intrinsics.i(userName, "userName");
        return new MinKycOtpDataState(otpEntered, i2, kycErrorBottomSheetData2, loadingPurpose, z4, z5, j2, z6, z7, otpFailureReason, str5, str6, bottomSheetType, userName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycOtpDataState)) {
            return false;
        }
        MinKycOtpDataState minKycOtpDataState = (MinKycOtpDataState) obj;
        return Intrinsics.d(this.f4145a, minKycOtpDataState.f4145a) && this.b == minKycOtpDataState.b && Intrinsics.d(this.c, minKycOtpDataState.c) && this.d == minKycOtpDataState.d && this.e == minKycOtpDataState.e && this.f == minKycOtpDataState.f && this.g == minKycOtpDataState.g && this.h == minKycOtpDataState.h && this.i == minKycOtpDataState.i && this.j == minKycOtpDataState.j && Intrinsics.d(this.k, minKycOtpDataState.k) && Intrinsics.d(this.l, minKycOtpDataState.l) && this.m == minKycOtpDataState.m && Intrinsics.d(this.n, minKycOtpDataState.n);
    }

    public final int hashCode() {
        int iHashCode = ((this.f4145a.hashCode() * 31) + this.b) * 31;
        KycErrorBottomSheetData kycErrorBottomSheetData = this.c;
        int iHashCode2 = (((this.d.hashCode() + ((iHashCode + (kycErrorBottomSheetData == null ? 0 : kycErrorBottomSheetData.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31;
        int i = this.f ? 1231 : 1237;
        long j = this.g;
        int iHashCode3 = (this.j.hashCode() + ((((((((iHashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31)) * 31;
        String str = this.k;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "MinKycOtpDataState(otpEntered=", this.f4145a, ", otpLength=", ", kycErrorBottomSheetData=");
        sbM.append(this.c);
        sbM.append(", loadingPurpose=");
        sbM.append(this.d);
        sbM.append(", isLoading=");
        z40.r(sbM, this.e, ", isVerifyBtnEnabled=", this.f, ", remainingTimeInMillisForEnablingResend=");
        sbM.append(this.g);
        sbM.append(", isResendBtnEnabled=");
        sbM.append(this.h);
        sbM.append(", shouldShowInvalidOtpError=");
        sbM.append(this.i);
        sbM.append(", otpFailureReason=");
        sbM.append(this.j);
        cb0.t(sbM, ", phoneNumber=", this.k, ", refNo=", this.l);
        sbM.append(", bottomSheetType=");
        sbM.append(this.m);
        sbM.append(", userName=");
        sbM.append(this.n);
        sbM.append(")");
        return sbM.toString();
    }

    public MinKycOtpDataState(String otpEntered, int i, KycErrorBottomSheetData kycErrorBottomSheetData, KycLoadingPurpose loadingPurpose, boolean z, boolean z2, long j, boolean z3, boolean z4, OtpError otpFailureReason, String str, String str2, MinKycScreenBottomSheetType bottomSheetType, String userName) {
        Intrinsics.i(otpEntered, "otpEntered");
        Intrinsics.i(loadingPurpose, "loadingPurpose");
        Intrinsics.i(otpFailureReason, "otpFailureReason");
        Intrinsics.i(bottomSheetType, "bottomSheetType");
        Intrinsics.i(userName, "userName");
        this.f4145a = otpEntered;
        this.b = i;
        this.c = kycErrorBottomSheetData;
        this.d = loadingPurpose;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = z3;
        this.i = z4;
        this.j = otpFailureReason;
        this.k = str;
        this.l = str2;
        this.m = bottomSheetType;
        this.n = userName;
    }

    public /* synthetic */ MinKycOtpDataState(int i, int i2, long j, KycErrorBottomSheetData kycErrorBottomSheetData, OtpError otpError, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 6 : i, (i2 & 4) != 0 ? null : kycErrorBottomSheetData, KycLoadingPurpose.GENERAL, false, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 30000L : j, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? OtpError.INVALID_OTP : otpError, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : str3, MinKycScreenBottomSheetType.NONE, (i2 & 8192) != 0 ? "" : str4);
    }
}
