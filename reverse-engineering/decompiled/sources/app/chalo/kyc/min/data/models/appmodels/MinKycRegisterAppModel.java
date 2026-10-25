package app.chalo.kyc.min.data.models.appmodels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/data/models/appmodels/MinKycRegisterAppModel;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycRegisterAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4102a;
    public final KycWalletStatus b;

    public MinKycRegisterAppModel(String str, KycWalletStatus status) {
        Intrinsics.i(status, "status");
        this.f4102a = str;
        this.b = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycRegisterAppModel)) {
            return false;
        }
        MinKycRegisterAppModel minKycRegisterAppModel = (MinKycRegisterAppModel) obj;
        return Intrinsics.d(this.f4102a, minKycRegisterAppModel.f4102a) && this.b == minKycRegisterAppModel.b;
    }

    public final int hashCode() {
        String str = this.f4102a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "MinKycRegisterAppModel(referenceNum=" + this.f4102a + ", status=" + this.b + ")";
    }
}
