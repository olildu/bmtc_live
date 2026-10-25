package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreferenceKt;
import app.chalo.usercommutepreference.domain.UpdateCommutePreferenceUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.ah;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2", f = "ChaloBusUserProfileSurveyComponent.kt", l = {539}, m = "invokeSuspend", v = 1)
final class ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusUserProfileSurveyComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2(ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusUserProfileSurveyComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusUserProfileSurveyComponent$saveAndShowSuccess$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PBUserProfileSurveyPreference pBUserProfileSurveyPreferenceA = PBUserProfileSurveyPreferenceKt.a(((ChaloBusUserProfileSurveyDataState) this.this$0.f.getValue()).f1206a, ((ChaloBusUserProfileSurveyDataState) this.this$0.f.getValue()).b);
            UpdateCommutePreferenceUseCase updateCommutePreferenceUseCase = this.this$0.m;
            this.label = 1;
            obj = updateCommutePreferenceUseCase.b(pBUserProfileSurveyPreferenceA, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent = this.this$0;
            chaloBusUserProfileSurveyComponent.getClass();
            ChaloBusUserProfileSurveyComponent.Q0(chaloBusUserProfileSurveyComponent, "pbUserProfileSurvey save success");
            this.this$0.E0(new ah(24));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloBusUserProfileSurveyComponent chaloBusUserProfileSurveyComponent2 = this.this$0;
            String strA = UpdateCommutePreferenceUseCase.UpdateCommutePreferenceError.Companion.a((UpdateCommutePreferenceUseCase.UpdateCommutePreferenceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a);
            chaloBusUserProfileSurveyComponent2.getClass();
            chaloBusUserProfileSurveyComponent2.P0("pbUserProfileSurvey save failure", MapsKt.h(new Pair("errorReason", strA)));
            this.this$0.E0(new ah(25));
        }
        return Unit.f17538a;
    }
}
