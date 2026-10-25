package defpackage;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qp0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19142a;
    public final /* synthetic */ PlotlineWidgetUIState b;

    public /* synthetic */ qp0(PlotlineWidgetUIState plotlineWidgetUIState, int i) {
        this.f19142a = i;
        this.b = plotlineWidgetUIState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19142a;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(849553078, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:233)");
                    }
                    PlotlineComposeWidgetKt.a(48, 0, composer, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.b.f10064a);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1038436558, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:271)");
                    }
                    PlotlineComposeWidgetKt.a(48, 0, composer, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.b.f10064a);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Intrinsics.i(item, "$this$item");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1189135126, iIntValue, -1, "app.chalo.productpurchase.productselection.ui.productSelectionSection.<anonymous>.<anonymous> (ProductSelectionScreen.kt:141)");
                    }
                    PlotlineComposeWidgetKt.a(0, 2, composer, null, this.b.f10064a);
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
