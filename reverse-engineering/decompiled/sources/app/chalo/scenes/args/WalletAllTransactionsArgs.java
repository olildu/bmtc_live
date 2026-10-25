package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/WalletAllTransactionsArgs;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletAllTransactionsArgs extends WalletSceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WalletAllTransactionsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WalletAllTransactionsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletAllTransactionsArgs> serializer() {
            return WalletAllTransactionsArgs$$serializer.f9344a;
        }
    }

    public /* synthetic */ WalletAllTransactionsArgs(int i, boolean z) {
        if ((i & 1) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.WalletAllTransactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WalletAllTransactionsArgs) && this.c == ((WalletAllTransactionsArgs) obj).c;
    }

    public final int hashCode() {
        return this.c ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("WalletAllTransactionsArgs(onlyShowQuickPayTransactions=", ")", this.c);
    }

    public WalletAllTransactionsArgs(boolean z) {
        this.c = z;
    }
}
