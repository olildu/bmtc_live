package app.chalo.productbooking.common.data.models.api.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripStopApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketBookingTripStopApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8110a;
    public final String b;
    public final Double c;
    public final Double d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripStopApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripStopApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketBookingTripStopApiModel> serializer() {
            return TicketBookingTripStopApiModel$$serializer.f8111a;
        }
    }

    public /* synthetic */ TicketBookingTripStopApiModel(int i, String str, String str2, Double d, Double d2, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(TicketBookingTripStopApiModel$$serializer.f8111a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8110a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
        this.e = str3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBookingTripStopApiModel)) {
            return false;
        }
        TicketBookingTripStopApiModel ticketBookingTripStopApiModel = (TicketBookingTripStopApiModel) obj;
        return Intrinsics.d(this.f8110a, ticketBookingTripStopApiModel.f8110a) && Intrinsics.d(this.b, ticketBookingTripStopApiModel.b) && Intrinsics.d(this.c, ticketBookingTripStopApiModel.c) && Intrinsics.d(this.d, ticketBookingTripStopApiModel.d) && Intrinsics.d(this.e, ticketBookingTripStopApiModel.e) && Intrinsics.d(this.f, ticketBookingTripStopApiModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8110a.hashCode() * 31, 31, this.b);
        Double d = this.c;
        int iHashCode = (iE + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iE2 = nf1.e((iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iE2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TicketBookingTripStopApiModel(stopId=", this.f8110a, ", stopName=", this.b, ", stopLat=");
        sbE.append(this.c);
        sbE.append(", stopLon=");
        sbE.append(this.d);
        sbE.append(", transitMode=");
        return r30.i(sbE, this.e, ", partnerStopCode=", this.f, ")");
    }

    public TicketBookingTripStopApiModel(String stopId, String stopName, Double d, Double d2, String transitMode, String str) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(transitMode, "transitMode");
        this.f8110a = stopId;
        this.b = stopName;
        this.c = d;
        this.d = d2;
        this.e = transitMode;
        this.f = str;
    }
}
