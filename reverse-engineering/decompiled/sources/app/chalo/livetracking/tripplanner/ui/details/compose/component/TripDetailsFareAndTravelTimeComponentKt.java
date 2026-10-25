package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.layout.Arrangement;
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
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.q50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TripDetailsFareAndTravelTimeComponentKt {
    public static final void a(int i, int i2, Composer composer, Modifier modifier, String str, String str2) {
        int i3;
        Composer composer2;
        Modifier modifier2;
        Modifier.Companion companion;
        int i4;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(390918001);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(390918001, i5, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripDetailsFareAndTravelTimeComponent (TripDetailsFareAndTravelTimeComponent.kt:18)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(2027795545);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                composer3 = composerStartRestartGroup;
                i4 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(2027795546);
                TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                companion = companion2;
                i4 = 0;
                TextKt.m2623TextNvy7gAk(str, str.length() > 0 ? hq0.c("PL_Fare_", i, companion2) : companion2, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleH, composerStartRestartGroup, i5 & 14, 0, 131064);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer3, i4).h), composer3, i4);
            if (str2 == null) {
                composer3.startReplaceGroup(2028156881);
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer3.startReplaceGroup(2028156882);
                composer2 = composer3;
                TextKt.m2623TextNvy7gAk(str2, hq0.c("PL_Travel_Time_", i, companion), ChaloTheme.a(composer3, i4).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer3, i4)), composer2, (i5 >> 3) & 14, 0, 131064);
                composer2.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new q50(str, str2, modifier2, i, i2));
        }
    }
}
