package app.chalo.features.wallet;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/features/wallet/WalletSyncRequest;", "", "SemiClosed", "ClosedLoop", "Lapp/chalo/features/wallet/WalletSyncRequest$ClosedLoop;", "Lapp/chalo/features/wallet/WalletSyncRequest$SemiClosed;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WalletSyncRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/wallet/WalletSyncRequest$ClosedLoop;", "Lapp/chalo/features/wallet/WalletSyncRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClosedLoop implements WalletSyncRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2768a;
        public final String b;

        public ClosedLoop(String walletId, String agency) {
            Intrinsics.i(walletId, "walletId");
            Intrinsics.i(agency, "agency");
            this.f2768a = walletId;
            this.b = agency;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosedLoop)) {
                return false;
            }
            ClosedLoop closedLoop = (ClosedLoop) obj;
            return Intrinsics.d(this.f2768a, closedLoop.f2768a) && Intrinsics.d(this.b, closedLoop.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2768a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("ClosedLoop(walletId=", this.f2768a, ", agency=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/wallet/WalletSyncRequest$SemiClosed;", "Lapp/chalo/features/wallet/WalletSyncRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SemiClosed implements WalletSyncRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SemiClosed f2769a = new SemiClosed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SemiClosed);
        }

        public final int hashCode() {
            return 710246605;
        }

        public final String toString() {
            return "SemiClosed";
        }
    }
}
