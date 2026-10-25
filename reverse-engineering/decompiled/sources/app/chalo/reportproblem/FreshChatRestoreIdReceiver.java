package app.chalo.reportproblem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.features.freshchat.FreshchatUserDataHandler;
import app.chalo.providers.CoroutineContextProvider;
import co.touchlab.crashkios.crashlytics.CrashlyticsKotlin;
import com.freshchat.consumer.sdk.Freshchat;
import defpackage.xx;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/reportproblem/FreshChatRestoreIdReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshChatRestoreIdReceiver extends BroadcastReceiver implements KoinComponent {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9009a;
    public final Lazy b;
    public final Object c;
    public final Object d;

    /* JADX INFO: renamed from: app.chalo.reportproblem.FreshChatRestoreIdReceiver$onReceive$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.reportproblem.FreshChatRestoreIdReceiver$onReceive$1", f = "FreshChatRestoreIdReceiver.kt", l = {31}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return FreshChatRestoreIdReceiver.this.new AnonymousClass1(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                FreshChatRestoreIdReceiver freshChatRestoreIdReceiver = FreshChatRestoreIdReceiver.this;
                int i2 = FreshChatRestoreIdReceiver.e;
                freshChatRestoreIdReceiver.getClass();
                try {
                    Context context = this.$context;
                    if (context != null) {
                        FreshChatRestoreIdReceiver freshChatRestoreIdReceiver2 = FreshChatRestoreIdReceiver.this;
                        if (((SdkIntegrationPolicyManager) freshChatRestoreIdReceiver2.d.getValue()).f1078a.d) {
                            String restoreId = Freshchat.getInstance(context).getUser().getRestoreId();
                            FreshchatUserDataHandler freshchatUserDataHandler = (FreshchatUserDataHandler) freshChatRestoreIdReceiver2.c.getValue();
                            Intrinsics.f(restoreId);
                            this.label = 1;
                            if (freshchatUserDataHandler.a(restoreId, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } catch (Exception e) {
                    CrashlyticsKotlin.f11351a.getClass();
                    CrashlyticsKotlin.a().c(e);
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

    public FreshChatRestoreIdReceiver() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f9009a = LazyKt.a(lazyThreadSafetyMode, new Function0<CoroutineContextProvider>() { // from class: app.chalo.reportproblem.FreshChatRestoreIdReceiver$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9010a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CoroutineContextProvider.class), null, null);
            }
        });
        this.b = LazyKt.b(new xx(this, 14));
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<FreshchatUserDataHandler>() { // from class: app.chalo.reportproblem.FreshChatRestoreIdReceiver$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9011a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(FreshchatUserDataHandler.class), null, null);
            }
        });
        this.d = LazyKt.a(lazyThreadSafetyMode, new Function0<SdkIntegrationPolicyManager>() { // from class: app.chalo.reportproblem.FreshChatRestoreIdReceiver$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9012a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(SdkIntegrationPolicyManager.class), null, null);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BuildersKt.d((CoroutineScope) this.b.getValue(), null, null, new AnonymousClass1(context, null), 3);
    }
}
