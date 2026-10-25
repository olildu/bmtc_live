package app.chalo.mticket.domain;

import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.exceptions.MTicketOrderCreationException;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationBookingDataRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.api.MTicketOrderCreationRouteDetailsRequestApiModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareRouteStageResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.utils.KUUID;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
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
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/CreateMTicketOrderUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateMTicketOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f5723a;

    public CreateMTicketOrderUseCase(ProductPurchaseRepository productPurchaseRepository) {
        this.f5723a = productPurchaseRepository;
    }

    public static JsonObject b(Map map) {
        LinkedHashMap linkedHashMap;
        double dDoubleValue;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            MTicketPassengerInfo mTicketPassengerInfo = (MTicketPassengerInfo) entry.getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            Map map2 = mTicketPassengerInfo.e;
            double d = mTicketPassengerInfo.c;
            double d2 = mTicketPassengerInfo.f5621a;
            LinkedHashMap linkedHashMap5 = null;
            if (map2 != null) {
                linkedHashMap = new LinkedHashMap(MapsKt.g(map2.size()));
                for (Map.Entry entry2 : map2.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), JsonElementKt.a((Number) entry2.getValue()));
                }
            } else {
                linkedHashMap = null;
            }
            if (linkedHashMap != null) {
                linkedHashMap4.put(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, new JsonObject(linkedHashMap));
            }
            Map map3 = mTicketPassengerInfo.f;
            if (map3 != null) {
                linkedHashMap5 = new LinkedHashMap(MapsKt.g(map3.size()));
                for (Map.Entry entry3 : map3.entrySet()) {
                    linkedHashMap5.put(entry3.getKey(), JsonElementKt.a((Number) entry3.getValue()));
                }
            }
            if (linkedHashMap5 != null) {
                linkedHashMap4.put("s", new JsonObject(linkedHashMap5));
            }
            if (linkedHashMap != null || linkedHashMap5 != null) {
                linkedHashMap3.put("f_br", new JsonObject(linkedHashMap4));
            }
            linkedHashMap3.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, JsonElementKt.a(Integer.valueOf(mTicketPassengerInfo.d)));
            linkedHashMap3.put("f", JsonElementKt.b(String.valueOf(d2)));
            Double d3 = mTicketPassengerInfo.b;
            if (d3 == null || Double.isNaN(d3.doubleValue())) {
                double d4 = 100;
                dDoubleValue = ((d4 - d) / d4) * d2;
            } else {
                dDoubleValue = d3.doubleValue();
            }
            linkedHashMap3.put("ff", JsonElementKt.b(String.valueOf(dDoubleValue)));
            linkedHashMap3.put("d", JsonElementKt.b(String.valueOf(d)));
            linkedHashMap2.put(str, new JsonObject(linkedHashMap3));
        }
        return new JsonObject(linkedHashMap2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object a(ProductConfigResponseAppModel.SingleJourneyTicketAppModel singleJourneyTicketAppModel, MTicketFareContainer mTicketFareContainer, ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, MTicketFareResponseAppModel mTicketFareResponseAppModel, ContinuationImpl continuationImpl) {
        CreateMTicketOrderUseCase$invoke$1 createMTicketOrderUseCase$invoke$1;
        if (continuationImpl instanceof CreateMTicketOrderUseCase$invoke$1) {
            createMTicketOrderUseCase$invoke$1 = (CreateMTicketOrderUseCase$invoke$1) continuationImpl;
            int i = createMTicketOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createMTicketOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createMTicketOrderUseCase$invoke$1 = new CreateMTicketOrderUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createMTicketOrderUseCase$invoke$1 = new CreateMTicketOrderUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = createMTicketOrderUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createMTicketOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                String str = productBookingRouteDetails.f8194a;
                String str2 = productBookingRouteDetails.b;
                String str3 = productBookingStopDetails.f8199a;
                String str4 = productBookingStopDetails.b;
                String str5 = productBookingStopDetails2.f8199a;
                String str6 = productBookingStopDetails2.b;
                List list = productBookingRouteDetails.d;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProductBookingSpecialFeature) it.next()).f8197a);
                }
                long j = singleJourneyTicketAppModel.v;
                MTicketFareRouteStageResponseAppModel mTicketFareRouteStageResponseAppModel = mTicketFareResponseAppModel.b;
                MTicketOrderCreationRouteDetailsRequestApiModel mTicketOrderCreationRouteDetailsRequestApiModel = mTicketFareRouteStageResponseAppModel != null ? new MTicketOrderCreationRouteDetailsRequestApiModel(mTicketFareRouteStageResponseAppModel.f8634a, mTicketFareRouteStageResponseAppModel.b, mTicketFareRouteStageResponseAppModel.c, mTicketFareRouteStageResponseAppModel.d) : null;
                Map map = mTicketFareContainer.f5726a.h;
                MTicketOrderCreationBookingDataRequestApiModel mTicketOrderCreationBookingDataRequestApiModel = new MTicketOrderCreationBookingDataRequestApiModel(str, str2, str3, str4, str5, str6, arrayList, j, mTicketOrderCreationRouteDetailsRequestApiModel, map != null ? b(map) : null);
                String str7 = singleJourneyTicketAppModel.j;
                Boolean bool = mTicketFareContainer.f5726a.s;
                MTicketOrderCreationRequestApiModel mTicketOrderCreationRequestApiModel = new MTicketOrderCreationRequestApiModel(mTicketOrderCreationBookingDataRequestApiModel, str7, bool != null ? bool.booleanValue() : false, KUUID.a(), singleJourneyTicketAppModel.k);
                ProductPurchaseRepository productPurchaseRepository = this.f5723a;
                createMTicketOrderUseCase$invoke$1.label = 1;
                objA = productPurchaseRepository.a(mTicketOrderCreationRequestApiModel, createMTicketOrderUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            return new MTicketOrderCreationResult.Success((CreateOrderResponseAppModel) objA);
        } catch (MTicketOrderCreationException e) {
            String message = e.getMessage();
            return (message == null || message.length() == 0) ? new MTicketOrderCreationResult.GeneralError(message) : new MTicketOrderCreationResult.ServerError(message);
        } catch (Exception e2) {
            return new MTicketOrderCreationResult.GeneralError(e2.getMessage());
        }
    }
}
