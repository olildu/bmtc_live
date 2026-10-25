package app.chalo.checkout.data.model.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/app/request/GetLazyPayUrlRequestAppModel;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetLazyPayUrlRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1338a;
    public final String b;
    public final String c;

    public GetLazyPayUrlRequestAppModel(String str, String phoneNumber, String orderId) {
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(orderId, "orderId");
        this.f1338a = str;
        this.b = phoneNumber;
        this.c = orderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLazyPayUrlRequestAppModel)) {
            return false;
        }
        GetLazyPayUrlRequestAppModel getLazyPayUrlRequestAppModel = (GetLazyPayUrlRequestAppModel) obj;
        return Intrinsics.d(this.f1338a, getLazyPayUrlRequestAppModel.f1338a) && Intrinsics.d(this.b, getLazyPayUrlRequestAppModel.b) && Intrinsics.d(this.c, getLazyPayUrlRequestAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f1338a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("GetLazyPayUrlRequestAppModel(lazyPayId=", this.f1338a, ", phoneNumber=", this.b, ", orderId="), this.c, ")");
    }
}
