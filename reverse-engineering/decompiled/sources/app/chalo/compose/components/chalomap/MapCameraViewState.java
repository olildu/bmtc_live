package app.chalo.compose.components.chalomap;

import app.chalo.location.LatLng;
import defpackage.b3;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState;", "", "InitialState", "UpdatedState", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MapCameraViewState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState;", "CustomPosition", "CustomCameraUpdate", "NoState", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$CustomCameraUpdate;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$CustomPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$NoState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class InitialState extends MapCameraViewState {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$CustomCameraUpdate;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomCameraUpdate extends InitialState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MapCameraUpdate f1879a;

            public CustomCameraUpdate(MapCameraUpdate cameraUpdate) {
                Intrinsics.i(cameraUpdate, "cameraUpdate");
                this.f1879a = cameraUpdate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CustomCameraUpdate) && Intrinsics.d(this.f1879a, ((CustomCameraUpdate) obj).f1879a);
            }

            public final int hashCode() {
                return this.f1879a.hashCode();
            }

            public final String toString() {
                return "CustomCameraUpdate(cameraUpdate=" + this.f1879a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$CustomPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomPosition extends InitialState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LatLng f1880a;
            public final float b;

            public CustomPosition(LatLng location, float f, int i) {
                f = (i & 2) != 0 ? 10.0f : f;
                Intrinsics.i(location, "location");
                this.f1880a = location;
                this.b = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomPosition)) {
                    return false;
                }
                CustomPosition customPosition = (CustomPosition) obj;
                return Intrinsics.d(this.f1880a, customPosition.f1880a) && Float.compare(this.b, customPosition.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(0.0f) + r30.a(0.0f, r30.a(this.b, this.f1880a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return "CustomPosition(location=" + this.f1880a + ", zoomLevel=" + this.b + ", tilt=0.0, bearing=0.0)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState$NoState;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$InitialState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoState extends InitialState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NoState f1881a = new NoState();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState;", "BoundToCustomLatLngs", "CustomPosition", "ZoomToLatLng", "CustomCameraUpdate", "CameraPosition", "NoChange", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$BoundToCustomLatLngs;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CameraPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CustomCameraUpdate;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CustomPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$NoChange;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$ZoomToLatLng;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UpdatedState extends MapCameraViewState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1882a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$BoundToCustomLatLngs;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BoundToCustomLatLngs extends UpdatedState {
            public final ChaloMapLatLngBoundsDetails b;

            public BoundToCustomLatLngs(ChaloMapLatLngBoundsDetails chaloMapLatLngBoundsDetails) {
                super(true);
                this.b = chaloMapLatLngBoundsDetails;
            }

            @Override // app.chalo.compose.components.chalomap.MapCameraViewState.UpdatedState
            /* JADX INFO: renamed from: a */
            public final boolean getF1882a() {
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BoundToCustomLatLngs) && this.b.equals(((BoundToCustomLatLngs) obj).b);
            }

            public final int hashCode() {
                return (this.b.hashCode() * 31) + 1231;
            }

            public final String toString() {
                return "BoundToCustomLatLngs(latLngBoundsDetails=" + this.b + ", shouldAnimate=true)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CameraPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CameraPosition extends UpdatedState {
            public final AndroidMapCameraPosition b;

            public CameraPosition(AndroidMapCameraPosition androidMapCameraPosition) {
                super(true);
                this.b = androidMapCameraPosition;
            }

            @Override // app.chalo.compose.components.chalomap.MapCameraViewState.UpdatedState
            /* JADX INFO: renamed from: a */
            public final boolean getF1882a() {
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CameraPosition) && this.b.equals(((CameraPosition) obj).b);
            }

            public final int hashCode() {
                return (this.b.f1860a.hashCode() * 31) + 1231;
            }

            public final String toString() {
                return "CameraPosition(cameraPosition=" + this.b + ", shouldAnimate=true)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CustomCameraUpdate;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomCameraUpdate extends UpdatedState {
            public final MapCameraUpdate b;
            public final Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomCameraUpdate(MapCameraUpdate cameraUpdate, Long l) {
                super(true);
                Intrinsics.i(cameraUpdate, "cameraUpdate");
                this.b = cameraUpdate;
                this.c = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomCameraUpdate)) {
                    return false;
                }
                CustomCameraUpdate customCameraUpdate = (CustomCameraUpdate) obj;
                return Intrinsics.d(this.b, customCameraUpdate.b) && Intrinsics.d(this.c, customCameraUpdate.c);
            }

            public final int hashCode() {
                int iHashCode = this.b.hashCode() * 31;
                Long l = this.c;
                return ((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + 1231;
            }

            public final String toString() {
                return "CustomCameraUpdate(cameraUpdate=" + this.b + ", updatedTs=" + this.c + ", shouldAnimateUpdate=true)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$CustomPosition;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomPosition extends UpdatedState {
            public final LatLng b;
            public final float c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomPosition(LatLng location, float f) {
                super(true);
                Intrinsics.i(location, "location");
                this.b = location;
                this.c = f;
            }

            @Override // app.chalo.compose.components.chalomap.MapCameraViewState.UpdatedState
            /* JADX INFO: renamed from: a */
            public final boolean getF1882a() {
                return true;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CustomPosition)) {
                    return false;
                }
                CustomPosition customPosition = (CustomPosition) obj;
                return Intrinsics.d(this.b, customPosition.b) && Float.compare(this.c, customPosition.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0;
            }

            public final int hashCode() {
                return ((Float.floatToIntBits(0.0f) + r30.a(0.0f, r30.a(this.c, this.b.hashCode() * 31, 31), 31)) * 31) + 1231;
            }

            public final String toString() {
                return "CustomPosition(location=" + this.b + ", zoomLevel=" + this.c + ", tilt=0.0, bearing=0.0, shouldAnimate=true)";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$NoChange;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoChange extends UpdatedState {
            public static final NoChange b = new NoChange(false);
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState$ZoomToLatLng;", "Lapp/chalo/compose/components/chalomap/MapCameraViewState$UpdatedState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ZoomToLatLng extends UpdatedState {
            public final LatLng b;
            public final float c;
            public final boolean d;

            public /* synthetic */ ZoomToLatLng(LatLng latLng, float f, int i) {
                this(latLng, (i & 2) != 0 ? 15.0f : f, (i & 4) == 0);
            }

            @Override // app.chalo.compose.components.chalomap.MapCameraViewState.UpdatedState
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF1882a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ZoomToLatLng)) {
                    return false;
                }
                ZoomToLatLng zoomToLatLng = (ZoomToLatLng) obj;
                return Intrinsics.d(this.b, zoomToLatLng.b) && Float.compare(this.c, zoomToLatLng.c) == 0 && this.d == zoomToLatLng.d;
            }

            public final int hashCode() {
                return r30.a(this.c, this.b.hashCode() * 31, 31) + (this.d ? 1231 : 1237);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ZoomToLatLng(latLng=");
                sb.append(this.b);
                sb.append(", zoomLevel=");
                sb.append(this.c);
                sb.append(", shouldAnimate=");
                return b3.g(")", sb, this.d);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ZoomToLatLng(LatLng latLng, float f, boolean z) {
                super(z);
                Intrinsics.i(latLng, "latLng");
                this.b = latLng;
                this.c = f;
                this.d = z;
            }
        }

        public UpdatedState(boolean z) {
            this.f1882a = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF1882a() {
            return this.f1882a;
        }
    }
}
