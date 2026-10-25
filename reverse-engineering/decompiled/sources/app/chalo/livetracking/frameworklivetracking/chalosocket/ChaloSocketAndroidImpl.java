package app.chalo.livetracking.frameworklivetracking.chalosocket;

import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.network.config.KPlatformSocketConfig;
import defpackage.bj;
import defpackage.f;
import defpackage.h3;
import defpackage.ia;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/chalosocket/ChaloSocketAndroidImpl;", "Lapp/chalo/livetracking/frameworklivetracking/chalosocket/ChaloSocket;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloSocketAndroidImpl implements ChaloSocket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4216a = new Object();
    public Socket b;

    public static IO.Options f(KSocketOptions kSocketOptions) {
        String strO = CollectionsKt.O(kSocketOptions.e.entrySet(), "&", null, null, new bj(24), 30);
        IO.Options options = new IO.Options();
        options.n = kSocketOptions.f4218a;
        options.o = kSocketOptions.b;
        options.p = kSocketOptions.c;
        options.b = kSocketOptions.d;
        options.m = strO;
        Long l = kSocketOptions.f;
        if (l != null && l.longValue() >= 0) {
            options.q = l.longValue();
        }
        List list = kSocketOptions.g;
        if (list != null) {
            options.k = (String[]) list.toArray(new String[0]);
        }
        KPlatformSocketConfig kPlatformSocketConfig = kSocketOptions.h;
        if (kPlatformSocketConfig != null) {
            OkHttpClient okHttpClient = kPlatformSocketConfig.f6456a;
            String message = "client: " + okHttpClient;
            Intrinsics.i(message, "message");
            options.j = okHttpClient;
            options.i = okHttpClient;
        }
        return options;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final boolean a() {
        boolean z;
        synchronized (this.f4216a) {
            z = this.b != null;
        }
        return z;
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void b(SocketEvent event, final f fVar) {
        Intrinsics.i(event, "event");
        Socket socket = this.b;
        if (socket != null) {
            socket.c(event.getEventName(), new Emitter.Listener() { // from class: ql
                @Override // io.socket.emitter.Emitter.Listener
                public final void call(Object[] objArr) {
                    Intrinsics.f(objArr);
                    fVar.invoke(ArraysKt.h0(objArr));
                }
            });
        }
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void c(String socketUrl, KSocketOptions kSocketOptions) {
        Intrinsics.i(socketUrl, "socketUrl");
        synchronized (this.f4216a) {
            try {
                if (this.b == null) {
                    this.b = IO.a(socketUrl, kSocketOptions != null ? f(kSocketOptions) : null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void clear() {
        synchronized (this.f4216a) {
            Socket socket = this.b;
            if (socket != null) {
                socket.f16994a.clear();
            }
            this.b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000d  */
    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void connect() {
        boolean z;
        Socket socket;
        synchronized (this.f4216a) {
            Socket socket2 = this.b;
            if (socket2 != null) {
                z = true;
                if (!socket2.b) {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && (socket = this.b) != null) {
                socket.h();
            }
        }
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void d(List eventList, final h3 h3Var) {
        Intrinsics.i(eventList, "eventList");
        Iterator it = eventList.iterator();
        while (it.hasNext()) {
            final SocketEvent socketEvent = (SocketEvent) it.next();
            Socket socket = this.b;
            if (socket != null) {
                socket.c(socketEvent.getEventName(), new Emitter.Listener() { // from class: pl
                    @Override // io.socket.emitter.Emitter.Listener
                    public final void call(Object[] objArr) {
                        Intrinsics.f(objArr);
                        h3Var.invoke(socketEvent, ArraysKt.h0(objArr));
                    }
                });
            }
        }
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void disconnect() {
        Socket socket;
        synchronized (this.f4216a) {
            Socket socket2 = this.b;
            if (socket2 != null && socket2.b && (socket = this.b) != null) {
                socket.j();
            }
        }
    }

    @Override // app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket
    public final void e(SocketEvent event, Function1 function1, ArrayList arrayList) {
        Intrinsics.i(event, "event");
        ia iaVar = new ia(arrayList, function1, this, event, 2);
        synchronized (this.f4216a) {
            Socket socket = this.b;
            if (socket != null && socket.b) {
                iaVar.invoke();
            }
        }
    }
}
