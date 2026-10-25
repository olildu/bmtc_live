package defpackage;

import androidx.core.widget.ContentLoadingProgressBar;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11227a;
    public final /* synthetic */ ContentLoadingProgressBar b;

    public /* synthetic */ bt(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f11227a = i;
        this.b = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11227a) {
            case 0:
                this.b.lambda$new$0();
                break;
            case 1:
                this.b.lambda$new$1();
                break;
            case 2:
                this.b.showOnUiThread();
                break;
            default:
                this.b.hideOnUiThread();
                break;
        }
    }
}
