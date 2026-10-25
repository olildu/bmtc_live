package defpackage;

import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qx implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19160a;
    public final /* synthetic */ DefaultHeartBeatController b;

    public /* synthetic */ qx(DefaultHeartBeatController defaultHeartBeatController, int i) {
        this.f19160a = i;
        this.b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19160a) {
            case 0:
                return this.b.lambda$getHeartBeatsHeader$1();
            default:
                return this.b.lambda$registerHeartBeat$0();
        }
    }
}
