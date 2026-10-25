package app.chalo.compose.components.bottomsheet;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.uistate.bottomsheet.BottomSheetUiStateKt;
import app.chalo.uistate.bottomsheet.TncBottomSheetUIState;
import defpackage.cg1;
import defpackage.ti1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TncBottomSheetKt {
    public static final void a(TncBottomSheetUIState state, SheetState sheetState, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Intrinsics.i(state, "state");
        Intrinsics.i(sheetState, "sheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1193190184);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1193190184, i2, -1, "app.chalo.compose.components.bottomsheet.TncBottomSheet (TncBottomSheet.kt:21)");
            }
            sheetState2 = sheetState;
            BottomSheetUiStateKt.a(null, state.d, sheetState2, ComposableLambdaKt.rememberComposableLambda(1091121328, true, new ti1(state, 1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 896) | 24576, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            sheetState2 = sheetState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(state, sheetState2, i, 12));
        }
    }
}
