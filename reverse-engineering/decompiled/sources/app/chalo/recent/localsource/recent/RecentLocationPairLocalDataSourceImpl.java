package app.chalo.recent.localsource.recent;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.contract.BasicInfoContract;
import app.chalo.recent.database.dao.recent.RecentLocationPairDao;
import app.chalo.recent.database.entities.RecentLocationPairEntity;
import app.chalo.recent.model.ConvertToAppModelKt;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/recent/localsource/recent/RecentLocationPairLocalDataSourceImpl;", "Lapp/chalo/recent/localsource/recent/RecentLocationPairLocalDataSource;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentLocationPairLocalDataSourceImpl implements RecentLocationPairLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentLocationPairDao f8962a;
    public final BasicInfoContract b;

    public RecentLocationPairLocalDataSourceImpl(RecentLocationPairDao recentLocationPairDao, BasicInfoContract basicInfoContract) {
        this.f8962a = recentLocationPairDao;
        this.b = basicInfoContract;
    }

    @Override // app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource
    public final Object a(String str, String str2, long j, Continuation continuation) {
        Object objA = this.f8962a.a(str, str2, j, continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r2 == r4) goto L42;
     */
    @Override // app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.recent.model.app.RecentLocationPairAppModel r23, boolean r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl.b(app.chalo.recent.model.app.RecentLocationPairAppModel, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource
    public final Object c(String str, Continuation continuation) {
        return this.f8962a.d(str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1] */
    @Override // app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource
    public final RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1 d(int i, String str, boolean z) {
        RecentLocationPairDao recentLocationPairDao = this.f8962a;
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1E = z ? recentLocationPairDao.e(i, str) : recentLocationPairDao.f(i, str);
        return new Flow<List<? extends RecentLocationPairAppModel>>() { // from class: app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8964a;

                /* JADX INFO: renamed from: app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl$getLimitedForCity$$inlined$map$1$2", f = "RecentLocationPairLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8964a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.EmptyList] */
                /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object arrayList;
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
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(ConvertToAppModelKt.a((RecentLocationPairEntity) it.next()));
                            }
                        } else {
                            arrayList = EmptyList.f17557a;
                        }
                        anonymousClass1.label = 1;
                        if (this.f8964a.emit(arrayList, anonymousClass1) == obj3) {
                            return obj3;
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
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowQuery$mapToList$$inlined$map$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource
    public final Object e(String str, String str2, Continuation continuation) {
        Object objB = this.f8962a.b(str, str2, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }
}
