package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/CustomUrlCheckoutArgs;", "Lapp/chalo/scenes/args/CheckoutArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CustomUrlCheckoutArgs extends CheckoutArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CustomUrlCheckoutArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CustomUrlCheckoutArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CustomUrlCheckoutArgs> serializer() {
            return CustomUrlCheckoutArgs$$serializer.f9244a;
        }
    }

    public /* synthetic */ CustomUrlCheckoutArgs(int i, String str) {
        if (1 == (i & 1)) {
            this.c = str;
        } else {
            PluginExceptionsKt.b(CustomUrlCheckoutArgs$$serializer.f9244a.getDescriptor(), i, 1);
            throw null;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.CustomUrlCheckoutScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomUrlCheckoutArgs) && Intrinsics.d(this.c, ((CustomUrlCheckoutArgs) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return vo1.B("CustomUrlCheckoutArgs(paymentUrl=", this.c, ")");
    }

    public CustomUrlCheckoutArgs(String paymentUrl) {
        Intrinsics.i(paymentUrl, "paymentUrl");
        this.c = paymentUrl;
    }
}
