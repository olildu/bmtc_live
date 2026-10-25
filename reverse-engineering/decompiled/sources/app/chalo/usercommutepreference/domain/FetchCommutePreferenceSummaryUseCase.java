package app.chalo.usercommutepreference.domain;

import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel;
import app.chalo.usercommutepreference.data.remote.exception.GetProfileSummaryException;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase;", "", "FetchSummaryErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCommutePreferenceSummaryUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10283a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final PremiumBusUserSurveyPreferenceRepository d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "", "UserNotLoggedIn", "InvalidCity", "NoData", "LocalError", "ParseError", "UnknownError", "CommutePreferenceFetchFailed", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FetchSummaryErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10284a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommutePreferenceFetchFailed extends FetchSummaryErrorType {
            public final String b;

            public CommutePreferenceFetchFailed(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CommutePreferenceFetchFailed) && Intrinsics.d(this.b, ((CommutePreferenceFetchFailed) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("CommutePreferenceFetchFailed(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends FetchSummaryErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 1849057554;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends FetchSummaryErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoData extends FetchSummaryErrorType {
            public static final NoData b = new NoData("No data received from server");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoData);
            }

            public final int hashCode() {
                return -688223749;
            }

            public final String toString() {
                return "NoData";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends FetchSummaryErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends FetchSummaryErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/FetchCommutePreferenceSummaryUseCase$FetchSummaryErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends FetchSummaryErrorType {
            public static final UserNotLoggedIn b = new UserNotLoggedIn("User not logged in");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return 1599561343;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }

        public FetchSummaryErrorType(String str) {
            this.f10284a = str;
        }
    }

    public FetchCommutePreferenceSummaryUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, PremiumBusUserSurveyPreferenceRepository premiumBusUserSurveyPreferenceRepository) {
        this.f10283a = userCommutePreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = premiumBusUserSurveyPreferenceRepository;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5 A[Catch: Exception -> 0x003d, NetworkSuccessResponseParseException -> 0x0040, ChaloLocalException -> 0x0043, GetProfileSummaryException -> 0x0046, CancellationException -> 0x0049, PHI: r2 r3 r4
      0x00f5: PHI (r2v5 app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel) = 
      (r2v4 app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel)
      (r2v11 app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel)
     binds: [B:65:0x00f2, B:30:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r3v7 java.lang.String) = (r3v6 java.lang.String), (r3v11 java.lang.String) binds: [B:65:0x00f2, B:30:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x00f5: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v7 java.lang.String) binds: [B:65:0x00f2, B:30:0x0060] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {ChaloLocalException -> 0x0043, NetworkSuccessResponseParseException -> 0x0040, GetProfileSummaryException -> 0x0046, CancellationException -> 0x0049, Exception -> 0x003d, blocks: (B:15:0x0038, B:71:0x0108, B:30:0x0060, B:67:0x00f5, B:33:0x0071, B:64:0x00e4, B:36:0x007e, B:51:0x00af, B:53:0x00b3, B:55:0x00bb, B:57:0x00c9, B:60:0x00d0, B:73:0x010e, B:39:0x0085, B:41:0x008b, B:43:0x0091, B:45:0x0097, B:47:0x009f), top: B:84:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchCommutePreferenceSummaryUseCase$invoke$1 fetchCommutePreferenceSummaryUseCase$invoke$1;
        String strH;
        String str;
        String str2;
        String str3;
        UserCommutePreferenceAppModel userCommutePreferenceAppModel;
        List list;
        PremiumBusUserSurveyPreferenceRepository premiumBusUserSurveyPreferenceRepository;
        UserCommutePreferenceAppModel userCommutePreferenceAppModel2;
        if (continuationImpl instanceof FetchCommutePreferenceSummaryUseCase$invoke$1) {
            fetchCommutePreferenceSummaryUseCase$invoke$1 = (FetchCommutePreferenceSummaryUseCase$invoke$1) continuationImpl;
            int i = fetchCommutePreferenceSummaryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCommutePreferenceSummaryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCommutePreferenceSummaryUseCase$invoke$1 = new FetchCommutePreferenceSummaryUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchCommutePreferenceSummaryUseCase$invoke$1 = new FetchCommutePreferenceSummaryUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = fetchCommutePreferenceSummaryUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchCommutePreferenceSummaryUseCase$invoke$1.label;
        CityProvider cityProvider = this.c;
        FetchSummaryErrorType.UserNotLoggedIn userNotLoggedIn = FetchSummaryErrorType.UserNotLoggedIn.b;
        UserProfileDetailsProvider userProfileDetailsProvider = this.b;
        UserCommutePreferenceRepository userCommutePreferenceRepository = this.f10283a;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                String strM = userProfileDetailsProvider.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(userNotLoggedIn);
                }
                strH = cityProvider.h();
                if (strH == null) {
                    return new ChaloUseCaseResult.Failure(FetchSummaryErrorType.InvalidCity.b);
                }
                fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = strM;
                fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = strH;
                fetchCommutePreferenceSummaryUseCase$invoke$1.label = 1;
                Object objD = userCommutePreferenceRepository.d(strH, fetchCommutePreferenceSummaryUseCase$invoke$1);
                if (objD != coroutineSingletons) {
                    str = strM;
                    obj = objD;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                strH = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$1;
                str = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 == 2) {
                    userCommutePreferenceAppModel = (UserCommutePreferenceAppModel) fetchCommutePreferenceSummaryUseCase$invoke$1.L$2;
                    str2 = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$1;
                    str3 = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$0;
                    ResultKt.b(obj);
                    list = userCommutePreferenceAppModel.c;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = str3;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = str2;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = userCommutePreferenceAppModel;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.label = 3;
                    if (userCommutePreferenceRepository.h(list, str3, str2, fetchCommutePreferenceSummaryUseCase$invoke$1) == coroutineSingletons) {
                        premiumBusUserSurveyPreferenceRepository = this.d;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = userCommutePreferenceAppModel;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = null;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = null;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.label = 4;
                        if (premiumBusUserSurveyPreferenceRepository.c(str3, str2, userCommutePreferenceAppModel, fetchCommutePreferenceSummaryUseCase$invoke$1) != coroutineSingletons) {
                            userCommutePreferenceAppModel2 = userCommutePreferenceAppModel;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    userCommutePreferenceAppModel = (UserCommutePreferenceAppModel) fetchCommutePreferenceSummaryUseCase$invoke$1.L$2;
                    str2 = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$1;
                    str3 = (String) fetchCommutePreferenceSummaryUseCase$invoke$1.L$0;
                    ResultKt.b(obj);
                    premiumBusUserSurveyPreferenceRepository = this.d;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = userCommutePreferenceAppModel;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = null;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = null;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.label = 4;
                    if (premiumBusUserSurveyPreferenceRepository.c(str3, str2, userCommutePreferenceAppModel, fetchCommutePreferenceSummaryUseCase$invoke$1) != coroutineSingletons) {
                        userCommutePreferenceAppModel2 = userCommutePreferenceAppModel;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                userCommutePreferenceAppModel2 = (UserCommutePreferenceAppModel) fetchCommutePreferenceSummaryUseCase$invoke$1.L$0;
                ResultKt.b(obj);
            }
            return new ChaloUseCaseResult.Success(userCommutePreferenceAppModel2);
            UserCommutePreferenceAppModel userCommutePreferenceAppModel3 = (UserCommutePreferenceAppModel) obj;
            if (userCommutePreferenceAppModel3 == null) {
                return new ChaloUseCaseResult.Failure(FetchSummaryErrorType.NoData.b);
            }
            String strM2 = userProfileDetailsProvider.m();
            String strH2 = cityProvider.h();
            if (Intrinsics.d(strM2, str) && Intrinsics.d(strH2, strH)) {
                List list2 = userCommutePreferenceAppModel3.f10247a;
                fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = str;
                fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = strH;
                fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = userCommutePreferenceAppModel3;
                fetchCommutePreferenceSummaryUseCase$invoke$1.label = 2;
                if (userCommutePreferenceRepository.f(list2, str, strH, fetchCommutePreferenceSummaryUseCase$invoke$1) != coroutineSingletons) {
                    str2 = strH;
                    str3 = str;
                    userCommutePreferenceAppModel = userCommutePreferenceAppModel3;
                    list = userCommutePreferenceAppModel.c;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = str3;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = str2;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = userCommutePreferenceAppModel;
                    fetchCommutePreferenceSummaryUseCase$invoke$1.label = 3;
                    if (userCommutePreferenceRepository.h(list, str3, str2, fetchCommutePreferenceSummaryUseCase$invoke$1) == coroutineSingletons) {
                        premiumBusUserSurveyPreferenceRepository = this.d;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$0 = userCommutePreferenceAppModel;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$1 = null;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.L$2 = null;
                        fetchCommutePreferenceSummaryUseCase$invoke$1.label = 4;
                        if (premiumBusUserSurveyPreferenceRepository.c(str3, str2, userCommutePreferenceAppModel, fetchCommutePreferenceSummaryUseCase$invoke$1) != coroutineSingletons) {
                            userCommutePreferenceAppModel2 = userCommutePreferenceAppModel;
                            return new ChaloUseCaseResult.Success(userCommutePreferenceAppModel2);
                        }
                    }
                }
                return coroutineSingletons;
            }
            return new ChaloUseCaseResult.Failure(userNotLoggedIn);
        } catch (ChaloLocalException e) {
            return new ChaloUseCaseResult.Failure(new FetchSummaryErrorType.LocalError(e.getMessage()));
        } catch (NetworkSuccessResponseParseException e2) {
            return new ChaloUseCaseResult.Failure(new FetchSummaryErrorType.ParseError(e2.getMessage()));
        } catch (GetProfileSummaryException e3) {
            return new ChaloUseCaseResult.Failure(new FetchSummaryErrorType.CommutePreferenceFetchFailed(e3.getMessage()));
        } catch (CancellationException e4) {
            throw e4;
        } catch (Exception e5) {
            return new ChaloUseCaseResult.Failure(new FetchSummaryErrorType.UnknownError(e5.getMessage()));
        }
    }
}
