package app.chalo.home.domain;

import app.chalo.home.data.exceptions.FetchBannerException;
import app.chalo.home.data.exceptions.PremiumBusContentConfigInvalidDataException;
import app.chalo.home.data.model.app.response.PremiumBusContentConfigAppResponseModel;
import app.chalo.home.data.repository.PremiumBusRemoteRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase;", "", "PremiumBusContentConfigErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusContentConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRemoteRepository f3056a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "", "UserNotLoggedIn", "InvalidCity", "InvalidDataError", "ServerError", "LocalError", "ParseError", "UnknownError", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$InvalidCity;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$InvalidDataError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$LocalError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$ParseError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$ServerError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$UnknownError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PremiumBusContentConfigErrorType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$InvalidCity;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidCity f3057a = new InvalidCity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 565197110;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$InvalidDataError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidDataError f3058a = new InvalidDataError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataError);
            }

            public final int hashCode() {
                return 1022997395;
            }

            public final String toString() {
                return "InvalidDataError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$LocalError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f3059a;

            public LocalError(String str) {
                this.f3059a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalError) && Intrinsics.d(this.f3059a, ((LocalError) obj).f3059a);
            }

            public final int hashCode() {
                String str = this.f3059a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.f3059a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$ParseError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f3060a;

            public ParseError(String str) {
                this.f3060a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ParseError) && Intrinsics.d(this.f3060a, ((ParseError) obj).f3060a);
            }

            public final int hashCode() {
                String str = this.f3060a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ParseError(message=", this.f3060a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$ServerError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServerError extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f3061a;

            public ServerError(String str) {
                this.f3061a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServerError) && Intrinsics.d(this.f3061a, ((ServerError) obj).f3061a);
            }

            public final int hashCode() {
                String str = this.f3061a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ServerError(message=", this.f3061a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$UnknownError;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends PremiumBusContentConfigErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f3062a;

            public UnknownError(String str) {
                this.f3062a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.f3062a, ((UnknownError) obj).f3062a);
            }

            public final int hashCode() {
                String str = this.f3062a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.f3062a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType$UserNotLoggedIn;", "Lapp/chalo/home/domain/PremiumBusContentConfigUseCase$PremiumBusContentConfigErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends PremiumBusContentConfigErrorType {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return -1809808221;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }
    }

    public PremiumBusContentConfigUseCase(PremiumBusRemoteRepository premiumBusRemoteRepository, CityProvider cityProvider) {
        this.f3056a = premiumBusRemoteRepository;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        PremiumBusContentConfigUseCase$invoke$1 premiumBusContentConfigUseCase$invoke$1;
        String message;
        if (continuationImpl instanceof PremiumBusContentConfigUseCase$invoke$1) {
            premiumBusContentConfigUseCase$invoke$1 = (PremiumBusContentConfigUseCase$invoke$1) continuationImpl;
            int i = premiumBusContentConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusContentConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusContentConfigUseCase$invoke$1 = new PremiumBusContentConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            premiumBusContentConfigUseCase$invoke$1 = new PremiumBusContentConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = premiumBusContentConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusContentConfigUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                String strB = CityProviderKt.b(this.b);
                if (strB != null && strB.length() != 0) {
                    PremiumBusRemoteRepository premiumBusRemoteRepository = this.f3056a;
                    premiumBusContentConfigUseCase$invoke$1.label = 1;
                    objA = premiumBusRemoteRepository.a(strB, premiumBusContentConfigUseCase$invoke$1);
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new ChaloUseCaseResult.Failure(PremiumBusContentConfigErrorType.InvalidCity.f3057a);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return new ChaloUseCaseResult.Success((PremiumBusContentConfigAppResponseModel) objA);
        } catch (FetchBannerException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            if (errorResponse == null || (message = errorResponse.b) == null) {
                message = e.getMessage();
            }
            return new ChaloUseCaseResult.Failure(new PremiumBusContentConfigErrorType.ServerError(message));
        } catch (PremiumBusContentConfigInvalidDataException unused) {
            return new ChaloUseCaseResult.Failure(PremiumBusContentConfigErrorType.InvalidDataError.f3058a);
        } catch (ChaloLocalException e2) {
            return new ChaloUseCaseResult.Failure(new PremiumBusContentConfigErrorType.LocalError(e2.getMessage()));
        } catch (NetworkSuccessResponseParseException e3) {
            return new ChaloUseCaseResult.Failure(new PremiumBusContentConfigErrorType.ParseError(e3.getMessage()));
        } catch (Exception e4) {
            return new ChaloUseCaseResult.Failure(new PremiumBusContentConfigErrorType.UnknownError(e4.getMessage()));
        }
    }
}
