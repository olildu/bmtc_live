package app.chalo.usercommutepreference.domain;

import app.chalo.network.exception.ChaloLocalException;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase;", "", "FetchRideErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchSavedRideForODPairUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserCommutePreferenceRepository f10285a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType;", "", "UserNotLoggedIn", "InvalidCity", "LocalError", "UnknownError", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FetchRideErrorType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$InvalidCity;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends FetchRideErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidCity f10286a = new InvalidCity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return -964778652;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$LocalError;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends FetchRideErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10287a;

            public LocalError(String str) {
                this.f10287a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalError) && Intrinsics.d(this.f10287a, ((LocalError) obj).f10287a);
            }

            public final int hashCode() {
                String str = this.f10287a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.f10287a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$UnknownError;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends FetchRideErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f10288a;

            public UnknownError(String str) {
                this.f10288a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.f10288a, ((UnknownError) obj).f10288a);
            }

            public final int hashCode() {
                String str = this.f10288a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.f10288a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType$UserNotLoggedIn;", "Lapp/chalo/usercommutepreference/domain/FetchSavedRideForODPairUseCase$FetchRideErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserNotLoggedIn extends FetchRideErrorType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UserNotLoggedIn f10289a = new UserNotLoggedIn();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UserNotLoggedIn);
            }

            public final int hashCode() {
                return 375466449;
            }

            public final String toString() {
                return "UserNotLoggedIn";
            }
        }
    }

    public FetchSavedRideForODPairUseCase(UserCommutePreferenceRepository userCommutePreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f10285a = userCommutePreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        FetchSavedRideForODPairUseCase$invoke$1 fetchSavedRideForODPairUseCase$invoke$1;
        if (continuationImpl instanceof FetchSavedRideForODPairUseCase$invoke$1) {
            fetchSavedRideForODPairUseCase$invoke$1 = (FetchSavedRideForODPairUseCase$invoke$1) continuationImpl;
            int i = fetchSavedRideForODPairUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchSavedRideForODPairUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchSavedRideForODPairUseCase$invoke$1 = new FetchSavedRideForODPairUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchSavedRideForODPairUseCase$invoke$1 = new FetchSavedRideForODPairUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = fetchSavedRideForODPairUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchSavedRideForODPairUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                String strM = this.b.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(FetchRideErrorType.UserNotLoggedIn.f10289a);
                }
                String strH = this.c.h();
                if (strH == null) {
                    return new ChaloUseCaseResult.Failure(FetchRideErrorType.InvalidCity.f10286a);
                }
                Flow flowI = this.f10285a.i(str, str2, strM, strH);
                fetchSavedRideForODPairUseCase$invoke$1.label = 1;
                objV = FlowKt.v(flowI, fetchSavedRideForODPairUseCase$invoke$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
            }
            List list = (List) objV;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            return new ChaloUseCaseResult.Success((UserCommutePreferenceSavedRideAppModel) CollectionsKt.H(list));
        } catch (ChaloLocalException e) {
            return new ChaloUseCaseResult.Failure(new FetchRideErrorType.LocalError(e.getMessage()));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new ChaloUseCaseResult.Failure(new FetchRideErrorType.UnknownError(e3.getMessage()));
        }
    }
}
