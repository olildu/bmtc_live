package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapMarkerUIState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMapMarkerInfoWindowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19754a;
    public final /* synthetic */ PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState b;

    public /* synthetic */ uk(PBStopDetailsMapMarkerUIState.PBStopDetailMapMarkerInfoWindowUIState pBStopDetailMapMarkerInfoWindowUIState, int i) {
        this.f19754a = i;
        this.b = pBStopDetailMapMarkerInfoWindowUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19754a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(490065577, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getPBStopDetailsMapMarkerInfoWindow.<anonymous>.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:67)");
                    }
                    PBStopDetailsMapMarkerInfoWindowKt.a(this.b, null, composer, 0);
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
                        ComposerKt.traceEventStart(-520444330, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getPBStopDetailsMapMarkerInfoWindow.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:66)");
                    }
                    InfoWindowKt.a(composer, 6, ComposableLambdaKt.rememberComposableLambda(490065577, true, new uk(this.b, 0), composer, 54));
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
