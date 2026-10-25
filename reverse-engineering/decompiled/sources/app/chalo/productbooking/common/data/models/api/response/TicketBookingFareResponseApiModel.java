package app.chalo.productbooking.common.data.models.api.response;

import defpackage.pk0;
import defpackage.q7;
import defpackage.qh1;
import defpackage.vo1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/TicketBookingFareResponseApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketBookingFareResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8183a;
    public final List b;
    public final Integer c;
    public final Integer d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/TicketBookingFareResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/TicketBookingFareResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketBookingFareResponseApiModel> serializer() {
            return TicketBookingFareResponseApiModel$$serializer.f8184a;
        }
    }

    public /* synthetic */ TicketBookingFareResponseApiModel(int i, String str, List list, Integer num, Integer num2, String str2) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(TicketBookingFareResponseApiModel$$serializer.f8184a.getDescriptor(), i, 31);
            throw null;
        }
        this.f8183a = str;
        this.b = list;
        this.c = num;
        this.d = num2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBookingFareResponseApiModel)) {
            return false;
        }
        TicketBookingFareResponseApiModel ticketBookingFareResponseApiModel = (TicketBookingFareResponseApiModel) obj;
        return Intrinsics.d(this.f8183a, ticketBookingFareResponseApiModel.f8183a) && Intrinsics.d(this.b, ticketBookingFareResponseApiModel.b) && Intrinsics.d(this.c, ticketBookingFareResponseApiModel.c) && Intrinsics.d(this.d, ticketBookingFareResponseApiModel.d) && Intrinsics.d(this.e, ticketBookingFareResponseApiModel.e);
    }

    public final int hashCode() {
        String str = this.f8183a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbH = q7.h("TicketBookingFareResponseApiModel(ticketType=", this.f8183a, ", passengerDetails=", ", roundingLogic=", this.b);
        pk0.y(sbH, this.c, ", totalAvailableSeats=", this.d, ", fareNote=");
        return vo1.p(sbH, this.e, ")");
    }
}
