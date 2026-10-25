package app.chalo.tito.domain;

import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TitoValidationStatusKt;
import app.chalo.utils.ChaloUseCaseResult;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GetActiveTitoEntryForProductUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetActiveTitoEntryForProductUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDataRepository f9654a;

    public GetActiveTitoEntryForProductUseCase(TITOValidationDataRepository tITOValidationDataRepository) {
        this.f9654a = tITOValidationDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetActiveTitoEntryForProductUseCase$invoke$1 getActiveTitoEntryForProductUseCase$invoke$1;
        if (continuationImpl instanceof GetActiveTitoEntryForProductUseCase$invoke$1) {
            getActiveTitoEntryForProductUseCase$invoke$1 = (GetActiveTitoEntryForProductUseCase$invoke$1) continuationImpl;
            int i = getActiveTitoEntryForProductUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getActiveTitoEntryForProductUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getActiveTitoEntryForProductUseCase$invoke$1 = new GetActiveTitoEntryForProductUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getActiveTitoEntryForProductUseCase$invoke$1 = new GetActiveTitoEntryForProductUseCase$invoke$1(this, continuationImpl);
        }
        Object objG = getActiveTitoEntryForProductUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getActiveTitoEntryForProductUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            getActiveTitoEntryForProductUseCase$invoke$1.label = 1;
            objG = this.f9654a.g(str, getActiveTitoEntryForProductUseCase$invoke$1);
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
        return new Flow<ChaloUseCaseResult<TITOValidationAppModel, Boolean>>() { // from class: app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase$invoke$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase$invoke$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f9656a;

                /* JADX INFO: renamed from: app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase$invoke$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase$invoke$$inlined$map$1$2", f = "GetActiveTitoEntryForProductUseCase.kt", l = {50}, m = "emit", v = 1)
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

                public AnonymousClass2(FlowCollector flowCollector, GetActiveTitoEntryForProductUseCase getActiveTitoEntryForProductUseCase) {
                    this.f9656a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x005d  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object failure;
                    T next;
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
                            Iterator<T> it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (!TitoValidationStatusKt.a(((TITOValidationAppModel) next).d));
                            TITOValidationAppModel tITOValidationAppModel = next;
                            if (tITOValidationAppModel != null) {
                                failure = new ChaloUseCaseResult.Success(tITOValidationAppModel);
                            } else {
                                failure = new ChaloUseCaseResult.Failure(Boolean.FALSE);
                            }
                        } else {
                            failure = new ChaloUseCaseResult.Failure(Boolean.FALSE);
                        }
                        anonymousClass1.label = 1;
                        if (this.f9656a.emit(failure, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }
}
