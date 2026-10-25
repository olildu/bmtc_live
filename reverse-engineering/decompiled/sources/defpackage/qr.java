package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposableSingletons$RecomposerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.InputDeviceCompat;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ComposableSingletons$ProfileCompletionTrackerKt;
import app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt;
import app.chalo.compose.components.ProfileCompletionTrackerKt;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.compose.components.divider.ComposableSingletons$TicketPunchDividerKt;
import app.chalo.compose.components.divider.TicketPunchDividerKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.ComposableSingletons$PremiumBusNotificationScreenKt;
import app.chalo.home.ui.chalobus.ComposableSingletons$PremiumBusTutorialScreenKt;
import app.chalo.home.ui.common.ComposableSingletons$RideHailingUserFeedbackBottomSheetContentKt;
import app.chalo.home.ui.profile.ComposableSingletons$ProfileScreenUIKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.SwipeableDefaults;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.ComposableSingletons$RouteDetailsMainScreenKt;
import app.chalo.livetracking.search.compose.ComposableSingletons$StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.compose.StopBasedTripPlannerSearchScreenKt;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType;
import app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchViewState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsScreenKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.ncmc.ui.landing.ChaloCardActivePassDetailsUiModel;
import app.chalo.ncmc.ui.landing.ChaloCardOperationType;
import app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel;
import app.chalo.ncmc.ui.landing.SelectedCardDetailsUiModel;
import app.chalo.ncmc.ui.landing.compose.ComposableSingletons$SingleCardDetailsScreenKt;
import app.chalo.ncmc.ui.landing.compose.SingleCardDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.ui.changestop.ComposableSingletons$PremiumBusChangeStopScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.ComposableSingletons$PremiumBusFareDetailsScaffoldKt;
import app.chalo.premiumbus.ui.slotselection.BorderUIState;
import app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.ExpressSlotIndicatorUIState;
import app.chalo.premiumbus.ui.slotselection.NewSlotTimeSuggestionSuccessUIState;
import app.chalo.premiumbus.ui.slotselection.ODPairTagsUIState;
import app.chalo.premiumbus.ui.slotselection.OutlinedButtonUIState;
import app.chalo.premiumbus.ui.slotselection.PBOdPairWithSlotsCardUIState;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionTabItemUISpecs;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionTabItemUIState;
import app.chalo.premiumbus.ui.slotselection.PassOptionAdditionalInfo;
import app.chalo.premiumbus.ui.slotselection.PbSlotCardUISpecs;
import app.chalo.premiumbus.ui.slotselection.PbSlotCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUISpecs;
import app.chalo.premiumbus.ui.slotselection.PremiumBusDefaultOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassAvailableOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPassOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusPurchaseOptionUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionToolBarTitleUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionToolBarUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.SlotDelayTextUIState;
import app.chalo.premiumbus.ui.slotselection.ViewAllSlotsBottomSheetUIState;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt;
import app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRowKt;
import app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PbLandingScreenRouteSearchKt;
import app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PremiumBusLandingScreenKt;
import app.chalo.premiumbus.ui.stopselection.compose.PbLandingScreenRouteSearchKt;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkKeys;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19147a;

    public /* synthetic */ qr(int i) {
        this.f19147a = i;
    }

    private final Object a(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-997174657, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$-997174657.<anonymous> (PremiumBusSlotSelectionUiState.kt:2089)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            float f = ChaloThemeHelper.a().n;
            IconType iconType = IconType.IC_ARROW_BACK;
            ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().h);
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            ImageUIState imageUIState = new ImageUIState(iconType, (String) null, black, imageUISize, (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
            ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
            PremiumBusSlotSelectionToolBarUIState premiumBusSlotSelectionToolBarUIState = new PremiumBusSlotSelectionToolBarUIState(new PremiumBusSlotSelectionToolBarTitleUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, "Belapur Railway Station", null, 1, null, null, null, null, 122), ChaloTextStyleHelper.b(chaloTextStyleHelper, "Bank of Baroda, BKC, Mumbai", null, 1, null, null, null, UITextOverflow.Ellipsis, 58), ChaloThemeHelper.a().f, new ImageUIState(IconType.IC_BUS_STOP, (String) null, black, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242)), imageUIState, f, TsExtractor.TS_STREAM_TYPE_AC4);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ep(29);
                composer.updateRememberedValue(objRememberedValue);
            }
            PremiumBusSlotSelectionUiStateKt.p(premiumBusSlotSelectionToolBarUIState, (Function0) objRememberedValue, composer, 48);
            UITextStyle uITextStyle = UITextStyle.BodySmall;
            PBSlotSelectionTabItemUIState pBSlotSelectionTabItemUIState = new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Today", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            PBSlotSelectionTabItemUIState pBSlotSelectionTabItemUIState2 = new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Tomorrow", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
            PremiumBusSlotSelectionUiStateKt.o(CollectionsKt.S(pBSlotSelectionTabItemUIState, pBSlotSelectionTabItemUIState2, new PBSlotSelectionTabItemUIState(new PBSlotSelectionTabItemUISpecs(orangePrimary, 63), new TextUIState.ChaloTextUIState("Fri, 17 May", uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 18 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 19 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 20 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184))), composer, 0);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
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
            ODPairTagsUIState oDPairTagsUIState = new ODPairTagsUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, "Nearest stop", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
            TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper, "Belapur Railway Station", null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper, "Bank of Baroda, BKC", null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, "12 min walk (500m) from Sector 11, Belapur", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper, "1 min walk (100m) to Bank of Baroda, BKC", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper, "Directions to stops", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            IconType iconType2 = IconType.IC_STOP_DIRECTION;
            ImageUISize imageUISize2 = new ImageUISize(ChaloThemeHelper.a().h);
            ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
            OutlinedButtonUIState outlinedButtonUIState = new OutlinedButtonUIState(chaloTextUIStateC3, new ImageUIState(iconType2, (String) null, almostBlackColor, imageUISize2, (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), null, 121);
            RadioButtonUIState radioButtonUIState = new RadioButtonUIState(false, null, 62);
            TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
            UiEventHandler uiEventHandler = null;
            int i3 = 384;
            PremiumBusSlotSelectionUiStateKt.f(null, new PBOdPairWithSlotsCardUIState(oDPairTagsUIState, chaloTextUIStateB, chaloTextUIStateB2, chaloTextUIStateC, chaloTextUIStateC2, CollectionsKt.S(new PbSlotCardUIState((PbSlotCardUISpecs) null, radioButtonUIState, chaloTextUIStateG, new SlotDelayTextUIState(ChaloTextStyleHelper.h("+10 mins", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 14), ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ExpressSlotIndicatorUIState(null, null, 31), uiEventHandler, 385), new PbSlotCardUIState(new PbSlotCardUISpecs(ChaloColorToken.LightOrangeSpf.f9817a, 0.0f, new BorderUIState(ChaloThemeHelper.a().c, orangePrimary, ChaloThemeHelper.d.g), 253), new RadioButtonUIState(true, null, 62), ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SlotDelayTextUIState(ChaloTextStyleHelper.h("+10 mins", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 14), ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ExpressSlotIndicatorUIState(null, null, 31), uiEventHandler, i3), new PbSlotCardUIState(new PbSlotCardUISpecs(null, 0.6f, null, 447), new RadioButtonUIState(false, null, 62), ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SlotDelayTextUIState(ChaloTextStyleHelper.h("+10 mins", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 14), ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ExpressSlotIndicatorUIState(null, null, 31), uiEventHandler, i3)), outlinedButtonUIState, new OutlinedButtonUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, "View all time slots", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ImageUIState(IconType.IC_PLAYLIST, (String) null, almostBlackColor, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), null, 121), null, InputDeviceCompat.SOURCE_DPAD), true, composer, 384, 1);
            PremiumBusSlotSelectionUiStateKt.f(null, new PBOdPairWithSlotsCardUIState(new ODPairTagsUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, "Recommended", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)), ChaloTextStyleHelper.b(chaloTextStyleHelper, "Belapur Railway Station", null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.b(chaloTextStyleHelper, "Bank of Baroda, BKC", null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper, "12 min walk (500m) from Sector 11, Belapur", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper, "1 min walk (100m) to Bank of Baroda, BKC", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, new OutlinedButtonUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, "Directions to stops", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ImageUIState(iconType2, (String) null, almostBlackColor, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), null, 121), null, new StandardErrorScreenUIState.ErrorWithMsgAndRetry(new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), ChaloTextStyleHelper.e(chaloTextStyleHelper, "No slots available for this route", null, UITextAlign.Center, UIFontWeight.Bold, null, 102), null, null, null, null, 48), 321), false, composer, 384, 1);
            if (r1.k(composer)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object c(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(635901224, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$635901224.<anonymous> (PremiumBusSlotSelectionUiState.kt:2412)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ChaloColorToken.White white = ChaloColorToken.White.f9870a;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(white), null, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
            UITextStyle uITextStyle = UITextStyle.BodyMedium;
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            PremiumBusSlotSelectionToolBarUIState premiumBusSlotSelectionToolBarUIState = new PremiumBusSlotSelectionToolBarUIState(new PremiumBusSlotSelectionToolBarTitleUIState(new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, black, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), new TextUIState.ChaloTextUIState("Sector 11, Belandur", uITextStyle, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152), new TextUIState.ChaloTextUIState("Bank of Baroda, BKC Mumbai", uITextStyle, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152)), null, 0.0f, 254);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ep(29);
                composer.updateRememberedValue(objRememberedValue);
            }
            PremiumBusSlotSelectionUiStateKt.p(premiumBusSlotSelectionToolBarUIState, (Function0) objRememberedValue, composer, 48);
            Modifier modifierAlign = boxScopeInstance.align(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloColorTokenKt.c(white), null, 2, null), companion2.getBottomCenter());
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long jC = ChaloColorTokenKt.c(white);
            int i2 = CardDefaults.$stable;
            CardKt.Card(modifierAlign, null, cardDefaults.m1694cardColorsro_MJ88(jC, 0L, 0L, 0L, composer, i2 << 12, 14), cardDefaults.m1695cardElevationaqJV_2Y(ChaloTheme.c(composer, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer, i2 << 18, 62), null, ComposableSingletons$PremiumBusSlotSelectionUiStateKt.g, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object d(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$ProfileScreenUIKt.f3590a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(812772829, iIntValue, -1, "app.chalo.home.ui.profile.ComposableSingletons$ProfileScreenUIKt.lambda$812772829.<anonymous> (ProfileScreenUI.kt:485)");
            }
            ChaloSpacersKt.w(composer, 0);
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_ORANGE_ARROW_RIGHT, composer, 6), (String) null, SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 0).h), ChaloTheme.a(composer, 0).f1915a, composer, Painter.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object e(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$RideHailingUserFeedbackBottomSheetContentKt.f3378a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1134828830, iIntValue, -1, "app.chalo.home.ui.common.ComposableSingletons$RideHailingUserFeedbackBottomSheetContentKt.lambda$1134828830.<anonymous> (RideHailingUserFeedbackBottomSheetContent.kt:208)");
            }
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TELL_US_MORE, new Object[0], composer, 6), null, ChaloTheme.a(composer, 0).k, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getBodyMedium(), composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object f(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$RouteDetailsMainScreenKt.f4467a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-427975607, iIntValue, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.ComposableSingletons$RouteDetailsMainScreenKt.lambda$-427975607.<anonymous> (RouteDetailsMainScreen.kt:164)");
            }
            TextKt.m2623TextNvy7gAk("Ad Inspector", PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, Dp.m7278constructorimpl(12), Dp.m7278constructorimpl(6)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 54, 0, 262140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object g(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$SingleCardDetailsScreenKt.f6385a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2140152425, iIntValue, -1, "app.chalo.ncmc.ui.landing.compose.ComposableSingletons$SingleCardDetailsScreenKt.lambda$-2140152425.<anonymous> (SingleCardDetailsScreen.kt:303)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SelectedCardDetailsUiModel selectedCardDetailsUiModel = new SelectedCardDetailsUiModel(false, "1234567890", "₹100", true, true, CollectionsKt.S(new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewOfflineBalance.f6373a, "View Balance", null), new ChaloCardOptionUiModel(ChaloCardOperationType.SpecificCardOption.ViewTransactions.f6374a, "View Transactions", null)), new ChaloCardActivePassDetailsUiModel("Pass 1", "1 month", "Monthly", "10"), 128);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new cp(16);
                composer.updateRememberedValue(objRememberedValue);
            }
            SingleCardDetailsScreenKt.f(null, selectedCardDetailsUiModel, (Function1) objRememberedValue, composer, 384, 1);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object h(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$StopBasedTripPlannerSearchScreenKt.f4503a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375578226, iIntValue, -1, "app.chalo.livetracking.search.compose.ComposableSingletons$StopBasedTripPlannerSearchScreenKt.lambda$-1375578226.<anonymous> (StopBasedTripPlannerSearchScreen.kt:456)");
            }
            CollectionsKt.S(StopBasedTripPlannerSearchScreenKt.l("Metro Station A", "200m"), StopBasedTripPlannerSearchScreenKt.l("Bus Stop B", "300m"), StopBasedTripPlannerSearchScreenKt.l("Metro Station C", "450m"));
            ToolbarUIState toolbarUIState = new ToolbarUIState(null, new TextUIState.ChaloTextUIState("Trip Planner", UITextStyle.DisplaySmall, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, null, null, ChaloThemeHelper.c.f1917a, null, ChaloColorToken.Transparent.f9864a, 93);
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
            ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
            TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, "From fromnamesdvs sjdbvljkzbds, sjdbvljkzbds, sjdbvljkzbds, sjdbvljkzbds123", shadyGray, null, null, null, uITextOverflow, 56);
            UITextStyle uITextStyle = UITextStyle.BodyLarge;
            int i = 8;
            StopBasedTripPlannerSearchScreenKt.g(null, new StopBasedTripPlannerSearchViewState(toolbarUIState, null, new StopBasedMetroFromToSelectionContainerUIState(null, new FromToStopIconUIState(), new StopSelectionUIState(null, chaloTextUIStateC, new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState("fromnamesdv, fromnamesdv, fromnamesdv, fromnamesdvfromnamesdv, fromnamesdv123", null, null, uITextStyle, null, UITextOverflow.Clip, null, 758)), null, uITextOverflow, 18), null, null, UiEventHandler.Companion.a(new wb(i)), 25), new StopSelectionUIState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper, "To", shadyGray, null, null, null, null, 124), new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState("toname", null, null, uITextStyle, null, null, null, 1014)), null, null, 30), null, null, UiEventHandler.Companion.a(new wb(i)), 25), new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().m), UIContentScale.Fit, 0.0f, UiEventHandler.Companion.a(new wb(i)), 102), null), null, StopBasedTripPlannerSearchBottomSheetUiStateType.None.b, 69), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object i(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TicketPunchDividerKt.f1897a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2005013765, iIntValue, -1, "app.chalo.compose.components.divider.ComposableSingletons$TicketPunchDividerKt.lambda$-2005013765.<anonymous> (TicketPunchDivider.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), 0.0f, 1, null);
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
            TicketPunchDividerKt.a(PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m7278constructorimpl(50)), Dp.m7278constructorimpl(16), 0.0f, 2, null), null, 0.0f, 0.0f, composer, 6, 14);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object j(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TooltipPopupComposableKt.f1839a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-845591573, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt.lambda$-845591573.<anonymous> (TooltipPopupComposable.kt:453)");
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.m833width3ABfNKs(Modifier.INSTANCE, Dp.m7278constructorimpl(200)), ChaloTheme.b(composer, 6).h);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM784padding3ABfNKs);
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
            TextKt.m2623TextNvy7gAk("Tooltip", null, ChaloTheme.a(composer, 6).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer, 6)), composer, 6, 0, 131066);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object k(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TooltipPopupComposableKt.f1839a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278897678, iIntValue, -1, "app.chalo.compose.components.ComposableSingletons$TooltipPopupComposableKt.lambda$-1278897678.<anonymous> (TooltipPopupComposable.kt:438)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer, 6).t, null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk("test 1", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new sr(1);
                composer.updateRememberedValue(objRememberedValue);
            }
            TooltipPopupComposableKt.a(null, null, true, null, 0L, 0.0f, 0.0f, null, false, (Function0) objRememberedValue, ComposableSingletons$TooltipPopupComposableKt.f1839a, ComposableSingletons$TooltipPopupComposableKt.b, composer, 384, 438, 1019);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object l(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
        int i = 2;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1365783987, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$-1365783987.<anonymous> (TripPlannerDetailsScreen.kt:738)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer, 0).f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BottomSheetScaffoldState bottomSheetScaffoldState = new BottomSheetScaffoldState(new DrawerState(DrawerValue.Closed, new nw(29)), new BottomSheetState(BottomSheetValue.Expanded, SwipeableDefaults.f4453a, new wa(19)), new SnackbarHostState());
            SheetValue sheetValue = SheetValue.Hidden;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = new sr(i);
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new sr(i);
                composer.updateRememberedValue(objRememberedValue2);
            }
            SheetState sheetState = new SheetState(false, function0, (Function0) objRememberedValue2, sheetValue, null, false, 48, null);
            TripPlannerLegUiModel.Auto auto = new TripPlannerLegUiModel.Auto("Maker maxity", "10 mins", "Rs 50");
            RouteNamingSchemeType routeNamingSchemeType = RouteNamingSchemeType.DEFAULT;
            List listS = CollectionsKt.S("AC", InMobiNetworkKeys.CITY);
            List listS2 = CollectionsKt.S("Dwarka", "Uttam nagar", "Janakpuri", "Tilak Nagar");
            RouteServiceType routeServiceType = RouteServiceType.REGULAR;
            TripPlannerDetailsState tripPlannerDetailsState = new TripPlannerDetailsState(CollectionsKt.S(auto, new TripPlannerLegUiModel.Bus("", "A-123", routeNamingSchemeType, "Via Dwarka, Najafgarh, Tilak Nagar", "Ayurvedha college", "Vellanadh", listS, null, "Scheduled every 5 mins", null, listS2, "Rs 50", "10 mins", "View Route", "Buy Product", 4, "dummy", routeServiceType), new TripPlannerLegUiModel.Bus("", "A-123", routeNamingSchemeType, "Via Dwarka, Najafgarh, Tilak Nagar", "Ayurvedha college", "Vellanadh", CollectionsKt.S("AC", InMobiNetworkKeys.CITY), null, "Scheduled every 5 mins", null, CollectionsKt.S("Dwarka", "Uttam nagar", "Janakpuri", "Tilak Nagar"), "Rs 50", "10 mins", "View Route", "Buy Product", 4, "dummy", routeServiceType)), 496);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new cp(18);
                composer.updateRememberedValue(objRememberedValue3);
            }
            TripPlannerDetailsScreenKt.k(bottomSheetScaffoldState, sheetState, tripPlannerDetailsState, (Function1) objRememberedValue3, composer, 3072);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object m(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(322356711, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$322356711.<anonymous> (TripPlannerDetailsScreen.kt:818)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer, 0).f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TripPlannerDetailsScreenKt.a(IconType.AUTO_TRIP_PLANNER, "5 min", "Ayurveda college", "Rs 50", 0, null, null, composer, 28086, 96);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    private final Object n(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-957173887, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$-957173887.<anonymous> (TripPlannerDetailsScreen.kt:837)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer, 0).f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
            int i = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TripPlannerDetailsScreenKt.n(IconType.WALK_TRIP_PLANNER, "5 min", "Ayurveda college which is in mumbai with a big name", 1, null, null, composer, 3510, 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19147a;
        int i2 = 15;
        int i3 = 29;
        Unit unit = Unit.f17538a;
        int i4 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$PbBulkBookingRideDetailsScreenKt.f6905a;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1239636026, iIntValue, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.ComposableSingletons$PbBulkBookingRideDetailsScreenKt.lambda$1239636026.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1160)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$PbLandingScreenRouteSearchKt.f7988a;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(821246212, iIntValue2, -1, "app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PbLandingScreenRouteSearchKt.lambda$821246212.<anonymous> (PbLandingScreenRouteSearch.kt:275)");
                    }
                    Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(Modifier.INSTANCE, ChaloTheme.a(composer2, 0).t, null, 2, null);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new cp(14);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    int i5 = 28;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new ep(i5);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new ep(i5);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function2 = (Function0) objRememberedValue3;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new ep(i5);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    PbLandingScreenRouteSearchKt.c(modifierM264backgroundbw27NRU$default, "from stop", null, null, null, null, null, null, null, false, function1, function0, function2, (Function0) objRememberedValue4, composer2, 805330992, 3510, 492);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda3 = ComposableSingletons$PremiumBusChangeStopScreenKt.f7523a;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1179959772, iIntValue3, -1, "app.chalo.premiumbus.ui.changestop.ComposableSingletons$PremiumBusChangeStopScreenKt.lambda$1179959772.<anonymous> (PremiumBusChangeStopScreen.kt:148)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer3, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloSpacersKt.m(composer3, 0);
                    SpacerKt.Spacer(BackgroundKt.m263backgroundbw27NRU(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer3, 0).f), ChaloTheme.b(composer3, 0).n), ChaloTheme.a(composer3, 0).r0, ChaloTheme.d(composer3, 0).f), composer3, 0);
                    ChaloSpacersKt.u(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda4 = ComposableSingletons$PremiumBusFareDetailsScaffoldKt.f7560a;
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1042220256, iIntValue4, -1, "app.chalo.premiumbus.ui.faredetails.compose.ComposableSingletons$PremiumBusFareDetailsScaffoldKt.lambda$1042220256.<anonymous> (PremiumBusFareDetailsScaffold.kt:41)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda5 = ComposableSingletons$PremiumBusLandingScreenKt.f7989a;
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1843900085, iIntValue5, -1, "app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PremiumBusLandingScreenKt.lambda$1843900085.<anonymous> (PremiumBusLandingScreen.kt:376)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_PHONE, composer5, 6), (String) null, (Modifier) null, ChaloTheme.a(composer5, 0).g, composer5, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda6 = ComposableSingletons$PremiumBusLandingScreenKt.f7989a;
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-303357904, iIntValue6, -1, "app.chalo.premiumbus.ui.stopselection.compose.ComposableSingletons$PremiumBusLandingScreenKt.lambda$-303357904.<anonymous> (PremiumBusLandingScreen.kt:400)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.ICON_HELP, composer6, 6), (String) null, (Modifier) null, ChaloTheme.a(composer6, 0).g, composer6, Painter.$stable | 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$PremiumBusNotificationScreenKt.f3168a;
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1107321263, iIntValue7, -1, "app.chalo.home.ui.ComposableSingletons$PremiumBusNotificationScreenKt.lambda$1107321263.<anonymous> (PremiumBusNotificationScreen.kt:59)");
                    }
                    ChaloToolBarKt.c(StringResourcesHelperKt.c(StringEnum.NOTIFICATIONS, new Object[0], composer7, 6), 0, 0, null, composer7, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 7:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a;
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1010238556, iIntValue8, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt.lambda$1010238556.<anonymous> (PremiumBusScrollableTabRow.kt:61)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 8:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a;
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1562466204, iIntValue9, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt.lambda$-1562466204.<anonymous> (PremiumBusScrollableTabRow.kt:135)");
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composer9, 6);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer9, 0);
                    int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer9.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer9, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer9.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer9.startReusableNode();
                    if (composer9.getInserting()) {
                        composer9.createNode(constructor2);
                    } else {
                        composer9.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer9);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Object objRememberedValue5 = composer9.rememberedValue();
                    Composer.Companion companion5 = Composer.INSTANCE;
                    int i8 = 5;
                    if (objRememberedValue5 == companion5.getEmpty()) {
                        UITextStyle uITextStyle = UITextStyle.BodySmall;
                        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
                        objRememberedValue5 = CollectionsKt.S(new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Today", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Tomorrow", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new PBSlotSelectionTabItemUISpecs(null, 123), new TextUIState.ChaloTextUIState("Fri, 17 May", uITextStyle, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 18 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 19 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), new PBSlotSelectionTabItemUIState(new TextUIState.ChaloTextUIState("Fri, 20 May", uITextStyle, black, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                        composer9.updateRememberedValue(objRememberedValue5);
                    }
                    List list = (List) objRememberedValue5;
                    boolean zChangedInstance = composer9.changedInstance(list);
                    Object objRememberedValue6 = composer9.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == companion5.getEmpty()) {
                        objRememberedValue6 = new af(list, i8);
                        composer9.updateRememberedValue(objRememberedValue6);
                    }
                    PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue6, composer9, 0, 3);
                    float f = ChaloTheme.b(composer9, 0).R;
                    Object objRememberedValue7 = composer9.rememberedValue();
                    if (objRememberedValue7 == companion5.getEmpty()) {
                        objRememberedValue7 = new cp(i2);
                        composer9.updateRememberedValue(objRememberedValue7);
                    }
                    PremiumBusScrollableTabRowKt.b(list, pagerStateRememberPagerState, null, 0.0f, f, (Function1) objRememberedValue7, ComposableSingletons$PremiumBusScrollableTabRowKt.b, composer9, 1769472, 12);
                    composer9.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 9:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(482772078, iIntValue10, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$482772078.<anonymous> (PremiumBusSlotSelectionUiState.kt:1978)");
                    }
                    UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
                    UITextAlign uITextAlign = UITextAlign.Center;
                    ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
                    TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState("SUGGESTION_NOTED_TITLE", uITextStyle2, black_87, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                    UITextStyle uITextStyle3 = UITextStyle.BodyMedium;
                    TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState("SUGGESTION_NOTED_TITLE", uITextStyle3, black_87, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
                    ImageUIState imageUIState = new ImageUIState(IconType.ACKNOWLEDGEMENT_PASS_TICKET, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                    TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState("OKAY", uITextStyle3, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
                    UIShape.Rectangle rectangle = UIShape.d;
                    Object objRememberedValue8 = composer10.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new ep(i3);
                        composer10.updateRememberedValue(objRememberedValue8);
                    }
                    PremiumBusSlotSelectionUiStateKt.k(new NewSlotTimeSuggestionSuccessUIState(ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, chaloTextUIState3, (Function0) objRememberedValue8, rectangle, false, 0.0f, 52), imageUIState, chaloTextUIState, chaloTextUIState2), composer10, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 10:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741022146, iIntValue11, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$-1741022146.<anonymous> (PremiumBusSlotSelectionUiState.kt:2014)");
                    }
                    ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
                    TextUIState.ChaloTextUIState chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper, "Available slots", null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    RadioButtonUIState radioButtonUIState = new RadioButtonUIState(true, null, 62);
                    PbSlotCardUISpecs pbSlotCardUISpecs = new PbSlotCardUISpecs(ChaloColorToken.LightOrangeSpf.f9817a, 0.0f, new BorderUIState(ChaloThemeHelper.a().c, ChaloColorToken.OrangePrimary.f9835a, ChaloThemeHelper.d.g), 253);
                    TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                    List listS = CollectionsKt.S(new PbSlotCardUIState(pbSlotCardUISpecs, radioButtonUIState, chaloTextUIStateG, new SlotDelayTextUIState(ChaloTextStyleHelper.h("+10 mins", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 12), ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new ExpressSlotIndicatorUIState(null, null, 31), (UiEventHandler) null, 384), new PbSlotCardUIState(new PbSlotCardUISpecs(null, 0.3f, null, 447), (RadioButtonUIState) null, ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SlotDelayTextUIState(ChaloTextStyleHelper.h("+10 mins", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 12), ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), (ExpressSlotIndicatorUIState) null, (UiEventHandler) null, 386), new PbSlotCardUIState((PbSlotCardUISpecs) (0 == true ? 1 : 0), (RadioButtonUIState) null, ChaloTextStyleHelper.g(chaloTextStyleHelper, "7:55 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), (SlotDelayTextUIState) null, ChaloTextStyleHelper.h("Few seats left", null, uIFontWeight, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper, "Reach by 9:00 PM", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), (ExpressSlotIndicatorUIState) (0 == true ? 1 : 0), (UiEventHandler) null, 387));
                    TextUIState.ChaloTextUIState chaloTextUIStateG2 = ChaloTextStyleHelper.g(chaloTextStyleHelper, "Confirm Slot", ChaloColorToken.White.f9870a, null, null, null, null, 124);
                    UIShape.Rectangle rectangle2 = UIShape.d;
                    Object objRememberedValue9 = composer11.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new ep(i3);
                        composer11.updateRememberedValue(objRememberedValue9);
                    }
                    PremiumBusSlotSelectionUiStateKt.w(new ViewAllSlotsBottomSheetUIState(chaloTextUIStateD, listS, ButtonUIStateFactory.f(ButtonUIStateFactory.f9921a, chaloTextUIStateG2, (Function0) objRememberedValue9, rectangle2, false, 0.0f, 36), null, 17), composer11, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 11:
                return a(obj, obj2);
            case 12:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1236858294, iIntValue12, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$-1236858294.<anonymous> (PremiumBusSlotSelectionUiState.kt:2310)");
                    }
                    UITextStyle uITextStyle4 = UITextStyle.HeadlineMedium;
                    ChaloColorToken.Black black2 = ChaloColorToken.Black.f9759a;
                    TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState("Select your pass", uITextStyle4, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    UITextStyle uITextStyle5 = UITextStyle.DisplaySmall;
                    TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState("Daily pass", uITextStyle5, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    UITextStyle uITextStyle6 = UITextStyle.BodyMedium;
                    PremiumBusSlotSelectionUiStateKt.m(new PremiumBusPurchaseOptionUIState(chaloTextUIState4, CollectionsKt.S(new PremiumBusPassAvailableOptionUIState.PassOption(new PremiumBusPassOptionUIState(chaloTextUIState5, new TextUIState.ChaloTextUIState("Valid for 1 day", uITextStyle6, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new PassOptionAdditionalInfo(new TextUIState.ChaloTextUIState("Recommended", uITextStyle6, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, 17)), new PremiumBusPassAvailableOptionUIState.PassOption(new PremiumBusPassOptionUIState(new TextUIState.ChaloTextUIState("Weekly pass", uITextStyle5, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState("Valid for 7 days", uITextStyle6, black2, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null, null, 25)), new PremiumBusPassAvailableOptionUIState.DefaultOption(new PremiumBusDefaultOptionUIState(new PremiumBusDefaultOptionUISpecs(null, 15), new TextUIState.ChaloTextUIState("Buy New Pass/Ticket", uITextStyle4, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), UiEventHandler.Companion.f9897a)))), composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 13:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$PremiumBusSlotSelectionUiStateKt.f7794a;
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1953843071, iIntValue13, -1, "app.chalo.premiumbus.ui.slotselection.ComposableSingletons$PremiumBusSlotSelectionUiStateKt.lambda$-1953843071.<anonymous> (PremiumBusSlotSelectionUiState.kt:2373)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer13, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor3);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                    ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
                    TextUIState.ChaloTextUIState chaloTextUIStateD2 = ChaloTextStyleHelper.d(chaloTextStyleHelper2, "When do you want a ride?", null, null, uIFontWeight2, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    TextUIState.ChaloTextUIState chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, "Select date", null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    TextUIState.ChaloTextUIState chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, "Select time", null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    TextUIState.ChaloTextUIState chaloTextUIStateG3 = ChaloTextStyleHelper.g(chaloTextStyleHelper2, "Continue", ChaloColorToken.White.f9870a, null, null, null, null, 124);
                    UIShape.Rectangle rectangle3 = UIShape.d;
                    Object objRememberedValue10 = composer13.rememberedValue();
                    Composer.Companion companion7 = Composer.INSTANCE;
                    if (objRememberedValue10 == companion7.getEmpty()) {
                        objRememberedValue10 = new ep(i3);
                        composer13.updateRememberedValue(objRememberedValue10);
                    }
                    ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    ButtonUIState buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, chaloTextUIStateG3, (Function0) objRememberedValue10, rectangle3, false, 0.0f, 52);
                    TextUIState.ChaloTextUIState chaloTextUIStateG4 = ChaloTextStyleHelper.g(chaloTextStyleHelper2, "Cancel", null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    Object objRememberedValue11 = composer13.rememberedValue();
                    if (objRememberedValue11 == companion7.getEmpty()) {
                        objRememberedValue11 = new ep(i3);
                        composer13.updateRememberedValue(objRememberedValue11);
                    }
                    PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = new PremiumBusSlotSelectionDateAndTimePickerUIState(7, 55, "PM", chaloTextUIStateD2, chaloTextUIStateF, chaloTextUIStateF2, buttonUIStateF, ButtonUIStateFactory.d(buttonUIStateFactory, chaloTextUIStateG4, (Function0) objRememberedValue11, null, false, 60), null, 520);
                    Object objRememberedValue12 = composer13.rememberedValue();
                    if (objRememberedValue12 == companion7.getEmpty()) {
                        objRememberedValue12 = new rr(i4);
                        composer13.updateRememberedValue(objRememberedValue12);
                    }
                    PremiumBusSlotSelectionUiStateKt.n(premiumBusSlotSelectionDateAndTimePickerUIState, null, (Function3) objRememberedValue12, composer13, 384, 2);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 14:
                return c(obj, obj2);
            case 15:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$PremiumBusTutorialScreenKt.f3289a;
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1212492876, iIntValue14, -1, "app.chalo.home.ui.chalobus.ComposableSingletons$PremiumBusTutorialScreenKt.lambda$1212492876.<anonymous> (PremiumBusTutorialScreen.kt:46)");
                    }
                    ChaloToolBarKt.c(StringResourcesHelperKt.c(StringEnum.CHALO_BUS_GUIDE, new Object[0], composer14, 6), 0, 0, null, composer14, 0, 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 16:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$ProfileCompletionTrackerKt.f1838a;
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1970857235, iIntValue15, -1, "app.chalo.compose.components.ComposableSingletons$ProfileCompletionTrackerKt.lambda$-1970857235.<anonymous> (ProfileCompletionTracker.kt:139)");
                    }
                    Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer15, 6).t, null, 2, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer15, 0);
                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer15.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer15, modifierM264backgroundbw27NRU$default2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion8.getConstructor();
                    if (composer15.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer15.startReusableNode();
                    if (composer15.getInserting()) {
                        composer15.createNode(constructor4);
                    } else {
                        composer15.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer15);
                    pk0.v(companion8, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i10), composerM3915constructorimpl4));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    float f2 = 4;
                    ProfileCompletionTrackerKt.a(5, 3, Dp.m7278constructorimpl(62), ChaloColorToken.GreenColor.f9801a, ChaloColorToken.GreyColor.f9806a, Dp.m7278constructorimpl(f2), Dp.m7278constructorimpl(f2), Dp.m7278constructorimpl(6), null, ComposableSingletons$ProfileCompletionTrackerKt.f1838a, composer15, 819686838, 256);
                    composer15.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 17:
                return d(obj, obj2);
            case 18:
                return ComposableSingletons$RecomposerKt.lambda__1091980426$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 19:
                return e(obj, obj2);
            case 20:
                return f(obj, obj2);
            case 21:
                return g(obj, obj2);
            case 22:
                return h(obj, obj2);
            case 23:
                return i(obj, obj2);
            case 24:
                return j(obj, obj2);
            case 25:
                return k(obj, obj2);
            case 26:
                return l(obj, obj2);
            case 27:
                return m(obj, obj2);
            case 28:
                return n(obj, obj2);
            default:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$TripPlannerDetailsScreenKt.f4745a;
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1766749908, iIntValue16, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.ComposableSingletons$TripPlannerDetailsScreenKt.lambda$-1766749908.<anonymous> (TripPlannerDetailsScreen.kt:855)");
                    }
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, ChaloTheme.b(composer16, 0).f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer16, 0);
                    int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap5 = composer16.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer16, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                    if (composer16.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer16.startReusableNode();
                    if (composer16.getInserting()) {
                        composer16.createNode(constructor5);
                    } else {
                        composer16.useNode();
                    }
                    Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer16);
                    pk0.v(companion9, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                    Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl5, Integer.valueOf(i11), composerM3915constructorimpl5));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    IconType iconType = IconType.WALK_TRIP_PLANNER;
                    TripPlannerLegUiModel.Bus bus = new TripPlannerLegUiModel.Bus("", "A-123", RouteNamingSchemeType.DEFAULT, "Via Dwarka, Najafgarh, Tilak Nagar", "Ayurvedha college", "Vellanadh", CollectionsKt.S("AC", InMobiNetworkKeys.CITY), null, "Scheduled every 5 mins", null, CollectionsKt.S("Dwarka", "Uttam nagar", "Janakpuri", "Tilak Nagar"), "Rs 50", "10 mins", "View Route", "Buy Product", 4, "dummy", RouteServiceType.REGULAR);
                    Object objRememberedValue13 = composer16.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new cp(17);
                        composer16.updateRememberedValue(objRememberedValue13);
                    }
                    TripPlannerDetailsScreenKt.e(iconType, (Function1) objRememberedValue13, bus, "", 1, null, composer16, 27702, 32);
                    composer16.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
        }
    }
}
