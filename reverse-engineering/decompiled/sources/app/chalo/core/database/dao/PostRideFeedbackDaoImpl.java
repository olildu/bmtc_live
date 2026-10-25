package app.chalo.core.database.dao;

import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Post_ride_feedback_table;
import app.chalo.core.Post_ride_feedback_tableQueries;
import app.chalo.core.database.mappers.PostRideFeedbackEntityMapperKt;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.ridefeedback.data.app.RideFeedbackFillStatus;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackDao;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/PostRideFeedbackDaoImpl;", "Lapp/chalo/ridefeedback/data/dao/PostRideFeedbackDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostRideFeedbackDaoImpl implements PostRideFeedbackDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Post_ride_feedback_tableQueries f2066a;
    public final CoroutineContextProvider b;

    public PostRideFeedbackDaoImpl(Post_ride_feedback_tableQueries postRideFeedbackTableQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(postRideFeedbackTableQueries, "postRideFeedbackTableQueries");
        this.f2066a = postRideFeedbackTableQueries;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object a(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$deleteAllPrfEntries$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$getEntryByBookingId$2(this, str, str2, str3, null), continuation);
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object c(String str, RideFeedbackFillStatus rideFeedbackFillStatus, String str2, String str3, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$updateFillStatus$2(this, rideFeedbackFillStatus, str, str2, str3, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object d(long j, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$markFeedbackComplete$2(this, j, str, str2, str3, null), continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1] */
    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1 e(String str, String str2) {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1A = FlowQuery.a(FlowQuery.c(this.f2066a.X("mobileTicket", "premiumReserveTicket", str, str2)), this.b.b());
        return new Flow<List<? extends PostRideFeedbackEntity>>() { // from class: app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2068a;

                /* JADX INFO: renamed from: app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.core.database.dao.PostRideFeedbackDaoImpl$getPrfEntriesForProductFlow$$inlined$map$1$2", f = "PostRideFeedbackDaoImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f2068a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            arrayList.add(PostRideFeedbackEntityMapperKt.a((Post_ride_feedback_table) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f2068a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
                Object objCollect = flowQuery$mapToList$$inlined$map$1A.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object f(String str, String str2, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$getPrfEntriesForProduct$2(this, "mobileTicket", "premiumReserveTicket", str, str2, null), continuation);
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object g(PostRideFeedbackEntity postRideFeedbackEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$insertOrUpdatePrfEntry$2(this, postRideFeedbackEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.ridefeedback.data.dao.PostRideFeedbackDao
    public final Object h(List list, String str, String str2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new PostRideFeedbackDaoImpl$deletePrfEntries$2(this, list, "mobileTicket", "premiumReserveTicket", str, str2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
