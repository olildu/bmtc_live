package app.chalo.data;

import defpackage.nf1;
import defpackage.xs;
import defpackage.yn1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/WalletEnableConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletEnableConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2410a;
    public final boolean b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/WalletEnableConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/WalletEnableConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletEnableConfig> serializer() {
            return WalletEnableConfig$$serializer.f2411a;
        }
    }

    public WalletEnableConfig(int i, boolean z, boolean z2, List list) {
        if ((i & 1) == 0) {
            this.f2410a = false;
        } else {
            this.f2410a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.f17557a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletEnableConfig)) {
            return false;
        }
        WalletEnableConfig walletEnableConfig = (WalletEnableConfig) obj;
        return this.f2410a == walletEnableConfig.f2410a && this.b == walletEnableConfig.b && Intrinsics.d(this.c, walletEnableConfig.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.f2410a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return xs.l(nf1.r("WalletEnableConfig(semiClosedWalletEnabled=", ", semiClosedQuickPayEnabled=", ", closedLoopWallet=", this.f2410a, this.b), this.c, ")");
    }

    public WalletEnableConfig(List closedLoopWallet, boolean z, boolean z2) {
        Intrinsics.i(closedLoopWallet, "closedLoopWallet");
        this.f2410a = z;
        this.b = z2;
        this.c = closedLoopWallet;
    }

    public WalletEnableConfig() {
        this(EmptyList.f17557a, false, false);
    }
}
