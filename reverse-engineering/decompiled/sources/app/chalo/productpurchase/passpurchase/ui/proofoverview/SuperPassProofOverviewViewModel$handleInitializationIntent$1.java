package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedContractKt;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedState;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason;
import app.chalo.superpass.data.models.entities.ProofRejectionReason;
import app.chalo.superpass.data.models.entities.RejectionStatus;
import defpackage.r60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.Json;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$handleInitializationIntent$1", f = "SuperPassProofOverviewViewModel.kt", l = {191, Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend", v = 1)
final class SuperPassProofOverviewViewModel$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassProofOverviewIntent.InitializationIntent $intent;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ SuperPassProofOverviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassProofOverviewViewModel$handleInitializationIntent$1(SuperPassProofOverviewViewModel superPassProofOverviewViewModel, SuperPassProofOverviewIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassProofOverviewViewModel;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassProofOverviewViewModel$handleInitializationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassProofOverviewViewModel$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassProofOverviewDataState superPassProofOverviewDataStateB;
        SuperPassPurchaseSharedState superPassPurchaseSharedState;
        List list;
        ProfileRejectionReason profileRejectionReason;
        Object objJ;
        List list2;
        List<ProofRejectionReason> list3;
        List list4;
        ?? r12;
        ?? r11;
        ?? r10;
        ?? r9;
        ?? r8;
        ?? r2;
        Object value;
        SuperPassProofOverviewDataState superPassProofOverviewDataState;
        Map map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            SuperPassProofOverviewRestoreState superPassProofOverviewRestoreState = this.this$0.w;
            superPassProofOverviewDataStateB = superPassProofOverviewRestoreState != null ? SuperPassProofOverviewContractKt.b(superPassProofOverviewRestoreState) : null;
            superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.this$0.l.getF().getValue();
            Boolean boolA = SuperPassPurchaseSharedContractKt.a(superPassPurchaseSharedState);
            PassApplicationRejectionReasons passApplicationRejectionReasons = superPassPurchaseSharedState.f;
            ?? BooleanValue = boolA != null ? boolA.booleanValue() : 1;
            list = passApplicationRejectionReasons != null ? passApplicationRejectionReasons.c : null;
            this.this$0.getClass();
            ArrayList arrayList = new ArrayList();
            if (passApplicationRejectionReasons != null && (list3 = passApplicationRejectionReasons.f9547a) != null) {
                for (ProofRejectionReason proofRejectionReason : list3) {
                    if (proofRejectionReason.f9554a == RejectionStatus.INVALID) {
                        arrayList.add(proofRejectionReason);
                    }
                }
            }
            this.this$0.getClass();
            if (passApplicationRejectionReasons != null && (list2 = passApplicationRejectionReasons.b) != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        profileRejectionReason = null;
                        break;
                    }
                    ProfileRejectionReason profileRejectionReason2 = (ProfileRejectionReason) it.next();
                    if (Intrinsics.d(profileRejectionReason2.b, "NAME") && profileRejectionReason2.f9552a == RejectionStatus.INVALID) {
                        profileRejectionReason = profileRejectionReason2;
                        break;
                    }
                }
            } else {
                profileRejectionReason = null;
                break;
            }
            PassApplicationActionRequired.Companion companion = PassApplicationActionRequired.INSTANCE;
            String lPassApplicationActionRequiredString = this.$intent.f8475a.getG();
            companion.getClass();
            Intrinsics.i(lPassApplicationActionRequiredString, "lPassApplicationActionRequiredString");
            Json json = ChaloJson.b;
            json.getClass();
            PassApplicationActionRequired passApplicationActionRequired = (PassApplicationActionRequired) json.b(lPassApplicationActionRequiredString, companion.serializer());
            ?? r13 = superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.f8466a : passApplicationActionRequired == PassApplicationActionRequired.REINITIATE ? 1 : 0;
            ?? r14 = superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.b : passApplicationActionRequired == PassApplicationActionRequired.REAPPLY ? 1 : 0;
            ?? r15 = superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.c : passApplicationActionRequired == PassApplicationActionRequired.FRESH ? 1 : 0;
            ?? r16 = superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.k : (arrayList.isEmpty() || r15 == 0) ? 1 : 0;
            ?? r3 = superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.l : (profileRejectionReason == null || r15 != 0) ? 1 : 0;
            ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.n;
            this.L$0 = superPassProofOverviewDataStateB;
            this.L$1 = superPassPurchaseSharedState;
            this.L$2 = list;
            this.L$3 = arrayList;
            this.L$4 = profileRejectionReason;
            this.I$0 = BooleanValue;
            this.I$1 = r13;
            this.I$2 = r14;
            this.I$3 = r15;
            this.I$4 = r16;
            this.I$5 = r3;
            this.label = 1;
            objJ = chaloAppFeatureHelper.j(this);
            r2 = r3;
            r8 = r16;
            r9 = r15;
            r10 = r14;
            r11 = r13;
            r12 = BooleanValue;
            list4 = arrayList;
            if (objJ != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        int i2 = this.I$5;
        int i3 = this.I$4;
        int i4 = this.I$3;
        int i5 = this.I$2;
        int i6 = this.I$1;
        int i7 = this.I$0;
        profileRejectionReason = (ProfileRejectionReason) this.L$4;
        List list5 = (List) this.L$3;
        list = (List) this.L$2;
        superPassPurchaseSharedState = (SuperPassPurchaseSharedState) this.L$1;
        superPassProofOverviewDataStateB = (SuperPassProofOverviewDataState) this.L$0;
        ResultKt.b(obj);
        objJ = obj;
        r2 = i2;
        r8 = i3;
        r9 = i4;
        r10 = i5;
        r11 = i6;
        r12 = i7;
        list4 = list5;
        ProfileRejectionReason profileRejectionReason3 = profileRejectionReason;
        List list6 = list4;
        List list7 = list;
        boolean zBooleanValue = ((Boolean) objJ).booleanValue();
        SuperPassProofOverviewViewModel superPassProofOverviewViewModel = this.this$0;
        boolean z = r11 != 0;
        boolean z2 = r10 != 0;
        boolean z3 = r9 != 0;
        boolean z4 = r12 != 0;
        boolean z5 = r8 != 0;
        boolean z6 = r2 != 0;
        MutableStateFlow mutableStateFlow = superPassProofOverviewViewModel.e;
        do {
            value = mutableStateFlow.getValue();
            superPassProofOverviewDataState = (SuperPassProofOverviewDataState) value;
            if (superPassProofOverviewDataStateB == null || (map = superPassProofOverviewDataStateB.i) == null) {
                map = superPassPurchaseSharedState.p;
            }
        } while (!mutableStateFlow.c(value, SuperPassProofOverviewDataState.a(superPassProofOverviewDataState, z, z2, z3, null, z4, list7, list6, profileRejectionReason3, map, false, z5, z6, zBooleanValue, false, superPassProofOverviewDataStateB != null ? superPassProofOverviewDataStateB.o : null, 8712)));
        SuperPassProofOverviewViewModel superPassProofOverviewViewModel2 = this.this$0;
        AnalyticsContractImplKt.b(superPassProofOverviewViewModel2.t, "proofs overview screen open", ((SuperPassPurchaseSharedState) superPassProofOverviewViewModel2.l.getF().getValue()).f8359a, null, false, 28);
        final SuperPassProofOverviewViewModel superPassProofOverviewViewModel3 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        final StateFlow f = superPassProofOverviewViewModel3.l.getF();
        Object objCollect = new Flow<Map<String, ? extends ProofUploadDetails>>() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$collectSuperPassProofUploadManager$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$collectSuperPassProofUploadManager$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f8487a;

                /* JADX INFO: renamed from: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$collectSuperPassProofUploadManager$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$collectSuperPassProofUploadManager$$inlined$map$1$2", f = "SuperPassProofOverviewViewModel.kt", l = {50}, m = "emit", v = 1)
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
                    this.f8487a = flowCollector;
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
                        Map map = ((SuperPassPurchaseSharedState) obj).p;
                        anonymousClass1.label = 1;
                        if (this.f8487a.emit(map, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect2 = f.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : Unit.f17538a;
            }
        }.collect(new FlowCollector() { // from class: app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$collectSuperPassProofUploadManager$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                superPassProofOverviewViewModel3.p(new r60(3, (Map) obj2));
                return Unit.f17538a;
            }
        }, this);
        if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
