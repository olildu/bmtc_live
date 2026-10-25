package app.chalo.livetracking.stoptripplannerresult.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.OriginDestinationSearchbarSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerOriginDestinationSearchbarUiState;
import app.chalo.uistate.image.ImageUIState;
import defpackage.f0;
import defpackage.gf;
import defpackage.hi;
import defpackage.pk0;
import defpackage.u50;
import defpackage.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "fromCardRenderedHt", "toCardRenderedHt", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OriginDestinationSearchCardKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Modifier modifier, TripPlannerOriginDestinationSearchbarUiState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        Intrinsics.i(state, "state");
        SearchStopItemUiState searchStopItemUiState = state.e;
        SearchStopItemUiState searchStopItemUiState2 = state.d;
        OriginDestinationSearchbarSpecs originDestinationSearchbarSpecs = state.f4625a;
        Composer composerStartRestartGroup = composer.startRestartGroup(-840699375);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840699375, i3, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCard (OriginDestinationSearchCard.kt:57)");
            }
            boolean zChanged = composerStartRestartGroup.changed(searchStopItemUiState2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(searchStopItemUiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            float fM7278constructorimpl = Dp.m7278constructorimpl(Math.max(((Dp) mutableState.getValue()).m7292unboximpl(), ((Dp) mutableState2.getValue()).m7292unboximpl()));
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierHeight = IntrinsicKt.height(modifier4, IntrinsicSize.Min);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenterStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Modifier modifier5 = modifier4;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            boolean zChanged3 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new f0(density, mutableState, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            b(OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue3), searchStopItemUiState2, fM7278constructorimpl, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, originDestinationSearchbarSpecs.b), composerStartRestartGroup, 0);
            boolean zChanged4 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(mutableState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new f0(density, mutableState2, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            b(OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (Function1) objRememberedValue4), searchStopItemUiState, fM7278constructorimpl, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxHeight(companion3, 0.7f), ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 0.0f, 0.0f, 14, null);
            ImageUIState imageUIState = state.c;
            composer2 = composerStartRestartGroup;
            FromAndToStopDetailViewKt.d(modifierM788paddingqDBjuR0$default, imageUIState, imageUIState, state.b, composer2, 0);
            ImageUIState imageUIState2 = state.f;
            if (imageUIState2 == null) {
                composer2.startReplaceGroup(1032889503);
            } else {
                composer2.startReplaceGroup(1032889504);
                CommonImageKt.a(imageUIState2, PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getCenterEnd()), 0.0f, 0.0f, originDestinationSearchbarSpecs.c, 0.0f, 11, null), false, composer2, 0, 4);
                composer2 = composer2;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 22, modifier3, state));
        }
    }

    public static final void b(Modifier modifier, SearchStopItemUiState searchStopItemUiState, float f, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1398483902);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(searchStopItemUiState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398483902, i2, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.SearchCardUi (OriginDestinationSearchCard.kt:116)");
            }
            float f2 = 0;
            ChaloRoundedCardKt.b(null, ChaloThemeKt.d(searchStopItemUiState.f4610a.d), Dp.m7278constructorimpl(f2), 0.0f, ComposableLambdaKt.rememberComposableLambda(-2118569315, true, new u50(15, (Dp.m7283equalsimpl0(f, Dp.m7278constructorimpl(f2)) || Dp.m7277compareTo0680j_4(f, searchStopItemUiState.f4610a.e) < 0) ? SizeKt.m816heightInVpY3zN4$default(modifier, searchStopItemUiState.f4610a.e, 0.0f, 2, null) : SizeKt.m814height3ABfNKs(modifier, f), searchStopItemUiState), composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(modifier, searchStopItemUiState, f, i, 3));
        }
    }
}
