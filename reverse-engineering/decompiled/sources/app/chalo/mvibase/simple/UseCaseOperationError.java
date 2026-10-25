package app.chalo.mvibase.simple;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mvibase/simple/UseCaseOperationError;", "USE_CASE_SPECIFIC_ERROR", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UseCaseOperationError<USE_CASE_SPECIFIC_ERROR> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OperationFailureError f6000a;
    public final int b;
    public final String c;

    public UseCaseOperationError(OperationFailureError reason, int i, String str) {
        Intrinsics.i(reason, "reason");
        this.f6000a = reason;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UseCaseOperationError)) {
            return false;
        }
        UseCaseOperationError useCaseOperationError = (UseCaseOperationError) obj;
        return Intrinsics.d(this.f6000a, useCaseOperationError.f6000a) && this.b == useCaseOperationError.b && Intrinsics.d(this.c, useCaseOperationError.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f6000a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseOperationError(reason=");
        sb.append(this.f6000a);
        sb.append(", errorCode=");
        sb.append(this.b);
        sb.append(", msg=");
        return vo1.p(sb, this.c, ")");
    }
}
