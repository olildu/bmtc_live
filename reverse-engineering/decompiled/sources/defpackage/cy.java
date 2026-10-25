package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProviderKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import app.chalo.constants.Source;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryIntent;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.ui.base.AppUpdateType;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.home.HomeScreenViewState;
import app.chalo.home.ui.home.LocationTooltipData;
import app.chalo.home.ui.home.LocationTurnOnTooltipType;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessIntent;
import app.chalo.juspay.HyperServiceHolderSDK;
import app.chalo.juspay.JuspayControllerFactory;
import app.chalo.juspay.JuspayControllerImpl;
import app.chalo.juspay.JuspayControllerProviderImpl;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerValue;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.options.LoginOptionsCountry;
import app.chalo.login.ui.options.LoginOptionsIntent;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionIntent;
import app.chalo.onboarding.languageselection.LanguageDetails;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionIntent;
import app.chalo.onboarding.languageselection.LanguageSelectionSnackbarType;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.uistate.dialog.DropDownMenuItemUIState;
import app.chalo.uistate.dialog.DropDownMenuUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerToolbarUIState;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerViewIntent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Job;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.internal.JsonException;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15412a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cy(int i, Object obj, Object obj2) {
        this.f15412a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArrNames;
        int i = this.f15412a;
        Unit unit = Unit.f17538a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$1((TextContextMenuItem) obj2, (TextContextMenuSession) obj);
            case 1:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$0$0((TextContextMenuDataProvider) obj2, (Function0) obj);
            case 2:
                ((QRScannerToolbarUIState) obj2).getClass();
                ((Function1) obj).invoke(QRScannerViewIntent.OnBackPressedIntent.f10726a);
                return unit;
            case 3:
                TweenSpec tweenSpec = DrawerKt.f4449a;
                return new DrawerState((DrawerValue) obj2, (Function1) obj);
            case 4:
                TweenSpec tweenSpec2 = DrawerKt.f4449a;
                return new BottomDrawerState((BottomDrawerValue) obj2, (Function1) obj);
            case 5:
                ((Function0) obj2).invoke();
                ((DropDownMenuItemUIState) obj).b.a();
                return unit;
            case 6:
                ((Function0) obj2).invoke();
                ((DropDownMenuUIState) obj).b.a();
                return unit;
            case 7:
                ((ElectricityBillPaymentHistoryComponent) obj2).G0(new ElectricityPaymentHistoryIntent.PaymentHistoryClicked(((ElectricityBillPaymentHistoryUiModel) obj).j));
                return unit;
            case 8:
                EnumSerializer enumSerializer = (EnumSerializer) obj2;
                String str = (String) obj;
                EnumDescriptor enumDescriptor = enumSerializer.b;
                if (enumDescriptor == null) {
                    Enum[] enumArr = enumSerializer.f18140a;
                    enumDescriptor = new EnumDescriptor(str, enumArr.length);
                    for (Enum r0 : enumArr) {
                        enumDescriptor.j(r0.name(), false);
                    }
                }
                return enumDescriptor;
            case 9:
                return ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.menuAnchor_2Hz36ac$lambda$0((String) obj2, (MutableState) obj);
            case 10:
                return FocusableNode.retrievePinnableContainer$lambda$0((Ref.ObjectRef) obj2, (FocusableNode) obj);
            case 11:
                ChaloNavigationManagerKt.b(((FreshPurchaseDelegate) obj2).j, new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, (String) obj, "mobileTicket", "premiumReserveTicket", true));
                return unit;
            case 12:
                ((Function1) obj2).invoke(new GroupTicketLegSelectionIntent.OnIndividualStepSelected(((GroupTicketSelectableStepAppModel) obj).f5864a));
                return unit;
            case 13:
                ((Function1) obj2).invoke((NavigationTabAppModel) obj);
                return unit;
            case 14:
                ((HomeScreenAnalyticsHelper) obj2).h(AppUpdateType.FLEXIBLE, Source.HOME_SCREEN_TAB);
                ((MutableState) obj).setValue(Boolean.FALSE);
                return unit;
            case 15:
                Function1 function1 = (Function1) obj2;
                LocationTooltipData locationTooltipData = ((HomeScreenViewState) obj).k;
                function1.invoke(new HomeScreenViewIntent.LocationTurnOnButtonClickedIntent(locationTooltipData != null ? locationTooltipData.b : LocationTurnOnTooltipType.Unknown.f3587a));
                return unit;
            case 16:
                return Http2Connection.ReaderRunnable.headers$lambda$2$lambda$1((Http2Connection) obj2, (Http2Stream) obj);
            case 17:
                return Http2Connection.ReaderRunnable.applyAndAckSettings$lambda$7$lambda$6$lambda$5((Http2Connection) obj2, (Ref.ObjectRef) obj);
            case 18:
                ((Function1) obj2).invoke(new InstantTicketWalletAccessIntent.PayUsingWalletClicked(((FareDetailsViewState) obj).i));
                return unit;
            case 19:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                Json json = (Json) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JsonConfiguration jsonConfiguration = json.f18185a;
                JsonNamesMapKt.f(serialDescriptor, json);
                int c = serialDescriptor.getC();
                for (int i2 = 0; i2 < c; i2++) {
                    List listG = serialDescriptor.g(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listG) {
                        if (obj3 instanceof JsonNames) {
                            arrayList.add(obj3);
                        }
                    }
                    JsonNames jsonNames = (JsonNames) CollectionsKt.q0(arrayList);
                    if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.d(serialDescriptor.getB(), SerialKind.ENUM.f18116a) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String message = "The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.f(i2) + " is already one of the names for " + str3 + ' ' + serialDescriptor.f(((Number) MapsKt.e(linkedHashMap, str2)).intValue()) + " in " + serialDescriptor;
                                Intrinsics.i(message, "message");
                                throw new JsonException(message);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i2));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? MapsKt.d() : linkedHashMap;
            case 20:
                ((Job) obj2).cancel(null);
                ((Job) obj).cancel(null);
                return unit;
            case 21:
                JuspayControllerFactory juspayControllerFactory = ((JuspayControllerProviderImpl) obj2).f4043a;
                return new JuspayControllerImpl((HyperServiceHolderSDK) obj, juspayControllerFactory.f4028a, juspayControllerFactory.b, juspayControllerFactory.c, juspayControllerFactory.d, juspayControllerFactory.e, juspayControllerFactory.f, juspayControllerFactory.g, juspayControllerFactory.h);
            case 22:
                ((LanguageSelectionComponent) obj2).L0(new LanguageSelectionIntent.SnackbarRetryClicked((LanguageSelectionSnackbarType) obj));
                return unit;
            case 23:
                ((LanguageSelectionComponent) obj2).L0(new LanguageSelectionIntent.LanguageSelected((LanguageDetails) obj));
                return unit;
            case 24:
                return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$1((State) obj2, (LazyGridState) obj);
            case 25:
                return LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$1((State) obj2, (PagerState) obj);
            case 26:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$0$0((SaveableStateRegistry) obj2, (SaveableStateHolder) obj);
            case 27:
                return LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda$lambda$0$1((State) obj2, (LazyStaggeredGridState) obj);
            case 28:
                ((LoginOptionsComponent) obj2).Q0(new LoginOptionsIntent.OnCountrySelected(((LoginOptionsCountry) obj).f5303a));
                return unit;
            default:
                ((LoginOptionsComponent) obj2).w.b(new ChaloNavigationRequest.Navigate(new MinProfileUpdateArgs((String) obj, true, Source.LOGIN_OPTIONS_SCREEN), null, null, 6));
                return unit;
        }
    }
}
