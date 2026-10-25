package app.chalo.home.ui.history.compose;

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
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.TicketsPageLayoutType;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.homescreen.data.model.app.TicketsPassesAppModel;
import app.zophop.homescreen.MyTicketsViewState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.qk0;
import defpackage.ug0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/zophop/homescreen/MyTicketsViewState;", "viewState", "", "isTabVisible", "", "initResetSignal", "hasRunInit", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MyTicketScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(MyTicketsComponent myTicketsComponent, TicketsPassesAppModel ticketsPassesAppModel, Composer composer, int i) {
        int i2;
        State state;
        boolean z;
        boolean z2;
        MyTicketsComponent myTicketsComponent2;
        MyTicketsComponent myTicketsComponent3 = myTicketsComponent;
        Intrinsics.i(ticketsPassesAppModel, "ticketsPassesAppModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-5533386);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(myTicketsComponent3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(ticketsPassesAppModel) : composerStartRestartGroup.changedInstance(ticketsPassesAppModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-5533386, i2, -1, "app.chalo.home.ui.history.compose.MyTicketsScreen (MyTicketScreen.kt:24)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(myTicketsComponent3.t0(), composerStartRestartGroup);
            Flow flow = myTicketsComponent3.o0;
            Boolean bool = Boolean.FALSE;
            State stateCollectAsState = SnapshotStateKt.collectAsState(flow, bool, null, composerStartRestartGroup, 48, 2);
            State stateCollectAsState2 = SnapshotStateKt.collectAsState(myTicketsComponent3.q0, null, composerStartRestartGroup, 0, 1);
            boolean zChanged = composerStartRestartGroup.changed(((Number) stateCollectAsState2.getValue()).intValue()) | composerStartRestartGroup.changed(myTicketsComponent3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(((MyTicketsViewState) mutableStateA.getValue()).k.getF3492a().b.f, null, composerStartRestartGroup, 0, 2);
            boolean zBooleanValue = ((Boolean) stateCollectAsState.getValue()).booleanValue();
            TicketsPageLayoutType layoutType = ((MyTicketsViewState) mutableStateA.getValue()).b;
            MyTicketBottomSheetUiState bottomSheetUiStateType = ((MyTicketsViewState) mutableStateA.getValue()).k;
            Intrinsics.i(layoutType, "layoutType");
            Intrinsics.i(bottomSheetUiStateType, "bottomSheetUiStateType");
            boolean z3 = zBooleanValue && (layoutType == TicketsPageLayoutType.NOTIFICATION_TURN_ON_EXPLAINER || !bottomSheetUiStateType.equals(MyTicketBottomSheetUiState.None.b));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(myTicketsComponent3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new qk0(myTicketsComponent3, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(z3, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 2);
            MyTicketsViewState myTicketsViewState = (MyTicketsViewState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(myTicketsComponent3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                state = stateCollectAsState;
                z = false;
                z2 = true;
                MyTicketScreenKt$MyTicketsScreen$2$1 myTicketScreenKt$MyTicketsScreen$2$1 = new MyTicketScreenKt$MyTicketsScreen$2$1(1, myTicketsComponent, MyTicketsComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/history/MyTicketsViewIntent;)V", 0);
                myTicketsComponent2 = myTicketsComponent;
                composerStartRestartGroup.updateRememberedValue(myTicketScreenKt$MyTicketsScreen$2$1);
                objRememberedValue3 = myTicketScreenKt$MyTicketsScreen$2$1;
            } else {
                myTicketsComponent2 = myTicketsComponent3;
                z2 = true;
                state = stateCollectAsState;
                z = false;
            }
            State state2 = state;
            MyTicketsScreenUIKt.e(myTicketsViewState, (Function1) ((KFunction) objRememberedValue3), sheetStateRememberModalBottomSheetState, ((Boolean) state.getValue()).booleanValue(), ((Number) stateCollectAsState2.getValue()).intValue(), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            Boolean bool2 = (Boolean) state2.getValue();
            bool2.getClass();
            Integer numValueOf = Integer.valueOf(((Number) stateCollectAsState2.getValue()).intValue());
            boolean zChanged2 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(myTicketsComponent2);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && composerStartRestartGroup.changedInstance(ticketsPassesAppModel))) {
                z = z2;
            }
            boolean z4 = zChanged2 | z;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                MyTicketScreenKt$MyTicketsScreen$3$1 myTicketScreenKt$MyTicketsScreen$3$1 = new MyTicketScreenKt$MyTicketsScreen$3$1(myTicketsComponent2, ticketsPassesAppModel, state2, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(myTicketScreenKt$MyTicketsScreen$3$1);
                objRememberedValue4 = myTicketScreenKt$MyTicketsScreen$3$1;
            }
            myTicketsComponent3 = myTicketsComponent;
            EffectsKt.LaunchedEffect(myTicketsComponent3, bool2, numValueOf, (Function2) objRememberedValue4, composerStartRestartGroup, i2 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(myTicketsComponent3, ticketsPassesAppModel, i, 29));
        }
    }
}
