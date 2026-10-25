package app.chalo.mticket.domain;

import app.chalo.Device;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerItem;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionContainer;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareBreakdownResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.KUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/CalculateMTicketFareUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalculateMTicketFareUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f5721a;
    public final Device b;

    public CalculateMTicketFareUseCase(UserProfileDetailsProvider userProfileDetailsProvider, Device device) {
        this.f5721a = userProfileDetailsProvider;
        this.b = device;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, MTicketFareResponseAppModel mTicketFareResponseAppModel, ContinuationImpl continuationImpl) {
        CalculateMTicketFareUseCase$invoke$1 calculateMTicketFareUseCase$invoke$1;
        ProductBookingStopDetails productBookingStopDetails3;
        MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer2;
        MTicketFareResponseAppModel mTicketFareResponseAppModel2;
        ProductBookingRouteDetails productBookingRouteDetails2;
        ProductBookingStopDetails productBookingStopDetails4;
        String str;
        ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel2;
        Map mapD;
        if (continuationImpl instanceof CalculateMTicketFareUseCase$invoke$1) {
            calculateMTicketFareUseCase$invoke$1 = (CalculateMTicketFareUseCase$invoke$1) continuationImpl;
            int i = calculateMTicketFareUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                calculateMTicketFareUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                calculateMTicketFareUseCase$invoke$1 = new CalculateMTicketFareUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            calculateMTicketFareUseCase$invoke$1 = new CalculateMTicketFareUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = calculateMTicketFareUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = calculateMTicketFareUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strA = KUUID.a();
            calculateMTicketFareUseCase$invoke$1.L$0 = singleJourneyTicketAppModel;
            calculateMTicketFareUseCase$invoke$1.L$1 = productBookingRouteDetails;
            productBookingStopDetails3 = productBookingStopDetails;
            calculateMTicketFareUseCase$invoke$1.L$2 = productBookingStopDetails3;
            calculateMTicketFareUseCase$invoke$1.L$3 = productBookingStopDetails2;
            mTicketPassengerSelectionContainer2 = mTicketPassengerSelectionContainer;
            calculateMTicketFareUseCase$invoke$1.L$4 = mTicketPassengerSelectionContainer2;
            mTicketFareResponseAppModel2 = mTicketFareResponseAppModel;
            calculateMTicketFareUseCase$invoke$1.L$5 = mTicketFareResponseAppModel2;
            calculateMTicketFareUseCase$invoke$1.L$6 = strA;
            calculateMTicketFareUseCase$invoke$1.label = 1;
            Object objK = this.f5721a.k(calculateMTicketFareUseCase$invoke$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
            productBookingRouteDetails2 = productBookingRouteDetails;
            productBookingStopDetails4 = productBookingStopDetails2;
            str = strA;
            obj = objK;
            singleJourneyTicketAppModel2 = singleJourneyTicketAppModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) calculateMTicketFareUseCase$invoke$1.L$6;
            MTicketFareResponseAppModel mTicketFareResponseAppModel3 = (MTicketFareResponseAppModel) calculateMTicketFareUseCase$invoke$1.L$5;
            MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer3 = (MTicketPassengerSelectionContainer) calculateMTicketFareUseCase$invoke$1.L$4;
            productBookingStopDetails4 = (ProductBookingStopDetails) calculateMTicketFareUseCase$invoke$1.L$3;
            productBookingStopDetails3 = (ProductBookingStopDetails) calculateMTicketFareUseCase$invoke$1.L$2;
            productBookingRouteDetails2 = (ProductBookingRouteDetails) calculateMTicketFareUseCase$invoke$1.L$1;
            singleJourneyTicketAppModel2 = (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) calculateMTicketFareUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            str = str2;
            mTicketFareResponseAppModel2 = mTicketFareResponseAppModel3;
            mTicketPassengerSelectionContainer2 = mTicketPassengerSelectionContainer3;
        }
        String str3 = (String) obj;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        String deviceId = this.b.getDeviceId();
        String str5 = singleJourneyTicketAppModel2.k;
        String str6 = productBookingRouteDetails2.c;
        String str7 = productBookingRouteDetails2.f8194a;
        String str8 = productBookingRouteDetails2.b;
        String str9 = productBookingStopDetails3.f8199a;
        String str10 = productBookingStopDetails3.b;
        String str11 = productBookingStopDetails4.f8199a;
        String str12 = productBookingStopDetails4.b;
        List<ProductBookingSpecialFeature> list = productBookingRouteDetails2.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (ProductBookingSpecialFeature productBookingSpecialFeature : list) {
            RouteLegacySpecialFeature.Companion companion = RouteLegacySpecialFeature.INSTANCE;
            String str13 = productBookingSpecialFeature.f8197a;
            companion.getClass();
            arrayList.add(RouteLegacySpecialFeature.Companion.a(str13));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductBookingSpecialFeature) it.next()).f8197a);
        }
        RouteStopsInfo routeStopsInfo = new RouteStopsInfo(str7, str8, str9, str10, str11, str12, arrayList, arrayList2);
        if (mTicketPassengerSelectionContainer2 != null) {
            List list2 = mTicketFareResponseAppModel2.f8633a.c;
            int iG = MapsKt.g(CollectionsKt.v(list2, 10));
            if (iG < 16) {
                iG = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
            for (Object obj2 : list2) {
                linkedHashMap.put(((MTicketPassengerFareResponseAppModel) obj2).f8636a, obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (MTicketPassengerItem mTicketPassengerItem : mTicketPassengerSelectionContainer2.f5741a) {
                MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel = (MTicketPassengerFareResponseAppModel) linkedHashMap.get(mTicketPassengerItem.f5734a);
                if (mTicketPassengerFareResponseAppModel != null) {
                    MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel = mTicketPassengerFareResponseAppModel.e;
                    if (mTicketPassengerItem.f && mTicketPassengerItem.c > 0) {
                        linkedHashMap2.put(mTicketPassengerItem.f5734a, new MTicketPassengerInfo(mTicketPassengerFareResponseAppModel.b, mTicketPassengerFareResponseAppModel.c, mTicketPassengerFareResponseAppModel.d, mTicketPassengerItem.c, mTicketPassengerFareBreakdownResponseAppModel != null ? MapsKt.u(mTicketPassengerFareBreakdownResponseAppModel.f8635a) : null, mTicketPassengerFareBreakdownResponseAppModel != null ? MapsKt.u(mTicketPassengerFareBreakdownResponseAppModel.b) : null, mTicketFareResponseAppModel2.f8633a.b));
                    }
                }
            }
            mapD = MapsKt.r(linkedHashMap2);
        } else {
            mapD = MapsKt.d();
        }
        return new MTicketFareContainer(new MTicket(str, str4, deviceId, str5, str6, routeStopsInfo, null, mapD, -1L, -1L, false, 0L, false, null, null, null, null, new MTicketConfiguration(singleJourneyTicketAppModel2.j), Boolean.FALSE, false, null, null, null, null, null, null, null, 1073346624));
    }
}
