package app.chalo.scenes.args;

import defpackage.ul;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/scenes/args/CheckoutArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Companion", "Lapp/chalo/scenes/args/CheckoutCardArgs;", "Lapp/chalo/scenes/args/CheckoutInaiArgs;", "Lapp/chalo/scenes/args/CheckoutNetBankingArgs;", "Lapp/chalo/scenes/args/CheckoutPaymentMainArgs;", "Lapp/chalo/scenes/args/CheckoutPhonePeArgs;", "Lapp/chalo/scenes/args/CheckoutPostPaymentArgs;", "Lapp/chalo/scenes/args/CheckoutRazorpayArgs;", "Lapp/chalo/scenes/args/CheckoutUpiArgs;", "Lapp/chalo/scenes/args/CheckoutWalletArgs;", "Lapp/chalo/scenes/args/CustomUrlCheckoutArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class CheckoutArgs extends SceneArgs implements ParentArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(20));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CheckoutArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CheckoutArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<CheckoutArgs> serializer() {
            return (KSerializer) CheckoutArgs.b.getValue();
        }
    }
}
