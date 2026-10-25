package app.chalo.models.mticketing;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.models.userprofile.UserProfile;
import defpackage.cb0;
import defpackage.d;
import defpackage.dd;
import defpackage.hf0;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/mticketing/MTicket;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicket {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] E;
    public final MTicketTripReceipt A;
    public final String B;
    public final String C;
    public final String D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5615a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final RouteStopsInfo f;
    public final RouteStopsInfo g;
    public final Map h;
    public final long i;
    public final long j;
    public final boolean k;
    public final long l;
    public final boolean m;
    public final Long n;
    public final UserProfile o;
    public final String p;
    public final String q;
    public final MTicketConfiguration r;
    public final Boolean s;
    public final boolean t;
    public final List u;
    public final List v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/mticketing/MTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/mticketing/MTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicket> serializer() {
            return MTicket$$serializer.f5616a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        E = new Lazy[]{null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new hf0(24)), null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new hf0(25)), LazyKt.a(lazyThreadSafetyMode, new hf0(26)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ MTicket(int i, String str, String str2, String str3, String str4, String str5, RouteStopsInfo routeStopsInfo, RouteStopsInfo routeStopsInfo2, Map map, long j, long j2, boolean z, long j3, boolean z2, Long l, UserProfile userProfile, String str6, String str7, MTicketConfiguration mTicketConfiguration, Boolean bool, boolean z3, List list, List list2, String str8, String str9, String str10, String str11, MTicketTripReceipt mTicketTripReceipt, String str12, String str13, String str14) {
        if (131128 != (i & 131128)) {
            PluginExceptionsKt.b(MTicket$$serializer.f5616a.getDescriptor(), i, 131128);
            throw null;
        }
        this.f5615a = (i & 1) == 0 ? "" : str;
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
        this.d = str4;
        this.e = str5;
        this.f = routeStopsInfo;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = routeStopsInfo2;
        }
        if ((i & 128) == 0) {
            this.h = MapsKt.d();
        } else {
            this.h = map;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j;
        }
        if ((i & 512) == 0) {
            this.j = 0L;
        } else {
            this.j = j2;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = 0L;
        } else {
            this.l = j3;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z2;
        }
        this.n = (i & 8192) == 0 ? 0L : l;
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = userProfile;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str6;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str7;
        }
        this.r = mTicketConfiguration;
        this.s = (262144 & i) == 0 ? Boolean.FALSE : bool;
        this.t = (524288 & i) == 0 ? true : z3;
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = list;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = list2;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str8;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = str9;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = str10;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = str11;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = mTicketTripReceipt;
        }
        this.B = (134217728 & i) == 0 ? "Single Journey Ticket" : str12;
        if ((268435456 & i) == 0) {
            this.C = "singleJourneyTicket";
        } else {
            this.C = str13;
        }
        if ((i & 536870912) == 0) {
            this.D = "singleJourneyTicket";
        } else {
            this.D = str14;
        }
    }

    public static MTicket a(MTicket mTicket, String str, long j, boolean z, int i) {
        String mTicketId = mTicket.f5615a;
        String str2 = mTicket.b;
        String str3 = mTicket.c;
        String cityName = (i & 8) != 0 ? mTicket.d : str;
        String agency = mTicket.e;
        RouteStopsInfo upTripRouteStopsInfo = mTicket.f;
        RouteStopsInfo routeStopsInfo = mTicket.g;
        Map passengerDetails = mTicket.h;
        long j2 = mTicket.i;
        long j3 = mTicket.j;
        boolean z2 = mTicket.k;
        long j4 = (i & 2048) != 0 ? mTicket.l : j;
        boolean z3 = (i & 4096) != 0 ? mTicket.m : z;
        Long l = mTicket.n;
        UserProfile userProfile = mTicket.o;
        String str4 = mTicket.p;
        String str5 = mTicket.q;
        MTicketConfiguration mTicketConfiguration = mTicket.r;
        long j5 = j4;
        Boolean bool = mTicket.s;
        boolean z4 = mTicket.t;
        List list = mTicket.u;
        List list2 = mTicket.v;
        String str6 = mTicket.w;
        String str7 = mTicket.x;
        String str8 = mTicket.y;
        String str9 = mTicket.z;
        MTicketTripReceipt mTicketTripReceipt = mTicket.A;
        String productName = mTicket.B;
        String productType = mTicket.C;
        String productSubType = mTicket.D;
        mTicket.getClass();
        Intrinsics.i(mTicketId, "mTicketId");
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(agency, "agency");
        Intrinsics.i(upTripRouteStopsInfo, "upTripRouteStopsInfo");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(mTicketConfiguration, "mTicketConfiguration");
        Intrinsics.i(productName, "productName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        return new MTicket(mTicketId, str2, str3, cityName, agency, upTripRouteStopsInfo, routeStopsInfo, passengerDetails, j2, j3, z2, j5, z3, l, userProfile, str4, str5, mTicketConfiguration, bool, z4, list, list2, str6, str7, str8, str9, mTicketTripReceipt, productName, productType, productSubType);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MTicketConfiguration getR() {
        return this.r;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getY() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicket)) {
            return false;
        }
        MTicket mTicket = (MTicket) obj;
        return Intrinsics.d(this.f5615a, mTicket.f5615a) && Intrinsics.d(this.b, mTicket.b) && Intrinsics.d(this.c, mTicket.c) && Intrinsics.d(this.d, mTicket.d) && Intrinsics.d(this.e, mTicket.e) && Intrinsics.d(this.f, mTicket.f) && Intrinsics.d(this.g, mTicket.g) && Intrinsics.d(this.h, mTicket.h) && this.i == mTicket.i && this.j == mTicket.j && this.k == mTicket.k && this.l == mTicket.l && this.m == mTicket.m && Intrinsics.d(this.n, mTicket.n) && Intrinsics.d(this.o, mTicket.o) && Intrinsics.d(this.p, mTicket.p) && Intrinsics.d(this.q, mTicket.q) && Intrinsics.d(this.r, mTicket.r) && Intrinsics.d(this.s, mTicket.s) && this.t == mTicket.t && Intrinsics.d(this.u, mTicket.u) && Intrinsics.d(this.v, mTicket.v) && Intrinsics.d(this.w, mTicket.w) && Intrinsics.d(this.x, mTicket.x) && Intrinsics.d(this.y, mTicket.y) && Intrinsics.d(this.z, mTicket.z) && Intrinsics.d(this.A, mTicket.A) && Intrinsics.d(this.B, mTicket.B) && Intrinsics.d(this.C, mTicket.C) && Intrinsics.d(this.D, mTicket.D);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final RouteStopsInfo getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f5615a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (this.f.hashCode() + nf1.e(nf1.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        RouteStopsInfo routeStopsInfo = this.g;
        int iF = d.f(this.h, (iHashCode3 + (routeStopsInfo == null ? 0 : routeStopsInfo.hashCode())) * 31, 31);
        long j = this.i;
        int i = (iF + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.j;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i3 = this.k ? 1231 : 1237;
        long j3 = this.l;
        int i4 = (((((i2 + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.m ? 1231 : 1237)) * 31;
        Long l = this.n;
        int iHashCode4 = (i4 + (l == null ? 0 : l.hashCode())) * 31;
        UserProfile userProfile = this.o;
        int iHashCode5 = (iHashCode4 + (userProfile == null ? 0 : userProfile.hashCode())) * 31;
        String str3 = this.p;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.q;
        int iE = nf1.e((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.r.f5619a);
        Boolean bool = this.s;
        int iHashCode7 = (((iE + (bool == null ? 0 : bool.hashCode())) * 31) + (this.t ? 1231 : 1237)) * 31;
        List list = this.u;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.v;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.w;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.x;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.y;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.z;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        MTicketTripReceipt mTicketTripReceipt = this.A;
        return this.D.hashCode() + nf1.e(nf1.e((iHashCode13 + (mTicketTripReceipt != null ? mTicketTripReceipt.hashCode() : 0)) * 31, 31, this.B), 31, this.C);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MTicket(mTicketId=", this.f5615a, ", userId=", this.b, ", deviceId=");
        cb0.t(sbE, this.c, ", cityName=", this.d, ", agency=");
        sbE.append(this.e);
        sbE.append(", upTripRouteStopsInfo=");
        sbE.append(this.f);
        sbE.append(", upTripRouteStopsStageInfo=");
        sbE.append(this.g);
        sbE.append(", passengerDetails=");
        sbE.append(this.h);
        sbE.append(", bookingTime=");
        sbE.append(this.i);
        xs.r(this.j, ", expirationTime=", ", isExpired=", sbE);
        sbE.append(this.k);
        sbE.append(", upTripActivationTime=");
        sbE.append(this.l);
        sbE.append(", isUpTripActivated=");
        sbE.append(this.m);
        sbE.append(", upTripPunchingTime=");
        sbE.append(this.n);
        sbE.append(", userProfile=");
        sbE.append(this.o);
        sbE.append(", qrCode=");
        sbE.append(this.p);
        sbE.append(", tone=");
        sbE.append(this.q);
        sbE.append(", mTicketConfiguration=");
        sbE.append(this.r);
        sbE.append(", isFreeRide=");
        sbE.append(this.s);
        sbE.append(", isPaymentRequired=");
        sbE.append(this.t);
        sbE.append(", recentPaymentMethod=");
        sbE.append(this.u);
        sbE.append(", cardDetails=");
        sbE.append(this.v);
        cb0.t(sbE, ", customerId=", this.w, ", orderId=", this.x);
        cb0.t(sbE, ", status=", this.y, ", paymentMode=", this.z);
        sbE.append(", mticketTripReceipt=");
        sbE.append(this.A);
        sbE.append(", productName=");
        sbE.append(this.B);
        cb0.t(sbE, ", productType=", this.C, ", productSubType=", this.D);
        sbE.append(")");
        return sbE.toString();
    }

    public MTicket(String mTicketId, String str, String str2, String cityName, String agency, RouteStopsInfo routeStopsInfo, RouteStopsInfo routeStopsInfo2, Map map, long j, long j2, boolean z, long j3, boolean z2, Long l, UserProfile userProfile, String str3, String str4, MTicketConfiguration mTicketConfiguration, Boolean bool, boolean z3, List list, List list2, String str5, String str6, String str7, String str8, MTicketTripReceipt mTicketTripReceipt, String str9, String str10, String str11) {
        Intrinsics.i(mTicketId, "mTicketId");
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(agency, "agency");
        this.f5615a = mTicketId;
        this.b = str;
        this.c = str2;
        this.d = cityName;
        this.e = agency;
        this.f = routeStopsInfo;
        this.g = routeStopsInfo2;
        this.h = map;
        this.i = j;
        this.j = j2;
        this.k = z;
        this.l = j3;
        this.m = z2;
        this.n = l;
        this.o = userProfile;
        this.p = str3;
        this.q = str4;
        this.r = mTicketConfiguration;
        this.s = bool;
        this.t = z3;
        this.u = list;
        this.v = list2;
        this.w = str5;
        this.x = str6;
        this.y = str7;
        this.z = str8;
        this.A = mTicketTripReceipt;
        this.B = str9;
        this.C = str10;
        this.D = str11;
    }

    public /* synthetic */ MTicket(String str, String str2, String str3, String str4, String str5, RouteStopsInfo routeStopsInfo, RouteStopsInfo routeStopsInfo2, Map map, long j, long j2, boolean z, long j3, boolean z2, Long l, UserProfile userProfile, String str6, String str7, MTicketConfiguration mTicketConfiguration, Boolean bool, boolean z3, List list, List list2, String str8, String str9, String str10, String str11, MTicketTripReceipt mTicketTripReceipt, int i) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, routeStopsInfo, (i & 64) != 0 ? null : routeStopsInfo2, map, j, j2, z, (i & 2048) != 0 ? 0L : j3, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? 0L : l, (i & 16384) != 0 ? null : userProfile, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : str7, mTicketConfiguration, bool, (524288 & i) != 0 ? true : z3, (1048576 & i) != 0 ? null : list, (2097152 & i) != 0 ? null : list2, (4194304 & i) != 0 ? null : str8, (8388608 & i) != 0 ? null : str9, (16777216 & i) != 0 ? null : str10, (33554432 & i) != 0 ? null : str11, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : mTicketTripReceipt, "Single Journey Ticket", "singleJourneyTicket", "singleJourneyTicket");
    }
}
