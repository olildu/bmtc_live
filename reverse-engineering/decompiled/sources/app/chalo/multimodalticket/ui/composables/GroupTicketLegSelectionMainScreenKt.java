package app.chalo.multimodalticket.ui.composables;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionViewState;
import app.chalo.multimodalticket.ui.TicketSelectionContainerUISpecs;
import app.chalo.multimodalticket.ui.TicketSelectionContainerUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.bottomsheet.BottomSheetRequestHandler;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.dq;
import defpackage.ox;
import defpackage.pk0;
import defpackage.t8;
import defpackage.u50;
import defpackage.w00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/multimodalticket/ui/GroupTicketLegSelectionViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketLegSelectionMainScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(727656682);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(groupTicketLegSelectionComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(727656682, i2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreen (GroupTicketLegSelectionMainScreen.kt:31)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(groupTicketLegSelectionComponent.t0(), composerStartRestartGroup);
            b((GroupTicketLegSelectionViewState) mutableStateA.getValue(), ModalBottomSheetKt.rememberModalBottomSheetState(((GroupTicketLegSelectionViewState) mutableStateA.getValue()).f.getF5961a().b.f, null, composerStartRestartGroup, 0, 2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(groupTicketLegSelectionComponent, i, 22));
        }
    }

    public static final void b(GroupTicketLegSelectionViewState state, SheetState modalBottomSheetState, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        GroupTicketLegSelectionBottomSheetUIStateType groupTicketLegSelectionBottomSheetUIStateType = state.f;
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-205178420);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-205178420, i3, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionScreen (GroupTicketLegSelectionMainScreen.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.b(state.b, null, null, composerStartRestartGroup, 0, 14);
            c(dq.a(columnScopeInstance, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), state.c, composerStartRestartGroup, 0);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), state.f5946a.f5945a), state.d);
            composerStartRestartGroup.endNode();
            LoadingDialogUIState loadingDialogUIState = state.e;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-731234645);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, -731234644, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            if (Intrinsics.d(groupTicketLegSelectionBottomSheetUIStateType, GroupTicketLegSelectionBottomSheetUIStateType.None.b)) {
                composerStartRestartGroup.startReplaceGroup(-733911370);
            } else {
                composerStartRestartGroup.startReplaceGroup(-731060331);
                BottomSheetRequestHandler bottomSheetRequestHandler = groupTicketLegSelectionBottomSheetUIStateType.getF5961a().b.g;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(bottomSheetRequestHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$3$1(0, bottomSheetRequestHandler, BottomSheetRequestHandler.class, "onDismissRequest", "onDismissRequest()V", 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, (Function0) ((KFunction) objRememberedValue), false, false, false, ComposableLambdaKt.rememberComposableLambda(1145663531, true, new u50(1, state, groupTicketLegSelectionBottomSheetUIStateType), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(state) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1(state, modalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(groupTicketLegSelectionBottomSheetUIStateType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(state, modalBottomSheetState, i, 25));
        }
    }

    public static final void c(Modifier modifier, TicketSelectionContainerUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        TicketSelectionContainerUISpecs ticketSelectionContainerUISpecs = state.f5955a;
        Composer composerStartRestartGroup = composer.startRestartGroup(817262035);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(817262035, i2, -1, "app.chalo.multimodalticket.ui.composables.TicketSelectionContainerComposable (GroupTicketLegSelectionMainScreen.kt:146)");
            }
            Modifier modifierC = ChaloThemeKt.c(ScrollKt.verticalScroll$default(modifier, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ticketSelectionContainerUISpecs.f5954a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), UiAlignmentKt.a(ticketSelectionContainerUISpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            FullJourneyTicketCardComposableKt.a(state.b, composerStartRestartGroup, 0);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            IndividualStepTicketCardComposableKt.a(state.c, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ox(modifier, state, i, 26));
        }
    }
}
