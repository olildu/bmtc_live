package app.chalo.checkout.utility;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/utility/UpiAppActivityResult;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class UpiAppActivityResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiAppResult f1630a;
    public final long b;

    public UpiAppActivityResult(UpiAppResult upiAppResult, long j) {
        this.f1630a = upiAppResult;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpiAppActivityResult)) {
            return false;
        }
        UpiAppActivityResult upiAppActivityResult = (UpiAppActivityResult) obj;
        return Intrinsics.d(this.f1630a, upiAppActivityResult.f1630a) && this.b == upiAppActivityResult.b;
    }

    public final int hashCode() {
        UpiAppResult upiAppResult = this.f1630a;
        int iHashCode = upiAppResult == null ? 0 : upiAppResult.hashCode();
        long j = this.b;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UpiAppActivityResult(data=" + this.f1630a + ", updatedAt=" + this.b + ")";
    }
}
