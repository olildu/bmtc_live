package defpackage;

import app.chalo.core.networkinspector.NetworkInspectorState;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapState;
import app.chalo.ncmc.data.error.NcmcCardRechargeNotFoundException;
import app.chalo.ncmc.remote.INcmcCardRemoteDataSource;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType;
import app.chalo.ncmc.uvik.UvikSdkHelper;
import app.chalo.ncmc.uvik.UvikSdkManagerProvider;
import app.chalo.network.logging.NetworkCallInfo;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsZoomedImageState;
import app.chalo.stoptripdetails.data.model.StopTripDetailsUiModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.JsonBuilder;
import org.koin.core.definition.BeanDefinition;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class im0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15927a;

    public /* synthetic */ im0(int i) {
        this.f15927a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15927a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new NcmcCardRechargeNotFoundException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 1:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(INcmcCardRemoteDataSource.class), factoryOf.f);
                return unit;
            case 2:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(INcmcCardRepository.class), factoryOf2.f);
                return unit;
            case 3:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(UvikSdkManagerProvider.class), singleOf.f);
                return unit;
            case 4:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(UvikSdkHelper.class), singleOf2.f);
                return unit;
            case 5:
                NCMCOnlineRechargeViewState it = (NCMCOnlineRechargeViewState) obj;
                Intrinsics.i(it, "it");
                return NCMCOnlineRechargeViewState.a(it, null, true, false, null, null, null, null, null, null, null, 0L, null, null, null, 131069);
            case 6:
                NCMCOnlineRechargeViewState it2 = (NCMCOnlineRechargeViewState) obj;
                Intrinsics.i(it2, "it");
                return NCMCOnlineRechargeViewState.a(it2, null, false, false, null, null, null, null, null, null, null, 0L, null, null, null, 131069);
            case 7:
                NCMCOnlineRechargeViewState it3 = (NCMCOnlineRechargeViewState) obj;
                Intrinsics.i(it3, "it");
                return NCMCOnlineRechargeViewState.a(it3, null, false, false, null, null, null, null, null, null, null, 0L, null, null, NcmcOnlineRechargeSuccessBottomSheetType.UNDEFINED, 65535);
            case 8:
                NCMCOnlineRechargeViewState it4 = (NCMCOnlineRechargeViewState) obj;
                Intrinsics.i(it4, "it");
                return NCMCOnlineRechargeViewState.a(it4, null, false, false, null, null, null, null, null, null, null, 0L, null, null, null, 126975);
            case 9:
                return NCMCOnlineRechargeViewState.a((NCMCOnlineRechargeViewState) obj, null, false, false, null, null, null, null, null, null, null, 0L, null, null, null, 126975);
            case 10:
                NearbyStopsMapState it5 = (NearbyStopsMapState) obj;
                Intrinsics.i(it5, "it");
                return NearbyStopsMapState.a(it5, false, null, null, null, false, null, null, null, null, null, null, false, 32765);
            case 11:
                NearbyStopsMapState it6 = (NearbyStopsMapState) obj;
                Intrinsics.i(it6, "it");
                return NearbyStopsMapState.a(it6, false, null, null, null, false, null, null, null, null, null, null, false, 16127);
            case 12:
                NearbyStopsMapState it7 = (NearbyStopsMapState) obj;
                Intrinsics.i(it7, "it");
                return NearbyStopsMapState.a(it7, false, null, null, null, false, null, null, null, null, null, null, !it7.n, 16383);
            case 13:
                return NearbyStopsMapState.a((NearbyStopsMapState) obj, false, null, null, null, false, null, null, null, null, null, null, true, 16383);
            case 14:
                return ((StopTripDetailsUiModel) obj).d;
            case 15:
                JsonBuilder Json = (JsonBuilder) obj;
                Lazy lazy = NetworkCallInfo.j;
                Intrinsics.i(Json, "$this$Json");
                Json.e = true;
                return unit;
            case 16:
                NetworkInspectorState it8 = (NetworkInspectorState) obj;
                Intrinsics.i(it8, "it");
                return NetworkInspectorState.a(it8, null, false, null, 13);
            case 17:
                NetworkInspectorState it9 = (NetworkInspectorState) obj;
                Intrinsics.i(it9, "it");
                return NetworkInspectorState.a(it9, null, false, null, 13);
            case 18:
                return NetworkInspectorState.a((NetworkInspectorState) obj, null, true, null, 3);
            case 19:
                NetworkCallInfo it10 = (NetworkCallInfo) obj;
                Intrinsics.i(it10, "it");
                return it10.f6467a;
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.i(entry, "entry");
                return entry.getKey() + ": " + CollectionsKt.O((Iterable) entry.getValue(), ", ", null, null, null, 62);
            case 21:
                NewPremiumBusReserveTicketActivationState it11 = (NewPremiumBusReserveTicketActivationState) obj;
                Intrinsics.i(it11, "it");
                return NewPremiumBusReserveTicketActivationState.a(it11, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -524289, 31);
            case 22:
                NewPremiumBusReserveTicketActivationState it12 = (NewPremiumBusReserveTicketActivationState) obj;
                Intrinsics.i(it12, "it");
                return NewPremiumBusReserveTicketActivationState.a(it12, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, false, null, null, PBStopDetailsZoomedImageState.Hide.f7940a, null, null, null, -1, 30);
            case 23:
                NewPremiumBusReserveTicketActivationState it13 = (NewPremiumBusReserveTicketActivationState) obj;
                Intrinsics.i(it13, "it");
                return NewPremiumBusReserveTicketActivationState.a(it13, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -524289, 31);
            case 24:
                SeatInfoAppModel it14 = (SeatInfoAppModel) obj;
                Intrinsics.i(it14, "it");
                return it14.c;
            case 25:
                OfflineCardRechargeViewState it15 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it15, "it");
                return OfflineCardRechargeViewState.a(it15, null, null, null, null, null, null, null, null, null, true, false, false, false, null, null, false, false, null, 523775);
            case 26:
                OfflineCardRechargeViewState it16 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it16, "it");
                return OfflineCardRechargeViewState.a(it16, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 1966079);
            case 27:
                OfflineCardRechargeViewState it17 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it17, "it");
                return OfflineCardRechargeViewState.a(it17, null, null, null, null, null, null, null, null, null, false, true, false, false, null, null, false, false, null, 2094079);
            case 28:
                OfflineCardRechargeViewState it18 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it18, "it");
                return OfflineCardRechargeViewState.a(it18, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 2096127);
            default:
                OfflineCardRechargeViewState it19 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it19, "it");
                return OfflineCardRechargeViewState.a(it19, null, null, null, null, null, null, null, null, null, false, false, true, false, null, null, false, false, null, 2095103);
        }
    }
}
