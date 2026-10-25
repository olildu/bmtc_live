package app.chalo.citydata.data.model.app;

import defpackage.nf1;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteLiveDetailsAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteLiveDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1713a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteLiveDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteLiveDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteLiveDetailsAppModel> serializer() {
            return RouteLiveDetailsAppModel$$serializer.f1714a;
        }
    }

    public /* synthetic */ RouteLiveDetailsAppModel(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(RouteLiveDetailsAppModel$$serializer.f1714a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1713a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLiveDetailsAppModel)) {
            return false;
        }
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = (RouteLiveDetailsAppModel) obj;
        return this.f1713a == routeLiveDetailsAppModel.f1713a && this.b == routeLiveDetailsAppModel.b && this.c == routeLiveDetailsAppModel.c && this.d == routeLiveDetailsAppModel.d && Intrinsics.d(this.e, routeLiveDetailsAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((((((this.f1713a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = nf1.r("RouteLiveDetailsAppModel(isMobileTicketEnabled=", ", isRoutePassEnabled=", ", isAirportRoute=", this.f1713a, this.b);
        z40.r(sbR, this.c, ", isPremiumBusRoute=", this.d, ", busAvailabilityStatusId=");
        return vo1.p(sbR, this.e, ")");
    }

    public RouteLiveDetailsAppModel(String busAvailabilityStatusId, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(busAvailabilityStatusId, "busAvailabilityStatusId");
        this.f1713a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = busAvailabilityStatusId;
    }
}
