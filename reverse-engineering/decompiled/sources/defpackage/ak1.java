package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ ak1(Toolbar toolbar, int i) {
        this.f297a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f297a) {
            case 0:
                this.b.collapseActionView();
                break;
            default:
                this.b.invalidateMenu();
                break;
        }
    }
}
