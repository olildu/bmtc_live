package app.chalo.ridefeedback.data.app;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/data/app/RideFeedbackRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9069a;
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

    public RideFeedbackRequestAppModel(String bookingId, String userId, String cityId, String productType, String productSubType, Integer num, String str, List feedbackSubtag, String str2, boolean z, long j) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityId, "cityId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(feedbackSubtag, "feedbackSubtag");
        this.f9069a = bookingId;
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
        if (!(obj instanceof RideFeedbackRequestAppModel)) {
            return false;
        }
        RideFeedbackRequestAppModel rideFeedbackRequestAppModel = (RideFeedbackRequestAppModel) obj;
        return Intrinsics.d(this.f9069a, rideFeedbackRequestAppModel.f9069a) && Intrinsics.d(this.b, rideFeedbackRequestAppModel.b) && Intrinsics.d(this.c, rideFeedbackRequestAppModel.c) && Intrinsics.d(this.d, rideFeedbackRequestAppModel.d) && Intrinsics.d(this.e, rideFeedbackRequestAppModel.e) && Intrinsics.d(this.f, rideFeedbackRequestAppModel.f) && Intrinsics.d(this.g, rideFeedbackRequestAppModel.g) && Intrinsics.d(this.h, rideFeedbackRequestAppModel.h) && Intrinsics.d(this.i, rideFeedbackRequestAppModel.i) && this.j == rideFeedbackRequestAppModel.j && this.k == rideFeedbackRequestAppModel.k;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(nf1.e(this.f9069a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
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
        StringBuilder sbE = dd.e("RideFeedbackRequestAppModel(bookingId=", this.f9069a, ", userId=", this.b, ", cityId=");
        cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
        xs.u(this.f, this.e, ", rating=", ", feedbackTag=", sbE);
        pk0.w(this.g, ", feedbackSubtag=", ", comment=", sbE, this.h);
        t10.s(this.i, ", skipped=", ", submissionTimestamp=", sbE, this.j);
        return uf0.m(this.k, ")", sbE);
    }
}
