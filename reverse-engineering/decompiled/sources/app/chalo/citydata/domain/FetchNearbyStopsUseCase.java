package app.chalo.citydata.domain;

import app.chalo.citydata.data.error.CityDataRemoteException;
import app.chalo.citydata.data.error.RemoteDataErrorType;
import app.chalo.citydata.data.model.app.request.NearbyStopsToLocationRequestAppModel;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/FetchNearbyStopsUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchNearbyStopsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataRepository f1752a;
    public final StringProvider b;
    public final CityProvider c;

    public FetchNearbyStopsUseCase(CityDataRepository cityDataRepository, CityProvider cityProvider, StringProvider stringProvider) {
        this.f1752a = cityDataRepository;
        this.b = stringProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:61:0x0108  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(double d, double d2, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl) {
        FetchNearbyStopsUseCase$invoke$1 fetchNearbyStopsUseCase$invoke$1;
        String str;
        double d3;
        double d4;
        ChaloTransitMode chaloTransitMode2;
        String str2;
        String str3;
        String str4;
        ChaloUseCaseResult.Failure failure;
        String message;
        String message2;
        GenericChaloErrorResponse errorResponse;
        Integer num;
        String message3;
        String message4;
        if (continuationImpl instanceof FetchNearbyStopsUseCase$invoke$1) {
            fetchNearbyStopsUseCase$invoke$1 = (FetchNearbyStopsUseCase$invoke$1) continuationImpl;
            int i = fetchNearbyStopsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchNearbyStopsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchNearbyStopsUseCase$invoke$1 = new FetchNearbyStopsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchNearbyStopsUseCase$invoke$1 = new FetchNearbyStopsUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = fetchNearbyStopsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchNearbyStopsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                String strB = CityProviderKt.b(this.c);
                if (strB == null) {
                    strB = "";
                }
                str = strB;
                fetchNearbyStopsUseCase$invoke$1.L$0 = chaloTransitMode;
                fetchNearbyStopsUseCase$invoke$1.L$1 = str;
                d3 = d;
                fetchNearbyStopsUseCase$invoke$1.D$0 = d3;
                d4 = d2;
                fetchNearbyStopsUseCase$invoke$1.D$1 = d4;
                fetchNearbyStopsUseCase$invoke$1.label = 1;
                objB = this.b.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], fetchNearbyStopsUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    chaloTransitMode2 = chaloTransitMode;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) fetchNearbyStopsUseCase$invoke$1.L$0;
                try {
                    ResultKt.b(objB);
                    return new ChaloUseCaseResult.Success((List) objB);
                } catch (Exception e) {
                    e = e;
                    if (e instanceof ChaloLocalException) {
                        if (((ChaloLocalException) e) instanceof ChaloLocalException.NoInternetException) {
                            message4 = e.getMessage();
                            if (message4 != null) {
                                str4 = message4;
                            }
                            failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.NoInternet(str4));
                        } else {
                            message3 = e.getMessage();
                            if (message3 != null) {
                                str4 = message3;
                            }
                            failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.Local(str4));
                        }
                    } else if (e instanceof CityDataRemoteException) {
                        String message5 = e.getMessage();
                        CityDataRemoteException cityDataRemoteException = (CityDataRemoteException) e;
                        errorResponse = cityDataRemoteException.getErrorResponse();
                        if (errorResponse != null) {
                            num = new Integer(errorResponse.f6497a);
                        } else {
                            num = null;
                        }
                        String strC = dd.c(num, message5, " code: ");
                        GenericChaloErrorResponse errorResponse2 = cityDataRemoteException.getErrorResponse();
                        failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
                    } else if (e instanceof NetworkSuccessResponseParseException) {
                        message2 = e.getMessage();
                        if (message2 != null) {
                            str4 = message2;
                        }
                        failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.ResponseParsing(str4));
                    } else {
                        message = e.getMessage();
                        if (message != null) {
                            str4 = message;
                        }
                        failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.Unknown(str4));
                    }
                    return failure;
                }
            }
            double d5 = fetchNearbyStopsUseCase$invoke$1.D$1;
            d3 = fetchNearbyStopsUseCase$invoke$1.D$0;
            str = (String) fetchNearbyStopsUseCase$invoke$1.L$1;
            ChaloTransitMode chaloTransitMode3 = (ChaloTransitMode) fetchNearbyStopsUseCase$invoke$1.L$0;
            ResultKt.b(objB);
            chaloTransitMode2 = chaloTransitMode3;
            d4 = d5;
            NearbyStopsToLocationRequestAppModel nearbyStopsToLocationRequestAppModel = new NearbyStopsToLocationRequestAppModel(str2, d3, d4, chaloTransitMode2);
            CityDataRepository cityDataRepository = this.f1752a;
            fetchNearbyStopsUseCase$invoke$1.L$0 = str3;
            fetchNearbyStopsUseCase$invoke$1.L$1 = null;
            fetchNearbyStopsUseCase$invoke$1.label = 2;
            objB = cityDataRepository.j(nearbyStopsToLocationRequestAppModel, fetchNearbyStopsUseCase$invoke$1);
            if (objB != coroutineSingletons) {
                str4 = str3;
                return new ChaloUseCaseResult.Success((List) objB);
            }
            return coroutineSingletons;
        } catch (Exception e2) {
            e = e2;
            str4 = str3;
            if (e instanceof ChaloLocalException) {
                if (((ChaloLocalException) e) instanceof ChaloLocalException.NoInternetException) {
                    message4 = e.getMessage();
                    if (message4 != null) {
                        str4 = message4;
                    }
                    failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.NoInternet(str4));
                } else {
                    message3 = e.getMessage();
                    if (message3 != null) {
                        str4 = message3;
                    }
                    failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.Local(str4));
                }
            } else if (e instanceof CityDataRemoteException) {
                String message6 = e.getMessage();
                CityDataRemoteException cityDataRemoteException2 = (CityDataRemoteException) e;
                errorResponse = cityDataRemoteException2.getErrorResponse();
                if (errorResponse != null) {
                    num = new Integer(errorResponse.f6497a);
                } else {
                    num = null;
                }
                String strC2 = dd.c(num, message6, " code: ");
                GenericChaloErrorResponse errorResponse3 = cityDataRemoteException2.getErrorResponse();
                failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.API(strC2, errorResponse3 != null ? new Integer(errorResponse3.f6497a) : null));
            } else if (e instanceof NetworkSuccessResponseParseException) {
                message2 = e.getMessage();
                if (message2 != null) {
                    str4 = message2;
                }
                failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.ResponseParsing(str4));
            } else {
                message = e.getMessage();
                if (message != null) {
                    str4 = message;
                }
                failure = new ChaloUseCaseResult.Failure(new RemoteDataErrorType.Unknown(str4));
            }
            return failure;
        }
        str2 = str;
        str3 = (String) objB;
    }
}
