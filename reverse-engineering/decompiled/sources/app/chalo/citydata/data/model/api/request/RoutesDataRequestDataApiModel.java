package app.chalo.citydata.data.model.api.request;

import defpackage.d;
import defpackage.d41;
import java.util.LinkedHashMap;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestDataApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RoutesDataRequestDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new d41(14)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoutesDataRequestMetaQueryParameterApiModel f1644a;
    public final Map b;
    public final RoutesDataRequestLocationApiModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/request/RoutesDataRequestDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RoutesDataRequestDataApiModel> serializer() {
            return RoutesDataRequestDataApiModel$$serializer.f1645a;
        }
    }

    public /* synthetic */ RoutesDataRequestDataApiModel(int i, RoutesDataRequestMetaQueryParameterApiModel routesDataRequestMetaQueryParameterApiModel, Map map, RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(RoutesDataRequestDataApiModel$$serializer.f1645a.getDescriptor(), i, 7);
            throw null;
        }
        this.f1644a = routesDataRequestMetaQueryParameterApiModel;
        this.b = map;
        this.c = routesDataRequestLocationApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDataRequestDataApiModel)) {
            return false;
        }
        RoutesDataRequestDataApiModel routesDataRequestDataApiModel = (RoutesDataRequestDataApiModel) obj;
        return Intrinsics.d(this.f1644a, routesDataRequestDataApiModel.f1644a) && Intrinsics.d(this.b, routesDataRequestDataApiModel.b) && Intrinsics.d(this.c, routesDataRequestDataApiModel.c);
    }

    public final int hashCode() {
        int iF = d.f(this.b, this.f1644a.hashCode() * 31, 31);
        RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel = this.c;
        return iF + (routesDataRequestLocationApiModel == null ? 0 : routesDataRequestLocationApiModel.hashCode());
    }

    public final String toString() {
        return "RoutesDataRequestDataApiModel(meta=" + this.f1644a + ", routeIdsToVersionMap=" + this.b + ", location=" + this.c + ")";
    }

    public RoutesDataRequestDataApiModel(RoutesDataRequestMetaQueryParameterApiModel routesDataRequestMetaQueryParameterApiModel, LinkedHashMap linkedHashMap, RoutesDataRequestLocationApiModel routesDataRequestLocationApiModel) {
        this.f1644a = routesDataRequestMetaQueryParameterApiModel;
        this.b = linkedHashMap;
        this.c = routesDataRequestLocationApiModel;
    }
}
