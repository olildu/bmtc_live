package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Tasks.h;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ur1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19772a;
    public final /* synthetic */ h b;

    public /* synthetic */ ur1(h hVar, int i) {
        this.f19772a = i;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19772a) {
            case 0:
                h hVar = this.b;
                ReentrantLock reentrantLock = hVar.b;
                reentrantLock.lock();
                DebugHelper.b();
                try {
                    hVar.c();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                h hVar2 = this.b;
                ReentrantLock reentrantLock2 = hVar2.b;
                reentrantLock2.lock();
                try {
                    hVar2.c();
                } catch (Exception e) {
                    DebugHelper.a(e);
                } finally {
                    reentrantLock2.unlock();
                }
                return;
        }
    }
}
