package defpackage;

import com.amazon.aps.shared.util.ApsAsyncUtil;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15706a;
    public final /* synthetic */ ApsAsyncUtil.ApsReturnRunnable b;
    public final /* synthetic */ ApsAsyncUtil.ApsExecutionListener c;

    public /* synthetic */ g7(ApsAsyncUtil.ApsReturnRunnable apsReturnRunnable, ApsAsyncUtil.ApsExecutionListener apsExecutionListener, int i) {
        this.f15706a = i;
        this.b = apsReturnRunnable;
        this.c = apsExecutionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15706a) {
            case 0:
                ApsAsyncUtil.lambda$runAsyncAndCallback$4(this.b, this.c);
                break;
            case 1:
                ApsAsyncUtil.lambda$runOnUiThreadAndAsyncCallback$1(this.b, this.c);
                break;
            default:
                ApsAsyncUtil.lambda$runAsyncAndCallbackOnUiThread$3(this.b, this.c);
                break;
        }
    }
}
