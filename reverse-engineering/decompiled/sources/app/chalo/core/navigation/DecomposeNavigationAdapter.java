package app.chalo.core.navigation;

import app.chalo.core.navigation.root.RootComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.SceneArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/DecomposeNavigationAdapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DecomposeNavigationAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootComponent f2157a;
    public final ChaloNavigationManager b;
    public final CoroutineContextProvider c;

    /* JADX INFO: renamed from: app.chalo.core.navigation.DecomposeNavigationAdapter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "request", "Lapp/chalo/scenes/ChaloNavigationRequest;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.core.navigation.DecomposeNavigationAdapter$1", f = "DecomposeNavigationAdapter.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<ChaloNavigationRequest, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = DecomposeNavigationAdapter.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ChaloNavigationRequest) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ChaloNavigationRequest chaloNavigationRequest = (ChaloNavigationRequest) this.L$0;
            String message = "Navigation request: " + chaloNavigationRequest;
            Intrinsics.i(message, "message");
            boolean z = chaloNavigationRequest instanceof ChaloNavigationRequest.Navigate;
            PopUpToConfig.Prev prev = PopUpToConfig.Prev.f9221a;
            PopUpToConfig.None none = PopUpToConfig.None.f9220a;
            if (z) {
                ChaloNavigationRequest.Navigate navigate = (ChaloNavigationRequest.Navigate) chaloNavigationRequest;
                RootComponent rootComponent = DecomposeNavigationAdapter.this.f2157a;
                ChaloNavOptions chaloNavOptions = navigate.b;
                SceneArgs sceneArgs = navigate.f9216a;
                PopUpToConfig popUpToConfig = chaloNavOptions != null ? chaloNavOptions.c : null;
                if (popUpToConfig == null || popUpToConfig.equals(none)) {
                    rootComponent.c(sceneArgs);
                } else if (popUpToConfig.equals(prev)) {
                    rootComponent.e(sceneArgs);
                } else if (popUpToConfig instanceof PopUpToConfig.Scene) {
                    PopUpToConfig.Scene scene = (PopUpToConfig.Scene) popUpToConfig;
                    rootComponent.d(sceneArgs, scene.f9222a, scene.b);
                } else if (popUpToConfig instanceof PopUpToConfig.ClearAll) {
                    if (((PopUpToConfig.ClearAll) popUpToConfig).f9218a) {
                        rootComponent.n(sceneArgs);
                    } else {
                        rootComponent.d(sceneArgs, ChaloScenes.SplashScreen, false);
                    }
                } else {
                    if (!(popUpToConfig instanceof PopUpToConfig.Finish)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj2 = ((PopUpToConfig.Finish) popUpToConfig).f9219a;
                    if (obj2 instanceof SceneArgs) {
                        rootComponent.b((SceneArgs) obj2, sceneArgs);
                    } else {
                        String message2 = "Given parent args " + obj2 + " is not a SceneArgs";
                        Intrinsics.i(message2, "message");
                    }
                }
            } else if (chaloNavigationRequest instanceof ChaloNavigationRequest.GoBack) {
                RootComponent rootComponent2 = DecomposeNavigationAdapter.this.f2157a;
                PopUpToConfig popUpToConfig2 = ((ChaloNavigationRequest.GoBack) chaloNavigationRequest).f9215a;
                if (popUpToConfig2 == null || popUpToConfig2.equals(none) || popUpToConfig2.equals(prev)) {
                    rootComponent2.k();
                } else if (popUpToConfig2 instanceof PopUpToConfig.Scene) {
                    PopUpToConfig.Scene scene2 = (PopUpToConfig.Scene) popUpToConfig2;
                    rootComponent2.f(scene2.f9222a, scene2.b);
                } else if (popUpToConfig2 instanceof PopUpToConfig.ClearAll) {
                    rootComponent2.k();
                } else {
                    if (!(popUpToConfig2 instanceof PopUpToConfig.Finish)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj3 = ((PopUpToConfig.Finish) popUpToConfig2).f9219a;
                    if (obj3 instanceof SceneArgs) {
                        rootComponent2.l((SceneArgs) obj3);
                    } else {
                        String message3 = "Given parent args " + obj3 + " is not a SceneArgs";
                        Intrinsics.i(message3, "message");
                    }
                }
            } else {
                if (!(chaloNavigationRequest instanceof ChaloNavigationRequest.BuildStack)) {
                    throw new NoWhenBranchMatchedException();
                }
                DecomposeNavigationAdapter.this.f2157a.m(((ChaloNavigationRequest.BuildStack) chaloNavigationRequest).f9214a);
            }
            return Unit.f17538a;
        }
    }

    public DecomposeNavigationAdapter(RootComponent rootComponent, ChaloNavigationManager chaloNavigationManager, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(coroutineContextProvider, "coroutineContextProvider");
        this.f2157a = rootComponent;
        this.b = chaloNavigationManager;
        this.c = coroutineContextProvider;
        FlowKt.A(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(chaloNavigationManager.getD(), new AnonymousClass1(null)), CoroutineScopeKt.a(coroutineContextProvider.a()));
    }
}
