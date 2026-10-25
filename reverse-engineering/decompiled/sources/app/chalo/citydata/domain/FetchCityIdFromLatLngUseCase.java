package app.chalo.citydata.domain;

import app.chalo.citydata.data.error.CityDataRemoteException;
import app.chalo.citydata.data.error.InvalidCityIdFromLatLngApiResponseException;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.data.CityIdAndNameFromLatLngResponseAppModel;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.location.LatLng;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchCityIdFromLatLngUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCityIdFromLatLngUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataRepository f1751a;
    public final GetDistinctIdUseCase b;
    public final LanguageFeature c;

    public FetchCityIdFromLatLngUseCase(CityDataRepository cityDataRepository, GetDistinctIdUseCase getDistinctIdUseCase, LanguageFeature languageFeature) {
        this.f1751a = cityDataRepository;
        this.b = getDistinctIdUseCase;
        this.c = languageFeature;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(LatLng latLng, ContinuationImpl continuationImpl) {
        FetchCityIdFromLatLngUseCase$invoke$1 fetchCityIdFromLatLngUseCase$invoke$1;
        ChaloUseCaseResult.Failure failure;
        String strName;
        if (continuationImpl instanceof FetchCityIdFromLatLngUseCase$invoke$1) {
            fetchCityIdFromLatLngUseCase$invoke$1 = (FetchCityIdFromLatLngUseCase$invoke$1) continuationImpl;
            int i = fetchCityIdFromLatLngUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCityIdFromLatLngUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCityIdFromLatLngUseCase$invoke$1 = new FetchCityIdFromLatLngUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchCityIdFromLatLngUseCase$invoke$1 = new FetchCityIdFromLatLngUseCase$invoke$1(this, continuationImpl);
        }
        Object objO = fetchCityIdFromLatLngUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchCityIdFromLatLngUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objO);
                CityDataRepository cityDataRepository = this.f1751a;
                String strA = this.b.a(false);
                Language language = (Language) this.c.h().getValue();
                if (language == null || (strName = language.name()) == null) {
                    strName = "ENGLISH";
                }
                fetchCityIdFromLatLngUseCase$invoke$1.label = 1;
                objO = cityDataRepository.o(strA, strName, latLng, fetchCityIdFromLatLngUseCase$invoke$1);
                if (objO == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objO);
            }
            CityIdAndNameFromLatLngResponseAppModel cityIdAndNameFromLatLngResponseAppModel = (CityIdAndNameFromLatLngResponseAppModel) objO;
            return cityIdAndNameFromLatLngResponseAppModel.f2341a.isEmpty() ? new ChaloUseCaseResult.Failure(FetchCityIdErrorType.CityUnavailable.f1749a) : new ChaloUseCaseResult.Success(CollectionsKt.F(cityIdAndNameFromLatLngResponseAppModel.f2341a));
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                String message = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new FetchCityIdErrorType.Remote(new RemoteDataErrorType.Local(message != null ? message : "Something went wrong")));
            } else if (e instanceof CityDataRemoteException) {
                String message2 = e.getMessage();
                CityDataRemoteException cityDataRemoteException = (CityDataRemoteException) e;
                GenericChaloErrorResponse errorResponse = cityDataRemoteException.getErrorResponse();
                String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message2, " code: ");
                GenericChaloErrorResponse errorResponse2 = cityDataRemoteException.getErrorResponse();
                failure = new ChaloUseCaseResult.Failure(new FetchCityIdErrorType.Remote(new RemoteDataErrorType.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null)));
            } else if (e instanceof NetworkSuccessResponseParseException) {
                String message3 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new FetchCityIdErrorType.Remote(new RemoteDataErrorType.ResponseParsing(message3 != null ? message3 : "Something went wrong")));
            } else if (e instanceof InvalidCityIdFromLatLngApiResponseException) {
                String message4 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new FetchCityIdErrorType.Remote(new RemoteDataErrorType.InvalidResponse(message4 != null ? message4 : "Something went wrong")));
            } else {
                String message5 = e.getMessage();
                failure = new ChaloUseCaseResult.Failure(new FetchCityIdErrorType.Remote(new RemoteDataErrorType.Unknown(message5 != null ? message5 : "Something went wrong")));
            }
            return failure;
        }
    }
}
