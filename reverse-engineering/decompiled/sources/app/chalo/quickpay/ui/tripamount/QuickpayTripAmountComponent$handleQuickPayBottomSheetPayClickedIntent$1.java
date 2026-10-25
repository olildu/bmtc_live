package app.chalo.quickpay.ui.tripamount;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1", f = "QuickpayTripAmountComponent.kt", l = {396, 399}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [g01] */
    /* JADX WARN: Type inference failed for: r6v1, types: [g01] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) this.this$0.m.a()).b;
            if (walletTypeIdentifier == null) {
                QuickpayTripAmountComponent quickpayTripAmountComponent = this.this$0;
                KotlinToastManager kotlinToastManager2 = quickpayTripAmountComponent.F;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = quickpayTripAmountComponent.G.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager = kotlinToastManager2;
                }
            } else {
                final QuickpayTripAmountComponent quickpayTripAmountComponent2 = this.this$0;
                QuickPayBottomSheetHelper quickPayBottomSheetHelper = quickpayTripAmountComponent2.A;
                final int i2 = 0;
                ?? r5 = new Function1() { // from class: g01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object value;
                        Object value2;
                        switch (i2) {
                            case 0:
                                String str = (String) obj2;
                                QuickpayTripAmountComponent quickpayTripAmountComponent3 = quickpayTripAmountComponent2;
                                MutableStateFlow mutableStateFlow = quickpayTripAmountComponent3.A.d;
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.c(value, null));
                                quickpayTripAmountComponent3.q0(new fr0(23, quickpayTripAmountComponent3, str));
                                break;
                            default:
                                ((Long) obj2).getClass();
                                QuickpayTripAmountComponent quickpayTripAmountComponent4 = quickpayTripAmountComponent2;
                                quickpayTripAmountComponent4.I = true;
                                MutableStateFlow mutableStateFlow2 = quickpayTripAmountComponent4.A.d;
                                do {
                                    value2 = mutableStateFlow2.getValue();
                                } while (!mutableStateFlow2.c(value2, null));
                                quickpayTripAmountComponent4.q0(new d01(quickpayTripAmountComponent4, 3));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                final int i3 = 1;
                ?? r6 = new Function1() { // from class: g01
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object value;
                        Object value2;
                        switch (i3) {
                            case 0:
                                String str = (String) obj2;
                                QuickpayTripAmountComponent quickpayTripAmountComponent3 = quickpayTripAmountComponent2;
                                MutableStateFlow mutableStateFlow = quickpayTripAmountComponent3.A.d;
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.c(value, null));
                                quickpayTripAmountComponent3.q0(new fr0(23, quickpayTripAmountComponent3, str));
                                break;
                            default:
                                ((Long) obj2).getClass();
                                QuickpayTripAmountComponent quickpayTripAmountComponent4 = quickpayTripAmountComponent2;
                                quickpayTripAmountComponent4.I = true;
                                MutableStateFlow mutableStateFlow2 = quickpayTripAmountComponent4.A.d;
                                do {
                                    value2 = mutableStateFlow2.getValue();
                                } while (!mutableStateFlow2.c(value2, null));
                                quickpayTripAmountComponent4.q0(new d01(quickpayTripAmountComponent4, 3));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 2;
                if (quickPayBottomSheetHelper.b(walletTypeIdentifier, r5, r6, this) != coroutineSingletons) {
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return unit;
    }
}
