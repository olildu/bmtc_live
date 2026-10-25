package app.chalo.usercommutepreference.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase;", "", "AddStopPlaceErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddCommutePreferenceStopPlaceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10272a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final FetchCommutePreferenceSummaryUseCase d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "", "UserNotLoggedIn", "InvalidCity", "NoData", "InvalidDataErrorStop", "AddStopPlaceFailed", "CommutePreferenceFetchFailed", "LocalErrorStop", "ParseErrorStop", "UnknownErrorStop", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$AddStopPlaceFailed;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$InvalidDataErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$LocalErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$ParseErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$UnknownErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AddStopPlaceErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10273a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$AddStopPlaceFailed;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddStopPlaceFailed extends AddStopPlaceErrorType {
            public final String b;

            public AddStopPlaceFailed(String str) {
                super("Add stop place failed");
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddStopPlaceFailed) && Intrinsics.d(this.b, ((AddStopPlaceFailed) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("AddStopPlaceFailed(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$CommutePreferenceFetchFailed;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CommutePreferenceFetchFailed extends AddStopPlaceErrorType {
            public static final CommutePreferenceFetchFailed b = new CommutePreferenceFetchFailed("Failed to fetch commute preference");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CommutePreferenceFetchFailed);
            }

            public final int hashCode() {
                return 1023725456;
            }

            public final String toString() {
                return "CommutePreferenceFetchFailed";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends AddStopPlaceErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 509239156;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$InvalidDataErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataErrorStop extends AddStopPlaceErrorType {
            public static final InvalidDataErrorStop b = new InvalidDataErrorStop("Invalid data error");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataErrorStop);
            }

            public final int hashCode() {
                return -1370411593;
            }

            public final String toString() {
                return "InvalidDataErrorStop";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$LocalErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalErrorStop extends AddStopPlaceErrorType {
            public final String b;

            public LocalErrorStop(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalErrorStop) && Intrinsics.d(this.b, ((LocalErrorStop) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalErrorStop(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$NoData;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoData extends AddStopPlaceErrorType {
            public static final NoData b = new NoData("No data received from server");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NoData);
            }

            public final int hashCode() {
                return 1480955481;
            }

            public final String toString() {
                return "NoData";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$ParseErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseErrorStop extends AddStopPlaceErrorType {
            public final String b;

            public ParseErrorStop(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ParseErrorStop) && Intrinsics.d(this.b, ((ParseErrorStop) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ParseErrorStop(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$UnknownErrorStop;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownErrorStop extends AddStopPlaceErrorType {
            public final String b;

            public UnknownErrorStop(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownErrorStop) && Intrinsics.d(this.b, ((UnknownErrorStop) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownErrorStop(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/AddCommutePreferenceStopPlaceUseCase$AddStopPlaceErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends AddStopPlaceErrorType {
            public static final UserNotLoggedIn b = new UserNotLoggedIn("User not logged in");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return 1186028513;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }

        public AddStopPlaceErrorType(String str) {
            this.f10273a = str;
        }
    }

    public AddCommutePreferenceStopPlaceUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase) {
        this.f10272a = userCommutePreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = fetchCommutePreferenceSummaryUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r8 == r1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usercommutepreference.domain.AddCommutePreferenceStopPlaceUseCase.a(app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
