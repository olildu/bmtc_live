package app.chalo.scenes;

import app.chalo.login.LoginAuthNavigationGuard;
import app.chalo.scenes.args.FreshOnClearAll;
import app.chalo.scenes.args.SplashArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.scenes.ChaloNavigationManagerImpl$postNavigationRequest$1", f = "ChaloNavigationManager.kt", l = {96}, m = "invokeSuspend", v = 1)
final class ChaloNavigationManagerImpl$postNavigationRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloNavigationRequest $navRequest;
    int label;
    final /* synthetic */ ChaloNavigationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloNavigationManagerImpl$postNavigationRequest$1(ChaloNavigationManagerImpl chaloNavigationManagerImpl, ChaloNavigationRequest chaloNavigationRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloNavigationManagerImpl;
        this.$navRequest = chaloNavigationRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloNavigationManagerImpl$postNavigationRequest$1(this.this$0, this.$navRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloNavigationManagerImpl$postNavigationRequest$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6, types: [app.chalo.scenes.args.SceneArgs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloNavigationRequest buildStack;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloNavigationManagerImpl chaloNavigationManagerImpl = this.this$0;
            LoginAuthNavigationGuard loginAuthNavigationGuard = chaloNavigationManagerImpl.b;
            ChaloNavigationRequest chaloNavigationRequest = this.$navRequest;
            if (chaloNavigationRequest instanceof ChaloNavigationRequest.Navigate) {
                ChaloNavigationRequest.Navigate navigate = (ChaloNavigationRequest.Navigate) chaloNavigationRequest;
                ChaloNavOptions chaloNavOptions = navigate.b;
                Object obj2 = navigate.f9216a;
                ChaloNavOptions chaloNavOptions2 = null;
                PopUpToConfig popUpToConfig = chaloNavOptions != null ? chaloNavOptions.c : null;
                ?? args = obj2;
                if ((popUpToConfig instanceof PopUpToConfig.ClearAll) && ((PopUpToConfig.ClearAll) popUpToConfig).f9218a && (obj2 instanceof FreshOnClearAll)) {
                    args = obj2;
                    args = obj2;
                    String message = "Auto-freshening " + Reflection.a(obj2.getClass()).f() + " for ClearAll";
                    Intrinsics.i(message, "message");
                    args = ((FreshOnClearAll) obj2).a();
                }
                if (chaloNavOptions != null) {
                    PopUpToConfig popUpToConfig2 = chaloNavOptions.c;
                    boolean z = chaloNavOptions.f9211a;
                    boolean z2 = chaloNavOptions.b;
                    Intrinsics.i(popUpToConfig2, "popUpToConfig");
                    chaloNavOptions2 = new ChaloNavOptions(z, z2, popUpToConfig2);
                }
                String str = navigate.c;
                Intrinsics.i(args, "args");
                buildStack = new ChaloNavigationRequest.Navigate(args, chaloNavOptions2, str);
            } else if (chaloNavigationRequest instanceof ChaloNavigationRequest.GoBack) {
                buildStack = new ChaloNavigationRequest.GoBack(((ChaloNavigationRequest.GoBack) chaloNavigationRequest).f9215a);
            } else {
                if (!(chaloNavigationRequest instanceof ChaloNavigationRequest.BuildStack)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Object> list = ((ChaloNavigationRequest.BuildStack) chaloNavigationRequest).f9214a;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                for (Object objA : list) {
                    if (objA instanceof FreshOnClearAll) {
                        String message2 = "Auto-freshening " + Reflection.a(objA.getClass()).f() + " for BuildStack";
                        Intrinsics.i(message2, "message");
                        objA = ((FreshOnClearAll) objA).a();
                    }
                    arrayList.add(objA);
                }
                buildStack = new ChaloNavigationRequest.BuildStack(arrayList);
                if (arrayList.isEmpty()) {
                    if (chaloNavigationManagerImpl.f9212a.getG()) {
                        throw new IllegalArgumentException("Build stack should not have empty args");
                    }
                    buildStack = new ChaloNavigationRequest.BuildStack(CollectionsKt.R(SplashArgs.INSTANCE));
                }
            }
            this.label = 1;
            if (loginAuthNavigationGuard.a(buildStack, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
