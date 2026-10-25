package app.chalo.premiumbus.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.to0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBTripDetailsApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PBTripDetailsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7032a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final Long i;
    public final List j;
    public final PbTripCommunicationApiResponseModel k;
    public final Long l;
    public final List m;
    public final Boolean n;
    public final VehicleBreakdownApiResponseModel o;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/response/PBTripDetailsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PBTripDetailsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PBTripDetailsApiResponseModel> serializer() {
            return PBTripDetailsApiResponseModel$$serializer.f7033a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        p = new Lazy[]{null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new to0(8)), null, null, LazyKt.a(lazyThreadSafetyMode, new to0(9)), null, null};
    }

    public /* synthetic */ PBTripDetailsApiResponseModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Long l2, List list, PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel, Long l3, List list2, Boolean bool, VehicleBreakdownApiResponseModel vehicleBreakdownApiResponseModel) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.b(PBTripDetailsApiResponseModel$$serializer.f7033a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f7032a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = l;
        this.i = l2;
        this.j = list;
        this.k = pbTripCommunicationApiResponseModel;
        this.l = l3;
        this.m = list2;
        this.n = bool;
        this.o = vehicleBreakdownApiResponseModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PBTripDetailsApiResponseModel)) {
            return false;
        }
        PBTripDetailsApiResponseModel pBTripDetailsApiResponseModel = (PBTripDetailsApiResponseModel) obj;
        return Intrinsics.d(this.f7032a, pBTripDetailsApiResponseModel.f7032a) && Intrinsics.d(this.b, pBTripDetailsApiResponseModel.b) && Intrinsics.d(this.c, pBTripDetailsApiResponseModel.c) && Intrinsics.d(this.d, pBTripDetailsApiResponseModel.d) && Intrinsics.d(this.e, pBTripDetailsApiResponseModel.e) && Intrinsics.d(this.f, pBTripDetailsApiResponseModel.f) && Intrinsics.d(this.g, pBTripDetailsApiResponseModel.g) && Intrinsics.d(this.h, pBTripDetailsApiResponseModel.h) && Intrinsics.d(this.i, pBTripDetailsApiResponseModel.i) && Intrinsics.d(this.j, pBTripDetailsApiResponseModel.j) && Intrinsics.d(this.k, pBTripDetailsApiResponseModel.k) && Intrinsics.d(this.l, pBTripDetailsApiResponseModel.l) && Intrinsics.d(this.m, pBTripDetailsApiResponseModel.m) && Intrinsics.d(this.n, pBTripDetailsApiResponseModel.n) && Intrinsics.d(this.o, pBTripDetailsApiResponseModel.o);
    }

    public final int hashCode() {
        String str = this.f7032a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel = this.k;
        int iHashCode11 = (iHashCode10 + (pbTripCommunicationApiResponseModel == null ? 0 : pbTripCommunicationApiResponseModel.hashCode())) * 31;
        Long l3 = this.l;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list2 = this.m;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        VehicleBreakdownApiResponseModel vehicleBreakdownApiResponseModel = this.o;
        return iHashCode14 + (vehicleBreakdownApiResponseModel != null ? vehicleBreakdownApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PBTripDetailsApiResponseModel(tripStatus=", this.f7032a, ", bookingStatus=", this.b, ", bookingId=");
        cb0.t(sbE, this.c, ", vehicleNo=", this.d, ", tripId=");
        cb0.t(sbE, this.e, ", routeId=", this.f, ", stopId=");
        cb0.r(this.h, this.g, ", scheduledStopTime=", ", estimatedStopTime=", sbE);
        sbE.append(this.i);
        sbE.append(", assignedSeats=");
        sbE.append(this.j);
        sbE.append(", tripCommunication=");
        sbE.append(this.k);
        sbE.append(", tripScheduledStartTime=");
        sbE.append(this.l);
        sbE.append(", seats=");
        sbE.append(this.m);
        sbE.append(", womenAdjacencyPromise=");
        sbE.append(this.n);
        sbE.append(", vehicleBreakdown=");
        sbE.append(this.o);
        sbE.append(")");
        return sbE.toString();
    }
}
