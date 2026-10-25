package app.chalo.wallet.ui.access;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus;", "", "TransferChaloPay", "AutoReclaimInProgress", "AutoReclaimLimitExceeded", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$AutoReclaimInProgress;", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$AutoReclaimLimitExceeded;", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$TransferChaloPay;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletAutoReclaimStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$AutoReclaimInProgress;", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AutoReclaimInProgress extends WalletAutoReclaimStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10811a;

        public AutoReclaimInProgress(String autoReclaimMessageString) {
            Intrinsics.i(autoReclaimMessageString, "autoReclaimMessageString");
            this.f10811a = autoReclaimMessageString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AutoReclaimInProgress) && Intrinsics.d(this.f10811a, ((AutoReclaimInProgress) obj).f10811a);
        }

        public final int hashCode() {
            return this.f10811a.hashCode();
        }

        public final String toString() {
            return vo1.B("AutoReclaimInProgress(autoReclaimMessageString=", this.f10811a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$AutoReclaimLimitExceeded;", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AutoReclaimLimitExceeded extends WalletAutoReclaimStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoReclaimLimitExceeded f10812a = new AutoReclaimLimitExceeded();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus$TransferChaloPay;", "Lapp/chalo/wallet/ui/access/WalletAutoReclaimStatus;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TransferChaloPay extends WalletAutoReclaimStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransferChaloPay f10813a = new TransferChaloPay();
    }
}
