package app.chalo.multimodalticket.domain;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketEntityKt;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.multimodalticket.data.model.GroupTicketLegFareDetailEntityModel;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketChildEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStatus;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketStopDetails;
import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.ondc.repository.OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1;
import app.chalo.productbooking.common.data.models.entity.FareBreakupEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModel;
import app.chalo.productbooking.common.data.models.entity.RefundInfoEntityModelKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/domain/MultiModalGroupTicketEntityToAppModelConverter;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketEntityToAppModelConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRepository f5888a;
    public final OndcRepository b;

    public MultiModalGroupTicketEntityToAppModelConverter(InstantTicketRepository instantTicketRepository, OndcRepository ondcRepository) {
        this.f5888a = instantTicketRepository;
        this.b = ondcRepository;
    }

    public static final Flow a(final MultiModalGroupTicketEntityToAppModelConverter multiModalGroupTicketEntityToAppModelConverter, final MultiModalGroupTicketEntity multiModalGroupTicketEntity) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        multiModalGroupTicketEntityToAppModelConverter.getClass();
        if (multiModalGroupTicketEntity == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
        }
        List list = multiModalGroupTicketEntity.s;
        if (multiModalGroupTicketEntity.r == list.size()) {
            int size = list.size();
            List<MultiModalGroupTicketChildEntity> list2 = list;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (hashSet.add(Integer.valueOf(((MultiModalGroupTicketChildEntity) obj).b))) {
                    arrayList.add(obj);
                }
            }
            if (size == arrayList.size()) {
                int size2 = list.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity = (MultiModalGroupTicketChildEntity) obj2;
                    if (hashSet2.add(new Pair(multiModalGroupTicketChildEntity.c, multiModalGroupTicketChildEntity.e))) {
                        arrayList2.add(obj2);
                    }
                }
                if (size2 == arrayList2.size()) {
                    if (list.isEmpty()) {
                        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(b(multiModalGroupTicketEntity, EmptyList.f17557a));
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list2, 10));
                    for (final MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity2 : list2) {
                        String str = multiModalGroupTicketChildEntity2.d;
                        String str2 = multiModalGroupTicketChildEntity2.c;
                        String str3 = multiModalGroupTicketChildEntity2.e;
                        if (Intrinsics.d(str, "mobileTicket") && Intrinsics.d(str3, "instantTicket")) {
                            final Flow flowH = multiModalGroupTicketEntityToAppModelConverter.f5888a.h(str2);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<MultiModalGroupTicketChildAppModel.InstantTicketChild>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$1

                                /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$1$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f5892a;
                                    public final /* synthetic */ MultiModalGroupTicketChildEntity b;

                                    /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$1$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$1$2", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {50}, m = "emit", v = 1)
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

                                    public AnonymousClass2(FlowCollector flowCollector, MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity) {
                                        this.f5892a = flowCollector;
                                        this.b = multiModalGroupTicketChildEntity;
                                    }

                                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        MultiModalGroupTicketChildAppModel.InstantTicketChild instantTicketChild;
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
                                            InstantTicketEntity instantTicketEntity = (InstantTicketEntity) obj;
                                            if (instantTicketEntity != null) {
                                                instantTicketChild = new MultiModalGroupTicketChildAppModel.InstantTicketChild(this.b.b, InstantTicketEntityKt.a(instantTicketEntity));
                                            } else {
                                                instantTicketChild = null;
                                            }
                                            anonymousClass1.label = 1;
                                            if (this.f5892a.emit(instantTicketChild, anonymousClass1) == coroutineSingletons) {
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
                                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                    Object objCollect = flowH.collect(new AnonymousClass2(flowCollector, multiModalGroupTicketChildEntity2), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                        } else if (Intrinsics.d(str, "mobileTicket") && Intrinsics.d(str3, "ondcMetroTicket")) {
                            final OndcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1 ondcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1M = multiModalGroupTicketEntityToAppModelConverter.b.m(str2);
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<MultiModalGroupTicketChildAppModel.OndcMetroTicketChild>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$2

                                /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$2$2, reason: invalid class name */
                                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                public final class AnonymousClass2<T> implements FlowCollector {

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ FlowCollector f5894a;
                                    public final /* synthetic */ MultiModalGroupTicketChildEntity b;

                                    /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$2$2$1, reason: invalid class name */
                                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                                    @DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$resolveChild$$inlined$map$2$2", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {50}, m = "emit", v = 1)
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

                                    public AnonymousClass2(FlowCollector flowCollector, MultiModalGroupTicketChildEntity multiModalGroupTicketChildEntity) {
                                        this.f5894a = flowCollector;
                                        this.b = multiModalGroupTicketChildEntity;
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
                                            OndcMetroTicketAppModel ondcMetroTicketAppModel = (OndcMetroTicketAppModel) obj;
                                            MultiModalGroupTicketChildAppModel.OndcMetroTicketChild ondcMetroTicketChild = ondcMetroTicketAppModel != null ? new MultiModalGroupTicketChildAppModel.OndcMetroTicketChild(this.b.b, ondcMetroTicketAppModel) : null;
                                            anonymousClass1.label = 1;
                                            if (this.f5894a.emit(ondcMetroTicketChild, anonymousClass1) == coroutineSingletons) {
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
                                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                    Object objCollect = ondcRepositoryImpl$getOndcMetroTicketAsFlow$$inlined$map$1M.collect(new AnonymousClass2(flowCollector, multiModalGroupTicketChildEntity2), continuation);
                                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                                }
                            };
                        } else {
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
                        }
                        arrayList3.add(flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2);
                    }
                    final MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1 multiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1 = new MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1((Flow[]) CollectionsKt.D0(arrayList3).toArray(new Flow[0]));
                    return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new Flow<MultiModalGroupTicketAppModel>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$map$1

                        /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        public final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ FlowCollector f5898a;
                            public final /* synthetic */ MultiModalGroupTicketEntityToAppModelConverter b;
                            public final /* synthetic */ MultiModalGroupTicketEntity c;

                            /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$map$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$map$1$2", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {50}, m = "emit", v = 1)
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

                            public AnonymousClass2(FlowCollector flowCollector, MultiModalGroupTicketEntityToAppModelConverter multiModalGroupTicketEntityToAppModelConverter, MultiModalGroupTicketEntity multiModalGroupTicketEntity) {
                                this.f5898a = flowCollector;
                                this.b = multiModalGroupTicketEntityToAppModelConverter;
                                this.c = multiModalGroupTicketEntity;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                MultiModalGroupTicketAppModel multiModalGroupTicketAppModelB;
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
                                    List list = (List) obj;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator<T> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                ArrayList arrayListD = CollectionsKt.D(list);
                                                this.b.getClass();
                                                multiModalGroupTicketAppModelB = MultiModalGroupTicketEntityToAppModelConverter.b(this.c, arrayListD);
                                                break;
                                            }
                                            if (((MultiModalGroupTicketChildAppModel) it.next()) == null) {
                                                multiModalGroupTicketAppModelB = null;
                                                break;
                                            }
                                        }
                                    } else {
                                        ArrayList arrayListD2 = CollectionsKt.D(list);
                                        this.b.getClass();
                                        multiModalGroupTicketAppModelB = MultiModalGroupTicketEntityToAppModelConverter.b(this.c, arrayListD2);
                                        break;
                                    }
                                    anonymousClass1.label = 1;
                                    if (this.f5898a.emit(multiModalGroupTicketAppModelB, anonymousClass1) == coroutineSingletons) {
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
                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = multiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1.collect(new AnonymousClass2(flowCollector, multiModalGroupTicketEntityToAppModelConverter, multiModalGroupTicketEntity), continuation);
                            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                        }
                    }, new MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3(3, null));
                }
            }
        }
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(null);
    }

    public static MultiModalGroupTicketAppModel b(MultiModalGroupTicketEntity multiModalGroupTicketEntity, List list) {
        String str = multiModalGroupTicketEntity.f5792a;
        String str2 = multiModalGroupTicketEntity.b;
        String str3 = multiModalGroupTicketEntity.c;
        String str4 = multiModalGroupTicketEntity.d;
        long j = multiModalGroupTicketEntity.e;
        long j2 = multiModalGroupTicketEntity.f;
        MultiModalGroupTicketStatus multiModalGroupTicketStatus = multiModalGroupTicketEntity.g;
        String str5 = multiModalGroupTicketEntity.h;
        String lowerCase = multiModalGroupTicketEntity.i.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String str6 = multiModalGroupTicketEntity.j;
        long j3 = multiModalGroupTicketEntity.k;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails = multiModalGroupTicketEntity.l;
        MultiModalGroupTicketStopDetails multiModalGroupTicketStopDetails2 = multiModalGroupTicketEntity.m;
        List list2 = multiModalGroupTicketEntity.n;
        RefundInfoEntityModel refundInfoEntityModel = multiModalGroupTicketEntity.o;
        RefundInfoAppModel refundInfoAppModelA = refundInfoEntityModel != null ? RefundInfoEntityModelKt.a(refundInfoEntityModel) : null;
        List listV0 = CollectionsKt.v0(new MultiModalGroupTicketEntityToAppModelConverter$toAppModel$$inlined$sortedBy$1(), multiModalGroupTicketEntity.p);
        List list3 = multiModalGroupTicketEntity.q;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            GroupTicketLegFareDetailEntityModel groupTicketLegFareDetailEntityModel = (GroupTicketLegFareDetailEntityModel) it.next();
            int i = groupTicketLegFareDetailEntityModel.f5789a;
            Iterator it2 = it;
            FareBreakupEntityModel fareBreakupEntityModel = groupTicketLegFareDetailEntityModel.b;
            String str7 = str4;
            long j4 = j;
            long j5 = j2;
            FareBreakupAppModel fareBreakupAppModel = new FareBreakupAppModel(fareBreakupEntityModel.f8241a, fareBreakupEntityModel.b, fareBreakupEntityModel.c);
            List<FareBreakupEntityModel> list4 = groupTicketLegFareDetailEntityModel.c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
            for (FareBreakupEntityModel fareBreakupEntityModel2 : list4) {
                arrayList2.add(new FareBreakupAppModel(fareBreakupEntityModel2.f8241a, fareBreakupEntityModel2.b, fareBreakupEntityModel2.c));
                multiModalGroupTicketStatus = multiModalGroupTicketStatus;
                str5 = str5;
            }
            arrayList.add(new GroupTicketLegFareDetailAppModel(i, fareBreakupAppModel, arrayList2));
            it = it2;
            str4 = str7;
            j = j4;
            j2 = j5;
        }
        return new MultiModalGroupTicketAppModel(str, str2, str3, str4, j, j2, multiModalGroupTicketStatus, str5, lowerCase, str6, j3, multiModalGroupTicketStopDetails, multiModalGroupTicketStopDetails2, list2, refundInfoAppModelA, listV0, CollectionsKt.v0(new MultiModalGroupTicketEntityToAppModelConverter$toAppModel$$inlined$sortedBy$2(), arrayList), CollectionsKt.v0(new MultiModalGroupTicketEntityToAppModelConverter$toAppModel$$inlined$sortedBy$3(), list));
    }
}
