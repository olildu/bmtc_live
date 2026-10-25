package app.chalo.core.navigation.root;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.navigation.parent.ParentComponent;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.ComponentContextFactory;
import com.arkivanov.decompose.DecomposeExperimentFlags;
import com.arkivanov.decompose.GettingList;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.decompose.router.stack.ChildStackFactoryKt;
import com.arkivanov.decompose.router.stack.DefaultStackNavigation;
import com.arkivanov.decompose.value.Value;
import com.arkivanov.essenty.backhandler.BackHandler;
import com.arkivanov.essenty.instancekeeper.InstanceKeeper;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.vo1;
import defpackage.xx;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/core/navigation/root/DefaultRootComponent;", "Lapp/chalo/core/navigation/root/RootComponent;", "Lcom/arkivanov/decompose/ComponentContext;", "Lorg/koin/core/component/KoinComponent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultRootComponent implements RootComponent, ComponentContext, KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentContext f2181a;
    public final List b;
    public final ChaloBuildConfig c;
    public final ContextScope d;
    public final DefaultStackNavigation e;
    public final Value f;

    public DefaultRootComponent(List list, ComponentContext componentContext, ChaloBuildConfig chaloBuildConfig) {
        this.f2181a = componentContext;
        this.b = list;
        this.c = chaloBuildConfig;
        ContextScope contextScopeA = CoroutineScopeKt.a(SupervisorKt.b());
        this.d = contextScopeA;
        DecomposeExperimentFlags.f12285a = true;
        Lifecycle f12286a = componentContext.getF12286a();
        if (f12286a.getB() == Lifecycle.State.DESTROYED) {
            CoroutineScopeKt.b(contextScopeA, null);
        } else {
            f12286a.b(new Lifecycle.Callbacks() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$special$$inlined$doOnDestroy$1
                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onDestroy() {
                    CoroutineScopeKt.b(this.f2197a.d, null);
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onCreate() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onPause() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onResume() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onStart() {
                }

                @Override // com.arkivanov.essenty.lifecycle.Lifecycle.Callbacks
                public final void onStop() {
                }
            });
        }
        DefaultStackNavigation defaultStackNavigation = new DefaultStackNavigation();
        this.e = defaultStackNavigation;
        this.f = ChildStackFactoryKt.a(this, defaultStackNavigation, SceneArgs.INSTANCE.serializer(), new xx(this, 0), "DefaultChildStack", true, new DefaultRootComponent$childStack$2(2, this, DefaultRootComponent.class, "createChild", "createChild(Lapp/chalo/scenes/args/SceneArgs;Lcom/arkivanov/decompose/ComponentContext;)Lapp/chalo/core/navigation/root/RootComponent$Child;", 0));
    }

    @Override // com.arkivanov.decompose.ComponentContextFactoryOwner
    /* JADX INFO: renamed from: A */
    public final ComponentContextFactory getE() {
        return this.f2181a.getE();
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // com.arkivanov.essenty.instancekeeper.InstanceKeeperOwner
    /* JADX INFO: renamed from: O */
    public final InstanceKeeper getC() {
        return this.f2181a.getC();
    }

    public final boolean a(SceneArgs sceneArgs) {
        for (ParentComponent parentComponentI = i(); parentComponentI != null; parentComponentI = parentComponentI.g0()) {
            if (parentComponentI.Y(sceneArgs)) {
                return ((ChildStack) this.f.a()).c.size() > 1;
            }
        }
        return false;
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void b(SceneArgs parentToFinish, final SceneArgs argsToNavigate) {
        Intrinsics.i(parentToFinish, "parentToFinish");
        Intrinsics.i(argsToNavigate, "argsToNavigate");
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.b(parentToFinish, argsToNavigate)) {
            boolean zA = a(parentToFinish);
            DefaultStackNavigation defaultStackNavigation = this.e;
            if (!zA) {
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$finishAndNavigate$$inlined$pushNew$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List stack = (List) obj;
                        Intrinsics.i(stack, "stack");
                        Object objP = CollectionsKt.P(stack);
                        Object obj2 = argsToNavigate;
                        return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                    }
                }, new DefaultRootComponent$finishAndNavigate$$inlined$pushNew$default$4());
                return;
            }
            defaultStackNavigation.b(DefaultRootComponent$finishAndNavigate$$inlined$pop$default$1.f2183a, new DefaultRootComponent$finishAndNavigate$$inlined$pop$default$2());
            defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$finishAndNavigate$$inlined$pushNew$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List stack = (List) obj;
                    Intrinsics.i(stack, "stack");
                    Object objP = CollectionsKt.P(stack);
                    Object obj2 = argsToNavigate;
                    return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                }
            }, new DefaultRootComponent$finishAndNavigate$$inlined$pushNew$default$2());
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void c(final SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.c(args)) {
            this.e.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateTo$$inlined$pushNew$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List stack = (List) obj;
                    Intrinsics.i(stack, "stack");
                    Object objP = CollectionsKt.P(stack);
                    Object obj2 = args;
                    return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                }
            }, new DefaultRootComponent$navigateTo$$inlined$pushNew$default$2());
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void d(final SceneArgs args, ChaloScenes popUpTo, boolean z) {
        final int iNextIndex;
        Intrinsics.i(args, "args");
        Intrinsics.i(popUpTo, "popUpTo");
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.d(args, popUpTo, z)) {
            Value value = this.f;
            boolean zIsEmpty = ((ChildStack) value.a()).c.isEmpty();
            DefaultStackNavigation defaultStackNavigation = this.e;
            if (zIsEmpty) {
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List stack = (List) obj;
                        Intrinsics.i(stack, "stack");
                        Object objP = CollectionsKt.P(stack);
                        Object obj2 = args;
                        return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                    }
                }, new DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$2());
                return;
            }
            GettingList gettingList = ((ChildStack) value.a()).c;
            ListIterator<T> listIterator = gettingList.listIterator(gettingList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                Object obj = ((Child.Created) listIterator.previous()).f12283a;
                ChaloScenes chaloScenesC = null;
                SceneArgs sceneArgs = obj instanceof SceneArgs ? (SceneArgs) obj : null;
                if (sceneArgs != null) {
                    chaloScenesC = sceneArgs.c();
                }
                if (chaloScenesC == popUpTo) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex < 0) {
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List stack = (List) obj2;
                        Intrinsics.i(stack, "stack");
                        Object objP = CollectionsKt.P(stack);
                        Object obj3 = args;
                        return Intrinsics.d(objP, obj3) ? stack : CollectionsKt.d0(obj3, stack);
                    }
                }, new DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$4());
                return;
            }
            if (z) {
                iNextIndex--;
            }
            if (iNextIndex < 0) {
                final SceneArgs[] sceneArgsArr = {args};
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateAndPopUpTo$$inlined$replaceAll$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List it = (List) obj2;
                        Intrinsics.i(it, "it");
                        return ArraysKt.h0(sceneArgsArr);
                    }
                }, new DefaultRootComponent$navigateAndPopUpTo$$inlined$replaceAll$default$2());
            } else {
                if (iNextIndex < 0) {
                    throw new IllegalArgumentException(vo1.j(iNextIndex, "Index must not negative, but was ").toString());
                }
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateAndPopUpTo$$inlined$popTo$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List it = (List) obj2;
                        Intrinsics.i(it, "it");
                        return CollectionsKt.x0(it, iNextIndex + 1);
                    }
                }, new DefaultRootComponent$navigateAndPopUpTo$$inlined$popTo$default$2());
                defaultStackNavigation.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List stack = (List) obj2;
                        Intrinsics.i(stack, "stack");
                        Object objP = CollectionsKt.P(stack);
                        Object obj3 = args;
                        return Intrinsics.d(objP, obj3) ? stack : CollectionsKt.d0(obj3, stack);
                    }
                }, new DefaultRootComponent$navigateAndPopUpTo$$inlined$pushNew$default$6());
            }
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void e(final SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.e(args)) {
            this.e.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$replaceCurrent$$inlined$replaceCurrent$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List it = (List) obj;
                    Intrinsics.i(it, "it");
                    return CollectionsKt.d0(args, CollectionsKt.B(it));
                }
            }, new DefaultRootComponent$replaceCurrent$$inlined$replaceCurrent$default$2());
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void f(ChaloScenes scene, boolean z) {
        final int iNextIndex;
        Intrinsics.i(scene, "scene");
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.f(scene, z)) {
            Value value = this.f;
            if (((ChildStack) value.a()).c.isEmpty()) {
                return;
            }
            GettingList gettingList = ((ChildStack) value.a()).c;
            ListIterator<T> listIterator = gettingList.listIterator(gettingList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                }
                Object obj = ((Child.Created) listIterator.previous()).f12283a;
                ChaloScenes chaloScenesC = null;
                SceneArgs sceneArgs = obj instanceof SceneArgs ? (SceneArgs) obj : null;
                if (sceneArgs != null) {
                    chaloScenesC = sceneArgs.c();
                }
                if (chaloScenesC == scene) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex >= 0) {
                if (z) {
                    iNextIndex--;
                }
                if (iNextIndex < 0) {
                    return;
                }
                if (iNextIndex < 0) {
                    throw new IllegalArgumentException(vo1.j(iNextIndex, "Index must not negative, but was ").toString());
                }
                this.e.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$popUpTo$$inlined$popTo$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List it = (List) obj2;
                        Intrinsics.i(it, "it");
                        return CollectionsKt.x0(it, iNextIndex + 1);
                    }
                }, new DefaultRootComponent$popUpTo$$inlined$popTo$default$2());
            }
        }
    }

    @Override // com.arkivanov.essenty.statekeeper.StateKeeperOwner
    /* JADX INFO: renamed from: f0 */
    public final StateKeeper getB() {
        return this.f2181a.getB();
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Value getF() {
        return this.f;
    }

    @Override // com.arkivanov.essenty.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public final Lifecycle getF12286a() {
        return this.f2181a.getF12286a();
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void h() {
        k();
    }

    public final ParentComponent i() {
        ComponentContext componentContextA = ((RootComponent.Child) ((ChildStack) this.f.a()).f12382a.b).a();
        if (componentContextA instanceof ParentComponent) {
            return (ParentComponent) componentContextA;
        }
        return null;
    }

    @Override // app.chalo.core.navigation.root.RootComponent, com.arkivanov.essenty.backhandler.BackHandlerOwner
    /* JADX INFO: renamed from: j */
    public final BackHandler getD() {
        return this.f2181a.getD();
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void k() {
        ParentComponent parentComponentI = i();
        if (parentComponentI == null || !parentComponentI.k()) {
            Value value = this.f;
            Intrinsics.i(value, "<this>");
            if (((ChildStack) value.a()).c.size() > 1) {
                this.e.b(DefaultRootComponent$navigateBack$$inlined$pop$default$1.f2192a, new DefaultRootComponent$navigateBack$$inlined$pop$default$2());
            }
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void l(SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentI = i();
        if ((parentComponentI == null || !parentComponentI.l(args)) && a(args)) {
            this.e.b(DefaultRootComponent$finishParentFlow$$inlined$pop$default$1.f2186a, new DefaultRootComponent$finishParentFlow$$inlined$pop$default$2());
        }
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void m(List args) {
        Intrinsics.i(args, "args");
        SceneArgs[] sceneArgsArr = (SceneArgs[]) args.toArray(new SceneArgs[0]);
        final Object[] objArrCopyOf = Arrays.copyOf(sceneArgsArr, sceneArgsArr.length);
        this.e.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$replaceAll$$inlined$replaceAll$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List it = (List) obj;
                Intrinsics.i(it, "it");
                return ArraysKt.h0(objArrCopyOf);
            }
        }, new DefaultRootComponent$replaceAll$$inlined$replaceAll$default$2());
    }

    @Override // app.chalo.core.navigation.root.RootComponent
    public final void n(SceneArgs args) {
        Intrinsics.i(args, "args");
        final SceneArgs[] sceneArgsArr = {args};
        this.e.b(new Function1<List<? extends SceneArgs>, List<? extends SceneArgs>>() { // from class: app.chalo.core.navigation.root.DefaultRootComponent$clearAllAndNavigateTo$$inlined$replaceAll$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List it = (List) obj;
                Intrinsics.i(it, "it");
                return ArraysKt.h0(sceneArgsArr);
            }
        }, new DefaultRootComponent$clearAllAndNavigateTo$$inlined$replaceAll$default$2());
    }
}
