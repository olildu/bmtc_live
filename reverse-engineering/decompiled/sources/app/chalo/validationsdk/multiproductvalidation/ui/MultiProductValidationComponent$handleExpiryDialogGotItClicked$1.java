package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.constants.Source;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import defpackage.dk0;
import defpackage.lj0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handleExpiryDialogGotItClicked$1", f = "MultiProductValidationComponent.kt", l = {262}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handleExpiryDialogGotItClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handleExpiryDialogGotItClicked$1(MultiProductValidationComponent multiProductValidationComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handleExpiryDialogGotItClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handleExpiryDialogGotItClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MultiProductValidationComponent$handleExpiryDialogGotItClicked$1 multiProductValidationComponent$handleExpiryDialogGotItClicked$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MultiProductValidationData multiProductValidationData = ((MultiProductValidationDataState) this.this$0.f.getValue()).f10691a;
            if (multiProductValidationData != null) {
                ProductValidationAnalyticManager productValidationAnalyticManagerG0 = MultiProductValidationComponent.G0(this.this$0);
                String sourceName = Source.MULTI_PRODUCT_VALIDATION_SCREEN.getSourceName();
                this.label = 1;
                multiProductValidationComponent$handleExpiryDialogGotItClicked$1 = this;
                if (ProductValidationAnalyticManager.DefaultImpls.a(productValidationAnalyticManagerG0, "activation duration expired dialog ok clicked", multiProductValidationData, sourceName, null, multiProductValidationComponent$handleExpiryDialogGotItClicked$1, 24) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            MultiProductValidationComponent multiProductValidationComponent = multiProductValidationComponent$handleExpiryDialogGotItClicked$1.this$0;
            multiProductValidationComponent.q0(new dk0(multiProductValidationComponent, 5));
            multiProductValidationComponent$handleExpiryDialogGotItClicked$1.this$0.E0(new lj0(11));
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        multiProductValidationComponent$handleExpiryDialogGotItClicked$1 = this;
        MultiProductValidationComponent multiProductValidationComponent2 = multiProductValidationComponent$handleExpiryDialogGotItClicked$1.this$0;
        multiProductValidationComponent2.q0(new dk0(multiProductValidationComponent2, 5));
        multiProductValidationComponent$handleExpiryDialogGotItClicked$1.this$0.E0(new lj0(11));
        return Unit.f17538a;
    }
}
