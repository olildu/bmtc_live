package app.chalo.livetracking.frameworklivetracking.chalosocket.model;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0018"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/chalosocket/model/SocketEvent;", "", "eventName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "Connect", "ConnectionError", "ConnectionTimeout", "Disconnect", "Error", "Message", "Once", "Reconnect", "ReconnectAttempt", "ReconnectError", "ReconnectFailed", "Subscribe", "Unsubscribe", "analyticsEventName", "getAnalyticsEventName", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SocketEvent {
    Connect("connect"),
    ConnectionError("connect_error"),
    ConnectionTimeout("connect_timeout"),
    Disconnect("disconnect"),
    Error("error"),
    Message("message"),
    Once("once"),
    Reconnect("reconnect"),
    ReconnectAttempt("reconnect_attempt"),
    ReconnectError("reconnect_error"),
    ReconnectFailed("reconnect_failed"),
    Subscribe("subscribe"),
    Unsubscribe("unsubscribe");

    private final String eventName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/chalosocket/model/SocketEvent$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4219a;

        static {
            int[] iArr = new int[SocketEvent.values().length];
            try {
                iArr[SocketEvent.Connect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocketEvent.ConnectionError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocketEvent.ConnectionTimeout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocketEvent.Disconnect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SocketEvent.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SocketEvent.Message.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SocketEvent.Once.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SocketEvent.Reconnect.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SocketEvent.ReconnectAttempt.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SocketEvent.ReconnectError.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SocketEvent.ReconnectFailed.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SocketEvent.Subscribe.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[SocketEvent.Unsubscribe.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f4219a = iArr;
        }
    }

    SocketEvent(String str) {
        this.eventName = str;
    }

    public static EnumEntries<SocketEvent> getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsEventName() {
        switch (WhenMappings.f4219a[ordinal()]) {
            case 1:
                return "crts connect";
            case 2:
                return "crts connect error";
            case 3:
                return "crts connect timeout";
            case 4:
                return "crts disconnect";
            case 5:
                return "crts error";
            case 6:
                return this.eventName;
            case 7:
                return this.eventName;
            case 8:
                return "crts reconnect";
            case 9:
                return "crts reconnect attempt";
            case 10:
                return "crts reconnect error";
            case 11:
                return "crts reconnect failed";
            case 12:
                return this.eventName;
            case 13:
                return this.eventName;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getEventName() {
        return this.eventName;
    }
}
