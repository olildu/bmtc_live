package defpackage;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material3.BottomSheetScaffoldState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.ModalWideNavigationRailState;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegate;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProviderImpl;
import app.chalo.home.ui.history.uistate.MyTicketFloatingButtonUiState;
import app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsDataState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsRestoredDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState;
import app.chalo.kyc.min.ui.minkycotp.MinKycOtpRestoredDataState;
import app.chalo.livetracking.stoptripplannerresult.uistate.NearbyStopResultsContainerHeaderUIState;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.locationdisclaimer.LocationDisclaimerComponent;
import app.chalo.locationdisclaimer.LocationDisclaimerIntent;
import app.chalo.metro.ui.landing.uistate.LineSelectionItemUIState;
import app.chalo.metro.ui.landing.uistate.MetroLandingScreenViewState;
import app.chalo.models.mticketing.MTicket;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionRestoredState;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationConfig;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCardUIState;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.components.LinearProgressIndicatorUIState;
import app.chalo.uistate.noneditablesearch.NonEditableSearchFieldUiState;
import app.chalo.walletframework.di.LazyWalletSettings;
import coil3.RealImageLoader;
import coil3.disk.DiskCache;
import com.mmk.kmpnotifier.di.LibDependencyInitializer;
import com.mmk.kmpnotifier.firebase.MyFirebaseMessagingService;
import com.mmk.kmpnotifier.notification.Notifier;
import com.russhwolf.settings.Settings;
import io.github.alexzhirkevich.compottie.LottieComposition;
import io.github.alexzhirkevich.compottie.internal.layers.Layer;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.channels.Channel;
import kotlinx.io.Buffer;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15722a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gd0(Object obj, int i) {
        this.f15722a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProductBookingStopDetails productBookingStopDetails;
        ProductBookingStopDetails productBookingStopDetails2;
        int i = this.f15722a;
        Long l = null;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return LabelKt.Label$lambda$4$lambda$3((Ref.ObjectRef) obj);
            case 1:
                LatLng latLng = (LatLng) obj;
                return new com.google.android.gms.maps.model.LatLng(latLng.f5134a, latLng.b);
            case 2:
                LatLngBounds latLngBounds = (LatLngBounds) obj;
                return new com.google.android.gms.maps.model.LatLngBounds(latLngBounds.f5135a.b(), latLngBounds.b.b());
            case 3:
                return (Settings) ((LazyWalletSettings) obj).f10910a.invoke();
            case 4:
                return LegacyTextInputMethodRequest.baseInputConnection_delegate$lambda$0((LegacyTextInputMethodRequest) obj);
            case 5:
                ((LineSelectionItemUIState) obj).g.a();
                return unit;
            case 6:
                return Float.valueOf(((LinearProgressIndicatorUIState) obj).f9939a);
            case 7:
                ((LocationDisclaimerComponent) obj).K0(LocationDisclaimerIntent.GoToSettingsBtnClicked.f5169a);
                return unit;
            case 8:
                List list = ((LottieComposition) obj).f16102a.g;
                int iG = MapsKt.g(CollectionsKt.v(list, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                for (Object obj2 : list) {
                    String name = ((Layer) obj2).getB();
                    if (name == null) {
                        name = "";
                    }
                    linkedHashMap.put(name, obj2);
                }
                return linkedHashMap;
            case 9:
                Preferences.Key key = MTicketPassengerSelectionComponent.D;
                MTicketPassengerSelectionDataState mTicketPassengerSelectionDataState = (MTicketPassengerSelectionDataState) ((MTicketPassengerSelectionComponent) obj).f.getValue();
                Intrinsics.i(mTicketPassengerSelectionDataState, "<this>");
                ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel = mTicketPassengerSelectionDataState.f;
                String str = singleJourneyTicketAppModel != null ? singleJourneyTicketAppModel.j : null;
                ProductBookingRouteDetails productBookingRouteDetails = mTicketPassengerSelectionDataState.f5743a;
                if (productBookingRouteDetails == null || (productBookingStopDetails = mTicketPassengerSelectionDataState.b) == null || (productBookingStopDetails2 = mTicketPassengerSelectionDataState.c) == null) {
                    return null;
                }
                return new MTicketPassengerSelectionRestoredState(str, productBookingRouteDetails, productBookingStopDetails, productBookingStopDetails2, mTicketPassengerSelectionDataState.g, mTicketPassengerSelectionDataState.m);
            case 10:
                Long l2 = ((MTicket) obj).n;
                if (l2 != null && l2.longValue() > 0) {
                    l = l2;
                }
                return Boolean.valueOf(l != null);
            case 11:
                final ManualBluetoothTurnOnDelegateProviderImpl manualBluetoothTurnOnDelegateProviderImpl = (ManualBluetoothTurnOnDelegateProviderImpl) obj;
                return new ManualBluetoothTurnOnDelegate() { // from class: app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProviderImpl$defaultDelegate$2$1
                    @Override // app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegate
                    public final Object a(Continuation continuation) {
                        manualBluetoothTurnOnDelegateProviderImpl.f1125a.i(new IllegalStateException("ManualBluetoothTurnOnDelegate not setup"));
                        return Boolean.FALSE;
                    }
                };
            case 12:
                ((MetroLandingScreenViewState) obj).f.getF5522a().b.g.a();
                return unit;
            case 13:
                MinKycDetailsDataState minKycDetailsDataState = (MinKycDetailsDataState) ((MinKycDetailsComponent) obj).f.getValue();
                Intrinsics.i(minKycDetailsDataState, "<this>");
                return new MinKycDetailsRestoredDataState(minKycDetailsDataState.f4119a, minKycDetailsDataState.b, minKycDetailsDataState.e);
            case 14:
                MinKycOtpDataState minKycOtpDataState = (MinKycOtpDataState) ((MinKycOtpComponent) obj).f.getValue();
                Intrinsics.i(minKycOtpDataState, "<this>");
                return new MinKycOtpRestoredDataState(minKycOtpDataState.f4145a, minKycOtpDataState.b, minKycOtpDataState.c, minKycOtpDataState.f, minKycOtpDataState.g, minKycOtpDataState.h, minKycOtpDataState.i, minKycOtpDataState.j, minKycOtpDataState.k, minKycOtpDataState.l, minKycOtpDataState.n);
            case 15:
                return ((ModalWideNavigationRailState) obj).animationSpec;
            case 16:
                return MouseWheelScrollingLogic.sumOrNull$lambda$0((Channel) obj);
            case 17:
                MultiModalGroupTicketValidationConfig multiModalGroupTicketValidationConfig = (MultiModalGroupTicketValidationConfig) obj;
                return multiModalGroupTicketValidationConfig.h.a(multiModalGroupTicketValidationConfig.b, multiModalGroupTicketValidationConfig.k);
            case 18:
                return Boolean.valueOf(((MultiModalGroupTicketAppModel) obj).g == MultiModalGroupTicketStatus.PUNCHED);
            case 19:
                ((MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState) obj).b.b.g.a();
                return unit;
            case 20:
                Buffer buffer = new Buffer();
                BytePacketBuilderKt.b(buffer, (byte[]) obj);
                return buffer;
            case 21:
                ((OriginDestinationSelectionCardUIState) obj).f.invoke();
                return unit;
            case 22:
                int i2 = MyFirebaseMessagingService.c;
                KoinComponent koinComponentC = ((MyFirebaseMessagingService) obj).c();
                koinComponentC.getClass();
                if (LibDependencyInitializer.f15302a != null) {
                    return (Notifier) (koinComponentC instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponentC).getF18836a() : koinComponentC.L().c.d).d(Reflection.a(Notifier.class), null, null);
                }
                throw new IllegalStateException("NotifierFactory is not initialized. Please, initialize NotifierFactory by calling #initialize method");
            case 23:
                ((MyTicketFloatingButtonUiState) obj).d.a();
                return unit;
            case 24:
                ((qk0) obj).invoke();
                return unit;
            case 25:
                String str2 = ((NcmcOnlineRechargeComponent) obj).x;
                if (str2 != null) {
                    return new ResultStateKeeperMeta(str2);
                }
                return null;
            case 26:
                return ((BottomSheetScaffoldState) obj).getBottomSheetState().getCurrentValue();
            case 27:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = ((NearbyStopResultsContainerHeaderUIState) obj).d;
                if (uiEventHandler$Companion$fromLambda$1 != null) {
                    uiEventHandler$Companion$fromLambda$1.a();
                }
                return unit;
            case 28:
                return (DiskCache) ((RealImageLoader) obj).f11470a.e.getValue();
            default:
                ((NonEditableSearchFieldUiState) obj).d.a();
                return unit;
        }
    }
}
