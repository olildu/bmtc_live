package app.chalo.checkout.data.model.app;

import defpackage.cb0;
import defpackage.hq0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentDisplayDetailsAppModel;", "", "Companion", "$serializer", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaymentDisplayDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1289a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/data/model/app/PaymentDisplayDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentDisplayDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaymentDisplayDetailsAppModel> serializer() {
            return PaymentDisplayDetailsAppModel$$serializer.f1290a;
        }
    }

    public /* synthetic */ PaymentDisplayDetailsAppModel(String str, String str2, int i, String str3, boolean z, String str4, String str5) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(PaymentDisplayDetailsAppModel$$serializer.f1290a.getDescriptor(), i, 63);
            throw null;
        }
        this.f1289a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDisplayDetailsAppModel)) {
            return false;
        }
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel = (PaymentDisplayDetailsAppModel) obj;
        return Intrinsics.d(this.f1289a, paymentDisplayDetailsAppModel.f1289a) && this.b == paymentDisplayDetailsAppModel.b && Intrinsics.d(this.c, paymentDisplayDetailsAppModel.c) && Intrinsics.d(this.d, paymentDisplayDetailsAppModel.d) && Intrinsics.d(this.e, paymentDisplayDetailsAppModel.e) && Intrinsics.d(this.f, paymentDisplayDetailsAppModel.f);
    }

    public final int hashCode() {
        int iHashCode = ((this.f1289a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = hq0.m("PaymentDisplayDetailsAppModel(name=", this.f1289a, ", isEnabled=", ", label=", this.b);
        cb0.t(sbM, this.c, ", warningMsg=", this.d, ", description=");
        return r30.i(sbM, this.e, ", logoUrl=", this.f, ")");
    }

    public PaymentDisplayDetailsAppModel(String name, String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.i(name, "name");
        this.f1289a = name;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }
}
