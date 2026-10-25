package app.chalo.instantticket.data.model.api.request;

import defpackage.a30;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FetchMobileTicketFareRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FetchMobileTicketFareRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3851a;
    public final String b;
    public final FareRequestFiltersApiModel c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FetchMobileTicketFareRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/FetchMobileTicketFareRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchMobileTicketFareRequestApiModel> serializer() {
            return FetchMobileTicketFareRequestApiModel$$serializer.f3852a;
        }
    }

    public /* synthetic */ FetchMobileTicketFareRequestApiModel(int i2, String str, String str2, FareRequestFiltersApiModel fareRequestFiltersApiModel, String str3, String str4, List list, String str5, String str6) {
        if (255 != (i2 & 255)) {
            PluginExceptionsKt.b(FetchMobileTicketFareRequestApiModel$$serializer.f3852a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f3851a = str;
        this.b = str2;
        this.c = fareRequestFiltersApiModel;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchMobileTicketFareRequestApiModel)) {
            return false;
        }
        FetchMobileTicketFareRequestApiModel fetchMobileTicketFareRequestApiModel = (FetchMobileTicketFareRequestApiModel) obj;
        return Intrinsics.d(this.f3851a, fetchMobileTicketFareRequestApiModel.f3851a) && Intrinsics.d(this.b, fetchMobileTicketFareRequestApiModel.b) && Intrinsics.d(this.c, fetchMobileTicketFareRequestApiModel.c) && Intrinsics.d(this.d, fetchMobileTicketFareRequestApiModel.d) && Intrinsics.d(this.e, fetchMobileTicketFareRequestApiModel.e) && Intrinsics.d(this.f, fetchMobileTicketFareRequestApiModel.f) && Intrinsics.d(this.g, fetchMobileTicketFareRequestApiModel.g) && Intrinsics.d(this.h, fetchMobileTicketFareRequestApiModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e((this.c.hashCode() + nf1.e(this.f3851a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        List list = this.f;
        int iHashCode = (iE + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FetchMobileTicketFareRequestApiModel(city=", this.f3851a, ", endStopId=", this.b, ", filters=");
        sbE.append(this.c);
        sbE.append(", routeId=");
        sbE.append(this.d);
        sbE.append(", startStopId=");
        pk0.w(this.e, ", seats=", ", userCampaign=", sbE, this.f);
        return r30.i(sbE, this.g, ", userAcquisitionChannel=", this.h, ")");
    }

    public FetchMobileTicketFareRequestApiModel(String str, String endStopId, FareRequestFiltersApiModel fareRequestFiltersApiModel, String routeId, String startStopId, ArrayList arrayList, String str2, String str3) {
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(startStopId, "startStopId");
        this.f3851a = str;
        this.b = endStopId;
        this.c = fareRequestFiltersApiModel;
        this.d = routeId;
        this.e = startStopId;
        this.f = arrayList;
        this.g = str2;
        this.h = str3;
    }
}
