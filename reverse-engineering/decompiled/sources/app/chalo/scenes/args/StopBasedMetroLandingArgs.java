package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.ra1;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/StopBasedMetroLandingArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class StopBasedMetroLandingArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(8)), null, null};
    public final Source b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/StopBasedMetroLandingArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/StopBasedMetroLandingArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<StopBasedMetroLandingArgs> serializer() {
            return StopBasedMetroLandingArgs$$serializer.f9308a;
        }
    }

    public /* synthetic */ StopBasedMetroLandingArgs(int i, Source source, String str, String str2) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(StopBasedMetroLandingArgs$$serializer.f9308a.getDescriptor(), i, 1);
            throw null;
        }
        this.b = source;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.StopBasedMetroLandingScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedMetroLandingArgs)) {
            return false;
        }
        StopBasedMetroLandingArgs stopBasedMetroLandingArgs = (StopBasedMetroLandingArgs) obj;
        return this.b == stopBasedMetroLandingArgs.b && Intrinsics.d(this.c, stopBasedMetroLandingArgs.c) && Intrinsics.d(this.d, stopBasedMetroLandingArgs.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopBasedMetroLandingArgs(source=");
        sb.append(this.b);
        sb.append(", fromStop=");
        sb.append(this.c);
        sb.append(", toStop=");
        return vo1.p(sb, this.d, ")");
    }

    public StopBasedMetroLandingArgs(Source source, String str, String str2) {
        Intrinsics.i(source, "source");
        this.b = source;
        this.c = str;
        this.d = str2;
    }
}
