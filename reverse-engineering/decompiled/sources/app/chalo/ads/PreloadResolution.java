package app.chalo.ads;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/PreloadResolution;", "", "Accepted", "Ignored", "Lapp/chalo/ads/PreloadResolution$Accepted;", "Lapp/chalo/ads/PreloadResolution$Ignored;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface PreloadResolution {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/PreloadResolution$Accepted;", "Lapp/chalo/ads/PreloadResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Accepted implements PreloadResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f820a;
        public final boolean b;

        public Accepted(long j, boolean z) {
            this.f820a = j;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Accepted)) {
                return false;
            }
            Accepted accepted = (Accepted) obj;
            return this.f820a == accepted.f820a && this.b == accepted.b;
        }

        public final int hashCode() {
            long j = this.f820a;
            return (((int) (j ^ (j >>> 32))) * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "Accepted(generation=" + this.f820a + ", isRetry=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/PreloadResolution$Ignored;", "Lapp/chalo/ads/PreloadResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ignored implements PreloadResolution {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f821a;

        public Ignored(long j) {
            this.f821a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ignored) && this.f821a == ((Ignored) obj).f821a;
        }

        public final int hashCode() {
            long j = this.f821a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f821a, "Ignored(generation=", ")");
        }
    }
}
