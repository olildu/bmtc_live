package app.chalo.multimodalticket.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.instantticket.data.exception.InvalidFareResponseDataException;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareRequestAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareResponseAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModelKt;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/FetchGroupTicketBookingFareDetailsUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchGroupTicketBookingFareDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketRepository f5882a;
    public final CityProvider b;
    public final CrashlyticsLogger c;

    public FetchGroupTicketBookingFareDetailsUseCase(MultiModalGroupTicketRepository multiModalGroupTicketRepository, CityProvider cityProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f5882a = multiModalGroupTicketRepository;
        this.b = cityProvider;
        this.c = crashlyticsLogger;
    }

    public static GroupTicketBookingFareRequestAppModel a(String str, String str2, List list) throws GroupTicketAppModelCreationFailure {
        if (StringsKt.F(str2)) {
            throw new GroupTicketAppModelCreationFailure("Blank journeyConfigId while building group-ticket fare request.");
        }
        if (list.isEmpty()) {
            throw new GroupTicketAppModelCreationFailure("Empty selectable step list while building group-ticket fare request.");
        }
        List listV0 = CollectionsKt.v0(new FetchGroupTicketBookingFareDetailsUseCase$buildRequestAppModel$$inlined$sortedBy$1(), list);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listV0, 10));
        Iterator it = listV0.iterator();
        while (it.hasNext()) {
            arrayList.add(GroupTicketSelectableStepAppModelKt.b((GroupTicketSelectableStepAppModel) it.next()));
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return new GroupTicketBookingFareRequestAppModel(lowerCase, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, List list, ContinuationImpl continuationImpl) {
        FetchGroupTicketBookingFareDetailsUseCase$invoke$1 fetchGroupTicketBookingFareDetailsUseCase$invoke$1;
        if (continuationImpl instanceof FetchGroupTicketBookingFareDetailsUseCase$invoke$1) {
            fetchGroupTicketBookingFareDetailsUseCase$invoke$1 = (FetchGroupTicketBookingFareDetailsUseCase$invoke$1) continuationImpl;
            int i = fetchGroupTicketBookingFareDetailsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchGroupTicketBookingFareDetailsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchGroupTicketBookingFareDetailsUseCase$invoke$1 = new FetchGroupTicketBookingFareDetailsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchGroupTicketBookingFareDetailsUseCase$invoke$1 = new FetchGroupTicketBookingFareDetailsUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = fetchGroupTicketBookingFareDetailsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchGroupTicketBookingFareDetailsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                String strB = CityProviderKt.b(this.b);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.UnavailableCityDetails.b);
                }
                GroupTicketBookingFareRequestAppModel groupTicketBookingFareRequestAppModelA = a(strB, str, list);
                MultiModalGroupTicketRepository multiModalGroupTicketRepository = this.f5882a;
                fetchGroupTicketBookingFareDetailsUseCase$invoke$1.label = 1;
                objE = multiModalGroupTicketRepository.e(groupTicketBookingFareRequestAppModelA, fetchGroupTicketBookingFareDetailsUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objE);
            }
            return new ChaloUseCaseResult.Success((GroupTicketBookingFareResponseAppModel) objE);
        } catch (ChaloLocalException.RequestCancelledException e) {
            throw new CancellationException(e.getMessage());
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            this.c.i(e3);
            if (e3 instanceof ChaloLocalException) {
                return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Local(e3.getMessage()));
            }
            if (!(e3 instanceof ProductBookingRemoteDataException)) {
                if (e3 instanceof NetworkSuccessResponseParseException) {
                    return new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.ResponseParsing.b);
                }
                return ((e3 instanceof GroupTicketAppModelCreationFailure) || (e3 instanceof InvalidFareResponseDataException)) ? new ChaloUseCaseResult.Failure(ProductBookingDataSourceError.InvalidData.b) : new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.Unknown(e3.getMessage()));
            }
            String message = e3.getMessage();
            ProductBookingRemoteDataException productBookingRemoteDataException = (ProductBookingRemoteDataException) e3;
            GenericChaloErrorResponse errorResponse = productBookingRemoteDataException.getErrorResponse();
            String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message, " code: ");
            GenericChaloErrorResponse errorResponse2 = productBookingRemoteDataException.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new ProductBookingDataSourceError.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
        }
    }
}
