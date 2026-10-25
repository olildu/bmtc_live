package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.chalo.compose.TextWithLeftAndTrailingRightIconComponentKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloScrollableTabRowKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.multimodal.ModeTicketStepInfoComposablesKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.nearbytrips.data.model.NearbyStopAndTripsUiModel;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapScreenKt;
import app.chalo.home.ui.history.compose.components.PurchaseProductBottomSheetContentKt;
import app.chalo.home.ui.history.uistate.ChaloWidgetCardUiState;
import app.chalo.home.ui.history.uistate.EmptyScreenProductBookingOptionsUiState;
import app.chalo.home.ui.history.uistate.EmptyScreenUiState;
import app.chalo.home.ui.history.uistate.ProductsTabUiState;
import app.chalo.kyc.min.ui.minkycotp.GenericErrorBottomSheetUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpCharUISpecs;
import app.chalo.kyc.min.ui.minkycotp.OtpCharUIState;
import app.chalo.kyc.min.ui.minkycotp.OtpTextFieldUIState;
import app.chalo.kyc.min.ui.minkycotp.composables.GenericErrorBottomSheetKt;
import app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreenUIKt;
import app.chalo.login.ui.otp.LoginOtpEnterIndividualBoxUIState;
import app.chalo.login.ui.otp.LoginOtpEnterTextFieldUIState;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.metro.ui.landing.compose.components.LineSelectionBottomSheetContentKt;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenBottomSheetUiStateType;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import app.chalo.multimodalticket.ui.IndividualStepsTicketCardUISpecs;
import app.chalo.multimodalticket.ui.IndividualStepsTicketCardUIState;
import app.chalo.multimodalticket.ui.composables.StepModeCardComposableKt;
import app.chalo.multimodalticket.ui.uistates.StepTicketSectionUIState;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationViewState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotAndSeatInfoUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.SlotDatePillUIState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingSuccessMainScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsCommonViewsKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenType;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.MultipleOriginDestinationSelectionScreenKt;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassPurchaseLandingScreenKt;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUISpec;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCtaItemUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt;
import app.chalo.productactivation.ui.UserProfilingTicketActivationBannerUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductItemUISpec;
import app.chalo.productpurchase.productselection.ui.ProductSelectionProductsListSectionUIState;
import app.chalo.productpurchase.productselection.ui.ProductSelectionScreenKt;
import app.chalo.productpurchase.productselection.ui.ProductSelectionSectionItemUIState;
import app.chalo.productsummary.ui.data.TripHistoryCardUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.multimodal.StepTicketModeBasedInfoUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiChildQRCard;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildCardUISpec;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildCardUIState;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationScreenKt;
import app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class la0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18295a;
    public final /* synthetic */ Object b;

    public /* synthetic */ la0(Object obj, int i) {
        this.f18295a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        long j;
        MutableState mutableState = (MutableState) this.b;
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(modifier, "modifier");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1615231210, iIntValue, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OnlineBalance.<anonymous>.<anonymous>.<anonymous> (OfflineCardRechargeScreen.kt:363)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(1754004239);
                j = ChaloTheme.a(composer, 0).t;
            } else {
                composer.startReplaceGroup(1754005149);
                j = ChaloTheme.a(composer, 0).r0;
            }
            composer.endReplaceGroup();
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion, j, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new t1(mutableState, 21);
                composer.updateRememberedValue(objRememberedValue);
            }
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_INFO_GREY, composer, 6), (String) null, ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null), ChaloTheme.a(composer, 0).e, composer, Painter.$stable | 48, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        TripHistoryCardUIState tripHistoryCardUIState = (TripHistoryCardUIState) this.b;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744388737, iIntValue, -1, "app.chalo.productsummary.ui.compose.ViewTripHistoryComponent.<anonymous> (PassSummarySuccessMainScreen.kt:363)");
            }
            TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = tripHistoryCardUIState.d;
            if (textWithLeftAndRightIconUIState == null) {
                composer.startReplaceGroup(2019464723);
            } else {
                composer.startReplaceGroup(2019464724);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean zChangedInstance = composer.changedInstance(tripHistoryCardUIState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new kn0(tripHistoryCardUIState, 7);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TextWithLeftAndTrailingRightIconComponentKt.a(ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), tripHistoryCardUIState.f8762a), textWithLeftAndRightIconUIState, composer, 0, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails = (PremiumBusPostActivationStopDetails) this.b;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(749329343, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostActivationRouteDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostValidationScreen.kt:538)");
            }
            PostValidationScreenKt.e(SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 0).g), 0.0f, 1, null), premiumBusPostActivationStopDetails.d, false, composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        PremiumBusBulkBookingConfirmationViewState premiumBusBulkBookingConfirmationViewState = (PremiumBusBulkBookingConfirmationViewState) this.b;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-544596377, iIntValue, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PremiumBusBulkBookingConfirmationContent.<anonymous> (PremiumBusBulkBookingSuccessMainScreen.kt:88)");
            }
            PremiumBusBulkBookingSuccessMainScreenKt.h(premiumBusBulkBookingConfirmationViewState.h, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        PassInfoUIState passInfoUIState = (PassInfoUIState) this.b;
        FlowRowScope FlowRow = (FlowRowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-788021387, iIntValue, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.PassDataCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusBulkBookingSuccessMainScreen.kt:363)");
            }
            ChaloTextViewKt.a(null, passInfoUIState.d, null, null, composer, 0, 13);
            TextKt.m2623TextNvy7gAk(" • ", null, ChaloTheme.a(composer, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer, 0)), composer, 6, 0, 131066);
            ChaloTextViewKt.a(null, passInfoUIState.e, null, null, composer, 0, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        SlotAndSeatInfoUIState slotAndSeatInfoUIState = (SlotAndSeatInfoUIState) this.b;
        FlowRowScope FlowRow = (FlowRowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897833307, iIntValue, -1, "app.chalo.premiumbus.ui.bulkbookingsuccess.compose.SlotAndSeatInfoItem.<anonymous>.<anonymous> (PremiumBusBulkBookingSuccessMainScreen.kt:294)");
            }
            Iterator it = slotAndSeatInfoUIState.e.iterator();
            while (it.hasNext()) {
                PremiumBusBulkBookingSuccessMainScreenKt.g((SlotDatePillUIState) it.next(), composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        PremiumBusFareDetailsBottomSheetUiState premiumBusFareDetailsBottomSheetUiState = (PremiumBusFareDetailsBottomSheetUiState) this.b;
        ColumnScope ModalBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470713390, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsBottomSheet.<anonymous> (PremiumBusFareDetailsBottomSheets.kt:37)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
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
            if (premiumBusFareDetailsBottomSheetUiState instanceof PremiumBusFareDetailsBottomSheetUiState.TncSection) {
                composer.startReplaceGroup(-1133153062);
                PremiumBusFareDetailsBottomSheetUiState.TncSection tncSection = (PremiumBusFareDetailsBottomSheetUiState.TncSection) premiumBusFareDetailsBottomSheetUiState;
                ChaloTextViewKt.a(null, tncSection.f7571a, null, null, composer, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).h), composer, 0);
                ChaloTextViewKt.a(null, tncSection.b, null, null, composer, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).i), composer, 0);
                ChaloFilledButtonKt.a(6, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), tncSection.c);
                composer.endReplaceGroup();
            } else if (premiumBusFareDetailsBottomSheetUiState instanceof PremiumBusFareDetailsBottomSheetUiState.FareNoteSection) {
                composer.startReplaceGroup(-1132586103);
                PremiumBusFareDetailsBottomSheetUiState.FareNoteSection fareNoteSection = (PremiumBusFareDetailsBottomSheetUiState.FareNoteSection) premiumBusFareDetailsBottomSheetUiState;
                ChaloTextViewKt.a(null, fareNoteSection.f7569a, null, null, composer, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).h), composer, 0);
                ChaloFilledButtonKt.a(6, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fareNoteSection.b);
                composer.endReplaceGroup();
            } else {
                if (!(premiumBusFareDetailsBottomSheetUiState instanceof PremiumBusFareDetailsBottomSheetUiState.FareValidationFailed)) {
                    throw pk0.p(composer, 656182156);
                }
                composer.startReplaceGroup(-1132131054);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
                SpacerKt.Spacer(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), composer, 0);
                PremiumBusFareDetailsBottomSheetUiState.FareValidationFailed fareValidationFailed = (PremiumBusFareDetailsBottomSheetUiState.FareValidationFailed) premiumBusFareDetailsBottomSheetUiState;
                CommonImageKt.a(fareValidationFailed.b, null, false, composer, 0, 6);
                composer = composer;
                composer.endNode();
                ChaloTextViewKt.a(null, fareValidationFailed.f7570a, null, null, composer, 0, 13);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).h), composer, 0);
                ChaloFilledButtonKt.a(0, 0, composer, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).n), fareValidationFailed.c);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).g), composer, 0);
                ChaloFilledButtonKt.a(0, 0, composer, SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).n), fareValidationFailed.d);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        PremiumBusFareDetailsContent.PassUpsellNudge passUpsellNudge = (PremiumBusFareDetailsContent.PassUpsellNudge) this.b;
        ColumnScope PremiumBusFareDetailsBand = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(PremiumBusFareDetailsBand, "$this$PremiumBusFareDetailsBand");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1890620478, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellNudgeScreen.<anonymous>.<anonymous>.<anonymous> (PremiumBusPassUpsellNudgeScreen.kt:69)");
            }
            ChaloTextViewKt.a(null, passUpsellNudge.f7576a, null, null, composer, 0, 13);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 0).g), composer, 0);
            PremiumBusFareDetailsCommonViewsKt.d(passUpsellNudge.c, null, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        BookingInfoBannerUIState bookingInfoBannerUIState = (BookingInfoBannerUIState) this.b;
        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1141138788, iIntValue, -1, "app.chalo.premiumbus.ui.seatselection.compose.SeatSelectionMainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSeatSelectionMainScreen.kt:251)");
        }
        if (bookingInfoBannerUIState == null) {
            composer.startReplaceGroup(-999387910);
        } else {
            BookingInfoBannerUISpecs bookingInfoBannerUISpecs = bookingInfoBannerUIState.c;
            composer.startReplaceGroup(-999387909);
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, bookingInfoBannerUISpecs.f7764a), 0.0f, 1, null), ChaloColorTokenKt.c(bookingInfoBannerUISpecs.b), ChaloThemeKt.d(bookingInfoBannerUISpecs.c)), bookingInfoBannerUISpecs.d);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(bookingInfoBannerUIState.b, null, false, composer, 0, 6);
            ChaloSpacersKt.w(composer, 0);
            ChaloTextViewKt.a(null, bookingInfoBannerUIState.f7765a, null, null, composer, 0, 13);
            composer = composer;
            composer.endNode();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        TextUIState.ChaloTextUIState chaloTextUIState = (TextUIState.ChaloTextUIState) this.b;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-274509773, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotPageContent.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionScreen.kt:517)");
            }
            ChaloSpacersKt.p(composer, 0);
            ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer, 0, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState = (PremiumBusBottomSheetTypeUIState) this.b;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1977323299, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.SlotSelectionBottomSheetHandling.<anonymous> (PremiumBusSlotSelectionScreen.kt:217)");
            }
            if (premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.AvailablePurchaseOptions) {
                composer.startReplaceGroup(-961805791);
                PremiumBusSlotSelectionUiStateKt.m(((PremiumBusBottomSheetTypeUIState.AvailablePurchaseOptions) premiumBusBottomSheetTypeUIState).f7836a, composer, 0);
                composer.endReplaceGroup();
            } else if (premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.ViewAllSlots) {
                composer.startReplaceGroup(-961633338);
                PremiumBusSlotSelectionUiStateKt.w(((PremiumBusBottomSheetTypeUIState.ViewAllSlots) premiumBusBottomSheetTypeUIState).f7841a, composer, 0);
                composer.endReplaceGroup();
            } else if (Intrinsics.d(premiumBusBottomSheetTypeUIState, PremiumBusBottomSheetTypeUIState.NoODPairAvailableBottomSheet.f7839a) || Intrinsics.d(premiumBusBottomSheetTypeUIState, PremiumBusBottomSheetTypeUIState.NoSlotAvailableBottomSheet.f7840a) || premiumBusBottomSheetTypeUIState == null) {
                composer.startReplaceGroup(-961346681);
                composer.endReplaceGroup();
            } else if (premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.MultipleSlotSelectionCalendar) {
                composer.startReplaceGroup(-961119079);
                MultipleSlotSelectionCalendarUIState multipleSlotSelectionCalendarUIState = ((PremiumBusBottomSheetTypeUIState.MultipleSlotSelectionCalendar) premiumBusBottomSheetTypeUIState).f7837a;
                if (multipleSlotSelectionCalendarUIState instanceof MultipleSlotSelectionCalendarUIState.ErrorState) {
                    composer.startReplaceGroup(-1832116099);
                    PremiumBusSlotSelectionUiStateKt.c(((MultipleSlotSelectionCalendarUIState.ErrorState) multipleSlotSelectionCalendarUIState).f7802a, composer, 0);
                    composer.endReplaceGroup();
                } else if (multipleSlotSelectionCalendarUIState instanceof MultipleSlotSelectionCalendarUIState.LoadingState) {
                    composer.startReplaceGroup(-1832110267);
                    ChaloMultiSelectDatePickerKt.a(((MultipleSlotSelectionCalendarUIState.LoadingState) multipleSlotSelectionCalendarUIState).f7803a, null, composer, 8);
                    composer.endReplaceGroup();
                } else {
                    if (!(multipleSlotSelectionCalendarUIState instanceof MultipleSlotSelectionCalendarUIState.CalendarDataState)) {
                        throw pk0.p(composer, -1832119159);
                    }
                    composer.startReplaceGroup(-1832103003);
                    ChaloMultiSelectDatePickerKt.a(((MultipleSlotSelectionCalendarUIState.CalendarDataState) multipleSlotSelectionCalendarUIState).f7801a, null, composer, 8);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                if (!(premiumBusBottomSheetTypeUIState instanceof PremiumBusBottomSheetTypeUIState.NearBySlotsAvailableSelectionBottomSheet)) {
                    throw pk0.p(composer, -1832143266);
                }
                composer.startReplaceGroup(-1832093932);
                PremiumBusSlotSelectionScreenKt.b(((PremiumBusBottomSheetTypeUIState.NearBySlotsAvailableSelectionBottomSheet) premiumBusBottomSheetTypeUIState).f7838a, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ViewAllSlotsBottomSheetUIState viewAllSlotsBottomSheetUIState = (ViewAllSlotsBottomSheetUIState) this.b;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1778162125, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusSlotSelectionUiState.kt:1263)");
            }
            ChaloSpacersKt.d(composer, 0);
            if (viewAllSlotsBottomSheetUIState.e != null) {
                composer.startReplaceGroup(-898647884);
                ChaloSpacersKt.j(composer, 0);
            } else {
                composer.startReplaceGroup(-947531691);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        PremiumBusFareDetailsContent premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) this.b;
        ColumnScope PremiumBusFareDetailsScaffold = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(PremiumBusFareDetailsScaffold, "$this$PremiumBusFareDetailsScaffold");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2145492510, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusThroughPassFareDetailsScreen.<anonymous> (PremiumBusThroughPassFareDetailsScreen.kt:29)");
            }
            if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.ThroughPass) {
                composer.startReplaceGroup(1336002670);
                PremiumBusThroughPassFareDetailsScreenKt.a((PremiumBusFareDetailsContent.ThroughPass) premiumBusFareDetailsContent, null, composer, 0);
            } else {
                composer.startReplaceGroup(1334801792);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        BottomSheetStandardContentUiState bottomSheetStandardContentUiState = (BottomSheetStandardContentUiState) this.b;
        ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1413710324, iIntValue, -1, "app.chalo.productactivation.ui.ProductActivationScreen.<anonymous>.<anonymous> (ProductActivationScreen.kt:82)");
            }
            BottomSheetContentWithIconTitleSubTitleKt.a(null, bottomSheetStandardContentUiState, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        UserProfilingTicketActivationBannerUIState userProfilingTicketActivationBannerUIState = (UserProfilingTicketActivationBannerUIState) this.b;
        RowScope ChaloButtonWithCustomContent = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloButtonWithCustomContent, "$this$ChaloButtonWithCustomContent");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(9511120, iIntValue, -1, "app.chalo.productactivation.ui.UserProfilingTicketActivationBannerComposable.<anonymous>.<anonymous> (ProductActivationScreen.kt:211)");
            }
            TextWithLeftAndTrailingRightIconComponentKt.a(ChaloThemeKt.c(Modifier.INSTANCE, userProfilingTicketActivationBannerUIState.e.f8047a.f8046a), userProfilingTicketActivationBannerUIState.e.b, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        ProductSelectionSectionItemUIState.ProductItemUIState productItemUIState = (ProductSelectionSectionItemUIState.ProductItemUIState) this.b;
        ProductItemUISpec productItemUISpec = productItemUIState.f8694a;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951886681, iIntValue, -1, "app.chalo.productpurchase.productselection.ui.ProductItem.<anonymous> (ProductSelectionScreen.kt:191)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloThemeKt.d(productItemUISpec.f8667a.f9924a));
            boolean z = productItemUIState.h != null;
            boolean zChanged = composer.changed(productItemUIState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qv0(productItemUIState, 8);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierAlpha = AlphaKt.alpha(ClickableKt.m299clickableoSLSa3U$default(modifierClip, z, null, null, null, (Function0) objRememberedValue, 14, null), productItemUIState.i);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlpha);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageUIState imageUIState = productItemUIState.c;
            ChaloPadding chaloPadding = productItemUISpec.h;
            TextUIState textUIState = productItemUIState.b;
            ChaloPadding chaloPadding2 = productItemUISpec.b;
            UIShape uIShape = productItemUISpec.c;
            ChaloColorToken chaloColorToken = productItemUISpec.d;
            UIShape.Rectangle rectangle = UIShape.f1926a;
            ProductSelectionScreenKt.c(imageUIState, chaloPadding, textUIState, chaloPadding2, uIShape, chaloColorToken, composer, 0);
            ProductSelectionScreenKt.b(productItemUIState.d, productItemUIState.e, productItemUIState.f, productItemUIState.g, productItemUISpec, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), productItemUISpec.e), composer, 0);
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Composer composer;
        int i;
        int i2 = this.f18295a;
        Throwable th = null;
        boolean z = true;
        Unit unit = Unit.f17538a;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                IndividualStepsTicketCardUIState individualStepsTicketCardUIState = (IndividualStepsTicketCardUIState) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1623749142, iIntValue, -1, "app.chalo.multimodalticket.ui.composables.IndividualStepTicketCardComposable.<anonymous> (IndividualStepTicketCardComposable.kt:33)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    IndividualStepsTicketCardUISpecs individualStepsTicketCardUISpecs = individualStepsTicketCardUIState.f5953a;
                    List list = individualStepsTicketCardUIState.e;
                    DividerUIState dividerUIState = individualStepsTicketCardUIState.g;
                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(individualStepsTicketCardUISpecs.b), null, 2, null), null, null, 3, null);
                    ChaloPadding chaloPadding = individualStepsTicketCardUISpecs.f5952a;
                    ChaloPadding chaloPadding2 = individualStepsTicketCardUISpecs.g;
                    Modifier modifierC = ChaloThemeKt.c(modifierAnimateContentSize$default, chaloPadding);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierC);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(individualStepsTicketCardUISpecs.e), composer2, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierA);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
                    ChaloTextViewKt.a(null, individualStepsTicketCardUIState.b, null, null, composer2, 0, 13);
                    ChaloSpacersKt.t(composer2, 0);
                    ChaloTextViewKt.a(null, individualStepsTicketCardUIState.c, null, null, composer2, 0, 13);
                    composer2.endNode();
                    ChaloRadioButtonKt.a(null, individualStepsTicketCardUIState.f, composer2, 0, 1);
                    composer2.endNode();
                    if (individualStepsTicketCardUIState.d) {
                        composer2.startReplaceGroup(1075439799);
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion3, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
                        DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding2), dividerUIState, composer2, 0, 0);
                        composer2.startReplaceGroup(-1322759333);
                        int i7 = 0;
                        for (Object obj5 : list) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            StepModeCardComposableKt.a(null, (StepTicketSectionUIState) obj5, composer2, 0);
                            if (i7 != CollectionsKt.K(list)) {
                                composer2.startReplaceGroup(-136509835);
                                DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding2), dividerUIState, composer2, 0, 0);
                            } else {
                                composer2.startReplaceGroup(-139263286);
                            }
                            composer2.endReplaceGroup();
                            i7 = i8;
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                    } else {
                        composer2.startReplaceGroup(1073238210);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                AdManagerAdView adManagerAdView = (AdManagerAdView) obj4;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-365230576, iIntValue2, -1, "app.chalo.ads.InlineAdaptiveBannerAd.<anonymous>.<anonymous> (InlineAdaptiveBannerAd.android.kt:163)");
                }
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                boolean zChangedInstance = composer3.changedInstance(adManagerAdView);
                Object objRememberedValue = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ya0(adManagerAdView, 1);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue, modifierWrapContentSize$default, null, composer3, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 2:
                LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState = (LoginOtpEnterTextFieldUIState) obj4;
                Function2 innerTextField = (Function2) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(innerTextField, "innerTextField");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= composer4.changedInstance(innerTextField) ? 4 : 2;
                }
                if (composer4.shouldExecute((iIntValue3 & 19) != 18, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141114272, iIntValue3, -1, "app.chalo.login.ui.otp.ChaloOtpEnterTextField.<anonymous> (LoginOtpScreen.kt:179)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    Alignment.Companion companion5 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i9 = (int) ((currentCompositeKeyHashCode5 >>> 32) ^ currentCompositeKeyHashCode5);
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default4);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion6, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl5, Integer.valueOf(i9), composerM3915constructorimpl5));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), companion5.getTop(), composer4, 6);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i10 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, modifierFillMaxWidth$default5);
                    Function0<ComposeUiNode> constructor6 = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor6);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion6, composerM3915constructorimpl6, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl6, Integer.valueOf(i10), composerM3915constructorimpl6));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(-1787678995);
                    int i11 = 0;
                    for (Object obj6 : loginOtpEnterTextFieldUIState.b) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        LoginOtpEnterIndividualBoxUIState loginOtpEnterIndividualBoxUIState = (LoginOtpEnterIndividualBoxUIState) obj6;
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        RowScopeInstance rowScopeInstance2 = rowScopeInstance;
                        Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(BorderUISpecKt.a(i41.a(rowScopeInstance, companion7, 1.0f, false, 2, null), loginOtpEnterIndividualBoxUIState.f5331a), loginOtpEnterIndividualBoxUIState.b);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                        int i13 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap7 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer4, modifierM814height3ABfNKs);
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor7 = companion8.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor7);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer4);
                        pk0.v(companion8, composerM3915constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl7, currentCompositionLocalMap7);
                        Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl7, Integer.valueOf(i13), composerM3915constructorimpl7));
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (loginOtpEnterIndividualBoxUIState instanceof LoginOtpEnterIndividualBoxUIState.Text) {
                            composer4.startReplaceGroup(1986299812);
                            ChaloTextViewKt.a(null, ((LoginOtpEnterIndividualBoxUIState.Text) loginOtpEnterIndividualBoxUIState).c, null, null, composer4, 0, 13);
                            composer4.endReplaceGroup();
                        } else {
                            if (!(loginOtpEnterIndividualBoxUIState instanceof LoginOtpEnterIndividualBoxUIState.BlinkingCursor)) {
                                throw pk0.p(composer4, -1459948832);
                            }
                            composer4.startReplaceGroup(1986497499);
                            LoginOtpEnterIndividualBoxUIState.BlinkingCursor blinkingCursor = (LoginOtpEnterIndividualBoxUIState.BlinkingCursor) loginOtpEnterIndividualBoxUIState;
                            LoginOtpScreenKt.a(blinkingCursor.c, 0, ChaloColorTokenKt.c(blinkingCursor.d), composer4, ChaloThemeKt.c(companion7, blinkingCursor.e));
                            composer4.endReplaceGroup();
                        }
                        composer4.endNode();
                        if (i11 < loginOtpEnterTextFieldUIState.b.size() - 1) {
                            composer4.startReplaceGroup(170466474);
                            SpacerKt.Spacer(PaddingKt.m786paddingVpY3zN4$default(companion7, loginOtpEnterTextFieldUIState.c.f5343a, 0.0f, 2, null), composer4, 0);
                        } else {
                            composer4.startReplaceGroup(162994482);
                        }
                        composer4.endReplaceGroup();
                        i11 = i12;
                        rowScopeInstance = rowScopeInstance2;
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    Modifier modifierAlpha = AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i14 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer4, modifierAlpha);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion9.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor8);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion9, composerM3915constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl8, Integer.valueOf(i14), composerM3915constructorimpl8));
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    innerTextField.invoke(composer4, Integer.valueOf(iIntValue3 & 14));
                    composer4.endNode();
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                MetroLandingScreenViewState metroLandingScreenViewState = (MetroLandingScreenViewState) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-871270922, iIntValue4, -1, "app.chalo.metro.ui.landing.compose.MetroLandingScreenUI.<anonymous> (MetroLandingScreenUI.kt:68)");
                    }
                    MetroLandingScreenBottomSheetUiStateType metroLandingScreenBottomSheetUiStateType = metroLandingScreenViewState.f;
                    if (metroLandingScreenBottomSheetUiStateType instanceof MetroLandingScreenBottomSheetUiStateType.LineSelectionBottomSheet) {
                        composer5.startReplaceGroup(227271671);
                        LineSelectionBottomSheetContentKt.b(null, ((MetroLandingScreenBottomSheetUiStateType.LineSelectionBottomSheet) metroLandingScreenViewState.f).c, composer5, 0);
                        composer5.endReplaceGroup();
                    } else {
                        if (!(metroLandingScreenBottomSheetUiStateType instanceof MetroLandingScreenBottomSheetUiStateType.None)) {
                            throw pk0.p(composer5, 227267611);
                        }
                        composer5.startReplaceGroup(-1544315350);
                        composer5.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 4:
                GenericErrorBottomSheetUIState genericErrorBottomSheetUIState = (GenericErrorBottomSheetUIState) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer6.shouldExecute((iIntValue5 & 17) != 16, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(185786513, iIntValue5, -1, "app.chalo.kyc.min.ui.minkycotp.composables.MinKycOtpScreen.<anonymous>.<anonymous> (MinKycOtpScreen.kt:40)");
                    }
                    GenericErrorBottomSheetKt.a(genericErrorBottomSheetUIState, composer6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 5:
                OtpTextFieldUIState otpTextFieldUIState = (OtpTextFieldUIState) obj4;
                Function2 innerTextField2 = (Function2) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(innerTextField2, "innerTextField");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= composer7.changedInstance(innerTextField2) ? 4 : 2;
                }
                if (composer7.shouldExecute((iIntValue6 & 19) != 18, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1974630543, iIntValue6, -1, "app.chalo.kyc.min.ui.minkycotp.composables.ChaloOtpEnterTextField.<anonymous> (MinKycOtpScreenUI.kt:224)");
                    }
                    Modifier.Companion companion10 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion11.getTopStart(), false);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i15 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default6);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion12.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor9);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion12, composerM3915constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl9, Integer.valueOf(i15), composerM3915constructorimpl9));
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion10, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), companion11.getTop(), composer7, 6);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0);
                    int i16 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer7.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer7, modifierFillMaxWidth$default7);
                    Function0<ComposeUiNode> constructor10 = companion12.getConstructor();
                    if (composer7.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer7.startReusableNode();
                    if (composer7.getInserting()) {
                        composer7.createNode(constructor10);
                    } else {
                        composer7.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer7);
                    pk0.v(companion12, composerM3915constructorimpl10, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl10, Integer.valueOf(i16), composerM3915constructorimpl10));
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    composer7.startReplaceGroup(-715134379);
                    int i17 = 0;
                    Composer composer8 = composer7;
                    for (Object obj7 : otpTextFieldUIState.c) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            Throwable th2 = th;
                            CollectionsKt.z0();
                            throw th2;
                        }
                        OtpCharUIState otpCharUIState = (OtpCharUIState) obj7;
                        OtpCharUISpecs otpCharUISpecs = otpCharUIState.f4163a;
                        Modifier.Companion companion13 = Modifier.INSTANCE;
                        Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(BorderUISpecKt.a(i41.a(rowScopeInstance3, companion13, 1.0f, false, 2, null), otpCharUISpecs.f4162a), otpCharUISpecs.b);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                        long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                        Throwable th3 = th;
                        boolean z2 = z;
                        int i19 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap11 = composer8.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer8, modifierM814height3ABfNKs2);
                        ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor11 = companion14.getConstructor();
                        if (composer8.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor11);
                        } else {
                            composer8.useNode();
                        }
                        Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composer8);
                        pk0.v(companion14, composerM3915constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3915constructorimpl11, currentCompositionLocalMap11);
                        Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion14, composerM3915constructorimpl11, Integer.valueOf(i19), composerM3915constructorimpl11));
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (otpCharUIState.d) {
                            composer8.startReplaceGroup(1272868005);
                            MinKycOtpScreenUIKt.a(ChaloThemeKt.c(companion13, otpCharUISpecs.c), otpCharUIState, composer8, 0);
                            composer8.endReplaceGroup();
                            composer = composer8;
                        } else {
                            composer8.startReplaceGroup(1273116408);
                            Composer composer9 = composer8;
                            app.chalo.compose.components.TextKt.c(otpCharUIState.b, null, null, null, composer9, 0, 14);
                            Composer composer10 = composer9;
                            composer10.endReplaceGroup();
                            composer = composer10;
                        }
                        composer.endNode();
                        if (i17 < otpTextFieldUIState.c.size() - 1) {
                            composer.startReplaceGroup(1245010209);
                            SpacerKt.Spacer(ChaloThemeKt.c(companion13, otpCharUISpecs.f), composer, 0);
                        } else {
                            composer.startReplaceGroup(1236504088);
                        }
                        composer.endReplaceGroup();
                        z = z2;
                        composer8 = composer;
                        i17 = i18;
                        th = th3;
                    }
                    Composer composer11 = composer8;
                    composer11.endReplaceGroup();
                    composer11.endNode();
                    Modifier modifierAlpha2 = AlphaKt.alpha(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, z ? 1 : 0, th), 0.0f);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i20 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap12 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer11, modifierAlpha2);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor12 = companion15.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor12);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl12 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion15, composerM3915constructorimpl12, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3915constructorimpl12, currentCompositionLocalMap12);
                    Updater.m3923setimpl(composerM3915constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion15, composerM3915constructorimpl12, Integer.valueOf(i20), composerM3915constructorimpl12));
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    innerTextField2.invoke(composer11, Integer.valueOf(iIntValue6 & 14));
                    composer11.endNode();
                    composer11.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 6:
                MultiProductChildCardUIState multiProductChildCardUIState = (MultiProductChildCardUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer12.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1224405397, iIntValue7, -1, "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductChildCard.<anonymous> (MultiProductValidationScreen.kt:185)");
                    }
                    Modifier.Companion companion16 = Modifier.INSTANCE;
                    MultiProductChildCardUISpec multiProductChildCardUISpec = multiProductChildCardUIState.i;
                    CardUISpec cardUISpec = multiProductChildCardUISpec.f10686a;
                    Modifier modifierB = ComposeUtilsKt.b(ClipKt.clip(companion16, ChaloThemeKt.d(cardUISpec.f9924a)), multiProductChildCardUIState.f, composer12, 0, 6);
                    BorderUISpec borderUISpec = multiProductChildCardUISpec.d;
                    if (borderUISpec != null) {
                        modifierB = BorderUISpecKt.a(modifierB, borderUISpec);
                    }
                    ChaloColorToken.OrangeBackground orangeBackground = multiProductChildCardUISpec.e;
                    if (orangeBackground != null) {
                        modifierB = BackgroundKt.m263backgroundbw27NRU(modifierB, ChaloColorTokenKt.c(orangeBackground), ChaloThemeKt.d(cardUISpec.f9924a));
                    }
                    Modifier modifierC2 = ChaloThemeKt.c(AnimationModifierKt.animateContentSize$default(modifierB, null, null, 3, null), multiProductChildCardUISpec.b);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion17 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(top2, companion17.getStart(), composer12, 0);
                    long currentCompositeKeyHashCode13 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i21 = (int) (currentCompositeKeyHashCode13 ^ (currentCompositeKeyHashCode13 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap13 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier13 = ComposedModifierKt.materializeModifier(composer12, modifierC2);
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor13 = companion18.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor13);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl13 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion18, composerM3915constructorimpl13, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl13, currentCompositionLocalMap13);
                    Updater.m3923setimpl(composerM3915constructorimpl13, modifierMaterializeModifier13, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion18, composerM3915constructorimpl13, Integer.valueOf(i21), composerM3915constructorimpl13));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement2.getStart(), companion17.getTop(), composer12, 0);
                    long currentCompositeKeyHashCode14 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i22 = (int) (currentCompositeKeyHashCode14 ^ (currentCompositeKeyHashCode14 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap14 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier14 = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxWidth$default8);
                    Function0<ComposeUiNode> constructor14 = companion18.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor14);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl14 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion18, composerM3915constructorimpl14, measurePolicyRowMeasurePolicy4, composerM3915constructorimpl14, currentCompositionLocalMap14);
                    Updater.m3923setimpl(composerM3915constructorimpl14, modifierMaterializeModifier14, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion18, composerM3915constructorimpl14, Integer.valueOf(i22), composerM3915constructorimpl14));
                    app.chalo.compose.components.TextKt.c(multiProductChildCardUIState.f10687a, i41.a(RowScopeInstance.INSTANCE, companion16, 1.0f, false, 2, null), null, null, composer12, 0, 12);
                    ValidationTicketStatusUIState validationTicketStatusUIState = multiProductChildCardUIState.c;
                    if (validationTicketStatusUIState == null) {
                        composer12.startReplaceGroup(1382291950);
                    } else {
                        composer12.startReplaceGroup(1382291951);
                        UIShape.Rectangle rectangle = UIShape.f1926a;
                        MultiProductValidationScreenKt.h(null, validationTicketStatusUIState, composer12, 0);
                    }
                    composer12.endReplaceGroup();
                    composer12.endNode();
                    StepTicketModeBasedInfoUIState stepTicketModeBasedInfoUIState = multiProductChildCardUIState.b;
                    if (stepTicketModeBasedInfoUIState == null) {
                        composer12.startReplaceGroup(-894635293);
                    } else {
                        composer12.startReplaceGroup(-894635292);
                        ModeTicketStepInfoComposablesKt.c(stepTicketModeBasedInfoUIState, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null), multiProductChildCardUISpec.f), composer12, 0);
                    }
                    composer12.endReplaceGroup();
                    MultiChildQRCard multiChildQRCard = multiProductChildCardUIState.e;
                    if (multiChildQRCard == null) {
                        composer12.startReplaceGroup(-894329974);
                        composer12.endReplaceGroup();
                        i = 0;
                    } else {
                        composer12.startReplaceGroup(-894329973);
                        if (multiChildQRCard instanceof MultiChildQRCard.MultiProductExpiredQrUIState) {
                            composer12.startReplaceGroup(-1866686672);
                            MultiChildQRCard.MultiProductExpiredQrUIState multiProductExpiredQrUIState = (MultiChildQRCard.MultiProductExpiredQrUIState) multiChildQRCard;
                            i = 0;
                            MultiProductValidationScreenKt.b(multiProductExpiredQrUIState.f10684a, ChaloThemeKt.c(companion16, multiProductExpiredQrUIState.b), composer12, 0);
                            composer12.endReplaceGroup();
                        } else {
                            i = 0;
                            if (!(multiChildQRCard instanceof MultiChildQRCard.MultiProductQrUIState)) {
                                throw pk0.p(composer12, 1186708017);
                            }
                            composer12.startReplaceGroup(-1866405967);
                            MultiProductValidationScreenKt.g((MultiChildQRCard.MultiProductQrUIState) multiChildQRCard, ChaloThemeKt.c(companion16, multiProductChildCardUISpec.c), composer12, 0);
                            composer12.endReplaceGroup();
                        }
                        composer12.endReplaceGroup();
                    }
                    Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion16, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion17.getCenterVertically(), composer12, 54);
                    long currentCompositeKeyHashCode15 = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, i);
                    int i23 = (int) (currentCompositeKeyHashCode15 ^ (currentCompositeKeyHashCode15 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap15 = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier15 = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxWidth$default9);
                    Function0<ComposeUiNode> constructor15 = companion18.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor15);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl15 = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion18, composerM3915constructorimpl15, measurePolicyRowMeasurePolicy5, composerM3915constructorimpl15, currentCompositionLocalMap15);
                    Updater.m3923setimpl(composerM3915constructorimpl15, modifierMaterializeModifier15, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion18, composerM3915constructorimpl15, Integer.valueOf(i23), composerM3915constructorimpl15));
                    TextWithLeftAndTrailingRightIconComponentKt.a(null, multiProductChildCardUIState.d, composer12, 0, 1);
                    ChaloSpacersKt.a(ChaloThemeHelper.a().e, composer12, 0);
                    TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState = multiProductChildCardUIState.h;
                    if (textWithLeftAndRightIconUIState == null) {
                        composer12.startReplaceGroup(1222479329);
                    } else {
                        composer12.startReplaceGroup(1222479330);
                        MultiProductValidationScreenKt.i(textWithLeftAndRightIconUIState, multiProductChildCardUISpec.h, multiProductChildCardUIState.g, multiProductChildCardUISpec.g, null, composer12, 0);
                    }
                    composer12.endReplaceGroup();
                    if (r1.k(composer12)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 7:
                OriginDestinationSelectionCardUIState originDestinationSelectionCardUIState = (OriginDestinationSelectionCardUIState) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer13.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2130719881, iIntValue8, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.MultipleOriginDestinationSelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MultipleOriginDestinationSelectionScreen.kt:73)");
                    }
                    Modifier.Companion companion19 = Modifier.INSTANCE;
                    OriginDestinationSelectionCardUISpec originDestinationSelectionCardUISpec = originDestinationSelectionCardUIState.f7686a;
                    ChaloPadding chaloPadding3 = originDestinationSelectionCardUISpec.f7685a;
                    float f = originDestinationSelectionCardUISpec.i;
                    Modifier modifierC3 = ChaloThemeKt.c(companion19, chaloPadding3);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer13, 0);
                    long currentCompositeKeyHashCode16 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i24 = (int) (currentCompositeKeyHashCode16 ^ (currentCompositeKeyHashCode16 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap16 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier16 = ComposedModifierKt.materializeModifier(composer13, modifierC3);
                    ComposeUiNode.Companion companion20 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor16 = companion20.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor16);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl16 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion20, composerM3915constructorimpl16, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl16, currentCompositionLocalMap16);
                    Updater.m3923setimpl(composerM3915constructorimpl16, modifierMaterializeModifier16, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion20, composerM3915constructorimpl16, Integer.valueOf(i24), composerM3915constructorimpl16));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    UIShape.Rectangle rectangle2 = UIShape.f1926a;
                    MultipleOriginDestinationSelectionScreenKt.b(null, originDestinationSelectionCardUIState, composer13, 0);
                    OriginDestinationSelectionCtaItemUIState originDestinationSelectionCtaItemUIState = originDestinationSelectionCardUIState.e;
                    if (originDestinationSelectionCtaItemUIState == null) {
                        composer13.startReplaceGroup(1962775768);
                    } else {
                        composer13.startReplaceGroup(1962775769);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion19, f), composer13, 0);
                        DividerUIStateKt.a(null, originDestinationSelectionCardUIState.c, composer13, 0, 1);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion19, f), composer13, 0);
                        MultipleOriginDestinationSelectionScreenKt.e(SizeKt.fillMaxWidth$default(companion19, 0.0f, 1, null), originDestinationSelectionCtaItemUIState, composer13, 6);
                    }
                    composer13.endReplaceGroup();
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 8:
                EmptyScreenUiState emptyScreenUiState = (EmptyScreenUiState) obj4;
                int iIntValue9 = ((Integer) obj).intValue();
                Composer composer14 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= composer14.changed(iIntValue9) ? 4 : 2;
                }
                if (composer14.shouldExecute((iIntValue10 & 19) != 18, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-867672337, iIntValue10, -1, "app.chalo.home.ui.history.compose.EmptyStateScreenUI.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:564)");
                    }
                    PurchaseProductBottomSheetContentKt.a(null, (ChaloWidgetCardUiState) ((EmptyScreenProductBookingOptionsUiState.ProductGridContainer) emptyScreenUiState.e).b.get(iIntValue9), composer14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 9:
                ProductsTabUiState productsTabUiState = (ProductsTabUiState) obj4;
                List it = (List) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1670380555, iIntValue11, -1, "app.chalo.home.ui.history.compose.ActiveExpiredTicketPassesFilterTab.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:652)");
                }
                ChaloScrollableTabRowKt.b(it, productsTabUiState.c, composer15, iIntValue11 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 10:
                NearbyStopAndTripsUiModel nearbyStopAndTripsUiModel = (NearbyStopAndTripsUiModel) obj4;
                Modifier passedModifier = (Modifier) obj;
                Composer composer16 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(passedModifier, "passedModifier");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= composer16.changed(passedModifier) ? 4 : 2;
                }
                if (composer16.shouldExecute((iIntValue12 & 19) != 18, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1895360693, iIntValue12, -1, "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapSelectedStopBottomSheetContent.<anonymous>.<anonymous> (NearbyStopsMapScreen.kt:222)");
                    }
                    NearbyStopsMapScreenKt.h((iIntValue12 << 3) & 112, composer16, passedModifier, nearbyStopAndTripsUiModel.h);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                PassCategorySelectionTabScreen passCategorySelectionTabScreen = (PassCategorySelectionTabScreen) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer17 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer17.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1063148661, iIntValue13, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:212)");
                    }
                    PassSelectionScreenKt.j(passCategorySelectionTabScreen.f8528a, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer17, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 13:
                return c(obj, obj2, obj3);
            case 14:
                PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState pbPassPurchaseLandingScreenSuccessUIState = (PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState) obj4;
                ColumnScope ChaloRoundedBottomSheet3 = (ColumnScope) obj;
                Composer composer18 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet3, "$this$ChaloRoundedBottomSheet");
                if (composer18.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(114480870, iIntValue14, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PbPassLandingScreenSheetHandling.<anonymous> (PbPassPurchaseLandingScreen.kt:151)");
                    }
                    PbPassPurchaseLandingScreenKt.c(pbPassPurchaseLandingScreenSuccessUIState.h, composer18, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            case 17:
                return f(obj, obj2, obj3);
            case 18:
                return g(obj, obj2, obj3);
            case 19:
                return h(obj, obj2, obj3);
            case 20:
                return i(obj, obj2, obj3);
            case 21:
                return j(obj, obj2, obj3);
            case 22:
                return k(obj, obj2, obj3);
            case 23:
                return l(obj, obj2, obj3);
            case 24:
                return m(obj, obj2, obj3);
            case 25:
                return n(obj, obj2, obj3);
            case 26:
                return o(obj, obj2, obj3);
            case 27:
                return p(obj, obj2, obj3);
            case 28:
                return q(obj, obj2, obj3);
            default:
                ProductSelectionProductsListSectionUIState productSelectionProductsListSectionUIState = (ProductSelectionProductsListSectionUIState) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer19 = (Composer) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer19.shouldExecute((iIntValue15 & 17) != 16, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1907089618, iIntValue15, -1, "app.chalo.productpurchase.productselection.ui.productSelectionSection.<anonymous> (ProductSelectionScreen.kt:157)");
                    }
                    ChaloSpacersKt.a(productSelectionProductsListSectionUIState.e.c, composer19, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
        }
    }
}
