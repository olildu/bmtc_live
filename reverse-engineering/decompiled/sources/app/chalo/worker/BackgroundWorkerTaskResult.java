package app.chalo.worker;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/worker/BackgroundWorkerTaskResult;", "", InitializationStatus.SUCCESS, "Failure", "Retry", "Lapp/chalo/worker/BackgroundWorkerTaskResult$Failure;", "Lapp/chalo/worker/BackgroundWorkerTaskResult$Retry;", "Lapp/chalo/worker/BackgroundWorkerTaskResult$Success;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BackgroundWorkerTaskResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/worker/BackgroundWorkerTaskResult$Failure;", "Lapp/chalo/worker/BackgroundWorkerTaskResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends BackgroundWorkerTaskResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failure f11115a = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return -1613801570;
        }

        public final String toString() {
            return "Failure";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/worker/BackgroundWorkerTaskResult$Retry;", "Lapp/chalo/worker/BackgroundWorkerTaskResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Retry extends BackgroundWorkerTaskResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Retry f11116a = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 335789500;
        }

        public final String toString() {
            return "Retry";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/worker/BackgroundWorkerTaskResult$Success;", "Lapp/chalo/worker/BackgroundWorkerTaskResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends BackgroundWorkerTaskResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f11117a = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 1900570135;
        }

        public final String toString() {
            return InitializationStatus.SUCCESS;
        }
    }
}
