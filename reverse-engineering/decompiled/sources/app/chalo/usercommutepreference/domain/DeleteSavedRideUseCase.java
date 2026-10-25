package app.chalo.usercommutepreference.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase;", "", "DeleteRideErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteSavedRideUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10281a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final FetchCommutePreferenceSummaryUseCase d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "", "UserNotLoggedIn", "InvalidCity", "LocalError", "ParseError", "UnknownError", "InvalidDataError", "DeleteRideFailed", "CommutePreferenceFetchFailed", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$DeleteRideFailed;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$InvalidDataError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DeleteRideErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10282a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommutePreferenceFetchFailed extends DeleteRideErrorType {
            public static final CommutePreferenceFetchFailed b = new CommutePreferenceFetchFailed("Failed to fetch commute preference summary after deleting ride");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CommutePreferenceFetchFailed);
            }

            public final int hashCode() {
                return -413595854;
            }

            public final String toString() {
                return "CommutePreferenceFetchFailed";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$DeleteRideFailed;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DeleteRideFailed extends DeleteRideErrorType {
            public final String b;

            public DeleteRideFailed(String str) {
                super(str == null ? "Delete ride failed" : str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeleteRideFailed) && Intrinsics.d(this.b, ((DeleteRideFailed) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("DeleteRideFailed(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends DeleteRideErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return -564680814;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$InvalidDataError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends DeleteRideErrorType {
            public static final InvalidDataError b = new InvalidDataError("Invalid data error");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataError);
            }

            public final int hashCode() {
                return -1564156233;
            }

            public final String toString() {
                return "InvalidDataError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends DeleteRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$ParseError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends DeleteRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends DeleteRideErrorType {
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
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/DeleteSavedRideUseCase$DeleteRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends DeleteRideErrorType {
            public static final UserNotLoggedIn b = new UserNotLoggedIn("User not logged in");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return -1200528129;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }

        public DeleteRideErrorType(String str) {
            this.f10282a = str;
        }
    }

    public DeleteSavedRideUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase) {
        this.f10281a = userCommutePreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = fetchCommutePreferenceSummaryUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: Exception -> 0x0041, NetworkSuccessResponseParseException -> 0x0044, ChaloLocalException -> 0x0047, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, TryCatch #2 {ChaloLocalException -> 0x0047, NetworkSuccessResponseParseException -> 0x0044, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, Exception -> 0x0041, blocks: (B:16:0x003d, B:52:0x00a7, B:54:0x00ad, B:56:0x00b3, B:58:0x00b7, B:60:0x00bd, B:61:0x00c2, B:27:0x0050, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:47:0x0093, B:49:0x009e, B:30:0x0057, B:32:0x005f, B:34:0x0067, B:36:0x006f, B:38:0x0077), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3 A[Catch: Exception -> 0x0041, NetworkSuccessResponseParseException -> 0x0044, ChaloLocalException -> 0x0047, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, TryCatch #2 {ChaloLocalException -> 0x0047, NetworkSuccessResponseParseException -> 0x0044, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, Exception -> 0x0041, blocks: (B:16:0x003d, B:52:0x00a7, B:54:0x00ad, B:56:0x00b3, B:58:0x00b7, B:60:0x00bd, B:61:0x00c2, B:27:0x0050, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:47:0x0093, B:49:0x009e, B:30:0x0057, B:32:0x005f, B:34:0x0067, B:36:0x006f, B:38:0x0077), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7 A[Catch: Exception -> 0x0041, NetworkSuccessResponseParseException -> 0x0044, ChaloLocalException -> 0x0047, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, TryCatch #2 {ChaloLocalException -> 0x0047, NetworkSuccessResponseParseException -> 0x0044, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, Exception -> 0x0041, blocks: (B:16:0x003d, B:52:0x00a7, B:54:0x00ad, B:56:0x00b3, B:58:0x00b7, B:60:0x00bd, B:61:0x00c2, B:27:0x0050, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:47:0x0093, B:49:0x009e, B:30:0x0057, B:32:0x005f, B:34:0x0067, B:36:0x006f, B:38:0x0077), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd A[Catch: Exception -> 0x0041, NetworkSuccessResponseParseException -> 0x0044, ChaloLocalException -> 0x0047, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, TryCatch #2 {ChaloLocalException -> 0x0047, NetworkSuccessResponseParseException -> 0x0044, DeleteSavedRideException -> 0x004a, CancellationException -> 0x004d, Exception -> 0x0041, blocks: (B:16:0x003d, B:52:0x00a7, B:54:0x00ad, B:56:0x00b3, B:58:0x00b7, B:60:0x00bd, B:61:0x00c2, B:27:0x0050, B:41:0x0083, B:43:0x0087, B:45:0x008f, B:47:0x0093, B:49:0x009e, B:30:0x0057, B:32:0x005f, B:34:0x0067, B:36:0x006f, B:38:0x0077), top: B:89:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0102, code lost:
    
        if (r12 == r1) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usercommutepreference.domain.DeleteSavedRideUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
