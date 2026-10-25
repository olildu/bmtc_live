package app.chalo.home.ui.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.text.style.TextAlign;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import defpackage.pk0;
import defpackage.u6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenPlotlineTitleKt {
    public static final void a(String str, String str2, String str3, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1935734122);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1935734122, i4, -1, "app.chalo.home.ui.common.HomeScreenPlotlineTitle (HomeScreenPlotlineTitle.kt:23)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str == null || str.length() == 0) {
                composer2 = composerStartRestartGroup;
                companion = companion;
                if (str2 == null || str2.length() == 0) {
                    composer2.startReplaceGroup(1262096546);
                } else {
                    composer2.startReplaceGroup(1263620909);
                    TextKt.m2623TextNvy7gAk(str2, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composer2, 0))), composer2, (i4 >> 3) & 14, 0, 131068);
                    if (str3 == null || str3.length() == 0) {
                        composer2 = composer2;
                        composer2 = composer2;
                        composer2.startReplaceGroup(1262096546);
                    } else {
                        composer2 = composer2;
                        composer2.startReplaceGroup(1263922229);
                        ChaloSpacersKt.o(composer2, 0);
                        TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composer2, 0)), composer2, (i4 >> 6) & 14, 0, 131066);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1263047657);
                ChaloTabTitleKt.a(composerStartRestartGroup, i4 & 14, str);
                if (str3 == null || str3.length() == 0) {
                    composer2 = composerStartRestartGroup;
                    i3 = 0;
                    composer2.startReplaceGroup(1262096546);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1263139107);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                    TextStyle textStyleI = ChaloTypographyKt.i(ChaloTheme.e(composerStartRestartGroup, 0));
                    i3 = 0;
                    TextKt.m2623TextNvy7gAk(str3, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleI, composerStartRestartGroup, ((i4 >> 6) & 14) | 48, 0, 130040);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                ChaloSpacersKt.p(composer2, i3);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 18, str, str2, str3, obj));
        }
    }
}
