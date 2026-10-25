package app.chalo.behaviour.policy;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/SdkIntegrationPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SdkIntegrationPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1079a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/SdkIntegrationPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/SdkIntegrationPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SdkIntegrationPolicyOverride> serializer() {
            return SdkIntegrationPolicyOverride$$serializer.f1080a;
        }
    }

    public SdkIntegrationPolicyOverride() {
        Boolean bool = Boolean.FALSE;
        this.f1079a = bool;
        this.b = bool;
        this.c = bool;
        this.d = bool;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIntegrationPolicyOverride)) {
            return false;
        }
        SdkIntegrationPolicyOverride sdkIntegrationPolicyOverride = (SdkIntegrationPolicyOverride) obj;
        return Intrinsics.d(this.f1079a, sdkIntegrationPolicyOverride.f1079a) && Intrinsics.d(this.b, sdkIntegrationPolicyOverride.b) && Intrinsics.d(this.c, sdkIntegrationPolicyOverride.c) && Intrinsics.d(this.d, sdkIntegrationPolicyOverride.d) && Intrinsics.d(this.e, sdkIntegrationPolicyOverride.e);
    }

    public final int hashCode() {
        Boolean bool = this.f1079a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        return iHashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkIntegrationPolicyOverride(enableAdjust=");
        sb.append(this.f1079a);
        sb.append(", enablePlotline=");
        sb.append(this.b);
        sb.append(", enableThoughtNudge=");
        hq0.u(sb, this.c, ", enableFreshchat=", this.d, ", enableAds=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ SdkIntegrationPolicyOverride(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        if ((i & 1) == 0) {
            this.f1079a = null;
        } else {
            this.f1079a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool5;
        }
    }
}
