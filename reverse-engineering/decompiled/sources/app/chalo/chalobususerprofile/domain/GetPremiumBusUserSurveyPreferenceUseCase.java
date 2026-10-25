package app.chalo.chalobususerprofile.domain;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/chalobususerprofile/domain/GetPremiumBusUserSurveyPreferenceUseCase;", "", "GetPremiumBusUserSurveyPreferenceError", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPremiumBusUserSurveyPreferenceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusUserSurveyPreferenceRepository f1203a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/chalobususerprofile/domain/GetPremiumBusUserSurveyPreferenceUseCase$GetPremiumBusUserSurveyPreferenceError;", "", "<init>", "(Ljava/lang/String;I)V", "USER_NOT_LOGGED_IN", "INVALID_CITY", "NO_PREFERENCE_AVAILABLE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum GetPremiumBusUserSurveyPreferenceError {
        USER_NOT_LOGGED_IN,
        INVALID_CITY,
        NO_PREFERENCE_AVAILABLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<GetPremiumBusUserSurveyPreferenceError> getEntries() {
            return $ENTRIES;
        }
    }

    public GetPremiumBusUserSurveyPreferenceUseCase(PremiumBusUserSurveyPreferenceRepository premiumBusUserSurveyPreferenceRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f1203a = premiumBusUserSurveyPreferenceRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetPremiumBusUserSurveyPreferenceUseCase$invoke$1 getPremiumBusUserSurveyPreferenceUseCase$invoke$1;
        if (continuationImpl instanceof GetPremiumBusUserSurveyPreferenceUseCase$invoke$1) {
            getPremiumBusUserSurveyPreferenceUseCase$invoke$1 = (GetPremiumBusUserSurveyPreferenceUseCase$invoke$1) continuationImpl;
            int i = getPremiumBusUserSurveyPreferenceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPremiumBusUserSurveyPreferenceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPremiumBusUserSurveyPreferenceUseCase$invoke$1 = new GetPremiumBusUserSurveyPreferenceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPremiumBusUserSurveyPreferenceUseCase$invoke$1 = new GetPremiumBusUserSurveyPreferenceUseCase$invoke$1(this, continuationImpl);
        }
        Object objV = getPremiumBusUserSurveyPreferenceUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPremiumBusUserSurveyPreferenceUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            String strM = this.b.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(GetPremiumBusUserSurveyPreferenceError.USER_NOT_LOGGED_IN);
            }
            String strH = this.c.h();
            if (strH == null) {
                return new ChaloUseCaseResult.Failure(GetPremiumBusUserSurveyPreferenceError.INVALID_CITY);
            }
            Flow flowB = this.f1203a.b(strM, strH);
            getPremiumBusUserSurveyPreferenceUseCase$invoke$1.label = 1;
            objV = FlowKt.v(flowB, getPremiumBusUserSurveyPreferenceUseCase$invoke$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        PBUserProfileSurveyPreference pBUserProfileSurveyPreference = (PBUserProfileSurveyPreference) objV;
        return pBUserProfileSurveyPreference == null ? new ChaloUseCaseResult.Failure(GetPremiumBusUserSurveyPreferenceError.NO_PREFERENCE_AVAILABLE) : new ChaloUseCaseResult.Success(pBUserProfileSurveyPreference);
    }
}
