package app.chalo.citydata.data.model.api.request;

import defpackage.hq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RoutesDataRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1642a;
    public final boolean b;
    public final boolean c;
    public final RoutesDataRequestDataApiModel d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RoutesDataRequestApiModel> serializer() {
            return RoutesDataRequestApiModel$$serializer.f1643a;
        }
    }

    public /* synthetic */ RoutesDataRequestApiModel(int i, String str, boolean z, boolean z2, RoutesDataRequestDataApiModel routesDataRequestDataApiModel) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(RoutesDataRequestApiModel$$serializer.f1643a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1642a = str;
        this.b = z;
        this.c = z2;
        this.d = routesDataRequestDataApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDataRequestApiModel)) {
            return false;
        }
        RoutesDataRequestApiModel routesDataRequestApiModel = (RoutesDataRequestApiModel) obj;
        return Intrinsics.d(this.f1642a, routesDataRequestApiModel.f1642a) && this.b == routesDataRequestApiModel.b && this.c == routesDataRequestApiModel.c && Intrinsics.d(this.d, routesDataRequestApiModel.d);
    }

    public final int hashCode() {
        int iHashCode = ((((this.f1642a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31;
        RoutesDataRequestDataApiModel routesDataRequestDataApiModel = this.d;
        return iHashCode + (routesDataRequestDataApiModel == null ? 0 : routesDataRequestDataApiModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("RoutesDataRequestApiModel(cityName=", this.f1642a, ", isRequestFromBackgroundSync=", ", isInitialFetch=", this.b);
        sbM.append(this.c);
        sbM.append(", requestData=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }

    public RoutesDataRequestApiModel(String str, RoutesDataRequestDataApiModel routesDataRequestDataApiModel) {
        this.f1642a = str;
        this.b = false;
        this.c = false;
        this.d = routesDataRequestDataApiModel;
    }
}
