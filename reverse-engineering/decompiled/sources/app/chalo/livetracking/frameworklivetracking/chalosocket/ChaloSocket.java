package app.chalo.livetracking.frameworklivetracking.chalosocket;

import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import defpackage.f;
import defpackage.h3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/chalosocket/ChaloSocket;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloSocket {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    boolean a();

    void b(SocketEvent socketEvent, f fVar);

    void c(String str, KSocketOptions kSocketOptions);

    void clear();

    void connect();

    void d(List list, h3 h3Var);

    void disconnect();

    void e(SocketEvent socketEvent, Function1 function1, ArrayList arrayList);
}
