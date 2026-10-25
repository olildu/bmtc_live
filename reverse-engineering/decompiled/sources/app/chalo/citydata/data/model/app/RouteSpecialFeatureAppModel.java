package app.chalo.citydata.data.model.app;

import defpackage.d41;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteSpecialFeatureAppModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteSpecialFeatureAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new d41(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1715a;
    public final RouteSpecialFeatureType b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/app/RouteSpecialFeatureAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/app/RouteSpecialFeatureAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteSpecialFeatureAppModel> serializer() {
            return RouteSpecialFeatureAppModel$$serializer.f1716a;
        }
    }

    public /* synthetic */ RouteSpecialFeatureAppModel(int i, String str, RouteSpecialFeatureType routeSpecialFeatureType) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(RouteSpecialFeatureAppModel$$serializer.f1716a.getDescriptor(), i, 3);
            throw null;
        }
        this.f1715a = str;
        this.b = routeSpecialFeatureType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSpecialFeatureAppModel)) {
            return false;
        }
        RouteSpecialFeatureAppModel routeSpecialFeatureAppModel = (RouteSpecialFeatureAppModel) obj;
        return Intrinsics.d(this.f1715a, routeSpecialFeatureAppModel.f1715a) && this.b == routeSpecialFeatureAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1715a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteSpecialFeatureAppModel(featureName=" + this.f1715a + ", featureType=" + this.b + ")";
    }

    public RouteSpecialFeatureAppModel(String featureName, RouteSpecialFeatureType featureType) {
        Intrinsics.i(featureName, "featureName");
        Intrinsics.i(featureType, "featureType");
        this.f1715a = featureName;
        this.b = featureType;
    }
}
