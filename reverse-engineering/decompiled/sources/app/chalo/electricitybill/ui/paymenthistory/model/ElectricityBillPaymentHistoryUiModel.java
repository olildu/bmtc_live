package app.chalo.electricitybill.ui.paymenthistory.model;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vz;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/model/ElectricityBillPaymentHistoryUiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ElectricityBillPaymentHistoryUiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vz(13)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2606a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ElectricityBillPaymentStatus i;
    public final String j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/model/ElectricityBillPaymentHistoryUiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/ui/paymenthistory/model/ElectricityBillPaymentHistoryUiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ElectricityBillPaymentHistoryUiModel> serializer() {
            return ElectricityBillPaymentHistoryUiModel$$serializer.f2607a;
        }
    }

    public /* synthetic */ ElectricityBillPaymentHistoryUiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ElectricityBillPaymentStatus electricityBillPaymentStatus, String str9) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.b(ElectricityBillPaymentHistoryUiModel$$serializer.f2607a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f2606a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = electricityBillPaymentStatus;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillPaymentHistoryUiModel)) {
            return false;
        }
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel = (ElectricityBillPaymentHistoryUiModel) obj;
        return Intrinsics.d(this.f2606a, electricityBillPaymentHistoryUiModel.f2606a) && Intrinsics.d(this.b, electricityBillPaymentHistoryUiModel.b) && Intrinsics.d(this.c, electricityBillPaymentHistoryUiModel.c) && Intrinsics.d(this.d, electricityBillPaymentHistoryUiModel.d) && Intrinsics.d(this.e, electricityBillPaymentHistoryUiModel.e) && Intrinsics.d(this.f, electricityBillPaymentHistoryUiModel.f) && Intrinsics.d(this.g, electricityBillPaymentHistoryUiModel.g) && Intrinsics.d(this.h, electricityBillPaymentHistoryUiModel.h) && this.i == electricityBillPaymentHistoryUiModel.i && Intrinsics.d(this.j, electricityBillPaymentHistoryUiModel.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f2606a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ElectricityBillPaymentHistoryUiModel(accountNumber=", this.f2606a, ", amountString=", this.b, ", billDate=");
        cb0.t(sbE, this.c, ", bookingDate=", this.d, ", city=");
        cb0.t(sbE, this.e, ", customerName=", this.f, ", dueDate=");
        cb0.t(sbE, this.g, ", refId=", this.h, ", status=");
        sbE.append(this.i);
        sbE.append(", transactionId=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public ElectricityBillPaymentHistoryUiModel(String accountNumber, String amountString, String billDate, String bookingDate, String city, String customerName, String dueDate, String refId, ElectricityBillPaymentStatus status, String transactionId) {
        Intrinsics.i(accountNumber, "accountNumber");
        Intrinsics.i(amountString, "amountString");
        Intrinsics.i(billDate, "billDate");
        Intrinsics.i(bookingDate, "bookingDate");
        Intrinsics.i(city, "city");
        Intrinsics.i(customerName, "customerName");
        Intrinsics.i(dueDate, "dueDate");
        Intrinsics.i(refId, "refId");
        Intrinsics.i(status, "status");
        Intrinsics.i(transactionId, "transactionId");
        this.f2606a = accountNumber;
        this.b = amountString;
        this.c = billDate;
        this.d = bookingDate;
        this.e = city;
        this.f = customerName;
        this.g = dueDate;
        this.h = refId;
        this.i = status;
        this.j = transactionId;
    }
}
