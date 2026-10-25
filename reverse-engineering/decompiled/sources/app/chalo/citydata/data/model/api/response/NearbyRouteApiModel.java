package app.chalo.citydata.data.model.api.response;

import defpackage.dd;
import defpackage.jk0;
import defpackage.pk0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/NearbyRouteApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyRouteApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(13)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1662a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final StopApiModel f;
    public final StopApiModel g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/NearbyRouteApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/NearbyRouteApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyRouteApiModel> serializer() {
            return NearbyRouteApiModel$$serializer.f1663a;
        }
    }

    public /* synthetic */ NearbyRouteApiModel(int i, String str, String str2, String str3, List list, String str4, StopApiModel stopApiModel, StopApiModel stopApiModel2) {
        if ((i & 1) == 0) {
            this.f1662a = null;
        } else {
            this.f1662a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = stopApiModel;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = stopApiModel2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRouteApiModel)) {
            return false;
        }
        NearbyRouteApiModel nearbyRouteApiModel = (NearbyRouteApiModel) obj;
        return Intrinsics.d(this.f1662a, nearbyRouteApiModel.f1662a) && Intrinsics.d(this.b, nearbyRouteApiModel.b) && Intrinsics.d(this.c, nearbyRouteApiModel.c) && Intrinsics.d(this.d, nearbyRouteApiModel.d) && Intrinsics.d(this.e, nearbyRouteApiModel.e) && Intrinsics.d(this.f, nearbyRouteApiModel.f) && Intrinsics.d(this.g, nearbyRouteApiModel.g);
    }

    public final int hashCode() {
        String str = this.f1662a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        StopApiModel stopApiModel = this.f;
        int iHashCode6 = (iHashCode5 + (stopApiModel == null ? 0 : stopApiModel.hashCode())) * 31;
        StopApiModel stopApiModel2 = this.g;
        return iHashCode6 + (stopApiModel2 != null ? stopApiModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NearbyRouteApiModel(routeId=", this.f1662a, ", routeName=", this.b, ", namingSchemeType=");
        pk0.w(this.c, ", specialFeaturesList=", ", via=", sbE, this.d);
        sbE.append(this.e);
        sbE.append(", endStop=");
        sbE.append(this.f);
        sbE.append(", startStop=");
        sbE.append(this.g);
        sbE.append(")");
        return sbE.toString();
    }
}
