package app.chalo.behaviour.policy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/TripPlannerPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripPlannerPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1087a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/TripPlannerPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/TripPlannerPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripPlannerPolicyOverride> serializer() {
            return TripPlannerPolicyOverride$$serializer.f1088a;
        }
    }

    public TripPlannerPolicyOverride() {
        this.f1087a = Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TripPlannerPolicyOverride) && Intrinsics.d(this.f1087a, ((TripPlannerPolicyOverride) obj).f1087a);
    }

    public final int hashCode() {
        Boolean bool = this.f1087a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "TripPlannerPolicyOverride(showDateTimeSelection=" + this.f1087a + ")";
    }

    public /* synthetic */ TripPlannerPolicyOverride(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f1087a = null;
        } else {
            this.f1087a = bool;
        }
    }
}
