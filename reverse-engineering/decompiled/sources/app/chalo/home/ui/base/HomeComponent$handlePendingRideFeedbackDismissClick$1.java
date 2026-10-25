package app.chalo.home.ui.base;

import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import app.chalo.ridefeedback.domain.DismissRideFeedbackPromptUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handlePendingRideFeedbackDismissClick$1", f = "HomeComponent.kt", l = {1727}, m = "invokeSuspend", v = 1)
final class HomeComponent$handlePendingRideFeedbackDismissClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ List<PendingRideFeedbackAppModel> $prompts;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$handlePendingRideFeedbackDismissClick$1(HomeComponent homeComponent, List list, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
        this.$prompts = list;
        this.$userId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$handlePendingRideFeedbackDismissClick$1(this.this$0, this.$prompts, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$handlePendingRideFeedbackDismissClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            DismissRideFeedbackPromptUseCase dismissRideFeedbackPromptUseCase = this.this$0.x0;
            List<PendingRideFeedbackAppModel> list = this.$prompts;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((PendingRideFeedbackAppModel) it.next()).f9066a);
            }
            String str = this.$userId;
            String str2 = this.$cityId;
            this.label = 1;
            if (dismissRideFeedbackPromptUseCase.a(str, str2, arrayList, this) == coroutineSingletons) {
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
