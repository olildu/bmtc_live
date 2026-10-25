package app.chalo.instantticket.data.model.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/app/InstantTicketTripDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class InstantTicketTripDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3883a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/app/InstantTicketTripDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/app/InstantTicketTripDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<InstantTicketTripDetails> serializer() {
            return InstantTicketTripDetails$$serializer.f3884a;
        }
    }

    public /* synthetic */ InstantTicketTripDetails(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(InstantTicketTripDetails$$serializer.f3884a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3883a = str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantTicketTripDetails)) {
            return false;
        }
        InstantTicketTripDetails instantTicketTripDetails = (InstantTicketTripDetails) obj;
        return Intrinsics.d(this.f3883a, instantTicketTripDetails.f3883a) && Intrinsics.d(this.b, instantTicketTripDetails.b) && Intrinsics.d(this.c, instantTicketTripDetails.c) && Intrinsics.d(this.d, instantTicketTripDetails.d) && Intrinsics.d(this.e, instantTicketTripDetails.e) && Intrinsics.d(this.f, instantTicketTripDetails.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f3883a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketTripDetails(startStopId=", this.f3883a, ", endStopId=", this.b, ", routeId=");
        cb0.t(sbE, this.c, ", routeName=", this.d, ", startStopName=");
        return r30.i(sbE, this.e, ", endStopName=", this.f, ")");
    }

    public InstantTicketTripDetails(String startStopId, String endStopId, String routeId, String str, String str2, String str3) {
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(routeId, "routeId");
        this.f3883a = startStopId;
        this.b = endStopId;
        this.c = routeId;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }
}
