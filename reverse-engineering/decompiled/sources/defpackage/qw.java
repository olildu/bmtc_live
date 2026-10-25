package defpackage;

import app.chalo.core.navigation.DecomposeNavigationScreenTracker;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.navigation.parent.ParentComponent;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.Cancellation;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.router.stack.ChildStack;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19158a;
    public final /* synthetic */ DecomposeNavigationScreenTracker b;

    public /* synthetic */ qw(DecomposeNavigationScreenTracker decomposeNavigationScreenTracker, int i) {
        this.f19158a = i;
        this.b = decomposeNavigationScreenTracker;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ChildStack rootStack = (ChildStack) obj;
        switch (this.f19158a) {
            case 0:
                Intrinsics.i(rootStack, "rootStack");
                Child.Created created = rootStack.f12382a;
                ComponentContext componentContextA = ((RootComponent.Child) created.b).a();
                DecomposeNavigationScreenTracker decomposeNavigationScreenTracker = this.b;
                Cancellation cancellation = decomposeNavigationScreenTracker.c;
                if (cancellation != null) {
                    cancellation.cancel();
                }
                decomposeNavigationScreenTracker.c = null;
                if (componentContextA instanceof ParentComponent) {
                    decomposeNavigationScreenTracker.c = ((ParentComponent) componentContextA).g().b(new qw(decomposeNavigationScreenTracker, 1));
                } else {
                    Object obj2 = created.f12283a;
                    SceneArgs sceneArgs = obj2 instanceof SceneArgs ? (SceneArgs) obj2 : null;
                    ChaloScenes chaloScenesC = sceneArgs != null ? sceneArgs.c() : null;
                    if (chaloScenesC != null) {
                        decomposeNavigationScreenTracker.b.c(chaloScenesC);
                    }
                }
                break;
            default:
                Intrinsics.i(rootStack, "stack");
                Object obj3 = rootStack.f12382a.f12283a;
                SceneArgs sceneArgs2 = obj3 instanceof SceneArgs ? (SceneArgs) obj3 : null;
                ChaloScenes chaloScenesC2 = sceneArgs2 != null ? sceneArgs2.c() : null;
                if (chaloScenesC2 != null) {
                    this.b.b.c(chaloScenesC2);
                }
                break;
        }
        return Unit.f17538a;
    }
}
