package app.chalo.livetracking.frameworklivetracking.data.model.api.response;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "SocketConnectionDataNotAvailable", "SocketSubscriptionServiceDataNotAvailable", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException$SocketConnectionDataNotAvailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException$SocketSubscriptionServiceDataNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SocketConfigApiToAppModelException extends Exception {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException$SocketConnectionDataNotAvailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException;", "<init>", "()V", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SocketConnectionDataNotAvailable extends SocketConfigApiToAppModelException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SocketConnectionDataNotAvailable f4292a = new SocketConnectionDataNotAvailable();

        private SocketConnectionDataNotAvailable() {
            super(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException$SocketSubscriptionServiceDataNotAvailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/api/response/SocketConfigApiToAppModelException;", "<init>", "()V", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SocketSubscriptionServiceDataNotAvailable extends SocketConfigApiToAppModelException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SocketSubscriptionServiceDataNotAvailable f4293a = new SocketSubscriptionServiceDataNotAvailable();

        private SocketSubscriptionServiceDataNotAvailable() {
            super(0);
        }
    }

    public /* synthetic */ SocketConfigApiToAppModelException(int i) {
        this();
    }

    private SocketConfigApiToAppModelException() {
    }
}
