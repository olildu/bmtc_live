package app.chalo.usercommutepreference.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.mappers.UserCommutePreferenceApiResponseToAppModelMapperKt;
import app.chalo.usercommutepreference.data.models.app.CreateRideResponseAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.remote.exception.CreateSavedRideException;
import app.chalo.usercommutepreference.data.remote.request.SaveRideRequestApiModel;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase;", "", "AddRideErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SaveOrEditRideUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10292a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final FetchCommutePreferenceSummaryUseCase d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "", "UserNotLoggedIn", "InvalidCity", "NoData", "InvalidDataError", "CommutePreferenceFetchFailed", "LocalError", "ParseError", "UnknownError", "RideNotFound", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$InvalidDataError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$RideNotFound;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AddRideErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10293a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommutePreferenceFetchFailed extends AddRideErrorType {
            public static final CommutePreferenceFetchFailed b = new CommutePreferenceFetchFailed("Failed to fetch commute preference summary");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CommutePreferenceFetchFailed);
            }

            public final int hashCode() {
                return -1299328732;
            }

            public final String toString() {
                return "CommutePreferenceFetchFailed";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends AddRideErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 2030973792;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$InvalidDataError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends AddRideErrorType {
            public static final InvalidDataError b = new InvalidDataError("Invalid data error");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataError);
            }

            public final int hashCode() {
                return -621575255;
            }

            public final String toString() {
                return "InvalidDataError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends AddRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoData extends AddRideErrorType {
            public static final NoData b = new NoData("No data received from server");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoData);
            }

            public final int hashCode() {
                return -1302331667;
            }

            public final String toString() {
                return "NoData";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends AddRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$RideNotFound;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RideNotFound extends AddRideErrorType {
            public final String b;

            public RideNotFound(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RideNotFound) && Intrinsics.d(this.b, ((RideNotFound) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("RideNotFound(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends AddRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/SaveOrEditRideUseCase$AddRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends AddRideErrorType {
            public static final UserNotLoggedIn b = new UserNotLoggedIn("User not logged in");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return -1170122291;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }

        public AddRideErrorType(String str) {
            this.f10293a = str;
        }
    }

    public SaveOrEditRideUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase) {
        this.f10292a = userCommutePreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = fetchCommutePreferenceSummaryUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c8 A[Catch: Exception -> 0x004b, NetworkSuccessResponseParseException -> 0x004e, ChaloLocalException -> 0x0051, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, TryCatch #2 {ChaloLocalException -> 0x0051, NetworkSuccessResponseParseException -> 0x004e, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, Exception -> 0x004b, blocks: (B:17:0x0046, B:53:0x00c2, B:55:0x00c8, B:57:0x00ce, B:59:0x00d2, B:61:0x00d8, B:62:0x00dd, B:28:0x005a, B:42:0x009e, B:44:0x00a3, B:46:0x00ab, B:48:0x00af, B:50:0x00b7, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008a, B:39:0x0092), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce A[Catch: Exception -> 0x004b, NetworkSuccessResponseParseException -> 0x004e, ChaloLocalException -> 0x0051, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, TryCatch #2 {ChaloLocalException -> 0x0051, NetworkSuccessResponseParseException -> 0x004e, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, Exception -> 0x004b, blocks: (B:17:0x0046, B:53:0x00c2, B:55:0x00c8, B:57:0x00ce, B:59:0x00d2, B:61:0x00d8, B:62:0x00dd, B:28:0x005a, B:42:0x009e, B:44:0x00a3, B:46:0x00ab, B:48:0x00af, B:50:0x00b7, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008a, B:39:0x0092), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2 A[Catch: Exception -> 0x004b, NetworkSuccessResponseParseException -> 0x004e, ChaloLocalException -> 0x0051, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, TryCatch #2 {ChaloLocalException -> 0x0051, NetworkSuccessResponseParseException -> 0x004e, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, Exception -> 0x004b, blocks: (B:17:0x0046, B:53:0x00c2, B:55:0x00c8, B:57:0x00ce, B:59:0x00d2, B:61:0x00d8, B:62:0x00dd, B:28:0x005a, B:42:0x009e, B:44:0x00a3, B:46:0x00ab, B:48:0x00af, B:50:0x00b7, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008a, B:39:0x0092), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8 A[Catch: Exception -> 0x004b, NetworkSuccessResponseParseException -> 0x004e, ChaloLocalException -> 0x0051, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, TryCatch #2 {ChaloLocalException -> 0x0051, NetworkSuccessResponseParseException -> 0x004e, CreateSavedRideException -> 0x0054, CancellationException -> 0x0057, Exception -> 0x004b, blocks: (B:17:0x0046, B:53:0x00c2, B:55:0x00c8, B:57:0x00ce, B:59:0x00d2, B:61:0x00d8, B:62:0x00dd, B:28:0x005a, B:42:0x009e, B:44:0x00a3, B:46:0x00ab, B:48:0x00af, B:50:0x00b7, B:31:0x0072, B:33:0x007a, B:35:0x0082, B:37:0x008a, B:39:0x0092), top: B:92:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel, UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2, long j, ContinuationImpl continuationImpl) {
        SaveOrEditRideUseCase$invoke$1 saveOrEditRideUseCase$invoke$1;
        CreateSavedRideException createSavedRideException;
        CreateRideResponseAppModel createRideResponseAppModel;
        ChaloUseCaseResult chaloUseCaseResult;
        if (continuationImpl instanceof SaveOrEditRideUseCase$invoke$1) {
            saveOrEditRideUseCase$invoke$1 = (SaveOrEditRideUseCase$invoke$1) continuationImpl;
            int i = saveOrEditRideUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                saveOrEditRideUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                saveOrEditRideUseCase$invoke$1 = new SaveOrEditRideUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            saveOrEditRideUseCase$invoke$1 = new SaveOrEditRideUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = saveOrEditRideUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = saveOrEditRideUseCase$invoke$1.label;
        AddRideErrorType.CommutePreferenceFetchFailed commutePreferenceFetchFailed = AddRideErrorType.CommutePreferenceFetchFailed.b;
        FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase = this.d;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                SaveRideRequestApiModel saveRideRequestApiModel = new SaveRideRequestApiModel(str, UserCommutePreferenceApiResponseToAppModelMapperKt.d(userCommutePreferencePlaceLocationAppModel), UserCommutePreferenceApiResponseToAppModelMapperKt.d(userCommutePreferencePlaceLocationAppModel2), j);
                if (this.b.m() == null) {
                    return new ChaloUseCaseResult.Failure(AddRideErrorType.UserNotLoggedIn.b);
                }
                String strH = this.c.h();
                if (strH == null) {
                    return new ChaloUseCaseResult.Failure(AddRideErrorType.InvalidCity.b);
                }
                UserCommutePreferenceRepository userCommutePreferenceRepository = this.f10292a;
                saveOrEditRideUseCase$invoke$1.label = 1;
                objE = userCommutePreferenceRepository.e(saveRideRequestApiModel, strH, saveOrEditRideUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                ResultKt.b(objE);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createSavedRideException = (CreateSavedRideException) saveOrEditRideUseCase$invoke$1.L$0;
                    ResultKt.b(objE);
                    ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) objE;
                    if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
                        return new ChaloUseCaseResult.Failure(commutePreferenceFetchFailed);
                    }
                    if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
                        return new ChaloUseCaseResult.Failure(new AddRideErrorType.RideNotFound(createSavedRideException.getErrorResponse().b));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                createRideResponseAppModel = (CreateRideResponseAppModel) saveOrEditRideUseCase$invoke$1.L$0;
                ResultKt.b(objE);
            }
            chaloUseCaseResult = (ChaloUseCaseResult) objE;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return new ChaloUseCaseResult.Failure(commutePreferenceFetchFailed);
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                return new ChaloUseCaseResult.Success(createRideResponseAppModel);
            }
            throw new NoWhenBranchMatchedException();
            createRideResponseAppModel = (CreateRideResponseAppModel) objE;
            if (createRideResponseAppModel == null) {
                return new ChaloUseCaseResult.Failure(AddRideErrorType.NoData.b);
            }
            if (!createRideResponseAppModel.f10242a) {
                return new ChaloUseCaseResult.Failure(AddRideErrorType.InvalidDataError.b);
            }
            saveOrEditRideUseCase$invoke$1.L$0 = createRideResponseAppModel;
            saveOrEditRideUseCase$invoke$1.label = 2;
            objE = fetchCommutePreferenceSummaryUseCase.a(saveOrEditRideUseCase$invoke$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloUseCaseResult = (ChaloUseCaseResult) objE;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return new ChaloUseCaseResult.Failure(commutePreferenceFetchFailed);
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                return new ChaloUseCaseResult.Success(createRideResponseAppModel);
            }
            throw new NoWhenBranchMatchedException();
        } catch (ChaloLocalException e) {
            return new ChaloUseCaseResult.Failure(new AddRideErrorType.LocalError(e.getMessage()));
        } catch (NetworkSuccessResponseParseException e2) {
            return new ChaloUseCaseResult.Failure(new AddRideErrorType.ParseError(e2.getMessage()));
        } catch (CreateSavedRideException e3) {
            GenericChaloErrorResponse errorResponse = e3.getErrorResponse();
            if (errorResponse == null || errorResponse.f6497a != 3003) {
                GenericChaloErrorResponse errorResponse2 = e3.getErrorResponse();
                return new ChaloUseCaseResult.Failure(new AddRideErrorType.RideNotFound(errorResponse2 != null ? errorResponse2.b : null));
            }
            saveOrEditRideUseCase$invoke$1.L$0 = e3;
            saveOrEditRideUseCase$invoke$1.label = 3;
            Object objA = fetchCommutePreferenceSummaryUseCase.a(saveOrEditRideUseCase$invoke$1);
            if (objA != coroutineSingletons) {
                createSavedRideException = e3;
                objE = objA;
            }
            return coroutineSingletons;
        } catch (CancellationException e4) {
            throw e4;
        } catch (Exception e5) {
            return new ChaloUseCaseResult.Failure(new AddRideErrorType.UnknownError(e5.getMessage()));
        }
    }
}
