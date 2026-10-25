package app.chalo.login.phonenumberhint;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult;", "", InitializationStatus.SUCCESS, "NoValidPhoneNumber", "UnknownException", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$NoValidPhoneNumber;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$Success;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$UnknownException;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PhoneNumberHintResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$NoValidPhoneNumber;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoValidPhoneNumber extends PhoneNumberHintResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5283a;

        public NoValidPhoneNumber(String str) {
            this.f5283a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoValidPhoneNumber) && Intrinsics.d(this.f5283a, ((NoValidPhoneNumber) obj).f5283a);
        }

        public final int hashCode() {
            String str = this.f5283a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("NoValidPhoneNumber(error=", this.f5283a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$Success;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends PhoneNumberHintResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5284a;

        public Success(String str) {
            this.f5284a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f5284a, ((Success) obj).f5284a);
        }

        public final int hashCode() {
            return this.f5284a.hashCode();
        }

        public final String toString() {
            return vo1.B("Success(phoneNumber=", this.f5284a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult$UnknownException;", "Lapp/chalo/login/phonenumberhint/PhoneNumberHintResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownException extends PhoneNumberHintResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f5285a;

        public UnknownException(Exception exc) {
            this.f5285a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownException) && Intrinsics.d(this.f5285a, ((UnknownException) obj).f5285a);
        }

        public final int hashCode() {
            return this.f5285a.hashCode();
        }

        public final String toString() {
            return "UnknownException(exception=" + this.f5285a + ")";
        }
    }
}
