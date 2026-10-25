package app.chalo.resultstatemanager;

import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/resultstatemanager/ResultStateDataHolder;", "T", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResultStateDataHolder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9040a;
    public final Object b;
    public final long c;

    public ResultStateDataHolder(String requestId, Object obj, long j) {
        Intrinsics.i(requestId, "requestId");
        this.f9040a = requestId;
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultStateDataHolder)) {
            return false;
        }
        ResultStateDataHolder resultStateDataHolder = (ResultStateDataHolder) obj;
        return Intrinsics.d(this.f9040a, resultStateDataHolder.f9040a) && Intrinsics.d(this.b, resultStateDataHolder.b) && this.c == resultStateDataHolder.c;
    }

    public final int hashCode() {
        int iHashCode = this.f9040a.hashCode() * 31;
        Object obj = this.b;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        long j = this.c;
        return ((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultStateDataHolder(requestId=");
        sb.append(this.f9040a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", updatedAt=");
        return uf0.m(this.c, ")", sb);
    }
}
