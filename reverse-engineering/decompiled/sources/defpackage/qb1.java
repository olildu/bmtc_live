package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1;
import androidx.compose.material3.TabRowKt$TabRowImpl$1$scope$1$1;
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
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.RouteAvailabilityBannerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopCardKt;
import app.chalo.livetracking.tripplanner.ui.details.MetroGroupLegAppModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsBottomSheetType;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.MetroTicketPurchaseBottomSheetContentKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteAvailabilityBannerUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardCtaUIState;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardUISpec;
import app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.StopCardUIState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.EnlargedProofImageUIState;
import app.chalo.productsummary.ui.compose.TripSummaryMainScreenKt;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptCardUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptHeaderUIState;
import app.chalo.productsummary.ui.ticket.TicketSummaryReceiptScreenUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.model.WalletTransactionUiWrapper;
import app.chalo.wallet.ui.transactionsContent.WalletTransactionsContentKt;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryState;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qb1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19106a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qb1(int i, Object obj, Object obj2) {
        this.f19106a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.f19106a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj5;
                StopCardUIState stopCardUIState = (StopCardUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1507197352, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopCard.<anonymous> (StopCard.kt:124)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    RouteAvailabilityBannerUIState routeAvailabilityBannerUIState = stopCardUIState.f4954a;
                    StopCardUISpec stopCardUISpec = stopCardUIState.d;
                    if (routeAvailabilityBannerUIState == null) {
                        composer.startReplaceGroup(-1824459399);
                    } else {
                        composer.startReplaceGroup(-1824459398);
                        RouteAvailabilityBannerKt.a(routeAvailabilityBannerUIState, BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(stopCardUISpec.c), null, 2, null), composer, 0);
                    }
                    composer.endReplaceGroup();
                    PlotlineComposeWidgetKt.a(6, 2, composer, null, "routeDetailsStopPlotlinePlaceholder");
                    Modifier modifierC = ChaloThemeKt.c(Modifier.INSTANCE, stopCardUISpec.b);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierC);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    RouteEtaStatusUIState routeEtaStatusUIState = stopCardUIState.b;
                    if (routeEtaStatusUIState == null) {
                        composer.startReplaceGroup(-1739206610);
                    } else {
                        composer.startReplaceGroup(-1739206609);
                        StopCardKt.b(routeEtaStatusUIState, null, composer, 0);
                    }
                    composer.endReplaceGroup();
                    StopCardCtaUIState stopCardCtaUIState = stopCardUIState.c;
                    if (stopCardCtaUIState == null) {
                        composer.startReplaceGroup(-1739095878);
                    } else {
                        composer.startReplaceGroup(-1739095877);
                        StopCardKt.d(stopCardCtaUIState, null, composer, 0);
                    }
                    composer.endReplaceGroup();
                    if (r1.k(composer)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                TextUIState textUIState = (TextUIState) obj5;
                SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState = (SuperPassEnterUserDetailsUIState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1855530495, iIntValue2, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:96)");
                    }
                    TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassEnterUserDetailsUIState.d.b), null, null, composer2, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                MutableState mutableState = (MutableState) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj3).getClass();
                mutableState.setValue(Float.valueOf(((EnlargedProofImageUIState) obj5).b.a(((Number) mutableState.getValue()).floatValue(), fFloatValue)));
                return unit;
            case 3:
                return TabRowKt$ScrollableTabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((Function4) obj5, (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 4:
                return TabRowKt$TabRowImpl$1$scope$1$1.tabIndicatorLayout$lambda$0((Function4) obj5, (TabRowKt$TabRowImpl$1$scope$1$1) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            case 5:
                return TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0((Function1) obj5, (MutableInteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                String str = (String) obj5;
                Function2 function2 = (Function2) obj4;
                Modifier cardModifier = (Modifier) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(cardModifier, "cardModifier");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer3.changed(cardModifier) ? 4 : 2;
                }
                if (composer3.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1337612234, iIntValue3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegSection.<anonymous> (TripPlannerDefaultLegSection.kt:38)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(cardModifier, null, false, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierWrapContentHeight$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloTheme.a(composer3, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7225getClipgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer3, 0)), composer3, 48, 24960, 110584);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer3, 0).h), composer3, 0);
                    function2.invoke(composer3, 0);
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer3, 0).h), composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 7:
                TripPlannerDetailsBottomSheetType tripPlannerDetailsBottomSheetType = (TripPlannerDetailsBottomSheetType) obj5;
                Function1 function1 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer4.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-967957476, iIntValue4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreen.<anonymous>.<anonymous> (TripPlannerDetailsScreen.kt:143)");
                    }
                    if (!(tripPlannerDetailsBottomSheetType instanceof TripPlannerDetailsBottomSheetType.MetroTicketPurchaseBottomSheet)) {
                        throw pk0.p(composer4, 1800770795);
                    }
                    composer4.startReplaceGroup(-10576971);
                    MetroGroupLegAppModel metroGroupLegAppModel = ((TripPlannerDetailsBottomSheetType.MetroTicketPurchaseBottomSheet) tripPlannerDetailsBottomSheetType).f4720a;
                    String str2 = metroGroupLegAppModel.f4719a.b;
                    String str3 = metroGroupLegAppModel.b.b;
                    int i5 = metroGroupLegAppModel.c;
                    boolean zChanged = composer4.changed(function1) | composer4.changed(tripPlannerDetailsBottomSheetType);
                    Object objRememberedValue = composer4.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new da1(25, function1, tripPlannerDetailsBottomSheetType);
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean zChanged2 = composer4.changed(function1);
                    Object objRememberedValue2 = composer4.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new rj1(function1, 3);
                        composer4.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function3 = (Function0) objRememberedValue2;
                    boolean zChanged3 = composer4.changed(function1);
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new rj1(function1, 4);
                        composer4.updateRememberedValue(objRememberedValue3);
                    }
                    MetroTicketPurchaseBottomSheetContentKt.a(null, str2, str3, i5, function0, function3, (Function0) objRememberedValue3, composer4, 0);
                    composer4.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 8:
                TripPlannerDetailsState tripPlannerDetailsState = (TripPlannerDetailsState) obj5;
                Function1 function4 = (Function1) obj4;
                PaddingValues it = (PaddingValues) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(42070968, iIntValue5, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsMainContent.<anonymous>.<anonymous> (TripPlannerDetailsScreen.kt:220)");
                    }
                    TripPlannerDetailsScreenKt.o(tripPlannerDetailsState, function4, composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 9:
                IconType iconType = (IconType) obj5;
                TripPlannerLegUiModel tripPlannerLegUiModel = (TripPlannerLegUiModel) obj4;
                Modifier it2 = (Modifier) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(it2, "it");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-768763024, iIntValue6, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerLegInfoComponent.<anonymous> (TripPlannerResultsScreen.kt:1130)");
                    }
                    TripPlannerResultsScreenKt.a(iconType, ((TripPlannerLegUiModel.Metro) tripPlannerLegUiModel).t, composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 10:
                TicketSummaryReceiptHeaderUIState ticketSummaryReceiptHeaderUIState = (TicketSummaryReceiptHeaderUIState) obj5;
                ImageUrlUIState imageUrlUIState = (ImageUrlUIState) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer7.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1258289847, iIntValue7, -1, "app.chalo.productsummary.ui.compose.TicketSummaryReceiptHeader.<anonymous>.<anonymous>.<anonymous> (TripSummaryMainScreen.kt:246)");
                    }
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierC2 = ChaloThemeKt.c(companion5, ticketSummaryReceiptHeaderUIState.l);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer7, modifierC2);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor4);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion6, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TripSummaryMainScreenKt.i(imageUrlUIState, companion5, composer7, 48);
                    composer7.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 11:
                TicketSummaryReceiptScreenUIState ticketSummaryReceiptScreenUIState = (TicketSummaryReceiptScreenUIState) obj5;
                TicketSummaryReceiptCardUIState ticketSummaryReceiptCardUIState = (TicketSummaryReceiptCardUIState) obj4;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1694072012, iIntValue8, -1, "app.chalo.productsummary.ui.compose.TicketSummaryBMTCReceiptMainScreen.<anonymous>.<anonymous>.<anonymous> (TripSummaryMainScreen.kt:162)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor5);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion8, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ImageUIState imageUIState = ticketSummaryReceiptScreenUIState.e;
                    if (imageUIState == null) {
                        composer8.startReplaceGroup(55083032);
                    } else {
                        composer8.startReplaceGroup(55083033);
                        CommonImageKt.a(imageUIState, null, false, composer8, 0, 6);
                    }
                    composer8.endReplaceGroup();
                    TripSummaryMainScreenKt.g(SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), ticketSummaryReceiptCardUIState, composer8, 6);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 12:
                WalletAccessState walletAccessState = (WalletAccessState) obj5;
                Function1 function5 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-109047414, iIntValue9, -1, "app.chalo.wallet.ui.access.WalletAccessBaseWithBottomSheet.<anonymous>.<anonymous> (WalletAccessBaseScreen.kt:150)");
                    }
                    WalletAccessBaseScreenKt.e(false, walletAccessState.h, walletAccessState.j, walletAccessState.k, function5, walletAccessState.m, BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer9, 0).t, null, 2, null), composer9, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 13:
                WalletTransactionUiWrapper walletTransactionUiWrapper = (WalletTransactionUiWrapper) obj5;
                Function1 function6 = (Function1) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1942056136, iIntValue10, -1, "app.chalo.wallet.ui.alltransactions.compose.WalletTransactionSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletAllTransactionsComposable.kt:128)");
                    }
                    WalletTransactionsContentKt.b(walletTransactionUiWrapper.f10887a, function6, PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer10, 0).h, 0.0f, 2, null), composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 14:
                WalletTransactionSummaryComponent walletTransactionSummaryComponent = (WalletTransactionSummaryComponent) obj5;
                State state = (State) obj4;
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249823578, iIntValue11, -1, "app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryMainScreen.<anonymous>.<anonymous> (WalletTransactionSummaryMainScreen.kt:32)");
                    }
                    if (((WalletTransactionSummaryState) state.getValue()).l) {
                        composer11.startReplaceGroup(-422654538);
                        String strC = StringResourcesHelperKt.c(StringEnum.VIEW_RECEIPT_CAPS, new Object[0], composer11, 6);
                        TextStyle bodyLarge = ChaloTheme.e(composer11, 0).getBodyLarge();
                        long j2 = ChaloTheme.a(composer11, 0).e;
                        Modifier.Companion companion9 = Modifier.INSTANCE;
                        boolean zChangedInstance = composer11.changedInstance(walletTransactionSummaryComponent);
                        Object objRememberedValue4 = composer11.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new jp1(walletTransactionSummaryComponent, 1);
                            composer11.updateRememberedValue(objRememberedValue4);
                        }
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(strC, ClickableKt.m299clickableoSLSa3U$default(companion9, false, null, null, null, (Function0) objRememberedValue4, 15, null), j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, bodyLarge, composer11, 0, 0, 131064);
                        nf1.t(companion9, ChaloTheme.b(composer11, 0).f, composer11, 0);
                    } else {
                        composer11.startReplaceGroup(-423935396);
                        composer11.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            default:
                Function1 function7 = (Function1) obj5;
                WalletTransactionUiModel walletTransactionUiModel = (WalletTransactionUiModel) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1390387370, iIntValue12, -1, "app.chalo.wallet.ui.transactionsContent.WalletTransactionCard.<anonymous> (WalletTransactionsContent.kt:43)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    boolean zChanged4 = composer12.changed(function7) | composer12.changed(walletTransactionUiModel);
                    Object objRememberedValue5 = composer12.rememberedValue();
                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new cm1(11, function7, walletTransactionUiModel);
                        composer12.updateRememberedValue(objRememberedValue5);
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default2, false, null, null, null, (Function0) objRememberedValue5, 15, null), ChaloTheme.b(composer12, 0).g);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top2, companion11.getStart(), composer12, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i8 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer12, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion12.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor6);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion12, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl6, Integer.valueOf(i8), composerM3915constructorimpl6));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    Alignment.Vertical centerVertically = companion11.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement2.getSpaceBetween();
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer12, 54);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i9 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxWidth$default3);
                    Function0<ComposeUiNode> constructor7 = companion12.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor7);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion12, composerM3915constructorimpl7, measurePolicyRowMeasurePolicy, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl7, Integer.valueOf(i9), composerM3915constructorimpl7));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str4 = walletTransactionUiModel.b;
                    TextStyle bodyLarge2 = ChaloTheme.e(composer12, 0).getBodyLarge();
                    FontWeight.Companion companion13 = FontWeight.INSTANCE;
                    FontWeight semiBold = companion13.getSemiBold();
                    long j3 = ChaloTheme.a(composer12, 0).e;
                    TextOverflow.Companion companion14 = TextOverflow.INSTANCE;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str4, i41.a(rowScopeInstance, companion10, 1.0f, false, 2, null), j3, null, 0L, null, semiBold, null, 0L, null, null, 0L, companion14.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, bodyLarge2, composer12, 1572864, 24960, 110520);
                    String str5 = walletTransactionUiModel.d;
                    TextStyle bodyLarge3 = ChaloTheme.e(composer12, 0).getBodyLarge();
                    FontWeight semiBold2 = companion13.getSemiBold();
                    WalletTransactionType transactionType = walletTransactionUiModel.h;
                    Intrinsics.i(transactionType, "transactionType");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1762973951, 0, -1, "app.chalo.wallet.ui.transactionsContent.getTransactionColor (WalletTransactionsContent.kt:152)");
                    }
                    int i10 = WalletTransactionsContentKt.WhenMappings.f10890a[transactionType.ordinal()];
                    if (i10 == 1) {
                        composer12.startReplaceGroup(2000857737);
                        j = ChaloTheme.a(composer12, 0).M0;
                        composer12.endReplaceGroup();
                    } else {
                        if (i10 != 2 && i10 != 3) {
                            throw pk0.p(composer12, 2000855185);
                        }
                        composer12.startReplaceGroup(2000861348);
                        j = ChaloTheme.a(composer12, 0).e;
                        composer12.endReplaceGroup();
                    }
                    long j4 = j;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str5, null, j4, null, 0L, null, semiBold2, null, 0L, null, null, 0L, companion14.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, bodyLarge3, composer12, 1572864, 24960, 110522);
                    composer12.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer12, 0).f), composer12, 0);
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion11.getTop(), composer12, 6);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i11 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxWidth$default4);
                    Function0<ComposeUiNode> constructor8 = companion12.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor8);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion12, composerM3915constructorimpl8, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl8, Integer.valueOf(i11), composerM3915constructorimpl8));
                    String str6 = walletTransactionUiModel.f;
                    if (str6 == null) {
                        str6 = "";
                    }
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str6, i41.a(rowScopeInstance, companion10, 1.0f, false, 2, null), ChaloTheme.a(composer12, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, companion14.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composer12, 0).getBodyMedium(), composer12, 0, 24960, 110584);
                    String str7 = walletTransactionUiModel.e;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str7 == null ? "" : str7, null, ChaloTheme.a(composer12, 0).h, null, 0L, null, null, null, 0L, null, null, 0L, companion14.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTheme.e(composer12, 0).getBodyMedium(), composer12, 0, 24960, 110586);
                    composer12.endNode();
                    if (walletTransactionUiModel.i) {
                        composer12.startReplaceGroup(-1253580691);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion10, ChaloTheme.b(composer12, 0).e), composer12, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion11.getCenterVertically(), composer12, 48);
                        long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                        int i12 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap9 = composer12.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer12, companion10);
                        Function0<ComposeUiNode> constructor9 = companion12.getConstructor();
                        if (composer12.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer12.startReusableNode();
                        if (composer12.getInserting()) {
                            composer12.createNode(constructor9);
                        } else {
                            composer12.useNode();
                        }
                        Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer12);
                        pk0.v(companion12, composerM3915constructorimpl9, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl9, currentCompositionLocalMap9);
                        Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl9, Integer.valueOf(i12), composerM3915constructorimpl9));
                        IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.INFO_OCCUPANCY, composer12, 6), (String) null, SizeKt.m828size3ABfNKs(companion10, ChaloTheme.b(composer12, 0).h), ChaloTheme.a(composer12, 0).i, composer12, Painter.$stable | 48, 0);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion10, ChaloTheme.b(composer12, 0).g), composer12, 0);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(walletTransactionUiModel.j, null, ChaloTheme.a(composer12, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer12, 0).getBodyMedium(), composer12, 0, 0, 131066);
                        composer12.endNode();
                    } else {
                        composer12.startReplaceGroup(-1257494162);
                    }
                    composer12.endReplaceGroup();
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
        }
    }
}
