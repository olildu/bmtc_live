package app.chalo.ncmc.ui.landing;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import app.chalo.compose.BackHandlerKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ch;
import defpackage.e0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardInfoViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardInfoMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ChaloCardInfoComponent chaloCardInfoComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1280110948);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloCardInfoComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280110948, i2, -1, "app.chalo.ncmc.ui.landing.ChaloCardInfoMainScreen (ChaloCardInfoMainScreen.kt:18)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final MutableState mutableStateA = SubscribeAsStateKt.a(chaloCardInfoComponent.t0(), composerStartRestartGroup);
            final SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloCardInfoComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ChaloCardInfoMainScreenKt$ChaloCardInfoMainScreen$1$1(chaloCardInfoComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(chaloCardInfoComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            boolean z = sheetStateRememberStandardBottomSheetState.isVisible() || ((ChaloCardInfoViewState) mutableStateA.getValue()).i == ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS;
            boolean zChanged = composerStartRestartGroup.changed(sheetStateRememberStandardBottomSheetState) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changedInstance(chaloCardInfoComponent);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: app.chalo.ncmc.ui.landing.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        SheetState sheetState = sheetStateRememberStandardBottomSheetState;
                        if (sheetState.isVisible()) {
                            BuildersKt.d(coroutineScope, null, null, new ChaloCardInfoMainScreenKt$ChaloCardInfoMainScreen$2$1$1$1(sheetState, null), 3);
                        } else if (((ChaloCardInfoViewState) mutableStateA.getValue()).i == ChaloCardInfoScreenLayoutType.SINGLE_CARD_DETAILS) {
                            chaloCardInfoComponent.L0(ChaloCardInfoIntent.NavigateBackToAllCards.f6353a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.a(z, (Function0) objRememberedValue3, 0, 0, composerStartRestartGroup, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(chaloCardInfoComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ch(chaloCardInfoComponent, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloCardInfoScreenKt.a(chaloCardInfoViewState, (Function1) objRememberedValue4, sheetStateRememberStandardBottomSheetState, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloCardInfoComponent, i, 25));
        }
    }
}
