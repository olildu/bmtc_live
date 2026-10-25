package defpackage;

import com.inmobi.media.V9;
import com.inmobi.media.Y9;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bo1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11218a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Y9 c;

    public /* synthetic */ bo1(Function1 function1, Y9 y9, int i) {
        this.f11218a = i;
        this.b = function1;
        this.c = y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11218a) {
            case 0:
                V9.a(this.b, this.c);
                break;
            case 1:
                Y9.a(this.b, this.c);
                break;
            default:
                Y9.b(this.b, this.c);
                break;
        }
    }
}
