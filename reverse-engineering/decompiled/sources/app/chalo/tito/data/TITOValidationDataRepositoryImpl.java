package app.chalo.tito.data;

import app.chalo.tito.data.local.TITOValidationDataSource;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import app.chalo.tito.data.model.entity.TITOValidationEntityKt;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TapOutDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/data/TITOValidationDataRepositoryImpl;", "Lapp/chalo/tito/data/TITOValidationDataRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationDataRepositoryImpl implements TITOValidationDataRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDataSource f9629a;

    public TITOValidationDataRepositoryImpl(TITOValidationDataSource tITOValidationDataSource) {
        this.f9629a = tITOValidationDataSource;
    }

    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object a(String str, TitoValidationStatus titoValidationStatus, ContinuationImpl continuationImpl) {
        Object objA = this.f9629a.a(str, titoValidationStatus, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object b(String str, Continuation continuation) {
        Object objB = this.f9629a.b(str, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object c(String str, ContinuationImpl continuationImpl) {
        TITOValidationDataRepositoryImpl$getTitoEntryForTapId$1 tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1;
        if (continuationImpl instanceof TITOValidationDataRepositoryImpl$getTitoEntryForTapId$1) {
            tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1 = (TITOValidationDataRepositoryImpl$getTitoEntryForTapId$1) continuationImpl;
            int i = tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1 = new TITOValidationDataRepositoryImpl$getTitoEntryForTapId$1(this, continuationImpl);
            }
        } else {
            tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1 = new TITOValidationDataRepositoryImpl$getTitoEntryForTapId$1(this, continuationImpl);
        }
        Object objC = tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1.label = 1;
            objC = this.f9629a.c(str, tITOValidationDataRepositoryImpl$getTitoEntryForTapId$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        final Flow flow = (Flow) objC;
        return new Flow<TITOValidationAppModel>() { // from class: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getTitoEntryForTapId$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getTitoEntryForTapId$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9635a;

                /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getTitoEntryForTapId$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.tito.data.TITOValidationDataRepositoryImpl$getTitoEntryForTapId$$inlined$map$1$2", f = "TITOValidationDataRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9635a = flowCollector;
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
                        TITOValidationEntity tITOValidationEntity = (TITOValidationEntity) obj;
                        TITOValidationAppModel tITOValidationAppModelA = tITOValidationEntity != null ? TITOValidationDataRepositoryImplKt.a(tITOValidationEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f9635a.emit(tITOValidationAppModelA, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object e(String str, Continuation continuation) {
        return this.f9629a.e(str, continuation);
    }

    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object f(TITOValidationAppModel tITOValidationAppModel, ContinuationImpl continuationImpl) {
        TITOValidationEntity tITOValidationEntity;
        Object objD;
        TITOProductSubType tITOProductSubTypeA;
        try {
            TapInDetailAppModel tapInDetailAppModel = tITOValidationAppModel.f9672a;
            TITOProductDetailAppModel tITOProductDetailAppModel = tITOValidationAppModel.c;
            String str = tapInDetailAppModel.f9673a;
            long j = tapInDetailAppModel.b;
            String str2 = tapInDetailAppModel.f;
            String str3 = tapInDetailAppModel.g;
            String str4 = tapInDetailAppModel.h;
            long j2 = tapInDetailAppModel.i;
            long j3 = tapInDetailAppModel.e;
            long j4 = tapInDetailAppModel.c;
            String str5 = tapInDetailAppModel.d;
            String str6 = tapInDetailAppModel.k;
            String str7 = tapInDetailAppModel.j;
            TitoValidationStatus titoValidationStatus = tITOValidationAppModel.d;
            TITOProductType tITOProductTypeB = TITOValidationEntityKt.b(tITOProductDetailAppModel.b);
            if (tITOProductTypeB == null || (tITOProductSubTypeA = TITOValidationEntityKt.a(tITOProductDetailAppModel.b)) == null) {
                tITOValidationEntity = null;
            } else {
                String str8 = tITOProductDetailAppModel.f9668a;
                long j5 = tITOProductDetailAppModel.c;
                TapOutDetailAppModel tapOutDetailAppModel = tITOValidationAppModel.b;
                tITOValidationEntity = new TITOValidationEntity(str, j, j4, j3, str5, str2, str3, str4, j2, str7, str6, titoValidationStatus, tITOValidationAppModel.e, str8, tITOProductTypeB, tITOProductSubTypeA, j5, tapOutDetailAppModel != null ? tapOutDetailAppModel.f9675a : null, tapOutDetailAppModel != null ? tapOutDetailAppModel.b : null, tapOutDetailAppModel != null ? tapOutDetailAppModel.c : null, tapOutDetailAppModel != null ? tapOutDetailAppModel.d : null, tapOutDetailAppModel != null ? tapOutDetailAppModel.e : null, tapOutDetailAppModel != null ? tapOutDetailAppModel.f : null);
            }
        } catch (Exception unused) {
        }
        return (tITOValidationEntity == null || (objD = this.f9629a.d(tITOValidationEntity, continuationImpl)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.f17538a : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object g(String str, ContinuationImpl continuationImpl) {
        TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1 tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1;
        if (continuationImpl instanceof TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1) {
            tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1 = (TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1) continuationImpl;
            int i = tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1 = new TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1(this, continuationImpl);
            }
        } else {
            tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1 = new TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1(this, continuationImpl);
        }
        Object objF = tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1.label = 1;
            objF = this.f9629a.f(str, tITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        final Flow flow = (Flow) objF;
        return new Flow<List<? extends TITOValidationAppModel>>() { // from class: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9633a;

                /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntriesForBookingIdAsFlow$$inlined$map$1$2", f = "TITOValidationDataRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9633a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
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
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                TITOValidationAppModel tITOValidationAppModelA = TITOValidationDataRepositoryImplKt.a((TITOValidationEntity) it.next());
                                if (tITOValidationAppModelA != null) {
                                    arrayList.add(tITOValidationAppModelA);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        anonymousClass1.label = 1;
                        if (this.f9633a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.tito.data.TITOValidationDataRepository
    public final Object h(String str, ContinuationImpl continuationImpl) {
        TITOValidationDataRepositoryImpl$getAllTitoEntries$1 tITOValidationDataRepositoryImpl$getAllTitoEntries$1;
        if (continuationImpl instanceof TITOValidationDataRepositoryImpl$getAllTitoEntries$1) {
            tITOValidationDataRepositoryImpl$getAllTitoEntries$1 = (TITOValidationDataRepositoryImpl$getAllTitoEntries$1) continuationImpl;
            int i = tITOValidationDataRepositoryImpl$getAllTitoEntries$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOValidationDataRepositoryImpl$getAllTitoEntries$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOValidationDataRepositoryImpl$getAllTitoEntries$1 = new TITOValidationDataRepositoryImpl$getAllTitoEntries$1(this, continuationImpl);
            }
        } else {
            tITOValidationDataRepositoryImpl$getAllTitoEntries$1 = new TITOValidationDataRepositoryImpl$getAllTitoEntries$1(this, continuationImpl);
        }
        Object objG = tITOValidationDataRepositoryImpl$getAllTitoEntries$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOValidationDataRepositoryImpl$getAllTitoEntries$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            tITOValidationDataRepositoryImpl$getAllTitoEntries$1.label = 1;
            objG = this.f9629a.g(str, tITOValidationDataRepositoryImpl$getAllTitoEntries$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        final Flow flow = (Flow) objG;
        return new Flow<List<? extends TITOValidationAppModel>>() { // from class: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntries$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntries$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9631a;

                /* JADX INFO: renamed from: app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntries$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.tito.data.TITOValidationDataRepositoryImpl$getAllTitoEntries$$inlined$map$1$2", f = "TITOValidationDataRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f9631a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    ArrayList arrayList;
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
                        if (list != null) {
                            arrayList = new ArrayList();
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                TITOValidationAppModel tITOValidationAppModelA = TITOValidationDataRepositoryImplKt.a((TITOValidationEntity) it.next());
                                if (tITOValidationAppModelA != null) {
                                    arrayList.add(tITOValidationAppModelA);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        anonymousClass1.label = 1;
                        if (this.f9631a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
