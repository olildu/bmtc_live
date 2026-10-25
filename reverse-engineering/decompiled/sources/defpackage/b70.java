package defpackage;

import androidx.datastore.core.MulticastFileObserver;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b70 implements DisposableHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11172a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b70(int i, Object obj, Object obj2) {
        this.f11172a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        switch (this.f11172a) {
            case 0:
                HandlerContext handlerContext = (HandlerContext) this.b;
                handlerContext.f17747a.removeCallbacks((Runnable) this.c);
                break;
            default:
                MulticastFileObserver.Companion.observe$lambda$4((String) this.b, (Function1) this.c);
                break;
        }
    }
}
