package app.chalo.livetracking.frameworklivetracking.data.model;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult;", "", "Data", "ConnectionStatus", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloSocketResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult;", "ConnectionNotInitiated", "ConnectionInProgress", "Connected", "DisConnectionInProgress", "Disconnected", "ConnectionTimeout", "Reconnection", "ReconnectionAttempt", "Error", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Connected;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionInProgress;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionNotInitiated;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionTimeout;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$DisConnectionInProgress;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Disconnected;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Reconnection;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ReconnectionAttempt;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ConnectionStatus extends ChaloSocketResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Connected;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Connected extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Connected f4249a = new Connected();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionInProgress;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectionInProgress extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConnectionInProgress f4250a = new ConnectionInProgress();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionNotInitiated;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectionNotInitiated extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConnectionNotInitiated f4251a = new ConnectionNotInitiated();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ConnectionTimeout;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ConnectionTimeout extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConnectionTimeout f4252a = new ConnectionTimeout();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$DisConnectionInProgress;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DisConnectionInProgress extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DisConnectionInProgress f4253a = new DisConnectionInProgress();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Disconnected;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Disconnected extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Disconnected f4254a = new Disconnected();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "ConnectionError", "GenericError", "ReconnectionFailed", "ReconnectionError", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ConnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$GenericError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ReconnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ReconnectionFailed;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Error extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4255a;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ConnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ConnectionError extends Error {
                public final String b;

                public ConnectionError(String str) {
                    super(str);
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ConnectionError) && Intrinsics.d(this.b, ((ConnectionError) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return vo1.B("ConnectionError(reason=", this.b, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$GenericError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class GenericError extends Error {
                public final String b;

                public GenericError(String str) {
                    super(str);
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof GenericError) && Intrinsics.d(this.b, ((GenericError) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return vo1.B("GenericError(reason=", this.b, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ReconnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ReconnectionError extends Error {
                public final String b;

                public ReconnectionError(String str) {
                    super(str);
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ReconnectionError) && Intrinsics.d(this.b, ((ReconnectionError) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return vo1.B("ReconnectionError(reason=", this.b, ")");
                }
            }

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error$ReconnectionFailed;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Error;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ReconnectionFailed extends Error {
                public static final ReconnectionFailed b = new ReconnectionFailed("");
            }

            public Error(String str) {
                this.f4255a = str;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$Reconnection;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Reconnection extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f4256a;

            public Reconnection(Integer num) {
                this.f4256a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reconnection) && Intrinsics.d(this.f4256a, ((Reconnection) obj).f4256a);
            }

            public final int hashCode() {
                Integer num = this.f4256a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return "Reconnection(attemptCount=" + this.f4256a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus$ReconnectionAttempt;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$ConnectionStatus;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReconnectionAttempt extends ConnectionStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f4257a;

            public ReconnectionAttempt(Integer num) {
                this.f4257a = num;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReconnectionAttempt) && Intrinsics.d(this.f4257a, ((ReconnectionAttempt) obj).f4257a);
            }

            public final int hashCode() {
                Integer num = this.f4257a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return "ReconnectionAttempt(attemptCount=" + this.f4257a + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult;", InitializationStatus.SUCCESS, "Failed", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data$Failed;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Data extends ChaloSocketResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data$Failed;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failed extends Data {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4258a;

            public Failed(String str) {
                this.f4258a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && Intrinsics.d(this.f4258a, ((Failed) obj).f4258a);
            }

            public final int hashCode() {
                return this.f4258a.hashCode();
            }

            public final String toString() {
                return vo1.B("Failed(reason=", this.f4258a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data$Success;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResult$Data;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Data {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloSocketResponse.Success f4259a;

            public Success(ChaloSocketResponse.Success data) {
                Intrinsics.i(data, "data");
                this.f4259a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.d(this.f4259a, ((Success) obj).f4259a);
            }

            public final int hashCode() {
                return this.f4259a.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.f4259a + ")";
            }
        }
    }
}
