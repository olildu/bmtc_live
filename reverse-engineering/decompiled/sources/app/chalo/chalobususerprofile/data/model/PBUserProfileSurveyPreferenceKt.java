package app.chalo.chalobususerprofile.data.model;

import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState;
import app.chalo.chalobususerprofile.ui.compose.TravelFrequency;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBUserProfileSurveyPreferenceKt {
    public static final PBUserProfileSurveyPreference a(PBUserProfileSurveyPreference pBUserProfileSurveyPreference, List sequence) {
        TravelFrequency travelFrequency;
        Intrinsics.i(sequence, "sequence");
        Iterator it = sequence.iterator();
        while (true) {
            PBUserProfileSurveyPreference pBUserProfileSurveyPreference2 = pBUserProfileSurveyPreference;
            while (it.hasNext()) {
                PBUserProfileSurveyInputState pBUserProfileSurveyInputState = (PBUserProfileSurveyInputState) it.next();
                if (!pBUserProfileSurveyInputState.getF1231a()) {
                    if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
                        RecentPlaceAppModel recentPlaceAppModel = ((PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) pBUserProfileSurveyInputState).c;
                        if (recentPlaceAppModel != null) {
                            pBUserProfileSurveyPreference = PBUserProfileSurveyPreference.a(pBUserProfileSurveyPreference2, recentPlaceAppModel, null, null, null, 30);
                        }
                    } else if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) {
                        RecentPlaceAppModel recentPlaceAppModel2 = ((PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) pBUserProfileSurveyInputState).c;
                        if (recentPlaceAppModel2 != null) {
                            pBUserProfileSurveyPreference = PBUserProfileSurveyPreference.a(pBUserProfileSurveyPreference2, null, recentPlaceAppModel2, null, null, 29);
                        }
                    } else if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
                        PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile workTimingInputPBUserProfile = (PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) pBUserProfileSurveyInputState;
                        Long l = workTimingInputPBUserProfile.e;
                        Long l2 = workTimingInputPBUserProfile.c;
                        if (l2 != null && l != null) {
                            pBUserProfileSurveyPreference = PBUserProfileSurveyPreference.a(pBUserProfileSurveyPreference2, null, null, new HomeWorkTimingModel(l2.longValue(), workTimingInputPBUserProfile.d, l.longValue(), workTimingInputPBUserProfile.f), null, 27);
                        }
                    } else if ((pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) && (travelFrequency = ((PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) pBUserProfileSurveyInputState).c) != null) {
                        pBUserProfileSurveyPreference = PBUserProfileSurveyPreference.a(pBUserProfileSurveyPreference2, null, null, null, new TravelFrequencyModel(travelFrequency.name()), 23);
                    }
                }
            }
            return pBUserProfileSurveyPreference2;
        }
    }
}
