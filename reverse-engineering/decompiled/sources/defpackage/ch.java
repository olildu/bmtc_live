package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.PsExtractor;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.SurveyStep;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.chalobususerprofile.ui.compose.TimePickerSelection;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.ui.screen.card.CheckoutCardDataState;
import app.chalo.checkout.ui.screen.card.CheckoutCardViewIntent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewIntent;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.netbanking.NetBankingAppsDataState;
import app.chalo.checkout.ui.screen.netbanking.NetBankingAppsViewIntent;
import app.chalo.compose.webview.KWebView;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewIntent;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionReachByTime;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionSheetState;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.ui.cardlinking.linking.CardLinkingErrorType;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.landing.ChaloCardInfoComponent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionSource;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.onboarding.cityselection.ui.CitySelectionIntent;
import app.chalo.uistate.checkbox.ChaloCheckBoxUIState;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.dialog.CalendarMonthUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIState;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import app.chalo.vault.Chalo_pay_table;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.Relay;
import com.arkivanov.decompose.router.children.NavEvent;
import com.arkivanov.decompose.router.stack.ChildStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ch implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11284a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ch(Object obj, int i) {
        this.f11284a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        RazorpaySdk razorpaySdkC;
        switch (this.f11284a) {
            case 0:
                ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = (ChaloBusRouteInfoComponent) this.b;
                ChaloBusRouteInfoViewIntent intent = (ChaloBusRouteInfoViewIntent) it;
                Intrinsics.i(intent, "intent");
                chaloBusRouteInfoComponent.N0(intent);
                return Unit.f17538a;
            case 1:
                ChaloBusRouteInfoViewIntent.RouteSuggestionReachBySelectedIntent routeSuggestionReachBySelectedIntent = (ChaloBusRouteInfoViewIntent.RouteSuggestionReachBySelectedIntent) this.b;
                RouteSuggestionSheetState.Form form = (RouteSuggestionSheetState.Form) it;
                Intrinsics.i(form, "form");
                return RouteSuggestionSheetState.Form.a(form, null, null, new RouteSuggestionReachByTime(routeSuggestionReachBySelectedIntent.f3351a, routeSuggestionReachBySelectedIntent.b, routeSuggestionReachBySelectedIntent.c), false, 3);
            case 2:
                ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent routeSuggestionDropSelectedIntent = (ChaloBusRouteInfoViewIntent.RouteSuggestionDropSelectedIntent) this.b;
                RouteSuggestionSheetState.Form form2 = (RouteSuggestionSheetState.Form) it;
                Intrinsics.i(form2, "form");
                return RouteSuggestionSheetState.Form.a(form2, null, routeSuggestionDropSelectedIntent.f3347a, null, false, 13);
            case 3:
                ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent routeSuggestionPickupSelectedIntent = (ChaloBusRouteInfoViewIntent.RouteSuggestionPickupSelectedIntent) this.b;
                RouteSuggestionSheetState.Form form3 = (RouteSuggestionSheetState.Form) it;
                Intrinsics.i(form3, "form");
                return RouteSuggestionSheetState.Form.a(form3, routeSuggestionPickupSelectedIntent.f3349a, null, null, false, 14);
            case 4:
                ChaloBusRouteInfoViewIntent.TabSelectedIntent tabSelectedIntent = (ChaloBusRouteInfoViewIntent.TabSelectedIntent) this.b;
                ChaloBusRouteInfoDataState it2 = (ChaloBusRouteInfoDataState) it;
                Intrinsics.i(it2, "it");
                return ChaloBusRouteInfoDataState.a(it2, null, false, null, tabSelectedIntent.f3355a, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH);
            case 5:
                ChaloBusUserProfileSurveyIntent.TimePickerSelectionChanged timePickerSelectionChanged = (ChaloBusUserProfileSurveyIntent.TimePickerSelectionChanged) this.b;
                ChaloBusUserProfileSurveyDataState it3 = (ChaloBusUserProfileSurveyDataState) it;
                Intrinsics.i(it3, "it");
                return ChaloBusUserProfileSurveyDataState.a(it3, null, null, 0, false, null, new TimePickerSelection(timePickerSelectionChanged.f1219a, timePickerSelectionChanged.b, timePickerSelectionChanged.c), false, 223);
            case 6:
                PBUserProfileSurveyPreference pBUserProfileSurveyPreference = (PBUserProfileSurveyPreference) this.b;
                ChaloBusUserProfileSurveyDataState it4 = (ChaloBusUserProfileSurveyDataState) it;
                Intrinsics.i(it4, "it");
                ArrayList arrayListC = pBUserProfileSurveyPreference.c();
                ArrayList arrayList = new ArrayList(CollectionsKt.v(arrayListC, 10));
                int size = arrayListC.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListC.get(i);
                    i++;
                    arrayList.add(((SurveyStep) obj).toInputState());
                }
                return ChaloBusUserProfileSurveyDataState.a(it4, pBUserProfileSurveyPreference, arrayList, 0, false, null, null, false, PsExtractor.VIDEO_STREAM_MASK);
            case 7:
                ChaloCardInfoComponent chaloCardInfoComponent = (ChaloCardInfoComponent) this.b;
                ChaloCardInfoIntent it5 = (ChaloCardInfoIntent) it;
                Intrinsics.i(it5, "it");
                chaloCardInfoComponent.L0(it5);
                return Unit.f17538a;
            case 8:
                UseCaseOperationError useCaseOperationError = (UseCaseOperationError) this.b;
                ChaloCardLinkViewState it6 = (ChaloCardLinkViewState) it;
                Intrinsics.i(it6, "it");
                CardLinkingErrorType cardLinkingErrorType = CardLinkingErrorType.CARD_LINKED_TO_ANOTHER_NUMBER;
                String str = useCaseOperationError.c;
                if (str == null) {
                    str = "Something went wrong";
                }
                return ChaloCardLinkViewState.a(it6, "", "", false, false, cardLinkingErrorType, true, str, null, 0, 0, 0, 0, true, 3968);
            case 9:
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = (ChaloCardRechargeConfigAppModel) this.b;
                ChaloCardRechargeAmountViewState it7 = (ChaloCardRechargeAmountViewState) it;
                Intrinsics.i(it7, "it");
                List list = chaloCardRechargeConfigAppModel.i;
                return ChaloCardRechargeAmountViewState.a(it7, null, null, null, null, null, 0L, null, null, null, null, false, false, null, null, null, null, null, true, list != null ? CollectionsKt.D(list) : EmptyList.f17557a, 524287);
            case 10:
                return ChaloCardRechargeAmountViewState.a((ChaloCardRechargeAmountViewState) it, null, null, (ChaloCardDetails) this.b, null, null, 0L, null, null, null, null, false, false, null, null, null, null, null, false, null, 2097147);
            case 11:
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = (ChaloCardRechargeAmountComponent) this.b;
                ChaloCardRechargeAmountIntent it8 = (ChaloCardRechargeAmountIntent) it;
                Intrinsics.i(it8, "it");
                chaloCardRechargeAmountComponent.L0(it8);
                return Unit.f17538a;
            case 12:
                ChaloCheckBoxUIState chaloCheckBoxUIState = (ChaloCheckBoxUIState) this.b;
                ((Boolean) it).getClass();
                chaloCheckBoxUIState.c.a();
                return Unit.f17538a;
            case 13:
                ChaloMapUIState chaloMapUIState = (ChaloMapUIState) this.b;
                LatLng it9 = (LatLng) it;
                Intrinsics.i(it9, "it");
                chaloMapUIState.g.d(it9);
                return Unit.f17538a;
            case 14:
                MultiSelectDatePickerUIState multiSelectDatePickerUIState = (MultiSelectDatePickerUIState) this.b;
                LazyListScope LazyColumn = (LazyListScope) it;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                for (CalendarMonthUIState calendarMonthUIState : multiSelectDatePickerUIState.c) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(697609595, true, new c6(calendarMonthUIState, 11)), 3, null);
                    final ArrayList arrayList2 = calendarMonthUIState.c;
                    LazyColumn.items(arrayList2.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt$ChaloMultiSelectDatePicker$lambda$1$2$0$0$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            arrayList2.get(((Number) obj2).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.compose.components.dialogs.ChaloMultiSelectDatePickerKt$ChaloMultiSelectDatePicker$lambda$1$2$0$0$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i2;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Composer composer = (Composer) obj4;
                            int iIntValue2 = ((Number) obj5).intValue();
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
                                    ComposerKt.traceEventStart(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                List list2 = (List) arrayList2.get(iIntValue);
                                composer.startReplaceGroup(-1390861948);
                                ChaloMultiSelectDatePickerKt.f(list2, composer, 0);
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
                return Unit.f17538a;
            case 15:
                AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.b;
                Density offset = (Density) it;
                Intrinsics.i(offset, "$this$offset");
                return IntOffset.m7393boximpl(IntOffset.m7396constructorimpl((((long) MathKt.f(anchoredDraggableState.getOffset())) << 32) | (((long) 0) & BodyPartID.bodyIdMax)));
            case 16:
                UIImeActionHandler uIImeActionHandler = (UIImeActionHandler) this.b;
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) it;
                Intrinsics.i(KeyboardActions, "$this$KeyboardActions");
                uIImeActionHandler.b.invoke();
                return Unit.f17538a;
            case 17:
                Chalo_pay_table chalo_pay_table = (Chalo_pay_table) this.b;
                SqlPreparedStatement execute = (SqlPreparedStatement) it;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, chalo_pay_table.f10744a);
                execute.d(1, Long.valueOf(chalo_pay_table.b));
                execute.bindString(2, chalo_pay_table.c);
                execute.d(3, Long.valueOf(chalo_pay_table.d));
                execute.bindString(4, chalo_pay_table.e);
                execute.bindString(5, chalo_pay_table.f);
                execute.bindString(6, chalo_pay_table.g);
                execute.bindString(7, chalo_pay_table.h);
                return Unit.f17538a;
            case 18:
                CheckoutCardViewIntent checkoutCardViewIntent = (CheckoutCardViewIntent) this.b;
                CheckoutCardDataState it10 = (CheckoutCardDataState) it;
                Intrinsics.i(it10, "it");
                return CheckoutCardDataState.a(it10, null, null, null, null, null, null, ((CheckoutCardViewIntent.SetFieldInFocus) checkoutCardViewIntent).f1444a, 63);
            case 19:
                CheckoutNetBankingComponent checkoutNetBankingComponent = (CheckoutNetBankingComponent) this.b;
                String search = (String) it;
                Intrinsics.i(search, "search");
                checkoutNetBankingComponent.H0(new NetBankingAppsViewIntent.SearchTextEntered(search));
                return Unit.f17538a;
            case 20:
                NetBankingAppsViewIntent netBankingAppsViewIntent = (NetBankingAppsViewIntent) this.b;
                NetBankingAppsDataState it11 = (NetBankingAppsDataState) it;
                Intrinsics.i(it11, "it");
                return NetBankingAppsDataState.a(it11, null, ((NetBankingAppsViewIntent.SearchTextEntered) netBankingAppsViewIntent).f1503a, null, 11);
            case 21:
                zn znVar = (zn) this.b;
                CheckoutViewIntent intent2 = (CheckoutViewIntent) it;
                Intrinsics.i(intent2, "intent");
                znVar.invoke(intent2);
                return Unit.f17538a;
            case 22:
                ((ch) this.b).invoke(CheckoutViewIntent.WebViewPageLoaded.f1491a);
                return Unit.f17538a;
            case 23:
                RazorPaySdkProvider razorPaySdkProvider = (RazorPaySdkProvider) this.b;
                KWebView kWebView = (KWebView) it;
                if (kWebView != null && (razorpaySdkC = razorPaySdkProvider.c()) != null) {
                    razorpaySdkC.a().setWebView(kWebView.f1934a);
                }
                return Unit.f17538a;
            case 24:
                return Boolean.valueOf(ChildSemanticsNode.applySemantics$lambda$1((SemanticsPropertyReceiver) this.b, (TraversableNode) it));
            case 25:
                ChildStack childStack = (ChildStack) this.b;
                Child.Created created = (Child.Created) CollectionsKt.L(((Integer) it).intValue(), childStack.b);
                return created == null ? childStack.f12382a : created;
            case 26:
                Relay relay = (Relay) this.b;
                Intrinsics.i(it, "it");
                relay.a(new NavEvent.Event(it));
                return Unit.f17538a;
            case 27:
                UniversalSearchCitySelectionResult universalSearchCitySelectionResult = (UniversalSearchCitySelectionResult) this.b;
                CityLocationSelectionState it12 = (CityLocationSelectionState) it;
                Intrinsics.i(it12, "it");
                UniversalSearchCitySelectionResult.CitySelected citySelected = (UniversalSearchCitySelectionResult.CitySelected) universalSearchCitySelectionResult;
                return CityLocationSelectionState.a(it12, false, null, null, citySelected.c, citySelected.d, citySelected.b, null, false, null, false, 1991);
            case 28:
                return CityLocationSelectionState.a((CityLocationSelectionState) it, true, (CityLocationSelectionSource) this.b, null, null, null, null, null, false, null, false, 2044);
            default:
                CitySelectionIntent.CityClickedIntent cityClickedIntent = (CitySelectionIntent.CityClickedIntent) this.b;
                CitySelectionDataState it13 = (CitySelectionDataState) it;
                Intrinsics.i(it13, "it");
                return CitySelectionDataState.a(it13, null, cityClickedIntent.f6618a.f5567a, null, null, false, false, false, ComposerImplKt.nodeKey);
        }
    }
}
