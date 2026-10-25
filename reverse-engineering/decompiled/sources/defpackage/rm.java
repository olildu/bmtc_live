package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import app.chalo.compose.components.TextKt;
import app.chalo.uistate.dialog.DropDownMenuItemUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19222a;
    public final /* synthetic */ DropDownMenuItemUIState b;

    public /* synthetic */ rm(DropDownMenuItemUIState dropDownMenuItemUIState, int i) {
        this.f19222a = i;
        this.b = dropDownMenuItemUIState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19222a) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(23930838, iIntValue, -1, "app.chalo.compose.ToolbarDropDownAction.<anonymous>.<anonymous>.<anonymous> (ChaloToolBar.kt:360)");
                    }
                    TextKt.c(this.b.f9993a, null, null, null, composer, 0, 14);
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
                        ComposerKt.traceEventStart(366420654, iIntValue2, -1, "app.chalo.uistate.dialog.DropDownMenu.<anonymous>.<anonymous>.<anonymous> (DropDownMenuUIState.kt:69)");
                    }
                    TextKt.c(this.b.f9993a, null, null, null, composer2, 0, 14);
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
