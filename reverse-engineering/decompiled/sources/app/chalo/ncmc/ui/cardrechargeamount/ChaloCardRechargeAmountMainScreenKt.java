package app.chalo.ncmc.ui.cardrechargeamount;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.compose.BackHandlerKt;
import app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ch;
import defpackage.cj;
import defpackage.e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardRechargeAmountMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-66566915);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloCardRechargeAmountComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-66566915, i2, -1, "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountMainScreen (ChaloCardRechargeAmountMainScreen.kt:18)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(chaloCardRechargeAmountComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloCardRechargeAmountComponent) | composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ChaloCardRechargeAmountMainScreenKt$ChaloCardRechargeAmountMainScreen$1$1(chaloCardRechargeAmountComponent, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(chaloCardRechargeAmountComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i2 & 14);
            boolean zD = Intrinsics.d(((ChaloCardRechargeAmountViewState) mutableStateA.getValue()).j, CardRechargeAmountLayoutType.RechargeSuccess.f6288a);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(chaloCardRechargeAmountComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new cj(chaloCardRechargeAmountComponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(zD, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 2);
            ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState = (ChaloCardRechargeAmountViewState) mutableStateA.getValue();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(chaloCardRechargeAmountComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ch(chaloCardRechargeAmountComponent, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ChaloCardRechargeAmountScreenKt.b(chaloCardRechargeAmountViewState, (Function1) objRememberedValue3, softwareKeyboardController, sheetStateRememberStandardBottomSheetState, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloCardRechargeAmountComponent, i, 27));
        }
    }
}
