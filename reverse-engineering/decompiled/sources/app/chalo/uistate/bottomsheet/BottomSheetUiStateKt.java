package app.chalo.uistate.bottomsheet;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.i4;
import defpackage.uc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetUiStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[UIModalBottomSheetValue.values().length];
            try {
                iArr[UIModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIModalBottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UIModalBottomSheetValue.HalfExpanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(Modifier modifier, BottomSheetUiState sheetUiState, SheetState sheetState, Function3 content, Composer composer, int i, int i2) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(sheetUiState, "sheetUiState");
        BottomSheetUiSpec bottomSheetUiSpec = sheetUiState.f9907a;
        BottomSheetEventHandler bottomSheetEventHandler = sheetUiState.b;
        Intrinsics.i(sheetState, "sheetState");
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-564677062);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetUiState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564677062, i3, -1, "app.chalo.uistate.bottomsheet.ModalBottomSheet (BottomSheetUiState.kt:92)");
            }
            BackHandlerKt.b(!bottomSheetEventHandler.c, composerStartRestartGroup, 0);
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(bottomSheetUiSpec.f9906a);
            long jC = ChaloColorTokenKt.c(bottomSheetUiSpec.b);
            ModalBottomSheetProperties modalBottomSheetProperties = new ModalBottomSheetProperties(bottomSheetEventHandler.c, bottomSheetEventHandler.d);
            boolean z = bottomSheetEventHandler.e;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new i4(sheetUiState, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8((Function0) objRememberedValue, companion, sheetState, 0.0f, z, roundedCornerShapeD, jC, 0L, 0.0f, 0L, null, null, modalBottomSheetProperties, content, composer2, ((i3 << 3) & 112) | (i3 & 896), ((i3 >> 9) & 14) | ((i3 >> 3) & 7168), 2952);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new uc(modifier2, sheetUiState, sheetState, content, i, i2, 0));
        }
    }
}
