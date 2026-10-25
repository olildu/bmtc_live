package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/WalletTransactionSummaryArgs;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletTransactionSummaryArgs extends WalletSceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WalletTransactionSummaryArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WalletTransactionSummaryArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletTransactionSummaryArgs> serializer() {
            return WalletTransactionSummaryArgs$$serializer.f9348a;
        }
    }

    public /* synthetic */ WalletTransactionSummaryArgs(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(WalletTransactionSummaryArgs$$serializer.f9348a.getDescriptor(), i, 7);
            throw null;
        }
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.WalletTransactionSummary;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTransactionSummaryArgs)) {
            return false;
        }
        WalletTransactionSummaryArgs walletTransactionSummaryArgs = (WalletTransactionSummaryArgs) obj;
        return Intrinsics.d(this.c, walletTransactionSummaryArgs.c) && Intrinsics.d(this.d, walletTransactionSummaryArgs.d) && Intrinsics.d(this.e, walletTransactionSummaryArgs.e);
    }

    public final int hashCode() {
        String str = this.c;
        return this.e.hashCode() + nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.d);
    }

    public final String toString() {
        return vo1.p(dd.e("WalletTransactionSummaryArgs(transactionId=", this.c, ", orderId=", this.d, ", transactionTypeString="), this.e, ")");
    }

    public WalletTransactionSummaryArgs(String str, String orderId, String transactionTypeString) {
        Intrinsics.i(orderId, "orderId");
        Intrinsics.i(transactionTypeString, "transactionTypeString");
        this.c = str;
        this.d = orderId;
        this.e = transactionTypeString;
    }
}
