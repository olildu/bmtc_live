package app.chalo.ondc.model.api.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcTicketTripDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OndcTicketTripDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6748a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/request/OndcTicketTripDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/request/OndcTicketTripDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OndcTicketTripDetails> serializer() {
            return OndcTicketTripDetails$$serializer.f6749a;
        }
    }

    public OndcTicketTripDetails(String startStopId, String endStopId, String str, String tripFulfillmentId) {
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(tripFulfillmentId, "tripFulfillmentId");
        this.f6748a = startStopId;
        this.b = endStopId;
        this.c = str;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = tripFulfillmentId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcTicketTripDetails)) {
            return false;
        }
        OndcTicketTripDetails ondcTicketTripDetails = (OndcTicketTripDetails) obj;
        return Intrinsics.d(this.f6748a, ondcTicketTripDetails.f6748a) && Intrinsics.d(this.b, ondcTicketTripDetails.b) && Intrinsics.d(this.c, ondcTicketTripDetails.c) && Intrinsics.d(this.d, ondcTicketTripDetails.d) && Intrinsics.d(this.e, ondcTicketTripDetails.e) && Intrinsics.d(this.f, ondcTicketTripDetails.f) && Intrinsics.d(this.g, ondcTicketTripDetails.g);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f6748a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.g.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OndcTicketTripDetails(startStopId=", this.f6748a, ", endStopId=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", routeName=", this.d, ", startStopName=");
        cb0.t(sbE, this.e, ", endStopName=", this.f, ", tripFulfillmentId=");
        return vo1.p(sbE, this.g, ")");
    }

    public /* synthetic */ OndcTicketTripDetails(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (71 != (i & 71)) {
            PluginExceptionsKt.b(OndcTicketTripDetails$$serializer.f6749a.getDescriptor(), i, 71);
            throw null;
        }
        this.f6748a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        this.g = str7;
    }
}
