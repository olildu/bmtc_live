package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.branding.ProductBookingBrandingKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContentKt;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LivePassengerIndicatorBottomSheetKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.uistate.NearestStopItemUIState;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchViewState;
import app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopsResultsSectionKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.livetracking.ui.routedetailsscreen.LivePassengerIndicatorBottomSheetContentUIState;
import app.chalo.metro.ui.regular.compose.PassengerSelectionKt;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenBottomSheetUiStateType;
import app.chalo.metro.ui.regular.uistate.StopBasedMetroLandingScreenViewState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUISpec;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.PassPassengerSelectionCardUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewConsentUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewNextBtnUIState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassBookingSuccessNextStepUIState;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationUISpec;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSectionItemUIState;
import app.chalo.productpurchase.productselection.ui.RecentProductItemTagText;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.ridehailing.feedback.RideFeedbackCtaUIState;
import app.chalo.ridehailing.feedback.RideFeedbackReasonCardUIState;
import app.chalo.ridehailing.feedback.RideFeedbackSubtagCardUIState;
import app.chalo.routeselection.ui.RouteSelectionBottomSheetType;
import app.chalo.routeselection.ui.compose.FromAndToStopComponentKt;
import app.chalo.stoptripdetails.ui.StopTripDetailsViewState;
import app.chalo.tripreceipt.tripreceiptnew.RideReceiptViewState;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiArrangementKt;
import app.chalo.uistate.branding.ProductBookingBrandingUIState;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateKt;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.multimodal.StepBasedRouteDetailCardUISpecs;
import app.chalo.uistate.multimodal.StepBasedRouteDetailCardUIState;
import app.chalo.uistate.multimodal.StepBasedRouteDetailUIState;
import app.chalo.uistate.multimodal.StepBasedRouteDetailsSectionUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.text.FlowTextUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.validationsdk.blevalidation.ui.common.QRValidationBottomSheetUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenUIState;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationUIState;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import coil3.compose.SingletonAsyncImageKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sx0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19609a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sx0(Object obj, int i) {
        this.f19609a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        PassPassengerSelectionCardUIState passPassengerSelectionCardUIState = (PassPassengerSelectionCardUIState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963100061, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.passengerselection.PassPassengerSelectionCard.<anonymous> (SuperPassPassengerSelectionUI.kt:84)");
            }
            TextKt.c(passPassengerSelectionCardUIState.f8443a, ChaloThemeKt.c(ComposeUtilsKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), passPassengerSelectionCardUIState.b, composer, 6, 6), passPassengerSelectionCardUIState.d), null, null, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        SuperPassProofOverviewNextBtnUIState superPassProofOverviewNextBtnUIState = (SuperPassProofOverviewNextBtnUIState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(672329403, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewNextBtn.<anonymous>.<anonymous> (SuperPassProofOverviewScreen.kt:453)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassProofOverviewNextBtnUIState.e);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState = superPassProofOverviewNextBtnUIState.b;
            if (superPassProofOverviewConsentUIState == null) {
                composer.startReplaceGroup(-1766193494);
            } else {
                composer.startReplaceGroup(-1766193493);
                SuperPassProofOverviewScreenKt.e(superPassProofOverviewConsentUIState, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, 48);
            }
            composer.endReplaceGroup();
            Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassProofOverviewNextBtnUIState.f);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            TextUIState textUIState = superPassProofOverviewNextBtnUIState.c;
            if (textUIState == null) {
                composer.startReplaceGroup(-164144963);
            } else {
                composer.startReplaceGroup(-164144962);
                TextKt.c(textUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassProofOverviewNextBtnUIState.g), null, null, composer, 0, 12);
            }
            composer.endReplaceGroup();
            ChaloFilledButtonKt.a(6, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassProofOverviewNextBtnUIState.f8478a);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        SuperPassVerificationUIState superPassVerificationUIState = (SuperPassVerificationUIState) this.b;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-967296217, iIntValue, -1, "app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenContent.<anonymous> (SuperPassVerificationStatusScreen.kt:55)");
            }
            ImageUIState imageUIState = superPassVerificationUIState.c;
            SuperPassVerificationUISpec superPassVerificationUISpec = superPassVerificationUIState.f8520a;
            Modifier.Companion companion = Modifier.INSTANCE;
            CommonImageKt.a(imageUIState, SizeKt.fillMaxSize$default(ChaloThemeKt.c(companion, superPassVerificationUISpec.d), 0.0f, 1, null), false, composer, 0, 4);
            TextKt.c(superPassVerificationUIState.d, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassVerificationUISpec.e), null, null, composer, 0, 12);
            TextKt.c(superPassVerificationUIState.e, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), superPassVerificationUISpec.f), null, null, composer, 0, 12);
            composer.startReplaceGroup(-1858710218);
            for (SuperPassBookingSuccessNextStepUIState superPassBookingSuccessNextStepUIState : superPassVerificationUIState.f) {
                SuperPassVerificationStatusScreenKt.c(superPassBookingSuccessNextStepUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassBookingSuccessNextStepUIState.d), composer, 0);
            }
            composer.endReplaceGroup();
            ChaloSpacersKt.a(superPassVerificationUISpec.g, composer, 0);
            ChaloFilledButtonKt.a(0, 0, composer, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassVerificationUISpec.h), superPassVerificationUIState.g);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$5((TextFieldDecoratorModifierNode) this.b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0((TextFieldSelectionManager) this.b, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        return TextFieldSizeKt.textFieldMinSize$lambda$0((TextStyle) this.b, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        String str;
        Composer composer;
        int i = this.f19609a;
        float f2 = 0.0f;
        int i2 = 0;
        Unit unit = Unit.f17538a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ProductSelectionSectionItemUIState.RecentProductItemUIState recentProductItemUIState = (ProductSelectionSectionItemUIState.RecentProductItemUIState) obj4;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer2.changed(FlowRow) ? 4 : 2;
                }
                if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(804921584, iIntValue, -1, "app.chalo.productpurchase.productselection.ui.RecentProductItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductSelectionScreen.kt:340)");
                    }
                    TextKt.c(recentProductItemUIState.d, null, null, null, composer2, 0, 14);
                    List<RecentProductItemTagText> list = recentProductItemUIState.h;
                    if (list == null) {
                        composer2.startReplaceGroup(616595848);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(616595849);
                        composer2.startReplaceGroup(435533186);
                        for (RecentProductItemTagText recentProductItemTagText : list) {
                            TextKt.c(recentProductItemTagText.f8700a, ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(FlowRow.align(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, recentProductItemUIState.f8695a.d, 0.0f, 2, null), Alignment.INSTANCE.getCenterVertically()), ChaloColorTokenKt.c(recentProductItemTagText.b), null, 2, null), recentProductItemTagText.c), null, null, composer2, 0, 12);
                        }
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                PromotionCardItem promotionCardItem = (PromotionCardItem) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2090444743, iIntValue2, -1, "app.chalo.wallet.ui.promotionscardcontainer.PromotionCard.<anonymous> (PromotionsCardContainer.kt:86)");
                    }
                    SingletonAsyncImageKt.a(promotionCardItem.f11086a, null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ContentScale.INSTANCE.getCrop(), composer3, 1573296, 1976);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState productPurchaseBottomSheetUiState = (MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= composer4.changed(iIntValue3) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue4 & 19) != 18, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-891922158, iIntValue4, -1, "app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContent.<anonymous>.<anonymous> (PurchaseProductBottomSheetContent.kt:50)");
                    }
                    PurchaseProductBottomSheetContentKt.a(null, (ChaloWidgetCardUiState) productPurchaseBottomSheetUiState.e.b.get(iIntValue3), composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                QRValidationBottomSheetUIState qRValidationBottomSheetUIState = (QRValidationBottomSheetUIState) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer5.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1555707042, iIntValue5, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreen.<anonymous>.<anonymous> (QRValidationScreen.kt:103)");
                    }
                    QRValidationScreenKt.b(qRValidationBottomSheetUIState, composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 4:
                TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = (TextWithLeftAndRightIconUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer6.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1597282588, iIntValue6, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRWithProductDetailsComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QRValidationScreen.kt:259)");
                    }
                    Modifier modifierB = ComposeUtilsKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), textWithLeftAndRightIconUIState.b.j, composer6, 6, 6);
                    float f3 = ChaloTheme.b(composer6, 0).h;
                    float f4 = ChaloTheme.b(composer6, 0).h;
                    TextWithLeftAndTrailingRightIconComponentKt.a(ChaloThemeKt.c(modifierB, new ChaloPadding(f4, f3, f3, f4)), new TextWithLeftAndRightIconUIState(textWithLeftAndRightIconUIState.f10114a, TextUIState.ChaloTextUIState.a(textWithLeftAndRightIconUIState.b, null, null, null, 7935), textWithLeftAndRightIconUIState.c, textWithLeftAndRightIconUIState.d, textWithLeftAndRightIconUIState.e), composer6, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                QRValidationUIState qRValidationUIState = (QRValidationUIState) obj4;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1543998631, iIntValue7, -1, "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationMainContent.<anonymous>.<anonymous> (QRValidationScreen.kt:187)");
                }
                QRValidationScreenUIState qRValidationScreenUIState = qRValidationUIState.b;
                if (qRValidationScreenUIState instanceof QRValidationScreenUIState.QRZoomed) {
                    composer7.startReplaceGroup(1836669648);
                    QRValidationScreenUIState.QRZoomed qRZoomed = (QRValidationScreenUIState.QRZoomed) qRValidationScreenUIState;
                    String str2 = qRZoomed.b;
                    if (str2 == null) {
                        composer7.startReplaceGroup(1836669647);
                    } else {
                        composer7.startReplaceGroup(1836669648);
                        QRValidationScreenKt.m(str2, qRZoomed.c, null, composer7, 0);
                    }
                    composer7.endReplaceGroup();
                    composer7.endReplaceGroup();
                } else {
                    composer7.startReplaceGroup(-2018954467);
                    composer7.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 6:
                RideReceiptViewState rideReceiptViewState = (RideReceiptViewState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer8.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-830559587, iIntValue8, -1, "app.chalo.tripreceipt.tripreceiptnew.ui.RideReceiptMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RideReceiptMainScreen.kt:42)");
                    }
                    Modifier modifierC = ChaloThemeKt.c(Modifier.INSTANCE, rideReceiptViewState.f9743a.f9742a);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer8, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer8, modifierC);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, rideReceiptViewState.c, null, null, composer8, 0, 13);
                    ChaloSpacersKt.m(composer8, 0);
                    ChaloTextViewKt.a(null, rideReceiptViewState.d, null, null, composer8, 0, 13);
                    composer8.endNode();
                    DividerUIStateKt.a(null, rideReceiptViewState.e, composer8, 0, 1);
                    ChaloSpacersKt.o(composer8, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 7:
                RideFeedbackReasonCardUIState rideFeedbackReasonCardUIState = (RideFeedbackReasonCardUIState) obj4;
                Composer composer9 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i((FlowRowScope) obj, "$this$FlowRow");
                if (composer9.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-391299915, iIntValue9, -1, "app.chalo.ridehailing.feedback.RideFeedbackReasonCard.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:330)");
                    }
                    Iterator it = rideFeedbackReasonCardUIState.c.iterator();
                    while (it.hasNext()) {
                        ChaloFilledButtonKt.a(0, 1, composer9, null, ButtonUIStateKt.a((ButtonUIState) it.next(), composer9));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 8:
                RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState = (RideFeedbackSubtagCardUIState) obj4;
                Composer composer10 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i((FlowRowScope) obj, "$this$FlowRow");
                if (composer10.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1456319499, iIntValue10, -1, "app.chalo.ridehailing.feedback.RideFeedbackSubtagCard.<anonymous>.<anonymous> (RideUserFeedbackScreen.kt:371)");
                    }
                    ArrayList arrayList = rideFeedbackSubtagCardUIState.c;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj5 = arrayList.get(i4);
                        i4++;
                        ChaloFilledButtonKt.a(0, 1, composer10, null, ButtonUIStateKt.a((ButtonUIState) obj5, composer10));
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 9:
                RideFeedbackCtaUIState rideFeedbackCtaUIState = (RideFeedbackCtaUIState) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer11.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-100804353, iIntValue11, -1, "app.chalo.ridehailing.feedback.RideFeedbackCta.<anonymous> (RideUserFeedbackScreen.kt:385)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierC2 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), rideFeedbackCtaUIState.f9140a.c);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer11, modifierC2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor2);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ButtonUIState buttonUIState = rideFeedbackCtaUIState.b;
                    if (buttonUIState == null) {
                        composer11.startReplaceGroup(285506007);
                        composer11.endReplaceGroup();
                        f = 0.0f;
                    } else {
                        composer11.startReplaceGroup(285506008);
                        f = 0.0f;
                        ChaloFilledButtonKt.a(6, 0, composer11, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), buttonUIState);
                        ChaloSpacersKt.a(rideFeedbackCtaUIState.f9140a.f9139a, composer11, 0);
                        composer11.endReplaceGroup();
                    }
                    if (b3.s(6, 0, composer11, SizeKt.fillMaxWidth$default(companion2, f, 1, null), rideFeedbackCtaUIState.c)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 10:
                LivePassengerIndicatorBottomSheetContentUIState livePassengerIndicatorBottomSheetContentUIState = (LivePassengerIndicatorBottomSheetContentUIState) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer12.shouldExecute((iIntValue12 & 17) != 16, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1328855979, iIntValue12, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteDetailsScreenContent.<anonymous>.<anonymous> (RouteDetailsMainScreen.kt:124)");
                    }
                    LivePassengerIndicatorBottomSheetKt.a(livePassengerIndicatorBottomSheetContentUIState, BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(livePassengerIndicatorBottomSheetContentUIState.f4812a.f4811a), null, 2, null), composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 11:
                RouteSelectionBottomSheetType.MultipleRouteAvailable multipleRouteAvailable = (RouteSelectionBottomSheetType.MultipleRouteAvailable) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer13.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1514096907, iIntValue13, -1, "app.chalo.routeselection.ui.compose.MultipleRoutesComposable.<anonymous>.<anonymous>.<anonymous> (RouteSelectionBottomSheet.kt:168)");
                    }
                    String str3 = multipleRouteAvailable.b;
                    if (str3 == null || str3.length() == 0 || (str = multipleRouteAvailable.c) == null || str.length() == 0) {
                        composer13.startReplaceGroup(-720536467);
                        composer13.endReplaceGroup();
                    } else {
                        composer13.startReplaceGroup(-714294183);
                        FromAndToStopComponentKt.a(multipleRouteAvailable.b, multipleRouteAvailable.c, null, null, composer13, 0);
                        gf.r(Modifier.INSTANCE, ChaloTheme.b(composer13, 0).h, composer13, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 12:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0((SelectionManager) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SemaphoreAndMutexImpl.c;
                ((SemaphoreAndMutexImpl) obj4).release();
                return unit;
            case 14:
                StepBasedRouteDetailsSectionUIState stepBasedRouteDetailsSectionUIState = (StepBasedRouteDetailsSectionUIState) obj4;
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2136537972, iIntValue14, -1, "app.chalo.compose.components.multimodal.StepBasedRouteDetailsSectionComposable.<anonymous>.<anonymous> (StepBasedRouteDetailsSectionComposable.kt:55)");
                }
                StepBasedRouteDetailUIState stepBasedRouteDetailUIState = stepBasedRouteDetailsSectionUIState.c;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(UiArrangementKt.a(stepBasedRouteDetailUIState.f10049a.f10048a), Alignment.INSTANCE.getStart(), composer14, 0);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composer14.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer14, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer14.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer14.startReusableNode();
                if (composer14.getInserting()) {
                    composer14.createNode(constructor3);
                } else {
                    composer14.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer14);
                pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                composer14.startReplaceGroup(240008522);
                for (StepBasedRouteDetailCardUIState stepBasedRouteDetailCardUIState : stepBasedRouteDetailUIState.b) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion5, f2, 1, null);
                    StepBasedRouteDetailCardUISpecs stepBasedRouteDetailCardUISpecs = stepBasedRouteDetailCardUIState.f10047a;
                    StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = stepBasedRouteDetailCardUIState.b;
                    Modifier modifierC3 = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(modifierFillMaxWidth$default2, ChaloColorTokenKt.c(stepBasedRouteDetailCardUISpecs.c), ChaloThemeKt.d(stepBasedRouteDetailCardUISpecs.d)), stepBasedRouteDetailCardUISpecs.f10046a);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), UiAlignmentKt.b(stepBasedRouteDetailCardUISpecs.f), composer14, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i7 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer14, modifierC3);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor4);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i7), composerM3915constructorimpl4));
                    Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion5, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i8 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer14, modifierA);
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor5);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion6, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i8), composerM3915constructorimpl5));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Bus) {
                        composer14.startReplaceGroup(-789241809);
                        ModeTicketStepInfoComposablesKt.a((StepTicketModeBasedInfoUIState.Bus) stepTicketModeBasedInfoUIState, null, composer14, 0, 2);
                        composer14.endReplaceGroup();
                    } else {
                        if (!(stepTicketModeBasedInfoUIState instanceof StepTicketModeBasedInfoUIState.Metro)) {
                            throw pk0.p(composer14, -789245111);
                        }
                        composer14.startReplaceGroup(-789237391);
                        ModeTicketStepInfoComposablesKt.b((StepTicketModeBasedInfoUIState.Metro) stepTicketModeBasedInfoUIState, null, composer14, 0, 2);
                        composer14.endReplaceGroup();
                    }
                    composer14.endNode();
                    ProductBookingBrandingUIState.ImageResourceBrandingUIState imageResourceBrandingUIState = stepBasedRouteDetailCardUIState.c;
                    if (imageResourceBrandingUIState == null) {
                        composer14.startReplaceGroup(-37975417);
                    } else {
                        composer14.startReplaceGroup(-37975416);
                        ProductBookingBrandingKt.a(ChaloThemeKt.c(companion5, imageResourceBrandingUIState.c), imageResourceBrandingUIState, composer14, 0, 0);
                    }
                    composer14.endReplaceGroup();
                    composer14.endNode();
                    f2 = 0.0f;
                }
                if (b3.t(composer14)) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 15:
                StopBasedMetroLandingScreenViewState stopBasedMetroLandingScreenViewState = (StopBasedMetroLandingScreenViewState) obj4;
                ColumnScope ChaloRoundedBottomSheet3 = (ColumnScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet3, "$this$ChaloRoundedBottomSheet");
                if (composer15.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1583877208, iIntValue15, -1, "app.chalo.metro.ui.regular.compose.StopBasedMetroLandingScreenUI.<anonymous> (StopBasedMetroLandingScreenUI.kt:60)");
                    }
                    StopBasedMetroLandingScreenBottomSheetUiStateType stopBasedMetroLandingScreenBottomSheetUiStateType = stopBasedMetroLandingScreenViewState.f;
                    if (Intrinsics.d(stopBasedMetroLandingScreenBottomSheetUiStateType, StopBasedMetroLandingScreenBottomSheetUiStateType.None.b)) {
                        composer15.startReplaceGroup(775326632);
                        composer15.endReplaceGroup();
                    } else {
                        if (!(stopBasedMetroLandingScreenBottomSheetUiStateType instanceof StopBasedMetroLandingScreenBottomSheetUiStateType.PassengerSelection)) {
                            throw pk0.p(composer15, 1687575215);
                        }
                        composer15.startReplaceGroup(775433055);
                        PassengerSelectionKt.a(null, ((StopBasedMetroLandingScreenBottomSheetUiStateType.PassengerSelection) stopBasedMetroLandingScreenViewState.f).c, composer15, 0);
                        composer15.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 16:
                NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState = (NearbyStopResultsContainerUiState) obj4;
                LazyItemScope item3 = (LazyItemScope) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                Intrinsics.i(item3, "$this$item");
                if (composer16.shouldExecute((iIntValue16 & 17) != 16, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(733666494, iIntValue16, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:307)");
                    }
                    NearbyStopsResultsSectionKt.b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), nearbyStopResultsContainerUiState, composer16, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 17:
                NearestStopItemUIState nearestStopItemUIState = (NearestStopItemUIState) obj4;
                LazyItemScope item4 = (LazyItemScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                Intrinsics.i(item4, "$this$item");
                if (composer17.shouldExecute((iIntValue17 & 17) != 16, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(356127428, iIntValue17, -1, "app.chalo.livetracking.search.compose.NearestStopsBottomSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerSearchScreen.kt:366)");
                    }
                    StopBasedTripPlannerSearchScreenKt.a(null, nearestStopItemUIState, composer17, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 18:
                StopBasedTripPlannerSearchViewState stopBasedTripPlannerSearchViewState = (StopBasedTripPlannerSearchViewState) obj4;
                ColumnScope ModalBottomSheet = (ColumnScope) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                if (composer18.shouldExecute((iIntValue18 & 17) != 16, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-809931248, iIntValue18, -1, "app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreen.<anonymous> (StopBasedTripPlannerSearchScreen.kt:123)");
                    }
                    StopBasedTripPlannerSearchBottomSheetUiStateType stopBasedTripPlannerSearchBottomSheetUiStateType = stopBasedTripPlannerSearchViewState.f;
                    if (Intrinsics.d(stopBasedTripPlannerSearchBottomSheetUiStateType, StopBasedTripPlannerSearchBottomSheetUiStateType.None.b)) {
                        composer18.startReplaceGroup(464587792);
                        composer18.endReplaceGroup();
                    } else if (stopBasedTripPlannerSearchBottomSheetUiStateType instanceof StopBasedTripPlannerSearchBottomSheetUiStateType.NearestStops) {
                        composer18.startReplaceGroup(464682373);
                        StopBasedTripPlannerSearchScreenKt.b(((StopBasedTripPlannerSearchBottomSheetUiStateType.NearestStops) stopBasedTripPlannerSearchBottomSheetUiStateType).c, composer18, 0);
                        composer18.endReplaceGroup();
                    } else {
                        if (!(stopBasedTripPlannerSearchBottomSheetUiStateType instanceof StopBasedTripPlannerSearchBottomSheetUiStateType.NearestStopFetchError)) {
                            throw pk0.p(composer18, -954847595);
                        }
                        composer18.startReplaceGroup(465039121);
                        BottomSheetContentWithIconTitleSubTitleKt.a(null, ((StopBasedTripPlannerSearchBottomSheetUiStateType.NearestStopFetchError) stopBasedTripPlannerSearchBottomSheetUiStateType).b, composer18, 0, 1);
                        composer18.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 19:
                StopTripDetailsViewState stopTripDetailsViewState = (StopTripDetailsViewState) obj4;
                RowScope ChaloToolBar = (RowScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
                if (composer19.shouldExecute((iIntValue19 & 17) != 16, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1723694066, iIntValue19, -1, "app.chalo.stoptripdetails.ui.StopDetailScreenToolBar.<anonymous> (StopTripDetailsScreen.kt:311)");
                    }
                    String str4 = stopTripDetailsViewState.d;
                    if (str4 == null || str4.length() == 0) {
                        composer = composer19;
                        composer.startReplaceGroup(47521908);
                    } else {
                        composer19.startReplaceGroup(59149698);
                        IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.WALK_NEARBYCARD_BLACK, composer19, 6), "", (Modifier) null, ChaloTheme.a(composer19, 0).g, composer19, Painter.$stable | 48, 4);
                        composer = composer19;
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(stopTripDetailsViewState.d, PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null), ChaloTheme.a(composer, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.l(ChaloTheme.e(composer, 0)), composer, 0, 0, 131064);
                    }
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 20:
                SuperPassBookingSuccessDetailsUIState superPassBookingSuccessDetailsUIState = (SuperPassBookingSuccessDetailsUIState) obj4;
                ColumnScope Card3 = (ColumnScope) obj;
                Composer composer20 = (Composer) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                Intrinsics.i(Card3, "$this$Card");
                if (composer20.shouldExecute((iIntValue20 & 17) != 16, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1274468847, iIntValue20, -1, "app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetails.<anonymous> (SuperPassBookingSuccessDetailsUI.kt:31)");
                    }
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null);
                    SuperPassBookingSuccessDetailsUISpec superPassBookingSuccessDetailsUISpec = superPassBookingSuccessDetailsUIState.f8343a;
                    Modifier modifierC4 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default3, ChaloColorTokenKt.c(superPassBookingSuccessDetailsUISpec.b), null, 2, null), superPassBookingSuccessDetailsUISpec.c);
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer20, 0);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer20, 0);
                    int i9 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer20.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer20, modifierC4);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composer20.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer20.startReusableNode();
                    if (composer20.getInserting()) {
                        composer20.createNode(constructor6);
                    } else {
                        composer20.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer20);
                    pk0.v(companion8, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl6, Integer.valueOf(i9), composerM3915constructorimpl6));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    TextKt.c(superPassBookingSuccessDetailsUIState.b, SizeKt.fillMaxWidth$default(companion7, 0.0f, 1, null), null, null, composer20, 48, 12);
                    composer20.startReplaceGroup(1661619771);
                    ArrayList arrayList2 = superPassBookingSuccessDetailsUIState.c;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj6 = arrayList2.get(i10);
                        i10++;
                        SuperPassBookingSuccessDetailsUIKt.d((app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessNextStepUIState) obj6, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassBookingSuccessDetailsUISpec.f), composer20, 0);
                    }
                    composer20.endReplaceGroup();
                    ButtonUIState buttonUIState2 = superPassBookingSuccessDetailsUIState.d;
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    ChaloFilledButtonKt.a(0, 0, composer20, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), superPassBookingSuccessDetailsUISpec.d), buttonUIState2);
                    if (b3.s(0, 0, composer20, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), superPassBookingSuccessDetailsUISpec.e), superPassBookingSuccessDetailsUIState.e)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return unit;
            case 21:
                SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState = (SuperPassEnterUserDetailsUIState) obj4;
                ColumnScope Card4 = (ColumnScope) obj;
                Composer composer21 = (Composer) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                Intrinsics.i(Card4, "$this$Card");
                if (composer21.shouldExecute((iIntValue21 & 17) != 16, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2112680052, iIntValue21, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:182)");
                    }
                    ChaloFilledButtonKt.a(0, 0, composer21, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), superPassEnterUserDetailsUIState.d.d), superPassEnterUserDetailsUIState.c);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return unit;
            case 22:
                DividerUIState dividerUIState = (DividerUIState) obj4;
                LazyItemScope item5 = (LazyItemScope) obj;
                Composer composer22 = (Composer) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                Intrinsics.i(item5, "$this$item");
                if (composer22.shouldExecute((iIntValue22 & 17) != 16, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(621642112, iIntValue22, -1, "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SuperPassEnterUserDetailsScreen.kt:162)");
                    }
                    DividerUIStateKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), dividerUIState, composer22, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return unit;
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return c(obj, obj2, obj3);
            case 25:
                return d(obj, obj2, obj3);
            case 26:
                return e(obj, obj2, obj3);
            case 27:
                return f(obj, obj2, obj3);
            case 28:
                return g(obj, obj2, obj3);
            default:
                FlowTextUIState flowTextUIState = (FlowTextUIState) obj4;
                Composer composer23 = (Composer) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                Intrinsics.i((FlowRowScope) obj, "$this$FlowRow");
                if (composer23.shouldExecute((iIntValue23 & 17) != 16, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(803018194, iIntValue23, -1, "app.chalo.compose.components.FlowText.<anonymous> (Text.kt:56)");
                    }
                    ArrayList arrayList3 = flowTextUIState.f10081a;
                    int size3 = arrayList3.size();
                    while (i2 < size3) {
                        Object obj7 = arrayList3.get(i2);
                        i2++;
                        TextKt.c((TextUIState.ChaloTextUIState) obj7, null, null, null, composer23, 0, 14);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return unit;
        }
    }
}
