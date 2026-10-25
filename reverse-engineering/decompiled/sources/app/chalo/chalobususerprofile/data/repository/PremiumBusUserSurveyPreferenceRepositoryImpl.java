package app.chalo.chalobususerprofile.data.repository;

import app.chalo.chalobususerprofile.data.local.PBUserProfileSurveyPreferenceDataStore;
import app.chalo.chalobususerprofile.data.model.HomeWorkTimingModel;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.chalobususerprofile.data.model.TravelFrequencyModel;
import app.chalo.contract.BasicInfoContract;
import app.chalo.location.LatLng;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceDetailsAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTimingAppModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/data/repository/PremiumBusUserSurveyPreferenceRepositoryImpl;", "Lapp/chalo/chalobususerprofile/data/repository/PremiumBusUserSurveyPreferenceRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusUserSurveyPreferenceRepositoryImpl implements PremiumBusUserSurveyPreferenceRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBUserProfileSurveyPreferenceDataStore f1202a;
    public final BasicInfoContract b;

    public PremiumBusUserSurveyPreferenceRepositoryImpl(PBUserProfileSurveyPreferenceDataStore pBUserProfileSurveyPreferenceDataStore, BasicInfoContract basicInfoContract) {
        this.f1202a = pBUserProfileSurveyPreferenceDataStore;
        this.b = basicInfoContract;
    }

    public static HomeWorkTimingModel d(UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel) {
        UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel;
        UserCommutePreferenceTimingAppModel userCommutePreferenceTimingAppModel2 = userCommutePreferenceDetailsAppModel.c;
        if (userCommutePreferenceTimingAppModel2 == null || (userCommutePreferenceTimingAppModel = userCommutePreferenceDetailsAppModel.d) == null) {
            return null;
        }
        return new HomeWorkTimingModel(userCommutePreferenceTimingAppModel2.f10254a, g(userCommutePreferenceTimingAppModel2.b), userCommutePreferenceTimingAppModel.f10254a, g(userCommutePreferenceTimingAppModel.b));
    }

    public static RecentPlaceAppModel e(UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel) {
        UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = userCommutePreferenceStopPlaceAppModel.d;
        if (!(userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Place)) {
            if (!(userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop)) {
                throw new NoWhenBranchMatchedException();
            }
            UserCommutePreferencePlaceLocationAppModel.Stop stop = (UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel;
            return new RecentPlaceAppModel(stop.b, stop.h, stop.d, stop.c, stop.e, new LatLng(stop.f, stop.g), RecentsSpecialStatus.NONE, 0L, stop.d, 384);
        }
        UserCommutePreferencePlaceLocationAppModel.Place place = (UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel;
        String str = place.b;
        String str2 = place.g;
        String str3 = place.d;
        return new RecentPlaceAppModel(str, str2, str3, place.c, str3, new LatLng(place.e, place.f), RecentsSpecialStatus.NONE, 0L, place.d, 384);
    }

    public static TimingVariability g(long j) {
        TimingVariability next;
        Iterator<TimingVariability> it = TimingVariability.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getTime() != j);
        TimingVariability timingVariability = next;
        return timingVariability == null ? TimingVariability.EXACT : timingVariability;
    }

    @Override // app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository
    public final Flow a(String userId, String str) {
        Intrinsics.i(userId, "userId");
        return this.f1202a.a(userId, str);
    }

    @Override // app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository
    public final Flow b(String str, String str2) {
        return this.f1202a.b(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
    
        if (r1.c(r11, r10, r12, r3) == r4) goto L53;
     */
    @Override // app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r19, java.lang.String r20, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepositoryImpl.c(java.lang.String, java.lang.String, app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(PBUserProfileSurveyPreference pBUserProfileSurveyPreference, UserCommutePreferenceDetailsAppModel userCommutePreferenceDetailsAppModel, ContinuationImpl continuationImpl) {
        PremiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1 premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1;
        RecentPlaceAppModel recentPlaceAppModel;
        HomeWorkTimingModel homeWorkTimingModel;
        TravelFrequencyModel travelFrequencyModel;
        RecentPlaceAppModel recentPlaceAppModel2;
        if (continuationImpl instanceof PremiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1) {
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1 = (PremiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1) continuationImpl;
            int i = premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1 = new PremiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1(this, continuationImpl);
            }
        } else {
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1 = new PremiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1(this, continuationImpl);
        }
        Object obj = premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel = userCommutePreferenceDetailsAppModel.f10248a;
            RecentPlaceAppModel recentPlaceAppModelE = userCommutePreferenceStopPlaceAppModel != null ? e(userCommutePreferenceStopPlaceAppModel) : null;
            UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel2 = userCommutePreferenceDetailsAppModel.b;
            RecentPlaceAppModel recentPlaceAppModelE2 = userCommutePreferenceStopPlaceAppModel2 != null ? e(userCommutePreferenceStopPlaceAppModel2) : null;
            HomeWorkTimingModel homeWorkTimingModelD = d(userCommutePreferenceDetailsAppModel);
            String str = userCommutePreferenceDetailsAppModel.e;
            TravelFrequencyModel travelFrequencyModel2 = str != null ? new TravelFrequencyModel(str) : null;
            RecentPlaceAppModel recentPlaceAppModel3 = recentPlaceAppModelE == null ? pBUserProfileSurveyPreference.f1196a : recentPlaceAppModelE;
            RecentPlaceAppModel recentPlaceAppModel4 = recentPlaceAppModelE2 == null ? pBUserProfileSurveyPreference.b : recentPlaceAppModelE2;
            HomeWorkTimingModel homeWorkTimingModel2 = homeWorkTimingModelD == null ? pBUserProfileSurveyPreference.c : homeWorkTimingModelD;
            if (travelFrequencyModel2 == null) {
                travelFrequencyModel2 = pBUserProfileSurveyPreference.d;
            }
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$0 = pBUserProfileSurveyPreference;
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$1 = recentPlaceAppModel3;
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$2 = recentPlaceAppModel4;
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$3 = homeWorkTimingModel2;
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$4 = travelFrequencyModel2;
            premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.label = 1;
            Object objC = this.b.c(premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            recentPlaceAppModel = recentPlaceAppModel3;
            homeWorkTimingModel = homeWorkTimingModel2;
            travelFrequencyModel = travelFrequencyModel2;
            recentPlaceAppModel2 = recentPlaceAppModel4;
            obj = objC;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TravelFrequencyModel travelFrequencyModel3 = (TravelFrequencyModel) premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$4;
            HomeWorkTimingModel homeWorkTimingModel3 = (HomeWorkTimingModel) premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$3;
            RecentPlaceAppModel recentPlaceAppModel5 = (RecentPlaceAppModel) premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$2;
            RecentPlaceAppModel recentPlaceAppModel6 = (RecentPlaceAppModel) premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$1;
            PBUserProfileSurveyPreference pBUserProfileSurveyPreference2 = (PBUserProfileSurveyPreference) premiumBusUserSurveyPreferenceRepositoryImpl$mergeCommutePreference$1.L$0;
            ResultKt.b(obj);
            recentPlaceAppModel2 = recentPlaceAppModel5;
            recentPlaceAppModel = recentPlaceAppModel6;
            travelFrequencyModel = travelFrequencyModel3;
            homeWorkTimingModel = homeWorkTimingModel3;
            pBUserProfileSurveyPreference = pBUserProfileSurveyPreference2;
        }
        pBUserProfileSurveyPreference.getClass();
        return new PBUserProfileSurveyPreference(recentPlaceAppModel, recentPlaceAppModel2, homeWorkTimingModel, travelFrequencyModel, (Long) obj);
    }
}
