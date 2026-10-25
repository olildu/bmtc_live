package app.chalo.citydata.data.model.api.response;

import defpackage.xs;
import defpackage.y21;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteDetailsResponseOldApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteDetailsResponseOldApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteDetailOldApiModel f1672a;
    public final List b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteDetailsResponseOldApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteDetailsResponseOldApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteDetailsResponseOldApiModel> serializer() {
            return RouteDetailsResponseOldApiModel$$serializer.f1673a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new y21(17)), LazyKt.a(lazyThreadSafetyMode, new y21(18))};
    }

    public /* synthetic */ RouteDetailsResponseOldApiModel(int i, RouteDetailOldApiModel routeDetailOldApiModel, List list, List list2) {
        if ((i & 1) == 0) {
            this.f1672a = null;
        } else {
            this.f1672a = routeDetailOldApiModel;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsResponseOldApiModel)) {
            return false;
        }
        RouteDetailsResponseOldApiModel routeDetailsResponseOldApiModel = (RouteDetailsResponseOldApiModel) obj;
        return Intrinsics.d(this.f1672a, routeDetailsResponseOldApiModel.f1672a) && Intrinsics.d(this.b, routeDetailsResponseOldApiModel.b) && Intrinsics.d(this.c, routeDetailsResponseOldApiModel.c);
    }

    public final int hashCode() {
        RouteDetailOldApiModel routeDetailOldApiModel = this.f1672a;
        int iHashCode = (routeDetailOldApiModel == null ? 0 : routeDetailOldApiModel.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDetailsResponseOldApiModel(route=");
        sb.append(this.f1672a);
        sb.append(", timeTable=");
        sb.append(this.b);
        sb.append(", shortTrips=");
        return xs.l(sb, this.c, ")");
    }
}
