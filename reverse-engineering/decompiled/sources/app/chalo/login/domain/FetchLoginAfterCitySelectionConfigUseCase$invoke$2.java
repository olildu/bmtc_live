package app.chalo.login.domain;

import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.login.data.models.app.LoginAfterCitySelectionRemoteConfigModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/login/data/models/app/LoginAfterCitySelectionRemoteConfigModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.domain.FetchLoginAfterCitySelectionConfigUseCase$invoke$2", f = "FetchLoginAfterCitySelectionConfigUseCase.kt", l = {23}, m = "invokeSuspend", v = 1)
final class FetchLoginAfterCitySelectionConfigUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LoginAfterCitySelectionRemoteConfigModel>, Object> {
    final /* synthetic */ LoginAfterCitySelectionRemoteConfigModel $abConfig;
    int label;
    final /* synthetic */ FetchLoginAfterCitySelectionConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLoginAfterCitySelectionConfigUseCase$invoke$2(FetchLoginAfterCitySelectionConfigUseCase fetchLoginAfterCitySelectionConfigUseCase, LoginAfterCitySelectionRemoteConfigModel loginAfterCitySelectionRemoteConfigModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchLoginAfterCitySelectionConfigUseCase;
        this.$abConfig = loginAfterCitySelectionRemoteConfigModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchLoginAfterCitySelectionConfigUseCase$invoke$2(this.this$0, this.$abConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchLoginAfterCitySelectionConfigUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase = this.this$0.b;
            LoginAfterCitySelectionRemoteConfigModel loginAfterCitySelectionRemoteConfigModel = this.$abConfig;
            String str = loginAfterCitySelectionRemoteConfigModel.b;
            String str2 = loginAfterCitySelectionRemoteConfigModel.f5193a;
            this.label = 1;
            obj = checkIfExperimentEnabledUseCase.a(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return ((Boolean) obj).booleanValue() ? this.$abConfig : FetchLoginAfterCitySelectionConfigUseCase.d;
    }
}
