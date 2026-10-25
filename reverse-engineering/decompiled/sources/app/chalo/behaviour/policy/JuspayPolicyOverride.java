package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/JuspayPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class JuspayPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1004a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/JuspayPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/JuspayPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<JuspayPolicyOverride> serializer() {
            return JuspayPolicyOverride$$serializer.f1005a;
        }
    }

    public JuspayPolicyOverride() {
        this.f1004a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JuspayPolicyOverride) && Intrinsics.d(this.f1004a, ((JuspayPolicyOverride) obj).f1004a);
    }

    public final int hashCode() {
        Boolean bool = this.f1004a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "JuspayPolicyOverride(shouldInitialiseOnAppOpen=" + this.f1004a + ")";
    }

    public /* synthetic */ JuspayPolicyOverride(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f1004a = null;
        } else {
            this.f1004a = bool;
        }
    }
}
