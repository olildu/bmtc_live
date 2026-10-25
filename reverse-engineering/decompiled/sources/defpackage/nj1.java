package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.ui.TITORideDetailBottomsheetType;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import app.chalo.titoridedetail.ui.compose.TitoRideDataScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nj1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18518a;
    public final /* synthetic */ TitoRideDetailsViewState b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ nj1(TitoRideDetailsViewState titoRideDetailsViewState, Function1 function1, int i) {
        this.f18518a = i;
        this.b = titoRideDetailsViewState;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        switch (this.f18518a) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1325183554, iIntValue, -1, "app.chalo.titoridedetail.ui.compose.MissedTapOutFeedbackScreen.<anonymous> (TitoRideDataScreen.kt:864)");
                    }
                    TITORideDetailBottomsheetType tITORideDetailBottomsheetType = this.b.c;
                    StringEnum stringEnum = StringEnum.TAP_OUT_SUCCESSFUL_TITLE;
                    StringEnum stringEnum2 = StringEnum.DONT_FORGET_TO_TAP_OUT_NEXT_TIME;
                    Function1 function1 = this.c;
                    boolean zChanged = composer.changed(function1);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new pb1(function1, 28);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChanged2 = composer.changed(function1);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new pb1(function1, 29);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    TitoRideDataScreenKt.p(tITORideDetailBottomsheetType, stringEnum, stringEnum2, function0, (Function0) objRememberedValue2, composer, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$BottomSheetScaffold");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(439112297, iIntValue2, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneSuccessScreen.<anonymous> (TitoRideDataScreen.kt:325)");
                    }
                    TitoRideDataScreenKt.g(Modifier.INSTANCE, this.b, this.c, composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$BottomSheetScaffold");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(768664430, iIntValue3, -1, "app.chalo.titoridedetail.ui.compose.TapInDoneErrorScreen.<anonymous> (TitoRideDataScreen.kt:360)");
                    }
                    TitoRideDataScreenKt.h(Modifier.INSTANCE, this.b, this.c, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
