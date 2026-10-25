package app.chalo.citydata.repository.local.room.entity;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.d41;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteStopEntityModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteStopEntityModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new d41(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1794a;
    public final String b;
    public final double c;
    public final double d;
    public final ChaloTransitMode e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/repository/local/room/entity/RouteStopEntityModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteStopEntityModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteStopEntityModel> serializer() {
            return RouteStopEntityModel$$serializer.f1795a;
        }
    }

    public /* synthetic */ RouteStopEntityModel(int i, String str, String str2, double d, double d2, ChaloTransitMode chaloTransitMode, String str3) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(RouteStopEntityModel$$serializer.f1795a.getDescriptor(), i, 31);
            throw null;
        }
        this.f1794a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
        this.e = chaloTransitMode;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStopEntityModel)) {
            return false;
        }
        RouteStopEntityModel routeStopEntityModel = (RouteStopEntityModel) obj;
        return Intrinsics.d(this.f1794a, routeStopEntityModel.f1794a) && Intrinsics.d(this.b, routeStopEntityModel.b) && Double.compare(this.c, routeStopEntityModel.c) == 0 && Double.compare(this.d, routeStopEntityModel.d) == 0 && this.e == routeStopEntityModel.e && Intrinsics.d(this.f, routeStopEntityModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1794a.hashCode() * 31, 31, this.b);
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.d);
        int iC = n21.c(this.e, (i + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteStopEntityModel(stopId=", this.f1794a, ", stopName=", this.b, ", stopLat=");
        sbE.append(this.c);
        pk0.z(sbE, ", stopLng=", this.d, ", transitMode=");
        sbE.append(this.e);
        sbE.append(", stopAddress=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public RouteStopEntityModel(String stopId, String stopName, double d, double d2, ChaloTransitMode transitMode, String str) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(transitMode, "transitMode");
        this.f1794a = stopId;
        this.b = stopName;
        this.c = d;
        this.d = d2;
        this.e = transitMode;
        this.f = str;
    }
}
