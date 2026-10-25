package app.chalo.citydata.domain;

import app.chalo.citydata.data.error.CityDataRemoteException;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.data.model.app.request.StopImagesRequestAppModel;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchStopImagesUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchStopImagesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f1756a;
    public final CityDataRepository b;

    public FetchStopImagesUseCase(CityProvider cityProvider, CityDataRepository cityDataRepository) {
        this.f1756a = cityProvider;
        this.b = cityDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        FetchStopImagesUseCase$invoke$1 fetchStopImagesUseCase$invoke$1;
        ChaloUseCaseResult.Failure failure;
        if (continuationImpl instanceof FetchStopImagesUseCase$invoke$1) {
            fetchStopImagesUseCase$invoke$1 = (FetchStopImagesUseCase$invoke$1) continuationImpl;
            int i = fetchStopImagesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchStopImagesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchStopImagesUseCase$invoke$1 = new FetchStopImagesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchStopImagesUseCase$invoke$1 = new FetchStopImagesUseCase$invoke$1(this, continuationImpl);
        }
        Object objQ = fetchStopImagesUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchStopImagesUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objQ);
                String strB = CityProviderKt.b(this.f1756a);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(StopImageFetchErrorType.CityUnavailable.f1771a);
                }
                String lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                StopImagesRequestAppModel stopImagesRequestAppModel = new StopImagesRequestAppModel(lowerCase, str, list);
                CityDataRepository cityDataRepository = this.b;
                fetchStopImagesUseCase$invoke$1.label = 1;
                objQ = cityDataRepository.q(stopImagesRequestAppModel, fetchStopImagesUseCase$invoke$1);
                if (objQ == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objQ);
            }
            return new ChaloUseCaseResult.Success((List) objQ);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                String message = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopImageFetchErrorType.Remote(new RemoteDataErrorType.Local(message != null ? message : "Something went wrong")));
            } else if (e instanceof CityDataRemoteException) {
                String message2 = e.getMessage();
                CityDataRemoteException cityDataRemoteException = (CityDataRemoteException) e;
                GenericChaloErrorResponse errorResponse = cityDataRemoteException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message2, " code: ");
                GenericChaloErrorResponse errorResponse2 = cityDataRemoteException.getErrorResponse();
                failure = new ChaloUseCaseResult.Failure(new StopImageFetchErrorType.Remote(new RemoteDataErrorType.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null)));
            } else if (e instanceof NetworkSuccessResponseParseException) {
                String message3 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopImageFetchErrorType.Remote(new RemoteDataErrorType.ResponseParsing(message3 != null ? message3 : "Something went wrong")));
            } else {
                String message4 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new StopImageFetchErrorType.Remote(new RemoteDataErrorType.Unknown(message4 != null ? message4 : "Something went wrong")));
            }
            return failure;
        }
    }
}
