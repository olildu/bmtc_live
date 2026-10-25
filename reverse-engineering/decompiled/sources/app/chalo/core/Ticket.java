package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mTicketConfigurationAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$mticketTripReceiptAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$passengerDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$routeStopsInfoAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$userProfileAdapter$2$1;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.userprofile.UserProfile;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Ticket;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Ticket {
    public final String A;
    public final MTicketTripReceipt B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2019a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final RouteStopsInfo g;
    public final RouteStopsInfo h;
    public final Map i;
    public final long j;
    public final long k;
    public final boolean l;
    public final long m;
    public final boolean n;
    public final Long o;
    public final UserProfile p;
    public final String q;
    public final String r;
    public final MTicketConfiguration s;
    public final Boolean t;
    public final boolean u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Ticket$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColumnAdapter f2020a;
        public final ColumnAdapter b;
        public final ColumnAdapter c;
        public final ColumnAdapter d;
        public final ColumnAdapter e;
        public final ColumnAdapter f;

        public Adapter(TicketTableAdapter$routeStopsInfoAdapter$2$1 mticket__upTripRouteStopsInfoAdapter, TicketTableAdapter$routeStopsInfoAdapter$2$1 mticket__upTripRouteStopsStageInfoAdapter, TicketTableAdapter$passengerDetailsAdapter$2$1 mticket__passengerDetailsAdapter, TicketTableAdapter$userProfileAdapter$2$1 mticket__userProfileAdapter, TicketTableAdapter$mTicketConfigurationAdapter$2$1 mticket__mTicketConfigurationAdapter, TicketTableAdapter$mticketTripReceiptAdapter$2$1 mticket__mticketTripReceiptAdapter) {
            Intrinsics.i(mticket__upTripRouteStopsInfoAdapter, "mticket__upTripRouteStopsInfoAdapter");
            Intrinsics.i(mticket__upTripRouteStopsStageInfoAdapter, "mticket__upTripRouteStopsStageInfoAdapter");
            Intrinsics.i(mticket__passengerDetailsAdapter, "mticket__passengerDetailsAdapter");
            Intrinsics.i(mticket__userProfileAdapter, "mticket__userProfileAdapter");
            Intrinsics.i(mticket__mTicketConfigurationAdapter, "mticket__mTicketConfigurationAdapter");
            Intrinsics.i(mticket__mticketTripReceiptAdapter, "mticket__mticketTripReceiptAdapter");
            this.f2020a = mticket__upTripRouteStopsInfoAdapter;
            this.b = mticket__upTripRouteStopsStageInfoAdapter;
            this.c = mticket__passengerDetailsAdapter;
            this.d = mticket__userProfileAdapter;
            this.e = mticket__mTicketConfigurationAdapter;
            this.f = mticket__mticketTripReceiptAdapter;
        }
    }

    public Ticket(String ticketId, String mticket__mTicketId, String str, String str2, String mticket__cityName, String mticket__agency, RouteStopsInfo mticket__upTripRouteStopsInfo, RouteStopsInfo routeStopsInfo, Map mticket__passengerDetails, long j, long j2, boolean z, long j3, boolean z2, Long l, UserProfile userProfile, String str3, String str4, MTicketConfiguration mticket__mTicketConfiguration, Boolean bool, boolean z3, String str5, String str6, String str7, String str8, String str9, String str10, MTicketTripReceipt mTicketTripReceipt) {
        Intrinsics.i(ticketId, "ticketId");
        Intrinsics.i(mticket__mTicketId, "mticket__mTicketId");
        Intrinsics.i(mticket__cityName, "mticket__cityName");
        Intrinsics.i(mticket__agency, "mticket__agency");
        Intrinsics.i(mticket__upTripRouteStopsInfo, "mticket__upTripRouteStopsInfo");
        Intrinsics.i(mticket__passengerDetails, "mticket__passengerDetails");
        Intrinsics.i(mticket__mTicketConfiguration, "mticket__mTicketConfiguration");
        this.f2019a = ticketId;
        this.b = mticket__mTicketId;
        this.c = str;
        this.d = str2;
        this.e = mticket__cityName;
        this.f = mticket__agency;
        this.g = mticket__upTripRouteStopsInfo;
        this.h = routeStopsInfo;
        this.i = mticket__passengerDetails;
        this.j = j;
        this.k = j2;
        this.l = z;
        this.m = j3;
        this.n = z2;
        this.o = l;
        this.p = userProfile;
        this.q = str3;
        this.r = str4;
        this.s = mticket__mTicketConfiguration;
        this.t = bool;
        this.u = z3;
        this.v = str5;
        this.w = str6;
        this.x = str7;
        this.y = str8;
        this.z = str9;
        this.A = str10;
        this.B = mTicketTripReceipt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return Intrinsics.d(this.f2019a, ticket.f2019a) && Intrinsics.d(this.b, ticket.b) && Intrinsics.d(this.c, ticket.c) && Intrinsics.d(this.d, ticket.d) && Intrinsics.d(this.e, ticket.e) && Intrinsics.d(this.f, ticket.f) && Intrinsics.d(this.g, ticket.g) && Intrinsics.d(this.h, ticket.h) && Intrinsics.d(this.i, ticket.i) && this.j == ticket.j && this.k == ticket.k && this.l == ticket.l && this.m == ticket.m && this.n == ticket.n && Intrinsics.d(this.o, ticket.o) && Intrinsics.d(this.p, ticket.p) && Intrinsics.d(this.q, ticket.q) && Intrinsics.d(this.r, ticket.r) && Intrinsics.d(this.s, ticket.s) && Intrinsics.d(this.t, ticket.t) && this.u == ticket.u && Intrinsics.d(this.v, ticket.v) && Intrinsics.d(this.w, ticket.w) && Intrinsics.d(this.x, ticket.x) && Intrinsics.d(this.y, ticket.y) && Intrinsics.d(this.z, ticket.z) && Intrinsics.d(this.A, ticket.A) && Intrinsics.d(this.B, ticket.B);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2019a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (this.g.hashCode() + nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
        RouteStopsInfo routeStopsInfo = this.h;
        int iF = defpackage.d.f(this.i, (iHashCode2 + (routeStopsInfo == null ? 0 : routeStopsInfo.hashCode())) * 31, 31);
        long j = this.j;
        int i = (iF + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i3 = this.l ? 1231 : 1237;
        long j3 = this.m;
        int i4 = (((((i2 + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.n ? 1231 : 1237)) * 31;
        Long l = this.o;
        int iHashCode3 = (i4 + (l == null ? 0 : l.hashCode())) * 31;
        UserProfile userProfile = this.p;
        int iHashCode4 = (iHashCode3 + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        String str3 = this.q;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.r;
        int iE2 = nf1.e((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.s.f5619a);
        Boolean bool = this.t;
        int iHashCode6 = (((iE2 + (bool == null ? 0 : bool.hashCode())) * 31) + (this.u ? 1231 : 1237)) * 31;
        String str5 = this.v;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.w;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.x;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.y;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.z;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        MTicketTripReceipt mTicketTripReceipt = this.B;
        return iHashCode12 + (mTicketTripReceipt != null ? mTicketTripReceipt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Ticket(ticketId=", this.f2019a, ", mticket__mTicketId=", this.b, ", mticket__userId=");
        cb0.t(sbE, this.c, ", mticket__deviceId=", this.d, ", mticket__cityName=");
        cb0.t(sbE, this.e, ", mticket__agency=", this.f, ", mticket__upTripRouteStopsInfo=");
        sbE.append(this.g);
        sbE.append(", mticket__upTripRouteStopsStageInfo=");
        sbE.append(this.h);
        sbE.append(", mticket__passengerDetails=");
        sbE.append(this.i);
        sbE.append(", mticket__bookingTime=");
        sbE.append(this.j);
        xs.r(this.k, ", mticket__expirationTime=", ", mticket__isExpired=", sbE);
        sbE.append(this.l);
        sbE.append(", mticket__upTripActivationTime=");
        sbE.append(this.m);
        sbE.append(", mticket__isUpTripActivated=");
        sbE.append(this.n);
        sbE.append(", mticket__upTripPunchingTime=");
        sbE.append(this.o);
        sbE.append(", mticket__userProfile=");
        sbE.append(this.p);
        sbE.append(", mticket__qrCode=");
        sbE.append(this.q);
        sbE.append(", mticket__tone=");
        sbE.append(this.r);
        sbE.append(", mticket__mTicketConfiguration=");
        sbE.append(this.s);
        sbE.append(", mticket__isFreeRide=");
        sbE.append(this.t);
        sbE.append(", mticket__isPaymentRequired=");
        sbE.append(this.u);
        cb0.t(sbE, ", mticket__recentPaymentMethod=", this.v, ", mticket__cardDetails=", this.w);
        cb0.t(sbE, ", mticket__customerId=", this.x, ", mticket__orderId=", this.y);
        cb0.t(sbE, ", mticket__status=", this.z, ", mticket__paymentMode=", this.A);
        sbE.append(", mticket__mticketTripReceipt=");
        sbE.append(this.B);
        sbE.append(")");
        return sbE.toString();
    }
}
