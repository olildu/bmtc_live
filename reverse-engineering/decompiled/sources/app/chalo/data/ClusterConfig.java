package app.chalo.data;

import defpackage.ep;
import defpackage.q7;
import defpackage.r30;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ClusterConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ClusterConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2346a;
    public final List b;
    public final boolean c;
    public final RecentsCacheProperties d;
    public final boolean e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ClusterConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ClusterConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ClusterConfig> serializer() {
            return ClusterConfig$$serializer.f2347a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new ep(11)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ep(12))};
    }

    public ClusterConfig(String clusterId, List list) {
        Intrinsics.i(clusterId, "clusterId");
        this.f2346a = clusterId;
        this.b = list;
        this.c = false;
        this.d = null;
        this.e = true;
        this.f = null;
    }

    public final boolean a(String str) {
        List list = this.f;
        if (list != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (StringsKt.x((String) it.next(), str, true)) {
                        return true;
                    }
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClusterConfig)) {
            return false;
        }
        ClusterConfig clusterConfig = (ClusterConfig) obj;
        return Intrinsics.d(this.f2346a, clusterConfig.f2346a) && Intrinsics.d(this.b, clusterConfig.b) && this.c == clusterConfig.c && Intrinsics.d(this.d, clusterConfig.d) && this.e == clusterConfig.e && Intrinsics.d(this.f, clusterConfig.f);
    }

    public final int hashCode() {
        int iB = (r30.b(this.f2346a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31;
        RecentsCacheProperties recentsCacheProperties = this.d;
        int iHashCode = (((iB + (recentsCacheProperties == null ? 0 : recentsCacheProperties.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("ClusterConfig(clusterId=", this.f2346a, ", cityIdsInCluster=", ", isKSRTCCityCluster=", this.b);
        sbH.append(this.c);
        sbH.append(", recentsCacheProperties=");
        sbH.append(this.d);
        sbH.append(", enableNonChaloPayTicketing=");
        sbH.append(this.e);
        sbH.append(", enableNonChaloPayTicketingCityIds=");
        sbH.append(this.f);
        sbH.append(")");
        return sbH.toString();
    }

    public /* synthetic */ ClusterConfig(int i, String str, List list, boolean z, RecentsCacheProperties recentsCacheProperties, boolean z2, List list2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(ClusterConfig$$serializer.f2347a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2346a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = recentsCacheProperties;
        }
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
    }
}
