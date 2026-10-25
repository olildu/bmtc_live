package defpackage;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17377a;

    public /* synthetic */ j7(int i) {
        this.f17377a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17377a) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            case 2:
                CompositingVideoSinkProvider.lambda$static$0(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
