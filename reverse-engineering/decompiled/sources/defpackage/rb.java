package defpackage;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.paging.compose.LazyPagingItems;
import app.chalo.compose.CityLocationConfigFetchErrorScreenKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ChaloToolBarKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.common.PendingRideFeedbackCardKt;
import app.chalo.home.ui.regularbus.RegularBusViewState;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoScreenLayoutType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposablesKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenContent;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionSpecs;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductBookingImageLoadingShimmerUiState;
import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rb implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19193a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rb(int i, Object obj, Object obj2) {
        this.f19193a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer;
        int i = this.f19193a;
        ChaloColorToken.Custom custom = null;
        Object obj5 = this.c;
        Unit unit = Unit.f17538a;
        boolean z = true;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                BleValidationState bleValidationState = (BleValidationState) obj5;
                Function1 function1 = (Function1) obj6;
                AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
                BleValidationLayoutType bleValidationLayoutType = (BleValidationLayoutType) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.i(bleValidationLayoutType, "bleValidationLayoutType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-318227241, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.BleValidationUi.<anonymous> (BleValidationScreen.android.kt:378)");
                }
                int i2 = BleValidationScreen_androidKt.WhenMappings.b[bleValidationLayoutType.ordinal()];
                if (i2 == 1) {
                    composer2.startReplaceGroup(-1314731891);
                    BleValidationLayoutInfo bleValidationLayoutInfo = bleValidationState.b;
                    if (bleValidationLayoutInfo == null) {
                        composer2.startReplaceGroup(-1314731892);
                    } else {
                        composer2.startReplaceGroup(-1314731891);
                        BleValidationScreen_androidKt.a(bleValidationLayoutInfo, function1, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else if (i2 == 2) {
                    composer2.startReplaceGroup(-1314403787);
                    if (bleValidationState.b == null) {
                        composer2.startReplaceGroup(-1314403788);
                    } else {
                        composer2.startReplaceGroup(-1314403787);
                        BleValidationScreen_androidKt.f(function1, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else if (i2 == 3) {
                    composer2.startReplaceGroup(-1314106094);
                    BleValidationLayoutInfo bleValidationLayoutInfo2 = bleValidationState.b;
                    if (bleValidationLayoutInfo2 == null) {
                        composer2.startReplaceGroup(-1314106095);
                    } else {
                        composer2.startReplaceGroup(-1314106094);
                        BleValidationScreen_androidKt.s(0, composer2, function1, bleValidationLayoutInfo2.c.c);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else if (i2 == 4) {
                    composer2.startReplaceGroup(-1313661337);
                    BleValidationLayoutInfo bleValidationLayoutInfo3 = bleValidationState.b;
                    if (bleValidationLayoutInfo3 == null) {
                        composer2.startReplaceGroup(-1313661338);
                    } else {
                        composer2.startReplaceGroup(-1313661337);
                        BleValidationScreen_androidKt.G(bleValidationLayoutInfo3, function1, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                } else {
                    if (i2 != 5) {
                        throw pk0.p(composer2, -873697667);
                    }
                    composer2.startReplaceGroup(-1313351430);
                    BleValidationLayoutInfo bleValidationLayoutInfo4 = bleValidationState.b;
                    if (bleValidationLayoutInfo4 == null) {
                        composer2.startReplaceGroup(-1313351431);
                    } else {
                        composer2.startReplaceGroup(-1313351430);
                        BleValidationScreen_androidKt.F(bleValidationLayoutInfo4, composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 1:
                ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) obj5;
                Function1 function2 = (Function1) obj6;
                AnimatedContentScope AnimatedContent2 = (AnimatedContentScope) obj;
                ChaloCardInfoScreenLayoutType viewType = (ChaloCardInfoScreenLayoutType) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent2, "$this$AnimatedContent");
                Intrinsics.i(viewType, "viewType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1011063138, iIntValue2, -1, "app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenUI.<anonymous>.<anonymous> (ChaloCardInfoScreen.kt:219)");
                }
                int i3 = ChaloCardInfoScreenKt.WhenMappings.b[viewType.ordinal()];
                if (i3 == 1) {
                    composer3.startReplaceGroup(23831404);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloToolBarKt.a(null, null, 0.0f, 0L, null, null, composer3, 0, 63);
                    String str = chaloCardInfoViewState.l;
                    String str2 = chaloCardInfoViewState.m;
                    String str3 = chaloCardInfoViewState.n;
                    boolean zChanged = composer3.changed(function2);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ii(function2, 8);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    ChaloCardComposablesKt.b(str, str2, str3, (Function0) objRememberedValue, composer3, 0);
                    composer3.endNode();
                    composer3.endReplaceGroup();
                } else if (i3 == 2) {
                    composer3.startReplaceGroup(24450381);
                    CardInfoLandingScreenKt.b(BackgroundKt.m264backgroundbw27NRU$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), ChaloTheme.a(composer3, 0).t, null, 2, null), chaloCardInfoViewState, function2, composer3, 0);
                    composer3.endReplaceGroup();
                } else {
                    if (i3 != 3) {
                        throw pk0.p(composer3, -969064246);
                    }
                    composer3.startReplaceGroup(24925487);
                    SingleCardDetailsScreenKt.f(BackgroundKt.m264backgroundbw27NRU$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), ChaloTheme.a(composer3, 0).t, null, 2, null), chaloCardInfoViewState.e, function2, composer3, 0, 0);
                    composer3.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 2:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj5;
                g0 g0Var = (g0) obj6;
                LazyItemScope items = (LazyItemScope) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= composer4.changed(iIntValue3) ? 32 : 16;
                }
                if (composer4.shouldExecute((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(431346734, iIntValue4, -1, "app.chalo.ncmc.ui.transactionhistory.compose.cardTransactionSuccessItems.<anonymous> (ChaloCardTransactionsScreen.kt:351)");
                    }
                    CardTransactionUiModel cardTransactionUiModel = (CardTransactionUiModel) lazyPagingItems.get(iIntValue3);
                    if (cardTransactionUiModel == null) {
                        composer4.startReplaceGroup(-291525985);
                    } else {
                        composer4.startReplaceGroup(-291525984);
                        ChaloCardTransactionsScreenKt.l(cardTransactionUiModel, g0Var, composer4, 0);
                    }
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                CityLocationSelectionState cityLocationSelectionState = (CityLocationSelectionState) obj5;
                Function1 function3 = (Function1) obj6;
                AnimatedContentScope AnimatedContent3 = (AnimatedContentScope) obj;
                CityLocationSelectionLayoutType layoutType = (CityLocationSelectionLayoutType) obj2;
                Composer composer5 = (Composer) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                Intrinsics.i(AnimatedContent3, "$this$AnimatedContent");
                Intrinsics.i(layoutType, "layoutType");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1202733807, iIntValue5, -1, "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionUI.<anonymous> (CityLocationSelectionScreen.kt:148)");
                }
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer5, companion3);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                if (composer5.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer5.startReusableNode();
                if (composer5.getInserting()) {
                    composer5.createNode(constructor2);
                } else {
                    composer5.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer5);
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                switch (CityLocationSelectionScreenKt.WhenMappings.f6597a[layoutType.ordinal()]) {
                    case 1:
                        composer = composer5;
                        composer.startReplaceGroup(-465089328);
                        CityLocationSelectionScreenKt.a(cityLocationSelectionState.i, boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion4.getBottomCenter()), function3, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 2:
                        composer = composer5;
                        composer.startReplaceGroup(-464574573);
                        CityLocationSelectionScreenKt.j(PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion4.getCenter()), ChaloTheme.b(composer, 0).h, 0.0f, ChaloTheme.b(composer, 0).h, ChaloTheme.b(composer, 0).k, 2, null), function3, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 3:
                        composer = composer5;
                        composer.startReplaceGroup(-463912258);
                        Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion4.getCenter()), ChaloTheme.b(composer, 0).h, 0.0f, ChaloTheme.b(composer, 0).h, ChaloTheme.b(composer, 0).k, 2, null);
                        boolean zChanged2 = composer.changed(function3);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new bp(function3, 5);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        CityLocationSelectionScreenKt.b(0, composer, modifierM788paddingqDBjuR0$default, (Function0) objRememberedValue2);
                        composer.endReplaceGroup();
                        break;
                    case 4:
                        composer = composer5;
                        composer.startReplaceGroup(-463225205);
                        composer.endReplaceGroup();
                        break;
                    case 5:
                        composer = composer5;
                        composer.startReplaceGroup(-463133755);
                        Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null), companion4.getCenter()), ChaloTheme.b(composer, 0).h, 0.0f, ChaloTheme.b(composer, 0).h, ChaloTheme.b(composer, 0).k, 2, null);
                        String str4 = cityLocationSelectionState.e;
                        if (str4 == null) {
                            str4 = "";
                        }
                        CityLocationSelectionScreenKt.f(modifierM788paddingqDBjuR0$default2, str4, cityLocationSelectionState.f, cityLocationSelectionState.g, composer, 0);
                        composer.endReplaceGroup();
                        break;
                    case 6:
                        composer5.startReplaceGroup(-462241389);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        String str5 = cityLocationSelectionState.e;
                        boolean z2 = cityLocationSelectionState.k;
                        boolean zChanged3 = composer5.changed(function3);
                        Object objRememberedValue3 = composer5.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new bp(function3, 6);
                            composer5.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        boolean zChanged4 = composer5.changed(function3);
                        Object objRememberedValue4 = composer5.rememberedValue();
                        if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new bp(function3, 7);
                            composer5.updateRememberedValue(objRememberedValue4);
                        }
                        CityLocationConfigFetchErrorScreenKt.a(modifierFillMaxWidth$default, str5, z2, function0, (Function0) objRememberedValue4, composer5, 6, 0);
                        composer = composer5;
                        composer.endReplaceGroup();
                        break;
                    default:
                        throw pk0.p(composer5, -430644755);
                }
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 4:
                String str6 = (String) obj6;
                LazyItemScope stickyHeader = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer6 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader, "$this$stickyHeader");
                if (composer6.shouldExecute((iIntValue6 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1286424680, iIntValue6, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (JourneyDetailsBottomSheet.kt:83)");
                    }
                    JourneyDetailsBottomSheetKt.e(0, composer6, ZIndexModifierKt.zIndex(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer6, 0).t, null, 2, null), 10.0f), str6);
                    PlotlineComposeWidgetKt.a(6, 2, composer6, null, "tripPlannerDetailsBanner");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                PremiumBusProductSelectionSpecs premiumBusProductSelectionSpecs = (PremiumBusProductSelectionSpecs) obj5;
                PBProductCardUiState pBProductCardUiState = (PBProductCardUiState) obj6;
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                Composer composer7 = (Composer) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                if (composer7.shouldExecute((iIntValue7 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1434478761, iIntValue7, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PBProductCardComposable.kt:160)");
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, premiumBusProductSelectionSpecs.b.b, 0.0f, 2, null), 0.0f, 1, null);
                    ProductBookingImageLoadingShimmerUiState productBookingImageLoadingShimmerUiState = pBProductCardUiState.f;
                    BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m814height3ABfNKs(modifierFillMaxWidth$default2, productBookingImageLoadingShimmerUiState.f7710a), ChaloThemeKt.d(productBookingImageLoadingShimmerUiState.b)), Color.m4595boximpl(ChaloColorTokenKt.c(productBookingImageLoadingShimmerUiState.c)), Color.m4595boximpl(ChaloColorTokenKt.c(productBookingImageLoadingShimmerUiState.d)), 4), composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 6:
                PBProductCardUiState pBProductCardUiState2 = (PBProductCardUiState) obj5;
                Function2 function4 = (Function2) obj6;
                SubcomposeAsyncImageScope SubcomposeAsyncImage2 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                Composer composer8 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if ((iIntValue8 & 48) == 0) {
                    iIntValue8 |= (iIntValue8 & 64) == 0 ? composer8.changed(it) : composer8.changedInstance(it) ? 32 : 16;
                }
                if (composer8.shouldExecute((iIntValue8 & 145) != 144, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1317137411, iIntValue8, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PBProductCardComposable.kt:137)");
                    }
                    Painter painter = it.f11481a;
                    ContentScale contentScaleC = ImageUIStateKt.c(pBProductCardUiState2.b.d);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    boolean zChanged5 = composer8.changed(function4) | composer8.changed(pBProductCardUiState2);
                    Object objRememberedValue5 = composer8.rememberedValue();
                    if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new ej0(18, function4, pBProductCardUiState2);
                        composer8.updateRememberedValue(objRememberedValue5);
                    }
                    ImageKt.Image(painter, (String) null, OnGloballyPositionedModifierKt.onGloballyPositioned(companion6, (Function1) objRememberedValue5), (Alignment) null, contentScaleC, 0.0f, (ColorFilter) null, composer8, Painter.$stable | 48, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 7:
                PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType = (PbBulkBookingRideDetailsTabType) obj5;
                Function1 function5 = (Function1) obj6;
                LazyItemScope stickyHeader2 = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer9 = (Composer) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader2, "$this$stickyHeader");
                if (composer9.shouldExecute((iIntValue9 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1308681519, iIntValue9, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsSuccessScreen.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:358)");
                    }
                    boolean zChanged6 = composer9.changed(function5);
                    Object objRememberedValue6 = composer9.rememberedValue();
                    if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new sn0(function5, 7);
                        composer9.updateRememberedValue(objRememberedValue6);
                    }
                    PbBulkBookingRideDetailsScreenKt.q(null, pbBulkBookingRideDetailsTabType, (Function1) objRememberedValue6, composer9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 8:
                ArrayList arrayList = (ArrayList) obj5;
                n4 n4Var = (n4) obj6;
                PagerScope HorizontalPager = (PagerScope) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                Composer composer10 = (Composer) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-721603623, iIntValue11, -1, "app.chalo.home.ui.common.PendingRideFeedbackCard.<anonymous>.<anonymous>.<anonymous> (PendingRideFeedbackCard.kt:97)");
                }
                PendingRideFeedbackAppModel pendingRideFeedbackAppModel = (PendingRideFeedbackAppModel) arrayList.get(iIntValue10);
                boolean zChanged7 = composer10.changed(n4Var) | composer10.changedInstance(arrayList);
                if ((((iIntValue11 & 112) ^ 48) <= 32 || !composer10.changed(iIntValue10)) && (iIntValue11 & 48) != 32) {
                    z = false;
                }
                boolean z3 = zChanged7 | z;
                Object objRememberedValue7 = composer10.rememberedValue();
                if (z3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new l4(n4Var, arrayList, iIntValue10, 4);
                    composer10.updateRememberedValue(objRememberedValue7);
                }
                PendingRideFeedbackCardKt.b(pendingRideFeedbackAppModel, (Function1) objRememberedValue7, composer10, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 9:
                ChangeStopScreenContent.StopList stopList = (ChangeStopScreenContent.StopList) obj5;
                State state = (State) obj6;
                LazyItemScope stickyHeader3 = (LazyItemScope) obj;
                ((Integer) obj2).getClass();
                Composer composer11 = (Composer) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader3, "$this$stickyHeader");
                if (composer11.shouldExecute((iIntValue12 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-416349514, iIntValue12, -1, "app.chalo.premiumbus.ui.changestop.StopListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusChangeStopScreen.kt:180)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion7, ChaloTheme.a(composer11, 0).t, null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer11, modifierM264backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor3);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ChaloSpacersKt.u(composer11, 0);
                    ChaloTextViewKt.a(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ((Dp) state.getValue()).m7292unboximpl(), 0.0f, ChaloTheme.b(composer11, 0).h, 0.0f, 10, null), stopList.f7517a, null, null, composer11, 0, 12);
                    ChaloSpacersKt.o(composer11, 0);
                    ChaloDividerComposableKt.b(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion7, ChaloThemeHelper.a().b), 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.ShadyGray.f9851a), composer11, 0, 0);
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 10:
                List list = (List) obj5;
                MutableState mutableState = (MutableState) obj6;
                LazyItemScope AMPMPicker = (LazyItemScope) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                Composer composer12 = (Composer) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                Intrinsics.i(AMPMPicker, "$this$AMPMPicker");
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= composer12.changed(iIntValue13) ? 32 : 16;
                }
                if (composer12.shouldExecute((iIntValue14 & 145) != 144, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488832274, iIntValue14, -1, "app.chalo.premiumbus.ui.slotselection.TimePickerComposable.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1629)");
                    }
                    TextKt.m2623TextNvy7gAk((String) list.get(iIntValue13), null, ChaloColorTokenKt.c(Intrinsics.d((String) mutableState.getValue(), list.get(iIntValue13)) ? ChaloColorToken.Black.f9759a : ChaloColorToken.ShadyGray.f9851a), null, 0L, null, Intrinsics.d((String) mutableState.getValue(), list.get(iIntValue13)) ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.b(ChaloTheme.e(composer12, 0)), composer12, 0, 0, 129978);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            default:
                RegularBusViewState regularBusViewState = (RegularBusViewState) obj5;
                MutableState mutableState2 = (MutableState) obj6;
                SubcomposeAsyncImageScope SubcomposeAsyncImage3 = (SubcomposeAsyncImageScope) obj;
                Composer composer13 = (Composer) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= composer13.changed(SubcomposeAsyncImage3) ? 4 : 2;
                }
                if (composer13.shouldExecute((iIntValue15 & 131) != 130, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(857607501, iIntValue15, -1, "app.chalo.home.ui.regularbus.compose.RegularBusScreenContentUI.<anonymous>.<anonymous> (RegularBusScreenUI.kt:241)");
                    }
                    BgHighlightType bgHighlightType = regularBusViewState.h.f3814a;
                    float fM7292unboximpl = ((Dp) mutableState2.getValue()).m7292unboximpl();
                    String str7 = regularBusViewState.h.b;
                    if (str7 != null) {
                        if (StringsKt.F(str7)) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            custom = new ChaloColorToken.Custom(ChaloColorToken_androidKt.a(Color.INSTANCE, str7, Color.INSTANCE.m4640getTransparent0d7_KjU()));
                        }
                    }
                    ChaloGradientBackgroundKt.a(SubcomposeAsyncImage3, bgHighlightType, fM7292unboximpl, custom, composer13, iIntValue15 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
        }
    }
}
