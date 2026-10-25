package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.hf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/LoginOptionsArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LoginOptionsArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(18)), null};
    public final Source b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/LoginOptionsArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/LoginOptionsArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LoginOptionsArgs> serializer() {
            return LoginOptionsArgs$$serializer.f9268a;
        }
    }

    public /* synthetic */ LoginOptionsArgs(int i, Source source, boolean z) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(LoginOptionsArgs$$serializer.f9268a.getDescriptor(), i, 1);
            throw null;
        }
        this.b = source;
        if ((i & 2) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.LoginOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginOptionsArgs)) {
            return false;
        }
        LoginOptionsArgs loginOptionsArgs = (LoginOptionsArgs) obj;
        return this.b == loginOptionsArgs.b && this.c == loginOptionsArgs.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "LoginOptionsArgs(source=" + this.b + ", handlePostLoginNavigation=" + this.c + ")";
    }

    public LoginOptionsArgs(Source source, boolean z) {
        Intrinsics.i(source, "source");
        this.b = source;
        this.c = z;
    }
}
