package app.chalo.wallet.ui.promotionscardcontainer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import defpackage.ar0;
import defpackage.bf;
import defpackage.fu0;
import defpackage.pk0;
import defpackage.rx0;
import defpackage.sx0;
import defpackage.zy0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PromotionsCardContainerKt {
    public static final void a(PagerState pagerState, int i, Composer composer, int i2) {
        Intrinsics.i(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(478681305);
        int i3 = (i2 & 6) == 0 ? (composerStartRestartGroup.changed(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(478681305, i3, -1, "app.chalo.wallet.ui.promotionscardcontainer.DotsIndicator (PromotionsCardContainer.kt:99)");
            }
            float f = ChaloTheme.b(composerStartRestartGroup, 0).f;
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).h;
            float fM7278constructorimpl = Dp.m7278constructorimpl(f + f2);
            float currentPageOffsetFraction = pagerState.getCurrentPageOffsetFraction() + pagerState.getCurrentPage();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composerStartRestartGroup, 0).f, ChaloTheme.b(composerStartRestartGroup, 0).d), f);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM814height3ABfNKs);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(f2), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1492593225);
            for (int i6 = 0; i6 < i; i6++) {
                BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, f), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).n, null, 2, null), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(OffsetKt.m744offsetVpY3zN4$default(Modifier.INSTANCE, Dp.m7278constructorimpl(fM7278constructorimpl * currentPageOffsetFraction), 0.0f, 2, null), f), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zy0(pagerState, i, i2));
        }
    }

    public static final void b(PromotionCardItem item, Function0 onClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(item, "item");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1043543290);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1043543290, i2, -1, "app.chalo.wallet.ui.promotionscardcontainer.PromotionCard (PromotionsCardContainer.kt:75)");
            }
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).c;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g, ChaloTheme.b(composerStartRestartGroup, 0).f);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ar0(onClick, 28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m299clickableoSLSa3U$default(modifierM785paddingVpY3zN4, false, null, null, null, (Function0) objRememberedValue, 15, null), shape, ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, ComposableLambdaKt.rememberComposableLambda(2090444743, true, new sx0(item, 1), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new rx0(item, onClick, i, 4));
        }
    }

    public static final void c(final List promotionCardItems, final Function1 onClick, final PagerState pagerState, Composer composer, final int i) {
        int i2;
        List list;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.i(promotionCardItems, "promotionCardItems");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(887984167);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(promotionCardItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(887984167, i2, -1, "app.chalo.wallet.ui.promotionscardcontainer.PromotionsSection (PromotionsCardContainer.kt:30)");
            }
            if (promotionCardItems.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2() { // from class: yy0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i4) {
                            case 0:
                                PromotionsCardContainerKt.c(promotionCardItems, onClick, pagerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                PromotionsCardContainerKt.c(promotionCardItems, onClick, pagerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, 2, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                PagerKt.m1020HorizontalPager8jOkeI(pagerState, PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).g, 5, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(235322368, true, new bf(5, promotionCardItems, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 >> 6) & 14, 24576, 16380);
                if (promotionCardItems.size() > 1) {
                    composerStartRestartGroup.startReplaceGroup(216642716);
                    list = promotionCardItems;
                    ChaloRoundedCardKt.b(OffsetKt.m744offsetVpY3zN4$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, Dp.m7278constructorimpl(-ChaloTheme.b(composerStartRestartGroup, 0).W), 1, null), ChaloTheme.d(composerStartRestartGroup, 0).b, ChaloTheme.c(composerStartRestartGroup, 0).f1917a, 0.0f, ComposableLambdaKt.rememberComposableLambda(1276621415, true, new fu0(13, list, pagerState), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 8);
                } else {
                    list = promotionCardItems;
                    composerStartRestartGroup.startReplaceGroup(214764705);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        list = promotionCardItems;
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            final List list2 = list;
            function2 = new Function2() { // from class: yy0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i6) {
                        case 0:
                            PromotionsCardContainerKt.c(list2, onClick, pagerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            PromotionsCardContainerKt.c(list2, onClick, pagerState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
