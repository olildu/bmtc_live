package app.chalo.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ads/AdsterUnifiedPlacementResolution;", "", "Resolved", "Missing", "Lapp/chalo/ads/AdsterUnifiedPlacementResolution$Missing;", "Lapp/chalo/ads/AdsterUnifiedPlacementResolution$Resolved;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AdsterUnifiedPlacementResolution {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterUnifiedPlacementResolution$Missing;", "Lapp/chalo/ads/AdsterUnifiedPlacementResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Missing extends AdsterUnifiedPlacementResolution {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Missing);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Missing(plistKey=null, reason=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/AdsterUnifiedPlacementResolution$Resolved;", "Lapp/chalo/ads/AdsterUnifiedPlacementResolution;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Resolved extends AdsterUnifiedPlacementResolution {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Resolved);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Resolved(placementName=null)";
        }
    }
}
