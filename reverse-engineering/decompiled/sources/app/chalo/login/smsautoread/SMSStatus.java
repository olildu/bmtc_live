package app.chalo.login.smsautoread;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/login/smsautoread/SMSStatus;", "", InitializationStatus.SUCCESS, "Timeout", "Unknown", "Lapp/chalo/login/smsautoread/SMSStatus$Success;", "Lapp/chalo/login/smsautoread/SMSStatus$Timeout;", "Lapp/chalo/login/smsautoread/SMSStatus$Unknown;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SMSStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/smsautoread/SMSStatus$Success;", "Lapp/chalo/login/smsautoread/SMSStatus;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends SMSStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5287a;

        public Success(String str) {
            this.f5287a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f5287a, ((Success) obj).f5287a);
        }

        public final int hashCode() {
            return this.f5287a.hashCode();
        }

        public final String toString() {
            return vo1.B("Success(msg=", this.f5287a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/smsautoread/SMSStatus$Timeout;", "Lapp/chalo/login/smsautoread/SMSStatus;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timeout extends SMSStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Timeout f5288a = new Timeout();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Timeout);
        }

        public final int hashCode() {
            return -748854163;
        }

        public final String toString() {
            return "Timeout";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/smsautoread/SMSStatus$Unknown;", "Lapp/chalo/login/smsautoread/SMSStatus;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends SMSStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f5289a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 280216406;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
