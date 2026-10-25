package defpackage;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.theme.ChaloTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ll implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18323a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TextStyle c;

    public /* synthetic */ ll(String str, TextStyle textStyle, int i) {
        this.f18323a = i;
        this.b = str;
        this.c = textStyle;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18323a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1584708072, iIntValue, -1, "app.chalo.compose.components.TextFieldWithClearButton.<anonymous> (ChaloSearchBarComposable.kt:115)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, this.c, composer, 0, 24960, 110590);
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
                        ComposerKt.traceEventStart(-255218205, iIntValue2, -1, "app.chalo.premiumbus.ui.stopdetails.PBStopSelectionField.<anonymous> (PBStopSelectionField.kt:52)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer2, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.c, composer2, 0, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1988507242, iIntValue3, -1, "app.chalo.premiumbus.ui.stopselection.compose.PBStopSelectionField.<anonymous> (PremiumBusStopSelectionScreen.kt:468)");
                    }
                    TextKt.m2623TextNvy7gAk(this.b, null, ChaloTheme.a(composer3, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.c, composer3, 0, 0, 131066);
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
