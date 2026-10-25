package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.core.app.FrameMetricsAggregator;
import androidx.window.embedding.OverlayControllerImpl;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.constants.Source;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorIntent;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManagerImpl;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeIntent;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.plotline.PlotlineNotificationManagerAndroid;
import app.chalo.premiumbus.bulkbookingridedetails.ui.BulkBookingRideDetailsScreenType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsIntent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationIntent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationViewState;
import app.chalo.productbooking.pickstop.PickStopDataState;
import app.chalo.productbooking.pickstop.PickStopIntent;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionSectionUIState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productpurchase.passselection.ui.PassPlanAnnouncementUIState;
import app.chalo.productpurchase.passselection.ui.PassSelectionComponent;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenTypeUIState;
import app.chalo.productsummary.ui.pass.PassSummaryDataState;
import app.chalo.productsummary.ui.pass.PassSummaryIntent;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.FareUtils;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.pk0;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ym0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20123a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ym0(Object obj, int i) {
        this.f20123a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        String str;
        int i = this.f20123a;
        final int i2 = 0;
        final int i3 = 1;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                NetworkCallInfo call = (NetworkCallInfo) obj;
                Intrinsics.i(call, "call");
                ((NetworkInspectorComponent) obj2).F0(new NetworkInspectorIntent.OpenDetails(call));
                return unit;
            case 1:
                NetworkConnectionType it = (NetworkConnectionType) obj;
                Intrinsics.i(it, "it");
                MutableStateFlow mutableStateFlow = ((NetworkStateManagerImpl) obj2).b;
                if (FlowKt.c(mutableStateFlow).getValue() != it) {
                    String message = "Network state changed to \"" + it.name() + "\"";
                    Intrinsics.i(message, "message");
                }
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, it));
                return unit;
            case 2:
                ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                List list = ((ObjectSerializer) obj2).b;
                Intrinsics.i(list, "<set-?>");
                buildSerialDescriptor.b = list;
                return unit;
            case 3:
                OfflineCardRechargeIntent it2 = (OfflineCardRechargeIntent) obj;
                Intrinsics.i(it2, "it");
                ((OfflineCardRechargeComponent) obj2).I0(it2);
                return unit;
            case 4:
                Lazy lazy = OkHttpEngine.i;
                ((ResponseBody) obj2).close();
                return unit;
            case 5:
                return OverlayControllerImpl._init_$lambda$6((OverlayControllerImpl) obj2, (List) obj);
            case 6:
                PremiumBusStopDetailsIntent it3 = (PremiumBusStopDetailsIntent) obj;
                Intrinsics.i(it3, "it");
                ((PBStopDetailsComponent) obj2).G0(it3);
                return unit;
            case 7:
                return PaddingKt.padding$lambda$0((PaddingValues) obj2, (InspectorInfo) obj);
            case 8:
                String it4 = (String) obj;
                Intrinsics.i(it4, "it");
                CurrencyFeature currencyFeature = ((PassSelectionComponent) obj2).o;
                return currencyFeature.d().equals("₹") ? vo1.A(currencyFeature.d(), FareUtils.a(it4)) : currencyFeature.d().concat(it4);
            case 9:
                PassSelectionScreenTypeUIState.SubCategorySelection subCategorySelection = (PassSelectionScreenTypeUIState.SubCategorySelection) obj2;
                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
                Intrinsics.i(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyGridScope.CC.b(LazyVerticalGrid, subCategorySelection.c.b.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1279420127, true, new o4(subCategorySelection, 8)), 14, null);
                return unit;
            case 10:
                final PassCategorySelectionTabScreen passCategorySelectionTabScreen = (PassCategorySelectionTabScreen) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                if (passCategorySelectionTabScreen.f8528a != null) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1063148661, true, new la0(passCategorySelectionTabScreen, 12)), 3, null);
                }
                for (final PassCategorySelectionSectionUIState passCategorySelectionSectionUIState : passCategorySelectionTabScreen.b) {
                    if (passCategorySelectionSectionUIState.h != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(204263848, true, new Function3() { // from class: pp0
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i2) {
                                    case 0:
                                        PassCategorySelectionSectionUIState passCategorySelectionSectionUIState2 = passCategorySelectionSectionUIState;
                                        ImageUrlUIState imageUrlUIState = passCategorySelectionSectionUIState2.h;
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer = (Composer) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        Intrinsics.i(item, "$this$item");
                                        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(204263848, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:222)");
                                            }
                                            SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionSectionUIState2.g.e), null, null, null, null, null, null, ImageUIStateKt.c(imageUrlUIState.d), composer, 48, 0, 63480);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        LazyItemScope item2 = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        Intrinsics.i(item2, "$this$item");
                                        if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-532812148, iIntValue2, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:275)");
                                            }
                                            ChaloSpacersKt.a(passCategorySelectionSectionUIState.g.d, composer2, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            composer2.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        }), 3, null);
                    }
                    PlotlineWidgetUIState plotlineWidgetUIState = passCategorySelectionSectionUIState.f8527a;
                    if (plotlineWidgetUIState != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(849553078, true, new qp0(plotlineWidgetUIState, i2)), 3, null);
                    }
                    TextUIState textUIState = passCategorySelectionSectionUIState.b;
                    if (textUIState != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(196257161, true, new u50(18, textUIState, passCategorySelectionTabScreen)), 3, null);
                    }
                    PassPlanAnnouncementUIState passPlanAnnouncementUIState = passCategorySelectionSectionUIState.c;
                    if (passPlanAnnouncementUIState != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(148650428, true, new ob(15, passPlanAnnouncementUIState, passCategorySelectionSectionUIState, passCategorySelectionTabScreen)), 3, null);
                    }
                    TextUIState textUIState2 = passCategorySelectionSectionUIState.d;
                    if (textUIState2 != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-747737657, true, new ob(16, textUIState2, passCategorySelectionSectionUIState, passCategorySelectionTabScreen)), 3, null);
                    }
                    PlotlineWidgetUIState plotlineWidgetUIState2 = passCategorySelectionSectionUIState.e;
                    if (plotlineWidgetUIState2 != null) {
                        LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1038436558, true, new qp0(plotlineWidgetUIState2, i3)), 3, null);
                    }
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-532812148, true, new Function3() { // from class: pp0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            switch (i3) {
                                case 0:
                                    PassCategorySelectionSectionUIState passCategorySelectionSectionUIState2 = passCategorySelectionSectionUIState;
                                    ImageUrlUIState imageUrlUIState = passCategorySelectionSectionUIState2.h;
                                    LazyItemScope item = (LazyItemScope) obj3;
                                    Composer composer = (Composer) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    Intrinsics.i(item, "$this$item");
                                    if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(204263848, iIntValue, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:222)");
                                        }
                                        SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionSectionUIState2.g.e), null, null, null, null, null, null, ImageUIStateKt.c(imageUrlUIState.d), composer, 48, 0, 63480);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    LazyItemScope item2 = (LazyItemScope) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(item2, "$this$item");
                                    if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-532812148, iIntValue2, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:275)");
                                        }
                                        ChaloSpacersKt.a(passCategorySelectionSectionUIState.g.d, composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 3, null);
                    final ArrayList arrayList = passCategorySelectionSectionUIState.f;
                    LazyColumn.items(arrayList.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt$PassCategorySelectionTabScreen$lambda$0$0$1$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            arrayList.get(((Number) obj3).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt$PassCategorySelectionTabScreen$lambda$0$0$1$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            int i4;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            Composer composer = (Composer) obj5;
                            int iIntValue2 = ((Number) obj6).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i4 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i4 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i4 |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(802480018, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                PassCategorySectionItemUIState passCategorySectionItemUIState = (PassCategorySectionItemUIState) arrayList.get(iIntValue);
                                composer.startReplaceGroup(564257752);
                                if (passCategorySectionItemUIState instanceof PassCategorySectionItemUIState.BookableConfigItemUIState) {
                                    composer.startReplaceGroup(564342133);
                                    PassSelectionScreenKt.a((PassCategorySectionItemUIState.BookableConfigItemUIState) passCategorySectionItemUIState, ChaloThemeKt.c(ChaloThemeKt.c(Modifier.INSTANCE, passCategorySelectionSectionUIState.g.c), passCategorySelectionTabScreen.e), composer, 0);
                                    composer.endReplaceGroup();
                                } else {
                                    if (!(passCategorySectionItemUIState instanceof PassCategorySectionItemUIState.PWidgetUIState)) {
                                        throw pk0.p(composer, 156749195);
                                    }
                                    composer.startReplaceGroup(564731927);
                                    PlotlineComposeWidgetKt.a(48, 0, composer, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "bookablePassConfigItem");
                                    composer.endReplaceGroup();
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
                    }));
                }
                return unit;
            case 11:
                PassSummaryDataState it5 = (PassSummaryDataState) obj;
                Intrinsics.i(it5, "it");
                return PassSummaryDataState.a(it5, false, false, null, null, ((PassSummaryIntent.OnImageClickIntent) obj2).f8775a, null, null, 223);
            case 12:
                PassSummaryDataState it6 = (PassSummaryDataState) obj;
                Intrinsics.i(it6, "it");
                return PassSummaryDataState.a(it6, false, false, null, null, null, null, ((PassSummaryIntent.InitializationIntent) obj2).f8770a, 127);
            case 13:
                PaymentDataState it7 = (PaymentDataState) obj;
                Intrinsics.i(it7, "it");
                return PaymentDataState.a(it7, null, false, null, false, null, null, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet((PaymentStatusAlertDetails) obj2), null, false, false, false, null, false, null, 2096119);
            case 14:
                PbBulkBookingRideDetailsViewState it8 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it8, "it");
                return PbBulkBookingRideDetailsViewState.a(it8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, ((PbBulkBookingRideDetailsViewIntent.OnTabClickIntent) obj2).f6928a, null, false, null, null, null, null, false, null, false, 67043327);
            case 15:
                PbBulkBookingRideDetailsViewState it9 = (PbBulkBookingRideDetailsViewState) obj;
                Intrinsics.i(it9, "it");
                return PbBulkBookingRideDetailsViewState.a(it9, null, null, null, null, null, null, null, null, null, null, null, BulkBookingRideDetailsScreenType.Loading, null, (SuperPassSubTypes) obj2, null, false, null, null, false, null, null, null, null, false, null, false, 67098623);
            case 16:
                PbBulkBookingRideDetailsViewIntent it10 = (PbBulkBookingRideDetailsViewIntent) obj;
                Intrinsics.i(it10, "it");
                ((PbBulkBookingRideDetailsComponent) obj2).S0(it10);
                return unit;
            case 17:
                PbPassPurchaseLandingScreenIntent.InitializationIntent initializationIntent = (PbPassPurchaseLandingScreenIntent.InitializationIntent) obj2;
                PbPassPurchaseLandingScreenDataState it11 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it11, "it");
                return PbPassPurchaseLandingScreenDataState.a(it11, initializationIntent.f7655a, initializationIntent.c, true, false, null, null, null, null, false, false, 4088);
            case 18:
                PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent retryBtnClickIntent = (PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent) obj2;
                PbPassPurchaseLandingScreenDataState it12 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it12, "it");
                return PbPassPurchaseLandingScreenDataState.a(it12, retryBtnClickIntent.f7666a, retryBtnClickIntent.c, true, false, null, null, null, null, false, false, 4088);
            case 19:
                PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent = (PbPassPurchaseLandingScreenComponent) obj2;
                PbPassPurchaseLandingScreenDataState it13 = (PbPassPurchaseLandingScreenDataState) obj;
                Intrinsics.i(it13, "it");
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = pbPassPurchaseLandingScreenComponent.C;
                String str2 = pBStopPlaceSelectedAppModel != null ? pBStopPlaceSelectedAppModel.c : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = pbPassPurchaseLandingScreenComponent.D;
                return PbPassPurchaseLandingScreenDataState.a(it13, null, false, false, false, null, str2, pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null, null, false, false, 3903);
            case 20:
                PickRouteLocationDataState it14 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it14, "it");
                return PickRouteLocationDataState.a(it14, false, true, null, null, null, ((PickRouteLocationIntent.RouteSearchedIntent) obj2).f8283a, null, null, false, false, null, 2013);
            case 21:
                String it15 = (String) obj;
                Intrinsics.i(it15, "it");
                ((PickRouteLocationComponent) obj2).P0(new PickRouteLocationIntent.RouteSearchedIntent(it15));
                return unit;
            case 22:
                PickRouteLocationDataState it16 = (PickRouteLocationDataState) obj;
                Intrinsics.i(it16, "it");
                return PickRouteLocationDataState.a(it16, false, false, null, null, null, null, null, ((PickRouteLocationIntent.RouteSelectedIntent) obj2).f8284a, false, false, null, 1919);
            case 23:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, null, null, null, null, null, null, false, true, (RouteAppModel) obj2, FrameMetricsAggregator.EVERY_DURATION);
            case 24:
                return PickRouteLocationDataState.a((PickRouteLocationDataState) obj, false, false, null, null, null, null, null, null, ((PickRouteLocationIntent.InitialIntent) obj2).f8282a, false, null, 1791);
            case 25:
                FocusState focusState = (FocusState) obj;
                Intrinsics.i(focusState, "focusState");
                ((PickRouteLocationViewState) obj2).c.b.b.a(focusState.isFocused());
                return unit;
            case 26:
                PickStopDataState it17 = (PickStopDataState) obj;
                Intrinsics.i(it17, "it");
                return PickStopDataState.a(it17, null, false, null, ((PickStopIntent.SearchAndLoadStopListIntent) obj2).f8304a, 23);
            case 27:
                PlotlineNotificationManagerAndroid plotlineNotificationManagerAndroid = (PlotlineNotificationManagerAndroid) obj2;
                Map map = (Map) obj;
                plotlineNotificationManagerAndroid.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("plotlineNotifPayload", String.valueOf(map));
                if (map == null || (str = (String) map.get("notifId")) == null) {
                    str = "noCustomIdAssigned";
                }
                linkedHashMap.put("plotlineNotifCustomId", str);
                AnalyticsContractImplKt.b(plotlineNotificationManagerAndroid.d, "Plotline notification clicked", Source.PLOTLINE, linkedHashMap, false, 8);
                return unit;
            case 28:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return serialDescriptor.f(iIntValue) + ": " + serialDescriptor.d(iIntValue).getB();
            default:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj2;
                ClassSerialDescriptorBuilder buildSerialDescriptor2 = (ClassSerialDescriptorBuilder) obj;
                Intrinsics.i(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor2, "type", StringSerializer.b);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor2, "value", SerialDescriptorsKt.f("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.f18092a.f() + '>', SerialKind.CONTEXTUAL.f18115a, new SerialDescriptor[0]));
                List list2 = polymorphicSerializer.b;
                Intrinsics.i(list2, "<set-?>");
                buildSerialDescriptor2.b = list2;
                return unit;
        }
    }
}
