package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import app.chalo.titoridedetail.ui.compose.TitoRideDetailsScreenStopMarker;
import app.chalo.titoridedetail.ui.compose.TitoStopInfoWindowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19666a;
    public final /* synthetic */ TitoRideDetailsScreenStopMarker.TitoRideDetailsScreenStopMarkerInfoWindowData b;

    public /* synthetic */ tk(TitoRideDetailsScreenStopMarker.TitoRideDetailsScreenStopMarkerInfoWindowData titoRideDetailsScreenStopMarkerInfoWindowData, int i) {
        this.f19666a = i;
        this.b = titoRideDetailsScreenStopMarkerInfoWindowData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19666a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1548607589, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getTitoRideDetailsScreenStopMarkerInfoWindow.<anonymous>.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:77)");
                    }
                    TitoRideDetailsScreenStopMarker.TitoRideDetailsScreenStopMarkerInfoWindowData titoRideDetailsScreenStopMarkerInfoWindowData = this.b;
                    TitoStopInfoWindowKt.b(titoRideDetailsScreenStopMarkerInfoWindowData.f9731a, titoRideDetailsScreenStopMarkerInfoWindowData.b, titoRideDetailsScreenStopMarkerInfoWindowData.c, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1951138488, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getTitoRideDetailsScreenStopMarkerInfoWindow.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:76)");
                    }
                    InfoWindowKt.a(composer, 6, ComposableLambdaKt.rememberComposableLambda(-1548607589, true, new tk(this.b, 0), composer, 54));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
