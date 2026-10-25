package app.chalo.ridefeedback.domain;

import app.chalo.ridefeedback.data.RideFeedbackRepository;
import app.chalo.ridefeedback.data.dao.RideFeedbackOfflineQueueEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridefeedback.domain.RetryPendingRideFeedbackUseCase$retryPendingRideFeedback$3", f = "RetryPendingRideFeedbackUseCase.kt", l = {87, 90}, m = "invokeSuspend", v = 1)
final class RetryPendingRideFeedbackUseCase$retryPendingRideFeedback$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<RideFeedbackOfflineQueueEntity> $succeededEntries;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RetryPendingRideFeedbackUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryPendingRideFeedbackUseCase$retryPendingRideFeedback$3(List list, RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.$succeededEntries = list;
        this.this$0 = retryPendingRideFeedbackUseCase;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RetryPendingRideFeedbackUseCase$retryPendingRideFeedback$3(this.$succeededEntries, this.this$0, this.$userId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RetryPendingRideFeedbackUseCase$retryPendingRideFeedback$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:28:0x00c9->B:38:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterator it;
        RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase;
        RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase2;
        Iterator it2;
        RideFeedbackRepository rideFeedbackRepository;
        String str2;
        long j;
        String str3;
        String str4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                it = (Iterator) this.L$2;
                str = (String) this.L$1;
                retryPendingRideFeedbackUseCase = (RetryPendingRideFeedbackUseCase) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.L$1;
                retryPendingRideFeedbackUseCase2 = (RetryPendingRideFeedbackUseCase) this.L$0;
                ResultKt.b(obj);
            }
            while (it2.hasNext()) {
                RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity = (RideFeedbackOfflineQueueEntity) it2.next();
                rideFeedbackRepository = retryPendingRideFeedbackUseCase2.f9087a;
                str2 = rideFeedbackOfflineQueueEntity.f9072a;
                j = rideFeedbackOfflineQueueEntity.k;
                str3 = rideFeedbackOfflineQueueEntity.b;
                str4 = rideFeedbackOfflineQueueEntity.c;
                this.L$0 = retryPendingRideFeedbackUseCase2;
                this.L$1 = it2;
                this.L$2 = null;
                this.label = 2;
                if (rideFeedbackRepository.d(j, str2, str3, str4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        List<RideFeedbackOfflineQueueEntity> list = this.$succeededEntries;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str5 = ((RideFeedbackOfflineQueueEntity) obj2).c;
            Object arrayList = linkedHashMap.get(str5);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str5, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase3 = this.this$0;
        str = this.$userId;
        it = linkedHashMap.entrySet().iterator();
        retryPendingRideFeedbackUseCase = retryPendingRideFeedbackUseCase3;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str6 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            RideFeedbackRepository rideFeedbackRepository2 = retryPendingRideFeedbackUseCase.f9087a;
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((RideFeedbackOfflineQueueEntity) it3.next()).f9072a);
            }
            this.L$0 = retryPendingRideFeedbackUseCase;
            this.L$1 = str;
            this.L$2 = it;
            this.label = 1;
            if (rideFeedbackRepository2.i(arrayList2, str, str6, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List<RideFeedbackOfflineQueueEntity> list4 = this.$succeededEntries;
        retryPendingRideFeedbackUseCase2 = this.this$0;
        it2 = list4.iterator();
        while (it2.hasNext()) {
            RideFeedbackOfflineQueueEntity rideFeedbackOfflineQueueEntity2 = (RideFeedbackOfflineQueueEntity) it2.next();
            rideFeedbackRepository = retryPendingRideFeedbackUseCase2.f9087a;
            str2 = rideFeedbackOfflineQueueEntity2.f9072a;
            j = rideFeedbackOfflineQueueEntity2.k;
            str3 = rideFeedbackOfflineQueueEntity2.b;
            str4 = rideFeedbackOfflineQueueEntity2.c;
            this.L$0 = retryPendingRideFeedbackUseCase2;
            this.L$1 = it2;
            this.L$2 = null;
            this.label = 2;
            if (rideFeedbackRepository.d(j, str2, str3, str4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
