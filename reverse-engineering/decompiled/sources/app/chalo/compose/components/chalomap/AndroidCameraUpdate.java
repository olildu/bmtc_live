package app.chalo.compose.components.chalomap;

import com.google.android.gms.maps.CameraUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/AndroidCameraUpdate;", "Lapp/chalo/compose/components/chalomap/MapCameraUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class AndroidCameraUpdate implements MapCameraUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraUpdate f1859a;

    public AndroidCameraUpdate(CameraUpdate gCameraUpdate) {
        Intrinsics.i(gCameraUpdate, "gCameraUpdate");
        this.f1859a = gCameraUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidCameraUpdate) && Intrinsics.d(this.f1859a, ((AndroidCameraUpdate) obj).f1859a);
    }

    public final int hashCode() {
        return this.f1859a.hashCode();
    }

    public final String toString() {
        return "AndroidCameraUpdate(gCameraUpdate=" + this.f1859a + ")";
    }
}
