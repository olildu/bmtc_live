package app.chalo.citydata.data.model.api.response;

import defpackage.hq0;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteLiveDataApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RouteLiveDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1676a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Long e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/citydata/data/model/api/response/RouteLiveDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteLiveDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RouteLiveDataApiModel> serializer() {
            return RouteLiveDataApiModel$$serializer.f1677a;
        }
    }

    public /* synthetic */ RouteLiveDataApiModel(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Long l) {
        this.f1676a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Boolean.FALSE;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = Boolean.FALSE;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = Boolean.FALSE;
        } else {
            this.d = bool4;
        }
        if ((i & 16) == 0) {
            this.e = 2L;
        } else {
            this.e = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLiveDataApiModel)) {
            return false;
        }
        RouteLiveDataApiModel routeLiveDataApiModel = (RouteLiveDataApiModel) obj;
        return Intrinsics.d(this.f1676a, routeLiveDataApiModel.f1676a) && Intrinsics.d(this.b, routeLiveDataApiModel.b) && Intrinsics.d(this.c, routeLiveDataApiModel.c) && Intrinsics.d(this.d, routeLiveDataApiModel.d) && Intrinsics.d(this.e, routeLiveDataApiModel.e);
    }

    public final int hashCode() {
        Boolean bool = this.f1676a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteLiveDataApiModel(mTicketEnabled=");
        sb.append(this.f1676a);
        sb.append(", routePassEnabled=");
        sb.append(this.b);
        sb.append(", isAirportRoute=");
        hq0.u(sb, this.c, ", isPremiumBusRoute=", this.d, ", availabilityLevel=");
        return pk0.l(sb, this.e, ")");
    }
}
