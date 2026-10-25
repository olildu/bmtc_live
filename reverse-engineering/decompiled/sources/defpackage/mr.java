package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.checkout.ui.screen.checkout.razorpay.compose.ComposableSingletons$CheckoutScreenKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.ChaloUserReviewFormComposableKt;
import app.chalo.compose.ComposableSingletons$ChaloToolBarKt;
import app.chalo.compose.ComposableSingletons$ChaloUserReviewFormComposableKt;
import app.chalo.compose.ComposableSingletons$GenericErrorScreenWithMsgAndRetryKt;
import app.chalo.compose.StandardErrorScreenKt;
import app.chalo.compose.components.ComposableSingletons$GenericScreenWithCtaKt;
import app.chalo.compose.components.ComposableSingletons$MultipleFromToStopComposableKt;
import app.chalo.compose.components.GenericScreenWithCtaKt;
import app.chalo.compose.components.MultipleFromToStopComposableKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.compose.theme.ShapedContentUIStateFactory;
import app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt;
import app.chalo.home.nearbytrips.ui.mapscreen.ComposableSingletons$NearbyStopsMapScreenKt;
import app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt;
import app.chalo.instantticket.ui.faredetails.compose.ComposableSingletons$FareRouteAndStopDetailsViewKt;
import app.chalo.instantticket.ui.faredetails.compose.FareRouteAndStopDetailsViewKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.ComposableSingletons$OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.compose.components.OriginDestinationSearchCardKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.SearchStopItemUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopInfoUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.TripPlannerOriginDestinationSearchbarUiState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.entercarddetails.compose.ComposableSingletons$EnterCardDetailsScreenKt;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineCardRechargeScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineRechargeSuccessScreenKt;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.ComposableSingletons$NcmcOnlineRechargeScreenKt;
import app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.citylocationselection.ui.ComposableSingletons$CityLocationSelectionScreenKt;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.fromto.MultipleFromToStopConnectorUIState;
import app.chalo.uistate.fromto.MultipleFromToStopItemUIState;
import app.chalo.uistate.fromto.MultipleFromToStopUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FeedbackTags;
import app.chalo.validationsdk.blevalidation.ui.common.ComposableSingletons$JourneyDetailsBottomSheetKt;
import com.google.maps.android.compose.ComposableSingletons$GoogleMapKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18422a;

    public /* synthetic */ mr(int i) {
        this.f18422a = i;
    }

    private final Object a(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ComposableLambda composableLambda = ComposableSingletons$OfflineCardRechargeScreenKt.f6400a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259518588, iIntValue, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineCardRechargeScreenKt.lambda$-1259518588.<anonymous> (OfflineCardRechargeScreen.kt:486)");
            }
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ENTER_AMOUNT, new Object[0], composer, 6), null, ChaloTheme.a(composer, 0).k, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer, 0)), composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
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
        ComposableLambda composableLambda = ComposableSingletons$OfflineCardRechargeScreenKt.f6400a;
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(311016555, iIntValue, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineCardRechargeScreenKt.lambda$311016555.<anonymous> (OfflineCardRechargeScreen.kt:581)");
            }
            OfflineCardRechargeViewState offlineCardRechargeViewState = new OfflineCardRechargeViewState(2072495);
            FocusRequester focusRequester = new FocusRequester();
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new cp(13);
                composer.updateRememberedValue(objRememberedValue);
            }
            OfflineCardRechargeScreenKt.a(offlineCardRechargeViewState, focusRequester, null, (Function1) objRememberedValue, composer, 3456);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v4, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ChaloColorToken.Custom custom;
        int i = this.f18422a;
        int i2 = 10;
        int i3 = 4;
        Throwable th = null;
        Unit unit = Unit.f17538a;
        int i4 = 2;
        int i5 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$ChaloToolBarKt.f1806a;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1930841370, iIntValue, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$1930841370.<anonymous> (ChaloToolBar.kt:162)");
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
                ComposableLambda composableLambda2 = ComposableSingletons$ChaloToolBarKt.f1806a;
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1771750151, iIntValue2, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$-1771750151.<anonymous> (ChaloToolBar.kt:441)");
                    }
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
                ComposableLambda composableLambda3 = ComposableSingletons$ChaloToolBarKt.f1806a;
                if (composer3.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1260861961, iIntValue3, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$1260861961.<anonymous> (ChaloToolBar.kt:466)");
                    }
                    ChaloToolBarKt.c("Premium Reserve Ticket", 0, 0, null, composer3, 6, 14);
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
                ComposableLambda composableLambda4 = ComposableSingletons$ChaloToolBarKt.f1806a;
                if (composer4.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-918095277, iIntValue4, -1, "app.chalo.compose.ComposableSingletons$ChaloToolBarKt.lambda$-918095277.<anonymous> (ChaloToolBar.kt:464)");
                    }
                    ChaloToolBarKt.a(null, ComposableSingletons$ChaloToolBarKt.f, null, null, 0.0f, 0L, null, null, false, null, composer4, 48, 0, 2045);
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
                ComposableLambda composableLambda5 = ComposableSingletons$ChaloUserReviewFormComposableKt.f1807a;
                if (composer5.shouldExecute((iIntValue5 & 3) != 2, iIntValue5 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1830732425, iIntValue5, -1, "app.chalo.compose.ComposableSingletons$ChaloUserReviewFormComposableKt.lambda$-1830732425.<anonymous> (ChaloUserReviewFormComposable.kt:159)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    IconType iconType = IconType.CHALO_BUS_PLACEHOLDER;
                    int i6 = 5;
                    FeedbackData feedbackData = new FeedbackData(new Pair(0, 1), "What went wrong?", CollectionsKt.S(new FeedbackTags(1, "Tap in/Tap out failure"), new FeedbackTags(2, "Not sure how to tap"), new FeedbackTags(3, "Overcrowded bus"), new FeedbackTags(4, "Overcrowded bus"), new FeedbackTags(5, "Overcrowded bus"), new FeedbackTags(6, "Other")), false);
                    Object objRememberedValue = composer5.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = new mr(i6);
                        composer5.updateRememberedValue(objRememberedValue);
                    }
                    Function2 function2 = (Function2) objRememberedValue;
                    Object objRememberedValue2 = composer5.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new ep(24);
                        composer5.updateRememberedValue(objRememberedValue2);
                    }
                    ChaloUserReviewFormComposableKt.a(companion, iconType, "Oops ! You missed tapping out", "You might be fined next time if you do not tap out", "Tell us why", feedbackData, "SUBMIT", function2, (Function0) objRememberedValue2, composer5, 114847158);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 5:
                ComposableLambda composableLambda6 = ComposableSingletons$ChaloUserReviewFormComposableKt.f1807a;
                Intrinsics.i((List) obj, "<unused var>");
                Intrinsics.i((String) obj2, "<unused var>");
                return unit;
            case 6:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda7 = ComposableSingletons$CheckoutScreenKt.f1498a;
                if (composer6.shouldExecute((iIntValue6 & 3) != 2, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1799397567, iIntValue6, -1, "app.chalo.checkout.ui.screen.checkout.razorpay.compose.ComposableSingletons$CheckoutScreenKt.lambda$-1799397567.<anonymous> (CheckoutScreen.kt:101)");
                    }
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PAYMENT_BREAKDOWN, new Object[0], composer6, 6), null, 0L, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 0).getDisplaySmall(), composer6, 1572864, 0, 131006);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 7:
                Composer composer7 = (Composer) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda8 = ComposableSingletons$CityLocationSelectionScreenKt.f6600a;
                if (composer7.shouldExecute((iIntValue7 & 3) != 2, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1518939684, iIntValue7, -1, "app.chalo.onboarding.citylocationselection.ui.ComposableSingletons$CityLocationSelectionScreenKt.lambda$1518939684.<anonymous> (CityLocationSelectionScreen.kt:575)");
                    }
                    CityLocationSelectionState cityLocationSelectionState = new CityLocationSelectionState(CityLocationSelectionLayoutType.CityWelcome, 1995);
                    Object objRememberedValue3 = composer7.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new cp(9);
                        composer7.updateRememberedValue(objRememberedValue3);
                    }
                    CityLocationSelectionScreenKt.d(cityLocationSelectionState, (Function1) objRememberedValue3, composer7, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 8:
                Composer composer8 = (Composer) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda9 = ComposableSingletons$CityLocationSelectionScreenKt.f6600a;
                if (composer8.shouldExecute((iIntValue8 & 3) != 2, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1992849907, iIntValue8, -1, "app.chalo.onboarding.citylocationselection.ui.ComposableSingletons$CityLocationSelectionScreenKt.lambda$1992849907.<anonymous> (CityLocationSelectionScreen.kt:591)");
                    }
                    CityLocationSelectionState cityLocationSelectionState2 = new CityLocationSelectionState(CityLocationSelectionLayoutType.LocationPermission, 1995);
                    Object objRememberedValue4 = composer8.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new cp(i2);
                        composer8.updateRememberedValue(objRememberedValue4);
                    }
                    CityLocationSelectionScreenKt.d(cityLocationSelectionState2, (Function1) objRememberedValue4, composer8, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer8.skipToGroupEnd();
                }
                return unit;
            case 9:
                return ComposableSingletons$CompositionKt.lambda_954879418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return ComposableSingletons$CompositionKt.lambda_1918065384$lambda$0((Composer) obj, ((Integer) obj2).intValue());
            case 11:
                Composer composer9 = (Composer) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda10 = ComposableSingletons$EnterCardDetailsScreenKt.f6337a;
                if (composer9.shouldExecute((iIntValue9 & 3) != 2, iIntValue9 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1319313010, iIntValue9, -1, "app.chalo.ncmc.ui.entercarddetails.compose.ComposableSingletons$EnterCardDetailsScreenKt.lambda$-1319313010.<anonymous> (EnterCardDetailsScreen.kt:340)");
                    }
                    EnterCardDetailsViewState enterCardDetailsViewState = new EnterCardDetailsViewState(0, 4095, null, null, null, null, null, false, false, false);
                    Object objRememberedValue5 = composer9.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new cp(11);
                        composer9.updateRememberedValue(objRememberedValue5);
                    }
                    EnterCardDetailsScreenKt.d(enterCardDetailsViewState, (Function1) objRememberedValue5, null, new FocusRequester(), new FocusRequester(), ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer9, 0, 3), composer9, 432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 12:
                Composer composer10 = (Composer) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda11 = ComposableSingletons$EnterCardDetailsScreenKt.f6337a;
                if (composer10.shouldExecute((iIntValue10 & 3) != 2, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-973197991, iIntValue10, -1, "app.chalo.ncmc.ui.entercarddetails.compose.ComposableSingletons$EnterCardDetailsScreenKt.lambda$-973197991.<anonymous> (EnterCardDetailsScreen.kt:358)");
                    }
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer10, 0).t, null, 2, null), ChaloTheme.b(composer10, 0).h, ChaloTheme.b(composer10, 0).i);
                    Object objRememberedValue6 = composer10.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue6 == companion3.getEmpty()) {
                        objRememberedValue6 = new ep(25);
                        composer10.updateRememberedValue(objRememberedValue6);
                    }
                    Function0 function0 = (Function0) objRememberedValue6;
                    Object objRememberedValue7 = composer10.rememberedValue();
                    if (objRememberedValue7 == companion3.getEmpty()) {
                        objRememberedValue7 = new ep(25);
                        composer10.updateRememberedValue(objRememberedValue7);
                    }
                    EnterCardDetailsScreenKt.e(modifierM785paddingVpY3zN4, "124412", function0, (Function0) objRememberedValue7, composer10, 3504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 13:
                Composer composer11 = (Composer) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda12 = ComposableSingletons$FareRouteAndStopDetailsViewKt.f3911a;
                if (composer11.shouldExecute((iIntValue11 & 3) != 2, iIntValue11 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-784406142, iIntValue11, -1, "app.chalo.instantticket.ui.faredetails.compose.ComposableSingletons$FareRouteAndStopDetailsViewKt.lambda$-784406142.<anonymous> (FareRouteAndStopDetailsView.kt:224)");
                    }
                    ProductBookingRouteSpecialFeatureTagType productBookingRouteSpecialFeatureTagType = ProductBookingRouteSpecialFeatureTagType.OLD;
                    FareRouteAndStopDetailsViewKt.b(null, "S - 122", CollectionsKt.S(new ProductBookingSpecialFeature("ac", productBookingRouteSpecialFeatureTagType), new ProductBookingSpecialFeature("best", productBookingRouteSpecialFeatureTagType)), "Start Stop Name", "End Stop Name", "Selected Time", "Via", RouteNamingSchemeType.DEFAULT, true, composer11, 115043376, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 14:
                Composer composer12 = (Composer) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda13 = ComposableSingletons$GenericErrorScreenWithMsgAndRetryKt.f1808a;
                if (composer12.shouldExecute((iIntValue12 & 3) != 2, iIntValue12 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(482057087, iIntValue12, -1, "app.chalo.compose.ComposableSingletons$GenericErrorScreenWithMsgAndRetryKt.lambda$482057087.<anonymous> (GenericErrorScreenWithMsgAndRetry.kt:18)");
                    }
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer12, 0);
                    int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer12.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer12, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer12.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer12.startReusableNode();
                    if (composer12.getInserting()) {
                        composer12.createNode(constructor);
                    } else {
                        composer12.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer12);
                    pk0.v(companion5, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion4, 0.8f);
                    Painter painterA = IconAssetHelper_androidKt.a(IconType.NO_INTERNET_ERROR, composer12, 6);
                    Object objRememberedValue8 = composer12.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new ep(26);
                        composer12.updateRememberedValue(objRememberedValue8);
                    }
                    StandardErrorScreenKt.a(modifierFillMaxHeight, null, painterA, null, "This is a sample error message", null, false, (Function0) objRememberedValue8, composer12, (Painter.$stable << 6) | 12607494, 106);
                    composer12.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            case 15:
                Composer composer13 = (Composer) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda14 = ComposableSingletons$GenericScreenWithCtaKt.f1836a;
                if (composer13.shouldExecute((iIntValue13 & 3) != 2, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(638686847, iIntValue13, -1, "app.chalo.compose.components.ComposableSingletons$GenericScreenWithCtaKt.lambda$638686847.<anonymous> (GenericScreenWithCta.kt:91)");
                    }
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer13, modifierFillMaxSize$default2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor2);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion7, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierFillMaxHeight2 = SizeKt.fillMaxHeight(companion6, 0.8f);
                    Painter painterA2 = PainterResourceHelperKt.a(IconType.NO_INTERNET_ERROR, composer13, 6);
                    Object objRememberedValue9 = composer13.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new ep(27);
                        composer13.updateRememberedValue(objRememberedValue9);
                    }
                    GenericScreenWithCtaKt.a(modifierFillMaxHeight2, null, painterA2, null, "This is a sample error message", null, false, (Function0) objRememberedValue9, composer13, (Painter.$stable << 6) | 12607494, 106);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
            case 16:
                Composer composer14 = (Composer) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda15 = ComposableSingletons$GoogleMapKt.f14595a;
                if (composer14.shouldExecute((iIntValue14 & 3) != 2, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1984375736, iIntValue14, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-1984375736.<anonymous> (GoogleMap.kt:107)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer14.skipToGroupEnd();
                }
                return unit;
            case 17:
                Composer composer15 = (Composer) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda16 = ComposableSingletons$GoogleMapKt.f14595a;
                if (composer15.shouldExecute((iIntValue15 & 3) != 2, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-400333435, iIntValue15, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda$-400333435.<anonymous> (GoogleMap.kt:319)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer15.skipToGroupEnd();
                }
                return unit;
            case 18:
                Composer composer16 = (Composer) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda17 = ComposableSingletons$JourneyDetailsBottomSheetKt.f10624a;
                if (composer16.shouldExecute((iIntValue16 & 3) != 2, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(780110473, iIntValue16, -1, "app.chalo.validationsdk.blevalidation.ui.common.ComposableSingletons$JourneyDetailsBottomSheetKt.lambda$780110473.<anonymous> (JourneyDetailsBottomSheet.kt:196)");
                    }
                    CommonImageKt.a(new ImageUIState(IconType.METRO_TRIP_PLANNER, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), Modifier.INSTANCE, false, composer16, 54, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer16.skipToGroupEnd();
                }
                return unit;
            case 19:
                Composer composer17 = (Composer) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda18 = ComposableSingletons$MultipleFromToStopComposableKt.f1837a;
                if (composer17.shouldExecute((iIntValue17 & 3) != 2, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439383605, iIntValue17, -1, "app.chalo.compose.components.ComposableSingletons$MultipleFromToStopComposableKt.lambda$-1439383605.<anonymous> (MultipleFromToStopComposable.kt:130)");
                    }
                    ChaloColorToken.Custom custom2 = MultipleFromToStopComposableKt.f1846a;
                    MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIStateE = MultipleFromToStopComposableKt.e(custom2);
                    ChaloColorToken.Custom custom3 = MultipleFromToStopComposableKt.b;
                    MultipleFromToStopConnectorUIState multipleFromToStopConnectorUIStateE2 = MultipleFromToStopComposableKt.e(custom3);
                    ChaloColorToken.Custom custom4 = MultipleFromToStopComposableKt.c;
                    List listS = CollectionsKt.S(multipleFromToStopConnectorUIStateE, multipleFromToStopConnectorUIStateE2, MultipleFromToStopComposableKt.e(custom4), MultipleFromToStopComposableKt.e(custom2), MultipleFromToStopComposableKt.e(custom3), MultipleFromToStopComposableKt.e(custom4));
                    List listS2 = CollectionsKt.S("Mysuru road", "MG road", "Koramangala", "Cubbon park", "MG road", "Koramangala", "Cubbon park");
                    ArrayList arrayList = new ArrayList(CollectionsKt.v(listS2, 10));
                    Iterator it = listS2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new TextUIState.ChaloTextUIState((String) it.next(), UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i5 < size) {
                        Object obj3 = arrayList.get(i5);
                        i5++;
                        int i10 = i9 + 1;
                        Throwable th2 = th;
                        if (i9 < 0) {
                            CollectionsKt.z0();
                            throw th2;
                        }
                        TextUIState.ChaloTextUIState chaloTextUIState = (TextUIState.ChaloTextUIState) obj3;
                        if (i9 == 0 || i9 == 1) {
                            custom = custom2;
                        } else if (i9 == i4) {
                            custom = custom3;
                        } else if (i9 == i3) {
                            custom = custom2;
                        } else if (i9 != 5) {
                            custom = custom4;
                        } else {
                            custom = custom3;
                        }
                        arrayList2.add(new MultipleFromToStopItemUIState(chaloTextUIState, ShapedContentUIStateFactory.a(ChaloThemeHelper.a().e, ChaloThemeHelper.a().b, custom, custom), (MultipleFromToStopConnectorUIState) CollectionsKt.L(i9 - 1, listS), (MultipleFromToStopConnectorUIState) CollectionsKt.L(i9, listS)));
                        i9 = i10;
                        th = th2;
                        i4 = 2;
                        i3 = 4;
                    }
                    MultipleFromToStopComposableKt.a(th, new MultipleFromToStopUIState(arrayList2), composer17, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer17.skipToGroupEnd();
                }
                return unit;
            case 20:
                Composer composer18 = (Composer) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda19 = ComposableSingletons$MyTicketsScreenUIKt.f3449a;
                if (composer18.shouldExecute((iIntValue18 & 3) != 2, iIntValue18 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(121501228, iIntValue18, -1, "app.chalo.home.ui.history.compose.ComposableSingletons$MyTicketsScreenUIKt.lambda$121501228.<anonymous> (MyTicketsScreenUI.kt:657)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer18.skipToGroupEnd();
                }
                return unit;
            case 21:
                Composer composer19 = (Composer) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda20 = ComposableSingletons$NcmcOnlineRechargeScreenKt.f6416a;
                if (composer19.shouldExecute((iIntValue19 & 3) != 2, iIntValue19 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-578571874, iIntValue19, -1, "app.chalo.ncmc.ui.ncmconlinerecharge.compose.ComposableSingletons$NcmcOnlineRechargeScreenKt.lambda$-578571874.<anonymous> (NcmcOnlineRechargeScreen.kt:401)");
                    }
                    NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState = new NCMCOnlineRechargeViewState(129507);
                    FocusRequester focusRequester = new FocusRequester();
                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composer19, 0, 3);
                    Object objRememberedValue10 = composer19.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new cp(12);
                        composer19.updateRememberedValue(objRememberedValue10);
                    }
                    NcmcOnlineRechargeScreenKt.c(nCMCOnlineRechargeViewState, focusRequester, sheetStateRememberModalBottomSheetState, null, (Function1) objRememberedValue10, composer19, 27648);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer19.skipToGroupEnd();
                }
                return unit;
            case 22:
                Composer composer20 = (Composer) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda21 = ComposableSingletons$NearbyStopsMapScreenKt.f3138a;
                if (composer20.shouldExecute((iIntValue20 & 3) != 2, iIntValue20 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-627061422, iIntValue20, -1, "app.chalo.home.nearbytrips.ui.mapscreen.ComposableSingletons$NearbyStopsMapScreenKt.lambda$-627061422.<anonymous> (NearbyStopsMapScreen.kt:179)");
                    }
                    ChaloToolBarKt.c(StringResourcesHelperKt.c(StringEnum.NEARBY_STOPS_ACTIVITY_TOOLBAR_TITLE, new Object[0], composer20, 6), 1, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), null, composer20, 432, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer20.skipToGroupEnd();
                }
                return unit;
            case 23:
                Composer composer21 = (Composer) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda22 = ComposableSingletons$NearbyStopsMapScreenKt.f3138a;
                if (composer21.shouldExecute((iIntValue21 & 3) != 2, iIntValue21 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-283721568, iIntValue21, -1, "app.chalo.home.nearbytrips.ui.mapscreen.ComposableSingletons$NearbyStopsMapScreenKt.lambda$-283721568.<anonymous> (NearbyStopsMapScreen.kt:189)");
                    }
                    IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.SEARCH, composer21, 6), StringResourcesHelperKt.c(StringEnum.SEARCH_STOP_MENU_TITLE, new Object[0], composer21, 6), (Modifier) null, ChaloTheme.a(composer21, 0).e, composer21, Painter.$stable, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer21.skipToGroupEnd();
                }
                return unit;
            case 24:
                Composer composer22 = (Composer) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda23 = ComposableSingletons$NetworkInspectorScreenKt.f2033a;
                if (composer22.shouldExecute((iIntValue22 & 3) != 2, iIntValue22 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1454411311, iIntValue22, -1, "app.chalo.core.compose.ComposableSingletons$NetworkInspectorScreenKt.lambda$1454411311.<anonymous> (NetworkInspectorScreen.kt:66)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer22.skipToGroupEnd();
                }
                return unit;
            case 25:
                Composer composer23 = (Composer) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda24 = ComposableSingletons$OfflineCardRechargeScreenKt.f6400a;
                if (composer23.shouldExecute((iIntValue23 & 3) != 2, iIntValue23 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1657249268, iIntValue23, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineCardRechargeScreenKt.lambda$1657249268.<anonymous> (OfflineCardRechargeScreen.kt:383)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer23, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer23, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer23, 0);
                    int i11 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer23.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer23, modifierM784padding3ABfNKs);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                    if (composer23.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer23.startReusableNode();
                    if (composer23.getInserting()) {
                        composer23.createNode(constructor3);
                    } else {
                        composer23.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer23);
                    pk0.v(companion8, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i11), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.NCMC_ONLINE_BALANCE_TOOLTIP, new Object[0], composer23, 6), null, ChaloTheme.a(composer23, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer23, 0)), composer23, 0, 0, 131066);
                    composer23.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer23.skipToGroupEnd();
                }
                return unit;
            case 26:
                return a(obj, obj2);
            case 27:
                return c(obj, obj2);
            case 28:
                Composer composer24 = (Composer) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda25 = ComposableSingletons$OfflineRechargeSuccessScreenKt.f6401a;
                if (composer24.shouldExecute((iIntValue24 & 3) != 2, iIntValue24 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1265471529, iIntValue24, -1, "app.chalo.ncmc.ui.ncmcofflinerecharge.compose.ComposableSingletons$OfflineRechargeSuccessScreenKt.lambda$1265471529.<anonymous> (OfflineRechargeSuccessScreen.kt:269)");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer24.skipToGroupEnd();
                }
                return unit;
            default:
                Composer composer25 = (Composer) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda26 = ComposableSingletons$OriginDestinationSearchCardKt.f4569a;
                if (composer25.shouldExecute((iIntValue25 & 3) != 2, iIntValue25 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1725586734, iIntValue25, -1, "app.chalo.livetracking.stoptripplannerresult.compose.components.ComposableSingletons$OriginDestinationSearchCardKt.lambda$1725586734.<anonymous> (OriginDestinationSearchCard.kt:158)");
                    }
                    UITextStyle uITextStyle = UITextStyle.BodyLarge;
                    ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
                    TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState("MG Road", uITextStyle, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    UITextStyle uITextStyle2 = UITextStyle.LabelSmall;
                    ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
                    List listR = CollectionsKt.R(new StyledTextDataUIState("Near Brigade Road, Near Brigade Road, Near Brigade Road, Near Brigade Road, Near Brigade Road", shadyGray, null, uITextStyle2, null, null, null, 1012));
                    UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
                    StopInfoUiState stopInfoUiState = new StopInfoUiState(chaloTextUIState2, new TextUIState.StyledTextUIState(listR, null, uITextOverflow, 18));
                    IconType iconType2 = IconType.IC_ADD_CARD;
                    OriginDestinationSearchCardKt.a(null, new TripPlannerOriginDestinationSearchbarUiState(new SearchStopItemUiState(stopInfoUiState, new ImageUIState(iconType2, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composer25, 0).h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246)), new SearchStopItemUiState(new StopInfoUiState(new TextUIState.ChaloTextUIState("MG Road", uITextStyle, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState("Near Brigade Road, Near Brigade Road, Near Brigade Road, Near Brigade Road, Near Brigade Road", shadyGray, null, uITextStyle2, null, null, null, 1012)), null, uITextOverflow, 18)), new ImageUIState(iconType2, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloTheme.b(composer25, 0).h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246)), null, 39), composer25, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer25.skipToGroupEnd();
                }
                return unit;
        }
    }
}
