package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nq implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18536a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq(Object obj, int i) {
        this.f18536a = i;
        this.b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f18536a) {
            case 0:
                return ComponentActivity._init_$lambda$4((ComponentActivity) this.b);
            case 1:
                return DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry$lambda$0((SaveableStateRegistry) this.b);
            case 2:
                return ((FragmentActivity) this.b).lambda$init$0();
            case 3:
                return ((FragmentManager) this.b).lambda$attachController$5();
            default:
                return SavedStateHandleImpl.savedStateProvider$lambda$0((SavedStateHandleImpl) this.b);
        }
    }
}
