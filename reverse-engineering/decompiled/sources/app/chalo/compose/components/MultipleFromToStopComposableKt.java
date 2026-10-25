package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangement;
import app.chalo.uistate.fromto.MultipleFromToStopConnectorUIState;
import app.chalo.uistate.fromto.MultipleFromToStopItemUISpecs;
import app.chalo.uistate.fromto.MultipleFromToStopItemUIState;
import app.chalo.uistate.fromto.MultipleFromToStopUISpecs;
import app.chalo.uistate.fromto.MultipleFromToStopUIState;
import defpackage.b3;
import defpackage.dq;
import defpackage.hi;
import defpackage.kk0;
import defpackage.pk0;
import defpackage.z;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MultipleFromToStopComposableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloColorToken.Custom f1846a = new ChaloColorToken.Custom(ColorKt.Color(4294908591L));
    public static final ChaloColorToken.Custom b = new ChaloColorToken.Custom(ColorKt.Color(4294967040L));
    public static final ChaloColorToken.Custom c = new ChaloColorToken.Custom(ColorKt.Color(4278222848L));

    public static final void a(Modifier modifier, MultipleFromToStopUIState state, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Arrangement.Vertical bottom;
        Intrinsics.i(state, "state");
        ArrayList arrayList = state.f10030a;
        MultipleFromToStopUISpecs multipleFromToStopUISpecs = state.b;
        Composer composerStartRestartGroup = composer.startRestartGroup(-986340263);
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
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986340263, i3, -1, "app.chalo.compose.components.MultipleFromToStopComposable (MultipleFromToStopComposable.kt:36)");
            }
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(modifier4, multipleFromToStopUISpecs.f10029a, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Horizontal horizontalA = UiAlignmentKt.a(multipleFromToStopUISpecs.b);
            UiArrangement.Vertical vertical = multipleFromToStopUISpecs.c;
            Intrinsics.i(vertical, "<this>");
            if (vertical.equals(UiArrangement.Vertical.Top.f9896a)) {
                bottom = Arrangement.INSTANCE.getTop();
            } else {
                if (!vertical.equals(UiArrangement.Vertical.Bottom.f9895a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bottom = Arrangement.INSTANCE.getBottom();
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(bottom, horizontalA, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1573617250);
            int size = arrayList.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                int i8 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                MultipleFromToStopItemUIState multipleFromToStopItemUIState = (MultipleFromToStopItemUIState) obj;
                d(multipleFromToStopItemUIState, composerStartRestartGroup, 0);
                if (i6 >= CollectionsKt.K(arrayList) || multipleFromToStopItemUIState.d == null) {
                    composerStartRestartGroup.startReplaceGroup(-828245133);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-826197707);
                    c(multipleFromToStopItemUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6 = i8;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new z(i, i2, 20, modifier3, state));
        }
    }

    public static final void b(Modifier modifier, MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState, float f, Composer composer, int i) {
        int i2;
        ChaloColorToken chaloColorToken;
        Composer composerStartRestartGroup = composer.startRestartGroup(1746584078);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(multipleFromToStopConnectorUIState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746584078, i2, -1, "app.chalo.compose.components.TimelineConnectorLine (MultipleFromToStopComposable.kt:104)");
            }
            Modifier modifierM833width3ABfNKs = SizeKt.m833width3ABfNKs(modifier, multipleFromToStopConnectorUIState != null ? multipleFromToStopConnectorUIState.f10026a : f);
            if (multipleFromToStopConnectorUIState == null || (chaloColorToken = multipleFromToStopConnectorUIState.b) == null) {
                chaloColorToken = ChaloColorToken.Transparent.f9864a;
            }
            SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(modifierM833width3ABfNKs, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hi(modifier, multipleFromToStopConnectorUIState, f, i, 2));
        }
    }

    public static final void c(MultipleFromToStopItemUIState multipleFromToStopItemUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(515765024);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(multipleFromToStopItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(515765024, i2, -1, "app.chalo.compose.components.TimelineConnectorSpacingRow (MultipleFromToStopComposable.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MultipleFromToStopItemUISpecs multipleFromToStopItemUISpecs = multipleFromToStopItemUIState.e;
            MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIState = multipleFromToStopItemUIState.d;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(companion, multipleFromToStopItemUISpecs.c);
            float f = 0;
            float fM7292unboximpl = ((Dp) RangesKt.a(Dp.m7276boximpl(Dp.m7278constructorimpl(multipleFromToStopItemUISpecs.f10027a - (multipleFromToStopConnectorUIState != null ? multipleFromToStopConnectorUIState.f10026a : multipleFromToStopItemUISpecs.d))), Dp.m7276boximpl(Dp.m7278constructorimpl(f)))).m7292unboximpl();
            UiAlignment.Horizontal horizontal = multipleFromToStopItemUISpecs.f;
            if (Intrinsics.d(horizontal, UiAlignment.Horizontal.Start.f9886a)) {
                fM7292unboximpl = Dp.m7278constructorimpl(f);
            } else if (Intrinsics.d(horizontal, UiAlignment.Horizontal.Center.f9884a)) {
                fM7292unboximpl = Dp.m7278constructorimpl(fM7292unboximpl / 2);
            } else if (!Intrinsics.d(horizontal, UiAlignment.Horizontal.End.f9885a)) {
                throw new NoWhenBranchMatchedException();
            }
            b(PaddingKt.m788paddingqDBjuR0$default(modifierM814height3ABfNKs, fM7292unboximpl, 0.0f, 0.0f, 0.0f, 14, null), multipleFromToStopConnectorUIState, multipleFromToStopItemUISpecs.d, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kk0(multipleFromToStopItemUIState, i, 0));
        }
    }

    public static final void d(MultipleFromToStopItemUIState multipleFromToStopItemUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2024001428);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(multipleFromToStopItemUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2024001428, i2, -1, "app.chalo.compose.components.TimelineStopRow (MultipleFromToStopComposable.kt:53)");
            }
            MultipleFromToStopItemUISpecs multipleFromToStopItemUISpecs = multipleFromToStopItemUIState.e;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = IntrinsicKt.height(companion, IntrinsicSize.Min);
            UiAlignment.Vertical vertical = multipleFromToStopItemUISpecs.e;
            float f = multipleFromToStopItemUISpecs.d;
            Alignment.Vertical verticalB = UiAlignmentKt.b(vertical);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion, multipleFromToStopItemUISpecs.f10027a), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), UiAlignmentKt.a(multipleFromToStopItemUISpecs.f), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), multipleFromToStopItemUIState.c, f, composerStartRestartGroup, 0);
            CircularShapeKt.b(multipleFromToStopItemUIState.b, null, composerStartRestartGroup, 0);
            b(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), multipleFromToStopItemUIState.d, f, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            ChaloTextViewKt.a(PaddingKt.m788paddingqDBjuR0$default(companion, multipleFromToStopItemUISpecs.b, 0.0f, 0.0f, 0.0f, 14, null), multipleFromToStopItemUIState.f10028a, null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kk0(multipleFromToStopItemUIState, i, 1));
        }
    }

    public static final MultipleFromToStopConnectorUIState e(ChaloColorToken chaloColorToken) {
        return new MultipleFromToStopConnectorUIState(ChaloThemeHelper.a().b, chaloColorToken);
    }
}
