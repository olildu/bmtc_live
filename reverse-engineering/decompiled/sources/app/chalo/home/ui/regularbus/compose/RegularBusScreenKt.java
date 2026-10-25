package app.chalo.home.ui.regularbus.compose;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.homescreen.data.model.app.RegularBusScreenConfigAppModel;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.h01;
import defpackage.k11;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RegularBusViewState;", "viewState", "", "isTabVisible", "", "initResetSignal", "hasRunInit", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RegularBusScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(RegularBusComponent regularBusComponent, RegularBusScreenConfigAppModel regularBusScreenConfigAppModel, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(regularBusScreenConfigAppModel, "regularBusScreenConfigAppModel");
        Intrinsics.i(homeScreenInfoHelper, "homeScreenInfoHelper");
        Composer composerStartRestartGroup = composer.startRestartGroup(-87653641);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(regularBusComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(regularBusScreenConfigAppModel) : composerStartRestartGroup.changedInstance(regularBusScreenConfigAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87653641, i2, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreen (RegularBusScreen.kt:26)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            MutableState mutableStateA = SubscribeAsStateKt.a(regularBusComponent.t0(), composerStartRestartGroup);
            Flow flow = regularBusComponent.t0;
            Boolean bool = Boolean.FALSE;
            State stateCollectAsState = SnapshotStateKt.collectAsState(flow, bool, null, composerStartRestartGroup, 48, 2);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(regularBusComponent.v0, null, composerStartRestartGroup, 0, 1);
            boolean zChanged = composerStartRestartGroup.changed(((Number) stateCollectAsState2.getValue()).intValue()) | composerStartRestartGroup.changed(regularBusComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(regularBusComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new k11(regularBusComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            HomeTabScreensRetainedData.RegularScreen regularScreen = ((RegularBusViewState) mutableStateA.getValue()).o;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(regularScreen != null ? regularScreen.f3174a : 0, composerStartRestartGroup, 0, 0);
            HomeTabScreensRetainedData.RegularScreen regularScreen2 = ((RegularBusViewState) mutableStateA.getValue()).o;
            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            Boolean boolValueOf = Boolean.valueOf(b(stateCollectAsState));
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new RegularBusScreenKt$RegularBusScreen$1$1(scrollStateRememberScrollState, stateCollectAsState, mutableStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(regularScreen2, numValueOf, boolValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, 0);
            Boolean bool2 = (Boolean) stateCollectAsState.getValue();
            bool2.getClass();
            boolean zChanged3 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(function1) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new RegularBusScreenKt$RegularBusScreen$2$1(function1, scrollStateRememberScrollState, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(scrollStateRememberScrollState, bool2, (Function2) objRememberedValue4, composerStartRestartGroup, 0);
            Boolean bool3 = (Boolean) stateCollectAsState.getValue();
            bool3.getClass();
            boolean zChanged4 = ((i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper))) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new RegularBusScreenKt$RegularBusScreen$3$1(homeScreenInfoHelper, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(bool3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            RegularBusScreenUIKt.l((RegularBusViewState) mutableStateA.getValue(), function1, sheetStateRememberModalBottomSheetState, scrollStateRememberScrollState, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            Boolean bool4 = (Boolean) stateCollectAsState.getValue();
            bool4.getClass();
            Integer numValueOf2 = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            boolean zChanged5 = composer2.changed(stateCollectAsState) | composer2.changed(mutableState) | composer2.changed(function1) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && composer2.changedInstance(regularBusScreenConfigAppModel)));
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                RegularBusScreenKt$RegularBusScreen$4$1 regularBusScreenKt$RegularBusScreen$4$1 = new RegularBusScreenKt$RegularBusScreen$4$1(function1, regularBusScreenConfigAppModel, stateCollectAsState, mutableState, null);
                composer2.updateRememberedValue(regularBusScreenKt$RegularBusScreen$4$1);
                objRememberedValue6 = regularBusScreenKt$RegularBusScreen$4$1;
            }
            EffectsKt.LaunchedEffect(regularBusComponent, bool4, numValueOf2, (Function2) objRememberedValue6, composer2, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h01(i, 1, regularBusComponent, regularBusScreenConfigAppModel, homeScreenInfoHelper));
        }
    }

    public static final boolean b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }
}
