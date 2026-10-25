package app.chalo.permissions.gps;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/permissions/gps/GpsRequestInfo;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class GpsRequestInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6822a;
    public final long b;

    public GpsRequestInfo(long j, boolean z) {
        this.f6822a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsRequestInfo)) {
            return false;
        }
        GpsRequestInfo gpsRequestInfo = (GpsRequestInfo) obj;
        return this.f6822a == gpsRequestInfo.f6822a && this.b == gpsRequestInfo.b;
    }

    public final int hashCode() {
        int i = this.f6822a ? 1231 : 1237;
        long j = this.b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "GpsRequestInfo(isEnabled=" + this.f6822a + ", stateUpdatedAt=" + this.b + ")";
    }
}
