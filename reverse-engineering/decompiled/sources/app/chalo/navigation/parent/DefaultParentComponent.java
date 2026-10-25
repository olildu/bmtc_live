package app.chalo.navigation.parent;

import app.chalo.navigation.child.ChildComponent;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.ComponentContextFactory;
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
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/SceneArgs;", "ARGS", "Lapp/chalo/navigation/child/ChildComponent;", "CHILD", "Lapp/chalo/navigation/parent/ParentComponent;", "Lcom/arkivanov/decompose/ComponentContext;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DefaultParentComponent<ARGS extends SceneArgs, CHILD extends ChildComponent> implements ParentComponent<ARGS, CHILD>, ComponentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentContext f6004a;
    public final DefaultStackNavigation b;
    public final Lazy c;

    public DefaultParentComponent(final SceneArgs args, ComponentContext componentContext) {
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.f6004a = componentContext;
        this.b = new DefaultStackNavigation();
        this.c = LazyKt.b(new Function0() { // from class: app.chalo.navigation.parent.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DefaultParentComponent defaultParentComponent = this.f6018a;
                return ChildStackFactoryKt.b(defaultParentComponent, defaultParentComponent.b, defaultParentComponent.a(), args, true, new DefaultParentComponent$childStack$2$1(2, defaultParentComponent, DefaultParentComponent.class, "createChild", "createChild(Lapp/chalo/scenes/args/SceneArgs;Lcom/arkivanov/decompose/ComponentContext;)Lapp/chalo/navigation/child/ChildComponent;", 0));
            }
        });
    }

    @Override // com.arkivanov.decompose.ComponentContextFactoryOwner
    /* JADX INFO: renamed from: A */
    public final ComponentContextFactory getE() {
        return this.f6004a.getE();
    }

    @Override // com.arkivanov.essenty.instancekeeper.InstanceKeeperOwner
    /* JADX INFO: renamed from: O */
    public final InstanceKeeper getC() {
        return this.f6004a.getC();
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public abstract boolean Y(SceneArgs sceneArgs);

    public abstract KSerializer a();

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean b(SceneArgs parentToFinish, final SceneArgs argsToNavigate) {
        Intrinsics.i(parentToFinish, "parentToFinish");
        Intrinsics.i(argsToNavigate, "argsToNavigate");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.b(parentToFinish, argsToNavigate)) {
            return true;
        }
        boolean zI = i(parentToFinish);
        DefaultStackNavigation defaultStackNavigation = this.b;
        if (!zI) {
            if (!Y(argsToNavigate)) {
                return false;
            }
            defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$finishAndNavigate$$inlined$pushNew$default$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List stack = (List) obj;
                    Intrinsics.i(stack, "stack");
                    Object objP = CollectionsKt.P(stack);
                    Object obj2 = argsToNavigate;
                    return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                }
            }, new DefaultParentComponent$finishAndNavigate$$inlined$pushNew$default$4());
            return true;
        }
        defaultStackNavigation.b(DefaultParentComponent$finishAndNavigate$$inlined$pop$default$1.f6005a, new DefaultParentComponent$finishAndNavigate$$inlined$pop$default$2());
        if (!Y(argsToNavigate)) {
            return false;
        }
        defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$finishAndNavigate$$inlined$pushNew$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List stack = (List) obj;
                Intrinsics.i(stack, "stack");
                Object objP = CollectionsKt.P(stack);
                Object obj2 = argsToNavigate;
                return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
            }
        }, new DefaultParentComponent$finishAndNavigate$$inlined$pushNew$default$2());
        return true;
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean c(final SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.c(args)) {
            return true;
        }
        if (!Y(args)) {
            return false;
        }
        this.b.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateTo$$inlined$pushNew$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List stack = (List) obj;
                Intrinsics.i(stack, "stack");
                Object objP = CollectionsKt.P(stack);
                Object obj2 = args;
                return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
            }
        }, new DefaultParentComponent$navigateTo$$inlined$pushNew$default$2());
        return true;
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean d(final SceneArgs args, ChaloScenes popUpTo, boolean z) {
        final int iNextIndex;
        Intrinsics.i(args, "args");
        Intrinsics.i(popUpTo, "popUpTo");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.d(args, popUpTo, z)) {
            return true;
        }
        if (!Y(args)) {
            return false;
        }
        boolean zIsEmpty = ((ChildStack) g().a()).c.isEmpty();
        DefaultStackNavigation defaultStackNavigation = this.b;
        if (zIsEmpty) {
            defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List stack = (List) obj;
                    Intrinsics.i(stack, "stack");
                    Object objP = CollectionsKt.P(stack);
                    Object obj2 = args;
                    return Intrinsics.d(objP, obj2) ? stack : CollectionsKt.d0(obj2, stack);
                }
            }, new DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$2());
            return true;
        }
        GettingList gettingList = ((ChildStack) g().a()).c;
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
            defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    List stack = (List) obj2;
                    Intrinsics.i(stack, "stack");
                    Object objP = CollectionsKt.P(stack);
                    Object obj3 = args;
                    return Intrinsics.d(objP, obj3) ? stack : CollectionsKt.d0(obj3, stack);
                }
            }, new DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$4());
            return true;
        }
        if (z) {
            iNextIndex--;
        }
        if (iNextIndex < 0) {
            final SceneArgs[] sceneArgsArr = {args};
            defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateAndPopUpTo$$inlined$replaceAll$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    List it = (List) obj2;
                    Intrinsics.i(it, "it");
                    return ArraysKt.h0(sceneArgsArr);
                }
            }, new DefaultParentComponent$navigateAndPopUpTo$$inlined$replaceAll$default$2());
            return true;
        }
        if (iNextIndex < 0) {
            throw new IllegalArgumentException(vo1.j(iNextIndex, "Index must not negative, but was ").toString());
        }
        defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateAndPopUpTo$$inlined$popTo$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List it = (List) obj2;
                Intrinsics.i(it, "it");
                return CollectionsKt.x0(it, iNextIndex + 1);
            }
        }, new DefaultParentComponent$navigateAndPopUpTo$$inlined$popTo$default$2());
        defaultStackNavigation.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List stack = (List) obj2;
                Intrinsics.i(stack, "stack");
                Object objP = CollectionsKt.P(stack);
                Object obj3 = args;
                return Intrinsics.d(objP, obj3) ? stack : CollectionsKt.d0(obj3, stack);
            }
        }, new DefaultParentComponent$navigateAndPopUpTo$$inlined$pushNew$default$6());
        return true;
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean e(final SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.e(args)) {
            return true;
        }
        if (!Y(args)) {
            return false;
        }
        this.b.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$replaceCurrent$$inlined$replaceCurrent$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List it = (List) obj;
                Intrinsics.i(it, "it");
                return CollectionsKt.d0(args, CollectionsKt.B(it));
            }
        }, new DefaultParentComponent$replaceCurrent$$inlined$replaceCurrent$default$2());
        return true;
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean f(ChaloScenes scene, boolean z) {
        final int iNextIndex;
        Intrinsics.i(scene, "scene");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.f(scene, z)) {
            return true;
        }
        if (((ChildStack) g().a()).c.isEmpty()) {
            return false;
        }
        GettingList gettingList = ((ChildStack) g().a()).c;
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
            if (iNextIndex >= 0) {
                if (iNextIndex < 0) {
                    throw new IllegalArgumentException(vo1.j(iNextIndex, "Index must not negative, but was ").toString());
                }
                this.b.b(new Function1<List<SceneArgs>, List<SceneArgs>>() { // from class: app.chalo.navigation.parent.DefaultParentComponent$popUpTo$$inlined$popTo$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        List it = (List) obj2;
                        Intrinsics.i(it, "it");
                        return CollectionsKt.x0(it, iNextIndex + 1);
                    }
                }, new DefaultParentComponent$popUpTo$$inlined$popTo$default$2());
                return true;
            }
        }
        return false;
    }

    @Override // com.arkivanov.essenty.statekeeper.StateKeeperOwner
    /* JADX INFO: renamed from: f0 */
    public final StateKeeper getB() {
        return this.f6004a.getB();
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final Value g() {
        return (Value) this.c.getValue();
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final ParentComponent g0() {
        ComponentContext componentContextA = ((ChildComponent) ((ChildStack) g().a()).f12382a.b).a();
        if (componentContextA instanceof ParentComponent) {
            return (ParentComponent) componentContextA;
        }
        return null;
    }

    @Override // com.arkivanov.essenty.lifecycle.LifecycleOwner
    /* JADX INFO: renamed from: getLifecycle */
    public final Lifecycle getF12286a() {
        return this.f6004a.getF12286a();
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean h() {
        return k();
    }

    public final boolean i(SceneArgs sceneArgs) {
        for (ParentComponent parentComponentG0 = g0(); parentComponentG0 != null; parentComponentG0 = parentComponentG0.g0()) {
            if (parentComponentG0.Y(sceneArgs)) {
                return ((ChildStack) g().a()).c.size() > 1;
            }
        }
        return false;
    }

    @Override // com.arkivanov.essenty.backhandler.BackHandlerOwner
    /* JADX INFO: renamed from: j */
    public final BackHandler getD() {
        return this.f6004a.getD();
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean k() {
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.k()) {
            return true;
        }
        Value valueG = g();
        Intrinsics.i(valueG, "<this>");
        if (((ChildStack) valueG.a()).c.size() <= 1) {
            return false;
        }
        this.b.b(DefaultParentComponent$navigateBack$$inlined$pop$default$1.f6014a, new DefaultParentComponent$navigateBack$$inlined$pop$default$2());
        return true;
    }

    @Override // app.chalo.navigation.parent.ParentComponent
    public final boolean l(SceneArgs args) {
        Intrinsics.i(args, "args");
        ParentComponent parentComponentG0 = g0();
        if (parentComponentG0 != null && parentComponentG0.l(args)) {
            return true;
        }
        if (!i(args)) {
            return false;
        }
        this.b.b(DefaultParentComponent$finishParentFlow$$inlined$pop$default$1.f6008a, new DefaultParentComponent$finishParentFlow$$inlined$pop$default$2());
        return true;
    }

    public abstract ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext);
}
