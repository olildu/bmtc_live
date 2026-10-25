package app.chalo.ridefeedback.data.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/data/app/PendingRideFeedbackAppModel;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PendingRideFeedbackAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9066a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final String i;
    public final RideFeedbackTriggerType j;
    public final String k;
    public final String l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/app/PendingRideFeedbackAppModel$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PendingRideFeedbackAppModel(String bookingId, String userId, String cityId, String tripId, String routeId, String fromStopName, String toStopName, long j, String str, RideFeedbackTriggerType triggerType, String productType, String productSubType) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(tripId, "tripId");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Intrinsics.i(triggerType, "triggerType");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.f9066a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = tripId;
        this.e = routeId;
        this.f = fromStopName;
        this.g = toStopName;
        this.h = j;
        this.i = str;
        this.j = triggerType;
        this.k = productType;
        this.l = productSubType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingRideFeedbackAppModel)) {
            return false;
        }
        PendingRideFeedbackAppModel pendingRideFeedbackAppModel = (PendingRideFeedbackAppModel) obj;
        return Intrinsics.d(this.f9066a, pendingRideFeedbackAppModel.f9066a) && Intrinsics.d(this.b, pendingRideFeedbackAppModel.b) && Intrinsics.d(this.c, pendingRideFeedbackAppModel.c) && Intrinsics.d(this.d, pendingRideFeedbackAppModel.d) && Intrinsics.d(this.e, pendingRideFeedbackAppModel.e) && Intrinsics.d(this.f, pendingRideFeedbackAppModel.f) && Intrinsics.d(this.g, pendingRideFeedbackAppModel.g) && this.h == pendingRideFeedbackAppModel.h && Intrinsics.d(this.i, pendingRideFeedbackAppModel.i) && this.j == pendingRideFeedbackAppModel.j && Intrinsics.d(this.k, pendingRideFeedbackAppModel.k) && Intrinsics.d(this.l, pendingRideFeedbackAppModel.l);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f9066a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        return this.l.hashCode() + nf1.e((this.j.hashCode() + nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.i)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PendingRideFeedbackAppModel(bookingId=", this.f9066a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tripId=", this.d, ", routeId=");
        cb0.t(sbE, this.e, ", fromStopName=", this.f, ", toStopName=");
        n21.p(this.h, this.g, ", tripEndTimestamp=", sbE);
        sbE.append(", tripStartTimeText=");
        sbE.append(this.i);
        sbE.append(", triggerType=");
        sbE.append(this.j);
        cb0.t(sbE, ", productType=", this.k, ", productSubType=", this.l);
        sbE.append(")");
        return sbE.toString();
    }
}
