package app.chalo.wallet.ui.transactionsummary.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import defpackage.fl1;
import defpackage.i41;
import defpackage.nf;
import defpackage.pk0;
import defpackage.ti1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionSummaryComposableKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        int i2;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(599710969);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(599710969, i2, -1, "app.chalo.wallet.ui.transactionsummary.compose.KeyValueRow (WalletTransactionSummaryComposable.kt:146)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m788paddingqDBjuR0$default(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 11, null), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composer2, i2 & 14, 24960, 110584);
            str3 = str2;
            TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composer2, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodyMedium(), composer2, (i2 >> 3) & 14, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str3 = str2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nf(str, str3, i, 6));
        }
    }

    public static final void b(WalletTransactionSummaryState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1394322573);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1394322573, i2, -1, "app.chalo.wallet.ui.transactionsummary.compose.WalletTransactionSummaryComposable (WalletTransactionSummaryComposable.kt:31)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Painter painterA = PainterResourceHelperKt.a(state.m, composerStartRestartGroup, 0);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 13, null), ChaloTheme.b(composerStartRestartGroup, 0).n), ChaloTheme.b(composerStartRestartGroup, 0).m);
            int i5 = Painter.$stable;
            ImageKt.Image(painterA, (String) null, modifierM814height3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5 | 48, 120);
            String str = state.f10895a;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            long sp = TextUnitKt.getSp(24);
            FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, modifierFillMaxWidth$default3, 0L, null, sp, null, semiBold, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597440, 0, 261036);
            TextKt.m2623TextNvy7gAk(state.b, SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 0.0f, 0.0f, 13, null), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composerStartRestartGroup, 0, 0, 130040);
            Composer composer2 = composerStartRestartGroup;
            if (state.i) {
                composer2.startReplaceGroup(-1953662505);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT, new Object[]{Long.valueOf(state.n)}, composer2, 6), SizeKt.fillMaxWidth$default(PaddingKt.m788paddingqDBjuR0$default(PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer2, 0).h, 0.0f, 2, null), 0.0f, ChaloTheme.b(composer2, 0).f, 0.0f, 0.0f, 13, null), 0.0f, 1, null), ChaloTheme.a(composer2, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodyMedium(), composer2, 0, 0, 130040);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-1956300605);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            Composer composer3 = composer2;
            ChaloRoundedCardKt.b(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(r39, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer2, 0).W, 0.0f, 0.0f, 13, null), ChaloTheme.d(composer2, 0).b, 0.0f, ChaloTheme.b(composer2, 0).h, ComposableLambdaKt.rememberComposableLambda(1654013128, true, new ti1(state, 10), composer2, 54), composer3, 24576, 4);
            composerStartRestartGroup = composer3;
            if (state.o) {
                composerStartRestartGroup.startReplaceGroup(-822224942);
                Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(r39, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).q, 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM788paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.POWERED_BY, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).q0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyLarge(), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(r39, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                ImageKt.Image(PainterResourceHelperKt.a(IconType.YES_BANK, composerStartRestartGroup, 6), StringResourcesHelperKt.c(StringEnum.POWERED_BY_YES_BANK, new Object[0], composerStartRestartGroup, 6), SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).a0), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
                composerStartRestartGroup.endNode();
            } else {
                composerStartRestartGroup.startReplaceGroup(-826670311);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(state, i, 29));
        }
    }
}
