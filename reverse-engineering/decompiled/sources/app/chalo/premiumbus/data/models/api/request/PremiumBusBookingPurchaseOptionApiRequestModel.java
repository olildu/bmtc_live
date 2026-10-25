package app.chalo.premiumbus.data.models.api.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumBusBookingPurchaseOptionApiRequestModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusBookingPurchaseOptionApiRequestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7004a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/models/api/request/PremiumBusBookingPurchaseOptionApiRequestModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/models/api/request/PremiumBusBookingPurchaseOptionApiRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusBookingPurchaseOptionApiRequestModel> serializer() {
            return PremiumBusBookingPurchaseOptionApiRequestModel$$serializer.f7005a;
        }
    }

    public /* synthetic */ PremiumBusBookingPurchaseOptionApiRequestModel(int i, long j, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PremiumBusBookingPurchaseOptionApiRequestModel$$serializer.f7005a.getDescriptor(), i, 63);
            throw null;
        }
        this.f7004a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingPurchaseOptionApiRequestModel)) {
            return false;
        }
        PremiumBusBookingPurchaseOptionApiRequestModel premiumBusBookingPurchaseOptionApiRequestModel = (PremiumBusBookingPurchaseOptionApiRequestModel) obj;
        return Intrinsics.d(this.f7004a, premiumBusBookingPurchaseOptionApiRequestModel.f7004a) && Intrinsics.d(this.b, premiumBusBookingPurchaseOptionApiRequestModel.b) && Intrinsics.d(this.c, premiumBusBookingPurchaseOptionApiRequestModel.c) && Intrinsics.d(this.d, premiumBusBookingPurchaseOptionApiRequestModel.d) && this.e == premiumBusBookingPurchaseOptionApiRequestModel.e && Intrinsics.d(this.f, premiumBusBookingPurchaseOptionApiRequestModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f7004a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        return this.f.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumBusBookingPurchaseOptionApiRequestModel(city=", this.f7004a, ", startStopId=", this.b, ", endStopId=");
        cb0.t(sbE, this.c, ", routeId=", this.d, ", fromStopTripStartTime=");
        dd.k(this.e, ", tripId=", this.f, sbE);
        sbE.append(")");
        return sbE.toString();
    }

    public PremiumBusBookingPurchaseOptionApiRequestModel(long j, String city, String startStopId, String endStopId, String routeId, String tripId) {
        Intrinsics.i(city, "city");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(tripId, "tripId");
        this.f7004a = city;
        this.b = startStopId;
        this.c = endStopId;
        this.d = routeId;
        this.e = j;
        this.f = tripId;
    }
}
