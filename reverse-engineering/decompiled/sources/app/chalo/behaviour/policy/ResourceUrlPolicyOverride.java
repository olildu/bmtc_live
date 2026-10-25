package app.chalo.behaviour.policy;

import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/ResourceUrlPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ResourceUrlPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1076a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/ResourceUrlPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/ResourceUrlPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ResourceUrlPolicyOverride> serializer() {
            return ResourceUrlPolicyOverride$$serializer.f1077a;
        }
    }

    public ResourceUrlPolicyOverride() {
        this.f1076a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceUrlPolicyOverride)) {
            return false;
        }
        ResourceUrlPolicyOverride resourceUrlPolicyOverride = (ResourceUrlPolicyOverride) obj;
        return Intrinsics.d(this.f1076a, resourceUrlPolicyOverride.f1076a) && Intrinsics.d(this.b, resourceUrlPolicyOverride.b) && Intrinsics.d(this.c, resourceUrlPolicyOverride.c);
    }

    public final int hashCode() {
        String str = this.f1076a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return vo1.p(dd.e("ResourceUrlPolicyOverride(bleTutorialGif=", this.f1076a, ", bleValidationGif=", this.b, ", blePermissionTutorialGif="), this.c, ")");
    }

    public /* synthetic */ ResourceUrlPolicyOverride(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f1076a = null;
        } else {
            this.f1076a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }
}
