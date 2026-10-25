package app.chalo.home.ui.common;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.home.domain.UpdateDebugBuildEnvironmentUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.common.ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1", f = "ChangeEnvironmentDialog.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend", v = 1)
final class ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBuildConfig $chaloBuildConfig;
    final /* synthetic */ Environment $it;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ UpdateDebugBuildEnvironmentUseCase $updateDebugBuildEnvironmentUseCase;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1(Environment environment, ChaloBuildConfig chaloBuildConfig, UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$it = environment;
        this.$chaloBuildConfig = chaloBuildConfig;
        this.$updateDebugBuildEnvironmentUseCase = updateDebugBuildEnvironmentUseCase;
        this.$onDismissRequest = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1(this.$it, this.$chaloBuildConfig, this.$updateDebugBuildEnvironmentUseCase, this.$onDismissRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeEnvironmentDialogKt$ChangeEnvironmentDialog$2$1$1$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$it == this.$chaloBuildConfig.getF885a()) {
                this.$onDismissRequest.invoke();
                return Unit.f17538a;
            }
            UpdateDebugBuildEnvironmentUseCase updateDebugBuildEnvironmentUseCase = this.$updateDebugBuildEnvironmentUseCase;
            Environment environment = this.$it;
            this.label = 1;
            if (updateDebugBuildEnvironmentUseCase.a(environment, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new RuntimeException("");
    }
}
