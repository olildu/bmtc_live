package defpackage;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xo0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20039a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xo0(float f, int i, Object obj, Object obj2, Object obj3) {
        this.f20039a = i;
        this.c = obj;
        this.d = obj2;
        this.b = f;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20039a) {
            case 0:
                PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = (PremiumBusStopDetailsViewState) this.c;
                Function1 function1 = (Function1) this.d;
                MutableState mutableState = (MutableState) this.e;
                ColumnScope BottomSheetScaffold = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(BottomSheetScaffold, "$this$BottomSheetScaffold");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1766180360, iIntValue, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreen.<anonymous>.<anonymous> (PBStopDetailsMainScreen.kt:142)");
                    }
                    float f = this.b;
                    boolean zChanged = composer.changed(f);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new bm(f, mutableState, 2);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    PBStopDetailsMainScreenKt.a(premiumBusStopDetailsViewState, function1, (Function1) objRememberedValue, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                PremiumBusStopDetailsViewState premiumBusStopDetailsViewState2 = (PremiumBusStopDetailsViewState) this.c;
                Function1 function2 = (Function1) this.d;
                MutableState mutableState2 = (MutableState) this.e;
                PaddingValues it = (PaddingValues) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-583898782, iIntValue2, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsMainScreen.<anonymous>.<anonymous> (PBStopDetailsMainScreen.kt:153)");
                    }
                    PBStopDetailsMainScreenKt.e(SizeKt.m816heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7278constructorimpl(this.b - ((Dp) mutableState2.getValue()).m7292unboximpl()), 1, null), premiumBusStopDetailsViewState2, function2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Function2 function3 = (Function2) this.c;
                Shape shape = (Shape) this.d;
                Function3 function4 = (Function3) this.e;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1071907374, iIntValue3, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusCardBehindStrip.<anonymous> (PremiumBusFareDetailsCommonViews.kt:128)");
                    }
                    function3.invoke(composer3, 0);
                    ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), shape, this.b, 0.0f, function4, composer3, 6, 8);
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

    public /* synthetic */ xo0(float f, PremiumBusStopDetailsViewState premiumBusStopDetailsViewState, Function1 function1, MutableState mutableState) {
        this.f20039a = 1;
        this.b = f;
        this.c = premiumBusStopDetailsViewState;
        this.d = function1;
        this.e = mutableState;
    }
}
