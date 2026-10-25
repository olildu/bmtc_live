package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.checkout.ui.screen.chalopaywallet.ChaloWalletBlockedBottomsheetComposableKt;
import app.chalo.checkout.ui.screen.chalopaywallet.ChaloWalletInsufficientBalanceBottomSheetKt;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType;
import app.chalo.checkout.ui.screen.payment.PaymentScreenUiSpec;
import app.chalo.checkout.ui.screen.payment.PaymentViewState;
import app.chalo.compose.BottomSheetContentWithIconTitleSubTextKt;
import app.chalo.compose.ChaloEtaComponentKt;
import app.chalo.compose.ChaloZigzagPathComposableKt;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.compose.components.BottomSheetContentWithIconTitleSubTitleKt;
import app.chalo.compose.components.ChaloRadioButtonKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.CommonFromAndToSelectionKt;
import app.chalo.compose.components.CommonStopSelectionKt;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.PassengerCounterKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.components.TooltipPopupPlacement;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonSpec;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonUiState;
import app.chalo.home.ui.history.uistate.ProductReclaimSpec;
import app.chalo.home.ui.history.uistate.ProductReclaimUiState;
import app.chalo.home.ui.history.uistate.TabSpec;
import app.chalo.home.ui.history.uistate.TabUiState;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.kyc.min.ui.minkycotp.OtpCharUIState;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ItineraryConnectedLegsRowUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.ItineraryListItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiSpec;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemSpecs;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopInfoUiState;
import app.chalo.metro.ui.landing.uistate.FromToSelectionContainerUISpec;
import app.chalo.metro.ui.landing.uistate.MetroFromToSelectionContainerUIState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionViewState;
import app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionBottomSheetComposableKt;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUISpecs;
import app.chalo.multimodalticket.ui.uistates.FareBreakupSectionUIState;
import app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionItemUISpecs;
import app.chalo.multimodalticket.ui.uistates.GroupTicketPassengerSelectionItemUIState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeIntent;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NCMCOnlineRechargeSuccessBottomSheetDetails;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import app.chalo.premiumbus.ui.changestop.PbStopInfoCardUIState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComposablesKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PassUpsellOfferCardUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsContent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsFooterUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSelectedSeatsUISpecs;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusSelectedSeatsUiState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusTotalAmountUiState;
import app.chalo.premiumbus.ui.passpurchaselanding.FromAndToStopCardUISpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenUiSpecs;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldWithSwapButtonCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.compose.PBRouteSearchComposableKt;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreenKt;
import app.chalo.productsummary.ui.compose.components.BookingDetailsComponentKt;
import app.chalo.productsummary.ui.compose.components.FareSplitComponentKt;
import app.chalo.productsummary.ui.compose.components.ProductStatusComponentKt;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.productsummary.ui.data.ProductSummarySuccessScreenUISpec;
import app.chalo.productsummary.ui.pass.PassDetailUIState;
import app.chalo.productsummary.ui.pass.PassSummarySuccessScreenUIState;
import app.chalo.productsummary.ui.pass.ProductDownloadInvoiceOptionUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.quickpay.ui.payforticket.PayForTicketViewState;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiAlignmentKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.fromto.StopBasedFromToSelectionContainerUISpec;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import app.zophop.homescreen.MyTicketsViewStateSpec;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u50 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19716a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u50(int i, Object obj, Object obj2) {
        this.f19716a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        NetworkCallInfo networkCallInfo = (NetworkCallInfo) this.b;
        NetworkInspectorComponent networkInspectorComponent = (NetworkInspectorComponent) this.c;
        RowScope TopAppBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(TopAppBar, "$this$TopAppBar");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474514332, iIntValue, -1, "app.chalo.core.compose.NetworkInspectorScreen.<anonymous>.<anonymous> (NetworkInspectorScreen.kt:78)");
            }
            if (networkCallInfo == null) {
                composer.startReplaceGroup(-1519008441);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zChangedInstance = composer.changedInstance(networkInspectorComponent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new um0(networkInspectorComponent, 1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                ButtonKt.TextButton((Function0) objRememberedValue, companion, false, null, null, null, null, null, null, ComposableSingletons$NetworkInspectorScreenKt.c, composer, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1518607952);
                boolean zChangedInstance2 = composer.changedInstance(networkInspectorComponent) | composer.changedInstance(networkCallInfo);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new zf0(14, networkInspectorComponent, networkCallInfo);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                ButtonKt.TextButton((Function0) objRememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$NetworkInspectorScreenKt.d, composer, 805306368, TypedValues.PositionType.TYPE_POSITION_TYPE);
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

    private final Object c(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) this.b;
        SearchStopItemUiState searchStopItemUiState = (SearchStopItemUiState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118569315, iIntValue, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.SearchCardUi.<anonymous> (OriginDestinationSearchCard.kt:127)");
            }
            boolean zChanged = composer.changed(searchStopItemUiState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kn0(searchStopItemUiState, 2);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifier, false, null, null, null, (Function0) objRememberedValue, 15, null);
            SearchStopItemSpecs searchStopItemSpecs = searchStopItemUiState.f4610a;
            StopInfoUiState stopInfoUiState = searchStopItemUiState.b;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierM299clickableoSLSa3U$default, ChaloColorTokenKt.c(searchStopItemSpecs.c), null, 2, null), searchStopItemSpecs.f4609a);
            Alignment.Vertical verticalB = UiAlignmentKt.b(searchStopItemSpecs.f);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composer, 0);
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
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierA);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, searchStopItemSpecs.b), composer, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            pk0.v(companion, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChaloTextViewKt.a(null, stopInfoUiState.f4616a, null, null, composer, 0, 13);
            TextUIState.StyledTextUIState styledTextUIState = stopInfoUiState.b;
            if (styledTextUIState == null) {
                composer.startReplaceGroup(1028254806);
            } else {
                composer.startReplaceGroup(1028254807);
                TextKt.b(null, styledTextUIState, composer, 0, 1);
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.endNode();
            ImageUIState imageUIState = searchStopItemUiState.c;
            if (imageUIState == null) {
                composer.startReplaceGroup(-1788564933);
            } else {
                composer.startReplaceGroup(-1788564932);
                ChaloSpacersKt.a(searchStopItemSpecs.g, composer, 0);
                CommonImageKt.a(imageUIState, null, false, composer, 0, 6);
            }
            composer.endReplaceGroup();
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
        Function0 function0 = (Function0) this.b;
        Function0 function1 = (Function0) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522520450, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PBPreBookingSuccessProceedScreen.<anonymous>.<anonymous> (PBPreBookingSuccessProceedScreen.kt:102)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.PREBOOKING_CARD, composer, 6), "", PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "PL_pre_booking_nudge_screen_card_image"), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, Painter.$stable | 24624, 104);
            ChaloSpacersKt.h(composer, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.BOOK_SINGLE_RIDE, new Object[0], composer, 6);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
            Shape shape = ChaloTheme.d(composer, 0).c;
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(function0, 16);
                composer.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierM786paddingVpY3zN4$default, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue, composer, 0, 492);
            ChaloSpacersKt.n(composer, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], composer, 6);
            Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).h, 0.0f, 2, null);
            Shape shape2 = ChaloTheme.d(composer, 0).c;
            TextStyle textStyleA = ChaloTypographyKt.a(ChaloTypographyKt.h(ChaloTheme.e(composer, 0)));
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new p80(function1, 17);
                composer.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.f(strC2, false, modifierM786paddingVpY3zN4$default2, textStyleA, shape2, 0.0f, 0L, (Function0) objRememberedValue2, composer, 0, 98);
            ChaloSpacersKt.o(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        FromAndToStopCardUISpecs fromAndToStopCardUISpecs = (FromAndToStopCardUISpecs) this.b;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(15673992, iIntValue, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PBRouteSearchComposable.<anonymous> (PBRouteSearchComposable.kt:45)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnimateContentSize$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = fromAndToStopCardUISpecs.c;
            float f2 = fromAndToStopCardUISpecs.b;
            ChaloPadding chaloPadding = fromAndToStopCardUISpecs.f7640a;
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, f), 0.0f, 1, null), composer, 0);
            PBRouteSearchComposableKt.b(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloPadding.b, 0.0f, 2, null), searchFieldWithSwapButtonCardUIState.b, composer, 0);
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, f2), 0.0f, 1, null), composer, 0);
            ChaloFilledButtonKt.a(0, 0, composer, PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fromAndToStopCardUISpecs.f), chaloPadding.b, 0.0f, 2, null), searchFieldWithSwapButtonCardUIState.c);
            SpacerKt.Spacer(SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, f2), 0.0f, 1, null), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        TextUIState textUIState = (TextUIState) this.b;
        PassCategorySelectionTabScreen passCategorySelectionTabScreen = (PassCategorySelectionTabScreen) this.c;
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(item, "$this$item");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(196257161, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:239)");
            }
            TextKt.c(textUIState, ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionTabScreen.e), null, null, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        ProductSummarySuccessScreenUISpec productSummarySuccessScreenUISpec = (ProductSummarySuccessScreenUISpec) this.b;
        PassSummarySuccessScreenUIState passSummarySuccessScreenUIState = (PassSummarySuccessScreenUIState) this.c;
        PaddingValues innerPadding = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(innerPadding, "innerPadding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.changed(innerPadding) ? 4 : 2;
        }
        if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1216792935, iIntValue, -1, "app.chalo.productsummary.ui.compose.PassSummarySuccessMainScreen.<anonymous>.<anonymous> (PassSummarySuccessMainScreen.kt:144)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, innerPadding.getTop(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            ChaloColorToken chaloColorToken = productSummarySuccessScreenUISpec.b;
            ChaloPadding chaloPadding = productSummarySuccessScreenUISpec.f8757a;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(productSummarySuccessScreenUISpec.c), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i4 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ChaloSpacersKt.o(composer, 0);
            composer.startReplaceGroup(1661270636);
            List list = passSummarySuccessScreenUIState.c;
            DividerUIState dividerUIState = passSummarySuccessScreenUIState.h;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductStatusComponentKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), (ProductSummaryStatusUiData) it.next(), composer, 0);
                ChaloSpacersKt.o(composer, 0);
            }
            composer.endReplaceGroup();
            PassDetailUIState passDetailUIState = passSummarySuccessScreenUIState.d;
            if (passDetailUIState == null) {
                composer.startReplaceGroup(-39787400);
                composer.endReplaceGroup();
                i = 0;
            } else {
                composer.startReplaceGroup(-39787399);
                i = 0;
                PassSummarySuccessMainScreenKt.c(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), passDetailUIState, composer, 0);
                composer.endReplaceGroup();
            }
            BookingDetailsUIState bookingDetailsUIState = passSummarySuccessScreenUIState.e;
            if (bookingDetailsUIState == null) {
                composer.startReplaceGroup(-39409231);
            } else {
                composer.startReplaceGroup(-39409230);
                ChaloSpacersKt.o(composer, i);
                DividerUIStateKt.a(null, dividerUIState, composer, i, 1);
                ChaloSpacersKt.o(composer, i);
                BookingDetailsComponentKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), bookingDetailsUIState, composer, i);
            }
            composer.endReplaceGroup();
            PriceDetailsUIState priceDetailsUIState = passSummarySuccessScreenUIState.f;
            if (priceDetailsUIState == null) {
                composer.startReplaceGroup(-38836785);
                composer.endReplaceGroup();
                i2 = 0;
            } else {
                composer.startReplaceGroup(-38836784);
                if (priceDetailsUIState.c.isEmpty() && priceDetailsUIState.b == null) {
                    composer.startReplaceGroup(-1280341338);
                    composer.endReplaceGroup();
                    i2 = 0;
                } else {
                    composer.startReplaceGroup(-1272122060);
                    i2 = 0;
                    ChaloSpacersKt.o(composer, 0);
                    DividerUIStateKt.a(null, dividerUIState, composer, 0, 1);
                    ChaloSpacersKt.o(composer, 0);
                    FareSplitComponentKt.b(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloPadding), priceDetailsUIState, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            ChaloSpacersKt.n(composer, i2);
            ProductDownloadInvoiceOptionUIState productDownloadInvoiceOptionUIState = passSummarySuccessScreenUIState.i;
            if (productDownloadInvoiceOptionUIState == null) {
                composer.startReplaceGroup(-38059646);
            } else {
                composer.startReplaceGroup(-38059645);
                ChaloSpacersKt.n(composer, i2);
                PassSummarySuccessMainScreenKt.a(productDownloadInvoiceOptionUIState, composer, i2);
                ChaloSpacersKt.n(composer, i2);
            }
            composer.endReplaceGroup();
            composer.endNode();
            ChaloZigzagPathComposableKt.a(null, 0L, 0.0f, 0.0f, 0.0f, composer, 0, 31);
            ChaloSpacersKt.d(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        Composer composer;
        RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) this.b;
        Function0 function0 = (Function0) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer2 = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807140400, iIntValue, -1, "app.chalo.home.ui.regularbus.compose.PayForTicketComposable.<anonymous> (PayForTicketComposable.kt:38)");
            }
            IconType iconType = regularBusPageDisplayItemData.f;
            if (iconType == null) {
                composer2.startReplaceGroup(-2002162758);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-2002162757);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.d(composer2, 0).c), RippleEffectKt.b(composer2), RippleEffectKt.a(composer2), false, null, null, function0, 28, null), ChaloTheme.b(composer2, 0).h);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
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
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 124);
                ChaloSpacersKt.x(composer2, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer2, 6);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                int i2 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData.c;
                if (textFormatAppModel == null) {
                    composer2.startReplaceGroup(962388904);
                } else {
                    composer2.startReplaceGroup(962388905);
                    TextStyle textStyleA = ChaloTypographyKt.a(ChaloTheme.e(composer2, 0).getHeadlineMedium());
                    long j = ChaloTheme.a(composer2, 0).t0;
                    TextFormatAppModel.Companion companion4 = TextFormatAppModel.INSTANCE;
                    ChaloWidgetCardKt.f(textFormatAppModel, null, textStyleA, j, 0L, 0L, composer2, 0, 50);
                }
                composer2.endReplaceGroup();
                ChaloSpacersKt.t(composer2, 0);
                String str = regularBusPageDisplayItemData.d;
                if (str == null) {
                    composer2.startReplaceGroup(962753929);
                    composer2.endReplaceGroup();
                    composer = composer2;
                } else {
                    composer2.startReplaceGroup(962753930);
                    composer = composer2;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer, 0, 0, 131066);
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.b;
        PayForTicketViewState payForTicketViewState = (PayForTicketViewState) this.c;
        RowScope ChaloToolBar = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloToolBar, "$this$ChaloToolBar");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3496411, iIntValue, -1, "app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreen.<anonymous>.<anonymous> (PayForTicketScreen.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new qm0(function1, 28);
                composer.updateRememberedValue(objRememberedValue);
            }
            PayForTicketScreenKt.c(0, composer, ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null), payForTicketViewState.e);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        PaymentViewState paymentViewState = (PaymentViewState) this.b;
        PaymentBottomSheetUiType paymentBottomSheetUiType = (PaymentBottomSheetUiType) this.c;
        ColumnScope ModalBottomSheet = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1411032846, iIntValue, -1, "app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenContent.<anonymous>.<anonymous> (PaymentMainScreen.kt:116)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            PaymentScreenUiSpec paymentScreenUiSpec = paymentViewState.f1577a;
            ChaloColorToken chaloColorToken = paymentScreenUiSpec.f1546a;
            ChaloPadding chaloPadding = paymentScreenUiSpec.c;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloColorTokenKt.c(chaloColorToken), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            if (paymentBottomSheetUiType instanceof PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState) {
                composer.startReplaceGroup(188316084);
                PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState chaloPayLowBalanceBottomsheetUiState = (PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState) paymentBottomSheetUiType;
                ChaloWalletInsufficientBalanceBottomSheetKt.a(null, chaloPayLowBalanceBottomsheetUiState, chaloPayLowBalanceBottomsheetUiState.f, composer, 0);
                composer.endReplaceGroup();
            } else if (paymentBottomSheetUiType instanceof PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState) {
                composer.startReplaceGroup(188618024);
                ChaloWalletBlockedBottomsheetComposableKt.a(null, (PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState) paymentBottomSheetUiType, composer, 0);
                composer.endReplaceGroup();
            } else if (paymentBottomSheetUiType instanceof PaymentBottomSheetUiType.PaymentStatusBottomSheetUiState) {
                composer.startReplaceGroup(188810317);
                BottomSheetContentWithIconTitleSubTitleKt.a(ChaloThemeKt.c(companion, chaloPadding), ((PaymentBottomSheetUiType.PaymentStatusBottomSheetUiState) paymentBottomSheetUiType).f1526a, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                if (!(paymentBottomSheetUiType instanceof PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState)) {
                    throw pk0.p(composer, 1807187867);
                }
                composer.startReplaceGroup(189221005);
                BottomSheetContentWithIconTitleSubTitleKt.a(ChaloThemeKt.c(companion, chaloPadding), ((PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState) paymentBottomSheetUiType).f1525a, composer, 0, 0);
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

    private final Object k(Object obj, Object obj2, Object obj3) {
        long jM4640getTransparent0d7_KjU;
        PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType = (PbBulkBookingRideDetailsTabType) this.b;
        PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType2 = (PbBulkBookingRideDetailsTabType) this.c;
        ColumnScope Tab = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Tab, "$this$Tab");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1800903851, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.UpcomingAndPastRidesFilterTab.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1175)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).m, 0.0f, 2, null), ChaloTheme.b(composer, 0).A, 0.0f, 2, null);
            if (pbBulkBookingRideDetailsTabType != pbBulkBookingRideDetailsTabType2) {
                composer.startReplaceGroup(203233406);
                jM4640getTransparent0d7_KjU = ChaloTheme.a(composer, 0).A;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(203234080);
                composer.endReplaceGroup();
                jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
            }
            Modifier modifierClip = ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(modifierM835widthInVpY3zN4$default, jM4640getTransparent0d7_KjU, RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierClip);
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
            androidx.compose.material3.TextKt.m2623TextNvy7gAk(pbBulkBookingRideDetailsTabType.getTabName(), PaddingKt.m785paddingVpY3zN4(companion, ChaloTheme.b(composer, 0).e, ChaloTheme.b(composer, 0).f), ChaloTheme.a(composer, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getHeadlineSmall(), composer, 0, 0, 131064);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        PbPassPurchaseLandingScreenUiSpecs pbPassPurchaseLandingScreenUiSpecs = (PbPassPurchaseLandingScreenUiSpecs) this.b;
        ButtonUIState buttonUIState = (ButtonUIState) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1169578884, iIntValue, -1, "app.chalo.premiumbus.ui.passpurchaselanding.compose.PassLandingScreenMainScreen.<anonymous>.<anonymous>.<anonymous> (PbPassPurchaseLandingScreen.kt:121)");
            }
            ChaloFilledButtonKt.a(0, 0, composer, SizeKt.fillMaxWidth$default(ChaloThemeKt.c(Modifier.INSTANCE, pbPassPurchaseLandingScreenUiSpecs.b), 0.0f, 1, null), buttonUIState);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        Shape shape = (Shape) this.b;
        PbStopInfoCardUIState pbStopInfoCardUIState = (PbStopInfoCardUIState) this.c;
        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1928699151, iIntValue, -1, "app.chalo.premiumbus.ui.changestop.PbStopInfoCard.<anonymous> (PremiumBusChangeStopComposables.kt:45)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), shape);
            pbStopInfoCardUIState.c.getClass();
            boolean zChangedInstance = composer.changedInstance(pbStopInfoCardUIState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new kn0(pbStopInfoCardUIState, 19);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierC = ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierClip, true, null, null, null, (Function0) objRememberedValue, 14, null), pbStopInfoCardUIState.g);
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
            ODPairTagsUIState oDPairTagsUIState = pbStopInfoCardUIState.d;
            if (oDPairTagsUIState == null) {
                composer.startReplaceGroup(556908502);
            } else {
                composer.startReplaceGroup(556908503);
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloThemeHelper.a().f, 0.0f, 2, null);
                UIShape.Rectangle rectangle = UIShape.f1926a;
                PremiumBusChangeStopComposablesKt.a(modifierM786paddingVpY3zN4$default, oDPairTagsUIState, composer, 0);
                ChaloSpacersKt.t(composer, 0);
            }
            composer.endReplaceGroup();
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloRadioButtonKt.a(null, pbStopInfoCardUIState.c, composer, 0, 1);
            ChaloSpacersKt.B(composer, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i3 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i3), composerM3915constructorimpl3));
            ChaloTextViewKt.a(null, pbStopInfoCardUIState.f7524a, null, null, composer, 0, 13);
            ChaloSpacersKt.t(composer, 0);
            TextUIState.ChaloTextUIState chaloTextUIState = pbStopInfoCardUIState.e;
            if (chaloTextUIState != null) {
                composer.startReplaceGroup(-1385694977);
                ChaloEtaComponentKt.a(chaloTextUIState.b, null, null, composer, 0, 6);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1385592057);
                ChaloTextViewKt.a(null, pbStopInfoCardUIState.b, null, null, composer, 0, 13);
                composer.endReplaceGroup();
            }
            composer.endNode();
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

    private final Object n(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        ComposeUiNode.Companion companion;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion2;
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs = (PassUpsellOfferCardUISpecs) this.b;
        PassUpsellOfferCardUiState passUpsellOfferCardUiState = (PassUpsellOfferCardUiState) this.c;
        ColumnScope PremiumBusCardBehindStrip = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(PremiumBusCardBehindStrip, "$this$PremiumBusCardBehindStrip");
        int i3 = 0;
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1828877698, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusPassUpsellOfferCard.<anonymous> (PremiumBusFareDetailsCommonViews.kt:62)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(companion3, passUpsellOfferCardUISpecs.d);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance2, companion3, 1.0f, false, 2, null);
            TextUIState.ChaloTextUIState chaloTextUIState = passUpsellOfferCardUiState.b;
            ImageUrlUIState imageUrlUIState = passUpsellOfferCardUiState.e;
            ChaloTextViewKt.a(modifierA, chaloTextUIState, null, null, composer, 0, 12);
            TextUIState.ChaloTextUIState chaloTextUIState2 = passUpsellOfferCardUiState.c;
            if (chaloTextUIState2 == null) {
                composer.startReplaceGroup(300658021);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(300658022);
                ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composer, 0, 13);
                nf1.t(companion3, passUpsellOfferCardUISpecs.f, composer, 0);
            }
            TextUIState.ChaloTextUIState chaloTextUIState3 = passUpsellOfferCardUiState.d;
            if (chaloTextUIState3 == null) {
                composer.startReplaceGroup(300849880);
            } else {
                composer.startReplaceGroup(300849881);
                ChaloTextViewKt.a(null, chaloTextUIState3, null, null, composer, 0, 13);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (imageUrlUIState == null) {
                composer.startReplaceGroup(241448859);
                composer.endReplaceGroup();
                i = 1;
                i2 = 0;
                companion = companion5;
            } else {
                composer.startReplaceGroup(241448860);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, passUpsellOfferCardUISpecs.g), composer, 0);
                i = 1;
                i2 = 0;
                companion = companion5;
                SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, imageUrlUIState.b, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, ComposableLambdaKt.rememberComposableLambda(-25026073, true, new ut0(imageUrlUIState, i3), composer, 54), null, null, null, null, null, composer, 196992, 0, 65496);
                composer = composer;
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, passUpsellOfferCardUISpecs.h), composer, i2);
            if (imageUrlUIState == null) {
                composer.startReplaceGroup(242178972);
                ChaloSpacersKt.m(composer, i2);
            } else {
                composer.startReplaceGroup(238399638);
            }
            composer.endReplaceGroup();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, i, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, i2);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
            ComposeUiNode.Companion companion6 = companion;
            pk0.v(companion6, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            TextUIState.ChaloTextUIState chaloTextUIState4 = passUpsellOfferCardUiState.f;
            if (chaloTextUIState4 == null) {
                composer.startReplaceGroup(-1721828931);
                composer.endReplaceGroup();
                companion2 = companion3;
                rowScopeInstance = rowScopeInstance2;
            } else {
                composer.startReplaceGroup(-1721828930);
                rowScopeInstance = rowScopeInstance2;
                companion2 = companion3;
                ChaloTextViewKt.a(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), chaloTextUIState4, null, null, composer, 0, 12);
                ChaloSpacersKt.z(composer, i2);
                composer.endReplaceGroup();
            }
            ChaloFilledButtonKt.a(i2, i2, composer, i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), passUpsellOfferCardUiState.g);
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

    private final Object o(Object obj, Object obj2, Object obj3) {
        ComposeUiNode.Companion companion;
        PremiumBusFareDetailsFooterUISpecs premiumBusFareDetailsFooterUISpecs = (PremiumBusFareDetailsFooterUISpecs) this.b;
        PremiumBusFareDetailsFooterUiState premiumBusFareDetailsFooterUiState = (PremiumBusFareDetailsFooterUiState) this.c;
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(Card, "$this$Card");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1223540493, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFareDetailsFooter.<anonymous>.<anonymous> (PremiumBusFareDetailsFooter.kt:35)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = premiumBusFareDetailsFooterUISpecs.f7584a;
            float f = premiumBusFareDetailsFooterUISpecs.c;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), premiumBusFareDetailsFooterUISpecs.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierC);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composer, 0);
            TextUIState.ExpandingTextUIState expandingTextUIState = premiumBusFareDetailsFooterUiState.b;
            if (expandingTextUIState == null) {
                composer.startReplaceGroup(-1581405811);
                composer.endReplaceGroup();
                companion = companion4;
            } else {
                composer.startReplaceGroup(-1581405810);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composer, 0);
                companion = companion4;
                TextKt.c(expandingTextUIState, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, composer, 48, 12);
                composer.endReplaceGroup();
            }
            PremiumBusTotalAmountUiState premiumBusTotalAmountUiState = premiumBusFareDetailsFooterUiState.c;
            if (premiumBusTotalAmountUiState == null) {
                composer.startReplaceGroup(-1581184254);
            } else {
                composer.startReplaceGroup(-1581184253);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composer, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion3.getTop(), composer, 6);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default2);
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
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
                ComposeUiNode.Companion companion5 = companion;
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i2), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ChaloTextViewKt.a(null, premiumBusTotalAmountUiState.f7637a, null, null, composer, 0, 13);
                ChaloTextViewKt.a(null, premiumBusTotalAmountUiState.b, null, null, composer, 0, 13);
                composer.endNode();
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composer, 0);
            ChaloFilledButtonKt.a(6, 0, composer, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), premiumBusFareDetailsFooterUiState.f7585a);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, f), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        PremiumBusSelectedSeatsUiState premiumBusSelectedSeatsUiState = (PremiumBusSelectedSeatsUiState) this.b;
        PremiumBusSelectedSeatsUISpecs premiumBusSelectedSeatsUISpecs = (PremiumBusSelectedSeatsUISpecs) this.c;
        FlowRowScope FlowRow = (FlowRowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Intrinsics.i(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-10856721, iIntValue, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusSelectedSeatsView.<anonymous>.<anonymous> (PremiumBusFareDetailsTripSummaryCard.kt:151)");
            }
            CommonImageKt.a(premiumBusSelectedSeatsUiState.f7634a, null, false, composer, 0, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, premiumBusSelectedSeatsUISpecs.c), composer, 0);
            ChaloTextViewKt.a(null, premiumBusSelectedSeatsUiState.b, null, null, composer, 0, 13);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, premiumBusSelectedSeatsUISpecs.d), composer, 0);
            ChaloTextViewKt.a(null, premiumBusSelectedSeatsUiState.c, null, null, composer, 0, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0354  */
    /* JADX WARN: Code duplicated, block: B:124:0x0359  */
    /* JADX WARN: Code duplicated, block: B:125:0x0364  */
    /* JADX WARN: Code duplicated, block: B:127:0x0382  */
    /* JADX WARN: Code duplicated, block: B:128:0x0385  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:138:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x0403  */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        NCMCOnlineRechargeSuccessBottomSheetDetails nCMCOnlineRechargeSuccessBottomSheetDetails;
        String str;
        String str2;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        int i = this.f19716a;
        NCMCOnlineRechargeSuccessBottomSheetDetails nCMCOnlineRechargeSuccessBottomSheetDetails2 = null;
        Unit unit = Unit.f17538a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec = (StopBasedFromToSelectionContainerUISpec) obj5;
                StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) obj4;
                ColumnScope Card = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(Card, "$this$Card");
                if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1913663739, iIntValue, -1, "app.chalo.uistate.fromto.StopBasedMetroStopSelection.<anonymous> (FromToSelectionContainer.kt:28)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), stopBasedFromToSelectionContainerUISpec.f10031a);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierC);
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextUIState.ChaloTextUIState chaloTextUIState = stopBasedMetroFromToSelectionContainerUIState.b;
                    if (chaloTextUIState == null) {
                        composer2.startReplaceGroup(1217369732);
                        composer2.endReplaceGroup();
                        composer = composer2;
                    } else {
                        composer2.startReplaceGroup(1217369733);
                        ChaloTextViewKt.a(null, chaloTextUIState, null, null, composer2, 0, 13);
                        composer = composer2;
                        ChaloSpacersKt.a(stopBasedFromToSelectionContainerUISpec.c, composer, 0);
                        composer.endReplaceGroup();
                    }
                    CommonFromAndToSelectionKt.a(null, stopBasedFromToSelectionContainerUISpec, stopBasedMetroFromToSelectionContainerUIState.d, stopBasedMetroFromToSelectionContainerUIState.e, stopBasedMetroFromToSelectionContainerUIState.c, stopBasedMetroFromToSelectionContainerUIState.f, composer, 0, 1);
                    ButtonUIState buttonUIState = stopBasedMetroFromToSelectionContainerUIState.g;
                    if (buttonUIState == null) {
                        composer.startReplaceGroup(1217915518);
                    } else {
                        composer.startReplaceGroup(1217915519);
                        ChaloSpacersKt.a(stopBasedFromToSelectionContainerUISpec.f, composer, 0);
                        ChaloFilledButtonKt.a(6, 0, composer, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 1:
                GroupTicketLegSelectionViewState groupTicketLegSelectionViewState = (GroupTicketLegSelectionViewState) obj5;
                final GroupTicketLegSelectionBottomSheetUIStateType groupTicketLegSelectionBottomSheetUIStateType = (GroupTicketLegSelectionBottomSheetUIStateType) obj4;
                ColumnScope ChaloRoundedBottomSheet = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet, "$this$ChaloRoundedBottomSheet");
                if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1145663531, iIntValue2, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionScreen.<anonymous> (GroupTicketLegSelectionMainScreen.kt:74)");
                    }
                    GroupTicketLegSelectionBottomSheetUIStateType groupTicketLegSelectionBottomSheetUIStateType2 = groupTicketLegSelectionViewState.f;
                    if (Intrinsics.d(groupTicketLegSelectionBottomSheetUIStateType2, GroupTicketLegSelectionBottomSheetUIStateType.None.b)) {
                        composer3.startReplaceGroup(-1642720267);
                        composer3.endReplaceGroup();
                    } else if (groupTicketLegSelectionBottomSheetUIStateType2 instanceof GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection) {
                        composer3.startReplaceGroup(-1642609628);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        boolean zChanged3 = composer3.changed(groupTicketLegSelectionBottomSheetUIStateType);
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: app.chalo.multimodalticket.ui.composables.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object next;
                                    FareBreakupSectionUIState fareBreakupSectionUIState;
                                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1;
                                    GroupTicketLegSelectionBottomSheetUIStateType groupTicketLegSelectionBottomSheetUIStateType3 = groupTicketLegSelectionBottomSheetUIStateType;
                                    GroupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1 groupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1 = null;
                                    if (groupTicketLegSelectionBottomSheetUIStateType3 instanceof GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection) {
                                        Iterator it = ((GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection) groupTicketLegSelectionBottomSheetUIStateType3).c.e.b.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                        } while (!((GroupTicketPassengerSelectionItemUIState) next).e);
                                        GroupTicketPassengerSelectionItemUIState groupTicketPassengerSelectionItemUIState = (GroupTicketPassengerSelectionItemUIState) next;
                                        if (groupTicketPassengerSelectionItemUIState != null && (fareBreakupSectionUIState = groupTicketPassengerSelectionItemUIState.f) != null && (uiEventHandler$Companion$fromLambda$1 = fareBreakupSectionUIState.b) != null) {
                                            groupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1 = new GroupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1(0, uiEventHandler$Companion$fromLambda$1, UiEventHandler.class, "onClick", "onClick()V", 0);
                                        }
                                    } else if (!(groupTicketLegSelectionBottomSheetUIStateType3 instanceof GroupTicketLegSelectionBottomSheetUIStateType.Error) && !Intrinsics.d(groupTicketLegSelectionBottomSheetUIStateType3, GroupTicketLegSelectionBottomSheetUIStateType.None.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (groupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1 != null) {
                                        groupTicketLegSelectionMainScreenKt$getDismissVisibleTooltipLambda$2$1.invoke();
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        Intrinsics.i(companion3, "<this>");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-950109804, 6, -1, "app.chalo.productbooking.common.compose.dismissVisibleTooltipOnPointerDown (ToolTipDismissalHandling.android.kt:9)");
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        GroupTicketPassengerSelectionBottomSheetComposableKt.c(companion3, ((GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection) groupTicketLegSelectionBottomSheetUIStateType).c, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        if (!(groupTicketLegSelectionBottomSheetUIStateType2 instanceof GroupTicketLegSelectionBottomSheetUIStateType.Error)) {
                            throw pk0.p(composer3, 1471027061);
                        }
                        composer3.startReplaceGroup(-1642015823);
                        BottomSheetContentWithIconTitleSubTitleKt.a(null, ((GroupTicketLegSelectionBottomSheetUIStateType.Error) groupTicketLegSelectionBottomSheetUIStateType).c, composer3, 0, 1);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 2:
                GroupTicketPassengerSelectionItemUISpecs groupTicketPassengerSelectionItemUISpecs = (GroupTicketPassengerSelectionItemUISpecs) obj5;
                GroupTicketPassengerSelectionItemUIState groupTicketPassengerSelectionItemUIState = (GroupTicketPassengerSelectionItemUIState) obj4;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer4.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-723015330, iIntValue3, -1, "app.chalo.multimodalticket.ui.composables.GroupTicketPassengerSelectionItemComposable.<anonymous> (GroupTicketPassengerSelectionBottomSheetComposable.kt:106)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    ChaloPadding chaloPadding = groupTicketPassengerSelectionItemUISpecs.f5966a;
                    UiAlignment.Vertical vertical = groupTicketPassengerSelectionItemUISpecs.e;
                    Modifier modifierC2 = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
                    Alignment.Vertical verticalB = UiAlignmentKt.b(vertical);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), verticalB, composer4, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierC2);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion4, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer4, modifierA);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, groupTicketPassengerSelectionItemUIState.b, null, null, composer4, 0, 13);
                    Modifier modifierC3 = ChaloThemeKt.c(companion4, groupTicketPassengerSelectionItemUISpecs.c);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), UiAlignmentKt.b(vertical), composer4, 0);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer4, modifierC3);
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer4);
                    pk0.v(companion5, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    GroupTicketPassengerSelectionBottomSheetComposableKt.b(null, groupTicketPassengerSelectionItemUIState.c, composer4, 0);
                    composer4.startReplaceGroup(-615119382);
                    ImageUIState imageUIState = groupTicketPassengerSelectionItemUIState.d;
                    FareBreakupSectionUIState fareBreakupSectionUIState = groupTicketPassengerSelectionItemUIState.f;
                    if (imageUIState != null && fareBreakupSectionUIState != null) {
                        FareBreakupSectionUISpecs fareBreakupSectionUISpecs = fareBreakupSectionUIState.f5960a;
                        ChaloSpacersKt.a(groupTicketPassengerSelectionItemUISpecs.d, composer4, 0);
                        Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(companion4, 0.0f, ComposeUtils_androidKt.c(composer4), 1, null);
                        boolean z = groupTicketPassengerSelectionItemUIState.e;
                        RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(fareBreakupSectionUISpecs.d);
                        long jC = ChaloColorTokenKt.c(fareBreakupSectionUISpecs.f);
                        float f = fareBreakupSectionUISpecs.e;
                        TooltipPopupPlacement tooltipPopupPlacement = fareBreakupSectionUISpecs.g;
                        float f2 = fareBreakupSectionUISpecs.h;
                        boolean zChangedInstance = composer4.changedInstance(fareBreakupSectionUIState);
                        Object objRememberedValue4 = composer4.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new xx(fareBreakupSectionUIState, 16);
                            composer4.updateRememberedValue(objRememberedValue4);
                        }
                        TooltipPopupComposableKt.a(null, modifierM835widthInVpY3zN4$default, z, roundedCornerShapeD, jC, f, f2, tooltipPopupPlacement, false, (Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-549946035, true, new iq(imageUIState, 1), composer4, 54), ComposableLambdaKt.rememberComposableLambda(-1478712445, true, new n4(fareBreakupSectionUIState, 20), composer4, 54), composer4, 0, 432, 769);
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endNode();
                    PassengerCounterKt.a(null, groupTicketPassengerSelectionItemUIState.g, composer4, 0);
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 3:
                return IndicationKt.indication$lambda$1((Indication) obj5, (InteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                StopBasedFromToSelectionContainerUISpec stopBasedFromToSelectionContainerUISpec2 = (StopBasedFromToSelectionContainerUISpec) obj5;
                MetroFromToSelectionContainerUIState metroFromToSelectionContainerUIState = (MetroFromToSelectionContainerUIState) obj4;
                ColumnScope Card2 = (ColumnScope) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.i(Card2, "$this$Card");
                if (composer5.shouldExecute((iIntValue4 & 17) != 16, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-141312886, iIntValue4, -1, "app.chalo.metro.ui.landing.compose.MetroLineAndStopSelection.<anonymous> (MetroLandingScreenUI.kt:202)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierC4 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), stopBasedFromToSelectionContainerUISpec2.f10031a);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i6 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer5, modifierC4);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion7, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl5, Integer.valueOf(i6), composerM3915constructorimpl5));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    TextUIState.ChaloTextUIState chaloTextUIState2 = metroFromToSelectionContainerUIState.b;
                    FromToSelectionContainerUISpec fromToSelectionContainerUISpec = metroFromToSelectionContainerUIState.f5521a;
                    ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composer5, 0, 13);
                    ChaloSpacersKt.a(fromToSelectionContainerUISpec.c, composer5, 0);
                    StopSelectionUIState stopSelectionUIState = metroFromToSelectionContainerUIState.d;
                    if (stopSelectionUIState == null) {
                        composer5.startReplaceGroup(1185038632);
                    } else {
                        composer5.startReplaceGroup(1185038633);
                        CommonStopSelectionKt.a(null, stopSelectionUIState, composer5, 64, 1);
                    }
                    composer5.endReplaceGroup();
                    ChaloSpacersKt.a(fromToSelectionContainerUISpec.b, composer5, 0);
                    CommonFromAndToSelectionKt.a(null, stopBasedFromToSelectionContainerUISpec2, metroFromToSelectionContainerUIState.e, metroFromToSelectionContainerUIState.f, metroFromToSelectionContainerUIState.c, metroFromToSelectionContainerUIState.g, composer5, 4608, 1);
                    ChaloSpacersKt.a(stopBasedFromToSelectionContainerUISpec2.f, composer5, 0);
                    if (b3.s(6, 0, composer5, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), metroFromToSelectionContainerUIState.h)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                Modifier modifier = (Modifier) obj5;
                OtpCharUIState otpCharUIState = (OtpCharUIState) obj4;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(981437542, iIntValue5, -1, "app.chalo.kyc.min.ui.minkycotp.composables.BlinkingCursor.<anonymous> (MinKycOtpScreenUI.kt:301)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                int i7 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer6, modifier);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                if (composer6.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor6);
                } else {
                    composer6.useNode();
                }
                Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer6);
                pk0.v(companion8, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
                Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl6, Integer.valueOf(i7), composerM3915constructorimpl6));
                DividerUIStateKt.a(dq.a(ColumnScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), otpCharUIState.c, composer6, 0, 0);
                composer6.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 6:
                MyTicketsViewStateSpec myTicketsViewStateSpec = (MyTicketsViewStateSpec) obj5;
                ContactSupportUIState contactSupportUIState = (ContactSupportUIState) obj4;
                LazyItemScope item = (LazyItemScope) obj;
                Composer composer7 = (Composer) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                Intrinsics.i(item, "$this$item");
                if (composer7.shouldExecute((iIntValue6 & 17) != 16, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(433284358, iIntValue6, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:451)");
                    }
                    ContactSupportTextComposableKt.a(ChaloThemeKt.c(Modifier.INSTANCE, myTicketsViewStateSpec.j), contactSupportUIState, composer7, 64);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                MyTicketsViewStateSpec myTicketsViewStateSpec2 = (MyTicketsViewStateSpec) obj5;
                ProductReclaimUiState productReclaimUiState = (ProductReclaimUiState) obj4;
                LazyItemScope item2 = (LazyItemScope) obj;
                Composer composer8 = (Composer) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                Intrinsics.i(item2, "$this$item");
                if (composer8.shouldExecute((iIntValue7 & 17) != 16, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-923174614, iIntValue7, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:303)");
                    }
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer8, 0);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0);
                    int i8 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composer8.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer8, companion9);
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor7 = companion10.getConstructor();
                    if (composer8.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor7);
                    } else {
                        composer8.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composer8);
                    pk0.v(companion10, composerM3915constructorimpl7, measurePolicyColumnMeasurePolicy5, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion10, composerM3915constructorimpl7, Integer.valueOf(i8), composerM3915constructorimpl7));
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    ChaloSpacersKt.a(myTicketsViewStateSpec2.g, composer8, 0);
                    MyTicketsScreenUIKt.f(ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion9, 0.0f, 1, null), ChaloColorTokenKt.c(productReclaimUiState.f3478a.b), null, 2, null), myTicketsViewStateSpec2.f), productReclaimUiState, composer8, 0);
                    composer8.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                MyTicketFloatingButtonSpec myTicketFloatingButtonSpec = (MyTicketFloatingButtonSpec) obj5;
                MyTicketFloatingButtonUiState myTicketFloatingButtonUiState = (MyTicketFloatingButtonUiState) obj4;
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer9 = (Composer) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (composer9.shouldExecute((iIntValue8 & 17) != 16, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1009424299, iIntValue8, -1, "app.chalo.home.ui.history.compose.MyTicketFloatingButton.<anonymous> (MyTicketsScreenUI.kt:508)");
                    }
                    Modifier modifierC5 = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloColorTokenKt.c(myTicketFloatingButtonSpec.b), null, 2, null), myTicketFloatingButtonSpec.f3473a);
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer9, 48);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0);
                    int i9 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap8 = composer9.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer9, modifierC5);
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor8 = companion11.getConstructor();
                    if (composer9.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer9.startReusableNode();
                    if (composer9.getInserting()) {
                        composer9.createNode(constructor8);
                    } else {
                        composer9.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composer9);
                    pk0.v(companion11, composerM3915constructorimpl8, measurePolicyRowMeasurePolicy3, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl8, Integer.valueOf(i9), composerM3915constructorimpl8));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CommonImageKt.a(myTicketFloatingButtonUiState.b, null, false, composer9, 0, 6);
                    ChaloSpacersKt.a(myTicketFloatingButtonSpec.d, composer9, 0);
                    ChaloTextViewKt.a(null, myTicketFloatingButtonUiState.c, null, null, composer9, 0, 13);
                    composer9.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 9:
                TabSpec tabSpec = (TabSpec) obj5;
                TabUiState tabUiState = (TabUiState) obj4;
                ColumnScope Tab = (ColumnScope) obj;
                Composer composer10 = (Composer) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                Intrinsics.i(Tab, "$this$Tab");
                if (composer10.shouldExecute((iIntValue9 & 17) != 16, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1686611529, iIntValue9, -1, "app.chalo.home.ui.history.compose.ActiveExpiredTicketPassesFilterTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:671)");
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    float f3 = tabSpec.e;
                    UIShape uIShape = tabSpec.d;
                    Modifier modifierClip = ClipKt.clip(ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(modifierFillMaxWidth$default2, f3, 0.0f, 2, null), tabSpec.f, 0.0f, 2, null), ChaloColorTokenKt.c(tabSpec.b), ChaloThemeKt.d(uIShape)), tabSpec.f3485a), ChaloThemeKt.d(uIShape));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composer10, 0);
                    int i10 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composer10.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer10, modifierClip);
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor9 = companion12.getConstructor();
                    if (composer10.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer10.startReusableNode();
                    if (composer10.getInserting()) {
                        composer10.createNode(constructor9);
                    } else {
                        composer10.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composer10);
                    pk0.v(companion12, composerM3915constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion12, composerM3915constructorimpl9, Integer.valueOf(i10), composerM3915constructorimpl9));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ChaloTextViewKt.a(null, tabUiState.b, null, null, composer10, 0, 13);
                    composer10.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 10:
                ProductReclaimSpec productReclaimSpec = (ProductReclaimSpec) obj5;
                ProductReclaimUiState productReclaimUiState2 = (ProductReclaimUiState) obj4;
                ColumnScope ChaloRoundedCard3 = (ColumnScope) obj;
                Composer composer11 = (Composer) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard3, "$this$ChaloRoundedCard");
                if (composer11.shouldExecute((iIntValue10 & 17) != 16, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1014597755, iIntValue10, -1, "app.chalo.home.ui.history.compose.ReclaimProductCard.<anonymous> (MyTicketsScreenUI.kt:708)");
                    }
                    Modifier.Companion companion13 = Modifier.INSTANCE;
                    Modifier modifierC6 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), productReclaimSpec.f3477a);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion14 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(top, companion14.getStart(), composer11, 0);
                    long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composer11, 0);
                    int i11 = (int) (currentCompositeKeyHashCode10 ^ (currentCompositeKeyHashCode10 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap10 = composer11.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composer11, modifierC6);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor10 = companion15.getConstructor();
                    if (composer11.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer11.startReusableNode();
                    if (composer11.getInserting()) {
                        composer11.createNode(constructor10);
                    } else {
                        composer11.useNode();
                    }
                    Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composer11);
                    pk0.v(companion15, composerM3915constructorimpl10, measurePolicyColumnMeasurePolicy6, composerM3915constructorimpl10, currentCompositionLocalMap10);
                    Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion15, composerM3915constructorimpl10, Integer.valueOf(i11), composerM3915constructorimpl10));
                    CommonImageKt.a(productReclaimUiState2.b, ColumnScopeInstance.INSTANCE.align(companion13, companion14.getCenterHorizontally()), false, composer11, 0, 4);
                    ChaloSpacersKt.a(productReclaimSpec.c, composer11, 0);
                    ChaloTextViewKt.a(null, productReclaimUiState2.c, null, null, composer11, 0, 13);
                    ChaloSpacersKt.a(productReclaimSpec.d, composer11, 0);
                    ChaloTextViewKt.a(null, productReclaimUiState2.d, null, null, composer11, 0, 13);
                    ChaloSpacersKt.a(productReclaimSpec.e, composer11, 0);
                    if (b3.s(6, 0, composer11, SizeKt.fillMaxWidth$default(companion13, 0.0f, 1, null), productReclaimUiState2.e)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 11:
                NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState = (NCMCOnlineRechargeViewState) obj5;
                Function1 function1 = (Function1) obj4;
                ColumnScope ChaloRoundedBottomSheet2 = (ColumnScope) obj;
                Composer composer12 = (Composer) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedBottomSheet2, "$this$ChaloRoundedBottomSheet");
                if (composer12.shouldExecute((iIntValue11 & 17) != 16, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(400735222, iIntValue11, -1, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreen.<anonymous> (NcmcOnlineRechargeScreen.kt:77)");
                    }
                    NcmcOnlineRechargeSuccessBottomSheetType ncmcOnlineRechargeSuccessBottomSheetType = nCMCOnlineRechargeViewState.q;
                    String str3 = nCMCOnlineRechargeViewState.f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(499703702, 0, -1, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.getBottomSheetDetails (NcmcOnlineRechargeScreen.kt:352)");
                    }
                    int i12 = NcmcOnlineRechargeScreenKt.WhenMappings.f6419a[ncmcOnlineRechargeSuccessBottomSheetType.ordinal()];
                    NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetCancelCtaClicked rechargeSuccessBottomSheetCancelCtaClicked = NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetCancelCtaClicked.f6406a;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            composer12.startReplaceGroup(317245656);
                            nCMCOnlineRechargeSuccessBottomSheetDetails = new NCMCOnlineRechargeSuccessBottomSheetDetails(StringResourcesHelperKt.c(StringEnum.NCMC_ONLINE_RECHARGE_SUCCESS_MSG, new Object[]{str3}, composer12, 6), StringResourcesHelperKt.c(StringEnum.NCMC_ONLINE_RECHARGE_SUCCESS_MSG_DESC, new Object[0], composer12, 6), StringResourcesHelperKt.c(StringEnum.NCMC_TRANSFER_TO_CARD, new Object[0], composer12, 6), NCMCOnlineRechargeIntent.TransferToOffline.f6410a, StringResourcesHelperKt.c(StringEnum.DO_LATER, new Object[0], composer12, 6), rechargeSuccessBottomSheetCancelCtaClicked);
                            composer12.endReplaceGroup();
                        } else {
                            if (i12 != 3) {
                                throw pk0.p(composer12, -821072508);
                            }
                            composer12.startReplaceGroup(318005031);
                            composer12.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        if (nCMCOnlineRechargeSuccessBottomSheetDetails2 == null) {
                            composer12.startReplaceGroup(-1705780291);
                            composer12.endReplaceGroup();
                        } else {
                            composer12.startReplaceGroup(-1705780290);
                            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer12, 0).h, ChaloTheme.b(composer12, 0).k);
                            String str4 = nCMCOnlineRechargeSuccessBottomSheetDetails2.f6417a;
                            str = nCMCOnlineRechargeSuccessBottomSheetDetails2.b;
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            TextStyle textStyleD = ChaloTypographyKt.d(ChaloTheme.e(composer12, 0));
                            long j = ChaloTheme.a(composer12, 0).q;
                            IconType iconType = IconType.TICKET_PUNCH_SUCCESS;
                            String str5 = nCMCOnlineRechargeSuccessBottomSheetDetails2.c;
                            String str6 = nCMCOnlineRechargeSuccessBottomSheetDetails2.e;
                            zChanged = composer12.changed(function1) | composer12.changed(nCMCOnlineRechargeSuccessBottomSheetDetails2);
                            objRememberedValue = composer12.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new km0(function1, nCMCOnlineRechargeSuccessBottomSheetDetails2);
                                composer12.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            zChanged2 = composer12.changed(nCMCOnlineRechargeSuccessBottomSheetDetails2) | composer12.changed(function1);
                            objRememberedValue2 = composer12.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new km0(nCMCOnlineRechargeSuccessBottomSheetDetails2, function1);
                                composer12.updateRememberedValue(objRememberedValue2);
                            }
                            BottomSheetContentWithIconTitleSubTextKt.a(modifierM785paddingVpY3zN4, iconType, null, str4, null, 0L, str2, textStyleD, j, str5, function0, str6, (Function0) objRememberedValue2, composer12, 48, 0, 52);
                            composer12.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer12.startReplaceGroup(316604452);
                        nCMCOnlineRechargeSuccessBottomSheetDetails = new NCMCOnlineRechargeSuccessBottomSheetDetails(StringResourcesHelperKt.c(StringEnum.NCMC_ONLINE_RECHARGE_SUCCESS_MSG, new Object[]{str3}, composer12, 6), null, StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composer12, 6), rechargeSuccessBottomSheetCancelCtaClicked, null, null);
                        composer12.endReplaceGroup();
                    }
                    nCMCOnlineRechargeSuccessBottomSheetDetails2 = nCMCOnlineRechargeSuccessBottomSheetDetails;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    if (nCMCOnlineRechargeSuccessBottomSheetDetails2 == null) {
                        composer12.startReplaceGroup(-1705780291);
                        composer12.endReplaceGroup();
                    } else {
                        composer12.startReplaceGroup(-1705780290);
                        Modifier modifierM785paddingVpY3zN5 = PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer12, 0).h, ChaloTheme.b(composer12, 0).k);
                        String str7 = nCMCOnlineRechargeSuccessBottomSheetDetails2.f6417a;
                        str = nCMCOnlineRechargeSuccessBottomSheetDetails2.b;
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        TextStyle textStyleD2 = ChaloTypographyKt.d(ChaloTheme.e(composer12, 0));
                        long j2 = ChaloTheme.a(composer12, 0).q;
                        IconType iconType2 = IconType.TICKET_PUNCH_SUCCESS;
                        String str8 = nCMCOnlineRechargeSuccessBottomSheetDetails2.c;
                        String str9 = nCMCOnlineRechargeSuccessBottomSheetDetails2.e;
                        zChanged = composer12.changed(function1) | composer12.changed(nCMCOnlineRechargeSuccessBottomSheetDetails2);
                        objRememberedValue = composer12.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new km0(function1, nCMCOnlineRechargeSuccessBottomSheetDetails2);
                            composer12.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new km0(function1, nCMCOnlineRechargeSuccessBottomSheetDetails2);
                            composer12.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function2 = (Function0) objRememberedValue;
                        zChanged2 = composer12.changed(nCMCOnlineRechargeSuccessBottomSheetDetails2) | composer12.changed(function1);
                        objRememberedValue2 = composer12.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new km0(nCMCOnlineRechargeSuccessBottomSheetDetails2, function1);
                            composer12.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new km0(nCMCOnlineRechargeSuccessBottomSheetDetails2, function1);
                            composer12.updateRememberedValue(objRememberedValue2);
                        }
                        BottomSheetContentWithIconTitleSubTextKt.a(modifierM785paddingVpY3zN5, iconType2, null, str7, null, 0L, str2, textStyleD2, j2, str8, function2, str9, (Function0) objRememberedValue2, composer12, 48, 0, 52);
                        composer12.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 12:
                NearbyStopResultsContainerUiState nearbyStopResultsContainerUiState = (NearbyStopResultsContainerUiState) obj5;
                NearbyStopResultsContainerUiSpec nearbyStopResultsContainerUiSpec = (NearbyStopResultsContainerUiSpec) obj4;
                AnimatedVisibilityScope AnimatedVisibility2 = (AnimatedVisibilityScope) obj;
                Composer composer13 = (Composer) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility2, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(838361209, iIntValue12, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.NearbyStopsResultsSection.<anonymous>.<anonymous> (NearbyStopsResultsSection.kt:66)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer13, 0);
                long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                int i13 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                CompositionLocalMap currentCompositionLocalMap11 = composer13.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxWidth$default3);
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor11 = companion16.getConstructor();
                if (composer13.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer13.startReusableNode();
                if (composer13.getInserting()) {
                    composer13.createNode(constructor11);
                } else {
                    composer13.useNode();
                }
                Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composer13);
                pk0.v(companion16, composerM3915constructorimpl11, measurePolicyColumnMeasurePolicy7, composerM3915constructorimpl11, currentCompositionLocalMap11);
                Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion16, composerM3915constructorimpl11, Integer.valueOf(i13), composerM3915constructorimpl11));
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                composer13.startReplaceGroup(-1282443078);
                for (ItineraryListItemUiState itineraryListItemUiState : nearbyStopResultsContainerUiState.c) {
                    Modifier.Companion companion17 = Modifier.INSTANCE;
                    ItineraryConnectedLegsRowUIKt.a(companion17, itineraryListItemUiState, composer13, 6);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion17, nearbyStopResultsContainerUiSpec.d), composer13, 0);
                }
                if (b3.t(composer13)) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 13:
                String str10 = (String) obj5;
                Function3 function3 = (Function3) obj4;
                ColumnScope OutlinedCard = (ColumnScope) obj;
                Composer composer14 = (Composer) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                Intrinsics.i(OutlinedCard, "$this$OutlinedCard");
                if (composer14.shouldExecute((iIntValue13 & 17) != 16, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1979684922, iIntValue13, -1, "app.chalo.core.compose.DetailSection.<anonymous> (NetworkInspectorScreen.kt:256)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7278constructorimpl(12));
                    MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(Dp.m7278constructorimpl(10)), Alignment.INSTANCE.getStart(), composer14, 6);
                    long currentCompositeKeyHashCode12 = ComposablesKt.getCurrentCompositeKeyHashCode(composer14, 0);
                    int i14 = (int) (currentCompositeKeyHashCode12 ^ (currentCompositeKeyHashCode12 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap12 = composer14.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier12 = ComposedModifierKt.materializeModifier(composer14, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor12 = companion18.getConstructor();
                    if (composer14.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer14.startReusableNode();
                    if (composer14.getInserting()) {
                        composer14.createNode(constructor12);
                    } else {
                        composer14.useNode();
                    }
                    Composer composerM3915constructorimpl12 = Updater.m3915constructorimpl(composer14);
                    pk0.v(companion18, composerM3915constructorimpl12, measurePolicyColumnMeasurePolicy8, composerM3915constructorimpl12, currentCompositionLocalMap12);
                    Updater.m3923setimpl(composerM3915constructorimpl12, modifierMaterializeModifier12, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion18, composerM3915constructorimpl12, Integer.valueOf(i14), composerM3915constructorimpl12));
                    ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(str10, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer14, MaterialTheme.$stable).getTitleSmall(), composer14, 0, 0, 131070);
                    function3.invoke(columnScopeInstance6, composer14, 6);
                    composer14.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return c(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                return e(obj, obj2, obj3);
            case 18:
                return f(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                return i(obj, obj2, obj3);
            case 22:
                return j(obj, obj2, obj3);
            case 23:
                return k(obj, obj2, obj3);
            case 24:
                return l(obj, obj2, obj3);
            case 25:
                return m(obj, obj2, obj3);
            case 26:
                return n(obj, obj2, obj3);
            case 27:
                return o(obj, obj2, obj3);
            case 28:
                return p(obj, obj2, obj3);
            default:
                PremiumBusFareDetailsContent premiumBusFareDetailsContent = (PremiumBusFareDetailsContent) obj5;
                PremiumBusFareDetailsUiState premiumBusFareDetailsUiState = (PremiumBusFareDetailsUiState) obj4;
                ColumnScope PremiumBusFareDetailsScaffold = (ColumnScope) obj;
                Composer composer15 = (Composer) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                Intrinsics.i(PremiumBusFareDetailsScaffold, "$this$PremiumBusFareDetailsScaffold");
                if (composer15.shouldExecute((iIntValue14 & 17) != 16, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1590758956, iIntValue14, -1, "app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreen.<anonymous> (PremiumBusFreshPurchaseFareDetailsScreen.kt:59)");
                    }
                    if (premiumBusFareDetailsContent instanceof PremiumBusFareDetailsContent.FreshPurchase) {
                        composer15.startReplaceGroup(369160549);
                        ChaloSpacersKt.o(composer15, 0);
                        PremiumBusFreshPurchaseFareDetailsScreenKt.e((PremiumBusFareDetailsContent.FreshPurchase) premiumBusFareDetailsContent, null, composer15, 0);
                        gf.r(Modifier.INSTANCE, premiumBusFareDetailsUiState.f.e, composer15, 0);
                    } else {
                        composer15.startReplaceGroup(366220974);
                        composer15.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
        }
    }
}
