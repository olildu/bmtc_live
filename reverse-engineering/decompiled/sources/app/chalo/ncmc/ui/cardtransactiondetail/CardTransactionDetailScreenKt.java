package app.chalo.ncmc.ui.cardtransactiondetail;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.c0;
import defpackage.d0;
import defpackage.h0;
import defpackage.n4;
import defpackage.nf;
import defpackage.of;
import defpackage.pf;
import defpackage.pk0;
import defpackage.qf;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardTransactionDetailScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6313a;

        static {
            int[] iArr = new int[CardTransactionTypeUiModel.values().length];
            try {
                iArr[CardTransactionTypeUiModel.RECHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardTransactionTypeUiModel.MERCHANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardTransactionTypeUiModel.PASS_PURCHASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6313a = iArr;
        }
    }

    public static final void a(CardTransactionDetailViewState viewState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1902787647);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1902787647, i2, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreen (CardTransactionDetailScreen.kt:37)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).n, null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.a(null, ComposableLambdaKt.rememberComposableLambda(1046306495, true, new n4(viewState, 3), composerStartRestartGroup, 54), null, null, 0.0f, 0L, null, null, false, null, composerStartRestartGroup, 48, 0, 2045);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
            e(viewState, composerStartRestartGroup, i2 & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new of(viewState, i, 1));
        }
    }

    public static final void b(CardTransactionDetailViewState cardTransactionDetailViewState, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(531623429);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(cardTransactionDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(531623429, i2, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionOrExpiryTime (CardTransactionDetailScreen.kt:115)");
            }
            String str = cardTransactionDetailViewState.g;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(2049255195);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(2049255196);
                i3 = 0;
                TextKt.m2623TextNvy7gAk(vo1.n(StringResourcesHelperKt.c(cardTransactionDetailViewState.k ? StringEnum.EXPIRED_ON : StringEnum.EXPIRES_ON, new Object[0], composerStartRestartGroup, 0), " ", str), null, ChaloTheme.a(composerStartRestartGroup, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            CardTransactionTypeUiModel cardTransactionTypeUiModel = cardTransactionDetailViewState.f6315a;
            if (cardTransactionTypeUiModel == CardTransactionTypeUiModel.RECHARGE || cardTransactionTypeUiModel == CardTransactionTypeUiModel.MERCHANT) {
                composerStartRestartGroup.startReplaceGroup(-210976102);
                String str2 = cardTransactionDetailViewState.c;
                if (str2 == null) {
                    composerStartRestartGroup.startReplaceGroup(2049675431);
                } else {
                    composerStartRestartGroup.startReplaceGroup(2049675432);
                    Composer composer2 = composerStartRestartGroup;
                    TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, i3).h, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, i3)), composer2, 0, 0, 131066);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2045063965);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, i3).d, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new of(cardTransactionDetailViewState, i, 0));
        }
    }

    public static final void c(String str, List list, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        pf pfVar;
        List list2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2066894654);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2066894654, i3, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenAmountAndFareSplit (CardTransactionDetailScreen.kt:177)");
            }
            if (str == null || str.length() == 0 || (list2 = list) == null || list2.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    pfVar = new pf(str, list, companion, i, 0);
                }
            } else {
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
                ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).f1919a, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(170037469, true, new d0(5, str, list), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(pfVar);
        }
        composerStartRestartGroup.skipToGroupEnd();
        modifier2 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pfVar = new pf(str, list, modifier2, i, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(pfVar);
        }
    }

    public static final void d(String str, String str2, String str3, CardTransactionTypeUiModel cardTransactionTypeUiModel, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(753970276);
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
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(cardTransactionTypeUiModel == null ? -1 : cardTransactionTypeUiModel.ordinal()) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(753970276, i3, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenBookingDetailAndPaymentMode (CardTransactionDetailScreen.kt:241)");
            }
            ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).f1919a, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1338572507, true, new c0(str2, str, cardTransactionTypeUiModel, str3, 2), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0((Object) str, (Object) str2, (Object) str3, (Object) cardTransactionTypeUiModel, modifier2, i, 4));
        }
    }

    public static final void e(CardTransactionDetailViewState state, Composer composer, int i) {
        int i2;
        IconType iconType;
        int i3;
        int i4;
        int i5;
        Intrinsics.i(state, "state");
        String str = state.j;
        boolean z = state.k;
        CardTransactionTypeUiModel cardTransactionTypeUiModel = state.f6315a;
        Composer composerStartRestartGroup = composer.startRestartGroup(906433487);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906433487, i2, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenContent (CardTransactionDetailScreen.kt:58)");
            }
            int i6 = cardTransactionTypeUiModel == null ? -1 : WhenMappings.f6313a[cardTransactionTypeUiModel.ordinal()];
            if (i6 == 1 || i6 == 2) {
                iconType = IconType.WALLET_TRANSACTION_SUCCESS;
            } else if (i6 != 3) {
                iconType = null;
            } else {
                iconType = z ? IconType.EXPIRED_PASS_SUMMARY : IconType.ACTIVE_PASS_SUMMARY;
            }
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(1100768919);
                composerStartRestartGroup.endReplaceGroup();
                i4 = 1;
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1100768920);
                i3 = 0;
                i4 = 1;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).d, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i7 = cardTransactionTypeUiModel == 0 ? -1 : WhenMappings.f6313a[cardTransactionTypeUiModel.ordinal()];
            if (i7 == i4 || i7 == 2) {
                composerStartRestartGroup.startReplaceGroup(1101117453);
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(1101117452);
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = i3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1101117453);
                    i5 = i3;
                    TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, i3).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, i3)), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i7 != 3) {
                    composerStartRestartGroup.startReplaceGroup(1101662929);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1101392919);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(z ? StringEnum.PASS_NOT_ACTIVE : StringEnum.PASS_ACTIVE, new Object[i3], composerStartRestartGroup, i3), null, ChaloTheme.a(composerStartRestartGroup, i3).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, i3)), composerStartRestartGroup, 0, 0, 131066);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                i5 = i3;
            }
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, i5).d, composerStartRestartGroup, i5);
            b(state, composerStartRestartGroup, i2 & 14);
            f(state.i, state.f, composerStartRestartGroup, i5);
            c(str, state.d, null, composerStartRestartGroup, i5);
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, i5).h, composerStartRestartGroup, i5);
            d(state.c, state.b, state.l, state.f6315a, null, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new of(state, i, 2));
        }
    }

    public static final void f(String str, String str2, Composer composer, int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        nf nfVar;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1559156571);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1559156571, i2, -1, "app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionScreenPassDetail (CardTransactionDetailScreen.kt:141)");
            }
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    nfVar = new nf(str, str2, i, 1);
                }
            } else {
                ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).h, composerStartRestartGroup, 0);
                ChaloRoundedCardKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.d(composerStartRestartGroup, 0).f1919a, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1051704550, true, new qf(str, str2, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24582, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(nfVar);
        }
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            nfVar = new nf(str, str2, i, 0);
            scopeUpdateScopeEndRestartGroup.updateScope(nfVar);
        }
    }
}
