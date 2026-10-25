package app.chalo.login.manager;

import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/manager/DpdpaConsentCacheInfo;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class DpdpaConsentCacheInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DpdpaUserConsentsInfoAppModel f5257a;
    public final long b;

    public DpdpaConsentCacheInfo(DpdpaUserConsentsInfoAppModel result, long j) {
        Intrinsics.i(result, "result");
        this.f5257a = result;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpdpaConsentCacheInfo)) {
            return false;
        }
        DpdpaConsentCacheInfo dpdpaConsentCacheInfo = (DpdpaConsentCacheInfo) obj;
        return Intrinsics.d(this.f5257a, dpdpaConsentCacheInfo.f5257a) && this.b == dpdpaConsentCacheInfo.b;
    }

    public final int hashCode() {
        int iHashCode = this.f5257a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DpdpaConsentCacheInfo(result=" + this.f5257a + ", updatedAt=" + this.b + ")";
    }
}
