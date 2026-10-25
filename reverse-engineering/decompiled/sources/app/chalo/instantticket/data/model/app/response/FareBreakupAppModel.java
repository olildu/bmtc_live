package app.chalo.instantticket.data.model.app.response;

import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/response/FareBreakupAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareBreakupAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3890a;
    public final FareBreakupOperationType b;
    public final long c;

    public FareBreakupAppModel(String fareBreakupCopy, FareBreakupOperationType fareOperationType, long j) {
        Intrinsics.i(fareBreakupCopy, "fareBreakupCopy");
        Intrinsics.i(fareOperationType, "fareOperationType");
        this.f3890a = fareBreakupCopy;
        this.b = fareOperationType;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareBreakupAppModel)) {
            return false;
        }
        FareBreakupAppModel fareBreakupAppModel = (FareBreakupAppModel) obj;
        return Intrinsics.d(this.f3890a, fareBreakupAppModel.f3890a) && this.b == fareBreakupAppModel.b && this.c == fareBreakupAppModel.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f3890a.hashCode() * 31)) * 31;
        long j = this.c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FareBreakupAppModel(fareBreakupCopy=");
        sb.append(this.f3890a);
        sb.append(", fareOperationType=");
        sb.append(this.b);
        sb.append(", fare=");
        return uf0.m(this.c, ")", sb);
    }
}
