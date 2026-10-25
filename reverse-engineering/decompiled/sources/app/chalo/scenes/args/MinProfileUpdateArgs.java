package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.hq0;
import defpackage.ti0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/MinProfileUpdateArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MinProfileUpdateArgs extends SceneArgs implements AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(11))};
    public final String b;
    public final boolean c;
    public final Source d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/MinProfileUpdateArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/MinProfileUpdateArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MinProfileUpdateArgs> serializer() {
            return MinProfileUpdateArgs$$serializer.f9273a;
        }
    }

    public /* synthetic */ MinProfileUpdateArgs(int i, Source source, String str, boolean z) {
        this.b = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 4) == 0) {
            this.d = Source.UNKNOWN;
        } else {
            this.d = source;
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return false;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.MinProfileUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinProfileUpdateArgs)) {
            return false;
        }
        MinProfileUpdateArgs minProfileUpdateArgs = (MinProfileUpdateArgs) obj;
        return Intrinsics.d(this.b, minProfileUpdateArgs.b) && this.c == minProfileUpdateArgs.c && this.d == minProfileUpdateArgs.d;
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + ((((str == null ? 0 : str.hashCode()) * 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("MinProfileUpdateArgs(requestId=", this.b, ", isSkipAllowed=", ", source=", this.c);
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public MinProfileUpdateArgs(String str, boolean z, Source source) {
        Intrinsics.i(source, "source");
        this.b = str;
        this.c = z;
        this.d = source;
    }
}
