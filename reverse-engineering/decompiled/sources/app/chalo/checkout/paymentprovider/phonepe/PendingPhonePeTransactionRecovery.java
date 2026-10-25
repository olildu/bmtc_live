package app.chalo.checkout.paymentprovider.phonepe;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery;", "", "InProgress", "Returned", "Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery$InProgress;", "Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery$Returned;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PendingPhonePeTransactionRecovery {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery$InProgress;", "Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress implements PendingPhonePeTransactionRecovery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1415a;

        public InProgress(long j) {
            this.f1415a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InProgress) && this.f1415a == ((InProgress) obj).f1415a;
        }

        public final int hashCode() {
            long j = this.f1415a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f1415a, "InProgress(attemptToken=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery$Returned;", "Lapp/chalo/checkout/paymentprovider/phonepe/PendingPhonePeTransactionRecovery;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Returned implements PendingPhonePeTransactionRecovery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Returned f1416a = new Returned();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Returned);
        }

        public final int hashCode() {
            return -2055087964;
        }

        public final String toString() {
            return "Returned";
        }
    }
}
