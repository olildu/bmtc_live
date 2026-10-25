package app.chalo.walletframework.quickpay.data.model.apimodel;

import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import defpackage.cb0;
import defpackage.hz0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/model/apimodel/QuickPayReceiptResponseModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPayReceiptResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] v = {null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(5)), null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10915a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final ReceiptFareDataApiResponseModel u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/model/apimodel/QuickPayReceiptResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/quickpay/data/model/apimodel/QuickPayReceiptResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPayReceiptResponseModel> serializer() {
            return QuickPayReceiptResponseModel$$serializer.f10916a;
        }
    }

    public /* synthetic */ QuickPayReceiptResponseModel(int i, String str, long j, long j2, long j3, long j4, String str2, String str3, String str4, String str5, String str6, Map map, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel) {
        if (6144 != (i & 6144)) {
            PluginExceptionsKt.b(QuickPayReceiptResponseModel$$serializer.f10916a.getDescriptor(), i, 6144);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f10915a = "";
        } else {
            this.f10915a = str;
        }
        if ((i & 2) == 0) {
            this.b = -1L;
        } else {
            this.b = j;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = -1L;
        } else {
            this.d = j3;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = map;
        }
        this.l = str7;
        this.m = str8;
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str9;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str10;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str11;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str12;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str13;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = str14;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str15;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = receiptFareDataApiResponseModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPayReceiptResponseModel)) {
            return false;
        }
        QuickPayReceiptResponseModel quickPayReceiptResponseModel = (QuickPayReceiptResponseModel) obj;
        return Intrinsics.d(this.f10915a, quickPayReceiptResponseModel.f10915a) && this.b == quickPayReceiptResponseModel.b && this.c == quickPayReceiptResponseModel.c && this.d == quickPayReceiptResponseModel.d && this.e == quickPayReceiptResponseModel.e && Intrinsics.d(this.f, quickPayReceiptResponseModel.f) && Intrinsics.d(this.g, quickPayReceiptResponseModel.g) && Intrinsics.d(this.h, quickPayReceiptResponseModel.h) && Intrinsics.d(this.i, quickPayReceiptResponseModel.i) && Intrinsics.d(this.j, quickPayReceiptResponseModel.j) && Intrinsics.d(this.k, quickPayReceiptResponseModel.k) && Intrinsics.d(this.l, quickPayReceiptResponseModel.l) && Intrinsics.d(this.m, quickPayReceiptResponseModel.m) && Intrinsics.d(this.n, quickPayReceiptResponseModel.n) && Intrinsics.d(this.o, quickPayReceiptResponseModel.o) && Intrinsics.d(this.p, quickPayReceiptResponseModel.p) && Intrinsics.d(this.q, quickPayReceiptResponseModel.q) && Intrinsics.d(this.r, quickPayReceiptResponseModel.r) && Intrinsics.d(this.s, quickPayReceiptResponseModel.s) && Intrinsics.d(this.t, quickPayReceiptResponseModel.t) && Intrinsics.d(this.u, quickPayReceiptResponseModel.u);
    }

    public final int hashCode() {
        int iHashCode = this.f10915a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.e;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        Map map = this.k;
        int iHashCode2 = (iE + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.o;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.p;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.r;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.t;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = this.u;
        return iHashCode11 + (receiptFareDataApiResponseModel != null ? receiptFareDataApiResponseModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "QuickPayReceiptResponseModel(transactionId=", this.f10915a, ", punchTime=");
        xs.r(this.c, ", activationDuration=", ", expiryTime=", sbM);
        sbM.append(this.d);
        xs.r(this.e, ", amount=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.f, ", conductorId=", this.g, ", startStop=");
        cb0.t(sbM, this.h, ", endStop=", this.i, ", routeName=");
        sbM.append(this.j);
        sbM.append(", passengerDetails=");
        sbM.append(this.k);
        sbM.append(", via=");
        cb0.t(sbM, this.l, ", routeNamingSchemeType=", this.m, ", depotName=");
        cb0.t(sbM, this.n, ", etimGeneratedTicketId=", this.o, ", scheduleNumber=");
        cb0.t(sbM, this.p, ", routeServiceType=", this.q, ", driverId=");
        cb0.t(sbM, this.r, ", waybillNo=", this.s, ", etimVersion=");
        sbM.append(this.t);
        sbM.append(", ticketFareData=");
        sbM.append(this.u);
        sbM.append(")");
        return sbM.toString();
    }
}
