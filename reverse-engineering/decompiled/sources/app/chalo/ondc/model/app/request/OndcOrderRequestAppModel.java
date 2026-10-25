package app.chalo.ondc.model.app.request;

import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/model/app/request/OndcOrderRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OndcOrderRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6778a;
    public final long b;

    public OndcOrderRequestAppModel(String ondcBookingId, long j) {
        Intrinsics.i(ondcBookingId, "ondcBookingId");
        this.f6778a = ondcBookingId;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OndcOrderRequestAppModel)) {
            return false;
        }
        OndcOrderRequestAppModel ondcOrderRequestAppModel = (OndcOrderRequestAppModel) obj;
        return Intrinsics.d(this.f6778a, ondcOrderRequestAppModel.f6778a) && this.b == ondcOrderRequestAppModel.b;
    }

    public final int hashCode() {
        int iHashCode = this.f6778a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "OndcOrderRequestAppModel(ondcBookingId=", this.f6778a, ", totalFare=");
        sbM.append(")");
        return sbM.toString();
    }
}
