package app.chalo.compose.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.TwoTextInRowSpaceSeparatedKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.i41;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TwoTextInRowSpaceSeparatedKt {
    public static final void a(Modifier modifier, final String text1, final String text2, TextStyle textStyle, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyleL;
        long j2;
        Composer composer2;
        final Modifier modifier3;
        final TextStyle textStyle2;
        final long j3;
        Modifier modifier4;
        Intrinsics.i(text1, "text1");
        Intrinsics.i(text2, "text2");
        Composer composerStartRestartGroup = composer.startRestartGroup(-224939772);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(text2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                textStyleL = textStyle;
                int i5 = composerStartRestartGroup.changed(textStyleL) ? 2048 : 1024;
                i3 |= i5;
            } else {
                textStyleL = textStyle;
            }
            i3 |= i5;
        } else {
            textStyleL = textStyle;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                int i6 = composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                i3 |= i6;
            } else {
                j2 = j;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 6));
                }
                if ((i2 & 16) != 0) {
                    j2 = ChaloTheme.a(composerStartRestartGroup, 6).g;
                    i3 &= -57345;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                modifier4 = modifier2;
            }
            TextStyle textStyle3 = textStyleL;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-224939772, i3, -1, "app.chalo.compose.components.TwoTextInRowSpaceSeparated (TwoTextInRowSpaceSeparated.kt:18)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i8 = i3 >> 6;
            int i9 = (i3 << 12) & 29360128;
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            long j4 = j2;
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(text1, null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle3, composer2, ((i3 >> 3) & 14) | (i8 & 896), i9, 131066);
            SpacerKt.Spacer(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(text2, null, j4, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle3, composer2, i8 & 910, i9, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j4;
            textStyle2 = textStyle3;
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            textStyle2 = textStyleL;
            j3 = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: em1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    TwoTextInRowSpaceSeparatedKt.a(modifier3, text1, text2, textStyle2, j3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
