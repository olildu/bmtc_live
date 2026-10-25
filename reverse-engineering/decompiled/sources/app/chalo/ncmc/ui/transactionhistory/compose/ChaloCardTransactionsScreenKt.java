package app.chalo.ncmc.ui.transactionhistory.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.compose.LazyPagingItems;
import app.chalo.compose.components.ChaloCircularLoadingBoxKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloConfirmationDialogKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryUiErrorWrapper;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.ncmc.ui.transactionhistory.ChaloCardTransactionsUiErrorType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.c6;
import defpackage.fj;
import defpackage.g0;
import defpackage.gf;
import defpackage.hb;
import defpackage.hj;
import defpackage.ii;
import defpackage.ij;
import defpackage.kb;
import defpackage.li;
import defpackage.n3;
import defpackage.pk0;
import defpackage.r1;
import defpackage.s3;
import defpackage.s4;
import defpackage.ti;
import defpackage.u6;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardTransactionsScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6440a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ChaloCardTransactionsUiErrorType.values().length];
            try {
                iArr[ChaloCardTransactionsUiErrorType.API_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloCardTransactionsUiErrorType.CARD_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloCardTransactionsUiErrorType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6440a = iArr;
            int[] iArr2 = new int[CardTicketPaymentMode.values().length];
            try {
                iArr2[CardTicketPaymentMode.PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardTicketPaymentMode.WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardTicketPaymentMode.PREPAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[CardTransactionTypeUiModel.values().length];
            try {
                iArr3[CardTransactionTypeUiModel.RECHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CardTransactionTypeUiModel.PASS_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CardTransactionTypeUiModel.TICKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CardTransactionTypeUiModel.MERCHANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CardTransactionTypeUiModel.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, LazyPagingItems lazyPagingItems, CardTransactionHistoryViewState cardTransactionHistoryViewState, Function1 function1) {
        int i2;
        Modifier modifier2;
        CombinedLoadStates loadState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-343946269);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(cardTransactionHistoryViewState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-343946269, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.CardTransactionRefreshLoadState (ChaloCardTransactionsScreen.kt:381)");
            }
            LoadState refresh = (lazyPagingItems == null || (loadState = lazyPagingItems.getLoadState()) == null) ? null : loadState.getRefresh();
            if (refresh instanceof LoadState.Error) {
                composerStartRestartGroup.startReplaceGroup(1289017601);
                String message = ((LoadState.Error) refresh).getError().getMessage();
                CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = cardTransactionHistoryViewState.b;
                boolean z = (i2 & 7168) == 2048;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ii(function1, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                f(modifier, message, cardTransactionHistoryUiErrorWrapper, (Function0) objRememberedValue, composerStartRestartGroup, i2 & 14);
                modifier2 = modifier;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = modifier;
                if (refresh instanceof LoadState.Loading) {
                    composerStartRestartGroup.startReplaceGroup(1289331600);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() != null)) {
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
                    ChaloCircularLoadingBoxKt.a(null, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1289548445);
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hj(modifier2, lazyPagingItems, cardTransactionHistoryViewState, function1, i));
        }
    }

    public static final void b(Modifier modifier, CardTransactionUiModel cardTransactionUiModel, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        String strC;
        String strC2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1310892006);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cardTransactionUiModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310892006, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.CardTransactionTitleAndDate (ChaloCardTransactionsScreen.kt:474)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CardTransactionTypeUiModel cardTransactionTypeUiModel = cardTransactionUiModel.f6439a;
            CardTicketPaymentMode cardTicketPaymentMode = cardTransactionUiModel.f;
            int i5 = WhenMappings.c[cardTransactionTypeUiModel.ordinal()];
            if (i5 == 1) {
                composerStartRestartGroup.startReplaceGroup(-568580029);
                strC = StringResourcesHelperKt.c(StringEnum.MONEY_ADDED, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 2) {
                composerStartRestartGroup.startReplaceGroup(-568576442);
                strC = StringResourcesHelperKt.c(StringEnum.PASS_PURCHASED, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 3) {
                composerStartRestartGroup.startReplaceGroup(-568572290);
                if (cardTicketPaymentMode != null) {
                    composerStartRestartGroup.startReplaceGroup(-445830729);
                    String strC3 = StringResourcesHelperKt.c(StringEnum.PAID_FOR_TICKET_VIA, new Object[0], composerStartRestartGroup, 6);
                    int i6 = WhenMappings.b[cardTicketPaymentMode.ordinal()];
                    if (i6 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-445642652);
                        strC2 = StringResourcesHelperKt.c(StringEnum.PASS_LOWERCASE, new Object[0], composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i6 != 2 && i6 != 3) {
                            throw pk0.p(composerStartRestartGroup, -568567627);
                        }
                        composerStartRestartGroup.startReplaceGroup(-445421374);
                        strC2 = StringResourcesHelperKt.c(StringEnum.WALLET_LOWERCASE, new Object[0], composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    strC = strC3 + " " + strC2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-445242349);
                    strC = StringResourcesHelperKt.c(StringEnum.PAID_FOR_TICKET, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (i5 == 4) {
                composerStartRestartGroup.startReplaceGroup(-568547160);
                strC = StringResourcesHelperKt.c(StringEnum.PAID_TO_MERCHANT, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 5) {
                    throw pk0.p(composerStartRestartGroup, -568581844);
                }
                composerStartRestartGroup.startReplaceGroup(-568543573);
                strC = StringResourcesHelperKt.c(StringEnum.UNKNOWN_TRANSACTION, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
            String str = strC;
            i3 = 0;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleG, composer2, 0, 0, 131066);
            TextKt.m2623TextNvy7gAk(cardTransactionUiModel.d, null, ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 0)), composer2, 0, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i3 = 0;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, cardTransactionUiModel, i, i3));
        }
    }

    public static final void c(Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(605363671);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605363671, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.CardTransactionsEmailStatementDialog (ChaloCardTransactionsScreen.kt:93)");
            }
            function1 = function0;
            ChaloConfirmationDialogKt.b(null, StringResourcesHelperKt.c(StringEnum.CARD_TRANSACTIONS_EMAIL_STATEMENT_MESSAGE, new Object[0], composerStartRestartGroup, 6), StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6), function1, null, null, null, null, composerStartRestartGroup, (i2 << 9) & 7168, 241);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 5, function1));
        }
    }

    public static final void d(Modifier modifier, String str, Function0 onEmailStatementClick, Function0 onViewMoreClicked, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(onEmailStatementClick, "onEmailStatementClick");
        Intrinsics.i(onViewMoreClicked, "onViewMoreClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1412178389);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEmailStatementClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewMoreClicked) ? 2048 : 1024;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1412178389, i3, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionEmptyScreen (ChaloCardTransactionsScreen.kt:173)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            j(composerStartRestartGroup, 0);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            i(composerStartRestartGroup, 0);
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(-1657282463);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
                ChaloCardComposeItemsKt.a(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), str, StringResourcesHelperKt.c(StringEnum.RECHARGE_PENDING_DESC, new Object[0], composerStartRestartGroup, 6), onViewMoreClicked, composerStartRestartGroup, (i3 & 7168) | (i3 & 112) | 6);
                gf.r(companion2, ChaloTheme.b(composerStartRestartGroup, 0).d, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1664396095);
                composerStartRestartGroup.endReplaceGroup();
            }
            e(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.NO_CHALO_CARD_TRANSACTIONS_TITLE, new Object[0], composerStartRestartGroup, 6), StringResourcesHelperKt.c(StringEnum.NO_CHALO_CARD_TRANSACTIONS_SUBTITLE, new Object[0], composerStartRestartGroup, 6), onEmailStatementClick, composerStartRestartGroup, ((i3 << 3) & 7168) | 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ij(modifier, str, onEmailStatementClick, onViewMoreClicked, i, 0));
        }
    }

    public static final void e(Modifier modifier, String title, String subtitle, Function0 onEmailStatementClick, Composer composer, int i) {
        int i2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(title, "title");
        Intrinsics.i(subtitle, "subtitle");
        Intrinsics.i(onEmailStatementClick, "onEmailStatementClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(881830080);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(subtitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEmailStatementClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(881830080, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionEmptyUI (ChaloCardTransactionsScreen.kt:224)");
            }
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_NO_CARD_TRANSACTIONS, composerStartRestartGroup, 6);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = i2;
            ImageKt.Image(painterA, "No card transactions", AspectRatioKt.aspectRatio$default(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).u), Float.intBitsToFloat((int) (painterA.getB() >> 32)) / Float.intBitsToFloat((int) (painterA.getB() & BodyPartID.bodyIdMax)), false, 2, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            ChaloSpacersKt.f(composerStartRestartGroup, 0);
            TextStyle textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0));
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleE, composerStartRestartGroup, (i4 >> 3) & 14, 0, 130046);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(subtitle, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion2.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i4 >> 6) & 14, 0, 130042);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            k(onEmailStatementClick, composerStartRestartGroup, (i4 >> 9) & 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new li(modifier, title, subtitle, onEmailStatementClick, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    public static final void f(Modifier modifier, String str, CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper, Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        String str2;
        int i3;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(676314713);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(cardTransactionHistoryUiErrorWrapper) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(676314713, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionErrorUI (ChaloCardTransactionsScreen.kt:107)");
            }
            Painter painterA = PainterResourceHelperKt.a(IconType.NO_INTERNET_ERROR, composerStartRestartGroup, 6);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(boxScopeInstance.align(companion3, companion.getCenter()), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(painterA, "No internet", AspectRatioKt.aspectRatio$default(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).u), Float.intBitsToFloat((int) (painterA.getB() >> 32)) / Float.intBitsToFloat((int) (painterA.getB() & BodyPartID.bodyIdMax)), false, 2, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            ChaloSpacersKt.f(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.SOMETHING_WENT_WRONG, new Object[0], composerStartRestartGroup, 6);
            TextStyle textStyleE = ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0));
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(strC2, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleE, composerStartRestartGroup, 0, 0, 130046);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-896361931);
                if (cardTransactionHistoryUiErrorWrapper == null) {
                    composerStartRestartGroup.startReplaceGroup(-896361932);
                    composerStartRestartGroup.endReplaceGroup();
                    str2 = null;
                } else {
                    int i6 = cardTransactionHistoryUiErrorWrapper.f6435a;
                    composerStartRestartGroup.startReplaceGroup(-2107124883);
                    int i7 = (i2 >> 6) & 14;
                    if (ComposerKt.isTraceInProgress()) {
                        i3 = -1;
                        ComposerKt.traceEventStart(-1172465953, i7, -1, "app.chalo.ncmc.ui.transactionhistory.compose.toErrorMessage (ChaloCardTransactionsScreen.kt:151)");
                    } else {
                        i3 = -1;
                    }
                    ChaloCardTransactionsUiErrorType chaloCardTransactionsUiErrorType = cardTransactionHistoryUiErrorWrapper.b;
                    int i8 = chaloCardTransactionsUiErrorType == null ? i3 : WhenMappings.f6440a[chaloCardTransactionsUiErrorType.ordinal()];
                    if (i8 == i3) {
                        composerStartRestartGroup.startReplaceGroup(-1458331710);
                        strC = StringResourcesHelperKt.c(StringEnum.TOAST_GENERIC_ERROR_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            composerStartRestartGroup.startReplaceGroup(-1458339908);
                            strC = StringResourcesHelperKt.c(StringEnum.CARD_NOT_FOUND_ERROR, new Object[]{Integer.valueOf(i6)}, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (i8 != 3) {
                                throw pk0.p(composerStartRestartGroup, -1458346526);
                            }
                            composerStartRestartGroup.startReplaceGroup(-1458335355);
                            String strC3 = StringResourcesHelperKt.c(StringEnum.GENERIC_ERROR_WITH_ERROR_CODE, new Object[]{Integer.valueOf(i6)}, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceGroup();
                            str2 = strC3;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1458344552);
                        strC = StringResourcesHelperKt.c(StringEnum.API_FAILED_ERROR, new Object[]{Integer.valueOf(i6)}, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    str2 = strC;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2107125720);
                composerStartRestartGroup.endReplaceGroup();
                str2 = str;
            }
            if (str2 == null) {
                str2 = "";
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(companion4.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130042);
            ChaloSpacersKt.p(composer2, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            String upperCase = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composer2, 6).toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, upperCase, null, 0L, null, false, 0.0f, null, 0L, function0, composer2, ((i2 << 18) & 1879048192) | 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(modifier, str, cardTransactionHistoryUiErrorWrapper, function0, i, 10));
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, LazyPagingItems lazyPagingItems, CardTransactionHistoryViewState cardTransactionHistoryViewState, Function1 function1) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1400714748);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cardTransactionHistoryViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1400714748, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionListUI (ChaloCardTransactionsScreen.kt:265)");
            }
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ii(function1, 26);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            PaddingValues paddingValuesM777PaddingValues0680j_4 = PaddingKt.m777PaddingValues0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h);
            boolean zChanged = ((i2 & 112) == 32) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && composerStartRestartGroup.changedInstance(lazyPagingItems))) | composerStartRestartGroup.changed(function0) | (i3 == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new n3(lazyPagingItems, cardTransactionHistoryViewState, function0, function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifier2, null, paddingValuesM777PaddingValues0680j_4, false, horizontalOrVerticalM672spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, composer2, i2 & 14, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hj(modifier, cardTransactionHistoryViewState, lazyPagingItems, function1, i));
        }
    }

    public static final void h(CardTransactionHistoryViewState viewState, LazyPagingItems lazyPagingItems, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1769755206);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(lazyPagingItems) : composerStartRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769755206, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreen (ChaloCardTransactionsScreen.kt:65)");
            }
            if (viewState.d) {
                composerStartRestartGroup.startReplaceGroup(-2053522152);
                boolean z = (i2 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ii(sendIntent, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                c((Function0) objRememberedValue, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-2056860728);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composerStartRestartGroup, 0, 63);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            int i4 = i2 << 3;
            g((i4 & 7168) | (i4 & 112) | 6 | (LazyPagingItems.$stable << 6) | (i4 & 896), composerStartRestartGroup, modifierFillMaxSize$default, lazyPagingItems, viewState, sendIntent);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 18, viewState, lazyPagingItems, sendIntent));
        }
    }

    public static final void i(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1955515379);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955515379, i, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsSubtitle (ChaloCardTransactionsScreen.kt:210)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_TRANSACTIONS_SUBTITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 5));
        }
    }

    public static final void j(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-17075873);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-17075873, i, -1, "app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsTitle (ChaloCardTransactionsScreen.kt:201)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_TRANSACTIONS_TITLE, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s3(i, 6));
        }
    }

    public static final void k(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(653851932);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653851932, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.EmailStatementButton (ChaloCardTransactionsScreen.kt:407)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new hb(function0, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_TRANSACTIONS_EMAIL_STATEMENT_CTA, new Object[0], composerStartRestartGroup, 6), PaddingKt.m784padding3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), ChaloTheme.b(composerStartRestartGroup, 0).h), ChaloTheme.a(composerStartRestartGroup, 0).f1915a, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 4, function0));
        }
    }

    public static final void l(CardTransactionUiModel cardTransactionUiModel, g0 g0Var, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896582539);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(cardTransactionUiModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(g0Var) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896582539, i2, -1, "app.chalo.ncmc.ui.transactionhistory.compose.TransactionCard (ChaloCardTransactionsScreen.kt:430)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composerStartRestartGroup);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ti(2, g0Var, cardTransactionUiModel);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloRoundedCardKt.b(ClickableKt.m295clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-501271114, true, new c6(cardTransactionUiModel, 8), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(cardTransactionUiModel, g0Var, false, i, 1));
        }
    }
}
