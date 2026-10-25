package app.chalo.appUpdate.ui;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.appUpdate.ForceAppUpdateComponent;
import app.chalo.appUpdate.ForceAppUpdateSpecs;
import app.chalo.appUpdate.ForceAppUpdateUIState;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.text.TextUIState;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.pk0;
import defpackage.w00;
import defpackage.y40;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/appUpdate/ForceAppUpdateUIState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ForceAppUpdateScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ForceAppUpdateComponent forceAppUpdateComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-932486748);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(forceAppUpdateComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932486748, i2, -1, "app.chalo.appUpdate.ui.ForceAppUpdateScreen (ForceAppUpdateScreen.kt:24)");
            }
            b((ForceAppUpdateUIState) SubscribeAsStateKt.a(forceAppUpdateComponent.t0(), composerStartRestartGroup).getValue(), composerStartRestartGroup, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(forceAppUpdateComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new y40(forceAppUpdateComponent, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(forceAppUpdateComponent, i, 15));
        }
    }

    public static final void b(ForceAppUpdateUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-146601264);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-146601264, i2, -1, "app.chalo.appUpdate.ui.ForceAppUpdateScreenUI (ForceAppUpdateScreen.kt:37)");
            }
            ForceAppUpdateSpecs forceAppUpdateSpecs = state.f953a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), forceAppUpdateSpecs.c);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(forceAppUpdateSpecs.b), UiAlignmentKt.a(forceAppUpdateSpecs.f952a), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonImageKt.a(state.b, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloTextViewKt.a(ChaloThemeKt.c(companion, forceAppUpdateSpecs.d), state.c, null, null, composerStartRestartGroup, 0, 12);
            ChaloTextViewKt.a(ChaloThemeKt.c(companion, forceAppUpdateSpecs.e), state.d, null, null, composerStartRestartGroup, 0, 12);
            ChaloFilledButtonKt.a(0, 0, composerStartRestartGroup, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), forceAppUpdateSpecs.f), state.e);
            ChaloSpacersKt.a(forceAppUpdateSpecs.g, composerStartRestartGroup, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = state.f;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1601232482);
            } else {
                composerStartRestartGroup.startReplaceGroup(1601232483);
                ChaloTextViewKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), forceAppUpdateSpecs.h), chaloTextUIState, null, null, composerStartRestartGroup, 0, 12);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(state, i, 16));
        }
    }
}
