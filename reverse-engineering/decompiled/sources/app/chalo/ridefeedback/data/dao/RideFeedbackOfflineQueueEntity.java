package app.chalo.ridefeedback.data.dao;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/dao/RideFeedbackOfflineQueueEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackOfflineQueueEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9072a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final List h;
    public final String i;
    public final boolean j;
    public final long k;

    public RideFeedbackOfflineQueueEntity(String bookingId, String userId, String cityId, String productType, String productSubType, Integer num, String str, List feedbackSubtag, String str2, boolean z, long j) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(feedbackSubtag, "feedbackSubtag");
        this.f9072a = bookingId;
        this.b = userId;
        this.c = cityId;
        this.d = productType;
        this.e = productSubType;
        this.f = num;
        this.g = str;
        this.h = feedbackSubtag;
        this.i = str2;
        this.j = z;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackOfflineQueueEntity)) {
            return false;
        }
        RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity = (RideFeedbackOfflineQueueEntity) obj;
        return Intrinsics.d(this.f9072a, rideFeedbackOfflineQueueEntity.f9072a) && Intrinsics.d(this.b, rideFeedbackOfflineQueueEntity.b) && Intrinsics.d(this.c, rideFeedbackOfflineQueueEntity.c) && Intrinsics.d(this.d, rideFeedbackOfflineQueueEntity.d) && Intrinsics.d(this.e, rideFeedbackOfflineQueueEntity.e) && Intrinsics.d(this.f, rideFeedbackOfflineQueueEntity.f) && Intrinsics.d(this.g, rideFeedbackOfflineQueueEntity.g) && Intrinsics.d(this.h, rideFeedbackOfflineQueueEntity.h) && Intrinsics.d(this.i, rideFeedbackOfflineQueueEntity.i) && this.j == rideFeedbackOfflineQueueEntity.j && this.k == rideFeedbackOfflineQueueEntity.k;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f9072a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.g;
        int iB = r30.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        String str2 = this.i;
        int iHashCode2 = (((iB + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237)) * 31;
        long j = this.k;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideFeedbackOfflineQueueEntity(bookingId=", this.f9072a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
        xs.u(this.f, this.e, ", rating=", ", feedbackTag=", sbE);
        pk0.w(this.g, ", feedbackSubtag=", ", comment=", sbE, this.h);
        t10.s(this.i, ", skipped=", ", submissionTimestamp=", sbE, this.j);
        return uf0.m(this.k, ")", sbE);
    }
}
