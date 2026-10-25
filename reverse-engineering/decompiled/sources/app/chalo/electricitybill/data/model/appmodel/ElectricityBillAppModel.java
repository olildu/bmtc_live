package app.chalo.electricitybill.data.model.appmodel;

import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/electricitybill/data/model/appmodel/ElectricityBillAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ElectricityBillAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2538a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/data/model/appmodel/ElectricityBillAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/electricitybill/data/model/appmodel/ElectricityBillAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ElectricityBillAppModel> serializer() {
            return ElectricityBillAppModel$$serializer.f2539a;
        }
    }

    public /* synthetic */ ElectricityBillAppModel(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ElectricityBillAppModel$$serializer.f2539a.getDescriptor(), i, 127);
            throw null;
        }
        this.f2538a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElectricityBillAppModel)) {
            return false;
        }
        ElectricityBillAppModel electricityBillAppModel = (ElectricityBillAppModel) obj;
        return this.f2538a == electricityBillAppModel.f2538a && this.b == electricityBillAppModel.b && Intrinsics.d(this.c, electricityBillAppModel.c) && Intrinsics.d(this.d, electricityBillAppModel.d) && this.e == electricityBillAppModel.e && this.f == electricityBillAppModel.f && this.g == electricityBillAppModel.g && Intrinsics.d(this.h, electricityBillAppModel.h);
    }

    public final int hashCode() {
        long j = this.f2538a;
        long j2 = this.b;
        int iE = (((((nf1.e(nf1.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g) * 31;
        String str = this.h;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbG = i71.g(this.f2538a, "ElectricityBillAppModel(billDate=", ", dueDate=");
        dd.k(this.b, ", consumerNumber=", this.c, sbG);
        sbG.append(", customerName=");
        sbG.append(this.d);
        sbG.append(", isPaymentAlreadyDone=");
        sbG.append(this.e);
        z40.o(this.f, this.g, ", dueBillAmountInPaisa=", ", userEnteredAmountInPaisa=", sbG);
        return z40.h(sbG, ", transactionId=", this.h, ")");
    }

    public ElectricityBillAppModel(long j, long j2, String consumerNumber, String customerName, boolean z, int i, int i2, String str) {
        Intrinsics.i(consumerNumber, "consumerNumber");
        Intrinsics.i(customerName, "customerName");
        this.f2538a = j;
        this.b = j2;
        this.c = consumerNumber;
        this.d = customerName;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = str;
    }
}
