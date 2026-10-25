package app.chalo.livetracking.frameworklivetracking.data.model.app;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "", "ConfigNotAvailable", "InvalidRtsService", "InvalidSocketResponse", "AckNotReceivedForRequest", "SocketConnectionError", "Generic", "InvalidRealTimeSocketRequest", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$AckNotReceivedForRequest;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$ConfigNotAvailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$Generic;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidRealTimeSocketRequest;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidRtsService;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidSocketResponse;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$SocketConnectionError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RealTimeSocketResponseErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$AckNotReceivedForRequest;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AckNotReceivedForRequest extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AckNotReceivedForRequest f4303a = new AckNotReceivedForRequest();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$ConfigNotAvailable;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfigNotAvailable extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfigNotAvailable f4304a = new ConfigNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$Generic;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Generic extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4305a;

        public Generic(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f4305a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Generic) && Intrinsics.d(this.f4305a, ((Generic) obj).f4305a);
        }

        public final int hashCode() {
            return this.f4305a.hashCode();
        }

        public final String toString() {
            return vo1.B("Generic(errorMsg=", this.f4305a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidRealTimeSocketRequest;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidRealTimeSocketRequest extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidRealTimeSocketRequest f4306a = new InvalidRealTimeSocketRequest();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidRtsService;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidRtsService extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidRtsService f4307a = new InvalidRtsService();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$InvalidSocketResponse;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidSocketResponse extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidSocketResponse f4308a = new InvalidSocketResponse();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType$SocketConnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealTimeSocketResponseErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SocketConnectionError extends RealTimeSocketResponseErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4309a;

        public SocketConnectionError(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f4309a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SocketConnectionError) && Intrinsics.d(this.f4309a, ((SocketConnectionError) obj).f4309a);
        }

        public final int hashCode() {
            return this.f4309a.hashCode();
        }

        public final String toString() {
            return vo1.B("SocketConnectionError(errorMsg=", this.f4309a, ")");
        }
    }
}
