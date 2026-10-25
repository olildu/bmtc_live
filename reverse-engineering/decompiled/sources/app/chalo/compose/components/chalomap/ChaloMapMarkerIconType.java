package app.chalo.compose.components.chalomap;

import app.chalo.providers.iconassetprovider.IconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType;", "", "DrawableRes", "BitmapRes", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType$BitmapRes;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType$DrawableRes;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloMapMarkerIconType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType$BitmapRes;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BitmapRes extends ChaloMapMarkerIconType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlatformMapMarkerBitmap f1866a;

        public BitmapRes(PlatformMapMarkerBitmap bitmap) {
            Intrinsics.i(bitmap, "bitmap");
            this.f1866a = bitmap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BitmapRes) && Intrinsics.d(this.f1866a, ((BitmapRes) obj).f1866a);
        }

        public final int hashCode() {
            return this.f1866a.hashCode();
        }

        public final String toString() {
            return "BitmapRes(bitmap=" + this.f1866a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType$DrawableRes;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerIconType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrawableRes extends ChaloMapMarkerIconType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconType f1867a;

        public DrawableRes(IconType iconType) {
            Intrinsics.i(iconType, "iconType");
            this.f1867a = iconType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DrawableRes) && this.f1867a == ((DrawableRes) obj).f1867a;
        }

        public final int hashCode() {
            return this.f1867a.hashCode();
        }

        public final String toString() {
            return "DrawableRes(iconType=" + this.f1867a + ")";
        }
    }
}
