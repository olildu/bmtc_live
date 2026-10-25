package app.chalo.kyc.min.ui.minkycdetails.composables;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.compose.utils.SafeFocusRequesterKt;
import app.chalo.kyc.min.ui.minkycdetails.DetailsStepProgressIndicatorUISpecs;
import app.chalo.kyc.min.ui.minkycdetails.DetailsStepProgressIndicatorUIState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsUISpecs;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsUIState;
import app.chalo.kyc.min.ui.minkycdetails.NameRegistrationUISpecs;
import app.chalo.kyc.min.ui.minkycdetails.NameRegistrationUIState;
import app.chalo.kyc.min.ui.minkycdetails.ProgressBarSpecs;
import app.chalo.kyc.min.ui.minkycdetails.StepCircleUISpecs;
import app.chalo.kyc.min.ui.minkycdetails.StepCircleUIState;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import defpackage.b3;
import defpackage.fc0;
import defpackage.pk0;
import defpackage.t8;
import defpackage.ug0;
import defpackage.wi0;
import defpackage.xi0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MinKycDetailsScreenUIKt {
    public static final void a(NameRegistrationUIState nameRegistrationUIState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(300414982);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nameRegistrationUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(300414982, i2, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.ChaloNameEnterTextField (MinKycDetailsScreenUI.kt:108)");
            }
            NameRegistrationUISpecs nameRegistrationUISpecs = nameRegistrationUIState.f4132a;
            Modifier modifierA = SafeFocusRequesterKt.a(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, nameRegistrationUISpecs.b), 0.0f, 1, null), safeFocusRequester, composerStartRestartGroup, i2 & 112);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nameRegistrationUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wi0(nameRegistrationUIState, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BaseChaloTextFieldKt.a(nameRegistrationUIState.d, ChaloThemeKt.c(BorderUISpecKt.a(FocusChangedModifierKt.onFocusChanged(modifierA, (Function1) objRememberedValue), nameRegistrationUISpecs.c), nameRegistrationUISpecs.d), null, null, null, null, composerStartRestartGroup, 0, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ug0(nameRegistrationUIState, safeFocusRequester, i, 8));
        }
    }

    public static final void b(DetailsStepProgressIndicatorUIState detailsStepProgressIndicatorUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1458094542);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(detailsStepProgressIndicatorUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1458094542, i2, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.DetailsStepProgressIndicator (MinKycDetailsScreenUI.kt:129)");
            }
            DetailsStepProgressIndicatorUISpecs detailsStepProgressIndicatorUISpecs = detailsStepProgressIndicatorUIState.f4118a;
            List list = detailsStepProgressIndicatorUIState.b;
            ProgressBarSpecs progressBarSpecs = detailsStepProgressIndicatorUIState.c;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(companion, detailsStepProgressIndicatorUISpecs.f4117a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(detailsStepProgressIndicatorUISpecs.b), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            e((StepCircleUIState) list.get(0), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(ChaloThemeKt.c(rowScopeInstance.align(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion, progressBarSpecs.f4133a), progressBarSpecs.b), UiAlignmentKt.b(progressBarSpecs.c)), progressBarSpecs.d), ChaloColorTokenKt.c(progressBarSpecs.e), ChaloThemeKt.d(progressBarSpecs.f)), composerStartRestartGroup, 0);
            e((StepCircleUIState) list.get(1), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(detailsStepProgressIndicatorUIState, i, 20));
        }
    }

    public static final void c(MinKycDetailsUIState viewState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        MinKycDetailsUISpecs minKycDetailsUISpecs = viewState.f4129a;
        Intrinsics.i(safeFocusRequester, "safeFocusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(190083763);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(190083763, i3, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.MinKycDetailsScreenUI (MinKycDetailsScreenUI.kt:41)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(minKycDetailsUISpecs.f4128a), null, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalA = UiArrangementKt.a(minKycDetailsUISpecs.b);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalA, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            LoadingDialogUIState loadingDialogUIState = viewState.b;
            if (loadingDialogUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1489281734);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                t8.m(composerStartRestartGroup, 1489281735, loadingDialogUIState, composerStartRestartGroup, 0);
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ChaloToolBarKt.b(viewState.c, null, null, composerStartRestartGroup, 0, 14);
            d(viewState, safeFocusRequester, composerStartRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endNode();
            if (b3.s(0, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h), 0.0f, 1, null), viewState.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xi0(viewState, safeFocusRequester, i, 0));
        }
    }

    public static final void d(MinKycDetailsUIState viewState, SafeFocusRequester safeFocusRequester, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        NameRegistrationUIState nameRegistrationUIState = viewState.d;
        Intrinsics.i(safeFocusRequester, "safeFocusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(22285236);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(safeFocusRequester) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(22285236, i2, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.NameRegistrationScreenUI (MinKycDetailsScreenUI.kt:79)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), nameRegistrationUIState.f4132a.f4131a);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            b(nameRegistrationUIState.b, composerStartRestartGroup, 0);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            TextKt.c(nameRegistrationUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            ChaloSpacersKt.g(composerStartRestartGroup, 0);
            a(nameRegistrationUIState, safeFocusRequester, composerStartRestartGroup, i2 & 112);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new xi0(viewState, safeFocusRequester, i, 1));
        }
    }

    public static final void e(StepCircleUIState viewState, Composer composer, int i) {
        int i2;
        Modifier modifierA;
        Intrinsics.i(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1346302770);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1346302770, i2, -1, "app.chalo.kyc.min.ui.minkycdetails.composables.StepCircle (MinKycDetailsScreenUI.kt:158)");
            }
            StepCircleUISpecs stepCircleUISpecs = viewState.f4135a;
            Alignment.Vertical verticalB = UiAlignmentKt.b(stepCircleUISpecs.f4134a);
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(modifier, stepCircleUISpecs.c), ChaloColorTokenKt.c(stepCircleUISpecs.d), ChaloThemeKt.d(UIShape.Circle.p));
            BorderUISpec borderUISpec = stepCircleUISpecs.e;
            if (borderUISpec != null && (modifierA = BorderUISpecKt.a(modifier, borderUISpec)) != null) {
                modifier = modifierA;
            }
            Modifier modifierThen = modifierM263backgroundbw27NRU.then(modifier);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(UiAlignmentKt.c(stepCircleUISpecs.b), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.c(viewState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            TextKt.c(viewState.c, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fc0(viewState, i, 21));
        }
    }
}
