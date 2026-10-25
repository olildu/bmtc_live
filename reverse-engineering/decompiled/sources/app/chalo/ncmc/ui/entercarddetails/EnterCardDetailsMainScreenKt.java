package app.chalo.ncmc.ui.entercarddetails;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.o10;
import defpackage.w00;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/entercarddetails/EnterCardDetailsViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EnterCardDetailsMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(EnterCardDetailsComponent enterCardDetailsComponent, Composer composer, int i) {
        int i2;
        Object enterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1;
        Composer composerStartRestartGroup = composer.startRestartGroup(821646398);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(enterCardDetailsComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(821646398, i2, -1, "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsMainScreen (EnterCardDetailsMainScreen.kt:22)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(enterCardDetailsComponent.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester2 = (FocusRequester) objRememberedValue3;
            SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(enterCardDetailsComponent) | composerStartRestartGroup.changed(softwareKeyboardController) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                enterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1 = new EnterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1(enterCardDetailsComponent, softwareKeyboardController, coroutineScope, focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(enterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1);
            } else {
                enterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1 = objRememberedValue4;
            }
            EffectsKt.LaunchedEffect(enterCardDetailsComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) enterCardDetailsMainScreenKt$EnterCardDetailsMainScreen$1$1, composerStartRestartGroup, i2 & 14);
            EnterCardDetailsViewState enterCardDetailsViewState = (EnterCardDetailsViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(enterCardDetailsComponent);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new o10(enterCardDetailsComponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EnterCardDetailsScreenKt.d(enterCardDetailsViewState, (Function1) objRememberedValue5, softwareKeyboardController, focusRequester2, focusRequester, sheetStateRememberStandardBottomSheetState, composerStartRestartGroup, 27648);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(enterCardDetailsComponent, i, 14));
        }
    }
}
