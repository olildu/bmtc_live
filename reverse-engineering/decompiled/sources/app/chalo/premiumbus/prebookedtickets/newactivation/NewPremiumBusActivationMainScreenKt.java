package app.chalo.premiumbus.prebookedtickets.newactivation;

import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import app.chalo.compose.BackHandlerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.premiumbus.prebookedtickets.ui.activation.PremiumBusActivationScreenBottomSheetTypes;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationComponent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.cn0;
import defpackage.fk0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationState;", RemoteConfigConstants.ResponseFieldKey.STATE, "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NewPremiumBusActivationMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent, Composer composer, int i) {
        int i2;
        final CoroutineScope coroutineScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906067657);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1906067657, i2, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMainScreen (NewPremiumBusActivationMainScreen.kt:23)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            final BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
            final BottomDrawerState bottomDrawerStateC = DrawerKt.c(BottomDrawerValue.Closed, composerStartRestartGroup);
            final MutableState mutableStateA = SubscribeAsStateKt.a(newPremiumBusReserveTicketActivationComponent.t0(), composerStartRestartGroup);
            boolean zChanged = composerStartRestartGroup.changed(mutableStateA) | composerStartRestartGroup.changed(bottomDrawerStateC) | composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationComponent) | composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState) | composerStartRestartGroup.changedInstance(coroutineScope2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                coroutineScope = coroutineScope2;
                Function0 function0 = new Function0() { // from class: app.chalo.premiumbus.prebookedtickets.newactivation.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        State state = mutableStateA;
                        PBStopDetailsZoomedImageState pBStopDetailsZoomedImageState = ((NewPremiumBusReserveTicketActivationState) state.getValue()).F;
                        boolean zD = Intrinsics.d(pBStopDetailsZoomedImageState, PBStopDetailsZoomedImageState.Hide.f7940a);
                        NewPremiumBusReserveTicketActivationComponent newPremiumBusReserveTicketActivationComponent2 = newPremiumBusReserveTicketActivationComponent;
                        if (zD) {
                            if (bottomDrawerStateC.c.getValue() != BottomDrawerValue.Closed) {
                                PremiumBusActivationScreenBottomSheetTypes premiumBusActivationScreenBottomSheetTypes = ((NewPremiumBusReserveTicketActivationState) state.getValue()).j;
                                if (premiumBusActivationScreenBottomSheetTypes != null && premiumBusActivationScreenBottomSheetTypes.f7356a) {
                                    newPremiumBusReserveTicketActivationComponent2.H0(NewPremiumBusReserveTicketActivationIntent.HideBottomSheetIntent.f7372a);
                                }
                            } else {
                                BottomSheetScaffoldState bottomSheetScaffoldState = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
                                if (bottomSheetScaffoldState.getBottomSheetState().getCurrentValue() == SheetValue.Expanded) {
                                    BuildersKt.d(coroutineScope, null, null, new NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$1$1$1(bottomSheetScaffoldState, null), 3);
                                } else {
                                    newPremiumBusReserveTicketActivationComponent2.H0(NewPremiumBusReserveTicketActivationIntent.OnBackPressedIntent.f7379a);
                                }
                            }
                        } else {
                            if (!(pBStopDetailsZoomedImageState instanceof PBStopDetailsZoomedImageState.Show)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            newPremiumBusReserveTicketActivationComponent2.H0(NewPremiumBusReserveTicketActivationIntent.OnImageDialogDismissed.f7380a);
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function0);
                objRememberedValue2 = function0;
            } else {
                coroutineScope = coroutineScope2;
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationComponent) | composerStartRestartGroup.changed(bottomDrawerStateC) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new NewPremiumBusActivationMainScreenKt$NewPremiumBusActivationMainScreen$2$1(newPremiumBusReserveTicketActivationComponent, bottomDrawerStateC, coroutineScope, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(newPremiumBusReserveTicketActivationComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i2 & 14);
            NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) mutableStateA.getValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(newPremiumBusReserveTicketActivationComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new cn0(newPremiumBusReserveTicketActivationComponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            NewPremiumBusReserveTicketActivationScreenKt.c(newPremiumBusReserveTicketActivationState, bottomSheetScaffoldStateRememberBottomSheetScaffoldState, bottomDrawerStateC, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(newPremiumBusReserveTicketActivationComponent, i, 5));
        }
    }
}
