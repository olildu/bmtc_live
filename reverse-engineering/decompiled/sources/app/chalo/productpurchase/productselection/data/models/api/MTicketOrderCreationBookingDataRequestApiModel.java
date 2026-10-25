package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hf0;
import defpackage.nf1;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationBookingDataRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketOrderCreationBookingDataRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hf0(28)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8575a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final long h;
    public final MTicketOrderCreationRouteDetailsRequestApiModel i;
    public final JsonObject j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationBookingDataRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/MTicketOrderCreationBookingDataRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketOrderCreationBookingDataRequestApiModel> serializer() {
            return MTicketOrderCreationBookingDataRequestApiModel$$serializer.f8576a;
        }
    }

    public /* synthetic */ MTicketOrderCreationBookingDataRequestApiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, long j, MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel, JsonObject jsonObject) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(MTicketOrderCreationBookingDataRequestApiModel$$serializer.f8576a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f8575a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = j;
        this.i = mTicketOrderCreationRouteDetailsRequestApiModel;
        this.j = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketOrderCreationBookingDataRequestApiModel)) {
            return false;
        }
        MTicketOrderCreationBookingDataRequestApiModel mTicketOrderCreationBookingDataRequestApiModel = (MTicketOrderCreationBookingDataRequestApiModel) obj;
        return Intrinsics.d(this.f8575a, mTicketOrderCreationBookingDataRequestApiModel.f8575a) && Intrinsics.d(this.b, mTicketOrderCreationBookingDataRequestApiModel.b) && Intrinsics.d(this.c, mTicketOrderCreationBookingDataRequestApiModel.c) && Intrinsics.d(this.d, mTicketOrderCreationBookingDataRequestApiModel.d) && Intrinsics.d(this.e, mTicketOrderCreationBookingDataRequestApiModel.e) && Intrinsics.d(this.f, mTicketOrderCreationBookingDataRequestApiModel.f) && Intrinsics.d(this.g, mTicketOrderCreationBookingDataRequestApiModel.g) && this.h == mTicketOrderCreationBookingDataRequestApiModel.h && Intrinsics.d(this.i, mTicketOrderCreationBookingDataRequestApiModel.i) && Intrinsics.d(this.j, mTicketOrderCreationBookingDataRequestApiModel.j);
    }

    public final int hashCode() {
        int iB = r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f8575a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        int i = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel = this.i;
        int iHashCode = (i + (mTicketOrderCreationRouteDetailsRequestApiModel == null ? 0 : mTicketOrderCreationRouteDetailsRequestApiModel.hashCode())) * 31;
        JsonObject jsonObject = this.j;
        return iHashCode + (jsonObject != null ? jsonObject.f18198a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicketOrderCreationBookingDataRequestApiModel(routeId=", this.f8575a, ", routeName=", this.b, ", startStopId=");
        cb0.t(sbE, this.c, ", startStopName=", this.d, ", endStopId=");
        cb0.t(sbE, this.e, ", endStopName=", this.f, ", specialFeatures=");
        sbE.append(this.g);
        sbE.append(", validDuration=");
        sbE.append(this.h);
        sbE.append(", routeDetails=");
        sbE.append(this.i);
        sbE.append(", passengerDetails=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public MTicketOrderCreationBookingDataRequestApiModel(String routeId, String routeName, String startStopId, String startStopName, String endStopId, String endStopName, ArrayList arrayList, long j, MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel, JsonObject jsonObject) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(endStopName, "endStopName");
        this.f8575a = routeId;
        this.b = routeName;
        this.c = startStopId;
        this.d = startStopName;
        this.e = endStopId;
        this.f = endStopName;
        this.g = arrayList;
        this.h = j;
        this.i = mTicketOrderCreationRouteDetailsRequestApiModel;
        this.j = jsonObject;
    }
}
