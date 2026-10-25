package app.chalo.kyc.min.ui.minkycotp;

import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "", "InitializationIntent", "OtpEnteredIntent", "OnResendOtpEnableCountdownUpdate", "PositiveCtaClickedIntent", "BottomSheetDismissedIntent", "ProceedBtnClickedIntent", "ResendSmsClickedIntent", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$BottomSheetDismissedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$InitializationIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$OnResendOtpEnableCountdownUpdate;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$OtpEnteredIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$PositiveCtaClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$ProceedBtnClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$ResendSmsClickedIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinKycOtpIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$BottomSheetDismissedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetDismissedIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissedIntent f4147a = new BottomSheetDismissedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$InitializationIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4148a;

        public InitializationIntent(String userName) {
            Intrinsics.i(userName, "userName");
            this.f4148a = userName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f4148a, ((InitializationIntent) obj).f4148a);
        }

        public final int hashCode() {
            return this.f4148a.hashCode();
        }

        public final String toString() {
            return vo1.B("InitializationIntent(userName=", this.f4148a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$OnResendOtpEnableCountdownUpdate;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnResendOtpEnableCountdownUpdate extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4149a;

        public OnResendOtpEnableCountdownUpdate(long j) {
            this.f4149a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnResendOtpEnableCountdownUpdate) && this.f4149a == ((OnResendOtpEnableCountdownUpdate) obj).f4149a;
        }

        public final int hashCode() {
            long j = this.f4149a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f4149a, "OnResendOtpEnableCountdownUpdate(remainingTimeInMillisForEnablingResend=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$OtpEnteredIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtpEnteredIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4150a;

        public OtpEnteredIntent(String str) {
            this.f4150a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OtpEnteredIntent) && Intrinsics.d(this.f4150a, ((OtpEnteredIntent) obj).f4150a);
        }

        public final int hashCode() {
            return this.f4150a.hashCode();
        }

        public final String toString() {
            return vo1.B("OtpEnteredIntent(otp=", this.f4150a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$PositiveCtaClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositiveCtaClickedIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KycErrorPositiveCtaType f4151a;

        public PositiveCtaClickedIntent(KycErrorPositiveCtaType positiveCtaType) {
            Intrinsics.i(positiveCtaType, "positiveCtaType");
            this.f4151a = positiveCtaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PositiveCtaClickedIntent) && this.f4151a == ((PositiveCtaClickedIntent) obj).f4151a;
        }

        public final int hashCode() {
            return this.f4151a.hashCode();
        }

        public final String toString() {
            return "PositiveCtaClickedIntent(positiveCtaType=" + this.f4151a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$ProceedBtnClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedBtnClickedIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedBtnClickedIntent f4152a = new ProceedBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent$ResendSmsClickedIntent;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpIntent;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResendSmsClickedIntent extends MinKycOtpIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResendSmsClickedIntent f4153a = new ResendSmsClickedIntent();
    }
}
