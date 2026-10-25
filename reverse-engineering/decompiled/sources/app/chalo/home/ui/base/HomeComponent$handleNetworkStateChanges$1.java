package app.chalo.home.ui.base;

import app.chalo.features.network.NetworkConnectionType;
import app.chalo.home.SnackBarData;
import app.chalo.home.SnackBarType;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleNetworkStateChanges$1", f = "HomeComponent.kt", l = {2510}, m = "invokeSuspend", v = 1)
final class HomeComponent$handleNetworkStateChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$handleNetworkStateChanges$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "networkState", "Lapp/chalo/features/network/NetworkConnectionType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleNetworkStateChanges$1$1", f = "HomeComponent.kt", l = {2520, 2521}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<NetworkConnectionType, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ HomeComponent this$0;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$handleNetworkStateChanges$1$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3198a;

            static {
                int[] iArr = new int[NetworkConnectionType.values().length];
                try {
                    iArr[NetworkConnectionType.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NetworkConnectionType.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NetworkConnectionType.DISCONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3198a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeComponent homeComponent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = homeComponent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((NetworkConnectionType) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HomeScreenInfoHelper homeScreenInfoHelper;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    homeScreenInfoHelper = (HomeScreenInfoHelper) this.L$0;
                    ResultKt.b(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$1;
                    homeScreenInfoHelper = (HomeScreenInfoHelper) this.L$0;
                    ResultKt.b(obj);
                }
                homeScreenInfoHelper.a(new SnackBarData(str, (String) obj, SnackBarType.NETWORK_ERROR));
                return Unit.f17538a;
            }
            ResultKt.b(obj);
            int i2 = WhenMappings.f3198a[((NetworkConnectionType) this.L$0).ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                HomeComponent homeComponent = this.this$0;
                homeScreenInfoHelper = homeComponent.p;
                this.L$0 = homeScreenInfoHelper;
                this.label = 1;
                obj = homeComponent.q.b(StringEnum.CHECK_CONNECTION, new Object[0], this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            this.this$0.p.q();
            return Unit.f17538a;
            String str2 = (String) obj;
            this.L$0 = homeScreenInfoHelper;
            this.L$1 = str2;
            this.label = 2;
            Object objB = this.this$0.q.b(StringEnum.DISMISS, new Object[0], this);
            if (objB != coroutineSingletons) {
                str = str2;
                obj = objB;
                homeScreenInfoHelper.a(new SnackBarData(str, (String) obj, SnackBarType.NETWORK_ERROR));
                return Unit.f17538a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$handleNetworkStateChanges$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$handleNetworkStateChanges$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$handleNetworkStateChanges$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            HomeComponent homeComponent = this.this$0;
            StateFlow stateFlowB = homeComponent.N.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (homeComponent.o0(stateFlowB, anonymousClass1, this) == coroutineSingletons) {
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
