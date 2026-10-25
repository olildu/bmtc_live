package app.chalo.productbooking.common.data.models.api.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonArray;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketProductApiResponseModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GenericMobileTicketProductApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] O;
    public final String A;
    public final String B;
    public final String C;
    public final FirstBookingApiModel D;
    public final String E;
    public final RefundInfoApiModel F;
    public final List G;
    public final List H;
    public final List I;
    public final String J;
    public final Long K;
    public final JsonArray L;
    public final List M;
    public final List N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8124a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Long m;
    public final GenericMobileTicketStopDetailsApiResponseModel n;
    public final GenericMobileTicketStopDetailsApiResponseModel o;
    public final String p;
    public final String q;
    public final String r;
    public final Long s;
    public final Long t;
    public final Long u;
    public final List v;
    public final Long w;
    public final Long x;
    public final String y;
    public final PaymentInfoApiModel z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketProductApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/GenericMobileTicketProductApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GenericMobileTicketProductApiResponseModel> serializer() {
            return GenericMobileTicketProductApiResponseModel$$serializer.f8125a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        O = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new t40(12)), null, null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new t40(13)), LazyKt.a(lazyThreadSafetyMode, new t40(14)), LazyKt.a(lazyThreadSafetyMode, new t40(15)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new t40(16)), LazyKt.a(lazyThreadSafetyMode, new t40(17))};
    }

    public /* synthetic */ GenericMobileTicketProductApiResponseModel(int i, int i2, String str, String str2, String str3, String str4, Long l, Long l2, String str5, String str6, String str7, String str8, String str9, String str10, Long l3, GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel, GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2, String str11, String str12, String str13, Long l4, Long l5, Long l6, List list, Long l7, Long l8, String str14, PaymentInfoApiModel paymentInfoApiModel, String str15, String str16, String str17, FirstBookingApiModel firstBookingApiModel, String str18, RefundInfoApiModel refundInfoApiModel, List list2, List list3, List list4, String str19, Long l9, JsonArray jsonArray, List list5, List list6) {
        if ((-33554433 != (i & (-33554433))) || (127 != (i2 & 127))) {
            PluginExceptionsKt.a(new int[]{i, i2}, new int[]{-33554433, 127}, GenericMobileTicketProductApiResponseModel$$serializer.f8125a.getDescriptor());
            throw null;
        }
        this.f8124a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = l2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = l3;
        this.n = genericMobileTicketStopDetailsApiResponseModel;
        this.o = genericMobileTicketStopDetailsApiResponseModel2;
        this.p = str11;
        this.q = str12;
        this.r = str13;
        this.s = l4;
        this.t = l5;
        this.u = l6;
        this.v = list;
        this.w = l7;
        this.x = l8;
        this.y = str14;
        if ((i & 33554432) == 0) {
            this.z = null;
        } else {
            this.z = paymentInfoApiModel;
        }
        this.A = str15;
        this.B = str16;
        this.C = str17;
        this.D = firstBookingApiModel;
        this.E = str18;
        this.F = refundInfoApiModel;
        this.G = list2;
        this.H = list3;
        this.I = list4;
        this.J = str19;
        this.K = l9;
        this.L = jsonArray;
        this.M = list5;
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericMobileTicketProductApiResponseModel)) {
            return false;
        }
        GenericMobileTicketProductApiResponseModel genericMobileTicketProductApiResponseModel = (GenericMobileTicketProductApiResponseModel) obj;
        return Intrinsics.d(this.f8124a, genericMobileTicketProductApiResponseModel.f8124a) && Intrinsics.d(this.b, genericMobileTicketProductApiResponseModel.b) && Intrinsics.d(this.c, genericMobileTicketProductApiResponseModel.c) && Intrinsics.d(this.d, genericMobileTicketProductApiResponseModel.d) && Intrinsics.d(this.e, genericMobileTicketProductApiResponseModel.e) && Intrinsics.d(this.f, genericMobileTicketProductApiResponseModel.f) && Intrinsics.d(this.g, genericMobileTicketProductApiResponseModel.g) && Intrinsics.d(this.h, genericMobileTicketProductApiResponseModel.h) && Intrinsics.d(this.i, genericMobileTicketProductApiResponseModel.i) && Intrinsics.d(this.j, genericMobileTicketProductApiResponseModel.j) && Intrinsics.d(this.k, genericMobileTicketProductApiResponseModel.k) && Intrinsics.d(this.l, genericMobileTicketProductApiResponseModel.l) && Intrinsics.d(this.m, genericMobileTicketProductApiResponseModel.m) && Intrinsics.d(this.n, genericMobileTicketProductApiResponseModel.n) && Intrinsics.d(this.o, genericMobileTicketProductApiResponseModel.o) && Intrinsics.d(this.p, genericMobileTicketProductApiResponseModel.p) && Intrinsics.d(this.q, genericMobileTicketProductApiResponseModel.q) && Intrinsics.d(this.r, genericMobileTicketProductApiResponseModel.r) && Intrinsics.d(this.s, genericMobileTicketProductApiResponseModel.s) && Intrinsics.d(this.t, genericMobileTicketProductApiResponseModel.t) && Intrinsics.d(this.u, genericMobileTicketProductApiResponseModel.u) && Intrinsics.d(this.v, genericMobileTicketProductApiResponseModel.v) && Intrinsics.d(this.w, genericMobileTicketProductApiResponseModel.w) && Intrinsics.d(this.x, genericMobileTicketProductApiResponseModel.x) && Intrinsics.d(this.y, genericMobileTicketProductApiResponseModel.y) && Intrinsics.d(this.z, genericMobileTicketProductApiResponseModel.z) && Intrinsics.d(this.A, genericMobileTicketProductApiResponseModel.A) && Intrinsics.d(this.B, genericMobileTicketProductApiResponseModel.B) && Intrinsics.d(this.C, genericMobileTicketProductApiResponseModel.C) && Intrinsics.d(this.D, genericMobileTicketProductApiResponseModel.D) && Intrinsics.d(this.E, genericMobileTicketProductApiResponseModel.E) && Intrinsics.d(this.F, genericMobileTicketProductApiResponseModel.F) && Intrinsics.d(this.G, genericMobileTicketProductApiResponseModel.G) && Intrinsics.d(this.H, genericMobileTicketProductApiResponseModel.H) && Intrinsics.d(this.I, genericMobileTicketProductApiResponseModel.I) && Intrinsics.d(this.J, genericMobileTicketProductApiResponseModel.J) && Intrinsics.d(this.K, genericMobileTicketProductApiResponseModel.K) && Intrinsics.d(this.L, genericMobileTicketProductApiResponseModel.L) && Intrinsics.d(this.M, genericMobileTicketProductApiResponseModel.M) && Intrinsics.d(this.N, genericMobileTicketProductApiResponseModel.N);
    }

    public final int hashCode() {
        String str = this.f8124a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iE = nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        Long l = this.e;
        int iHashCode2 = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.m;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel = this.n;
        int iHashCode11 = (iHashCode10 + (genericMobileTicketStopDetailsApiResponseModel == null ? 0 : genericMobileTicketStopDetailsApiResponseModel.hashCode())) * 31;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = this.o;
        int iHashCode12 = (iHashCode11 + (genericMobileTicketStopDetailsApiResponseModel2 == null ? 0 : genericMobileTicketStopDetailsApiResponseModel2.hashCode())) * 31;
        String str9 = this.p;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.q;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.r;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l4 = this.s;
        int iHashCode16 = (iHashCode15 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.t;
        int iHashCode17 = (iHashCode16 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.u;
        int iHashCode18 = (iHashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31;
        List list = this.v;
        int iHashCode19 = (iHashCode18 + (list == null ? 0 : list.hashCode())) * 31;
        Long l7 = this.w;
        int iHashCode20 = (iHashCode19 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.x;
        int iHashCode21 = (iHashCode20 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str12 = this.y;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        PaymentInfoApiModel paymentInfoApiModel = this.z;
        int iHashCode23 = (iHashCode22 + (paymentInfoApiModel == null ? 0 : paymentInfoApiModel.hashCode())) * 31;
        String str13 = this.A;
        int iHashCode24 = (iHashCode23 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.B;
        int iHashCode25 = (iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.C;
        int iHashCode26 = (iHashCode25 + (str15 == null ? 0 : str15.hashCode())) * 31;
        FirstBookingApiModel firstBookingApiModel = this.D;
        int iHashCode27 = (iHashCode26 + (firstBookingApiModel == null ? 0 : firstBookingApiModel.hashCode())) * 31;
        String str16 = this.E;
        int iHashCode28 = (iHashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        RefundInfoApiModel refundInfoApiModel = this.F;
        int iHashCode29 = (iHashCode28 + (refundInfoApiModel == null ? 0 : refundInfoApiModel.hashCode())) * 31;
        List list2 = this.G;
        int iHashCode30 = (iHashCode29 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.H;
        int iHashCode31 = (iHashCode30 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.I;
        int iHashCode32 = (iHashCode31 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str17 = this.J;
        int iHashCode33 = (iHashCode32 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Long l9 = this.K;
        int iHashCode34 = (iHashCode33 + (l9 == null ? 0 : l9.hashCode())) * 31;
        JsonArray jsonArray = this.L;
        int iHashCode35 = (iHashCode34 + (jsonArray == null ? 0 : jsonArray.f18186a.hashCode())) * 31;
        List list5 = this.M;
        int iHashCode36 = (iHashCode35 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.N;
        return iHashCode36 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GenericMobileTicketProductApiResponseModel(bookingId=", this.f8124a, ", productName=", this.b, ", productType=");
        cb0.t(sbE, this.c, ", productSubType=", this.d, ", bookingTime=");
        nf1.w(sbE, this.e, ", amount=", this.f, ", status=");
        cb0.t(sbE, this.g, ", city=", this.h, ", qrCode=");
        cb0.t(sbE, this.i, ", tone=", this.j, ", configurationId=");
        cb0.t(sbE, this.k, ", tripId=", this.l, ", tripSlotStartTime=");
        sbE.append(this.m);
        sbE.append(", fromStopDetails=");
        sbE.append(this.n);
        sbE.append(", toStopDetails=");
        sbE.append(this.o);
        sbE.append(", routeId=");
        sbE.append(this.p);
        sbE.append(", userId=");
        cb0.t(sbE, this.q, ", routeName=", this.r, ", tripStartTime=");
        nf1.w(sbE, this.s, ", expiryTime=", this.t, ", validationStartTime=");
        sbE.append(this.u);
        sbE.append(", passengerDetails=");
        sbE.append(this.v);
        sbE.append(", activationExpiryTime=");
        nf1.w(sbE, this.w, ", punchTime=", this.x, ", paymentMode=");
        sbE.append(this.y);
        sbE.append(", paymentInfo=");
        sbE.append(this.z);
        sbE.append(", passIdUsedToPurchaseTicket=");
        cb0.t(sbE, this.A, ", firstBookingId=", this.B, ", fareNote=");
        sbE.append(this.C);
        sbE.append(", firstBookingInfo=");
        sbE.append(this.D);
        sbE.append(", prevBookingStatus=");
        sbE.append(this.E);
        sbE.append(", refundInfo=");
        sbE.append(this.F);
        sbE.append(", seats=");
        dd.o(sbE, this.G, ", validationEntities=", this.H, ", fareBreakup=");
        cb0.s(", ticketColorSchemeHex=", this.J, ", tripEndTime=", sbE, this.I);
        sbE.append(this.K);
        sbE.append(", journeyLegs=");
        sbE.append(this.L);
        sbE.append(", sequenceInfo=");
        sbE.append(this.M);
        sbE.append(", fareDetails=");
        sbE.append(this.N);
        sbE.append(")");
        return sbE.toString();
    }
}
