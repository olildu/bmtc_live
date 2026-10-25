package app.chalo.premiumbus.ui.faredetails.compose;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetUiState;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.la0;
import defpackage.pk0;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusFareDetailsBottomSheetsKt {
    public static final void a(PremiumBusFareDetailsBottomSheetUiState sheet, Composer composer, int i) {
        int i2;
        Composer composer2;
        KFunction kFunction;
        Intrinsics.i(sheet, "sheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(804962128);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(sheet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(804962128, i2, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBottomSheet (PremiumBusFareDetailsBottomSheets.kt:21)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            if (sheet instanceof PremiumBusFareDetailsBottomSheetUiState.TncSection) {
                composerStartRestartGroup.startReplaceGroup(1824609026);
                UiEventHandler uiEventHandler = ((PremiumBusFareDetailsBottomSheetUiState.TncSection) sheet).c.f;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$1$1 premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$1$1 = new PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$1$1);
                    objRememberedValue = premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$1$1;
                }
                kFunction = (KFunction) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
            } else if (sheet instanceof PremiumBusFareDetailsBottomSheetUiState.FareNoteSection) {
                composerStartRestartGroup.startReplaceGroup(1824727074);
                UiEventHandler uiEventHandler2 = ((PremiumBusFareDetailsBottomSheetUiState.FareNoteSection) sheet).b.f;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uiEventHandler2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$2$1 premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$2$1 = new PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$2$1(0, uiEventHandler2, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$2$1);
                    objRememberedValue2 = premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$2$1;
                }
                kFunction = (KFunction) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(sheet instanceof PremiumBusFareDetailsBottomSheetUiState.FareValidationFailed)) {
                    throw pk0.p(composerStartRestartGroup, 474498132);
                }
                composerStartRestartGroup.startReplaceGroup(1824861955);
                UiEventHandler uiEventHandler3 = ((PremiumBusFareDetailsBottomSheetUiState.FareValidationFailed) sheet).d.f;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(uiEventHandler3);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$3$1 premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$3$1 = new PremiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$3$1(0, uiEventHandler3, UiEventHandler.class, "onClick", "onClick()V", 0);
                    composerStartRestartGroup.updateRememberedValue(premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$3$1);
                    objRememberedValue3 = premiumBusFareDetailsBottomSheetsKt$PremiumBusFareDetailsBottomSheet$onDismiss$3$1;
                }
                kFunction = (KFunction) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
            }
            ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8((Function0) kFunction, null, sheetStateRememberModalBottomSheetState, 0.0f, false, ChaloTheme.d(composerStartRestartGroup, 0).e, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1470713390, true, new la0(sheet, 19), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 3078, 7066);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zr0(sheet, i, 13));
        }
    }
}
