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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/CheckoutPaymentMainArgs;", "Lapp/chalo/scenes/args/CheckoutArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutPaymentMainArgs extends CheckoutArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CheckoutPaymentMainArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CheckoutPaymentMainArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CheckoutPaymentMainArgs> serializer() {
            return CheckoutPaymentMainArgs$$serializer.f9237a;
        }
    }

    public /* synthetic */ CheckoutPaymentMainArgs(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(CheckoutPaymentMainArgs$$serializer.f9237a.getDescriptor(), i, 3);
            throw null;
        }
        this.c = str;
        this.d = str2;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.CheckoutPaymentMain;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPaymentMainArgs)) {
            return false;
        }
        CheckoutPaymentMainArgs checkoutPaymentMainArgs = (CheckoutPaymentMainArgs) obj;
        return Intrinsics.d(this.c, checkoutPaymentMainArgs.c) && Intrinsics.d(this.d, checkoutPaymentMainArgs.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("CheckoutPaymentMainArgs(requestId=", this.c, ", intentModelJson=", this.d, ")");
    }

    public CheckoutPaymentMainArgs(String requestId, String intentModelJson) {
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(intentModelJson, "intentModelJson");
        this.c = requestId;
        this.d = intentModelJson;
    }
}
