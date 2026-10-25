package app.chalo.productbooking.common.data.models.api.request;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripDetailsApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketBookingTripDetailsApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketBookingTripStopApiModel f8108a;
    public final TicketBookingTripStopApiModel b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripDetailsApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/request/TicketBookingTripDetailsApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketBookingTripDetailsApiModel> serializer() {
            return TicketBookingTripDetailsApiModel$$serializer.f8109a;
        }
    }

    public /* synthetic */ TicketBookingTripDetailsApiModel(int i, TicketBookingTripStopApiModel ticketBookingTripStopApiModel, TicketBookingTripStopApiModel ticketBookingTripStopApiModel2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(TicketBookingTripDetailsApiModel$$serializer.f8109a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8108a = ticketBookingTripStopApiModel;
        this.b = ticketBookingTripStopApiModel2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBookingTripDetailsApiModel)) {
            return false;
        }
        TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel = (TicketBookingTripDetailsApiModel) obj;
        return Intrinsics.d(this.f8108a, ticketBookingTripDetailsApiModel.f8108a) && Intrinsics.d(this.b, ticketBookingTripDetailsApiModel.b) && Intrinsics.d(this.c, ticketBookingTripDetailsApiModel.c);
    }

    public final int hashCode() {
        TicketBookingTripStopApiModel ticketBookingTripStopApiModel = this.f8108a;
        int iHashCode = (ticketBookingTripStopApiModel == null ? 0 : ticketBookingTripStopApiModel.hashCode()) * 31;
        TicketBookingTripStopApiModel ticketBookingTripStopApiModel2 = this.b;
        int iHashCode2 = (iHashCode + (ticketBookingTripStopApiModel2 == null ? 0 : ticketBookingTripStopApiModel2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketBookingTripDetailsApiModel(startStop=");
        sb.append(this.f8108a);
        sb.append(", endStop=");
        sb.append(this.b);
        sb.append(", routeId=");
        return vo1.p(sb, this.c, ")");
    }

    public TicketBookingTripDetailsApiModel(TicketBookingTripStopApiModel ticketBookingTripStopApiModel, TicketBookingTripStopApiModel ticketBookingTripStopApiModel2, String str) {
        this.f8108a = ticketBookingTripStopApiModel;
        this.b = ticketBookingTripStopApiModel2;
        this.c = str;
    }
}
