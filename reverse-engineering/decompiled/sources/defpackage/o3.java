package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.ui.screen.payment.PaymentBottomSheetType;
import app.chalo.checkout.ui.screen.payment.PaymentDataState;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import app.chalo.citydata.data.model.app.response.StopDetailsAppModel;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.chalobus.ChaloBusPageDisplayItemData;
import app.chalo.home.ui.history.MyTicketsDataState;
import app.chalo.home.ui.history.TicketsPageErrorImage;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetData;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetNegativeCtaType;
import app.chalo.home.ui.history.TicketsPageInfoBottomSheetPositiveCtaType;
import app.chalo.home.ui.history.TicketsScreenBottomSheetType;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusProductItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.location.LatLng;
import app.chalo.models.LocationAppModel;
import app.chalo.onboarding.languageselection.LanguageDetails;
import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandlerImpl;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketStopDirectionsInfoState;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.changestop.RouteInfo;
import app.chalo.premiumbus.ui.stopdetails.PBBusStopImageType;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapMarkerUIState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsMapState;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetails;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsViewState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import defpackage.hq0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18564a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o3(AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function1, Function0 function0, Function1 function2) {
        this.f18564a = 0;
        this.b = function1;
        this.d = function0;
        this.e = animationSpec;
        this.f = decayAnimationSpec;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        List list;
        List list2;
        Pair pair;
        String str3;
        String str4;
        LocationAppModel locationAppModel;
        String str5;
        LocationAppModel locationAppModel2;
        String str6;
        String str7;
        String str8;
        int i = this.f18564a;
        Unit unit = Unit.f17538a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                return AnchoredDraggableState.Companion.Saver$lambda$7((Function1) obj6, (Function0) obj4, (AnimationSpec) obj3, (DecayAnimationSpec) obj2, (Function1) obj5, obj);
            case 1:
                return AndroidLegacyPlatformTextInputServiceAdapter.startInput$lambda$0((TextFieldValue) obj4, (AndroidLegacyPlatformTextInputServiceAdapter) obj3, (ImeOptions) obj2, (Function1) obj6, (Function1) obj5, (LegacyTextInputMethodRequest) obj);
            case 2:
                final List list3 = (List) obj5;
                final Function1 function1 = (Function1) obj6;
                final ChaloBusPageDisplayItemData chaloBusPageDisplayItemData = (ChaloBusPageDisplayItemData) obj4;
                final Density density = (Density) obj3;
                final MutableIntState mutableIntState = (MutableIntState) obj2;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                LazyRow.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ProductPurchaseWidgetsUI$lambda$4$0$1$4$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        list3.get(((Number) obj7).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ProductPurchaseWidgetsUI$lambda$4$0$1$4$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj7;
                        int iIntValue = ((Number) obj8).intValue();
                        Composer composer = (Composer) obj9;
                        int iIntValue2 = ((Number) obj10).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            final ChaloBusProductItemData chaloBusProductItemData = (ChaloBusProductItemData) list3.get(iIntValue);
                            composer.startReplaceGroup(-146119670);
                            if (iIntValue == 0) {
                                composer.startReplaceGroup(-146160808);
                                ChaloSpacersKt.y(composer, 0);
                            } else {
                                composer.startReplaceGroup(-203128423);
                            }
                            composer.endReplaceGroup();
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
                            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer);
                            final Function1 function2 = function1;
                            boolean zChanged = composer.changed(function2);
                            final ChaloBusPageDisplayItemData chaloBusPageDisplayItemData2 = chaloBusPageDisplayItemData;
                            boolean zChangedInstance = zChanged | composer.changedInstance(chaloBusPageDisplayItemData2) | composer.changedInstance(chaloBusProductItemData);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.home.ui.chalobus.ChaloBusScreenUIKt$ProductPurchaseWidgetsUI$2$1$2$3$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData2.h, chaloBusProductItemData.b));
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(companion, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), ChaloTheme.b(composer, 0).K), Dp.m7276boximpl(density.mo401toDpu2uoSUM(mutableIntState.getIntValue())).m7292unboximpl());
                            GridWidgetCardData gridWidgetCardData = chaloBusProductItemData.f3250a;
                            String str9 = gridWidgetCardData.b;
                            long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                            GridWidgetCardData gridWidgetCardData2 = chaloBusProductItemData.f3250a;
                            GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                            ChaloWidgetCardKt.c(modifierM814height3ABfNKs, Color.m4595boximpl(jA), str9, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, false, composer, 4096, 128);
                            ChaloSpacersKt.y(composer, 0);
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
                return unit;
            case 3:
                LanguageSelectionSourceType languageSelectionSourceType = (LanguageSelectionSourceType) obj6;
                return LanguageSelectionDataState.a((LanguageSelectionDataState) obj, false, null, languageSelectionSourceType == LanguageSelectionSourceType.SPLASH_SCREEN, languageSelectionSourceType == LanguageSelectionSourceType.HOME_SCREEN, languageSelectionSourceType, (List) obj3, new LanguageDetails((String) obj5, (String) obj4), (String) obj2, 3);
            case 4:
                MyTicketsDataState it = (MyTicketsDataState) obj;
                Intrinsics.i(it, "it");
                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.PRODUCT_USE, (String) obj6, (String) obj5, (String) obj4, (String) obj3), null, null, (ChaloUserBookingType) obj2, TicketsPageInfoBottomSheetPositiveCtaType.PASS_USE, TicketsPageInfoBottomSheetNegativeCtaType.PRODUCT_USE, 6), null, false, null, false, null, false, false, null, false, null, null, null, false, 33553919);
            case 5:
                MyTicketsDataState it2 = (MyTicketsDataState) obj;
                Intrinsics.i(it2, "it");
                return MyTicketsDataState.a(it2, null, null, null, false, false, null, null, new TicketsScreenBottomSheetType.TicketsPageInfoBottomSheet(new TicketsPageInfoBottomSheetData(TicketsPageErrorImage.ERROR, (String) obj6, (String) obj5, (String) obj4, (String) obj3), null, null, (ChaloUserBookingType.SuperPassBooking) obj2, TicketsPageInfoBottomSheetPositiveCtaType.DOCUMENT_VALIDITY_EXPIRED, TicketsPageInfoBottomSheetNegativeCtaType.DOCUMENT_VALIDITY_EXPIRED, 6), null, false, null, false, null, false, false, null, false, null, null, null, false, 33521151);
            case 6:
                StopDetailsAppModel stopDetailsAppModel = (StopDetailsAppModel) obj6;
                StopDetailsAppModel stopDetailsAppModel2 = (StopDetailsAppModel) obj5;
                String str9 = (String) obj4;
                PBStopDetailsComponent pBStopDetailsComponent = (PBStopDetailsComponent) obj3;
                String str10 = (String) obj2;
                PremiumBusStopDetailsViewState premiumBusStopDetailsViewState = (PremiumBusStopDetailsViewState) obj;
                String str11 = (stopDetailsAppModel == null || (str6 = stopDetailsAppModel.f1745a) == null) ? "" : str6;
                if (stopDetailsAppModel == null || (str = stopDetailsAppModel.b) == null) {
                    str = "";
                }
                LatLng latLng = (stopDetailsAppModel == null || (locationAppModel2 = stopDetailsAppModel.d) == null) ? new LatLng(0.0d, 0.0d) : locationAppModel2.a();
                if (stopDetailsAppModel2 == null || (str2 = stopDetailsAppModel2.f1745a) == null) {
                    str2 = "";
                }
                String str12 = (stopDetailsAppModel2 == null || (str5 = stopDetailsAppModel2.b) == null) ? "" : str5;
                LatLng latLng2 = (stopDetailsAppModel2 == null || (locationAppModel = stopDetailsAppModel2.d) == null) ? new LatLng(0.0d, 0.0d) : locationAppModel.a();
                PBStopDetailsMapMarkerUIState pBStopDetailsMapMarkerUIState = new PBStopDetailsMapMarkerUIState(str11, str, latLng, str9, pBStopDetailsComponent.H0(str, str9));
                PBStopDetailsMapMarkerUIState pBStopDetailsMapMarkerUIState2 = new PBStopDetailsMapMarkerUIState(str2, str12, latLng2, str10, null);
                List list4 = stopDetailsAppModel != null ? stopDetailsAppModel.e : null;
                List list5 = stopDetailsAppModel2 != null ? stopDetailsAppModel2.e : null;
                if (list4 != null) {
                    List list6 = list4;
                    if (list6.isEmpty()) {
                        list6 = null;
                    }
                    list = list6;
                } else {
                    list = null;
                }
                if (list5 != null) {
                    List list7 = list5;
                    if (list7.isEmpty()) {
                        list7 = null;
                    }
                    list2 = list7;
                } else {
                    list2 = null;
                }
                if (list == null || list2 == null) {
                    PBBusStopImageType.ShowError showError = PBBusStopImageType.ShowError.f7933a;
                    if (list != null) {
                        pair = new Pair(new PBBusStopImageType.Available(list), showError);
                    } else if (list2 != null) {
                        pair = new Pair(showError, new PBBusStopImageType.Available(list2));
                    } else {
                        PBBusStopImageType.NotAvailable notAvailable = PBBusStopImageType.NotAvailable.f7932a;
                        pair = new Pair(notAvailable, notAvailable);
                    }
                } else {
                    pair = new Pair(new PBBusStopImageType.Available(list), new PBBusStopImageType.Available(list2));
                }
                return PremiumBusStopDetailsViewState.a(premiumBusStopDetailsViewState, false, false, new PremiumBusStopDetails((stopDetailsAppModel == null || (str4 = stopDetailsAppModel.f1745a) == null) ? "" : str4, str, stopDetailsAppModel != null ? stopDetailsAppModel.c : null, latLng, (PBBusStopImageType) pair.d()), new PremiumBusStopDetails((stopDetailsAppModel2 == null || (str3 = stopDetailsAppModel2.f1745a) == null) ? "" : str3, str12, stopDetailsAppModel2 != null ? stopDetailsAppModel2.c : null, latLng2, (PBBusStopImageType) pair.e()), new PBStopDetailsMapState(CollectionsKt.S(pBStopDetailsMapMarkerUIState, pBStopDetailsMapMarkerUIState2), new MapCameraViewState.InitialState.CustomPosition(latLng, 15.0f, 12)), null, 32);
            case 7:
                PaymentDataState it3 = (PaymentDataState) obj;
                Intrinsics.i(it3, "it");
                return PaymentDataState.a(it3, null, false, null, false, null, (String) obj2, false, null, null, new PaymentBottomSheetType.PaymentStatusBottomSheet(new PaymentStatusAlertDetails((String) obj6, (String) obj5, null, IconType.IC_GENERIC_CHECKOUT_ERROR, (String) obj4, (PaymentStatusCTAActionType) obj3, null, null, 196)), null, false, false, false, null, false, null, 2096023);
            case 8:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) obj6);
                execute.bindString(1, (String) obj5);
                execute.bindString(2, (String) obj4);
                execute.bindString(3, (String) obj3);
                execute.bindString(4, (String) obj2);
                return unit;
            case 9:
                PremiumBusChangeStopComponent premiumBusChangeStopComponent = (PremiumBusChangeStopComponent) obj6;
                RouteInfo routeInfo = (RouteInfo) obj5;
                List list8 = (List) obj4;
                List list9 = (List) obj3;
                Map map = (Map) obj2;
                PremiumBusChangeStopDataState it4 = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it4, "it");
                String str13 = premiumBusChangeStopComponent.k.c;
                if (routeInfo == null || (str7 = routeInfo.f7541a) == null) {
                    str7 = it4.i;
                }
                String str14 = str7;
                if (routeInfo == null || (str8 = routeInfo.c) == null) {
                    str8 = it4.k;
                }
                return PremiumBusChangeStopDataState.a(it4, null, null, null, null, null, list9, str13, null, str14, map, str8, null, null, !list8.isEmpty() ? new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(premiumBusChangeStopComponent.q.a(list8), 0)) : it4.n, ChangeStopScreenState.StopSelection.f7521a, 6303);
            case 10:
                List list10 = (ArrayList) obj5;
                PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable stopLocationAvailable = (PremiumReserveTicketStopDirectionsInfoState.StopLocationAvailable) obj4;
                PremiumBusLiveTrackingState premiumBusLiveTrackingState = (PremiumBusLiveTrackingState) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                PremiumReserveTicketPostBookingActionState it5 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it5, "it");
                if (!((PremiumReserveTicketPostBookingActionHandlerImpl) obj6).U()) {
                    list10 = EmptyList.f17557a;
                }
                return PremiumReserveTicketPostBookingActionState.a(it5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, stopLocationAvailable, premiumBusLiveTrackingState, arrayList, false, null, null, list10, null, null, null, false, null, false, null, null, null, null, null, null, -9306113, 31);
            case 11:
                final List list11 = (List) obj5;
                final Function1 function2 = (Function1) obj6;
                final RegularBusPageDisplayItemData regularBusPageDisplayItemData = (RegularBusPageDisplayItemData) obj4;
                final Density density2 = (Density) obj3;
                final MutableIntState mutableIntState2 = (MutableIntState) obj2;
                LazyListScope LazyRow2 = (LazyListScope) obj;
                Intrinsics.i(LazyRow2, "$this$LazyRow");
                LazyRow2.items(list11.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt$ProductPurchaseSectionsUI$lambda$0$2$1$4$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        list11.get(((Number) obj7).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt$ProductPurchaseSectionsUI$lambda$0$2$1$4$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i2;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj7;
                        final int iIntValue = ((Number) obj8).intValue();
                        Composer composer = (Composer) obj9;
                        int iIntValue2 = ((Number) obj10).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i2 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i2 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i2 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        boolean z = true;
                        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            final RegularBusProductItemData regularBusProductItemData = (RegularBusProductItemData) list11.get(iIntValue);
                            composer.startReplaceGroup(1102411796);
                            if (iIntValue == 0) {
                                composer.startReplaceGroup(1102360211);
                                ChaloSpacersKt.y(composer, 0);
                            } else {
                                composer.startReplaceGroup(1040952900);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierC = hq0.c("PL_Pass_Product_", iIntValue, Modifier.INSTANCE);
                            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
                            IndicationNodeFactory indicationNodeFactoryA = RippleEffectKt.a(composer);
                            final Function1 function3 = function2;
                            boolean zChanged = composer.changed(function3);
                            final RegularBusPageDisplayItemData regularBusPageDisplayItemData2 = regularBusPageDisplayItemData;
                            boolean zChangedInstance = zChanged | composer.changedInstance(regularBusPageDisplayItemData2) | composer.changedInstance(regularBusProductItemData);
                            if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(iIntValue)) && (i2 & 48) != 32) {
                                z = false;
                            }
                            boolean z2 = zChangedInstance | z;
                            Object objRememberedValue = composer.rememberedValue();
                            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt$ProductPurchaseSectionsUI$1$3$2$3$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageDisplayItemData2.g, regularBusProductItemData, null, iIntValue, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(modifierC, mutableInteractionSourceB, indicationNodeFactoryA, false, null, null, (Function0) objRememberedValue, 28, null), ChaloTheme.b(composer, 0).K), Dp.m7276boximpl(density2.mo401toDpu2uoSUM(mutableIntState2.getIntValue())).m7292unboximpl());
                            GridWidgetCardData gridWidgetCardData = regularBusProductItemData.f3633a;
                            String str15 = gridWidgetCardData.b;
                            long jA = ChaloColorToken_androidKt.a(Color.INSTANCE, gridWidgetCardData.d, Color.INSTANCE.m4640getTransparent0d7_KjU());
                            GridWidgetCardData gridWidgetCardData2 = regularBusProductItemData.f3633a;
                            GridWidgetItemData gridWidgetItemData = gridWidgetCardData2.f2348a;
                            ChaloWidgetCardKt.c(modifierM814height3ABfNKs, Color.m4595boximpl(jA), str15, gridWidgetItemData.c, gridWidgetItemData.f2349a, gridWidgetItemData.b, gridWidgetCardData2.c, false, composer, 4096, 128);
                            ChaloSpacersKt.y(composer, 0);
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
                return unit;
            default:
                return TextFieldCursorKt.cursor$lambda$0$2$0((CursorAnimationState) obj6, (OffsetMapping) obj5, (TextFieldValue) obj4, (LegacyTextFieldState) obj3, (Brush) obj2, (ContentDrawScope) obj);
        }
    }

    public /* synthetic */ o3(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, Function1 function1, Function1 function2) {
        this.f18564a = 1;
        this.d = textFieldValue;
        this.e = androidLegacyPlatformTextInputServiceAdapter;
        this.f = imeOptions;
        this.b = function1;
        this.c = function2;
    }

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f18564a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ o3(List list, Function1 function1, Object obj, Density density, MutableIntState mutableIntState, int i) {
        this.f18564a = i;
        this.c = list;
        this.b = function1;
        this.d = obj;
        this.e = density;
        this.f = mutableIntState;
    }
}
