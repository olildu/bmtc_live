package app.chalo.livetracking.frameworklivetracking;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket;
import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import app.chalo.providers.CoroutineContextProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/ChaloSocketClient;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloSocketClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloSocket f4176a;
    public final CrashlyticsLogger b;
    public final AnalyticsContract c;
    public final BasicInfoContract d;
    public final NetworkStateManager e;
    public final ContextScope f;
    public StateFlow j;
    public final MutexImpl g = MutexKt.a();
    public final MutexImpl h = MutexKt.a();
    public final MutableStateFlow i = StateFlowKt.a(ChaloSocketResult.ConnectionStatus.ConnectionNotInitiated.f4251a);
    public Object k = SharedFlowKt.b(0, 0, null, 7);
    public final ArrayList l = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4177a;

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
            f4177a = iArr;
        }
    }

    public ChaloSocketClient(ChaloSocket chaloSocket, CoroutineContextProvider coroutineContextProvider, CrashlyticsLogger crashlyticsLogger, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, NetworkStateManager networkStateManager) {
        this.f4176a = chaloSocket;
        this.b = crashlyticsLogger;
        this.c = analyticsContract;
        this.d = basicInfoContract;
        this.e = networkStateManager;
        this.f = CoroutineScopeKt.a(coroutineContextProvider.b());
    }

    public final void a(String str, String str2, Object[] objArr) {
        Throwable cause;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : objArr) {
            if ((obj instanceof Exception) && (cause = ((Exception) obj).getCause()) != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put("exception message", message);
            }
        }
        linkedHashMap.put("reason", str2);
        NetworkStateManager networkStateManager = this.e;
        linkedHashMap.put("network", Boolean.valueOf(networkStateManager.b().getValue() == NetworkConnectionType.CONNECTED));
        linkedHashMap.put("time", Long.valueOf(this.d.j()));
        linkedHashMap.put("network type", networkStateManager.a().name());
        AnalyticsContract.DefaultImpls.a(this.c, str, LiveTrackingDataManagerImpl.h, linkedHashMap, null, false, 24);
    }
}
