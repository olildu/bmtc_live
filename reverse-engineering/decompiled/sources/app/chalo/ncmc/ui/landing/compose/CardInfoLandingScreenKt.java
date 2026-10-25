package app.chalo.ncmc.ui.landing.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloDotsIndicatorsKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel;
import app.chalo.ncmc.ui.landing.FetchCardStatus;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.af;
import defpackage.b3;
import defpackage.bf;
import defpackage.g0;
import defpackage.gb;
import defpackage.h0;
import defpackage.h3;
import defpackage.kb;
import defpackage.l3;
import defpackage.nb;
import defpackage.pk0;
import defpackage.v;
import defpackage.vc;
import defpackage.ya;
import defpackage.ye;
import defpackage.zc;
import defpackage.ze;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardInfoLandingScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6378a;

        static {
            int[] iArr = new int[FetchCardStatus.values().length];
            try {
                iArr[FetchCardStatus.FETCHING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchCardStatus.FETCHED_AND_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchCardStatus.FETCH_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchCardStatus.FETCHED_AND_NO_CARD_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchCardStatus.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6378a = iArr;
        }
    }

    public static final void a(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1463842352);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1463842352, i2, -1, "app.chalo.ncmc.ui.landing.compose.CardFetchFailed (CardInfoLandingScreen.kt:344)");
            }
            ChaloCardComposeItemsKt.b(null, ComposableLambdaKt.rememberComposableLambda(1825361893, true, new ze(function0, 0), composerStartRestartGroup, 54), 48, composerStartRestartGroup, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 1, function0));
        }
    }

    public static final void b(Modifier modifier, ChaloCardInfoViewState viewState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-330949298);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-330949298, i3, -1, "app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenContent (CardInfoLandingScreen.kt:74)");
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
            String strC = StringResourcesHelperKt.c(StringEnum.MANAGE_TRAVEL_CARDS, new Object[0], composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ChaloToolBarKt.g(ChaloToolBarKt.l(companion2, composerStartRestartGroup), strC, 0L, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (viewState.v) {
                composerStartRestartGroup.startReplaceGroup(34018384);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                String strC2 = StringResourcesHelperKt.c(StringEnum.RECHARGE_PENDING, new Object[0], composerStartRestartGroup, 6);
                String strC3 = StringResourcesHelperKt.c(StringEnum.RECHARGE_PENDING_DESC, new Object[0], composerStartRestartGroup, 6);
                boolean z = (i3 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ya(sendIntent, 21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloCardComposeItemsKt.a(modifierM786paddingVpY3zN4$default, strC2, strC3, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloSpacersKt.a(ChaloThemeHelper.a().W, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(30212638);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i5 = i3 & 896;
            d(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), viewState, sendIntent, composerStartRestartGroup, (i3 & 112) | 6 | i5);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            if (viewState.t) {
                composerStartRestartGroup.startReplaceGroup(34775032);
                SpacerKt.Spacer(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).i), 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).r0, null, 2, null), composerStartRestartGroup, 0);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                String strC4 = StringResourcesHelperKt.c(StringEnum.CARD_LANDING_CHALO_OPTION_HEADING, new Object[0], composerStartRestartGroup, 6);
                List list = viewState.s;
                boolean z2 = i5 == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new g0(sendIntent, 8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                e(modifierM786paddingVpY3zN4$default2, strC4, null, list, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(30212638);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ye(modifier, viewState, sendIntent, i, 1));
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1603216286);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1603216286, i2, -1, "app.chalo.ncmc.ui.landing.compose.CardLoadingShimmerView (CardInfoLandingScreen.kt:262)");
            }
            modifier2 = modifier;
            ChaloRoundedCardKt.b(modifier2, ChaloTheme.d(composerStartRestartGroup, 0).d, 0.0f, 0.0f, ComposableSingletons$CardInfoLandingScreenKt.f6381a, composerStartRestartGroup, (i2 & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier2, i, 1));
        }
    }

    public static final void d(Modifier modifier, ChaloCardInfoViewState chaloCardInfoViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Object obj;
        int i3;
        int i4;
        float f;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1132826848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloCardInfoViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132826848, i2, -1, "app.chalo.ncmc.ui.landing.compose.CardsSection (CardInfoLandingScreen.kt:140)");
            }
            int i5 = chaloCardInfoViewState.d;
            FetchCardStatus fetchCardStatus = chaloCardInfoViewState.h;
            boolean zChanged = composerStartRestartGroup.changed(i5);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Integer.valueOf(chaloCardInfoViewState.d);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            int i8 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.YOUR_LINKED_CARDS, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 1572864, 0, 131002);
            ChaloSpacersKt.t(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.CARD_LANDING_SCREEN_HEADING_INFO, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.a(ChaloTheme.b(composerStartRestartGroup, 0).W, composerStartRestartGroup, 0);
            int i9 = WhenMappings.f6378a[fetchCardStatus.ordinal()];
            if (i9 != 1) {
                i3 = 2;
                if (i9 == 2) {
                    obj = null;
                    i4 = 256;
                    composerStartRestartGroup.startReplaceGroup(2046043041);
                    List list = chaloCardInfoViewState.b;
                    boolean z = (i8 & 896) == 256;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new g0(function1, 9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    j(null, iIntValue, list, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i9 == 3) {
                    obj = null;
                    i4 = 256;
                    composerStartRestartGroup.startReplaceGroup(2046360729);
                    if (chaloCardInfoViewState.b.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(2046711060);
                        Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
                        pk0.v(companion2, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
                        boolean z2 = (i8 & 896) == 256;
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new ya(function1, 22);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        a((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(2046421613);
                        List list2 = chaloCardInfoViewState.b;
                        boolean z3 = (i8 & 896) == 256;
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new g0(function1, 10);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        j(null, iIntValue, list2, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i9 == 4) {
                    composerStartRestartGroup.startReplaceGroup(2047440459);
                    obj = null;
                    f = 0.0f;
                    Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default3);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion2, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
                    i4 = 256;
                    boolean z4 = (i8 & 896) == 256;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new ya(function1, 23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    h((Function0) objRememberedValue5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i9 != 5) {
                        throw pk0.p(composerStartRestartGroup, 758728217);
                    }
                    composerStartRestartGroup.startReplaceGroup(2047943434);
                    composerStartRestartGroup.endReplaceGroup();
                    obj = null;
                    f = 0.0f;
                    i4 = 256;
                }
                f = 0.0f;
            } else {
                obj = null;
                i3 = 2;
                i4 = 256;
                composerStartRestartGroup.startReplaceGroup(758728534);
                f = 0.0f;
                c(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (fetchCardStatus != FetchCardStatus.FETCHED_AND_NO_CARD_AVAILABLE) {
                composerStartRestartGroup.startReplaceGroup(2048055995);
                ChaloSpacersKt.f(composerStartRestartGroup, 0);
                Modifier modifierM786paddingVpY3zN4$default4 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, f, 1, obj), ChaloTheme.b(composerStartRestartGroup, 0).h, f, i3, obj);
                boolean z5 = (i8 & 896) == i4;
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new ya(function1, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                g(0, composerStartRestartGroup, modifierM786paddingVpY3zN4$default4, (Function0) objRememberedValue6);
            } else {
                composerStartRestartGroup.startReplaceGroup(2039153260);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ye(modifier, chaloCardInfoViewState, function1, i, 0));
        }
    }

    public static final void e(Modifier modifier, String str, TextStyle textStyle, List optionList, Function1 onOptionClick, Composer composer, int i) {
        Composer composer2;
        TextStyle textStyle2;
        int i2;
        TextStyle textStyleG;
        int i3;
        int i4;
        int i5;
        IconType iconType;
        Intrinsics.i(optionList, "optionList");
        Intrinsics.i(onOptionClick, "onOptionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-488089195);
        int i6 = (i & 6) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= 128;
        }
        if ((i & 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(optionList) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(onOptionClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & 9363) != 9362, i6 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                i2 = i6 & (-897);
                textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i2 = i6 & (-897);
                textStyleG = textStyle;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-488089195, i2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardOptions (CardInfoLandingScreen.kt:529)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1030373685);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i3 = i2;
                i5 = 16384;
                i4 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1030373684);
                i3 = i2;
                i4 = 0;
                i5 = 16384;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 1572864, 0, 131002);
                composer2 = composerStartRestartGroup;
                ChaloSpacersKt.a(ChaloTheme.b(composer2, 0).W, composer2, 0);
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(-1280153883);
            int i8 = i4;
            for (Object obj : optionList) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                ChaloCardOptionUiModel chaloCardOptionUiModel = (ChaloCardOptionUiModel) obj;
                ChaloCardOperationType chaloCardOperationType = chaloCardOptionUiModel.f6375a;
                Intrinsics.i(chaloCardOperationType, "<this>");
                if (chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.BuyNewCard.f6364a)) {
                    iconType = IconType.IC_ADD_CARD;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.Recharge.f6370a) || chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.Recharge.f6366a)) {
                    iconType = IconType.IC_FLASH;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.UpdateBalance.f6367a)) {
                    iconType = IconType.IC_UPDATE_BALANCE;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.Block.f6363a) || chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.Block.f6368a)) {
                    iconType = IconType.IC_BLOCK;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.ChangePin.f6365a) || (chaloCardOperationType instanceof ChaloCardOperationType.SpecificCardOption.ChangePin)) {
                    iconType = IconType.IC_CHANGE_PIN;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.UpdateBalance.f6372a)) {
                    iconType = IconType.IC_UPDATE_BALANCE;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.BalanceEnquiry.f6362a) || chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a)) {
                    iconType = IconType.IC_EYE;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a)) {
                    iconType = IconType.IC_HISTORY;
                } else if (chaloCardOperationType.equals(ChaloCardOperationType.SpecificCardOption.Unlink.f6371a)) {
                    iconType = IconType.IC_UNLINK;
                } else {
                    if (!chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.ActivateCardForMetro.f6360a) && !chaloCardOperationType.equals(ChaloCardOperationType.AllCardOption.ActivateNCMCCard.f6361a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iconType = IconType.IC_ACTIVATE_CARD;
                }
                IconType iconType2 = iconType;
                String str2 = chaloCardOptionUiModel.b;
                String str3 = chaloCardOptionUiModel.c;
                long j = ChaloTheme.a(composer2, i4).e;
                TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composer2, i4));
                Color colorM4595boximpl = Color.m4595boximpl(j);
                int i10 = (composer2.changed(chaloCardOptionUiModel) ? 1 : 0) | ((i3 & 57344) == i5 ? 1 : i4);
                Object objRememberedValue = composer2.rememberedValue();
                if (i10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new l3(17, onOptionClick, chaloCardOptionUiModel);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                TextStyle textStyle3 = textStyleG;
                ChaloWidgetCardKt.d(null, str2, textStyle3, str3, textStyleD, iconType2, 0.0f, 0.0f, colorM4595boximpl, 0.0f, 0.0f, (Function0) objRememberedValue, composer2, 0, 0, 1729);
                if (i8 < CollectionsKt.K(optionList)) {
                    composer2.startReplaceGroup(153236143);
                    ChaloSpacersKt.o(composer2, i4);
                } else {
                    composer2.startReplaceGroup(134020297);
                }
                composer2.endReplaceGroup();
                textStyleG = textStyle3;
                i8 = i9;
            }
            TextStyle textStyle4 = textStyleG;
            if (b3.t(composer2)) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textStyle2 = textStyle;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(modifier, str, textStyle2, optionList, onOptionClick, i, 3));
        }
    }

    public static final void f(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1280093316);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280093316, i2, -1, "app.chalo.ncmc.ui.landing.compose.LinkCardBenefit (CardInfoLandingScreen.kt:444)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_DONE, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, Color.m4604copywmQWz5c$default(ChaloTheme.a(composerStartRestartGroup, 0).t0, 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, (i2 >> 3) & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new nb(modifier2, str, i, 1));
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Modifier modifier2;
        Function0 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1288552347);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1288552347, i2, -1, "app.chalo.ncmc.ui.landing.compose.LinkNewCardView (CardInfoLandingScreen.kt:253)");
            }
            modifier2 = modifier;
            function1 = function0;
            ChaloCardComposeItemsKt.e(modifier2, StringResourcesHelperKt.c(StringEnum.LINK_NEW_CARD, new Object[0], composerStartRestartGroup, 6), null, 0L, null, function1, composerStartRestartGroup, (i2 & 14) | ((i2 << 12) & 458752), 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, function1, i, 2));
        }
    }

    public static final void h(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1547751244);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1547751244, i2, -1, "app.chalo.ncmc.ui.landing.compose.NoCardLinkedView (CardInfoLandingScreen.kt:393)");
            }
            ChaloCardComposeItemsKt.b(null, ComposableLambdaKt.rememberComposableLambda(-130044873, true, new ze(function0, 1), composerStartRestartGroup, 54), 48, composerStartRestartGroup, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 2, function0));
        }
    }

    public static final void i(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(560115877);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(560115877, i2, -1, "app.chalo.ncmc.ui.landing.compose.PagerCardView (CardInfoLandingScreen.kt:465)");
            }
            ChaloCardComposeItemsKt.b(null, ComposableLambdaKt.rememberComposableLambda(1644259738, true, new h3(4, function0, str), composerStartRestartGroup, 54), 48, composerStartRestartGroup, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(modifier2, str, function0, i, 1));
        }
    }

    public static final void j(Modifier modifier, int i, List list, Function1 function1, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476905100);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 = i;
            i4 |= composerStartRestartGroup.changed(i3) ? 32 : 16;
        } else {
            i3 = i;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476905100, i4, -1, "app.chalo.ncmc.ui.landing.compose.SwipableCards (CardInfoLandingScreen.kt:285)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new af(list, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i6 = (i4 >> 3) & 14;
            modifier2 = companion;
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(i3, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, i6, 2);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(list.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).h;
            int currentPage = pagerStateRememberPagerState.getCurrentPage();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1701968151, 0, -1, "app.chalo.ncmc.ui.landing.compose.horizontalPagerContentPadding (CardInfoLandingScreen.kt:330)");
            }
            if (iIntValue == 1) {
                composerStartRestartGroup.startReplaceGroup(791150846);
                paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m779PaddingValuesYgX7TsA$default(ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            } else if (currentPage == iIntValue - 1) {
                composerStartRestartGroup.startReplaceGroup(791153915);
                paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).j, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 10, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(791158457);
                paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).j, 0.0f, 10, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            PaddingValues paddingValues = paddingValuesM781PaddingValuesa9UjIt4$default;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            PagerKt.m1020HorizontalPager8jOkeI(pagerStateRememberPagerState, null, paddingValues, null, 0, f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(733778781, true, new bf(i5, list, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 0, 24576, 16346);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            ChaloDotsIndicatorsKt.b(BackgroundKt.m264backgroundbw27NRU$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.wrapContentSize$default(modifier2, null, false, 3, null), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).e, 7, null), Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).h, ChaloTheme.a(composerStartRestartGroup, 0).n, iIntValue, pagerStateRememberPagerState.getCurrentPage(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(modifier2, list, function1, i, i2));
        }
    }
}
