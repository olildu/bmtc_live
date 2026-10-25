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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/SuperPassVerificationStatusArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassVerificationStatusArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/SuperPassVerificationStatusArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/SuperPassVerificationStatusArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassVerificationStatusArgs> serializer() {
            return SuperPassVerificationStatusArgs$$serializer.f9322a;
        }
    }

    public /* synthetic */ SuperPassVerificationStatusArgs(int i, String str, String str2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(SuperPassVerificationStatusArgs$$serializer.f9322a.getDescriptor(), i, 3);
            throw null;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.SuperPassVerificationStatusScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassVerificationStatusArgs)) {
            return false;
        }
        SuperPassVerificationStatusArgs superPassVerificationStatusArgs = (SuperPassVerificationStatusArgs) obj;
        return Intrinsics.d(this.b, superPassVerificationStatusArgs.b) && Intrinsics.d(this.c, superPassVerificationStatusArgs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("SuperPassVerificationStatusArgs(superPassApplication=", this.b, ", source=", this.c, ")");
    }

    public SuperPassVerificationStatusArgs(String superPassApplication, String source) {
        Intrinsics.i(superPassApplication, "superPassApplication");
        Intrinsics.i(source, "source");
        this.b = superPassApplication;
        this.c = source;
    }
}
