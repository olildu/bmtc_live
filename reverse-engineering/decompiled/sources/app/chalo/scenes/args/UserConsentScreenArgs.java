package app.chalo.scenes.args;

import app.chalo.login.AuthenticatedArgs;
import app.chalo.scenes.ChaloScenes;
import app.chalo.userconsent.UserConsentFlowType;
import defpackage.dn1;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/scenes/args/UserConsentScreenArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/login/AuthenticatedArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserConsentScreenArgs extends SceneArgs implements AuthenticatedArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new dn1(17)), null};
    public final UserConsentFlowType b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/UserConsentScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/UserConsentScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserConsentScreenArgs> serializer() {
            return UserConsentScreenArgs$$serializer.f9338a;
        }
    }

    public /* synthetic */ UserConsentScreenArgs(int i, UserConsentFlowType userConsentFlowType, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(UserConsentScreenArgs$$serializer.f9338a.getDescriptor(), i, 1);
            throw null;
        }
        this.b = userConsentFlowType;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    @Override // app.chalo.login.AuthenticatedArgs
    public final boolean b() {
        return true;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.UserConsent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentScreenArgs)) {
            return false;
        }
        UserConsentScreenArgs userConsentScreenArgs = (UserConsentScreenArgs) obj;
        return Intrinsics.d(this.b, userConsentScreenArgs.b) && Intrinsics.d(this.c, userConsentScreenArgs.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UserConsentScreenArgs(flowType=" + this.b + ", requestId=" + this.c + ")";
    }

    public UserConsentScreenArgs(UserConsentFlowType flowType, String str) {
        Intrinsics.i(flowType, "flowType");
        this.b = flowType;
        this.c = str;
    }
}
