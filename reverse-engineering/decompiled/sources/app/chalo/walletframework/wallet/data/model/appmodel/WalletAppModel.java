package app.chalo.walletframework.wallet.data.model.appmodel;

import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import defpackage.dd;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel;", "", "SemiClosedLoop", "ClosedLoop", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel$ClosedLoop;", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel$SemiClosedLoop;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel$ClosedLoop;", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClosedLoop extends WalletAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11007a;
        public final String b;
        public final CachedWalletStatus c;
        public final int d;
        public final long e;
        public final Long f;
        public final String g;

        public ClosedLoop(String walletId, String userId, CachedWalletStatus cachedWalletStatus, int i, long j, Long l, String agency) {
            Intrinsics.i(walletId, "walletId");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cachedWalletStatus, "cachedWalletStatus");
            Intrinsics.i(agency, "agency");
            this.f11007a = walletId;
            this.b = userId;
            this.c = cachedWalletStatus;
            this.d = i;
            this.e = j;
            this.f = l;
            this.g = agency;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CachedWalletStatus getC() {
            return this.c;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF11008a() {
            return this.f11007a;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClosedLoop)) {
                return false;
            }
            ClosedLoop closedLoop = (ClosedLoop) obj;
            return Intrinsics.d(this.f11007a, closedLoop.f11007a) && Intrinsics.d(this.b, closedLoop.b) && this.c == closedLoop.c && this.d == closedLoop.d && this.e == closedLoop.e && Intrinsics.d(this.f, closedLoop.f) && Intrinsics.d(this.g, closedLoop.g);
        }

        public final int hashCode() {
            int iHashCode = (((this.c.hashCode() + nf1.e(this.f11007a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31;
            long j = this.e;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            Long l = this.f;
            return this.g.hashCode() + ((i + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("ClosedLoop(walletId=", this.f11007a, ", userId=", this.b, ", cachedWalletStatus=");
            sbE.append(this.c);
            sbE.append(", remainingBalance=");
            sbE.append(this.d);
            sbE.append(", remainingLoadLimit=");
            sbE.append(this.e);
            sbE.append(", walletReclaimTime=");
            sbE.append(this.f);
            return z40.h(sbE, ", agency=", this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel$SemiClosedLoop;", "Lapp/chalo/walletframework/wallet/data/model/appmodel/WalletAppModel;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SemiClosedLoop extends WalletAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11008a;
        public final String b;
        public final CachedWalletStatus c;
        public final int d;
        public final long e;
        public final Long f;

        public SemiClosedLoop(String walletId, String userId, CachedWalletStatus cachedWalletStatus, int i, long j, Long l) {
            Intrinsics.i(walletId, "walletId");
            Intrinsics.i(userId, "userId");
            Intrinsics.i(cachedWalletStatus, "cachedWalletStatus");
            this.f11008a = walletId;
            this.b = userId;
            this.c = cachedWalletStatus;
            this.d = i;
            this.e = j;
            this.f = l;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CachedWalletStatus getC() {
            return this.c;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF11008a() {
            return this.f11008a;
        }

        @Override // app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SemiClosedLoop)) {
                return false;
            }
            SemiClosedLoop semiClosedLoop = (SemiClosedLoop) obj;
            return Intrinsics.d(this.f11008a, semiClosedLoop.f11008a) && Intrinsics.d(this.b, semiClosedLoop.b) && this.c == semiClosedLoop.c && this.d == semiClosedLoop.d && this.e == semiClosedLoop.e && Intrinsics.d(this.f, semiClosedLoop.f);
        }

        public final int hashCode() {
            int iHashCode = (((this.c.hashCode() + nf1.e(this.f11008a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31;
            long j = this.e;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            Long l = this.f;
            return i + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SemiClosedLoop(walletId=", this.f11008a, ", userId=", this.b, ", cachedWalletStatus=");
            sbE.append(this.c);
            sbE.append(", remainingBalance=");
            sbE.append(this.d);
            sbE.append(", remainingLoadLimit=");
            sbE.append(this.e);
            sbE.append(", walletReclaimTime=");
            sbE.append(this.f);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract CachedWalletStatus getC();

    /* JADX INFO: renamed from: b */
    public abstract int getD();

    /* JADX INFO: renamed from: c */
    public abstract String getB();

    /* JADX INFO: renamed from: d */
    public abstract String getF11008a();

    /* JADX INFO: renamed from: e */
    public abstract Long getF();
}
