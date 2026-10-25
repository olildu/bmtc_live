package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.chalomap.InfoWindowKt;
import app.chalo.premiumbus.ui.changestop.ChangeStopMapMarkerUIState;
import app.chalo.premiumbus.ui.changestop.compose.ChangeStopMapMarkerInfoWindowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19936a;
    public final /* synthetic */ ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState b;

    public /* synthetic */ wk(ChangeStopMapMarkerUIState.ChangeStopStopMarkerInfoWindowUIState changeStopStopMarkerInfoWindowUIState, int i) {
        this.f19936a = i;
        this.b = changeStopStopMarkerInfoWindowUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19936a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1900956271, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getChangeStopMapMarkerInfoWindow.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:103)");
                    }
                    InfoWindowKt.a(composer, 6, ComposableLambdaKt.rememberComposableLambda(1067188068, true, new wk(this.b, 1), composer, 54));
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
                        ComposerKt.traceEventStart(1067188068, iIntValue, -1, "app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid.getChangeStopMapMarkerInfoWindow.<anonymous>.<anonymous> (ChaloMapMarkerInfoWindowProvider.android.kt:104)");
                    }
                    ChangeStopMapMarkerInfoWindowKt.a(this.b, null, composer, 8);
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
