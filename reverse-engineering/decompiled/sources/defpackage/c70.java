package defpackage;

import android.view.Choreographer;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c70 implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = HandlerDispatcherKt.f17748a;
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f17879a;
        throw null;
    }
}
