package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModelKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.bottomsheet.TncBottomSheetUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureDataUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import app.chalo.wallet.ui.transactionsummary.compose.WalletTransactionSummaryComposableKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ti1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19662a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti1(Object obj, int i) {
        this.f19662a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19662a;
        int i2 = 6;
        Unit unit = Unit.f17538a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIState = (TextWithSpecialFeaturesTagsUIState) obj4;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(287050011, iIntValue, -1, "app.chalo.compose.components.TextWithSpecialFeaturesTags.<anonymous> (TextWithSpecialFeaturesTags.kt:29)");
                    }
                    for (TextWithSpecialFeatureDataUIState textWithSpecialFeatureDataUIState : textWithSpecialFeaturesTagsUIState.f10094a) {
                        if (textWithSpecialFeatureDataUIState instanceof TextWithSpecialFeatureDataUIState.SimpleText) {
                            composer.startReplaceGroup(-2009581274);
                            TextKt.c(((TextWithSpecialFeatureDataUIState.SimpleText) textWithSpecialFeatureDataUIState).f10092a, null, null, null, composer, 0, 14);
                            composer.endReplaceGroup();
                        } else {
                            if (!(textWithSpecialFeatureDataUIState instanceof TextWithSpecialFeatureDataUIState.SpecialFeature)) {
                                throw pk0.p(composer, -1727395032);
                            }
                            composer.startReplaceGroup(-2009443789);
                            TextWithSpecialFeatureDataUIState.SpecialFeature specialFeature = (TextWithSpecialFeatureDataUIState.SpecialFeature) textWithSpecialFeatureDataUIState;
                            TextKt.c(specialFeature.f10093a, ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, textWithSpecialFeaturesTagsUIState.b, 0.0f, 2, null), ChaloColorTokenKt.c(specialFeature.b), ChaloThemeKt.d(specialFeature.c)), specialFeature.d), null, null, composer, 0, 12);
                            composer.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                TncBottomSheetUIState tncBottomSheetUIState = (TncBottomSheetUIState) obj4;
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1091121328, iIntValue2, -1, "app.chalo.compose.components.bottomsheet.TncBottomSheet.<anonymous> (TncBottomSheet.kt:26)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), tncBottomSheetUIState.e), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.c(tncBottomSheetUIState.f9910a, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, composer2, 48, 12);
                    TextKt.c(tncBottomSheetUIState.b, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), tncBottomSheetUIState.f), null, null, composer2, 0, 12);
                    if (b3.s(0, 0, composer2, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), tncBottomSheetUIState.g), tncBottomSheetUIState.c)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                return TransformableStateKt.rememberTransformableState$lambda$0$0((State) obj4, ((Float) obj).floatValue(), (Offset) obj2, ((Float) obj3).floatValue());
            case 3:
                TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) obj4;
                Modifier it = (Modifier) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-597649767, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsBusLegCard.<anonymous>.<anonymous>.<anonymous> (TripPlannerDetailsBusLegCard.kt:79)");
                    }
                    TripPlannerResultsScreenKt.d(TripPlannerItineraryUiModelKt.a(bus), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 4:
                TripPlannerLegUiModel.Metro metro = (TripPlannerLegUiModel.Metro) obj4;
                Modifier it2 = (Modifier) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(it2, "it");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1627562729, iIntValue4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDetailsMetroLegCard.<anonymous>.<anonymous>.<anonymous> (TripPlannerDetailsMetroLegCard.kt:57)");
                    }
                    TripPlannerResultsScreenKt.a(TripPlannerItineraryUiModelKt.a(metro), metro.t, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 5:
                TripPlannerResultsState tripPlannerResultsState = (TripPlannerResultsState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(283987848, iIntValue5, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsMainScreen.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:318)");
                    }
                    TripPlannerResultsScreenKt.g(48, composer5, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), tripPlannerResultsState.i);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 6:
                rj1 rj1Var = (rj1) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1345262591, iIntValue6, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerItinerariesResultItems.<anonymous> (TripPlannerResultsScreen.kt:677)");
                    }
                    String strC = StringResourcesHelperKt.c(StringEnum.TP_LOAD_ITINERARY_SNACKBAR_ERROR, new Object[0], composer6, 6);
                    boolean zChanged = composer6.changed(rj1Var);
                    Object objRememberedValue = composer6.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new yh1(rj1Var, i2);
                        composer6.updateRememberedValue(objRememberedValue);
                    }
                    ChaloSnackbarKt.a(null, strC, null, (Function0) objRememberedValue, composer6, 0, 5);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                RecentTripAppModel recentTripAppModel = (RecentTripAppModel) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1325386448, iIntValue7, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerRecentTripCard.<anonymous> (TripPlannerResultsScreen.kt:486)");
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composer7, 0).h);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion4.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer7, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer7, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor2);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.RECENT_TRIP, composer7, 6), (String) null, (Modifier) null, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer7, Painter.$stable | 24624, 108);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composer7, 0).f), composer7, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer7, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor3);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    StringEnum stringEnum = StringEnum.FROM_;
                    String str = recentTripAppModel.g.b;
                    String str2 = (String) CollectionsKt.L(0, StringsKt.U(str, new String[]{","}, 6));
                    if (str2 != null) {
                        str = str2;
                    }
                    String strC2 = StringResourcesHelperKt.c(stringEnum, new Object[]{str}, composer7, 6);
                    long j = ChaloTheme.a(composer7, 0).e;
                    TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composer7, 0));
                    TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(strC2, null, j, null, 0L, null, null, null, 0L, null, null, 0L, companion6.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, textStyleG, composer7, 0, 24960, 110586);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer7, 0).c), composer7, 0);
                    StringEnum stringEnum2 = StringEnum.TO_;
                    String str3 = recentTripAppModel.h.b;
                    String str4 = (String) CollectionsKt.L(0, StringsKt.U(str3, new String[]{","}, 6));
                    if (str4 != null) {
                        str3 = str4;
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(stringEnum2, new Object[]{str3}, composer7, 6), null, ChaloTheme.a(composer7, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion6.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer7, 0)), composer7, 0, 24960, 110586);
                    if (r1.k(composer7)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 8:
                TabItemUiState tabItemUiState = (TabItemUiState) obj4;
                ColumnScope Tab = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(Tab, "$this$Tab");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1355038199, iIntValue8, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUI.<anonymous>.<anonymous>.<anonymous> (TripPlannerTabUI.kt:49)");
                    }
                    ChaloTextViewKt.a(ChaloThemeKt.c(Modifier.INSTANCE, tabItemUiState.f4623a.f4622a), tabItemUiState.b, null, null, composer8, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 9:
                UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = (UserProfilingChaloBusStickyBannerUIState) obj4;
                BoxScope ProfileCompletionTracker = (BoxScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(ProfileCompletionTracker, "$this$ProfileCompletionTracker");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-462069117, iIntValue9, -1, "app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerComposable.<anonymous>.<anonymous> (UserProfilingChaloBusStickyBanner.kt:68)");
                    }
                    CommonImageKt.a(userProfilingChaloBusStickyBannerUIState.b, null, false, composer9, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            default:
                WalletTransactionSummaryState walletTransactionSummaryState = (WalletTransactionSummaryState) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1654013128, iIntValue10, -1, "app.chalo.wallet.ui.transactionsummary.compose.WalletTransactionSummaryComposable.<anonymous>.<anonymous> (WalletTransactionSummaryComposable.kt:84)");
                    }
                    WalletTransactionSummaryComposableKt.a(StringResourcesHelperKt.c(StringEnum.BOOKING_ID, new Object[0], composer10, 6), walletTransactionSummaryState.h, composer10, 0);
                    if (walletTransactionSummaryState.j) {
                        composer10.startReplaceGroup(-1454484267);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer10, 0).k0), composer10, 0);
                        WalletTransactionSummaryComposableKt.a(StringResourcesHelperKt.c(StringEnum.MODE_OF_PAYMENT, new Object[0], composer10, 6), walletTransactionSummaryState.e, composer10, 0);
                    } else {
                        composer10.startReplaceGroup(-1458062566);
                    }
                    composer10.endReplaceGroup();
                    if (walletTransactionSummaryState.k) {
                        composer10.startReplaceGroup(-1454178886);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer10, 0).k0), composer10, 0);
                        WalletTransactionSummaryComposableKt.a(StringResourcesHelperKt.c(StringEnum.PRODUCT_NAME, new Object[0], composer10, 6), walletTransactionSummaryState.g, composer10, 0);
                    } else {
                        composer10.startReplaceGroup(-1458062566);
                    }
                    composer10.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer10, 0).k0), composer10, 0);
                    WalletTransactionSummaryComposableKt.a(StringResourcesHelperKt.c(StringEnum.TRANSACTION_STATUS, new Object[0], composer10, 6), walletTransactionSummaryState.f, composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
        }
    }
}
