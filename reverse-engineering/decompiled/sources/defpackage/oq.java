package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oq implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18663a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ oq(ComponentActivity componentActivity, int i) {
        this.f18663a = i;
        this.b = componentActivity;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        switch (this.f18663a) {
            case 0:
                ComponentActivity._init_$lambda$5(this.b, context);
                break;
            default:
                ((FragmentActivity) this.b).lambda$init$3(context);
                break;
        }
    }
}
