package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentActivity;
import androidx.work.InitializationExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a50 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a50(Object obj, int i) {
        this.f163a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f163a) {
            case 0:
                ((FragmentActivity) this.b).lambda$init$1((Configuration) obj);
                break;
            case 1:
                ((FragmentActivity) this.b).lambda$init$2((Intent) obj);
                break;
            default:
                ((InitializationExceptionHandler) this.b).handleException((Throwable) obj);
                break;
        }
    }
}
