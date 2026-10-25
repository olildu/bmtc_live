package app.chalo.compose.components.chalomap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapCameraPositionStateData;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloMapCameraPositionStateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1862a;
    public final AndroidCameraMoveReason b;
    public final MapProjection c;
    public final AndroidMapCameraPosition d;

    public ChaloMapCameraPositionStateData(boolean z, AndroidCameraMoveReason androidCameraMoveReason, AndroidMapProjection androidMapProjection, AndroidMapCameraPosition androidMapCameraPosition) {
        this.f1862a = z;
        this.b = androidCameraMoveReason;
        this.c = androidMapProjection;
        this.d = androidMapCameraPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloMapCameraPositionStateData)) {
            return false;
        }
        ChaloMapCameraPositionStateData chaloMapCameraPositionStateData = (ChaloMapCameraPositionStateData) obj;
        return this.f1862a == chaloMapCameraPositionStateData.f1862a && this.b.equals(chaloMapCameraPositionStateData.b) && Intrinsics.d(this.c, chaloMapCameraPositionStateData.c) && this.d.equals(chaloMapCameraPositionStateData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.f1858a.hashCode() + ((this.f1862a ? 1231 : 1237) * 31)) * 31;
        MapProjection mapProjection = this.c;
        return this.d.f1860a.hashCode() + ((iHashCode + (mapProjection == null ? 0 : mapProjection.hashCode())) * 31);
    }

    public final String toString() {
        return "ChaloMapCameraPositionStateData(isMoving=" + this.f1862a + ", cameraMoveStartedReason=" + this.b + ", projection=" + this.c + ", position=" + this.d + ")";
    }
}
