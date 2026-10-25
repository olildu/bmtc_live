package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/WalletLoadMoneyArgs;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletLoadMoneyArgs extends WalletSceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WalletLoadMoneyArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WalletLoadMoneyArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletLoadMoneyArgs> serializer() {
            return WalletLoadMoneyArgs$$serializer.f9347a;
        }
    }

    public /* synthetic */ WalletLoadMoneyArgs(String str, int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 2) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.WalletLoadMoney;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadMoneyArgs)) {
            return false;
        }
        WalletLoadMoneyArgs walletLoadMoneyArgs = (WalletLoadMoneyArgs) obj;
        return this.c == walletLoadMoneyArgs.c && this.d == walletLoadMoneyArgs.d && Intrinsics.d(this.e, walletLoadMoneyArgs.e);
    }

    public final int hashCode() {
        int i = (((this.c ? 1231 : 1237) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vo1.p(nf1.r("WalletLoadMoneyArgs(isFromPayForTicket=", ", shouldExitActivity=", ", requestId=", this.c, this.d), this.e, ")");
    }

    public WalletLoadMoneyArgs(String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public /* synthetic */ WalletLoadMoneyArgs(int i) {
        this(null, (i & 1) == 0, false);
    }
}
