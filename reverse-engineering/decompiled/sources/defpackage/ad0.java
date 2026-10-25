package defpackage;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.C2488gb;
import in.juspay.hypersdk.core.JuspayServices;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ad0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ad0(Object obj, int i) {
        this.f276a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f276a) {
            case 0:
                return ((JuspayServices) this.b).lambda$process$7(view, windowInsets);
            default:
                return C2488gb.a((C2488gb) this.b, view, windowInsets);
        }
    }
}
