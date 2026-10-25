package app.chalo.citydata.domain;

import app.chalo.citydata.data.error.CityDataRemoteException;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.data.model.app.request.StopDetailsRequestAppModel;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchStopDetailsUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchStopDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1755a;
    public final CityDataRepository b;

    public FetchStopDetailsUseCase(CityProvider cityProvider, CityDataRepository cityDataRepository) {
        this.f1755a = cityProvider;
        this.b = cityDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        FetchStopDetailsUseCase$invoke$1 fetchStopDetailsUseCase$invoke$1;
        ChaloUseCaseResult.Failure failure;
        if (continuationImpl instanceof FetchStopDetailsUseCase$invoke$1) {
            fetchStopDetailsUseCase$invoke$1 = (FetchStopDetailsUseCase$invoke$1) continuationImpl;
            int i = fetchStopDetailsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchStopDetailsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchStopDetailsUseCase$invoke$1 = new FetchStopDetailsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchStopDetailsUseCase$invoke$1 = new FetchStopDetailsUseCase$invoke$1(this, continuationImpl);
        }
        Object objN = fetchStopDetailsUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchStopDetailsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objN);
                String strB = CityProviderKt.b(this.f1755a);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(StopDetailsFetchErrorType.CityUnavailable.f1769a);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                StopDetailsRequestAppModel stopDetailsRequestAppModel = new StopDetailsRequestAppModel(lowerCase, str, list);
                CityDataRepository cityDataRepository = this.b;
                fetchStopDetailsUseCase$invoke$1.label = 1;
                objN = cityDataRepository.n(stopDetailsRequestAppModel, fetchStopDetailsUseCase$invoke$1);
                if (objN == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objN);
            }
            return new ChaloUseCaseResult.Success((List) objN);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                String message = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopDetailsFetchErrorType.Remote(new RemoteDataErrorType.Local(message != null ? message : "Something went wrong")));
            } else if (e instanceof CityDataRemoteException) {
                String message2 = e.getMessage();
                CityDataRemoteException cityDataRemoteException = (CityDataRemoteException) e;
                GenericChaloErrorResponse errorResponse = cityDataRemoteException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message2, " code: ");
                GenericChaloErrorResponse errorResponse2 = cityDataRemoteException.getErrorResponse();
                failure = new ChaloUseCaseResult.Failure(new StopDetailsFetchErrorType.Remote(new RemoteDataErrorType.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null)));
            } else if (e instanceof NetworkSuccessResponseParseException) {
                String message3 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopDetailsFetchErrorType.Remote(new RemoteDataErrorType.ResponseParsing(message3 != null ? message3 : "Something went wrong")));
            } else {
                String message4 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopDetailsFetchErrorType.Remote(new RemoteDataErrorType.Unknown(message4 != null ? message4 : "Something went wrong")));
            }
            return failure;
        }
    }
}
