package app.chalo.home.domain;

import app.chalo.home.data.exceptions.FetchBannerException;
import app.chalo.home.data.exceptions.FetchBannerInvalidDataException;
import app.chalo.home.data.model.app.response.BannerRequestType;
import app.chalo.home.data.model.app.response.FetchBannerResponseAppModel;
import app.chalo.home.data.repository.PremiumBusRemoteRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase;", "", "FetchBannerErrorType", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchBannerUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRemoteRepository f2990a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$Companion;", "", "", "KEY_USER_ID", "Ljava/lang/String;", "KEY_CITY", "KEY_BANNER_TYPE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "", "UserNotLoggedIn", "InvalidCity", "InvalidDataError", "ServerError", "LocalError", "ParseError", "UnknownError", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$InvalidCity;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$InvalidDataError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$LocalError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$ParseError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$ServerError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$UnknownError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FetchBannerErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2991a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$InvalidCity;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends FetchBannerErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return -1194001866;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$InvalidDataError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends FetchBannerErrorType {
            public static final InvalidDataError b = new InvalidDataError("Invalid data error");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataError);
            }

            public final int hashCode() {
                return -744123757;
            }

            public final String toString() {
                return "InvalidDataError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$LocalError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends FetchBannerErrorType {
            public final String b;

            public LocalError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalError) && Intrinsics.d(this.b, ((LocalError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$ParseError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends FetchBannerErrorType {
            public final String b;

            public ParseError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ParseError) && Intrinsics.d(this.b, ((ParseError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ParseError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$ServerError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServerError extends FetchBannerErrorType {
            public final String b;

            public ServerError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServerError) && Intrinsics.d(this.b, ((ServerError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ServerError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$UnknownError;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends FetchBannerErrorType {
            public final String b;

            public UnknownError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.b, ((UnknownError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType$UserNotLoggedIn;", "Lapp/chalo/home/domain/FetchBannerUseCase$FetchBannerErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends FetchBannerErrorType {
            public static final UserNotLoggedIn b = new UserNotLoggedIn("User not logged in");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return -1728264797;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }

        public FetchBannerErrorType(String str) {
            this.f2991a = str;
        }
    }

    public FetchBannerUseCase(PremiumBusRemoteRepository premiumBusRemoteRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f2990a = premiumBusRemoteRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BannerRequestType bannerRequestType, Map map, ContinuationImpl continuationImpl) {
        FetchBannerUseCase$invoke$1 fetchBannerUseCase$invoke$1;
        String message;
        if (continuationImpl instanceof FetchBannerUseCase$invoke$1) {
            fetchBannerUseCase$invoke$1 = (FetchBannerUseCase$invoke$1) continuationImpl;
            int i = fetchBannerUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchBannerUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchBannerUseCase$invoke$1 = new FetchBannerUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchBannerUseCase$invoke$1 = new FetchBannerUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = fetchBannerUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchBannerUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                String strM = this.b.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(FetchBannerErrorType.UserNotLoggedIn.b);
                }
                String strB = CityProviderKt.b(this.c);
                if (strB == null) {
                    return new ChaloUseCaseResult.Failure(FetchBannerErrorType.InvalidCity.b);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("userId", strM);
                linkedHashMap.put("city", strB);
                linkedHashMap.put("bannerType", bannerRequestType.getType());
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                PremiumBusRemoteRepository premiumBusRemoteRepository = this.f2990a;
                fetchBannerUseCase$invoke$1.label = 1;
                objC = premiumBusRemoteRepository.c(linkedHashMap, fetchBannerUseCase$invoke$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return new ChaloUseCaseResult.Success((FetchBannerResponseAppModel) objC);
        } catch (FetchBannerException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            if (errorResponse == null || (message = errorResponse.b) == null) {
                message = e.getMessage();
            }
            return new ChaloUseCaseResult.Failure(new FetchBannerErrorType.ServerError(message));
        } catch (FetchBannerInvalidDataException unused) {
            return new ChaloUseCaseResult.Failure(FetchBannerErrorType.InvalidDataError.b);
        } catch (ChaloLocalException e2) {
            return new ChaloUseCaseResult.Failure(new FetchBannerErrorType.LocalError(e2.getMessage()));
        } catch (NetworkSuccessResponseParseException e3) {
            return new ChaloUseCaseResult.Failure(new FetchBannerErrorType.ParseError(e3.getMessage()));
        } catch (Exception e4) {
            return new ChaloUseCaseResult.Failure(new FetchBannerErrorType.UnknownError(e4.getMessage()));
        }
    }
}
