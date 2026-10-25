package app.chalo.home.ui.chalobus;

import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.s4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"", "isTabVisible", "", "initResetSignal", "hasRunInit", "Lapp/chalo/home/ui/chalobus/ChaloBusViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ChaloBusComponent chaloBusComponent, ChaloBusAppModel chaloBusAppModel, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        Object chaloBusScreenKt$ChaloBusScreen$1$1;
        State state;
        ChaloBusComponent chaloBusComponent2;
        SheetState sheetState;
        SheetState sheetState2;
        State state2;
        Intrinsics.i(chaloBusAppModel, "chaloBusAppModel");
        Intrinsics.i(homeScreenInfoHelper, "homeScreenInfoHelper");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1082931664);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chaloBusAppModel) : composerStartRestartGroup.changedInstance(chaloBusAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1082931664, i2, -1, "app.chalo.home.ui.chalobus.ChaloBusScreen (ChaloBusScreen.kt:24)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Flow flow = chaloBusComponent.k0;
            Boolean bool = Boolean.FALSE;
            State stateCollectAsState = SnapshotStateKt.collectAsState(flow, bool, null, composerStartRestartGroup, 48, 2);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(chaloBusComponent.o0, null, composerStartRestartGroup, 0, 1);
            boolean zChanged = composerStartRestartGroup.changed(((Number) stateCollectAsState2.getValue()).intValue()) | composerStartRestartGroup.changed(chaloBusComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Boolean bool2 = (Boolean) stateCollectAsState.getValue();
            bool2.booleanValue();
            int i3 = i2 & 896;
            boolean zChanged2 = (i3 == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper))) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(chaloBusComponent) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                state = stateCollectAsState;
                chaloBusComponent2 = chaloBusComponent;
                sheetState = sheetStateRememberModalBottomSheetState;
                chaloBusScreenKt$ChaloBusScreen$1$1 = new ChaloBusScreenKt$ChaloBusScreen$1$1(chaloBusComponent2, state, sheetState, coroutineScope, homeScreenInfoHelper, null);
                composerStartRestartGroup.updateRememberedValue(chaloBusScreenKt$ChaloBusScreen$1$1);
            } else {
                state = stateCollectAsState;
                chaloBusComponent2 = chaloBusComponent;
                sheetState = sheetStateRememberModalBottomSheetState;
                chaloBusScreenKt$ChaloBusScreen$1$1 = objRememberedValue3;
            }
            int i4 = i2 & 14;
            EffectsKt.LaunchedEffect(chaloBusComponent2, bool2, (Function2) chaloBusScreenKt$ChaloBusScreen$1$1, composerStartRestartGroup, i4);
            Boolean bool3 = (Boolean) state.getValue();
            bool3.getClass();
            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            boolean zChanged3 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(chaloBusComponent2) | (((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(chaloBusAppModel))) ? r3 : false);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                SheetState sheetState3 = sheetState;
                State state3 = state;
                sheetState2 = sheetState3;
                ChaloBusScreenKt$ChaloBusScreen$2$1 chaloBusScreenKt$ChaloBusScreen$2$1 = new ChaloBusScreenKt$ChaloBusScreen$2$1(chaloBusComponent2, chaloBusAppModel, state3, mutableState, null);
                state2 = state3;
                composerStartRestartGroup.updateRememberedValue(chaloBusScreenKt$ChaloBusScreen$2$1);
                objRememberedValue4 = chaloBusScreenKt$ChaloBusScreen$2$1;
            } else {
                state2 = state;
                sheetState2 = sheetState;
            }
            EffectsKt.LaunchedEffect(chaloBusComponent, bool3, numValueOf, (Function2) objRememberedValue4, composerStartRestartGroup, i4);
            SheetValue currentValue = sheetState2.getCurrentValue();
            boolean zChanged4 = composerStartRestartGroup.changed(sheetState2) | composerStartRestartGroup.changedInstance(chaloBusComponent);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ChaloBusScreenKt$ChaloBusScreen$3$1(sheetState2, chaloBusComponent, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(currentValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            Boolean bool4 = (Boolean) state2.getValue();
            bool4.getClass();
            boolean zChanged5 = composerStartRestartGroup.changed(state2) | (i3 == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper)));
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ChaloBusScreenKt$ChaloBusScreen$4$1(r5, state2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(bool4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, 0);
            ChaloBusViewState chaloBusViewState = (ChaloBusViewState) SubscribeAsStateKt.a(chaloBusComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusComponent);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                ChaloBusScreenKt$ChaloBusScreen$5$1 chaloBusScreenKt$ChaloBusScreen$5$1 = new ChaloBusScreenKt$ChaloBusScreen$5$1(1, chaloBusComponent, ChaloBusComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloBusScreenKt$ChaloBusScreen$5$1);
                objRememberedValue7 = chaloBusScreenKt$ChaloBusScreen$5$1;
            }
            ChaloBusScreenUIKt.g(chaloBusComponent, chaloBusViewState, (Function1) ((KFunction) objRememberedValue7), sheetState2, ((Boolean) state2.getValue()).booleanValue(), ((Number) stateCollectAsState2.getValue()).intValue(), composerStartRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 9, chaloBusComponent, chaloBusAppModel, homeScreenInfoHelper));
        }
    }
}
