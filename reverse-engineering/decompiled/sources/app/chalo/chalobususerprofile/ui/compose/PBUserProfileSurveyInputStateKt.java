package app.chalo.chalobususerprofile.ui.compose;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PBUserProfileSurveyInputStateKt {
    public static final String a(PBUserProfileSurveyInputState pBUserProfileSurveyInputState) {
        Intrinsics.i(pBUserProfileSurveyInputState, "<this>");
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile) {
            return "HOME";
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile) {
            return "WORK";
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile) {
            return "TIMING";
        }
        if (pBUserProfileSurveyInputState instanceof PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile) {
            return "FREQUENCY";
        }
        throw new NoWhenBranchMatchedException();
    }
}
