package app.chalo.multimodalticket.domain;

import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.PaymentProviderException;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCreateOrderRequestAppModelKt;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSummaryResponseAppModel;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.error.MultiModalGroupTicketOrderInvalidResponseException;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/CreateGroupTicketOrderUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateGroupTicketOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRepository f5881a;
    public final CityProvider b;

    public CreateGroupTicketOrderUseCase(MultiModalGroupTicketRepository multiModalGroupTicketRepository, CityProvider cityProvider) {
        this.f5881a = multiModalGroupTicketRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs, GroupTicketSummaryResponseAppModel groupTicketSummaryResponseAppModel, ContinuationImpl continuationImpl) throws Exception {
        CreateGroupTicketOrderUseCase$invoke$1 createGroupTicketOrderUseCase$invoke$1;
        if (continuationImpl instanceof CreateGroupTicketOrderUseCase$invoke$1) {
            createGroupTicketOrderUseCase$invoke$1 = (CreateGroupTicketOrderUseCase$invoke$1) continuationImpl;
            int i = createGroupTicketOrderUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createGroupTicketOrderUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createGroupTicketOrderUseCase$invoke$1 = new CreateGroupTicketOrderUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createGroupTicketOrderUseCase$invoke$1 = new CreateGroupTicketOrderUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = createGroupTicketOrderUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createGroupTicketOrderUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objG);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                long j = groupTicketSummaryResponseAppModel.f5871a;
                ArrayList arrayList = groupTicketSummaryResponseAppModel.b;
                int iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                if (iG < 16) {
                    iG = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModel = (GroupTicketLegFareDetailAppModel) obj;
                    Pair pair = new Pair(new Integer(groupTicketLegFareDetailAppModel.f5860a), new Long(groupTicketLegFareDetailAppModel.b.c));
                    linkedHashMap.put(pair.d(), pair.e());
                }
                GroupTicketCreateOrderRequestAppModel groupTicketCreateOrderRequestAppModelA = GroupTicketCreateOrderRequestAppModelKt.a(groupTicketBookingSummaryArgs, lowerCase, j, linkedHashMap);
                MultiModalGroupTicketRepository multiModalGroupTicketRepository = this.f5881a;
                createGroupTicketOrderUseCase$invoke$1.label = 1;
                objG = multiModalGroupTicketRepository.g(groupTicketCreateOrderRequestAppModelA, createGroupTicketOrderUseCase$invoke$1);
                if (objG == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objG);
            }
            return new ChaloUseCaseResult.Success((CreateOrderResponseAppModel) objG);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                if (e instanceof ChaloLocalException.RequestCancelledException) {
                    throw new CancellationException(e.getMessage());
                }
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e.getMessage()));
            }
            if (e instanceof ProductBookingRemoteDataException) {
                String message = e.getMessage();
                ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e;
                GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
                GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
            }
            boolean z = e instanceof PaymentProviderException;
            ProductBookingDataSourceError.InvalidData invalidData = ProductBookingDataSourceError.InvalidData.b;
            if (z) {
                return new ChaloUseCaseResult.Failure(invalidData);
            }
            if (e instanceof MultiModalGroupTicketOrderInvalidResponseException) {
                return new ChaloUseCaseResult.Failure(invalidData);
            }
            if (e instanceof NetworkSuccessResponseParseException) {
                return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b);
            }
            if (e instanceof CancellationException) {
                throw e;
            }
            return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e.getMessage()));
        }
    }
}
