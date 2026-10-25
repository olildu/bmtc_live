package app.chalo.scenes.args;

import app.chalo.login.AuthenticatedArgs;
import defpackage.gp1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/scenes/args/WalletSceneArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "Lapp/chalo/scenes/args/WalletAllTransactionsArgs;", "Lapp/chalo/scenes/args/WalletBalanceArgs;", "Lapp/chalo/scenes/args/WalletLoadBalanceSuccessArgs;", "Lapp/chalo/scenes/args/WalletLoadMoneyArgs;", "Lapp/chalo/scenes/args/WalletTransactionSummaryArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class WalletSceneArgs extends SceneArgs implements ParentArgs, AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(1));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/WalletSceneArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<WalletSceneArgs> serializer() {
            return (KSerializer) WalletSceneArgs.b.getValue();
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return true;
    }
}
