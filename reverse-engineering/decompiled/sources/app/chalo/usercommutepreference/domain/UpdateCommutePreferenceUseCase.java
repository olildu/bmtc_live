package app.chalo.usercommutepreference.domain;

import app.chalo.chalobususerprofile.data.model.HomeWorkTimingModel;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.chalobususerprofile.data.model.TravelFrequencyModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.usercommutepreference.data.remote.request.SaveCommutePreferenceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.UserCommutePreferencePlaceLocationApiRequestModel;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase;", "", "UpdateCommutePreferenceError", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateCommutePreferenceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10295a;
    public final FetchCommutePreferenceSummaryUseCase b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "", "InvalidCity", "UpdateFailed", "LocalError", "ParseError", "UnknownError", "Companion", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$LocalError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$ParseError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$UnknownError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$UpdateFailed;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class UpdateCommutePreferenceError {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public static String a(UpdateCommutePreferenceError updateCommutePreferenceError) {
                Intrinsics.i(updateCommutePreferenceError, "<this>");
                if (updateCommutePreferenceError instanceof LocalError) {
                    String str = ((LocalError) updateCommutePreferenceError).f10297a;
                    return str == null ? "LocalError" : str;
                }
                if (updateCommutePreferenceError instanceof ParseError) {
                    String str2 = ((ParseError) updateCommutePreferenceError).f10298a;
                    return str2 == null ? "ParseError" : str2;
                }
                if (updateCommutePreferenceError instanceof UnknownError) {
                    String str3 = ((UnknownError) updateCommutePreferenceError).f10299a;
                    return str3 == null ? "UnknownError" : str3;
                }
                if (updateCommutePreferenceError.equals(InvalidCity.f10296a)) {
                    return "InvalidCity";
                }
                if (updateCommutePreferenceError.equals(UpdateFailed.f10300a)) {
                    return "UpdateFailed";
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends UpdateCommutePreferenceError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidCity f10296a = new InvalidCity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 1549446345;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$LocalError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends UpdateCommutePreferenceError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10297a;

            public LocalError(String str) {
                this.f10297a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalError) && Intrinsics.d(this.f10297a, ((LocalError) obj).f10297a);
            }

            public final int hashCode() {
                String str = this.f10297a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.f10297a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$ParseError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends UpdateCommutePreferenceError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10298a;

            public ParseError(String str) {
                this.f10298a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ParseError) && Intrinsics.d(this.f10298a, ((ParseError) obj).f10298a);
            }

            public final int hashCode() {
                String str = this.f10298a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ParseError(message=", this.f10298a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$UnknownError;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends UpdateCommutePreferenceError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10299a;

            public UnknownError(String str) {
                this.f10299a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.f10299a, ((UnknownError) obj).f10299a);
            }

            public final int hashCode() {
                String str = this.f10299a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.f10299a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError$UpdateFailed;", "Lapp/chalo/usercommutepreference/domain/UpdateCommutePreferenceUseCase$UpdateCommutePreferenceError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateFailed extends UpdateCommutePreferenceError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdateFailed f10300a = new UpdateFailed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UpdateFailed);
            }

            public final int hashCode() {
                return -1043081601;
            }

            public final String toString() {
                return "UpdateFailed";
            }
        }
    }

    public UpdateCommutePreferenceUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase, CityProvider cityProvider) {
        this.f10295a = userCommutePreferenceRepository;
        this.b = fetchCommutePreferenceSummaryUseCase;
        this.c = cityProvider;
    }

    public static SaveCommutePreferenceRequestApiModel a(PBUserProfileSurveyPreference pBUserProfileSurveyPreference) {
        SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel;
        SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel2;
        TimingVariability timingVariability;
        TimingVariability timingVariability2;
        RecentPlaceAppModel recentPlaceAppModel = pBUserProfileSurveyPreference.f1196a;
        HomeWorkTimingModel homeWorkTimingModel = pBUserProfileSurveyPreference.c;
        Long lValueOf = null;
        if (recentPlaceAppModel != null) {
            String str = recentPlaceAppModel.e;
            String str2 = recentPlaceAppModel.i;
            LatLng latLng = recentPlaceAppModel.j;
            saveStopPlaceRequestApiModel = new SaveStopPlaceRequestApiModel("HOME", "HOME", new UserCommutePreferencePlaceLocationApiRequestModel(str, str2, latLng.f5134a, latLng.b, recentPlaceAppModel.f));
        } else {
            saveStopPlaceRequestApiModel = null;
        }
        RecentPlaceAppModel recentPlaceAppModel2 = pBUserProfileSurveyPreference.b;
        if (recentPlaceAppModel2 != null) {
            String str3 = recentPlaceAppModel2.e;
            String str4 = recentPlaceAppModel2.i;
            LatLng latLng2 = recentPlaceAppModel2.j;
            saveStopPlaceRequestApiModel2 = new SaveStopPlaceRequestApiModel("WORK", "WORK", new UserCommutePreferencePlaceLocationApiRequestModel(str3, str4, latLng2.f5134a, latLng2.b, recentPlaceAppModel2.f));
        } else {
            saveStopPlaceRequestApiModel2 = null;
        }
        TravelFrequencyModel travelFrequencyModel = pBUserProfileSurveyPreference.d;
        String str5 = travelFrequencyModel != null ? travelFrequencyModel.f1200a : null;
        Long lValueOf2 = homeWorkTimingModel != null ? Long.valueOf(homeWorkTimingModel.c) : null;
        Long lValueOf3 = (homeWorkTimingModel == null || (timingVariability2 = homeWorkTimingModel.d) == null) ? null : Long.valueOf(timingVariability2.getTime());
        Long lValueOf4 = homeWorkTimingModel != null ? Long.valueOf(homeWorkTimingModel.f1194a) : null;
        if (homeWorkTimingModel != null && (timingVariability = homeWorkTimingModel.b) != null) {
            lValueOf = Long.valueOf(timingVariability.getTime());
        }
        return new SaveCommutePreferenceRequestApiModel(saveStopPlaceRequestApiModel, saveStopPlaceRequestApiModel2, lValueOf4, lValueOf, lValueOf2, lValueOf3, str5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r8 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usercommutepreference.domain.UpdateCommutePreferenceUseCase.b(app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
