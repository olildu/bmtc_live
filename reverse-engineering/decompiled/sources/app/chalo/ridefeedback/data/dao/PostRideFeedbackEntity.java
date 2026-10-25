package app.chalo.ridefeedback.data.dao;

import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.app.RideFeedbackTriggerType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/dao/PostRideFeedbackEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostRideFeedbackEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9071a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final RideFeedbackTriggerType j;
    public final String k;
    public final String l;
    public final RideFeedbackFillStatus m;
    public final Long n;

    public PostRideFeedbackEntity(String bookingId, String userId, String cityId, String tripId, String routeId, String fromStopName, String toStopName, long j, long j2, RideFeedbackTriggerType triggerType, String productType, String productSubType, RideFeedbackFillStatus fillStatus, Long l) {
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
        Intrinsics.i(fillStatus, "fillStatus");
        this.f9071a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = tripId;
        this.e = routeId;
        this.f = fromStopName;
        this.g = toStopName;
        this.h = j;
        this.i = j2;
        this.j = triggerType;
        this.k = productType;
        this.l = productSubType;
        this.m = fillStatus;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostRideFeedbackEntity)) {
            return false;
        }
        PostRideFeedbackEntity postRideFeedbackEntity = (PostRideFeedbackEntity) obj;
        return Intrinsics.d(this.f9071a, postRideFeedbackEntity.f9071a) && Intrinsics.d(this.b, postRideFeedbackEntity.b) && Intrinsics.d(this.c, postRideFeedbackEntity.c) && Intrinsics.d(this.d, postRideFeedbackEntity.d) && Intrinsics.d(this.e, postRideFeedbackEntity.e) && Intrinsics.d(this.f, postRideFeedbackEntity.f) && Intrinsics.d(this.g, postRideFeedbackEntity.g) && this.h == postRideFeedbackEntity.h && this.i == postRideFeedbackEntity.i && this.j == postRideFeedbackEntity.j && Intrinsics.d(this.k, postRideFeedbackEntity.k) && Intrinsics.d(this.l, postRideFeedbackEntity.l) && this.m == postRideFeedbackEntity.m && Intrinsics.d(this.n, postRideFeedbackEntity.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f9071a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        long j = this.h;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.i;
        int iHashCode = (this.m.hashCode() + nf1.e(nf1.e((this.j.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.k), 31, this.l)) * 31;
        Long l = this.n;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PostRideFeedbackEntity(bookingId=", this.f9071a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", tripId=", this.d, ", routeId=");
        cb0.t(sbE, this.e, ", fromStopName=", this.f, ", toStopName=");
        n21.p(this.h, this.g, ", tripStartTimestamp=", sbE);
        xs.r(this.i, ", tripEndTimestamp=", ", triggerType=", sbE);
        sbE.append(this.j);
        sbE.append(", productType=");
        sbE.append(this.k);
        sbE.append(", productSubType=");
        sbE.append(this.l);
        sbE.append(", fillStatus=");
        sbE.append(this.m);
        sbE.append(", prfSubmittedAt=");
        return pk0.l(sbE, this.n, ")");
    }
}
