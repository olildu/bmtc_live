package app.chalo.electricitybill.data.model.apimodel.response;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.py;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ElectricityBillPaymentHistoryApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2532a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/apimodel/response/ElectricityBillPaymentHistoryApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ElectricityBillPaymentHistoryApiModel> serializer() {
            return ElectricityBillPaymentHistoryApiModel$$serializer.f2533a;
        }
    }

    public /* synthetic */ ElectricityBillPaymentHistoryApiModel(int i, String str, Integer num, Long l, Long l2, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8, String str9) {
        if ((i & 1) == 0) {
            this.f2532a = null;
        } else {
            this.f2532a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentHistoryApiModel)) {
            return false;
        }
        ElectricityBillPaymentHistoryApiModel electricityBillPaymentHistoryApiModel = (ElectricityBillPaymentHistoryApiModel) obj;
        return Intrinsics.d(this.f2532a, electricityBillPaymentHistoryApiModel.f2532a) && Intrinsics.d(this.b, electricityBillPaymentHistoryApiModel.b) && Intrinsics.d(this.c, electricityBillPaymentHistoryApiModel.c) && Intrinsics.d(this.d, electricityBillPaymentHistoryApiModel.d) && Intrinsics.d(this.e, electricityBillPaymentHistoryApiModel.e) && Intrinsics.d(this.f, electricityBillPaymentHistoryApiModel.f) && Intrinsics.d(this.g, electricityBillPaymentHistoryApiModel.g) && Intrinsics.d(this.h, electricityBillPaymentHistoryApiModel.h) && Intrinsics.d(this.i, electricityBillPaymentHistoryApiModel.i) && Intrinsics.d(this.j, electricityBillPaymentHistoryApiModel.j) && Intrinsics.d(this.k, electricityBillPaymentHistoryApiModel.k) && Intrinsics.d(this.l, electricityBillPaymentHistoryApiModel.l) && Intrinsics.d(this.m, electricityBillPaymentHistoryApiModel.m);
    }

    public final int hashCode() {
        String str = this.f2532a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElectricityBillPaymentHistoryApiModel(accountNumber=");
        sb.append(this.f2532a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", billDate=");
        nf1.w(sb, this.c, ", bookingTime=", this.d, ", city=");
        cb0.t(sb, this.e, ", configId=", this.f, ", customerName=");
        cb0.t(sb, this.g, ", deviceId=", this.h, ", dueDate=");
        py.t(this.i, ", refId=", this.j, ", status=", sb);
        cb0.t(sb, this.k, ", transactionId=", this.l, ", userId=");
        return vo1.p(sb, this.m, ")");
    }
}
