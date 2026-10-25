package app.chalo.walletframework.wallet.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState;", "", "Inactive", "Active", "Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState$Active;", "Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState$Inactive;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface LocalAppReclaimState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState$Active;", "Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Active implements LocalAppReclaimState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f11060a;

        public Active(Long l) {
            this.f11060a = l;
        }

        @Override // app.chalo.walletframework.wallet.domain.LocalAppReclaimState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getF11060a() {
            return this.f11060a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Active) && Intrinsics.d(this.f11060a, ((Active) obj).f11060a);
        }

        public final int hashCode() {
            Long l = this.f11060a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        @Override // app.chalo.walletframework.wallet.domain.LocalAppReclaimState
        public final boolean isActive() {
            return true;
        }

        public final String toString() {
            return "Active(oldestCachedAtTimeStamp=" + this.f11060a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState$Inactive;", "Lapp/chalo/walletframework/wallet/domain/LocalAppReclaimState;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Inactive implements LocalAppReclaimState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Inactive f11061a = new Inactive();

        @Override // app.chalo.walletframework.wallet.domain.LocalAppReclaimState
        /* JADX INFO: renamed from: a */
        public final Long getF11060a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Inactive);
        }

        public final int hashCode() {
            return -1742917023;
        }

        @Override // app.chalo.walletframework.wallet.domain.LocalAppReclaimState
        public final boolean isActive() {
            return false;
        }

        public final String toString() {
            return "Inactive";
        }
    }

    /* JADX INFO: renamed from: a */
    Long getF11060a();

    boolean isActive();
}
