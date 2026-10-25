package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.uistate.image.ImageUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iq implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17082a;
    public final /* synthetic */ ImageUIState b;

    public /* synthetic */ iq(ImageUIState imageUIState, int i) {
        this.f17082a = i;
        this.b = imageUIState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f17082a) {
            case 0:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-694044339, iIntValue, -1, "app.chalo.compose.components.CommonFromAndToSelection.<anonymous>.<anonymous> (CommonFromAndToSelection.kt:79)");
                    }
                    CommonImageKt.a(this.b, null, false, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(modifier, "modifier");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer2.changed(modifier) ? 4 : 2;
                }
                if (composer2.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-549946035, iIntValue2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionItemComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupTicketPassengerSelectionBottomSheetComposable.kt:136)");
                    }
                    CommonImageKt.a(this.b, modifier, false, composer2, (iIntValue2 << 3) & 112, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
