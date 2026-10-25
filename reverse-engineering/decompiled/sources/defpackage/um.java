package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.TextKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class um implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19759a;
    public final /* synthetic */ ToolbarUIState b;

    public /* synthetic */ um(ToolbarUIState toolbarUIState, int i) {
        this.f19759a = i;
        this.b = toolbarUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19759a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1582665548, iIntValue, -1, "app.chalo.compose.ChaloToolBarUIWithRightComponent.<anonymous> (ChaloToolBar.kt:445)");
                    }
                    TextUIState textUIState = this.b.b;
                    if (textUIState == null) {
                        composer.startReplaceGroup(961663789);
                    } else {
                        composer.startReplaceGroup(961663790);
                        TextKt.c(textUIState, null, null, null, composer, 0, 14);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1070991190, iIntValue2, -1, "app.chalo.compose.ChaloToolBar.<anonymous> (ChaloToolBar.kt:130)");
                    }
                    TextUIState textUIState2 = this.b.b;
                    if (textUIState2 == null) {
                        composer2.startReplaceGroup(-1413471925);
                    } else {
                        composer2.startReplaceGroup(-1413471924);
                        TextKt.c(textUIState2, null, null, null, composer2, 0, 14);
                    }
                    composer2.endReplaceGroup();
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
