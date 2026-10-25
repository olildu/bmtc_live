package defpackage;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.State;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pq implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19058a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq(int i, Object obj, Object obj2) {
        this.f19058a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f19058a) {
            case 0:
                ComponentActivity.addObserverForBackInvoker$lambda$7((OnBackPressedDispatcher) this.b, (ComponentActivity) this.c, lifecycleOwner, event);
                break;
            case 1:
                LifecycleController.observer$lambda$0((LifecycleController) this.b, (Job) this.c, lifecycleOwner, event);
                break;
            case 2:
                LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3$lambda$1((Lifecycle.Event) this.b, (State) this.c, lifecycleOwner, event);
                break;
            default:
                ((MenuHostHelper) this.b).lambda$addMenuProvider$0((MenuProvider) this.c, lifecycleOwner, event);
                break;
        }
    }
}
