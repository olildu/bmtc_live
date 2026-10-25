package defpackage;

import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ye0 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20101a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ye0(int i, Serializable serializable, Object obj, Object obj2) {
        this.f20101a = i;
        this.d = obj;
        this.b = serializable;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f20101a) {
            case 0:
                LifecycleEffectKt.LifecycleStartEffectImpl$lambda$19$lambda$18$lambda$16((LifecycleStartStopEffectScope) this.d, (Ref.ObjectRef) this.b, (Function1) this.c, lifecycleOwner, event);
                break;
            case 1:
                LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$34$lambda$33$lambda$31((LifecycleResumePauseEffectScope) this.d, (Ref.ObjectRef) this.b, (Function1) this.c, lifecycleOwner, event);
                break;
            default:
                ((MenuHostHelper) this.d).lambda$addMenuProvider$1((Lifecycle.State) this.b, (MenuProvider) this.c, lifecycleOwner, event);
                break;
        }
    }
}
