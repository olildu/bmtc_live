package defpackage;

import android.content.Context;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerType;
import app.chalo.domain.GetTrimmedPolylineUseCase;
import app.chalo.domain.PolylineTrimRequest;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchIntent;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsMapUiModelKt;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerIntermediateStopInfoAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsIntent;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsMapUiModel;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsState;
import app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsStopMarker;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsViewType;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import app.chalo.locationdisclaimer.LocationDisclaimerDataState;
import app.chalo.locationdisclaimer.domain.LocationDisclaimerStepsAndLottiType;
import app.chalo.login.ui.userconsent.UserConsentDataState;
import app.chalo.login.ui.userconsent.UserConsentIntent;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.permissions.models.AppPermission;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.productactivation.ui.ProductActivationDataState;
import app.chalo.productpurchase.passpurchase.ui.passbookingsuccess.SuperPassBookingSuccessDataState;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.SuperPassBookingSuccessArgs;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.uistate.components.map.PolylinePointUIState;
import app.chalo.userprofile.Gender;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.PlatformFeature;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceDataState;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.backhandler.BackCallbackKt;
import com.arkivanov.essenty.backhandler.BackCallbackKt$BackCallback$1;
import com.google.android.gms.wallet.WalletConstants;
import io.ktor.http.CodecsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18460a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8(Object obj, boolean z, int i) {
        this.f18460a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0319  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v45, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo;
        TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel;
        TripPlannerDetailsState tripPlannerDetailsState;
        List list;
        List list2;
        TripPlannerDetailsState tripPlannerDetailsState2;
        ChaloMapMarkerType chaloMapMarkerType;
        List<TripPlannerLegAppModel> list3;
        ?? A;
        int i = this.f18460a;
        Unit unit = Unit.f17538a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                final ComponentContext componentContext = (ComponentContext) obj2;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                final BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1A = BackCallbackKt.a(z, new wb(8), Integer.MAX_VALUE, 28);
                componentContext.getD().a(backCallbackKt$BackCallback$1A);
                return new DisposableEffectResult() { // from class: app.chalo.compose.BackHandlerKt$NonDismissableModalBackBlocker$lambda$1$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        componentContext.getD().d(backCallbackKt$BackCallback$1A);
                    }
                };
            case 1:
                CityAppModel cityAppModel = (CityAppModel) obj2;
                CitySelectionDataState it = (CitySelectionDataState) obj;
                Intrinsics.i(it, "it");
                if (!z) {
                    if (cityAppModel != null) {
                        str = cityAppModel.f8854a;
                    } else {
                        str2 = null;
                    }
                    return CitySelectionDataState.a(it, null, str2, null, null, true, false, false, 77);
                }
                str = it.b;
                str2 = str;
                return CitySelectionDataState.a(it, null, str2, null, null, true, false, false, 77);
            case 2:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (CodecsKt.f16763a.contains(b) || CodecsKt.f.contains(b)) {
                    sb.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb.append('+');
                } else {
                    sb.append(CodecsKt.g(bByteValue));
                }
                return unit;
            case 3:
                EBillFetchDataState it2 = (EBillFetchDataState) obj;
                Intrinsics.i(it2, "it");
                return EBillFetchDataState.a(it2, false, null, this.b, ((EBillFetchIntent.NumberEnteredIntent) obj2).f2563a, false, false, false, null, 208);
            case 4:
                Context cxt = (Context) obj;
                Intrinsics.i(cxt, "cxt");
                PlayerView playerView = new PlayerView(cxt);
                playerView.setPlayer((ExoPlayer) obj2);
                playerView.setUseController(z);
                playerView.setShutterBackgroundColor(0);
                return playerView;
            case 5:
                return LocationDisclaimerDataState.a((LocationDisclaimerDataState) obj, this.b, false, (LocationDisclaimerStepsAndLottiType) obj2, false, 24);
            case 6:
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, ((PbBulkBookingRideDetailsViewIntent.ViewCreatedIntent) obj2).f6932a, this.b, null, null, null, null, false, null, false, 66715647);
            case 7:
                return ProductActivationDataState.a((ProductActivationDataState) obj, null, null, null, null, false, null, null, null, (Gender) obj2, this.b, null, null, false, 15615);
            case 8:
                ArrayList arrayList = (ArrayList) obj2;
                Map scanAndPayProperties = (Map) obj;
                Intrinsics.i(scanAndPayProperties, "$this$scanAndPayProperties");
                scanAndPayProperties.put("permissionsGranted", Boolean.valueOf(z));
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(((AppPermission) obj3).name());
                }
                scanAndPayProperties.put("permissionsDenied", arrayList2);
                return unit;
            case 9:
                RouteDetailsDataState it3 = (RouteDetailsDataState) obj;
                Intrinsics.i(it3, "it");
                return RouteDetailsDataState.a(it3, false, null, null, null, null, null, null, new RouteDetailsViewType.AllLiveVehicles(z), null, null, null, RouteDetailsMapUiModelKt.b(it3.m, ((RouteDetailsComponent) obj2).z0), null, false, false, null, null, null, null, false, null, null, false, false, false, null, null, false, false, null, "", false, null, false, null, false, -4225, ComposerImplKt.nodeKey);
            case 10:
                return SliderKt.sliderSemantics$lambda$52(z, (SliderState) obj2, (SemanticsPropertyReceiver) obj);
            case 11:
                Object objB = null;
                SuperPassBookingSuccessArgs superPassBookingSuccessArgs = (SuperPassBookingSuccessArgs) obj2;
                SuperPassBookingSuccessDataState superPassBookingSuccessDataState = (SuperPassBookingSuccessDataState) obj;
                String str3 = superPassBookingSuccessArgs.b;
                String str4 = superPassBookingSuccessArgs.c;
                SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
                String str5 = superPassBookingSuccessArgs.d;
                companion.getClass();
                SuperPassSubType superPassSubTypeA = SuperPassSubType.Companion.a(str5);
                String str6 = superPassBookingSuccessArgs.f;
                if (str6 != null) {
                    try {
                        Json json = ChaloJson.b;
                        json.getClass();
                        objB = json.b(str6, BuiltinSerializersKt.c(SuperPassPurchaseStopsInfo.INSTANCE.serializer()));
                    } catch (Exception unused) {
                    }
                    superPassPurchaseStopsInfo = (SuperPassPurchaseStopsInfo) objB;
                } else {
                    superPassPurchaseStopsInfo = null;
                }
                superPassBookingSuccessDataState.getClass();
                return new SuperPassBookingSuccessDataState(str3, str4, superPassSubTypeA, this.b, superPassPurchaseStopsInfo);
            case 12:
                final TripPlannerDetailsComponent tripPlannerDetailsComponent = (TripPlannerDetailsComponent) obj2;
                GetTrimmedPolylineUseCase getTrimmedPolylineUseCase = tripPlannerDetailsComponent.o;
                TripPlannerDetailsState it4 = (TripPlannerDetailsState) obj;
                Intrinsics.i(it4, "it");
                ArrayList arrayList3 = new ArrayList();
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = tripPlannerDetailsComponent.K;
                List<TripPlannerLegAppModel> list4 = tripPlannerItineraryAppResponseModel != null ? tripPlannerItineraryAppResponseModel.f : null;
                Map mapD = tripPlannerDetailsComponent.L;
                if (mapD == null) {
                    mapD = MapsKt.d();
                }
                if (list4 != null) {
                    for (TripPlannerLegAppModel tripPlannerLegAppModel : list4) {
                        if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                            TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                            String str7 = bus.o;
                            if (str7 == null) {
                                RouteAppModel routeAppModel = (RouteAppModel) mapD.get(bus.p);
                                str7 = routeAppModel != null ? routeAppModel.m : null;
                            }
                            List list5 = bus.A;
                            A = new ArrayList(CollectionsKt.v(list5, 10));
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                A.add(((TripPlannerIntermediateStopInfoAppResponseModel) it5.next()).c);
                            }
                            if (str7 != null && str7.length() != 0) {
                                ChaloUseCaseResult chaloUseCaseResultA = getTrimmedPolylineUseCase.a(str7, EmptyList.f17557a, new PolylineTrimRequest.FromPointToPoint(bus.s.c, bus.t.c));
                                if (chaloUseCaseResultA instanceof ChaloUseCaseResult.Success) {
                                    A = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResultA).f10419a;
                                } else if (!(chaloUseCaseResultA instanceof ChaloUseCaseResult.Failure)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) {
                            TripPlannerLegAppModel.Metro metro = (TripPlannerLegAppModel.Metro) tripPlannerLegAppModel;
                            String str8 = metro.o;
                            if (str8 == null) {
                                RouteAppModel routeAppModel2 = (RouteAppModel) mapD.get(metro.p);
                                str8 = routeAppModel2 != null ? routeAppModel2.m : null;
                            }
                            List list6 = metro.A;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.v(list6, 10));
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                arrayList4.add(((TripPlannerIntermediateStopInfoAppResponseModel) it6.next()).c);
                            }
                            if (str8 == null || str8.length() == 0) {
                                A = arrayList4;
                            } else {
                                ChaloUseCaseResult chaloUseCaseResultA2 = getTrimmedPolylineUseCase.a(str8, EmptyList.f17557a, new PolylineTrimRequest.FromPointToPoint(metro.s.c, metro.t.c));
                                if (chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Success) {
                                    A = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResultA2).f10419a;
                                } else {
                                    if (!(chaloUseCaseResultA2 instanceof ChaloUseCaseResult.Failure)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    A = arrayList4;
                                }
                            }
                        } else {
                            if (!(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Auto) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.Ferry.INSTANCE) && !Intrinsics.d(tripPlannerLegAppModel, TripPlannerLegAppModel.MonoRail.INSTANCE) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Railway) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Taxi) && !(tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Walk)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            String g = tripPlannerLegAppModel.getG();
                            if (g == null) {
                                g = "";
                            }
                            A = MapUtilsKt.a(g, tripPlannerDetailsComponent.E, EmptyList.f17557a);
                        }
                        arrayList3.add(new PolylinePointUIState(A));
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel2 = tripPlannerDetailsComponent.K;
                if (tripPlannerItineraryAppResponseModel2 != null && (list3 = tripPlannerItineraryAppResponseModel2.f) != null) {
                    for (TripPlannerLegAppModel tripPlannerLegAppModel2 : list3) {
                        LatLng f4665a = tripPlannerLegAppModel2.getF4665a();
                        LatLng b2 = tripPlannerLegAppModel2.getB();
                        if (f4665a != null) {
                            arrayList5.add(f4665a);
                        }
                        if (b2 != null) {
                            arrayList5.add(b2);
                        }
                    }
                }
                LatLngBounds latLngBoundsA = tripPlannerDetailsComponent.F.a(arrayList5);
                float f = PlatformFeature.f10436a;
                TripPlannerDetailsMapUiModel tripPlannerDetailsMapUiModel2 = new TripPlannerDetailsMapUiModel(arrayList3, z, new MapCameraViewState.UpdatedState.BoundToCustomLatLngs(new ChaloMapLatLngBoundsDetails(latLngBoundsA, 200)));
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel3 = tripPlannerDetailsComponent.K;
                if (tripPlannerItineraryAppResponseModel3 == null || (list2 = tripPlannerItineraryAppResponseModel3.f) == null) {
                    tripPlannerDetailsMapUiModel = tripPlannerDetailsMapUiModel2;
                    tripPlannerDetailsState = it4;
                    list = EmptyList.f17557a;
                } else {
                    ChaloMapMarkerIconProvider chaloMapMarkerIconProvider = tripPlannerDetailsComponent.m;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it7 = list2.iterator();
                    int i3 = 0;
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        final TripPlannerLegAppModel tripPlannerLegAppModel3 = (TripPlannerLegAppModel) next;
                        LatLng f4665a2 = tripPlannerLegAppModel3.getF4665a();
                        LatLng b3 = tripPlannerLegAppModel3.getB();
                        if (i3 == 0 && f4665a2 != null) {
                            IconType iconTypeB = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.START_STOP);
                            ChaloMapMarkerUIEventHandler.Companion companion2 = ChaloMapMarkerUIEventHandler.f1869a;
                            final int i5 = 2;
                            Function0 function0 = new Function0() { // from class: dl1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 1:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 2:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 3:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 4:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 5:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        default:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                    }
                                    return Boolean.FALSE;
                                }
                            };
                            int i6 = 8;
                            wb wbVar = new wb(i6);
                            wb wbVar2 = new wb(i6);
                            companion2.getClass();
                            arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(f4665a2), f4665a2, iconTypeB, ChaloMapMarkerUIEventHandler.Companion.a(function0, wbVar, wbVar2)));
                        }
                        if (i3 == CollectionsKt.K(list2) && b3 != null) {
                            IconType iconTypeB2 = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.END_STOP);
                            ChaloMapMarkerUIEventHandler.Companion companion3 = ChaloMapMarkerUIEventHandler.f1869a;
                            final int i7 = 6;
                            Function0 function1 = new Function0() { // from class: dl1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 1:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 2:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 3:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 4:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        case 5:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                        default:
                                            tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                            break;
                                    }
                                    return Boolean.FALSE;
                                }
                            };
                            int i8 = 8;
                            wb wbVar3 = new wb(i8);
                            wb wbVar4 = new wb(i8);
                            companion3.getClass();
                            arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(b3), b3, iconTypeB2, ChaloMapMarkerUIEventHandler.Companion.a(function1, wbVar3, wbVar4)));
                        }
                        boolean z2 = tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Auto;
                        if (z2 || tripPlannerLegAppModel3.equals(TripPlannerLegAppModel.Ferry.INSTANCE) || tripPlannerLegAppModel3.equals(TripPlannerLegAppModel.MonoRail.INSTANCE) || (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Railway) || (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Taxi) || (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Walk)) {
                            int i9 = i3;
                            tripPlannerDetailsState2 = it4;
                            if (f4665a2 != null && i9 != 0) {
                                if (z2) {
                                    chaloMapMarkerType = ChaloMapMarkerType.AUTO_START_STOP;
                                } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Bus) {
                                    chaloMapMarkerType = ChaloMapMarkerType.BUS_START_STOP;
                                } else if (tripPlannerLegAppModel3.equals(TripPlannerLegAppModel.Ferry.INSTANCE)) {
                                    chaloMapMarkerType = ChaloMapMarkerType.FERRY_START_STOP;
                                } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Metro) {
                                    chaloMapMarkerType = ChaloMapMarkerType.METRO_START_STOP;
                                } else if (tripPlannerLegAppModel3.equals(TripPlannerLegAppModel.MonoRail.INSTANCE)) {
                                    chaloMapMarkerType = ChaloMapMarkerType.MONORAIL_START_STOP;
                                } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Railway) {
                                    chaloMapMarkerType = ChaloMapMarkerType.RAILWAY_START_STOP;
                                } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Taxi) {
                                    chaloMapMarkerType = ChaloMapMarkerType.TAXI_START_STOP;
                                } else {
                                    if (!(tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Walk)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    chaloMapMarkerType = ChaloMapMarkerType.WALK_START_STOP;
                                }
                                IconType iconTypeB3 = chaloMapMarkerIconProvider.b(chaloMapMarkerType);
                                ChaloMapMarkerUIEventHandler.Companion companion4 = ChaloMapMarkerUIEventHandler.f1869a;
                                final int i10 = 0;
                                Function0 function2 = new Function0() { // from class: dl1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i10) {
                                            case 0:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            case 1:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            case 2:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            case 3:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            case 4:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            case 5:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                            default:
                                                tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                break;
                                        }
                                        return Boolean.FALSE;
                                    }
                                };
                                int i11 = 8;
                                wb wbVar5 = new wb(i11);
                                wb wbVar6 = new wb(i11);
                                companion4.getClass();
                                arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(f4665a2), f4665a2, iconTypeB3, ChaloMapMarkerUIEventHandler.Companion.a(function2, wbVar5, wbVar6)));
                            }
                        } else if (tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Metro) {
                            List list7 = ((TripPlannerLegAppModel.Metro) tripPlannerLegAppModel3).A;
                            Iterator it8 = list7.iterator();
                            int i12 = 0;
                            while (it8.hasNext()) {
                                Object next2 = it8.next();
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                TripPlannerIntermediateStopInfoAppResponseModel tripPlannerIntermediateStopInfoAppResponseModel = (TripPlannerIntermediateStopInfoAppResponseModel) next2;
                                if ((i12 != 0 || i3 != 0) && (i12 != CollectionsKt.K(list7) || i3 != CollectionsKt.K(list2))) {
                                    if (i12 != 0) {
                                        list7 = list7;
                                        it8 = it8;
                                        LatLng latLng = tripPlannerIntermediateStopInfoAppResponseModel.c;
                                        IconType iconTypeB4 = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.METRO_INTERMEDIATE_STOP);
                                        ChaloMapMarkerUIEventHandler.Companion companion5 = ChaloMapMarkerUIEventHandler.f1869a;
                                        final int i14 = 3;
                                        Function0 function3 = new Function0() { // from class: dl1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i14) {
                                                    case 0:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 1:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 2:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 3:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 4:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 5:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    default:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                }
                                                return Boolean.FALSE;
                                            }
                                        };
                                        int i15 = 8;
                                        wb wbVar7 = new wb(i15);
                                        wb wbVar8 = new wb(i15);
                                        companion5.getClass();
                                        arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(tripPlannerIntermediateStopInfoAppResponseModel.c), latLng, iconTypeB4, ChaloMapMarkerUIEventHandler.Companion.a(function3, wbVar7, wbVar8)));
                                    } else if (f4665a2 != null) {
                                        IconType iconTypeB5 = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.METRO_START_STOP);
                                        ChaloMapMarkerUIEventHandler.Companion companion6 = ChaloMapMarkerUIEventHandler.f1869a;
                                        final int i16 = 1;
                                        Function0 function4 = new Function0() { // from class: dl1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i16) {
                                                    case 0:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 1:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 2:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 3:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 4:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 5:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    default:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                }
                                                return Boolean.FALSE;
                                            }
                                        };
                                        int i17 = 8;
                                        wb wbVar9 = new wb(i17);
                                        wb wbVar10 = new wb(i17);
                                        companion6.getClass();
                                        arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(f4665a2), f4665a2, iconTypeB5, ChaloMapMarkerUIEventHandler.Companion.a(function4, wbVar9, wbVar10)));
                                    }
                                }
                                i12 = i13;
                                list7 = list7;
                                it8 = it8;
                                it4 = it4;
                            }
                            tripPlannerDetailsState2 = it4;
                        } else {
                            tripPlannerDetailsState2 = it4;
                            if (!(tripPlannerLegAppModel3 instanceof TripPlannerLegAppModel.Bus)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            List list8 = ((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel3).A;
                            Iterator it9 = list8.iterator();
                            int i18 = 0;
                            while (it9.hasNext()) {
                                Object next3 = it9.next();
                                int i19 = i18 + 1;
                                if (i18 < 0) {
                                    CollectionsKt.z0();
                                    throw null;
                                }
                                TripPlannerIntermediateStopInfoAppResponseModel tripPlannerIntermediateStopInfoAppResponseModel2 = (TripPlannerIntermediateStopInfoAppResponseModel) next3;
                                if ((i18 != 0 || i3 != 0) && (i18 != CollectionsKt.K(list8) || i3 != CollectionsKt.K(list2))) {
                                    if (i18 != 0) {
                                        list8 = list8;
                                        LatLng latLng2 = tripPlannerIntermediateStopInfoAppResponseModel2.c;
                                        IconType iconTypeB6 = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.BUS_INTERMEDIATE_STOP);
                                        ChaloMapMarkerUIEventHandler.Companion companion7 = ChaloMapMarkerUIEventHandler.f1869a;
                                        final int i20 = 5;
                                        Function0 function5 = new Function0() { // from class: dl1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i20) {
                                                    case 0:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 1:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 2:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 3:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 4:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 5:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    default:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                }
                                                return Boolean.FALSE;
                                            }
                                        };
                                        int i21 = 8;
                                        wb wbVar11 = new wb(i21);
                                        wb wbVar12 = new wb(i21);
                                        companion7.getClass();
                                        arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(tripPlannerIntermediateStopInfoAppResponseModel2.c), latLng2, iconTypeB6, ChaloMapMarkerUIEventHandler.Companion.a(function5, wbVar11, wbVar12)));
                                    } else if (f4665a2 != null) {
                                        IconType iconTypeB7 = chaloMapMarkerIconProvider.b(ChaloMapMarkerType.BUS_START_STOP);
                                        ChaloMapMarkerUIEventHandler.Companion companion8 = ChaloMapMarkerUIEventHandler.f1869a;
                                        final int i22 = 4;
                                        Function0 function6 = new Function0() { // from class: dl1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i22) {
                                                    case 0:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 1:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 2:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 3:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 4:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    case 5:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                    default:
                                                        tripPlannerDetailsComponent.S0(new TripPlannerDetailsIntent.MapMarkerClickedIntent(tripPlannerLegAppModel3));
                                                        break;
                                                }
                                                return Boolean.FALSE;
                                            }
                                        };
                                        int i23 = 8;
                                        wb wbVar13 = new wb(i23);
                                        wb wbVar14 = new wb(i23);
                                        companion8.getClass();
                                        arrayList6.add(new TripPlannerDetailsStopMarker(String.valueOf(f4665a2), f4665a2, iconTypeB7, ChaloMapMarkerUIEventHandler.Companion.a(function6, wbVar13, wbVar14)));
                                    }
                                }
                                i18 = i19;
                                list8 = list8;
                                it9 = it9;
                                i3 = i3;
                            }
                        }
                        tripPlannerDetailsMapUiModel2 = tripPlannerDetailsMapUiModel2;
                        i3 = i4;
                        list2 = list2;
                        it7 = it7;
                        it4 = tripPlannerDetailsState2;
                    }
                    tripPlannerDetailsMapUiModel = tripPlannerDetailsMapUiModel2;
                    tripPlannerDetailsState = it4;
                    list = arrayList6;
                }
                return TripPlannerDetailsState.a(tripPlannerDetailsState, null, null, null, null, null, tripPlannerDetailsMapUiModel, list, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            case 13:
                LatLng latLng3 = (LatLng) obj2;
                TripPlannerDetailsState it10 = (TripPlannerDetailsState) obj;
                Intrinsics.i(it10, "it");
                EmptyList emptyList = EmptyList.f17557a;
                return TripPlannerDetailsState.a(it10, null, null, null, null, null, new TripPlannerDetailsMapUiModel(emptyList, z, latLng3 != null ? new MapCameraViewState.InitialState.CustomPosition(latLng3, 0.0f, 14) : MapCameraViewState.InitialState.NoState.f1881a), emptyList, null, WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE);
            case 14:
                return UserConsentDataState.a((UserConsentDataState) obj, ((UserConsentIntent.InitializationIntent) obj2).f5354a, null, null, false, null, false, false, this.b, WebSocketProtocol.PAYLOAD_SHORT);
            default:
                WalletBalanceDataState it11 = (WalletBalanceDataState) obj;
                Intrinsics.i(it11, "it");
                return WalletBalanceDataState.a(it11, false, null, false, null, null, 0, 0, ((WalletBalanceComponent) obj2).O0(), false, false, null, false, Boolean.valueOf(z), 7935);
        }
    }

    public /* synthetic */ n8(boolean z, Object obj, int i) {
        this.f18460a = i;
        this.b = z;
        this.c = obj;
    }
}
