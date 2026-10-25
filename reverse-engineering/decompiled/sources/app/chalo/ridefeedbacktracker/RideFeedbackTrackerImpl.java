package app.chalo.ridefeedbacktracker;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedbacktracker/RideFeedbackTrackerImpl;", "Lapp/chalo/ridefeedbacktracker/RideFeedbackTracker;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackTrackerImpl implements RideFeedbackTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f9095a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridefeedbacktracker/RideFeedbackTrackerImpl$Companion;", "", "", "RIDE_FEEDBACK_KEY_SUFFIX", "Ljava/lang/String;", "DATASTORE_NAME", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RideFeedbackTrackerImpl(LocalDataStore localDataStore, CrashlyticsLogger crashlyticsLogger) {
        this.f9095a = crashlyticsLogger;
    }
}
