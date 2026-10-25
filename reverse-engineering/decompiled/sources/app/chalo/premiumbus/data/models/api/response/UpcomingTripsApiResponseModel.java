package app.chalo.premiumbus.data.models.api.response;

import defpackage.dd;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/UpcomingTripsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UpcomingTripsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7066a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/UpcomingTripsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/UpcomingTripsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UpcomingTripsApiResponseModel> serializer() {
            return UpcomingTripsApiResponseModel$$serializer.f7067a;
        }
    }

    public /* synthetic */ UpcomingTripsApiResponseModel(int i, String str, String str2, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(UpcomingTripsApiResponseModel$$serializer.f7067a.getDescriptor(), i, 31);
            throw null;
        }
        this.f7066a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingTripsApiResponseModel)) {
            return false;
        }
        UpcomingTripsApiResponseModel upcomingTripsApiResponseModel = (UpcomingTripsApiResponseModel) obj;
        return Intrinsics.d(this.f7066a, upcomingTripsApiResponseModel.f7066a) && Intrinsics.d(this.b, upcomingTripsApiResponseModel.b) && Intrinsics.d(this.c, upcomingTripsApiResponseModel.c) && Intrinsics.d(this.d, upcomingTripsApiResponseModel.d) && Intrinsics.d(this.e, upcomingTripsApiResponseModel.e);
    }

    public final int hashCode() {
        String str = this.f7066a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UpcomingTripsApiResponseModel(vehicleNumber=", this.f7066a, ", tripId=", this.b, ", bookingCount=");
        pk0.y(sbE, this.c, ", vehicleCapacity=", this.d, ", etaToBreakdownLocation=");
        return pk0.l(sbE, this.e, ")");
    }
}
