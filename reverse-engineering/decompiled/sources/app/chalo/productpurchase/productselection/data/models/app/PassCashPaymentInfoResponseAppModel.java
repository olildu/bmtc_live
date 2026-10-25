package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/PassCashPaymentInfoResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassCashPaymentInfoResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8637a;
    public final String b;
    public final double c;

    public PassCashPaymentInfoResponseAppModel(double d, String userId, String referenceId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(referenceId, "referenceId");
        this.f8637a = userId;
        this.b = referenceId;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassCashPaymentInfoResponseAppModel)) {
            return false;
        }
        PassCashPaymentInfoResponseAppModel passCashPaymentInfoResponseAppModel = (PassCashPaymentInfoResponseAppModel) obj;
        return Intrinsics.d(this.f8637a, passCashPaymentInfoResponseAppModel.f8637a) && Intrinsics.d(this.b, passCashPaymentInfoResponseAppModel.b) && Double.compare(this.c, passCashPaymentInfoResponseAppModel.c) == 0;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8637a.hashCode() * 31, 31, this.b);
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassCashPaymentInfoResponseAppModel(userId=", this.f8637a, ", referenceId=", this.b, ", amount=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
