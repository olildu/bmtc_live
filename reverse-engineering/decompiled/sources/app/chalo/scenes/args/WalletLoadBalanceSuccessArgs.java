package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/WalletLoadBalanceSuccessArgs;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletLoadBalanceSuccessArgs extends WalletSceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final long c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WalletLoadBalanceSuccessArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WalletLoadBalanceSuccessArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletLoadBalanceSuccessArgs> serializer() {
            return WalletLoadBalanceSuccessArgs$$serializer.f9346a;
        }
    }

    public WalletLoadBalanceSuccessArgs(long j, String str, boolean z) {
        this.c = j;
        this.d = z;
        this.e = str;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.WalletLoadBalanceSuccess;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceSuccessArgs)) {
            return false;
        }
        WalletLoadBalanceSuccessArgs walletLoadBalanceSuccessArgs = (WalletLoadBalanceSuccessArgs) obj;
        return this.c == walletLoadBalanceSuccessArgs.c && this.d == walletLoadBalanceSuccessArgs.d && Intrinsics.d(this.e, walletLoadBalanceSuccessArgs.e);
    }

    public final int hashCode() {
        long j = this.c;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletLoadBalanceSuccessArgs(amountAdded=");
        sb.append(this.c);
        sb.append(", shouldExit=");
        sb.append(this.d);
        return z40.h(sb, ", requestId=", this.e, ")");
    }

    public /* synthetic */ WalletLoadBalanceSuccessArgs(String str, int i, long j, boolean z) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(WalletLoadBalanceSuccessArgs$$serializer.f9346a.getDescriptor(), i, 1);
            throw null;
        }
        this.c = j;
        if ((i & 2) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }
}
