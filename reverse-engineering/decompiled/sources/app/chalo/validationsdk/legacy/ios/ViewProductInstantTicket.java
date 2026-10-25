package app.chalo.validationsdk.legacy.ios;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket;", "", "Companion", "Passenger", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ViewProductInstantTicket {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10671a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Passenger f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ViewProductInstantTicket> serializer() {
            return ViewProductInstantTicket$$serializer.f10672a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket$Passenger;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @Deprecated
    public static final /* data */ class Passenger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10673a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket$Passenger$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/ViewProductInstantTicket$Passenger;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Passenger> serializer() {
                return ViewProductInstantTicket$Passenger$$serializer.f10674a;
            }
        }

        public /* synthetic */ Passenger(int i, String str) {
            if ((i & 1) == 0) {
                this.f10673a = null;
            } else {
                this.f10673a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Passenger) && Intrinsics.d(this.f10673a, ((Passenger) obj).f10673a);
        }

        public final int hashCode() {
            String str = this.f10673a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Passenger(name=", this.f10673a, ")");
        }
    }

    public /* synthetic */ ViewProductInstantTicket(int i, String str, String str2, String str3, String str4, Long l, Passenger passenger) {
        if ((i & 1) == 0) {
            this.f10671a = null;
        } else {
            this.f10671a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = passenger;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewProductInstantTicket)) {
            return false;
        }
        ViewProductInstantTicket viewProductInstantTicket = (ViewProductInstantTicket) obj;
        return Intrinsics.d(this.f10671a, viewProductInstantTicket.f10671a) && Intrinsics.d(this.b, viewProductInstantTicket.b) && Intrinsics.d(this.c, viewProductInstantTicket.c) && Intrinsics.d(this.d, viewProductInstantTicket.d) && Intrinsics.d(this.e, viewProductInstantTicket.e) && Intrinsics.d(this.f, viewProductInstantTicket.f);
    }

    public final int hashCode() {
        String str = this.f10671a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Passenger passenger = this.f;
        return iHashCode5 + (passenger != null ? passenger.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ViewProductInstantTicket(productName=", this.f10671a, ", ticketNumber=", this.b, ", transactionId=");
        cb0.t(sbE, this.c, ", amountPaid=", this.d, ", expiryDate=");
        sbE.append(this.e);
        sbE.append(", passenger=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
