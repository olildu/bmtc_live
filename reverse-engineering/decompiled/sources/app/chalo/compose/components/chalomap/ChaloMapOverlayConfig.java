package app.chalo.compose.components.chalomap;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig;", "", "FixedRadius", "AdaptiveRadius", "Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig$AdaptiveRadius;", "Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig$FixedRadius;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloMapOverlayConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MapOverlayColor f1871a;
    public final MapOverlayColor b;
    public final IconType c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig$AdaptiveRadius;", "Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdaptiveRadius extends ChaloMapOverlayConfig {
        public final float d;
        public final MapOverlayColor e;
        public final MapOverlayColor f;
        public final IconType g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdaptiveRadius(float f, MapOverlayColor overlayColor, MapOverlayColor mapOverlayColor, IconType iconType) {
            super(overlayColor, mapOverlayColor, iconType);
            Intrinsics.i(overlayColor, "overlayColor");
            this.d = f;
            this.e = overlayColor;
            this.f = mapOverlayColor;
            this.g = iconType;
        }

        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final MapOverlayColor getB() {
            return this.f;
        }

        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final IconType getC() {
            return this.g;
        }

        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final MapOverlayColor getF1871a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptiveRadius)) {
                return false;
            }
            AdaptiveRadius adaptiveRadius = (AdaptiveRadius) obj;
            return Float.compare(this.d, adaptiveRadius.d) == 0 && this.e == adaptiveRadius.e && this.f == adaptiveRadius.f && this.g == adaptiveRadius.g;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + (Float.floatToIntBits(this.d) * 31)) * 31;
            MapOverlayColor mapOverlayColor = this.f;
            int iHashCode2 = (iHashCode + (mapOverlayColor == null ? 0 : mapOverlayColor.hashCode())) * 31;
            IconType iconType = this.g;
            return iHashCode2 + (iconType != null ? iconType.hashCode() : 0);
        }

        public final String toString() {
            return "AdaptiveRadius(distanceFactorInMeters=" + this.d + ", overlayColor=" + this.e + ", borderColor=" + this.f + ", crosshairRes=" + this.g + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig$FixedRadius;", "Lapp/chalo/compose/components/chalomap/ChaloMapOverlayConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedRadius extends ChaloMapOverlayConfig {
        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: a */
        public final MapOverlayColor getB() {
            return null;
        }

        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: b */
        public final IconType getC() {
            return null;
        }

        @Override // app.chalo.compose.components.chalomap.ChaloMapOverlayConfig
        /* JADX INFO: renamed from: c */
        public final MapOverlayColor getF1871a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedRadius) && Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            Float.floatToIntBits(0.0f);
            throw null;
        }

        public final String toString() {
            return "FixedRadius(radius=0.0, overlayColor=null, borderColor=null, crosshairRes=null)";
        }
    }

    public ChaloMapOverlayConfig(MapOverlayColor mapOverlayColor, MapOverlayColor mapOverlayColor2, IconType iconType) {
        this.f1871a = mapOverlayColor;
        this.b = mapOverlayColor2;
        this.c = iconType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public MapOverlayColor getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public IconType getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public MapOverlayColor getF1871a() {
        return this.f1871a;
    }
}
