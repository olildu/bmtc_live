package app.chalo.home.ui.chalobus;

import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import defpackage.bh;
import java.io.Serializable;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$observeLoginStateChanges$1", f = "ChaloBusComponent.kt", l = {255}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$observeLoginStateChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.chalobus.ChaloBusComponent$observeLoginStateChanges$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ChaloBusComponent f3243a;

        public AnonymousClass1(ChaloBusComponent chaloBusComponent) {
            this.f3243a = chaloBusComponent;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        public final Object a(boolean z, Continuation continuation) {
            ChaloBusComponent$observeLoginStateChanges$1$1$emit$1 chaloBusComponent$observeLoginStateChanges$1$1$emit$1;
            boolean z2;
            if (continuation instanceof ChaloBusComponent$observeLoginStateChanges$1$1$emit$1) {
                chaloBusComponent$observeLoginStateChanges$1$1$emit$1 = (ChaloBusComponent$observeLoginStateChanges$1$1$emit$1) continuation;
                int i = chaloBusComponent$observeLoginStateChanges$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    chaloBusComponent$observeLoginStateChanges$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    chaloBusComponent$observeLoginStateChanges$1$1$emit$1 = new ChaloBusComponent$observeLoginStateChanges$1$1$emit$1(this, continuation);
                }
            } else {
                chaloBusComponent$observeLoginStateChanges$1$1$emit$1 = new ChaloBusComponent$observeLoginStateChanges$1$1$emit$1(this, continuation);
            }
            ChaloBusComponent$observeLoginStateChanges$1$1$emit$1 chaloBusComponent$observeLoginStateChanges$1$1$emit$2 = chaloBusComponent$observeLoginStateChanges$1$1$emit$1;
            Object obj = chaloBusComponent$observeLoginStateChanges$1$1$emit$2.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = chaloBusComponent$observeLoginStateChanges$1$1$emit$2.label;
            Object obj2 = obj;
            ChaloBusComponent chaloBusComponent = this.f3243a;
            if (i2 == 0) {
                ResultKt.b(obj2);
                ProductPurchaseNudgeInfo productPurchaseNudgeInfoA = null;
                if (!z) {
                    ProductPurchaseNudgeInfo productPurchaseNudgeInfoV0 = chaloBusComponent.V0();
                    if (productPurchaseNudgeInfoV0.b == ProductPurchaseNudgeUiStatus.PRODUCT_PURCHASE_NUDGE) {
                        productPurchaseNudgeInfoA = ProductPurchaseNudgeInfo.a(productPurchaseNudgeInfoV0, null, ProductPurchaseNudgeUiStatus.DEFAULT_NUDGE, null, ProductPurchaseNudgeInfoCtaType.EXPLORE_CHALO_BUS_PASSES, 5);
                    }
                }
                PBOriginDestinationAppModel pBOriginDestinationAppModel = ((ChaloBusViewState) chaloBusComponent.f.getValue()).s;
                chaloBusComponent$observeLoginStateChanges$1$1$emit$2.Z$0 = z;
                chaloBusComponent$observeLoginStateChanges$1$1$emit$2.label = 1;
                Serializable serializableS0 = ChaloBusComponent.S0(chaloBusComponent, productPurchaseNudgeInfoA, null, z, pBOriginDestinationAppModel, null, chaloBusComponent$observeLoginStateChanges$1$1$emit$2, 18);
                if (serializableS0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = serializableS0;
                z2 = z;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = chaloBusComponent$observeLoginStateChanges$1$1$emit$2.Z$0;
                ResultKt.b(obj2);
            }
            chaloBusComponent.E0(new bh(z2, (List) obj2));
            if (z2) {
                chaloBusComponent.U0(((ChaloBusViewState) chaloBusComponent.t0().a()).s);
            }
            return Unit.f17538a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$observeLoginStateChanges$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$observeLoginStateChanges$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$observeLoginStateChanges$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowG = this.this$0.o.g();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlowG.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
