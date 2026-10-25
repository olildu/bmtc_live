package app.chalo.citydata.data.model.app.response;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.jk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/NearbyStopToLocationAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyStopToLocationAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1740a;
    public final String b;
    public final double c;
    public final String d;
    public final ChaloTransitMode e;
    public final String f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/NearbyStopToLocationAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/response/NearbyStopToLocationAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyStopToLocationAppModel> serializer() {
            return NearbyStopToLocationAppModel$$serializer.f1741a;
        }
    }

    public NearbyStopToLocationAppModel(double d, String stopId, double d2, String str, ChaloTransitMode transitMode, String stopName, long j) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(stopName, "stopName");
        this.f1740a = d;
        this.b = stopId;
        this.c = d2;
        this.d = str;
        this.e = transitMode;
        this.f = stopName;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyStopToLocationAppModel)) {
            return false;
        }
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel = (NearbyStopToLocationAppModel) obj;
        return Double.compare(this.f1740a, nearbyStopToLocationAppModel.f1740a) == 0 && Intrinsics.d(this.b, nearbyStopToLocationAppModel.b) && Double.compare(this.c, nearbyStopToLocationAppModel.c) == 0 && Intrinsics.d(this.d, nearbyStopToLocationAppModel.d) && this.e == nearbyStopToLocationAppModel.e && Intrinsics.d(this.f, nearbyStopToLocationAppModel.f) && this.g == nearbyStopToLocationAppModel.g;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1740a);
        int iE = nf1.e(((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31, 31, this.b);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.c);
        int iE2 = nf1.e(n21.c(this.e, nf1.e((iE + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, 31, this.d), 31), 31, this.f);
        long j = this.g;
        return iE2 + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyStopToLocationAppModel(stopLon=");
        sb.append(this.f1740a);
        sb.append(", stopId=");
        sb.append(this.b);
        pk0.z(sb, ", stopLat=", this.c, ", stopAddress=");
        sb.append(this.d);
        sb.append(", transitMode=");
        sb.append(this.e);
        sb.append(", stopName=");
        n21.p(this.g, this.f, ", distance=", sb);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ NearbyStopToLocationAppModel(int i, double d, String str, double d2, String str2, ChaloTransitMode chaloTransitMode, String str3, long j) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(NearbyStopToLocationAppModel$$serializer.f1741a.getDescriptor(), i, 127);
            throw null;
        }
        this.f1740a = d;
        this.b = str;
        this.c = d2;
        this.d = str2;
        this.e = chaloTransitMode;
        this.f = str3;
        this.g = j;
    }
}
