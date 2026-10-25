package app.chalo.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.buttons.ChaloCircularBackButtonKt;
import app.chalo.compose.components.textfields.BaseChaloTextFieldKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.searchbar.SearchBarWithActionUISpecs;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.d0;
import defpackage.fj;
import defpackage.pk0;
import defpackage.s4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSearchBarComposableUIKt {
    public static final void a(Modifier modifier, SearchBarWithActionUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        SearchBarWithActionUISpecs searchBarWithActionUISpecs = state.f10069a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-28690579);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-28690579, i2, -1, "app.chalo.compose.components.ChaloSearchBarComposable (ChaloSearchBarComposableUI.kt:26)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ChaloRoundedCardKt.a(searchBarWithActionUISpecs.f10068a, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), searchBarWithActionUISpecs.b), ComposableLambdaKt.rememberComposableLambda(661957202, true, new d0(i3, state, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.c(composerStartRestartGroup, 6).b), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, state, i, 12));
        }
    }

    public static final void b(IconButtonUIState iconButtonUIState, CircularProgressIndicatorUIState circularProgressIndicatorUIState, ImageUISize size, Composer composer, int i) {
        int i2;
        Intrinsics.i(size, "size");
        Composer composerStartRestartGroup = composer.startRestartGroup(-952342583);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconButtonUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(circularProgressIndicatorUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(size) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-952342583, i2, -1, "app.chalo.compose.components.SearchBarTrailingIcon (ChaloSearchBarComposableUI.kt:84)");
            }
            if (circularProgressIndicatorUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1316223961);
                ChaloCircularProgressIndicatorKt.a(ImageUIStateKt.b(Modifier.INSTANCE, size), circularProgressIndicatorUIState, composerStartRestartGroup, i2 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (iconButtonUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(1316372048);
                    ChaloCircularBackButtonKt.b(iconButtonUIState, null, composerStartRestartGroup, i2 & 14, 2);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1313329305);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 19, iconButtonUIState, circularProgressIndicatorUIState, size));
        }
    }

    public static final void c(Modifier modifier, BaseTextFieldUIState.TextFieldUIState state, Function2 function2, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-162581023);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-162581023, i2, -1, "app.chalo.compose.components.TextFieldWithClearButton (ChaloSearchBarComposableUI.kt:71)");
            }
            BaseChaloTextFieldKt.a(state, modifier, null, function2, null, null, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | ((i2 << 6) & 57344), 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 20, modifier, state, function2));
        }
    }
}
