package app.chalo.chalobususerprofile.data.local;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/chalobususerprofile/data/local/PBUserProfileSurveyPreferenceDataStore;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PBUserProfileSurveyPreferenceDataStore {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/data/local/PBUserProfileSurveyPreferenceDataStore$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    PBUserProfileSurveyPreferenceDataStoreImpl$isSurveyCompleted$$inlined$map$1 a(String str, String str2);

    Flow b(String str, String str2);

    Object c(String str, String str2, PBUserProfileSurveyPreference pBUserProfileSurveyPreference, ContinuationImpl continuationImpl);
}
