package app.chalo.ncmc.ui.entercarddetails;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.ncmc.domain.LinkChaloCardUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.p10;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsComponent$linkEligibleCard$1", f = "EnterCardDetailsComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_HD, 147, 153}, m = "invokeSuspend", v = 1)
final class EnterCardDetailsComponent$linkEligibleCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ EnterCardDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardDetailsComponent$linkEligibleCard$1(EnterCardDetailsComponent enterCardDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = enterCardDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EnterCardDetailsComponent$linkEligibleCard$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EnterCardDetailsComponent$linkEligibleCard$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            String str = ((EnterCardDetailsViewState) this.this$0.f.getValue()).k;
            this.this$0.E0(new p10(1));
            LinkChaloCardUseCase linkChaloCardUseCase = this.this$0.q;
            this.label = 1;
            obj = linkChaloCardUseCase.a(str, null, this, true);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        this.this$0.E0(new p10(2));
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            EnterCardDetailsComponent enterCardDetailsComponent = this.this$0;
            KotlinToastManager kotlinToastManager3 = enterCardDetailsComponent.t;
            this.L$0 = kotlinToastManager3;
            this.label = 2;
            obj = enterCardDetailsComponent.n.b(StringEnum.AUTO_CARD_LINK_SUCCESS, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager3;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return Unit.f17538a;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            EnterCardDetailsComponent enterCardDetailsComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager4 = enterCardDetailsComponent2.t;
            this.L$0 = kotlinToastManager4;
            this.label = 3;
            obj = enterCardDetailsComponent2.n.b(StringEnum.AUTO_CARD_LINK_ERROR, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}
