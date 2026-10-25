package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19315a;
    public final /* synthetic */ ImageUIState b;

    public /* synthetic */ sm(ImageUIState imageUIState, int i) {
        this.f19315a = i;
        this.b = imageUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19315a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-119648053, iIntValue, -1, "app.chalo.compose.ChaloToolBarNew.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChaloToolBar.kt:87)");
                    }
                    CommonImageKt.a(this.b, null, false, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(510345750, iIntValue2, -1, "app.chalo.userprofile.ui.minprofileupdate.compose.AgeInputField.<anonymous>.<anonymous>.<anonymous> (MinProfileUpdateScreen.kt:331)");
                    }
                    CommonImageKt.a(this.b, null, false, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2011990231, iIntValue3, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionToolBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusProductSelectionScreen.kt:147)");
                    }
                    CommonImageKt.a(this.b, null, false, composer3, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(162379909, iIntValue4, -1, "app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionToolBar.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusProductSelectionScreen.kt:189)");
                    }
                    CommonImageKt.a(this.b, null, false, composer4, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1066954371, iIntValue5, -1, "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionToolBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:752)");
                    }
                    CommonImageKt.a(this.b, null, false, composer5, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1100148838, iIntValue6, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.StopSearchInputTextField.<anonymous>.<anonymous> (StopListView.kt:92)");
                    }
                    CommonImageKt.a(this.b, null, false, composer6, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                break;
            default:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1635649240, iIntValue7, -1, "app.chalo.compose.components.text.TextFieldWithError.<anonymous>.<anonymous>.<anonymous> (TextFieldWithError.kt:25)");
                    }
                    CommonImageKt.a(this.b, null, false, composer7, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
