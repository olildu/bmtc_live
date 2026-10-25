package app.chalo.recent.model.app;

import defpackage.dd;
import defpackage.hz0;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairAppModel;", "Lapp/chalo/recent/model/app/RecentsType;", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RecentLocationPairAppModel extends RecentsType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;
    public final String e;
    public final String f;
    public final RecentLocationPairEndpointAppModel g;
    public final RecentLocationPairEndpointAppModel h;
    public final long i;
    public final int j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/recent/model/app/RecentLocationPairAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RecentLocationPairAppModel> serializer() {
            return RecentLocationPairAppModel$$serializer.f8997a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new Lazy[]{null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new hz0(21)), LazyKt.a(lazyThreadSafetyMode, new hz0(22)), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentLocationPairAppModel(int i, String str, String str2, long j, String str3, String str4, RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel, RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel2, long j2, int i2) {
        super(str, str2, j);
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(RecentLocationPairAppModel$$serializer.f8997a.getDescriptor(), i, 127);
            throw null;
        }
        this.e = str3;
        this.f = str4;
        this.g = recentLocationPairEndpointAppModel;
        this.h = recentLocationPairEndpointAppModel2;
        if ((i & 128) == 0) {
            this.i = -1L;
        } else {
            this.i = j2;
        }
        if ((i & 256) == 0) {
            this.j = 0;
        } else {
            this.j = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentLocationPairAppModel)) {
            return false;
        }
        RecentLocationPairAppModel recentLocationPairAppModel = (RecentLocationPairAppModel) obj;
        return Intrinsics.d(this.e, recentLocationPairAppModel.e) && Intrinsics.d(this.f, recentLocationPairAppModel.f) && Intrinsics.d(this.g, recentLocationPairAppModel.g) && Intrinsics.d(this.h, recentLocationPairAppModel.h) && this.i == recentLocationPairAppModel.i && this.j == recentLocationPairAppModel.j;
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + nf1.e(this.e.hashCode() * 31, 31, this.f)) * 31)) * 31;
        long j = this.i;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.j;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentLocationPairAppModel(pairId=", this.e, ", cityId=", this.f, ", fromEndpoint=");
        sbE.append(this.g);
        sbE.append(", toEndpoint=");
        sbE.append(this.h);
        sbE.append(", accessTime=");
        sbE.append(this.i);
        sbE.append(", accessCount=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentLocationPairAppModel(String pairId, String cityId, RecentLocationPairEndpointAppModel fromEndpoint, RecentLocationPairEndpointAppModel toEndpoint, long j, int i) {
        super(j, pairId, cityId, 0);
        Intrinsics.i(pairId, "pairId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(fromEndpoint, "fromEndpoint");
        Intrinsics.i(toEndpoint, "toEndpoint");
        this.e = pairId;
        this.f = cityId;
        this.g = fromEndpoint;
        this.h = toEndpoint;
        this.i = j;
        this.j = i;
    }
}
