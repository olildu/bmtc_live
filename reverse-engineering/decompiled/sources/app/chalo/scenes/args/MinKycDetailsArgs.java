package app.chalo.scenes.args;

import app.chalo.scenes.ChaloScenes;
import defpackage.ti0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/MinKycDetailsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinKycDetailsArgs extends SceneArgs {
    public static final MinKycDetailsArgs INSTANCE = new MinKycDetailsArgs();
    public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(6));

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.MinKycDetails;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof MinKycDetailsArgs);
    }

    public final int hashCode() {
        return -1652178218;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final KSerializer<MinKycDetailsArgs> serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "MinKycDetailsArgs";
    }
}
