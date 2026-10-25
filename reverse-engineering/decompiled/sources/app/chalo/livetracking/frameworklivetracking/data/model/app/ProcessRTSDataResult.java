package app.chalo.livetracking.frameworklivetracking.data.model.app;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult;", "", "No", "Yes", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult$No;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult$Yes;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProcessRTSDataResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult$No;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class No extends ProcessRTSDataResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final No f4302a = new No();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult$Yes;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ProcessRTSDataResult;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Yes extends ProcessRTSDataResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Yes);
        }

        public final int hashCode() {
            return 1231;
        }

        public final String toString() {
            return "Yes(shouldUpdateOldData=true)";
        }
    }
}
