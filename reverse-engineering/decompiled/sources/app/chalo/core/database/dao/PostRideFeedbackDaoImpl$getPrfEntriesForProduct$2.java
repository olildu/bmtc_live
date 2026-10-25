package app.chalo.core.database.dao;

import app.chalo.core.Post_ride_feedback_table;
import app.chalo.core.database.mappers.PostRideFeedbackEntityMapperKt;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/ridefeedback/data/dao/PostRideFeedbackEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2", f = "PostRideFeedbackDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends PostRideFeedbackEntity>>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $productSubType;
    final /* synthetic */ String $productType;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ PostRideFeedbackDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2(PostRideFeedbackDaoImpl postRideFeedbackDaoImpl, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.this$0 = postRideFeedbackDaoImpl;
        this.$productType = str;
        this.$productSubType = str2;
        this.$userId = str3;
        this.$cityId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2(this.this$0, this.$productType, this.$productSubType, this.$userId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List listB = this.this$0.f2066a.X(this.$productType, this.$productSubType, this.$userId, this.$cityId).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(PostRideFeedbackEntityMapperKt.a((Post_ride_feedback_table) it.next()));
        }
        return arrayList;
    }
}
