package app.chalo.metro.data.api;

import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.py;
import defpackage.ti0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroTicketApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5414a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    public final GenericMobileTicketStopDetailsApiResponseModel l;
    public final GenericMobileTicketStopDetailsApiResponseModel m;
    public final String n;
    public final String o;
    public final String p;
    public final Long q;
    public final List r;
    public final Long s;
    public final Long t;
    public final String u;
    public final RefundInfoApiModel v;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/data/api/MetroTicketApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/data/api/MetroTicketApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroTicketApiModel> serializer() {
            return MetroTicketApiModel$$serializer.f5415a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = new Lazy[]{null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(0)), null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ti0(1)), null, null, null, null};
    }

    public /* synthetic */ MetroTicketApiModel(int i, String str, String str2, String str3, Long l, Long l2, String str4, String str5, String str6, List list, String str7, String str8, GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel, GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2, String str9, String str10, String str11, Long l3, List list2, Long l4, Long l5, String str12, RefundInfoApiModel refundInfoApiModel) {
        if (4194303 != (i & 4194303)) {
            PluginExceptionsKt.b(MetroTicketApiModel$$serializer.f5415a.getDescriptor(), i, 4194303);
            throw null;
        }
        this.f5414a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
        this.l = genericMobileTicketStopDetailsApiResponseModel;
        this.m = genericMobileTicketStopDetailsApiResponseModel2;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = l3;
        this.r = list2;
        this.s = l4;
        this.t = l5;
        this.u = str12;
        this.v = refundInfoApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroTicketApiModel)) {
            return false;
        }
        MetroTicketApiModel metroTicketApiModel = (MetroTicketApiModel) obj;
        return Intrinsics.d(this.f5414a, metroTicketApiModel.f5414a) && Intrinsics.d(this.b, metroTicketApiModel.b) && Intrinsics.d(this.c, metroTicketApiModel.c) && Intrinsics.d(this.d, metroTicketApiModel.d) && Intrinsics.d(this.e, metroTicketApiModel.e) && Intrinsics.d(this.f, metroTicketApiModel.f) && Intrinsics.d(this.g, metroTicketApiModel.g) && Intrinsics.d(this.h, metroTicketApiModel.h) && Intrinsics.d(this.i, metroTicketApiModel.i) && Intrinsics.d(this.j, metroTicketApiModel.j) && Intrinsics.d(this.k, metroTicketApiModel.k) && Intrinsics.d(this.l, metroTicketApiModel.l) && Intrinsics.d(this.m, metroTicketApiModel.m) && Intrinsics.d(this.n, metroTicketApiModel.n) && Intrinsics.d(this.o, metroTicketApiModel.o) && Intrinsics.d(this.p, metroTicketApiModel.p) && Intrinsics.d(this.q, metroTicketApiModel.q) && Intrinsics.d(this.r, metroTicketApiModel.r) && Intrinsics.d(this.s, metroTicketApiModel.s) && Intrinsics.d(this.t, metroTicketApiModel.t) && Intrinsics.d(this.u, metroTicketApiModel.u) && Intrinsics.d(this.v, metroTicketApiModel.v);
    }

    public final int hashCode() {
        String str = this.f5414a;
        int iE = nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.i;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel = this.l;
        int iHashCode9 = (iHashCode8 + (genericMobileTicketStopDetailsApiResponseModel == null ? 0 : genericMobileTicketStopDetailsApiResponseModel.hashCode())) * 31;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2 = this.m;
        int iHashCode10 = (iHashCode9 + (genericMobileTicketStopDetailsApiResponseModel2 == null ? 0 : genericMobileTicketStopDetailsApiResponseModel2.hashCode())) * 31;
        String str7 = this.n;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l3 = this.q;
        int iHashCode14 = (iHashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list2 = this.r;
        int iHashCode15 = (iHashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l4 = this.s;
        int iHashCode16 = (iHashCode15 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.t;
        int iHashCode17 = (iHashCode16 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str10 = this.u;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        RefundInfoApiModel refundInfoApiModel = this.v;
        return iHashCode18 + (refundInfoApiModel != null ? refundInfoApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroTicketApiModel(bookingId=", this.f5414a, ", productType=", this.b, ", productSubType=");
        cb0.r(this.d, this.c, ", bookingTime=", ", amount=", sbE);
        py.t(this.e, ", status=", this.f, ", city=", sbE);
        cb0.t(sbE, this.g, ", qrCode=", this.h, ", validationEntities=");
        cb0.s(", tone=", this.j, ", configurationId=", sbE, this.i);
        sbE.append(this.k);
        sbE.append(", fromStopDetails=");
        sbE.append(this.l);
        sbE.append(", toStopDetails=");
        sbE.append(this.m);
        sbE.append(", routeId=");
        sbE.append(this.n);
        sbE.append(", userId=");
        cb0.t(sbE, this.o, ", routeName=", this.p, ", expiryTime=");
        sbE.append(this.q);
        sbE.append(", passengerDetails=");
        sbE.append(this.r);
        sbE.append(", activationExpiryTime=");
        nf1.w(sbE, this.s, ", punchTime=", this.t, ", paymentMode=");
        sbE.append(this.u);
        sbE.append(", refundInfo=");
        sbE.append(this.v);
        sbE.append(")");
        return sbE.toString();
    }
}
