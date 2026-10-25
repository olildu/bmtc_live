package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.go;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/CheckoutPhonePeArgs;", "Lapp/chalo/scenes/args/CheckoutArgs;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CheckoutPhonePeArgs extends CheckoutArgs {
    public static final CheckoutPhonePeArgs INSTANCE = new CheckoutPhonePeArgs();
    public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(19));

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.CheckoutPhonePe;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CheckoutPhonePeArgs);
    }

    public final int hashCode() {
        return -672386700;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final KSerializer<CheckoutPhonePeArgs> serializer() {
        return (KSerializer) c.getValue();
    }

    public final String toString() {
        return "CheckoutPhonePeArgs";
    }
}
