package app.chalo.ncmc.ui.ncmcofflinerecharge;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.BackHandlerKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.fk0;
import defpackage.xs;
import defpackage.ym0;
import defpackage.zf0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OfflineCardRechargeMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(OfflineCardRechargeComponent offlineCardRechargeComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1373055287);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(offlineCardRechargeComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1373055287, i2, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeMainScreen (OfflineCardRechargeMainScreen.kt:21)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            MutableState mutableStateA = SubscribeAsStateKt.a(offlineCardRechargeComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(offlineCardRechargeComponent) | composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OfflineCardRechargeMainScreenKt$OfflineCardRechargeMainScreen$1$1(offlineCardRechargeComponent, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(offlineCardRechargeComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i2 & 14);
            boolean z = ((OfflineCardRechargeViewState) mutableStateA.getValue()).f6399a == OfflineRechargeScreenType.SUCCESS;
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changedInstance(offlineCardRechargeComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new zf0(19, offlineCardRechargeComponent, mutableStateA);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.a(z, (Function0) objRememberedValue4, 0, 0, composerStartRestartGroup, 2);
            OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(offlineCardRechargeComponent);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ym0(offlineCardRechargeComponent, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            OfflineCardRechargeScreenKt.a(offlineCardRechargeViewState, focusRequester, softwareKeyboardController, (Function1) objRememberedValue5, composerStartRestartGroup, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(offlineCardRechargeComponent, i, 6));
        }
    }
}
