package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.HandlerWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bs implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11226a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bs(Object obj, int i) {
        this.f11226a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11226a) {
            case 0:
                ((HandlerWrapper) this.b).post(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                ((SimpleBasePlayer) this.b).postOrRunOnApplicationHandler(runnable);
                break;
            default:
                TextInputServiceAndroid_androidKt.asExecutor$lambda$0((Choreographer) this.b, runnable);
                break;
        }
    }
}
