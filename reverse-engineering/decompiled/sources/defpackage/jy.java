package defpackage;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jy implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17447a;
    public final /* synthetic */ DelayMetCommandHandler b;

    public /* synthetic */ jy(DelayMetCommandHandler delayMetCommandHandler, int i) {
        this.f17447a = i;
        this.b = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17447a) {
            case 0:
                this.b.stopWork();
                break;
            default:
                this.b.startWork();
                break;
        }
    }
}
