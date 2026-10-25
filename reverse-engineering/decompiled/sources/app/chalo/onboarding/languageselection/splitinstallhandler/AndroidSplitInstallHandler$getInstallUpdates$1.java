package app.chalo.onboarding.languageselection.splitinstallhandler;

import app.chalo.onboarding.languageselection.splitinstallhandler.SplitInstallResult;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import defpackage.l3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler$getInstallUpdates$1", f = "AndroidSplitInstallHandler.kt", l = {47}, m = "invokeSuspend", v = 1)
final class AndroidSplitInstallHandler$getInstallUpdates$1 extends SuspendLambda implements Function2<ProducerScope<? super SplitInstallResult>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidSplitInstallHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSplitInstallHandler$getInstallUpdates$1(AndroidSplitInstallHandler androidSplitInstallHandler, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidSplitInstallHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidSplitInstallHandler$getInstallUpdates$1 androidSplitInstallHandler$getInstallUpdates$1 = new AndroidSplitInstallHandler$getInstallUpdates$1(this.this$0, continuation);
        androidSplitInstallHandler$getInstallUpdates$1.L$0 = obj;
        return androidSplitInstallHandler$getInstallUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidSplitInstallHandler$getInstallUpdates$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final AndroidSplitInstallHandler androidSplitInstallHandler = this.this$0;
            SplitInstallStateUpdatedListener splitInstallStateUpdatedListener = new SplitInstallStateUpdatedListener() { // from class: c5
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public final void a(Object obj2) {
                    Object obj3;
                    androidSplitInstallHandler.getClass();
                    switch (((SplitInstallSessionState) obj2).h()) {
                        case 1:
                            obj3 = SplitInstallResult.Pending.f6675a;
                            break;
                        case 2:
                            obj3 = SplitInstallResult.Downloading.f6671a;
                            break;
                        case 3:
                            obj3 = SplitInstallResult.Downloaded.f6670a;
                            break;
                        case 4:
                            obj3 = SplitInstallResult.Installing.f6674a;
                            break;
                        case 5:
                            obj3 = SplitInstallResult.Installed.f6673a;
                            break;
                        case 6:
                            obj3 = SplitInstallResult.Failed.f6672a;
                            break;
                        case 7:
                            obj3 = SplitInstallResult.Canceled.f6668a;
                            break;
                        case 8:
                            obj3 = SplitInstallResult.RequiresUserConfirmation.f6676a;
                            break;
                        case 9:
                            obj3 = SplitInstallResult.Canceling.f6669a;
                            break;
                        default:
                            obj3 = SplitInstallResult.Unknown.f6677a;
                            break;
                    }
                    producerScope.mo7576trySendJP2dKIU(obj3);
                }
            };
            androidSplitInstallHandler.f6664a.d(splitInstallStateUpdatedListener);
            l3 l3Var = new l3(1, this.this$0, splitInstallStateUpdatedListener);
            this.label = 1;
            if (ProduceKt.a(producerScope, l3Var, this) == coroutineSingletons) {
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
