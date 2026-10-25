package app.chalo.electricitybill.data.model.appmodel;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/data/model/appmodel/ElectricityBillPaymentHistoryAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ElectricityBillPaymentHistoryAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2540a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final String i;
    public final String j;

    public ElectricityBillPaymentHistoryAppModel(String str, Integer num, Long l, Long l2, String str2, String str3, Long l3, String str4, String str5, String str6) {
        this.f2540a = str;
        this.b = num;
        this.c = l;
        this.d = l2;
        this.e = str2;
        this.f = str3;
        this.g = l3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentHistoryAppModel)) {
            return false;
        }
        ElectricityBillPaymentHistoryAppModel electricityBillPaymentHistoryAppModel = (ElectricityBillPaymentHistoryAppModel) obj;
        return Intrinsics.d(this.f2540a, electricityBillPaymentHistoryAppModel.f2540a) && Intrinsics.d(this.b, electricityBillPaymentHistoryAppModel.b) && Intrinsics.d(this.c, electricityBillPaymentHistoryAppModel.c) && Intrinsics.d(this.d, electricityBillPaymentHistoryAppModel.d) && Intrinsics.d(this.e, electricityBillPaymentHistoryAppModel.e) && Intrinsics.d(this.f, electricityBillPaymentHistoryAppModel.f) && Intrinsics.d(this.g, electricityBillPaymentHistoryAppModel.g) && Intrinsics.d(this.h, electricityBillPaymentHistoryAppModel.h) && Intrinsics.d(this.i, electricityBillPaymentHistoryAppModel.i) && Intrinsics.d(this.j, electricityBillPaymentHistoryAppModel.j);
    }

    public final int hashCode() {
        String str = this.f2540a;
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
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElectricityBillPaymentHistoryAppModel(accountNumber=");
        sb.append(this.f2540a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", billDate=");
        nf1.w(sb, this.c, ", bookingTime=", this.d, ", city=");
        cb0.t(sb, this.e, ", customerName=", this.f, ", dueDate=");
        py.t(this.g, ", refId=", this.h, ", status=", sb);
        return r30.i(sb, this.i, ", transactionId=", this.j, ")");
    }
}
