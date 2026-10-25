package app.chalo.metro.data.api;

import app.chalo.productbooking.common.data.models.api.request.TicketBookingTripDetailsApiModel;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.ti0;
import defpackage.z40;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketOrderRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroTicketOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ti0(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5416a;
    public final String b;
    public final String c;
    public final long d;
    public final TicketBookingTripDetailsApiModel e;
    public final List f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/MetroTicketOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroTicketOrderRequestApiModel> serializer() {
            return MetroTicketOrderRequestApiModel$$serializer.f5417a;
        }
    }

    public /* synthetic */ MetroTicketOrderRequestApiModel(int i, String str, String str2, String str3, long j, TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel, List list, String str4) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(MetroTicketOrderRequestApiModel$$serializer.f5417a.getDescriptor(), i, 127);
            throw null;
        }
        this.f5416a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = ticketBookingTripDetailsApiModel;
        this.f = list;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketOrderRequestApiModel)) {
            return false;
        }
        MetroTicketOrderRequestApiModel metroTicketOrderRequestApiModel = (MetroTicketOrderRequestApiModel) obj;
        return Intrinsics.d(this.f5416a, metroTicketOrderRequestApiModel.f5416a) && Intrinsics.d(this.b, metroTicketOrderRequestApiModel.b) && Intrinsics.d(this.c, metroTicketOrderRequestApiModel.c) && this.d == metroTicketOrderRequestApiModel.d && Intrinsics.d(this.e, metroTicketOrderRequestApiModel.e) && Intrinsics.d(this.f, metroTicketOrderRequestApiModel.f) && Intrinsics.d(this.g, metroTicketOrderRequestApiModel.g);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f5416a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel = this.e;
        int iHashCode = (i + (ticketBookingTripDetailsApiModel == null ? 0 : ticketBookingTripDetailsApiModel.hashCode())) * 31;
        List list = this.f;
        return this.g.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroTicketOrderRequestApiModel(ticketType=", this.f5416a, ", transitMode=", this.b, ", configurationId=");
        n21.p(this.d, this.c, ", amount=", sbE);
        sbE.append(", tripDetail=");
        sbE.append(this.e);
        sbE.append(", passengerDetails=");
        sbE.append(this.f);
        return z40.h(sbE, ", city=", this.g, ")");
    }

    public MetroTicketOrderRequestApiModel(String ticketType, String transitMode, String configurationId, long j, TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel, ArrayList arrayList, String str) {
        Intrinsics.i(ticketType, "ticketType");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(configurationId, "configurationId");
        this.f5416a = ticketType;
        this.b = transitMode;
        this.c = configurationId;
        this.d = j;
        this.e = ticketBookingTripDetailsApiModel;
        this.f = arrayList;
        this.g = str;
    }
}
