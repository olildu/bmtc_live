package app.chalo.metro.data.api;

import app.chalo.productbooking.common.data.models.api.request.TicketBookingTripDetailsApiModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.qh1;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/TicketFinalFareRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketFinalFareRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5426a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final TicketBookingTripDetailsApiModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/TicketFinalFareRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/TicketFinalFareRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketFinalFareRequestApiModel> serializer() {
            return TicketFinalFareRequestApiModel$$serializer.f5427a;
        }
    }

    public /* synthetic */ TicketFinalFareRequestApiModel(int i, String str, String str2, String str3, String str4, List list, TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(TicketFinalFareRequestApiModel$$serializer.f5427a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5426a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = ticketBookingTripDetailsApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketFinalFareRequestApiModel)) {
            return false;
        }
        TicketFinalFareRequestApiModel ticketFinalFareRequestApiModel = (TicketFinalFareRequestApiModel) obj;
        return Intrinsics.d(this.f5426a, ticketFinalFareRequestApiModel.f5426a) && Intrinsics.d(this.b, ticketFinalFareRequestApiModel.b) && Intrinsics.d(this.c, ticketFinalFareRequestApiModel.c) && Intrinsics.d(this.d, ticketFinalFareRequestApiModel.d) && Intrinsics.d(this.e, ticketFinalFareRequestApiModel.e) && Intrinsics.d(this.f, ticketFinalFareRequestApiModel.f);
    }

    public final int hashCode() {
        String str = this.f5426a;
        return this.f.hashCode() + r30.b(nf1.e(nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TicketFinalFareRequestApiModel(ticketType=", this.f5426a, ", transitMode=", this.b, ", configurationId=");
        cb0.t(sbE, this.c, ", city=", this.d, ", passengerDetails=");
        sbE.append(this.e);
        sbE.append(", tripDetail=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public TicketFinalFareRequestApiModel(String str, String transitMode, String configurationId, String str2, ArrayList arrayList, TicketBookingTripDetailsApiModel ticketBookingTripDetailsApiModel) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(configurationId, "configurationId");
        this.f5426a = str;
        this.b = transitMode;
        this.c = configurationId;
        this.d = str2;
        this.e = arrayList;
        this.f = ticketBookingTripDetailsApiModel;
    }
}
