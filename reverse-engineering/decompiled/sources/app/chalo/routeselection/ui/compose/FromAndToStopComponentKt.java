package app.chalo.routeselection.ui.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.OriginDestinationSideIndicatorKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.premiumbus.ui.stopselection.FromAndToStopCardData;
import defpackage.pk0;
import defpackage.q50;
import defpackage.r1;
import defpackage.r50;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FromAndToStopComponentKt {
    public static final void a(String fromStopName, String toStopName, Modifier modifier, TextStyle textStyle, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        TextStyle textStyle2;
        Modifier modifier3;
        int i3;
        TextStyle textStyleL;
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        Composer composerStartRestartGroup = composer.startRestartGroup(78838516);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fromStopName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(toStopName) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = Modifier.INSTANCE;
                i3 = i4 & (-7169);
                textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0));
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier;
                textStyleL = textStyle;
                i3 = i4 & (-7169);
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(78838516, i3, -1, "app.chalo.routeselection.ui.compose.FromAndToStopComponent (FromAndToStopComponent.kt:31)");
            }
            Modifier modifierHeight = IntrinsicKt.height(modifier3, IntrinsicSize.Min);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            OriginDestinationSideIndicatorKt.a(SizeKt.fillMaxHeight(companion3, 0.8f), 0.0f, 0.0f, composerStartRestartGroup, 6, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            composer2 = composerStartRestartGroup;
            Modifier modifier4 = modifier3;
            TextKt.m2623TextNvy7gAk(fromStopName, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleL, composer2, (i3 & 14) | 48, 24960, 110584);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer2, 0).f), composer2, 0);
            TextKt.m2623TextNvy7gAk(toStopName, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion4.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleL, composer2, ((i3 >> 3) & 14) | 48, 24960, 110584);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyleL;
            modifier2 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            textStyle2 = textStyle;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(fromStopName, toStopName, modifier2, textStyle2, i, 17));
        }
    }

    public static final void b(FromAndToStopCardData fromAndToStopCardData, int i, float f, float f2, Composer composer, int i2) {
        int i3;
        float f3;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-310523650);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(fromAndToStopCardData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & 384) == 0) {
            i6 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            f3 = f2;
            i6 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        } else {
            f3 = f2;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 1171) != 1170, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i5 = 1;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i5 = i;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-310523650, i6, -1, "app.chalo.routeselection.ui.compose.FromAndToStopComponent (FromAndToStopComponent.kt:71)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierHeight = IntrinsicKt.height(companion, IntrinsicSize.Min);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion, 0.8f);
            int i8 = i6 >> 3;
            OriginDestinationSideIndicatorKt.a(modifierFillMaxHeight, f, f3, composerStartRestartGroup, (i8 & 112) | 6 | (i8 & 896), 0);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            int i9 = i5;
            c(i9, (i6 << 6) & 7168, composerStartRestartGroup, null, fromAndToStopCardData.b, fromAndToStopCardData.c);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i4 = i9;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r50(fromAndToStopCardData, i4, f, f2, i2));
        }
    }

    public static final void c(int i, int i2, Composer composer, Modifier modifier, String str, String str2) {
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1798414796);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798414796, i3, -1, "app.chalo.routeselection.ui.compose.FromAndToStopNames (FromAndToStopComponent.kt:96)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).t0;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
            int i5 = (57344 & (i3 << 3)) | 384;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, modifierFillMaxWidth$default, j, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, i, 0, null, textStyleD, composer2, ((i3 >> 3) & 14) | 48, i5, 110584);
            ChaloSpacersKt.t(composer2, 0);
            TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, i, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, ((i3 >> 6) & 14) | 48, i5, 110584);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q50(i, i2, 0, modifier2, str, str2));
        }
    }
}
