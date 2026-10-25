package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import app.chalo.home.ui.premiumbus.prebookedtickets.newactivation.PremiumBusStopInfoWindowKt;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusStopMarkerUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19844a;
    public final /* synthetic */ PremiumBusStopMarkerUIState.PBStopMarkerInfoWindowData b;

    public /* synthetic */ vk(PremiumBusStopMarkerUIState.PBStopMarkerInfoWindowData pBStopMarkerInfoWindowData, int i) {
        this.f19844a = i;
        this.b = pBStopMarkerInfoWindowData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19844a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1048041448, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getPBStopMarkerInfoWindow.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:88)");
                    }
                    InfoWindowKt.a(composer, 6, ComposableLambdaKt.rememberComposableLambda(-237612885, true, new vk(this.b, 1), composer, 54));
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
                        ComposerKt.traceEventStart(-237612885, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getPBStopMarkerInfoWindow.<anonymous>.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:89)");
                    }
                    PremiumBusStopMarkerUIState.PBStopMarkerInfoWindowData pBStopMarkerInfoWindowData = this.b;
                    StopLiveEtaUiModel stopLiveEtaUiModel = pBStopMarkerInfoWindowData.f7410a;
                    if (stopLiveEtaUiModel == null) {
                        composer.startReplaceGroup(-619312275);
                    } else {
                        composer.startReplaceGroup(-619312274);
                        PremiumBusStopInfoWindowKt.a(pBStopMarkerInfoWindowData.b, stopLiveEtaUiModel, composer, 0);
                    }
                    composer.endReplaceGroup();
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
