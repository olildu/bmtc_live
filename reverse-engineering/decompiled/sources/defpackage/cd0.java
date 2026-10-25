package defpackage;

import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.KeylinesKt;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.compose.components.chalomap.ChaloMapOverlayConfig;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.MapOverlayColor;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.location.LatLng;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11274a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ float d;

    public /* synthetic */ cd0(float f, Arrangement arrangement, float f2, int i) {
        this.f11274a = i;
        this.b = f;
        this.c = arrangement;
        this.d = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11274a) {
            case 0:
                return KeylinesKt.createLeftAlignedKeylineList$lambda$10(this.b, (Arrangement) this.c, this.d, (KeylineListScope) obj);
            case 1:
                return KeylinesKt.createCenterAlignedKeylineList$lambda$16(this.b, (Arrangement) this.c, this.d, (KeylineListScope) obj);
            default:
                LatLng latLng = (LatLng) this.c;
                BusesAroundYouDataState it = (BusesAroundYouDataState) obj;
                Intrinsics.i(it, "it");
                return BusesAroundYouDataState.a(it, false, false, NearbyBusesMapData.a(it.c, null, new MapCameraViewState.UpdatedState.ZoomToLatLng(latLng, this.b, 4), null, 11), new ChaloMapOverlayConfig.AdaptiveRadius(this.d, MapOverlayColor.OVERLAY_COLOR, MapOverlayColor.OVERLAY_BORDER_COLOR, null), null, null, 0L, 0L, false, 2035);
        }
    }

    public /* synthetic */ cd0(LatLng latLng, float f, float f2) {
        this.f11274a = 2;
        this.c = latLng;
        this.b = f;
        this.d = f2;
    }
}
