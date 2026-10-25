package app.chalo.core.database.dao;

import app.cash.sqldelight.QueryKt;
import app.cash.sqldelight.coroutines.FlowQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.core.Instant_ticket_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_child_table;
import app.chalo.core.Multi_modal_group_ticket_child_tableQueries;
import app.chalo.core.Multi_modal_group_ticket_table;
import app.chalo.core.Multi_modal_group_ticket_tableQueries;
import app.chalo.core.Ondc_metro_ticket_tableQueries;
import app.chalo.core.database.mappers.InstantTicketEntityMapperKt;
import app.chalo.core.database.mappers.MultiModalGroupTicketEntityMapper;
import app.chalo.core.database.mappers.OndcMetroTicketEntityMapperKt;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import defpackage.or;
import defpackage.wi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/database/dao/MultiModalGroupTicketDaoImpl;", "Lapp/chalo/multimodalticket/data/dao/MultiModalGroupTicketDao;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketDaoImpl implements MultiModalGroupTicketDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Multi_modal_group_ticket_tableQueries f2055a;
    public final Multi_modal_group_ticket_child_tableQueries b;
    public final Instant_ticket_tableQueries c;
    public final Ondc_metro_ticket_tableQueries d;
    public final CoroutineContextProvider e;

    public MultiModalGroupTicketDaoImpl(Multi_modal_group_ticket_tableQueries groupQueries, Multi_modal_group_ticket_child_tableQueries childQueries, Instant_ticket_tableQueries instantTicketQueries, Ondc_metro_ticket_tableQueries ondcMetroTicketQueries, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(groupQueries, "groupQueries");
        Intrinsics.i(childQueries, "childQueries");
        Intrinsics.i(instantTicketQueries, "instantTicketQueries");
        Intrinsics.i(ondcMetroTicketQueries, "ondcMetroTicketQueries");
        this.f2055a = groupQueries;
        this.b = childQueries;
        this.c = instantTicketQueries;
        this.d = ondcMetroTicketQueries;
        this.e = coroutineContextProvider;
    }

    public static final void h(MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl, List list, List list2) {
        multiModalGroupTicketDaoImpl.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            multiModalGroupTicketDaoImpl.c.c0(InstantTicketEntityMapperKt.a((InstantTicketEntity) it.next()));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            multiModalGroupTicketDaoImpl.d.b0(OndcMetroTicketEntityMapperKt.a((OndcMetroTicketEntity) it2.next()));
        }
    }

    public static final Multi_modal_group_ticket_table i(MultiModalGroupTicketDaoImpl multiModalGroupTicketDaoImpl, MultiModalGroupTicketEntity multiModalGroupTicketEntity) {
        multiModalGroupTicketDaoImpl.getClass();
        String str = multiModalGroupTicketEntity.f5792a;
        String str2 = multiModalGroupTicketEntity.c;
        String str3 = multiModalGroupTicketEntity.d;
        long j = multiModalGroupTicketEntity.f;
        String str4 = multiModalGroupTicketEntity.h;
        String str5 = multiModalGroupTicketEntity.i;
        long j2 = multiModalGroupTicketEntity.k;
        long j3 = multiModalGroupTicketEntity.r;
        return new Multi_modal_group_ticket_table(str, multiModalGroupTicketEntity.b, str2, str3, multiModalGroupTicketEntity.e, j, multiModalGroupTicketEntity.g, str4, str5, multiModalGroupTicketEntity.j, j2, multiModalGroupTicketEntity.l, multiModalGroupTicketEntity.m, multiModalGroupTicketEntity.n, multiModalGroupTicketEntity.o, multiModalGroupTicketEntity.p, multiModalGroupTicketEntity.q, j3);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1] */
    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1 a(String subTicketId, String str) {
        Intrinsics.i(subTicketId, "subTicketId");
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1A = FlowQuery.a(FlowQuery.c(this.b.X(subTicketId, str)), this.e.b());
        return new Flow<MultiModalGroupTicketChildEntity>() { // from class: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2061a;

                /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1$2", f = "MultiModalGroupTicketDaoImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2061a = flowCollector;
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
                        Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table = (Multi_modal_group_ticket_child_table) CollectionsKt.H((List) obj);
                        MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity = multi_modal_group_ticket_child_table != null ? new MultiModalGroupTicketChildEntity(multi_modal_group_ticket_child_table.f1969a, (int) multi_modal_group_ticket_child_table.b, multi_modal_group_ticket_child_table.c, multi_modal_group_ticket_child_table.d, multi_modal_group_ticket_child_table.e) : null;
                        anonymousClass1.label = 1;
                        if (this.f2061a.emit(multiModalGroupTicketChildEntity, anonymousClass1) == coroutineSingletons) {
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

    /* JADX WARN: Type inference failed for: r1v6, types: [app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1] */
    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1 b() {
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1A = FlowQuery.a(FlowQuery.c(QueryKt.a(-1237496120, new String[]{"multi_modal_group_ticket_child_table"}, this.b.f697a, "multi_modal_group_ticket_child_table.sq", "getAllChildTicketReferences", "SELECT multi_modal_group_ticket_child_table.groupId, multi_modal_group_ticket_child_table.sequence, multi_modal_group_ticket_child_table.subTicketId, multi_modal_group_ticket_child_table.productType, multi_modal_group_ticket_child_table.productSubType\nFROM multi_modal_group_ticket_child_table", new wi0(new or(6), 16))), this.e.b());
        return new Flow<List<? extends MultiModalGroupTicketChildEntity>>() { // from class: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2057a;

                /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1$2", f = "MultiModalGroupTicketDaoImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2057a = flowCollector;
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
                        List<Multi_modal_group_ticket_child_table> list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        for (Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table : list) {
                            arrayList.add(new MultiModalGroupTicketChildEntity(multi_modal_group_ticket_child_table.f1969a, (int) multi_modal_group_ticket_child_table.b, multi_modal_group_ticket_child_table.c, multi_modal_group_ticket_child_table.d, multi_modal_group_ticket_child_table.e));
                        }
                        anonymousClass1.label = 1;
                        if (this.f2057a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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

    /* JADX WARN: Type inference failed for: r0v4, types: [app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1] */
    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1 c(String groupId) {
        Intrinsics.i(groupId, "groupId");
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1A = FlowQuery.a(FlowQuery.c(this.f2055a.Y(groupId)), this.e.b());
        return new Flow<MultiModalGroupTicketEntity>() { // from class: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2063a;

                /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1$2", f = "MultiModalGroupTicketDaoImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2063a = flowCollector;
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
                        MultiModalGroupTicketEntity multiModalGroupTicketEntityB = MultiModalGroupTicketEntityMapper.b((List) obj);
                        anonymousClass1.label = 1;
                        if (this.f2063a.emit(multiModalGroupTicketEntityB, anonymousClass1) == coroutineSingletons) {
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

    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final Object d(Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.e, new MultiModalGroupTicketDaoImpl$deleteAllGroupTickets$2(this, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1] */
    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1 e(String userId, List cityIdsList) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(cityIdsList, "cityIdsList");
        List list = cityIdsList;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        final FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1A = FlowQuery.a(FlowQuery.c(this.f2055a.W(userId, arrayList)), this.e.b());
        return new Flow<List<? extends MultiModalGroupTicketEntity>>() { // from class: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2059a;

                /* JADX INFO: renamed from: app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1$2", f = "MultiModalGroupTicketDaoImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f2059a = flowCollector;
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
                        ArrayList arrayListA = MultiModalGroupTicketEntityMapper.a((List) obj);
                        anonymousClass1.label = 1;
                        if (this.f2059a.emit(arrayListA, anonymousClass1) == coroutineSingletons) {
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

    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final Object f(String str, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.e, new MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTickets$2(this, str, list, arrayList, arrayList2, arrayList3, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.multimodalticket.data.dao.MultiModalGroupTicketDao
    public final Object g(MultiModalGroupTicketEntity multiModalGroupTicketEntity, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.e, new MultiModalGroupTicketDaoImpl$deleteAndInsertGroupTicket$2(this, multiModalGroupTicketEntity, arrayList, arrayList2, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    public final void j(List list) {
        if (list.isEmpty()) {
            return;
        }
        List<Multi_modal_group_ticket_child_table> listB = this.b.Z(list).b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Multi_modal_group_ticket_child_table multi_modal_group_ticket_child_table : listB) {
            String str = multi_modal_group_ticket_child_table.e;
            String str2 = multi_modal_group_ticket_child_table.c;
            if (Intrinsics.d(str, "instantTicket")) {
                arrayList.add(str2);
            } else if (Intrinsics.d(str, "ondcMetroTicket")) {
                arrayList2.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            this.c.W(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.d.W(arrayList2);
    }
}
