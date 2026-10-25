package app.chalo.features.chaloconfig.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/domain/ChaloConfigDataSnapshot;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloConfigDataSnapshot {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2646a;
    public final boolean b;

    public ChaloConfigDataSnapshot(long j, boolean z) {
        this.f2646a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloConfigDataSnapshot)) {
            return false;
        }
        ChaloConfigDataSnapshot chaloConfigDataSnapshot = (ChaloConfigDataSnapshot) obj;
        return this.f2646a == chaloConfigDataSnapshot.f2646a && this.b == chaloConfigDataSnapshot.b;
    }

    public final int hashCode() {
        long j = this.f2646a;
        return (((int) (j ^ (j >>> 32))) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ChaloConfigDataSnapshot(revision=" + this.f2646a + ", isStable=" + this.b + ")";
    }
}
