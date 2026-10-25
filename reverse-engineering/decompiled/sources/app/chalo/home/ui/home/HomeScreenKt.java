package app.chalo.home.ui.home;

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
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.d80;
import defpackage.e40;
import defpackage.ir;
import defpackage.q70;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/home/ui/home/HomeScreenViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "isTabVisible", "", "initResetSignal", "hasRunInit", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(HomeScreenComponent homeScreenComponent, HomeScreenAppModel homeScreenAppModel, HomeScreenInfoHelper homeScreenInfoHelper, Composer composer, int i) {
        int i2;
        boolean z;
        Function1 function1;
        Continuation continuation;
        State state;
        Intrinsics.i(homeScreenAppModel, "homeScreenAppModel");
        Intrinsics.i(homeScreenInfoHelper, "homeScreenInfoHelper");
        Composer composerStartRestartGroup = composer.startRestartGroup(-186132566);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(homeScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(homeScreenAppModel) : composerStartRestartGroup.changedInstance(homeScreenAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(homeScreenInfoHelper) : composerStartRestartGroup.changedInstance(homeScreenInfoHelper) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186132566, i2, -1, "app.chalo.home.ui.home.HomeScreen (HomeScreen.kt:23)");
            }
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            MutableState mutableStateA = SubscribeAsStateKt.a(homeScreenComponent.t0(), composerStartRestartGroup);
            Flow flow = homeScreenComponent.h0;
            Boolean bool = Boolean.FALSE;
            State stateCollectAsState = SnapshotStateKt.collectAsState(flow, bool, null, composerStartRestartGroup, 48, 2);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(homeScreenComponent.j0, null, composerStartRestartGroup, 0, 1);
            boolean zChanged = composerStartRestartGroup.changed(((Number) stateCollectAsState2.getValue()).intValue()) | composerStartRestartGroup.changed(homeScreenComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(homeScreenComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new d80(homeScreenComponent, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function2 = (Function1) objRememberedValue2;
            Boolean bool2 = (Boolean) stateCollectAsState.getValue();
            bool2.getClass();
            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            boolean zChanged2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(homeScreenAppModel))) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                z = true;
                function1 = function2;
                continuation = null;
                HomeScreenKt$HomeScreen$1$1 homeScreenKt$HomeScreen$1$1 = new HomeScreenKt$HomeScreen$1$1(function1, homeScreenAppModel, stateCollectAsState, mutableState, null);
                state = stateCollectAsState;
                composerStartRestartGroup.updateRememberedValue(homeScreenKt$HomeScreen$1$1);
                objRememberedValue3 = homeScreenKt$HomeScreen$1$1;
            } else {
                state = stateCollectAsState;
                continuation = null;
                z = true;
                function1 = function2;
            }
            int i3 = i2 & 14;
            Function1 function3 = function1;
            EffectsKt.LaunchedEffect(homeScreenComponent, bool2, numValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, i3);
            Boolean bool3 = (Boolean) state.getValue();
            bool3.getClass();
            boolean zChanged3 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changedInstance(homeScreenComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new HomeScreenKt$HomeScreen$2$1(homeScreenComponent, state, continuation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(homeScreenComponent, bool3, (Function2) objRememberedValue4, composerStartRestartGroup, i3);
            Boolean bool4 = (Boolean) state.getValue();
            bool4.getClass();
            PremiumBusBookingCardData premiumBusBookingCardData = ((HomeScreenViewState) mutableStateA.getValue()).g;
            TitoRideDataAppModel titoRideDataAppModel = ((HomeScreenViewState) mutableStateA.getValue()).m;
            boolean zChanged4 = composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(mutableStateA);
            int i4 = i2 & 896;
            boolean z2 = zChanged4 | ((i4 == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper))) ? z : false);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new HomeScreenKt$HomeScreen$3$1(homeScreenInfoHelper, state, mutableStateA, continuation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
            int i5 = i2;
            EffectsKt.LaunchedEffect(bool4, premiumBusBookingCardData, titoRideDataAppModel, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
            if (((HomeScreenViewState) mutableStateA.getValue()).q) {
                composerStartRestartGroup.startReplaceGroup(-270590207);
                boolean zChanged5 = composerStartRestartGroup.changed(function3);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new q70(function3, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ChaloLoadingDialogKt.b(null, true, (Function0) objRememberedValue6, composerStartRestartGroup, 48, 1);
            } else {
                composerStartRestartGroup.startReplaceGroup(-273277256);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = ((HomeScreenViewState) mutableStateA.getValue()).r;
            boolean zChanged6 = composerStartRestartGroup.changed(function3);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new q70(function3, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            BackHandlerKt.a(z3, (Function0) objRememberedValue7, 0, 0, composerStartRestartGroup, 2);
            HomeScreenViewState homeScreenViewState = (HomeScreenViewState) mutableStateA.getValue();
            boolean z4 = (i4 == 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(homeScreenInfoHelper))) ? z : false;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new e40(homeScreenInfoHelper, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            HomeTabScaffoldKt.f(homeScreenViewState, function3, sheetStateRememberModalBottomSheetState, new HomeTabCallbacks((Function1) objRememberedValue8), ((Boolean) state.getValue()).booleanValue(), ((Number) stateCollectAsState2.getValue()).intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 10, homeScreenComponent, homeScreenAppModel, homeScreenInfoHelper));
        }
    }
}
