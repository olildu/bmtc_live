package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.xi1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/TitoRideDetailsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TitoRideDetailsArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xi1(14))};
    public final String b;
    public final Source c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/TitoRideDetailsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/TitoRideDetailsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TitoRideDetailsArgs> serializer() {
            return TitoRideDetailsArgs$$serializer.f9329a;
        }
    }

    public /* synthetic */ TitoRideDetailsArgs(int i, Source source, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(TitoRideDetailsArgs$$serializer.f9329a.getDescriptor(), i, 3);
            throw null;
        }
        this.b = str;
        this.c = source;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.TitoRideDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitoRideDetailsArgs)) {
            return false;
        }
        TitoRideDetailsArgs titoRideDetailsArgs = (TitoRideDetailsArgs) obj;
        return Intrinsics.d(this.b, titoRideDetailsArgs.b) && this.c == titoRideDetailsArgs.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "TitoRideDetailsArgs(tapId=" + this.b + ", source=" + this.c + ")";
    }

    public TitoRideDetailsArgs(Source source, String tapId) {
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(source, "source");
        this.b = tapId;
        this.c = source;
    }
}
