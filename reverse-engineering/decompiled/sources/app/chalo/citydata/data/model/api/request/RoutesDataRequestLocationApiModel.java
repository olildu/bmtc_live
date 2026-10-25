package app.chalo.citydata.data.model.api.request;

import defpackage.n21;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestLocationApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RoutesDataRequestLocationApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1646a;
    public final double b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestLocationApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestLocationApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RoutesDataRequestLocationApiModel> serializer() {
            return RoutesDataRequestLocationApiModel$$serializer.f1647a;
        }
    }

    public RoutesDataRequestLocationApiModel(double d, double d2) {
        this.f1646a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDataRequestLocationApiModel)) {
            return false;
        }
        RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel = (RoutesDataRequestLocationApiModel) obj;
        return Double.compare(this.f1646a, routesDataRequestLocationApiModel.f1646a) == 0 && Double.compare(this.b, routesDataRequestLocationApiModel.b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f1646a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f1646a, "RoutesDataRequestLocationApiModel(lat=", ", lng=");
        sbI.append(this.b);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ RoutesDataRequestLocationApiModel(int i, double d, double d2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(RoutesDataRequestLocationApiModel$$serializer.f1647a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1646a = d;
        this.b = d2;
    }
}
