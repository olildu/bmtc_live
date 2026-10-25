package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.theme.ChaloTheme;
import defpackage.dq;
import defpackage.pk0;
import defpackage.r50;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OriginDestinationSideIndicatorKt {
    public static final void a(Modifier modifier, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        float f3;
        float f4;
        Composer composerStartRestartGroup = composer.startRestartGroup(705371699);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                f3 = f;
                int i4 = composerStartRestartGroup.changed(f3) ? 32 : 16;
                i3 |= i4;
            } else {
                f3 = f;
            }
            i3 |= i4;
        } else {
            f3 = f;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f2;
                int i5 = composerStartRestartGroup.changed(f4) ? 256 : 128;
                i3 |= i5;
            } else {
                f4 = f2;
            }
            i3 |= i5;
        } else {
            f4 = f2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    f3 = ChaloTheme.b(composerStartRestartGroup, 6).f;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    f4 = ChaloTheme.b(composerStartRestartGroup, 6).b;
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705371699, i3, -1, "app.chalo.compose.components.OriginDestinationSideIndicator (OriginDestinationSideIndicator.kt:25)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion2, f3);
            float f5 = ChaloTheme.b(composerStartRestartGroup, 6).b;
            Color.Companion companion3 = Color.INSTANCE;
            BoxKt.Box(BorderKt.m275borderxT4_qwU(modifierM828size3ABfNKs, f5, companion3.m4631getBlack0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(dq.a(columnScopeInstance, SizeKt.m833width3ABfNKs(companion2, f4), 1.0f, false, 2, null), companion3.m4631getBlack0d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(companion2, f3), companion3.m4631getBlack0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        float f6 = f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r50(modifier, f3, f6, i, i2));
        }
    }
}
