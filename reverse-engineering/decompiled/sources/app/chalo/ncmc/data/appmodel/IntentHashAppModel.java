package app.chalo.ncmc.data.appmodel;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/IntentHashAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntentHashAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6147a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public IntentHashAppModel(String intentHash, String invoiceNumber, String userServiceId, String str, String str2) {
        Intrinsics.i(intentHash, "intentHash");
        Intrinsics.i(invoiceNumber, "invoiceNumber");
        Intrinsics.i(userServiceId, "userServiceId");
        this.f6147a = intentHash;
        this.b = invoiceNumber;
        this.c = userServiceId;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentHashAppModel)) {
            return false;
        }
        IntentHashAppModel intentHashAppModel = (IntentHashAppModel) obj;
        return Intrinsics.d(this.f6147a, intentHashAppModel.f6147a) && Intrinsics.d(this.b, intentHashAppModel.b) && Intrinsics.d(this.c, intentHashAppModel.c) && Intrinsics.d(this.d, intentHashAppModel.d) && Intrinsics.d(this.e, intentHashAppModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f6147a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("IntentHashAppModel(intentHash=", this.f6147a, ", invoiceNumber=", this.b, ", userServiceId=");
        cb0.t(sbE, this.c, ", serviceId=", this.d, ", serviceManagementInfo=");
        return vo1.p(sbE, this.e, ")");
    }
}
