package app.chalo.features.chaloconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/ChaloConfigStatus;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloConfigStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigCacheStatus f2629a;
    public final ChaloConfigFetchStatus b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2630a;

        static {
            int[] iArr = new int[ChaloConfigCacheStatus.values().length];
            try {
                iArr[ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloConfigCacheStatus.DATA_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloConfigCacheStatus.NO_DATA_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloConfigCacheStatus.CACHE_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloConfigCacheStatus.OLD_LANGUAGE_DATA_CACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f2630a = iArr;
        }
    }

    public ChaloConfigStatus(ChaloConfigCacheStatus chaloConfigCacheStatus, ChaloConfigFetchStatus chaloConfigFetchStatus) {
        Intrinsics.i(chaloConfigCacheStatus, "chaloConfigCacheStatus");
        Intrinsics.i(chaloConfigFetchStatus, "chaloConfigFetchStatus");
        this.f2629a = chaloConfigCacheStatus;
        this.b = chaloConfigFetchStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloConfigStatus)) {
            return false;
        }
        ChaloConfigStatus chaloConfigStatus = (ChaloConfigStatus) obj;
        return this.f2629a == chaloConfigStatus.f2629a && this.b == chaloConfigStatus.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2629a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloConfigStatus(chaloConfigCacheStatus=" + this.f2629a + ", chaloConfigFetchStatus=" + this.b + ")";
    }
}
