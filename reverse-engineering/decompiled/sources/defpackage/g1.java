package defpackage;

import com.inmobi.media.P;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15690a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ g1(Function0 function0, int i) {
        this.f15690a = i;
        this.b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15690a) {
            case 0:
                this.b.invoke();
                break;
            case 1:
                this.b.invoke();
                break;
            case 2:
                this.b.invoke();
                break;
            case 3:
                P.b(this.b);
                break;
            case 4:
                P.a(this.b);
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
