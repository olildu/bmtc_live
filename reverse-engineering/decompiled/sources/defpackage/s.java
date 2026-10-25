package defpackage;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19256a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i) {
        this.f19256a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f19256a) {
            case 0:
                ((Function1) this.b).invoke(event);
                break;
            case 1:
                Lifecycle._get_currentStateFlow_$lambda$0((MutableStateFlow) this.b, lifecycleOwner, event);
                break;
            case 2:
                SavedStateRegistryImpl.performAttach$lambda$12((SavedStateRegistryImpl) this.b, lifecycleOwner, event);
                break;
            default:
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1((AbstractComposeView) this.b, lifecycleOwner, event);
                break;
        }
    }
}
