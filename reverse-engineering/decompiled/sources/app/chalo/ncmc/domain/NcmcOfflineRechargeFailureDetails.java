package app.chalo.ncmc.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/NcmcOfflineRechargeFailureDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NcmcOfflineRechargeFailureDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6246a;
    public final NcmcOfflineRechargeFailureReason b;

    public NcmcOfflineRechargeFailureDetails(String str, NcmcOfflineRechargeFailureReason failureReason) {
        Intrinsics.i(failureReason, "failureReason");
        this.f6246a = str;
        this.b = failureReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcOfflineRechargeFailureDetails)) {
            return false;
        }
        NcmcOfflineRechargeFailureDetails ncmcOfflineRechargeFailureDetails = (NcmcOfflineRechargeFailureDetails) obj;
        return Intrinsics.d(this.f6246a, ncmcOfflineRechargeFailureDetails.f6246a) && this.b == ncmcOfflineRechargeFailureDetails.b;
    }

    public final int hashCode() {
        String str = this.f6246a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "NcmcOfflineRechargeFailureDetails(errorMsg=" + this.f6246a + ", failureReason=" + this.b + ")";
    }
}
