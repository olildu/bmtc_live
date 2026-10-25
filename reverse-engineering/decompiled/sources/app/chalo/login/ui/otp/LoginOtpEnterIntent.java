package app.chalo.login.ui.otp;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "", "InitializationIntent", "OnOtpEnteredIntent", "OnVerifyClickedIntent", "OnResendOtpClickedIntent", "OnResendOtpEnableCountdownUpdate", "OnOtpSMSReadSuccessfully", "OnActiveIntent", "OnInactiveIntent", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$InitializationIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnActiveIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnInactiveIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnOtpEnteredIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnOtpSMSReadSuccessfully;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnResendOtpClickedIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnResendOtpEnableCountdownUpdate;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnVerifyClickedIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LoginOtpEnterIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$InitializationIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5332a;
        public final String b;
        public final String c;
        public final String d;

        public InitializationIntent(String refNo, String phoneNumber, String countryCode, String source) {
            Intrinsics.i(refNo, "refNo");
            Intrinsics.i(phoneNumber, "phoneNumber");
            Intrinsics.i(countryCode, "countryCode");
            Intrinsics.i(source, "source");
            this.f5332a = refNo;
            this.b = phoneNumber;
            this.c = countryCode;
            this.d = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f5332a, initializationIntent.f5332a) && Intrinsics.d(this.b, initializationIntent.b) && Intrinsics.d(this.c, initializationIntent.c) && Intrinsics.d(this.d, initializationIntent.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + nf1.e(nf1.e(this.f5332a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return r30.i(dd.e("InitializationIntent(refNo=", this.f5332a, ", phoneNumber=", this.b, ", countryCode="), this.c, ", source=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnActiveIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnActiveIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnActiveIntent f5333a = new OnActiveIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnActiveIntent);
        }

        public final int hashCode() {
            return 1740849241;
        }

        public final String toString() {
            return "OnActiveIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnInactiveIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnInactiveIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnInactiveIntent f5334a = new OnInactiveIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnInactiveIntent);
        }

        public final int hashCode() {
            return 1226134590;
        }

        public final String toString() {
            return "OnInactiveIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnOtpEnteredIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnOtpEnteredIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5335a;

        public OnOtpEnteredIntent(String otpEntered) {
            Intrinsics.i(otpEntered, "otpEntered");
            this.f5335a = otpEntered;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOtpEnteredIntent) && Intrinsics.d(this.f5335a, ((OnOtpEnteredIntent) obj).f5335a);
        }

        public final int hashCode() {
            return this.f5335a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnOtpEnteredIntent(otpEntered=", this.f5335a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnOtpSMSReadSuccessfully;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnOtpSMSReadSuccessfully extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5336a;

        public OnOtpSMSReadSuccessfully(String str) {
            this.f5336a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOtpSMSReadSuccessfully) && Intrinsics.d(this.f5336a, ((OnOtpSMSReadSuccessfully) obj).f5336a);
        }

        public final int hashCode() {
            return this.f5336a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnOtpSMSReadSuccessfully(msg=", this.f5336a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnResendOtpClickedIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResendOtpClickedIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnResendOtpClickedIntent f5337a = new OnResendOtpClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnResendOtpEnableCountdownUpdate;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnResendOtpEnableCountdownUpdate extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5338a;

        public OnResendOtpEnableCountdownUpdate(long j) {
            this.f5338a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnResendOtpEnableCountdownUpdate) && this.f5338a == ((OnResendOtpEnableCountdownUpdate) obj).f5338a;
        }

        public final int hashCode() {
            long j = this.f5338a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f5338a, "OnResendOtpEnableCountdownUpdate(remainingTimeInMillisForEnablingResend=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIntent$OnVerifyClickedIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnVerifyClickedIntent extends LoginOtpEnterIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnVerifyClickedIntent f5339a = new OnVerifyClickedIntent();
    }
}
